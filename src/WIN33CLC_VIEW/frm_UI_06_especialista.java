
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
        btn_buscar_reniec.setEnabled(false);
              p1.setColorPrimario(new Color (255,255,255,200));
     p1.setColorSecundario(new Color (255,255,255,200));
        
        
        LoadData();
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
        txt_dni = new rscomponentshade.RSFormatFieldShade();
        btn_buscar_reniec = new newscomponents.RSButtonFlat_new();
        jLabel10 = new javax.swing.JLabel();
        txt_name = new rscomponentshade.RSFormatFieldShade();
        jLabel2 = new javax.swing.JLabel();
        txt_phone = new rscomponentshade.RSFormatFieldShade();
        txt_direccion = new rscomponentshade.RSFormatFieldShade();
        jLabel6 = new javax.swing.JLabel();
        txt_apellidoPAT = new rscomponentshade.RSFormatFieldShade();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_apellidoMAT = new rscomponentshade.RSFormatFieldShade();
        menu_salir2 = new RSMaterialComponent.RSPanelMaterial();
        jLabel8 = new javax.swing.JLabel();
        cbx_servicio = new RSMaterialComponent.RSComboBoxMaterial();
        jLabel5 = new javax.swing.JLabel();
        chx_estado = new RSMaterialComponent.RSCheckBoxMaterial();
        menu_salir3 = new RSMaterialComponent.RSPanelMaterial();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_especialista = new rojerusan.RSTableMetro();
        p1 = new RSMaterialComponent.RSPanelBorderGradient();
        jLabel12 = new javax.swing.JLabel();
        btn_nuevo_especialista = new newscomponents.RSButtonFlat_new();
        btn_guardar_especialista = new newscomponents.RSButtonFlat_new();
        btn_modificar_especialista = new newscomponents.RSButtonFlat_new();
        btn_cancelar_cambios = new newscomponents.RSButtonFlat_new();
        jLabel3 = new javax.swing.JLabel();

        menu_salir1.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir1.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir1.setPixels(0);
        menu_salir1.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir1.setRound(40);

        txt_dni.setBackground(new java.awt.Color(246, 247, 251));
        txt_dni.setBgShade(new java.awt.Color(255, 255, 255));
        txt_dni.setBgShadeHover(new java.awt.Color(255, 255, 255));
        txt_dni.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_dni.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_dni.setDoubleBuffered(true);
        txt_dni.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txt_dni.setIntensity(0);
        txt_dni.setPixels(0);
        txt_dni.setPlaceholder("Ingrese DNI");
        txt_dni.setRound(40);

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

        jLabel10.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Nombres");

        txt_name.setBackground(new java.awt.Color(246, 247, 251));
        txt_name.setBgShade(new java.awt.Color(255, 255, 255));
        txt_name.setBgShadeHover(new java.awt.Color(204, 204, 204));
        txt_name.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txt_name.setIntensity(0);
        txt_name.setPhColor(new java.awt.Color(255, 255, 255));
        txt_name.setPixels(0);
        txt_name.setPlaceholder("");
        txt_name.setRound(40);

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Teléfono");

        txt_phone.setBackground(new java.awt.Color(246, 247, 251));
        txt_phone.setBgShade(new java.awt.Color(255, 255, 255));
        txt_phone.setBgShadeHover(new java.awt.Color(204, 204, 204));
        txt_phone.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txt_phone.setIntensity(0);
        txt_phone.setPhColor(new java.awt.Color(255, 255, 255));
        txt_phone.setPixels(0);
        txt_phone.setPlaceholder("");
        txt_phone.setRound(40);

        txt_direccion.setBackground(new java.awt.Color(246, 247, 251));
        txt_direccion.setBgShade(new java.awt.Color(255, 255, 255));
        txt_direccion.setBgShadeHover(new java.awt.Color(204, 204, 204));
        txt_direccion.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txt_direccion.setIntensity(0);
        txt_direccion.setPhColor(new java.awt.Color(255, 255, 255));
        txt_direccion.setPixels(0);
        txt_direccion.setPlaceholder("");
        txt_direccion.setRound(40);

        jLabel6.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Dirección");

        txt_apellidoPAT.setBackground(new java.awt.Color(246, 247, 251));
        txt_apellidoPAT.setBgShade(new java.awt.Color(255, 255, 255));
        txt_apellidoPAT.setBgShadeHover(new java.awt.Color(204, 204, 204));
        txt_apellidoPAT.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txt_apellidoPAT.setIntensity(0);
        txt_apellidoPAT.setPhColor(new java.awt.Color(255, 255, 255));
        txt_apellidoPAT.setPixels(0);
        txt_apellidoPAT.setPlaceholder("");
        txt_apellidoPAT.setRound(40);

        jLabel11.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Apellido Paterno");

        jLabel17.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Apellido Materno");

        txt_apellidoMAT.setBackground(new java.awt.Color(246, 247, 251));
        txt_apellidoMAT.setBgShade(new java.awt.Color(255, 255, 255));
        txt_apellidoMAT.setBgShadeHover(new java.awt.Color(204, 204, 204));
        txt_apellidoMAT.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txt_apellidoMAT.setIntensity(0);
        txt_apellidoMAT.setPhColor(new java.awt.Color(255, 255, 255));
        txt_apellidoMAT.setPixels(0);
        txt_apellidoMAT.setPlaceholder("");
        txt_apellidoMAT.setRound(40);

        javax.swing.GroupLayout menu_salir1Layout = new javax.swing.GroupLayout(menu_salir1);
        menu_salir1.setLayout(menu_salir1Layout);
        menu_salir1Layout.setHorizontalGroup(
            menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
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
                    .addComponent(txt_apellidoMAT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jLabel8.setText("Servicio a Atender:");

        cbx_servicio.setForeground(new java.awt.Color(51, 51, 51));
        cbx_servicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija una Opcion.", "RSItem 2", "RSItem 3", "RSItem 4" }));
        cbx_servicio.setColorMaterial(new java.awt.Color(10, 117, 167));
        cbx_servicio.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        cbx_servicio.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        cbx_servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_servicioActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        jLabel5.setText("Estado: ");

        chx_estado.setForeground(new java.awt.Color(0, 0, 0));
        chx_estado.setText(" Activo");
        chx_estado.setColorCheck(new java.awt.Color(3, 111, 198));
        chx_estado.setColorUnCheck(new java.awt.Color(3, 111, 198));
        chx_estado.setFocusPainted(false);
        chx_estado.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        chx_estado.setRippleColor(new java.awt.Color(3, 111, 198));

        javax.swing.GroupLayout menu_salir2Layout = new javax.swing.GroupLayout(menu_salir2);
        menu_salir2.setLayout(menu_salir2Layout);
        menu_salir2Layout.setHorizontalGroup(
            menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir2Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chx_estado, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(cbx_servicio, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        menu_salir2Layout.setVerticalGroup(
            menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_salir2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbx_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chx_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(29, 29, 29))
        );

        menu_salir3.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir3.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir3.setPixels(0);
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
        table_especialista.setFont(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        table_especialista.setFuenteFilas(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        table_especialista.setFuenteFilasSelect(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        table_especialista.setFuenteHead(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        table_especialista.setGridColor(new java.awt.Color(204, 204, 204));
        table_especialista.setGrosorBordeFilas(-1);
        table_especialista.setGrosorBordeHead(-1);
        table_especialista.setOpaque(false);
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        p1.setBackground(new java.awt.Color(204, 204, 204));
        p1.setBgShade(new java.awt.Color(255, 255, 255));
        p1.setColorPrimario(new java.awt.Color(200, 232, 250));
        p1.setColorSecundario(new java.awt.Color(200, 232, 250));
        p1.setGradiente(RSMaterialComponent.RSPanelBorderGradient.Gradiente.HORIZONTAL);
        p1.setRound(40);
        p1.setWidthBorder(0);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-doctor-en-medicina-100.png"))); // NOI18N

        btn_nuevo_especialista.setBackground(new java.awt.Color(139, 198, 255));
        btn_nuevo_especialista.setForeground(new java.awt.Color(51, 51, 51));
        btn_nuevo_especialista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-documentos-24.png"))); // NOI18N
        btn_nuevo_especialista.setText("Nuevo Especialista");
        btn_nuevo_especialista.setBorderPainted(false);
        btn_nuevo_especialista.setContentAreaFilled(true);
        btn_nuevo_especialista.setCornerRound(45);
        btn_nuevo_especialista.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_nuevo_especialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevo_especialistaActionPerformed(evt);
            }
        });

        btn_guardar_especialista.setBackground(new java.awt.Color(139, 198, 255));
        btn_guardar_especialista.setForeground(new java.awt.Color(51, 51, 51));
        btn_guardar_especialista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-guardar-24.png"))); // NOI18N
        btn_guardar_especialista.setText("Guardar Especialista");
        btn_guardar_especialista.setBorderPainted(false);
        btn_guardar_especialista.setContentAreaFilled(true);
        btn_guardar_especialista.setCornerRound(45);
        btn_guardar_especialista.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_guardar_especialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_especialistaActionPerformed(evt);
            }
        });

        btn_modificar_especialista.setBackground(new java.awt.Color(139, 198, 255));
        btn_modificar_especialista.setForeground(new java.awt.Color(51, 51, 51));
        btn_modificar_especialista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-crear-nuevo-24.png"))); // NOI18N
        btn_modificar_especialista.setText("Modificar Especialista");
        btn_modificar_especialista.setBorderPainted(false);
        btn_modificar_especialista.setContentAreaFilled(true);
        btn_modificar_especialista.setCornerRound(45);
        btn_modificar_especialista.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_modificar_especialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_especialistaActionPerformed(evt);
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

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 38)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Especialista");

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(81, 81, 81))
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_cancelar_cambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_nuevo_especialista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modificar_especialista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardar_especialista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addContainerGap())
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(btn_nuevo_especialista, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_guardar_especialista, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_modificar_especialista, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_cancelar_cambios, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu_salir2, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                    .addComponent(menu_salir3, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                    .addComponent(menu_salir1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(menu_salir1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_salir2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_salir3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_servicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_servicioActionPerformed

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
        btn_buscar_reniec.setEnabled(true);
        
        txt_dni.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevo_especialistaActionPerformed

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

    private void btn_cancelar_cambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_cambiosActionPerformed
  limpiar();     
    }//GEN-LAST:event_btn_cancelar_cambiosActionPerformed

    private void btn_buscar_reniecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_reniecActionPerformed
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
        }               // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscar_reniecActionPerformed
 boolean modificar = true;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btn_buscar_reniec;
    private newscomponents.RSButtonFlat_new btn_cancelar_cambios;
    private newscomponents.RSButtonFlat_new btn_guardar_especialista;
    private newscomponents.RSButtonFlat_new btn_modificar_especialista;
    private newscomponents.RSButtonFlat_new btn_nuevo_especialista;
    private RSMaterialComponent.RSComboBoxMaterial cbx_servicio;
    private RSMaterialComponent.RSCheckBoxMaterial chx_estado;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private RSMaterialComponent.RSPanelMaterial menu_salir1;
    private RSMaterialComponent.RSPanelMaterial menu_salir2;
    private RSMaterialComponent.RSPanelMaterial menu_salir3;
    private RSMaterialComponent.RSPanelBorderGradient p1;
    private rojerusan.RSTableMetro table_especialista;
    private rscomponentshade.RSFormatFieldShade txt_apellidoMAT;
    private rscomponentshade.RSFormatFieldShade txt_apellidoPAT;
    private rscomponentshade.RSFormatFieldShade txt_direccion;
    private rscomponentshade.RSFormatFieldShade txt_dni;
    private rscomponentshade.RSFormatFieldShade txt_name;
    private rscomponentshade.RSFormatFieldShade txt_phone;
    // End of variables declaration//GEN-END:variables

private void limpiar() {
        txt_apellidoMAT.setEnabled(false);
        txt_apellidoPAT.setEnabled(false);
        txt_direccion.setEnabled(false);
        
        txt_dni.setEnabled(false);
        txt_name.setEnabled(false);
        txt_phone.setEnabled(false);
        btn_buscar_reniec.setEnabled(false);
        
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
