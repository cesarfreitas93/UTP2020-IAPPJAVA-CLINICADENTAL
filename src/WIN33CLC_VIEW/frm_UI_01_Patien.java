
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
        txt_direccion.setEnabled(false);
        txt_email.setEnabled(false);
        
        btn_cancelar_cambios.setEnabled(false);
        btn_modificar_paciente.setEnabled(false);
        btn_guardar_paciente.setEnabled(false);
        listar_Departamento();
        cTR_02_Patient = new CTR_02_Patient();
        
        setBackground(new Color (255,255,255,0));
      //  menu_salir4.setBackground(new Color (255,255,255,200));

      
       
    }
    
    
    
    
    public void ocultar_form_patient(boolean b)
    {
    menu_salir1.setVisible(b);
    menu_salir2.setVisible(b);
            menu_salir3.setVisible(b);
            menu_salir4.setVisible(b);
            
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
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_email = new rscomponentshade.RSFormatFieldShade();
        txt_phone = new rscomponentshade.RSFormatFieldShade();
        txt_dni = new rscomponentshade.RSFormatFieldShade();
        txt_name = new rscomponentshade.RSFormatFieldShade();
        txt_apellidoPAT = new rscomponentshade.RSFormatFieldShade();
        txt_apellidoMAT = new rscomponentshade.RSFormatFieldShade();
        txt_direccion = new rscomponentshade.RSFormatFieldShade();
        btn_buscar_reniec = new newscomponents.RSButtonFlat_new();
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
        menu_salir4 = new RSMaterialComponent.RSPanelMaterial();
        jLabel12 = new javax.swing.JLabel();
        btn_nuevo_paciente = new newscomponents.RSButtonFlat_new();
        btn_guardar_paciente = new newscomponents.RSButtonFlat_new();
        btn_modificar_paciente = new newscomponents.RSButtonFlat_new();
        btn_cancelar_cambios = new newscomponents.RSButtonFlat_new();
        jLabel3 = new javax.swing.JLabel();

        menu_salir1.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir1.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir1.setPixels(0);
        menu_salir1.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir1.setRound(40);

        jLabel10.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Nombres");

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Teléfono");

        jLabel6.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Dirección");

        jLabel11.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Apellido Paterno");

        jLabel17.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Apellido Materno");

        jLabel7.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Correo electrónico");

        txt_email.setBackground(new java.awt.Color(246, 247, 251));
        txt_email.setForeground(new java.awt.Color(51, 51, 51));
        txt_email.setBgShade(new java.awt.Color(255, 255, 255));
        txt_email.setBgShadeHover(new java.awt.Color(204, 204, 204));
        txt_email.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txt_email.setIntensity(0);
        txt_email.setPhColor(new java.awt.Color(255, 255, 255));
        txt_email.setPixels(0);
        txt_email.setPlaceholder("");
        txt_email.setRound(40);

        txt_phone.setBackground(new java.awt.Color(247, 248, 251));
        txt_phone.setForeground(new java.awt.Color(51, 51, 51));
        txt_phone.setBgShade(new java.awt.Color(255, 255, 255));
        txt_phone.setBgShadeHover(new java.awt.Color(204, 204, 204));
        txt_phone.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txt_phone.setIntensity(0);
        txt_phone.setPhColor(new java.awt.Color(255, 255, 255));
        txt_phone.setPixels(0);
        txt_phone.setPlaceholder("");
        txt_phone.setRound(40);

        txt_dni.setBackground(new java.awt.Color(247, 248, 251));
        txt_dni.setBorder(null);
        txt_dni.setForeground(new java.awt.Color(51, 51, 51));
        txt_dni.setBgShade(new java.awt.Color(255, 255, 255));
        txt_dni.setBgShadeHover(new java.awt.Color(255, 255, 255));
        txt_dni.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_dni.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_dni.setDoubleBuffered(true);
        txt_dni.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txt_dni.setIntensity(0);
        txt_dni.setPhColor(new java.awt.Color(255, 255, 255));
        txt_dni.setPixels(0);
        txt_dni.setPlaceholder("");
        txt_dni.setRound(40);

        txt_name.setBackground(new java.awt.Color(247, 248, 251));
        txt_name.setForeground(new java.awt.Color(51, 51, 51));
        txt_name.setBgShade(new java.awt.Color(255, 255, 255));
        txt_name.setBgShadeHover(new java.awt.Color(204, 204, 204));
        txt_name.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txt_name.setIntensity(0);
        txt_name.setPhColor(new java.awt.Color(255, 255, 255));
        txt_name.setPixels(0);
        txt_name.setPlaceholder("");
        txt_name.setRound(40);

        txt_apellidoPAT.setBackground(new java.awt.Color(246, 247, 251));
        txt_apellidoPAT.setForeground(new java.awt.Color(51, 51, 51));
        txt_apellidoPAT.setBgShade(new java.awt.Color(255, 255, 255));
        txt_apellidoPAT.setBgShadeHover(new java.awt.Color(204, 204, 204));
        txt_apellidoPAT.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txt_apellidoPAT.setIntensity(0);
        txt_apellidoPAT.setPhColor(new java.awt.Color(255, 255, 255));
        txt_apellidoPAT.setPixels(0);
        txt_apellidoPAT.setPlaceholder("");
        txt_apellidoPAT.setRound(40);

        txt_apellidoMAT.setBackground(new java.awt.Color(246, 247, 251));
        txt_apellidoMAT.setForeground(new java.awt.Color(51, 51, 51));
        txt_apellidoMAT.setBgShade(new java.awt.Color(255, 255, 255));
        txt_apellidoMAT.setBgShadeHover(new java.awt.Color(204, 204, 204));
        txt_apellidoMAT.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txt_apellidoMAT.setIntensity(0);
        txt_apellidoMAT.setPhColor(new java.awt.Color(255, 255, 255));
        txt_apellidoMAT.setPixels(0);
        txt_apellidoMAT.setPlaceholder("");
        txt_apellidoMAT.setRound(40);

        txt_direccion.setBackground(new java.awt.Color(246, 247, 251));
        txt_direccion.setForeground(new java.awt.Color(51, 51, 51));
        txt_direccion.setBgShade(new java.awt.Color(255, 255, 255));
        txt_direccion.setBgShadeHover(new java.awt.Color(204, 204, 204));
        txt_direccion.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txt_direccion.setIntensity(0);
        txt_direccion.setPhColor(new java.awt.Color(255, 255, 255));
        txt_direccion.setPixels(0);
        txt_direccion.setPlaceholder("");
        txt_direccion.setRound(40);

        btn_buscar_reniec.setBackground(new java.awt.Color(139, 198, 255));
        btn_buscar_reniec.setForeground(new java.awt.Color(51, 51, 51));
        btn_buscar_reniec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-encuentra-hombre-usuario-24.png"))); // NOI18N
        btn_buscar_reniec.setText("Buscar en Reniec");
        btn_buscar_reniec.setBorderPainted(false);
        btn_buscar_reniec.setContentAreaFilled(true);
        btn_buscar_reniec.setCornerRound(45);
        btn_buscar_reniec.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
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
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(txt_dni, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_apellidoPAT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_buscar_reniec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(txt_apellidoMAT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        menu_salir1Layout.setVerticalGroup(
            menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar_reniec, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apellidoPAT, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apellidoMAT, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        menu_salir2.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir2.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir2.setPixels(0);
        menu_salir2.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir2.setRound(40);

        jLabel8.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Departamento");

        jLabel13.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Provincia");

        jLabel16.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Distrito");

        cbx_provincia.setForeground(new java.awt.Color(51, 51, 51));
        cbx_provincia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija una Opcion.", "RSItem 2", "RSItem 3", "RSItem 4" }));
        cbx_provincia.setColorMaterial(new java.awt.Color(10, 117, 167));
        cbx_provincia.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        cbx_provincia.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        cbx_provincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_provinciaActionPerformed(evt);
            }
        });

        cbx_departamento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        cbx_departamento.setForeground(new java.awt.Color(51, 51, 51));
        cbx_departamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija una Opcion.", "RSItem 2", "RSItem 3", "RSItem 4" }));
        cbx_departamento.setColorMaterial(new java.awt.Color(10, 117, 167));
        cbx_departamento.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        cbx_departamento.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        cbx_departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_departamentoActionPerformed(evt);
            }
        });

        cbx_distrito.setForeground(new java.awt.Color(51, 51, 51));
        cbx_distrito.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija una Opcion.", "RSItem 2", "RSItem 3", "RSItem 4" }));
        cbx_distrito.setColorMaterial(new java.awt.Color(10, 117, 167));
        cbx_distrito.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
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
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_departamento, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(cbx_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(cbx_distrito, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        menu_salir2Layout.setVerticalGroup(
            menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_distrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        menu_salir3.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir3.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir3.setPixels(0);
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
        tablePatients.setColorFilasBackgound1(new java.awt.Color(246, 247, 251));
        tablePatients.setColorFilasBackgound2(new java.awt.Color(246, 247, 251));
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        menu_salir4.setBackground(new java.awt.Color(200, 232, 250));
        menu_salir4.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir4.setPixels(0);
        menu_salir4.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir4.setRound(40);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-persona-de-sexo-masculino-100.png"))); // NOI18N

        btn_nuevo_paciente.setBackground(new java.awt.Color(139, 198, 255));
        btn_nuevo_paciente.setForeground(new java.awt.Color(51, 51, 51));
        btn_nuevo_paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-añadir-usuario-masculino-24.png"))); // NOI18N
        btn_nuevo_paciente.setText("Nuevo Paciente");
        btn_nuevo_paciente.setBorderPainted(false);
        btn_nuevo_paciente.setContentAreaFilled(true);
        btn_nuevo_paciente.setCornerRound(45);
        btn_nuevo_paciente.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_nuevo_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevo_pacienteActionPerformed(evt);
            }
        });

        btn_guardar_paciente.setBackground(new java.awt.Color(139, 198, 255));
        btn_guardar_paciente.setForeground(new java.awt.Color(51, 51, 51));
        btn_guardar_paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-guardar-24.png"))); // NOI18N
        btn_guardar_paciente.setText("Guardar Paciente");
        btn_guardar_paciente.setBorderPainted(false);
        btn_guardar_paciente.setContentAreaFilled(true);
        btn_guardar_paciente.setCornerRound(45);
        btn_guardar_paciente.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_guardar_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_pacienteActionPerformed(evt);
            }
        });

        btn_modificar_paciente.setBackground(new java.awt.Color(139, 198, 255));
        btn_modificar_paciente.setForeground(new java.awt.Color(51, 51, 51));
        btn_modificar_paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-editar-usuario-masculino-24.png"))); // NOI18N
        btn_modificar_paciente.setText("Modificar Paciente");
        btn_modificar_paciente.setBorderPainted(false);
        btn_modificar_paciente.setContentAreaFilled(true);
        btn_modificar_paciente.setCornerRound(45);
        btn_modificar_paciente.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_modificar_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_pacienteActionPerformed(evt);
            }
        });

        btn_cancelar_cambios.setBackground(new java.awt.Color(139, 198, 255));
        btn_cancelar_cambios.setForeground(new java.awt.Color(51, 51, 51));
        btn_cancelar_cambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/cancelar.png"))); // NOI18N
        btn_cancelar_cambios.setText("Cancelar Cambios");
        btn_cancelar_cambios.setBorderPainted(false);
        btn_cancelar_cambios.setContentAreaFilled(true);
        btn_cancelar_cambios.setCornerRound(45);
        btn_cancelar_cambios.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_cancelar_cambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_cambiosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 42)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Pacientes");

        javax.swing.GroupLayout menu_salir4Layout = new javax.swing.GroupLayout(menu_salir4);
        menu_salir4.setLayout(menu_salir4Layout);
        menu_salir4Layout.setHorizontalGroup(
            menu_salir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_salir4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menu_salir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_nuevo_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar_cambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modificar_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardar_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
            .addGroup(menu_salir4Layout.createSequentialGroup()
                .addGroup(menu_salir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu_salir4Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel12))
                    .addGroup(menu_salir4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu_salir4Layout.setVerticalGroup(
            menu_salir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(btn_nuevo_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_modificar_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_guardar_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_cancelar_cambios, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu_salir4, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu_salir2, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                    .addComponent(menu_salir3, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                    .addComponent(menu_salir1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu_salir1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menu_salir2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_salir3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(menu_salir4, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
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
        }           // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscar_reniecActionPerformed

    private void btn_nuevo_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevo_pacienteActionPerformed
    Limpiar();
    
    txt_dni.setFocusable(true);
        txt_dni.setEnabled(true);
        txt_name.setEnabled(true);
        txt_apellidoPAT.setEnabled(true);
        txt_apellidoMAT.setEnabled(true);
        txt_phone.setEnabled(true);
        txt_direccion.setEnabled(true);
        txt_email.setEnabled(true);
        btn_cancelar_cambios.setEnabled(true);
        btn_guardar_paciente.setEnabled(true);
        btn_buscar_reniec.setEnabled(true);            // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevo_pacienteActionPerformed

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
                    txt_direccion.requestFocus();
                    break;
                    case 6:
                    txt_email.requestFocus();
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
                patient.setEmail(txt_direccion.getText());
                patient.setAddress(txt_email.getText());

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
        }          // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardar_pacienteActionPerformed

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
            txt_direccion.setEnabled(true);
            txt_email.setEnabled(true);

            txt_name.setText(dto.getName());
            txt_apellidoPAT.setText(dto.getLastname());
            txt_apellidoMAT.setText(dto.getSurename());
            txt_phone.setText(dto.getPhone());
            txt_direccion.setText(dto.getEmail());
            txt_email.setText(dto.getAddress());
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
        }   
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modificar_pacienteActionPerformed

    private void btn_cancelar_cambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_cambiosActionPerformed
 Limpiar();
        txt_dni.setEnabled(false);
        btn_buscar_reniec.setEnabled(false);
        txt_name.setEnabled(false);
        txt_apellidoPAT.setEnabled(false);
        txt_apellidoMAT.setEnabled(false);
        txt_phone.setEnabled(false);
        txt_direccion.setEnabled(false);
        txt_email.setEnabled(false);
        btn_cancelar_cambios.setEnabled(false);
        btn_guardar_paciente.setEnabled(false);
        btn_modificar_paciente.setEnabled(false);
        btn_nuevo_paciente.setEnabled(true);
        dto = new Patient();
        id = 0;         // TODO add your handling code here:
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
        txt_direccion.setText("");
        txt_email.setText("");
        cbx_departamento.setSelectedIndex(0);
        cbx_provincia.setSelectedIndex(0);
        cbx_distrito.setSelectedIndex(0);
        txt_dni.requestFocus();
        
        txt_dni.setEnabled(false);
        txt_name.setEnabled(false);
        txt_apellidoPAT.setEnabled(false);
        txt_apellidoMAT.setEnabled(false);
        txt_phone.setEnabled(false);
        txt_direccion.setEnabled(false);
        txt_email.setEnabled(false);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btn_buscar_reniec;
    private newscomponents.RSButtonFlat_new btn_cancelar_cambios;
    private newscomponents.RSButtonFlat_new btn_guardar_paciente;
    private newscomponents.RSButtonFlat_new btn_modificar_paciente;
    private newscomponents.RSButtonFlat_new btn_nuevo_paciente;
    private RSMaterialComponent.RSComboBoxMaterial cbx_departamento;
    private RSMaterialComponent.RSComboBoxMaterial cbx_distrito;
    private RSMaterialComponent.RSComboBoxMaterial cbx_provincia;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private RSMaterialComponent.RSPanelMaterial menu_salir1;
    private RSMaterialComponent.RSPanelMaterial menu_salir2;
    private RSMaterialComponent.RSPanelMaterial menu_salir3;
    private RSMaterialComponent.RSPanelMaterial menu_salir4;
    private rojerusan.RSTableMetro tablePatients;
    private rscomponentshade.RSFormatFieldShade txt_apellidoMAT;
    private rscomponentshade.RSFormatFieldShade txt_apellidoPAT;
    private rscomponentshade.RSFormatFieldShade txt_direccion;
    private rscomponentshade.RSFormatFieldShade txt_dni;
    private rscomponentshade.RSFormatFieldShade txt_email;
    private rscomponentshade.RSFormatFieldShade txt_name;
    private rscomponentshade.RSFormatFieldShade txt_phone;
    // End of variables declaration//GEN-END:variables
}
