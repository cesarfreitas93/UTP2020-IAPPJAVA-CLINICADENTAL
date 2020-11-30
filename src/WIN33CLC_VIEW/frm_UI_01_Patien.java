
package WIN33CLC_VIEW;

import WIN30CLC_DAO.DaoException;
import WIN31CLC_DTO.Patient;
import WIN31CLC_DTO.Ubigeo;
import WIN32CLC_CTR.CTR_02_Patient;
import WIN32CLC_CTR.CTR_10_Ubigeo;
import static WIN_2020_UTILS.Validators.esEmail;
import static WIN_2020_UTILS.Validators.inputStringIngresado;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import org.json.JSONException;
import rojerusan.RSNotifyFade;


public class frm_UI_01_Patien extends javax.swing.JPanel {
ArrayList<Ubigeo> ubigeo_lista_dep = null;
    ArrayList<Ubigeo> ubigeo_lista_dep_pro = null;
    ArrayList<Ubigeo> ubigeo_lista_dep_pro_dis = null;
    Ubigeo entity_ubigeo = null;
    CTR_10_Ubigeo ubigeo_bds = null;
    
    private CTR_02_Patient cTR_02_Patient;
    
    
    
    public frm_UI_01_Patien() {
        initComponents();
      initComponents();
        LoadData();
                
        txt_dni.setEnabled(false);
        btn_buscar_reniec.setEnabled(false);
        txt_name.setEnabled(false);
        txt_apellidoPAT.setEnabled(false);
        txt_apellidoMAT.setEnabled(false);
        txt_phone.setEnabled(false);
        txt_email.setEnabled(false);
        txt_direccion.setEnabled(false);
        
        btn_cancelar_cambios.setEnabled(false);
        btn_modificar_paciente.setEnabled(false);
        btn_guardar_paciente.setEnabled(false);
        listar_Departamento();
        cTR_02_Patient = new CTR_02_Patient();
        
        
        
        setBackground(new Color (255,255,255,0));
        btn_nuevo_paciente.setBackground(new Color (41,177,255,0));
        btn_modificar_paciente.setBackground(new Color (41,177,255,0));
        btn_guardar_paciente.setBackground(new Color (41,177,255,0));
        btn_cancelar_cambios.setBackground(new Color (41,177,255,0));
       
    }
    
    
    
    
    public void ocultar_form_patient(boolean b)
    {
    menu_salir1.setVisible(b);
    menu_salir2.setVisible(b);
            menu_salir3.setVisible(b);
            rSPanelBorderGradient1.setVisible(b);
            
    }
    
     public void listar_Departamento() {
        //-----Cargando Departamento---------------------------------------------------
        try {
            ubigeo_bds = new CTR_10_Ubigeo();
            ubigeo_lista_dep = new ArrayList<Ubigeo>();
            cbx_departamento.removeAllItems();
            //--------------------------------------------------------
            entity_ubigeo = new Ubigeo();
            entity_ubigeo.setCodigo_departamento("00");
            entity_ubigeo.setDescripcion_departamento("--Seleccionar--");
            ubigeo_lista_dep.add(entity_ubigeo);
            //--------------------------------------------------------
            List fakultases = ubigeo_bds.get_departamentos();

            //  ArrayList<Ubigeo> countries = (ArrayList<Ubigeo>) ubigeo_bds.get_departamentos();
            ubigeo_lista_dep.addAll(fakultases);

            //--------------------------------------------------------
            if (ubigeo_lista_dep != null) {
                for (int i = 0; i < ubigeo_lista_dep.size(); i++) {
                    entity_ubigeo = ubigeo_lista_dep.get(i);
                    cbx_departamento.addItem(entity_ubigeo.getDescripcion_departamento());
                }
            }
//            cbx_departamento.setSelectedIndex(0);
        } catch (DaoException ex) {
            //Logger.getLogger(frm_02_Patient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
           // Logger.getLogger(frm_02_Patient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void listar_Provincia() {
        //-----Cargando Provincia---------------------------------------------------
        try {
            ubigeo_bds = new CTR_10_Ubigeo();
            ubigeo_lista_dep_pro = new ArrayList<Ubigeo>();
            entity_ubigeo = new Ubigeo();
            //--------------------------------------------------------
            if (cbx_departamento.getSelectedIndex() > 0) {
                cbx_provincia.removeAllItems();
                entity_ubigeo.setCodigo_provincia("00");
                entity_ubigeo.setDescripcion_provincia("--Seleccionar--");
                ubigeo_lista_dep_pro.add(entity_ubigeo);
                //--------------------------------------------------------
                Ubigeo parametro = ubigeo_lista_dep.get(cbx_departamento.getSelectedIndex());
                ArrayList<Ubigeo> countries = (ArrayList<Ubigeo>) ubigeo_bds.get_departa_provi(parametro.getCodigo_departamento());
                ubigeo_lista_dep_pro.addAll(countries);
                //--------------------------------------------------------
                if (cbx_departamento != null) {
                    for (int i = 0; i < ubigeo_lista_dep_pro.size(); i++) {
                        cbx_provincia.addItem(ubigeo_lista_dep_pro.get(i).getDescripcion_provincia());
                    }
                }
            } else {
                cbx_provincia.removeAllItems();
                
                entity_ubigeo.setCodigo_provincia("00");
                entity_ubigeo.setDescripcion_provincia("--Seleccionar--");
                ubigeo_lista_dep_pro.add(entity_ubigeo);
                cbx_provincia.addItem(entity_ubigeo.getDescripcion_provincia());
                
            }
        } catch (DaoException ex) {
          //  Logger.getLogger(frm_02_Patient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
           // Logger.getLogger(frm_02_Patient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void listar_distrito() {
        //-----Cargando Distrito---------------------------------------------------
        try {
            ubigeo_bds = new CTR_10_Ubigeo();
            ubigeo_lista_dep_pro_dis = new ArrayList<Ubigeo>();
            entity_ubigeo = new Ubigeo();
            //--------------------------------------------------------
            if (cbx_provincia.getSelectedIndex() > 0) {
                cbx_distrito.removeAllItems();
                entity_ubigeo.setCodigo_distrito("00");
                entity_ubigeo.setDescripcion_distrito("--Seleccionar--");
                ubigeo_lista_dep_pro_dis.add(entity_ubigeo);
                //----------------------ubigeo_lista_dep_pro_dis_dis----------------------------------
                Ubigeo parametro = ubigeo_lista_dep.get(cbx_departamento.getSelectedIndex());
                Ubigeo parametro1 = ubigeo_lista_dep_pro.get(cbx_provincia.getSelectedIndex());
                
                ArrayList<Ubigeo> countries = (ArrayList<Ubigeo>) ubigeo_bds.get_provi_dist(parametro.getCodigo_departamento(), parametro1.getCodigo_provincia());
                ubigeo_lista_dep_pro_dis.addAll(countries);
                //--------------------------------------------------------
                if (cbx_provincia != null) {
                    for (int i = 0; i < ubigeo_lista_dep_pro_dis.size(); i++) {
                        cbx_distrito.addItem(ubigeo_lista_dep_pro_dis.get(i).getDescripcion_distrito());
                    }
                }
            } else {
                cbx_distrito.removeAllItems();
                entity_ubigeo.setCodigo_distrito("00");
                entity_ubigeo.setDescripcion_distrito("--Seleccionar--");
                ubigeo_lista_dep_pro_dis.add(entity_ubigeo);
                cbx_distrito.addItem(entity_ubigeo.getDescripcion_distrito());
            }
        } catch (DaoException ex) {
           // Logger.getLogger(frm_02_Patient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
          //  Logger.getLogger(frm_02_Patient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void LoadData() {
        try {
            CTR_02_Patient ctr = new CTR_02_Patient();
            this.tablePatients.setModel(ctr.ListPatients());
            this.tablePatients.getSelectionModel().addListSelectionListener(e -> {
                boolean seleccionValid = (tablePatients.getSelectedRow() != -1);
                //btnEdit.setEnabled(seleccionValid);
                //btnDelete.setEnabled(seleccionValid);
            });
        } catch (DaoException ex) {
           // Logger.getLogger(frm_02_Patient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
         //   Logger.getLogger(frm_02_Patient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.tablePatients.setDefaultRenderer(JButton.class, new TableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object objeto, boolean estaSeleccionado, boolean tieneElFoco, int fila, int columna) {
                return (Component) objeto;
            }
        });
        
        this.tablePatients.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = tablePatients.rowAtPoint(e.getPoint());
                int columna = tablePatients.columnAtPoint(e.getPoint());
                
                System.out.println("click");
                setEditable(true);
                
                if (tablePatients.getModel().getColumnClass(columna).equals(JButton.class)) {
                    try {
                        System.out.println(tablePatients.getModel().getValueAt(fila, 0));
                        cTR_02_Patient.DeletePatien((long) tablePatients.getModel().getValueAt(fila, 0));
                        System.out.println("eliminado por el botton");
                        tablePatients.setModel(cTR_02_Patient.ListPatients());
                        setEditable(false);
                    } catch (SQLException ex) {
                       // Logger.getLogger(frm_02_Patient.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (DaoException ex) {
                        //Logger.getLogger(frm_02_Patient.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                if (!tablePatients.getModel().getColumnClass(0).equals(JButton.class)) {
                    //System.out.println(tablePatients.getModel().getValueAt(fila, 0)); 
                    setId((long) tablePatients.getModel().getValueAt(fila, 0));
                    
                }
                
            }
            
        });
    }
    
    private Patient getPatientSelected() throws SQLException, DaoException {
        CTR_02_Patient ctr = new CTR_02_Patient();
        int id = (int) tablePatients.getValueAt(tablePatients.getSelectedRow(), 0);
        return ctr.SelectPatient(id);
    }
    
    public void mensaje() throws DaoException, SQLException {
        tablePatients.setModel(cTR_02_Patient.ListPatients());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu_salir1 = new RSMaterialComponent.RSPanelMaterial();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_name = new rojerusan.RSMetroTextPlaceHolder();
        txt_apellidoPAT = new rojerusan.RSMetroTextPlaceHolder();
        txt_apellidoMAT = new rojerusan.RSMetroTextPlaceHolder();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_phone = new rojerusan.RSMetroTextFullPlaceHolder();
        txt_direccion = new rojerusan.RSMetroTextFullPlaceHolder();
        txt_email = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel14 = new javax.swing.JLabel();
        txt_dni = new rojerusan.RSMetroTextPlaceHolder();
        btn_buscar_reniec = new RSMaterialComponent.RSButtonMaterialGradientOne();
        menu_salir2 = new RSMaterialComponent.RSPanelMaterial();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cbx_provincia = new RSMaterialComponent.RSComboBoxMaterial();
        cbx_departamento = new RSMaterialComponent.RSComboBoxMaterial();
        cbx_distrito = new RSMaterialComponent.RSComboBoxMaterial();
        menu_salir3 = new RSMaterialComponent.RSPanelMaterial();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePatients = new rojerusan.RSTableMetro();
        rSPanelBorderGradient1 = new RSMaterialComponent.RSPanelBorderGradient();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_nuevo_paciente = new newscomponents.RSButtonFlat_new();
        btn_guardar_paciente = new newscomponents.RSButtonFlat_new();
        btn_modificar_paciente = new newscomponents.RSButtonFlat_new();
        btn_cancelar_cambios = new newscomponents.RSButtonFlat_new();

        menu_salir1.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir1.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir1.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir1.setRound(40);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("NOMBRES");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("APELLIDO PATERNO");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("APELLIDO PATERNO");

        txt_name.setForeground(new java.awt.Color(51, 51, 51));
        txt_name.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_name.setBotonColor(new java.awt.Color(3, 111, 198));
        txt_name.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        txt_apellidoPAT.setForeground(new java.awt.Color(51, 51, 51));
        txt_apellidoPAT.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_apellidoPAT.setBotonColor(new java.awt.Color(3, 111, 198));
        txt_apellidoPAT.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txt_apellidoPAT.setOpaque(false);

        txt_apellidoMAT.setForeground(new java.awt.Color(51, 51, 51));
        txt_apellidoMAT.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_apellidoMAT.setBotonColor(new java.awt.Color(3, 111, 198));
        txt_apellidoMAT.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txt_apellidoMAT.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("TELÉFONO");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("DIRECCIÓN");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("CORREO ELECTRÓNICO");

        txt_phone.setForeground(new java.awt.Color(51, 51, 51));
        txt_phone.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_phone.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txt_phone.setPhColor(new java.awt.Color(0, 0, 0));
        txt_phone.setPlaceholder("");

        txt_direccion.setForeground(new java.awt.Color(51, 51, 51));
        txt_direccion.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_direccion.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txt_direccion.setPhColor(new java.awt.Color(0, 0, 0));
        txt_direccion.setPlaceholder("");

        txt_email.setForeground(new java.awt.Color(51, 51, 51));
        txt_email.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_email.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txt_email.setPhColor(new java.awt.Color(0, 0, 0));
        txt_email.setPlaceholder("");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("DNI:");

        txt_dni.setForeground(new java.awt.Color(51, 51, 51));
        txt_dni.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_dni.setBotonColor(new java.awt.Color(3, 111, 198));
        txt_dni.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        btn_buscar_reniec.setForeground(new java.awt.Color(51, 51, 51));
        btn_buscar_reniec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-encuentra-hombre-usuario-24.png"))); // NOI18N
        btn_buscar_reniec.setText("Buscar en Reniec");
        btn_buscar_reniec.setBorderPainted(false);
        btn_buscar_reniec.setColorPrimario(new java.awt.Color(41, 177, 255));
        btn_buscar_reniec.setColorPrimarioHover(new java.awt.Color(41, 177, 255));
        btn_buscar_reniec.setColorSecundario(new java.awt.Color(41, 177, 255));
        btn_buscar_reniec.setColorSecundarioHover(new java.awt.Color(41, 177, 255));
        btn_buscar_reniec.setFocusPainted(false);
        btn_buscar_reniec.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        btn_buscar_reniec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_reniecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu_salir1Layout = new javax.swing.GroupLayout(menu_salir1);
        menu_salir1.setLayout(menu_salir1Layout);
        menu_salir1Layout.setHorizontalGroup(
            menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu_salir1Layout.createSequentialGroup()
                        .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menu_salir1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                            .addGroup(menu_salir1Layout.createSequentialGroup()
                                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(43, 43, 43)
                                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))))
                        .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menu_salir1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                            .addGroup(menu_salir1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(txt_apellidoMAT, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                            .addGroup(menu_salir1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                            .addGroup(menu_salir1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(txt_email, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))
                        .addContainerGap(60, Short.MAX_VALUE))
                    .addGroup(menu_salir1Layout.createSequentialGroup()
                        .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(menu_salir1Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addComponent(txt_name, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                        .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menu_salir1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(txt_apellidoPAT, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                .addContainerGap(277, Short.MAX_VALUE))
                            .addGroup(menu_salir1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btn_buscar_reniec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        menu_salir1Layout.setVerticalGroup(
            menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar_reniec, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apellidoPAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apellidoMAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        menu_salir2.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir2.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir2.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir2.setRound(40);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("DEPARTAMENTO");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("PROVINCIA");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("DISTRITO");

        cbx_provincia.setForeground(new java.awt.Color(51, 51, 51));
        cbx_provincia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija una Opcion.", "RSItem 2", "RSItem 3", "RSItem 4" }));
        cbx_provincia.setColorMaterial(new java.awt.Color(10, 117, 167));
        cbx_provincia.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        cbx_provincia.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        cbx_provincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_provinciaActionPerformed(evt);
            }
        });

        cbx_departamento.setForeground(new java.awt.Color(51, 51, 51));
        cbx_departamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija una Opcion.", "RSItem 2", "RSItem 3", "RSItem 4" }));
        cbx_departamento.setColorMaterial(new java.awt.Color(10, 117, 167));
        cbx_departamento.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        cbx_departamento.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        cbx_departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_departamentoActionPerformed(evt);
            }
        });

        cbx_distrito.setForeground(new java.awt.Color(51, 51, 51));
        cbx_distrito.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija una Opcion.", "RSItem 2", "RSItem 3", "RSItem 4" }));
        cbx_distrito.setColorMaterial(new java.awt.Color(10, 117, 167));
        cbx_distrito.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        cbx_distrito.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        cbx_distrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_distritoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu_salir2Layout = new javax.swing.GroupLayout(menu_salir2);
        menu_salir2.setLayout(menu_salir2Layout);
        menu_salir2Layout.setHorizontalGroup(
            menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu_salir2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                        .addGap(49, 49, 49))
                    .addGroup(menu_salir2Layout.createSequentialGroup()
                        .addComponent(cbx_departamento, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                        .addGap(67, 67, 67)))
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu_salir2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                        .addGap(43, 43, 43))
                    .addGroup(menu_salir2Layout.createSequentialGroup()
                        .addComponent(cbx_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(61, 61, 61)))
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu_salir2Layout.createSequentialGroup()
                        .addComponent(cbx_distrito, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                        .addGap(45, 45, 45))
                    .addGroup(menu_salir2Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                        .addGap(27, 27, 27))))
        );
        menu_salir2Layout.setVerticalGroup(
            menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_distrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        menu_salir3.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir3.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir3.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir3.setRound(40);

        tablePatients.setForeground(new java.awt.Color(74, 74, 74));
        tablePatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablePatients.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablePatients.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        tablePatients.setColorFilasForeground2(new java.awt.Color(74, 74, 74));
        tablePatients.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        tablePatients.setFuenteFilas(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        tablePatients.setFuenteFilasSelect(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        tablePatients.setFuenteHead(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        tablePatients.setGridColor(new java.awt.Color(153, 153, 153));
        tablePatients.setGrosorBordeFilas(0);
        tablePatients.setGrosorBordeHead(0);
        tablePatients.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tablePatients);

        javax.swing.GroupLayout menu_salir3Layout = new javax.swing.GroupLayout(menu_salir3);
        menu_salir3.setLayout(menu_salir3Layout);
        menu_salir3Layout.setHorizontalGroup(
            menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        menu_salir3Layout.setVerticalGroup(
            menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        rSPanelBorderGradient1.setBackground(new java.awt.Color(204, 204, 204));
        rSPanelBorderGradient1.setBgShade(new java.awt.Color(255, 255, 255));
        rSPanelBorderGradient1.setColorPrimario(new java.awt.Color(41, 177, 255));
        rSPanelBorderGradient1.setColorSecundario(new java.awt.Color(41, 177, 255));
        rSPanelBorderGradient1.setGradiente(RSMaterialComponent.RSPanelBorderGradient.Gradiente.HORIZONTAL);
        rSPanelBorderGradient1.setRound(40);
        rSPanelBorderGradient1.setWidthBorder(0);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-persona-de-sexo-masculino-100.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("PACIENTES");

        btn_nuevo_paciente.setBackground(new java.awt.Color(0, 160, 253));
        btn_nuevo_paciente.setForeground(new java.awt.Color(51, 51, 51));
        btn_nuevo_paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-añadir-usuario-masculino-24.png"))); // NOI18N
        btn_nuevo_paciente.setText("Nuevo Paciente");
        btn_nuevo_paciente.setBorderPainted(false);
        btn_nuevo_paciente.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        btn_nuevo_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevo_pacienteActionPerformed(evt);
            }
        });

        btn_guardar_paciente.setBackground(new java.awt.Color(0, 160, 253));
        btn_guardar_paciente.setForeground(new java.awt.Color(51, 51, 51));
        btn_guardar_paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-guardar-24.png"))); // NOI18N
        btn_guardar_paciente.setText("Guardar Paciente");
        btn_guardar_paciente.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        btn_guardar_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_pacienteActionPerformed(evt);
            }
        });

        btn_modificar_paciente.setBackground(new java.awt.Color(0, 160, 253));
        btn_modificar_paciente.setForeground(new java.awt.Color(51, 51, 51));
        btn_modificar_paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-editar-usuario-masculino-24.png"))); // NOI18N
        btn_modificar_paciente.setText("Modificar Paciente");
        btn_modificar_paciente.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        btn_modificar_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_pacienteActionPerformed(evt);
            }
        });

        btn_cancelar_cambios.setBackground(new java.awt.Color(0, 160, 253));
        btn_cancelar_cambios.setForeground(new java.awt.Color(51, 51, 51));
        btn_cancelar_cambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/cancelar.png"))); // NOI18N
        btn_cancelar_cambios.setText("Cancelar Cambios");
        btn_cancelar_cambios.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        btn_cancelar_cambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_cambiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rSPanelBorderGradient1Layout = new javax.swing.GroupLayout(rSPanelBorderGradient1);
        rSPanelBorderGradient1.setLayout(rSPanelBorderGradient1Layout);
        rSPanelBorderGradient1Layout.setHorizontalGroup(
            rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelBorderGradient1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelBorderGradient1Layout.createSequentialGroup()
                        .addGroup(rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_modificar_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cancelar_cambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_guardar_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_nuevo_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelBorderGradient1Layout.createSequentialGroup()
                        .addGroup(rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel12))
                        .addGap(78, 78, 78))))
        );
        rSPanelBorderGradient1Layout.setVerticalGroup(
            rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelBorderGradient1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_nuevo_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btn_guardar_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btn_modificar_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btn_cancelar_cambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rSPanelBorderGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu_salir2, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                    .addComponent(menu_salir3, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                    .addComponent(menu_salir1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu_salir1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menu_salir2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_salir3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(rSPanelBorderGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_provinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_provinciaActionPerformed
 listar_distrito();    
    }//GEN-LAST:event_cbx_provinciaActionPerformed

    private void cbx_departamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_departamentoActionPerformed
listar_Provincia();        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_departamentoActionPerformed

    private void cbx_distritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_distritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_distritoActionPerformed

    private void btn_buscar_reniecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_reniecActionPerformed
 try {
            if (txt_dni.getText().length() >= 8) {
                CTR_02_Patient ctr = new CTR_02_Patient();
                Patient entidad = new Patient();
                //buscar si existe el paciente el la base de datos
                try {
                    entidad = ctr.CheckDNI(txt_dni.getText());
                } catch (Exception e) {
                    //JOptionPane.showMessageDialog(null, e.getMessage(),
                    //"Dental SyS", JOptionPane.WARNING_MESSAGE);

                    //muestra los datos de la reniec en el fomrulario
                    entidad = ctr.SearchReniec(txt_dni.getText());
                    txt_name.setText(entidad.getName());
                    txt_apellidoPAT.setText(entidad.getLastname());
                    txt_apellidoMAT.setText(entidad.getSurename());
                }
                if (entidad.getId() != 0) {
                    // existe el dni
                    // despliega un mensaje

                    /* JOptionPane.showMessageDialog(null, "El DNI ingresado ya existe!",
                        "Dental SyS", JOptionPane.WARNING_MESSAGE);*/
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese el DNI",
                        "Dental SyS", JOptionPane.WARNING_MESSAGE);
            }
            
        } catch (IOException ex) {
            //Logger.getLogger(frm_02_register_patient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException ex) {
            // Logger.getLogger(frm_02_register_patient.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscar_reniecActionPerformed

    private void btn_guardar_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_pacienteActionPerformed
 String msg = "";
        int focus = 0;
        if (txt_dni.getText().length() < 8 || txt_dni.getText().length() > 8) {
            msg = msg + "Ingrese un DNI válido\n";
            focus = 0;
        } else if (!inputStringIngresado(txt_name.getText())) {
            msg = msg + "Ingrese su nombre\n";
            focus = 1;
        } else if (!inputStringIngresado(txt_apellidoPAT.getText())) {
            msg = msg + "Ingrese el apellido paterno\n";
            focus = 2;
        } else if (!inputStringIngresado(txt_apellidoMAT.getText())) {
            msg = msg + "Ingrese el apellido materno\n";
            focus = 3;
        } else if (!inputStringIngresado(txt_phone.getText())) {
            msg = msg + "ingrese un numero de celular\n";
            focus = 4;
        } else if (!inputStringIngresado(txt_direccion.getText())) {
            msg = msg + "Ingrese su dirección\n";
            focus = 6;
        } else if (!esEmail(txt_email.getText()) || txt_email.getText().length() <= 0) {
            msg = msg + "El correo electrónico no es válido\n";
            focus = 5;
        }
        
        try {
            if (msg.length() > 0) {
                JOptionPane.showMessageDialog(null, msg,
                        "Dental SyS", JOptionPane.ERROR_MESSAGE);
                switch (focus) {
                    case 0:
                        txt_dni.requestFocus();
                        break;
                    case 1:
                        txt_name.requestFocus();
                        break;
                    case 2:
                        txt_apellidoPAT.requestFocus();
                        break;
                    case 3:
                        txt_apellidoMAT.requestFocus();
                        break;
                    case 4:
                        txt_phone.requestFocus();
                        break;
                    case 5:
                        txt_email.requestFocus();
                        break;
                    case 6:
                        txt_direccion.requestFocus();
                        break;
                    default:
                        txt_dni.requestFocus();
                        break;
                }
            } else {
                
                Patient patient = new Patient();
                patient.setDni(txt_dni.getText());
                patient.setName(txt_name.getText());
                patient.setLastname(txt_apellidoPAT.getText());
                patient.setSurename(txt_apellidoMAT.getText());
                patient.setPhone(txt_phone.getText());
                patient.setEmail(txt_email.getText());
                patient.setAddress(txt_direccion.getText());
                
                String Ubigeo_Code = ubigeo_lista_dep.get(cbx_departamento.getSelectedIndex()).getCodigo_departamento() +
                                     ubigeo_lista_dep_pro.get(cbx_provincia.getSelectedIndex()).getCodigo_provincia() + 
                                     ubigeo_lista_dep_pro_dis.get(cbx_distrito.getSelectedIndex()).getCodigo_distrito();

                patient.setUbigeo(Ubigeo_Code);
                
                patient.setEnable(true);
                
                CTR_02_Patient ctrp = new CTR_02_Patient();
                
                if (id > 0) {
                    //modificar
                    patient.setId(id);
                    ctrp.UpdatePatient(patient);
                    btn_cancelar_cambios.setEnabled(false);
                    btn_guardar_paciente.setEnabled(false);
                    btn_buscar_reniec.setEnabled(false);
                    btn_nuevo_paciente.setEnabled(true);
                    Limpiar();
                    dto = new Patient();
                    id = 0;
                    //frm_02_Patient frame = (frm_02_Patient) this.getTopLevelAncestor();
                    //frame.mensaje();
                    mensaje();
                } else {
                    // insertar
                    if (patient.getId() == 0) {
                        patient = ctrp.InsertPatient(patient);
                        btn_cancelar_cambios.setEnabled(false);
                        btn_guardar_paciente.setEnabled(false);
                        btn_buscar_reniec.setEnabled(false);
                        Limpiar();
                        // frm_02_Patient frame = (frm_02_Patient) this.getTopLevelAncestor();
                        // frame.mensaje();
                        mensaje();
                        new rojerusan.RSNotifyFade("DentalSys", "Se guardaron los cambios correctamente.", 7,
                                RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                    } else {
                        
                        new rojerusan.RSNotifyFade("DentalSys", "No se guardaron los datos! \n Intente nuevamente", 7,
                                RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.WARNING).setVisible(true);
                    }
                }
                
            }
            
        } catch (SQLException ex) {
            // Logger.getLogger(frm_02_register_patient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DaoException ex) {
            //Logger.getLogger(frm_02_register_patient.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardar_pacienteActionPerformed

    private void btn_nuevo_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevo_pacienteActionPerformed
 Limpiar();
        txt_dni.setEnabled(true);
        txt_name.setEnabled(true);
        txt_apellidoPAT.setEnabled(true);
        txt_apellidoMAT.setEnabled(true);
        txt_phone.setEnabled(true);
        txt_email.setEnabled(true);
        txt_direccion.setEnabled(true);
        btn_cancelar_cambios.setEnabled(true);
        btn_guardar_paciente.setEnabled(true);
        btn_buscar_reniec.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevo_pacienteActionPerformed

    private void btn_modificar_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar_pacienteActionPerformed
  try {
            Patient dto = new Patient();
            dto = cTR_02_Patient.SelectPatient(this.id);
            
            btn_modificar_paciente.setEnabled(false);
            btn_nuevo_paciente.setEnabled(false);
            btn_cancelar_cambios.setEnabled(true);
            btn_guardar_paciente.setEnabled(true);
            txt_dni.setText(dto.getDni());
            txt_dni.setEnabled(false);
            txt_name.setEnabled(true);
            txt_apellidoPAT.setEnabled(true);
            txt_apellidoMAT.setEnabled(true);
            txt_phone.setEnabled(true);
            txt_email.setEnabled(true);
            txt_direccion.setEnabled(true);
            
            txt_name.setText(dto.getName());
            txt_apellidoPAT.setText(dto.getLastname());
            txt_apellidoMAT.setText(dto.getSurename());
            txt_phone.setText(dto.getPhone());
            txt_email.setText(dto.getEmail());
            txt_direccion.setText(dto.getAddress());
            btn_buscar_reniec.setEnabled(false);
            
            // substring en el string
            String cod_dep = dto.getUbigeo().substring(0, 2);
            String cod_prov = dto.getUbigeo().substring(2, 4);
            String cod_dist = dto.getUbigeo().substring(4, 6);
            
            for(int a = 0; a < ubigeo_lista_dep.size(); a++){
                if(ubigeo_lista_dep.get(a).getCodigo_departamento().equals(cod_dep)){
                    cbx_departamento.setSelectedIndex(a);
                    break;
                }
            }
            
            for(int a = 0; a < ubigeo_lista_dep_pro.size(); a++){
                if(ubigeo_lista_dep_pro.get(a).getCodigo_provincia().equals(cod_prov)){
                    cbx_provincia.setSelectedIndex(a);
                    break;
                }
            }

            for(int a = 0; a < ubigeo_lista_dep_pro_dis.size(); a++){
                if(ubigeo_lista_dep_pro_dis.get(a).getCodigo_distrito().equals(cod_dist)){
                    cbx_distrito.setSelectedIndex(a);
                    break;
                }
            }
            
            int a = 0;            
            
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(frm_02_Patient_Detail.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DaoException ex) {
            Logger.getLogger(frm_02_Patient_Detail.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modificar_pacienteActionPerformed

    private void btn_cancelar_cambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_cambiosActionPerformed
 Limpiar();
        txt_dni.setEnabled(false);
        btn_buscar_reniec.setEnabled(false);
        txt_name.setEnabled(false);
        txt_apellidoPAT.setEnabled(false);
        txt_apellidoMAT.setEnabled(false);
        txt_phone.setEnabled(false);
        txt_email.setEnabled(false);
        txt_direccion.setEnabled(false);
        btn_cancelar_cambios.setEnabled(false);
        btn_guardar_paciente.setEnabled(false);
        btn_modificar_paciente.setEnabled(false);
        btn_nuevo_paciente.setEnabled(true);
        dto = new Patient();
        id = 0;        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelar_cambiosActionPerformed
 private boolean editable;
    private Patient dto;
    
    public Patient getDto() {
        return dto;
    }
    
    public void setDto(Patient dto) {
        this.dto = dto;
    }
    
    private long id;
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public boolean isEditable() {
        return editable;
    }
    
    public void setEditable(boolean editable) {
        btn_modificar_paciente.setEnabled(editable);
    }
    
    public void Limpiar() {
        txt_dni.setText("");
        txt_name.setText("");
        txt_apellidoPAT.setText("");
        txt_apellidoMAT.setText("");
        txt_phone.setText("");
        txt_email.setText("");
        txt_direccion.setText("");
        cbx_departamento.setSelectedIndex(0);
        cbx_provincia.setSelectedIndex(0);
        cbx_distrito.setSelectedIndex(0);
        txt_dni.requestFocus();
        
        txt_dni.setEnabled(false);
        txt_name.setEnabled(false);
        txt_apellidoPAT.setEnabled(false);
        txt_apellidoMAT.setEnabled(false);
        txt_phone.setEnabled(false);
        txt_email.setEnabled(false);
        txt_direccion.setEnabled(false);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_buscar_reniec;
    private newscomponents.RSButtonFlat_new btn_cancelar_cambios;
    private newscomponents.RSButtonFlat_new btn_guardar_paciente;
    private newscomponents.RSButtonFlat_new btn_modificar_paciente;
    private newscomponents.RSButtonFlat_new btn_nuevo_paciente;
    private RSMaterialComponent.RSComboBoxMaterial cbx_departamento;
    private RSMaterialComponent.RSComboBoxMaterial cbx_distrito;
    private RSMaterialComponent.RSComboBoxMaterial cbx_provincia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private RSMaterialComponent.RSPanelMaterial menu_salir1;
    private RSMaterialComponent.RSPanelMaterial menu_salir2;
    private RSMaterialComponent.RSPanelMaterial menu_salir3;
    private RSMaterialComponent.RSPanelBorderGradient rSPanelBorderGradient1;
    private rojerusan.RSTableMetro tablePatients;
    private rojerusan.RSMetroTextPlaceHolder txt_apellidoMAT;
    private rojerusan.RSMetroTextPlaceHolder txt_apellidoPAT;
    private rojerusan.RSMetroTextFullPlaceHolder txt_direccion;
    private rojerusan.RSMetroTextPlaceHolder txt_dni;
    private rojerusan.RSMetroTextFullPlaceHolder txt_email;
    private rojerusan.RSMetroTextPlaceHolder txt_name;
    private rojerusan.RSMetroTextFullPlaceHolder txt_phone;
    // End of variables declaration//GEN-END:variables
}
