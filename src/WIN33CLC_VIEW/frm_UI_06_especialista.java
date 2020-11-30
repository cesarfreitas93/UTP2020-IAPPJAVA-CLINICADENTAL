
package WIN33CLC_VIEW;

import WIN30CLC_DAO.DaoException;
import WIN31CLC_DTO.Service;
import WIN31CLC_DTO.Specialist;
import WIN32CLC_CTR.CTR_03_Service;
import WIN32CLC_CTR.CTR_04_Specialist;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import org.json.JSONException;


public class frm_UI_06_especialista extends javax.swing.JPanel {
    
    
  ArrayList<Service> service_list = null;
    CTR_04_Specialist cTR_04_Specialist;
    
    
    public frm_UI_06_especialista() {
        initComponents();
     
        setBackground(new Color (255,255,255,1));
        btn_nuevo_especialista.setBackground(new Color (41,177,255,0));
        btn_modificar_especialista.setBackground(new Color (41,177,255,0));
        btn_guardar_especialista.setBackground(new Color (41,177,255,0));
        btn_cancelar_cambios.setBackground(new Color (41,177,255,0));
       btn_nuevo_especialista.setEnabled(true);
        btn_guardar_especialista.setEnabled(false);
        btn_cancelar_cambios.setEnabled(false);
        btn_modificar_especialista.setEnabled(false);
        
        txt_apellidoMAT.setEnabled(false);
        txt_apellidoPAT.setEnabled(false);
        txt_direccion.setEnabled(false);
        txt_direccion.setEnabled(false);
        txt_dni.setEnabled(false);
        txt_name.setEnabled(false);
        txt_phone.setEnabled(false);
        btn_buscar_reniec_especialista.setEnabled(false);
        
        
        LoadData();
    }
    public void ocultar_form_especialista(boolean b)
    {
    menu_salir1.setVisible(b);
    menu_salir2.setVisible(b);
     menu_salir3.setVisible(b);
      rSPanelBorderGradient1.setVisible(b);
            
    }
    
    private long id;
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public void LoadData() {
        try {
            // traer los servicios
            CTR_03_Service ctr_Service = new CTR_03_Service();
            cTR_04_Specialist = new CTR_04_Specialist();
            service_list = new ArrayList<Service>();
            Service service = new Service();
            service.setId(0);
            service.setName("--Seleccionar--");
            service.setPrice(0);
            
            service_list.add(service);
            service_list.addAll(ctr_Service.listService());
            cbx_servicio.removeAllItems();
            if (service_list != null) {
                for (int i = 0; i < service_list.size(); i++) {
                    cbx_servicio.addItem(service_list.get(i).getName());
                }
            }

            
        } catch (SQLException ex) {
            Logger.getLogger(frm_03_reservar_cita.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DaoException ex) {
            Logger.getLogger(frm_03_reservar_cita.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        try {
          
            this.table_especialista.setModel(cTR_04_Specialist.List());
            this.table_especialista.getSelectionModel().addListSelectionListener(e -> {
                boolean seleccionValid = (table_especialista.getSelectedRow() != -1);
                //btnEdit.setEnabled(seleccionValid);
                //btnDelete.setEnabled(seleccionValid);
            });
        } catch (DaoException ex) {
           // Logger.getLogger(frm_02_Patient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
         //   Logger.getLogger(frm_02_Patient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.table_especialista.setDefaultRenderer(JButton.class, new TableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object objeto, boolean estaSeleccionado, boolean tieneElFoco, int fila, int columna) {
                return (Component) objeto;
            }
        });
        
        this.table_especialista.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = table_especialista.rowAtPoint(e.getPoint());
                int columna = table_especialista.columnAtPoint(e.getPoint());
                
                System.out.println("click");
                //setEditable(true);
                
                if (table_especialista.getModel().getColumnClass(columna).equals(JButton.class)) {
     
                    try {
                        cTR_04_Specialist.Delete((long) table_especialista.getModel().getValueAt(fila, 0));
                        btn_modificar_especialista.setEnabled(false);
                        btn_cancelar_cambios.setEnabled(false);
                        btn_guardar_especialista.setEnabled(false);
                        table_especialista.setModel(cTR_04_Specialist.List());

                    } catch (DaoException ex) {
                        Logger.getLogger(frm_05_servicios.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(frm_05_servicios.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }else
                {
                //if (!table_services.getModel().getColumnClass(0).equals(JButton.class)) {
                    setId((long) table_especialista.getModel().getValueAt(fila, 0));
                    btn_modificar_especialista.setEnabled(true);
                }
                
            }
            
        });
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
        btn_buscar_reniec_especialista = new RSMaterialComponent.RSButtonMaterialGradientOne();
        menu_salir2 = new RSMaterialComponent.RSPanelMaterial();
        jLabel8 = new javax.swing.JLabel();
        cbx_servicio = new RSMaterialComponent.RSComboBoxMaterial();
        jLabel5 = new javax.swing.JLabel();
        chx_estado = new RSMaterialComponent.RSCheckBoxMaterial();
        menu_salir3 = new RSMaterialComponent.RSPanelMaterial();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_especialista = new rojerusan.RSTableMetro();
        rSPanelBorderGradient1 = new RSMaterialComponent.RSPanelBorderGradient();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_nuevo_especialista = new newscomponents.RSButtonFlat_new();
        btn_guardar_especialista = new newscomponents.RSButtonFlat_new();
        btn_modificar_especialista = new newscomponents.RSButtonFlat_new();
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

        btn_buscar_reniec_especialista.setForeground(new java.awt.Color(51, 51, 51));
        btn_buscar_reniec_especialista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-encuentra-hombre-usuario-24.png"))); // NOI18N
        btn_buscar_reniec_especialista.setText("Buscar en Reniec");
        btn_buscar_reniec_especialista.setBorderPainted(false);
        btn_buscar_reniec_especialista.setColorPrimario(new java.awt.Color(41, 177, 255));
        btn_buscar_reniec_especialista.setColorPrimarioHover(new java.awt.Color(41, 177, 255));
        btn_buscar_reniec_especialista.setColorSecundario(new java.awt.Color(41, 177, 255));
        btn_buscar_reniec_especialista.setColorSecundarioHover(new java.awt.Color(41, 177, 255));
        btn_buscar_reniec_especialista.setFocusPainted(false);
        btn_buscar_reniec_especialista.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        btn_buscar_reniec_especialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_reniec_especialistaActionPerformed(evt);
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
                                .addComponent(btn_buscar_reniec_especialista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        menu_salir1Layout.setVerticalGroup(
            menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar_reniec_especialista, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        jLabel8.setText("SERVICIO A ATENDER:");

        cbx_servicio.setForeground(new java.awt.Color(51, 51, 51));
        cbx_servicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija una Opcion.", "RSItem 2", "RSItem 3", "RSItem 4" }));
        cbx_servicio.setColorMaterial(new java.awt.Color(10, 117, 167));
        cbx_servicio.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        cbx_servicio.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        cbx_servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_servicioActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setText("Estado: ");

        chx_estado.setForeground(new java.awt.Color(0, 0, 0));
        chx_estado.setText(" Activo");
        chx_estado.setColorCheck(new java.awt.Color(3, 111, 198));
        chx_estado.setColorUnCheck(new java.awt.Color(3, 111, 198));
        chx_estado.setFocusPainted(false);
        chx_estado.setRippleColor(new java.awt.Color(3, 111, 198));

        javax.swing.GroupLayout menu_salir2Layout = new javax.swing.GroupLayout(menu_salir2);
        menu_salir2.setLayout(menu_salir2Layout);
        menu_salir2Layout.setHorizontalGroup(
            menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir2Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chx_estado, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(cbx_servicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        menu_salir2Layout.setVerticalGroup(
            menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_salir2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbx_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chx_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel8)))
                .addGap(29, 29, 29))
        );

        menu_salir3.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir3.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir3.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir3.setRound(40);

        table_especialista.setForeground(new java.awt.Color(74, 74, 74));
        table_especialista.setModel(new javax.swing.table.DefaultTableModel(
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
        table_especialista.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        table_especialista.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        table_especialista.setColorFilasForeground2(new java.awt.Color(74, 74, 74));
        table_especialista.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        table_especialista.setFuenteFilas(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        table_especialista.setFuenteFilasSelect(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        table_especialista.setFuenteHead(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        table_especialista.setGridColor(new java.awt.Color(153, 153, 153));
        table_especialista.setGrosorBordeFilas(0);
        table_especialista.setGrosorBordeHead(0);
        table_especialista.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(table_especialista);

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

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-doctor-en-medicina-100.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("ESPECIALISTAS");

        btn_nuevo_especialista.setBackground(new java.awt.Color(0, 160, 253));
        btn_nuevo_especialista.setForeground(new java.awt.Color(51, 51, 51));
        btn_nuevo_especialista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-documentos-24.png"))); // NOI18N
        btn_nuevo_especialista.setText("Nuevo Especialista");
        btn_nuevo_especialista.setBorderPainted(false);
        btn_nuevo_especialista.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        btn_nuevo_especialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevo_especialistaActionPerformed(evt);
            }
        });

        btn_guardar_especialista.setBackground(new java.awt.Color(0, 160, 253));
        btn_guardar_especialista.setForeground(new java.awt.Color(51, 51, 51));
        btn_guardar_especialista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-guardar-24.png"))); // NOI18N
        btn_guardar_especialista.setText("Guardar Especialista");
        btn_guardar_especialista.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        btn_guardar_especialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_especialistaActionPerformed(evt);
            }
        });

        btn_modificar_especialista.setBackground(new java.awt.Color(0, 160, 253));
        btn_modificar_especialista.setForeground(new java.awt.Color(51, 51, 51));
        btn_modificar_especialista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-editar-usuario-masculino-24.png"))); // NOI18N
        btn_modificar_especialista.setText("Modificar Especialista");
        btn_modificar_especialista.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        btn_modificar_especialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_especialistaActionPerformed(evt);
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
                            .addComponent(btn_modificar_especialista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cancelar_cambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_guardar_especialista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_nuevo_especialista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelBorderGradient1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(81, 81, 81))))
            .addGroup(rSPanelBorderGradient1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        rSPanelBorderGradient1Layout.setVerticalGroup(
            rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelBorderGradient1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_nuevo_especialista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btn_guardar_especialista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btn_modificar_especialista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void cbx_servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_servicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_servicioActionPerformed

    private void btn_guardar_especialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_especialistaActionPerformed
  try {
            Specialist entity = new Specialist();
            entity.setDni(txt_dni.getText());
            entity.setName(txt_name.getText());
            entity.setLastname(txt_apellidoPAT.getText());
            entity.setSurename(txt_apellidoMAT.getText());
            entity.setEnable(chx_estado.isSelected());
            entity.setPhone(txt_phone.getText());
            entity.setAddress(txt_direccion.getText());
            Service parametro = service_list.get(cbx_servicio.getSelectedIndex());
            entity.setServices_id(parametro.getId());
            if(modificar){
                entity.setId(getId());
                cTR_04_Specialist.update(entity);
                limpiar();
            }else{

                cTR_04_Specialist.insert(entity);
                table_especialista.setModel(cTR_04_Specialist.List());
                btn_guardar_especialista.setEnabled(false);
                setId(0);
                btn_cancelar_cambios.setEnabled(false);
                btn_modificar_especialista.setEnabled(false);
                btn_nuevo_especialista.setEnabled(true);
                limpiar();
            }
            
            table_especialista.setModel(cTR_04_Specialist.List());
        } catch (DaoException ex) {
            Logger.getLogger(frm_06_especialistas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frm_06_especialistas.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardar_especialistaActionPerformed

    private void btn_buscar_reniec_especialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_reniec_especialistaActionPerformed
 try {
            if (txt_dni.getText().length() >= 8) {
                CTR_04_Specialist ctr = new CTR_04_Specialist();
                Specialist entidad = new Specialist();
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
    }//GEN-LAST:event_btn_buscar_reniec_especialistaActionPerformed

    private void btn_nuevo_especialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevo_especialistaActionPerformed
  btn_nuevo_especialista.setEnabled(false);
        btn_guardar_especialista.setEnabled(true);
        btn_cancelar_cambios.setEnabled(true);
        btn_modificar_especialista.setEnabled(false);
        modificar = false;
        
        txt_apellidoMAT.setEnabled(true);
        txt_apellidoPAT.setEnabled(true);
        txt_direccion.setEnabled(true);
        txt_direccion.setEnabled(true);
        txt_dni.setEnabled(true);
        txt_name.setEnabled(true);
        txt_phone.setEnabled(true);
        btn_buscar_reniec_especialista.setEnabled(true);
        
        txt_dni.requestFocus();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevo_especialistaActionPerformed

    private void btn_cancelar_cambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_cambiosActionPerformed
   limpiar();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelar_cambiosActionPerformed

    private void btn_modificar_especialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar_especialistaActionPerformed
try {
            // TODO add your handling code here:
            Specialist dto = new Specialist();
            dto = cTR_04_Specialist.Select(getId());
            
            txt_apellidoPAT.setText(dto.getLastname());
            txt_apellidoMAT.setText(dto.getSurename());
            txt_direccion.setText(dto.getAddress());
            txt_dni.setText(dto.getDni());
            txt_name.setText(dto.getName());
            txt_phone.setText(dto.getPhone());
            chx_estado.setSelected(dto.isEnable());
            
            for(int a = 0; a < service_list.size(); a++){
                if(service_list.get(a).getId() == (dto.getServices_id())){
                    cbx_servicio.setSelectedIndex(a);
                    break;
                }
            }
            
            btn_modificar_especialista.setEnabled(false);
            btn_guardar_especialista.setEnabled(true);
            btn_cancelar_cambios.setEnabled(true);
            btn_nuevo_especialista.setEnabled(false);
            modificar = true;
            
        txt_apellidoMAT.setEnabled(true);
        txt_apellidoPAT.setEnabled(true);
        txt_direccion.setEnabled(true);
        txt_dni.setEnabled(false);
        txt_name.setEnabled(true);
        txt_phone.setEnabled(true);
            
        } catch (SQLException ex) {
            Logger.getLogger(frm_05_servicios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DaoException ex) {
            Logger.getLogger(frm_05_servicios.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modificar_especialistaActionPerformed
 boolean modificar = true;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_buscar_reniec_especialista;
    private newscomponents.RSButtonFlat_new btn_cancelar_cambios;
    private newscomponents.RSButtonFlat_new btn_guardar_especialista;
    private newscomponents.RSButtonFlat_new btn_modificar_especialista;
    private newscomponents.RSButtonFlat_new btn_nuevo_especialista;
    private RSMaterialComponent.RSComboBoxMaterial cbx_servicio;
    private RSMaterialComponent.RSCheckBoxMaterial chx_estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private RSMaterialComponent.RSPanelMaterial menu_salir1;
    private RSMaterialComponent.RSPanelMaterial menu_salir2;
    private RSMaterialComponent.RSPanelMaterial menu_salir3;
    private RSMaterialComponent.RSPanelBorderGradient rSPanelBorderGradient1;
    private rojerusan.RSTableMetro table_especialista;
    private rojerusan.RSMetroTextPlaceHolder txt_apellidoMAT;
    private rojerusan.RSMetroTextPlaceHolder txt_apellidoPAT;
    private rojerusan.RSMetroTextFullPlaceHolder txt_direccion;
    private rojerusan.RSMetroTextPlaceHolder txt_dni;
    private rojerusan.RSMetroTextFullPlaceHolder txt_email;
    private rojerusan.RSMetroTextPlaceHolder txt_name;
    private rojerusan.RSMetroTextFullPlaceHolder txt_phone;
    // End of variables declaration//GEN-END:variables

private void limpiar() {
        txt_apellidoMAT.setEnabled(false);
        txt_apellidoPAT.setEnabled(false);
        txt_direccion.setEnabled(false);
        txt_direccion.setEnabled(false);
        txt_dni.setEnabled(false);
        txt_name.setEnabled(false);
        txt_phone.setEnabled(false);
        btn_buscar_reniec_especialista.setEnabled(false);
        
        // TODO add your handling code here:
        btn_guardar_especialista.setEnabled(false);
        btn_cancelar_cambios.setEnabled(false);
        btn_modificar_especialista.setEnabled(false);
        btn_nuevo_especialista.setEnabled(true);
        setId(0);
        modificar = false;
        
        
        txt_apellidoMAT.setText("");
        txt_apellidoPAT.setText("");
        txt_direccion.setText("");
        txt_direccion.setText("");
        txt_dni.setText("");
        txt_name.setText("");
        txt_phone.setText("");
        chx_estado.setSelected(false);
        
        cbx_servicio.setSelectedIndex(0);
    }
}
