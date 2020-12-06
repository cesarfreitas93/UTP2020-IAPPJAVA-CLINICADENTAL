
package WIN33CLC_VIEW;

import WIN30CLC_DAO.DaoException;
import WIN31CLC_DTO.Service;
import WIN32CLC_CTR.CTR_03_Service;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;


public class frm_UI_05_servicios extends javax.swing.JPanel {
    CTR_03_Service cTR_03_Service;
    boolean modificar = false;
    
    
    public frm_UI_05_servicios() {
        initComponents();
        
     cTR_03_Service = new CTR_03_Service();
        btn_nuevo_servicios.setEnabled(true);
        btn_guardar_servicio.setEnabled(false);
        btn_cancelar_cambios.setEnabled(false);
        btn_modificar_servicio.setEnabled(false);
        LoadData();
        setBackground(new Color (255,255,255,1));
   
       
    }
    public void ocultar_form_servicios
        (boolean b)
    {
    menu_salir1.setVisible(b);
    menu_salir3.setVisible(b);
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
          
            this.table_services.setModel(cTR_03_Service.ListService());
            this.table_services.getSelectionModel().addListSelectionListener(e -> {
                boolean seleccionValid = (table_services.getSelectedRow() != -1);
                //btnEdit.setEnabled(seleccionValid);
                //btnDelete.setEnabled(seleccionValid);
            });
        } catch (DaoException ex) {
           // Logger.getLogger(frm_02_Patient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
         //   Logger.getLogger(frm_02_Patient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.table_services.setDefaultRenderer(JButton.class, new TableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object objeto, boolean estaSeleccionado, boolean tieneElFoco, int fila, int columna) {
                return (Component) objeto;
            }
        });
        
        this.table_services.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = table_services.rowAtPoint(e.getPoint());
                int columna = table_services.columnAtPoint(e.getPoint());
                
                System.out.println("click");
                //setEditable(true);
                
                if (table_services.getModel().getColumnClass(columna).equals(JButton.class)) {
     
                    try {
                        cTR_03_Service.DeleteService((long) table_services.getModel().getValueAt(fila, 0));
                        btn_modificar_servicio.setEnabled(false);
                        btn_cancelar_cambios.setEnabled(false);
                        btn_guardar_servicio.setEnabled(false);
                        table_services.setModel(cTR_03_Service.ListService());

                    } catch (DaoException ex) {
                        Logger.getLogger(frm_05_servicios.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(frm_05_servicios.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }else
                {
                //if (!table_services.getModel().getColumnClass(0).equals(JButton.class)) {
                    setId((long) table_services.getModel().getValueAt(fila, 0));
                    btn_modificar_servicio.setEnabled(true);
                }
                
            }
            
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu_salir1 = new RSMaterialComponent.RSPanelMaterial();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        chk_estado = new RSMaterialComponent.RSCheckBoxMaterial();
        txt_nombre_servicio = new rscomponentshade.RSFormatFieldShade();
        txt_precio_servicio = new rscomponentshade.RSFormatFieldShade();
        menu_salir3 = new RSMaterialComponent.RSPanelMaterial();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_services = new rojerusan.RSTableMetro();
        rSPanelBorderGradient1 = new RSMaterialComponent.RSPanelBorderGradient();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_nuevo_servicios = new newscomponents.RSButtonFlat_new();
        btn_guardar_servicio = new newscomponents.RSButtonFlat_new();
        btn_modificar_servicio = new newscomponents.RSButtonFlat_new();
        btn_cancelar_cambios = new newscomponents.RSButtonFlat_new();

        menu_salir1.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir1.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir1.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir1.setRound(40);

        jLabel10.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Nombre del Servicio:");

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Precio del Producto:");

        chk_estado.setForeground(new java.awt.Color(0, 0, 0));
        chk_estado.setText(" Activo");
        chk_estado.setColorCheck(new java.awt.Color(3, 111, 198));
        chk_estado.setColorUnCheck(new java.awt.Color(3, 111, 198));
        chk_estado.setFocusPainted(false);
        chk_estado.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        chk_estado.setRippleColor(new java.awt.Color(3, 111, 198));

        txt_nombre_servicio.setBackground(new java.awt.Color(246, 247, 251));
        txt_nombre_servicio.setBgShade(new java.awt.Color(255, 255, 255));
        txt_nombre_servicio.setBgShadeHover(new java.awt.Color(255, 255, 255));
        txt_nombre_servicio.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_nombre_servicio.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_nombre_servicio.setDoubleBuffered(true);
        txt_nombre_servicio.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txt_nombre_servicio.setIntensity(0);
        txt_nombre_servicio.setPhColor(new java.awt.Color(255, 255, 255));
        txt_nombre_servicio.setPixels(0);
        txt_nombre_servicio.setPlaceholder("");
        txt_nombre_servicio.setRound(40);

        txt_precio_servicio.setBackground(new java.awt.Color(246, 247, 251));
        txt_precio_servicio.setBgShade(new java.awt.Color(255, 255, 255));
        txt_precio_servicio.setBgShadeHover(new java.awt.Color(255, 255, 255));
        txt_precio_servicio.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_precio_servicio.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_precio_servicio.setDoubleBuffered(true);
        txt_precio_servicio.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txt_precio_servicio.setIntensity(0);
        txt_precio_servicio.setPhColor(new java.awt.Color(255, 255, 255));
        txt_precio_servicio.setPixels(0);
        txt_precio_servicio.setPlaceholder("");
        txt_precio_servicio.setRound(40);

        javax.swing.GroupLayout menu_salir1Layout = new javax.swing.GroupLayout(menu_salir1);
        menu_salir1.setLayout(menu_salir1Layout);
        menu_salir1Layout.setHorizontalGroup(
            menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir1Layout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_salir1Layout.createSequentialGroup()
                        .addComponent(txt_precio_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(63, 63, 63)
                        .addComponent(chk_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_nombre_servicio, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        menu_salir1Layout.setVerticalGroup(
            menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nombre_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_precio_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        menu_salir3.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir3.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir3.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir3.setRound(40);

        table_services.setForeground(new java.awt.Color(74, 74, 74));
        table_services.setModel(new javax.swing.table.DefaultTableModel(
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
        table_services.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        table_services.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        table_services.setColorFilasForeground2(new java.awt.Color(74, 74, 74));
        table_services.setFont(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        table_services.setFuenteFilas(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        table_services.setFuenteFilasSelect(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        table_services.setFuenteHead(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        table_services.setGridColor(new java.awt.Color(153, 153, 153));
        table_services.setGrosorBordeFilas(0);
        table_services.setGrosorBordeHead(0);
        table_services.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(table_services);

        javax.swing.GroupLayout menu_salir3Layout = new javax.swing.GroupLayout(menu_salir3);
        menu_salir3.setLayout(menu_salir3Layout);
        menu_salir3Layout.setHorizontalGroup(
            menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                .addContainerGap())
        );
        menu_salir3Layout.setVerticalGroup(
            menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        rSPanelBorderGradient1.setBackground(new java.awt.Color(204, 204, 204));
        rSPanelBorderGradient1.setBgShade(new java.awt.Color(255, 255, 255));
        rSPanelBorderGradient1.setColorPrimario(new java.awt.Color(200, 232, 250));
        rSPanelBorderGradient1.setColorSecundario(new java.awt.Color(200, 232, 250));
        rSPanelBorderGradient1.setGradiente(RSMaterialComponent.RSPanelBorderGradient.Gradiente.HORIZONTAL);
        rSPanelBorderGradient1.setRound(40);
        rSPanelBorderGradient1.setWidthBorder(0);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-maletín-médico-100.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Poppins ExtraBold", 0, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("SERVICIOS");

        btn_nuevo_servicios.setBackground(new java.awt.Color(139, 198, 255));
        btn_nuevo_servicios.setForeground(new java.awt.Color(51, 51, 51));
        btn_nuevo_servicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-calendario-menos-24.png"))); // NOI18N
        btn_nuevo_servicios.setText("Nuevo Servicio");
        btn_nuevo_servicios.setBorderPainted(false);
        btn_nuevo_servicios.setContentAreaFilled(true);
        btn_nuevo_servicios.setCornerRound(45);
        btn_nuevo_servicios.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_nuevo_servicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevo_serviciosActionPerformed(evt);
            }
        });

        btn_guardar_servicio.setBackground(new java.awt.Color(139, 198, 255));
        btn_guardar_servicio.setForeground(new java.awt.Color(51, 51, 51));
        btn_guardar_servicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-horas-extras-24.png"))); // NOI18N
        btn_guardar_servicio.setText("Guardar Servicio");
        btn_guardar_servicio.setBorderPainted(false);
        btn_guardar_servicio.setContentAreaFilled(true);
        btn_guardar_servicio.setCornerRound(45);
        btn_guardar_servicio.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_guardar_servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_servicioActionPerformed(evt);
            }
        });

        btn_modificar_servicio.setBackground(new java.awt.Color(139, 198, 255));
        btn_modificar_servicio.setForeground(new java.awt.Color(51, 51, 51));
        btn_modificar_servicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/cancelar.png"))); // NOI18N
        btn_modificar_servicio.setText("Modificar Servicio");
        btn_modificar_servicio.setBorderPainted(false);
        btn_modificar_servicio.setContentAreaFilled(true);
        btn_modificar_servicio.setCornerRound(45);
        btn_modificar_servicio.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_modificar_servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_servicioActionPerformed(evt);
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

        javax.swing.GroupLayout rSPanelBorderGradient1Layout = new javax.swing.GroupLayout(rSPanelBorderGradient1);
        rSPanelBorderGradient1.setLayout(rSPanelBorderGradient1Layout);
        rSPanelBorderGradient1Layout.setHorizontalGroup(
            rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelBorderGradient1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelBorderGradient1Layout.createSequentialGroup()
                        .addGroup(rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel12))
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelBorderGradient1Layout.createSequentialGroup()
                        .addGroup(rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_nuevo_servicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_modificar_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_guardar_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cancelar_cambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))))
        );
        rSPanelBorderGradient1Layout.setVerticalGroup(
            rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelBorderGradient1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(113, 113, 113)
                .addComponent(btn_nuevo_servicios, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_guardar_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_modificar_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_cancelar_cambios, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rSPanelBorderGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu_salir3, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                    .addComponent(menu_salir1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(menu_salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(menu_salir3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 73, Short.MAX_VALUE))
            .addComponent(rSPanelBorderGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nuevo_serviciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevo_serviciosActionPerformed
 btn_nuevo_servicios.setEnabled(false);
        btn_guardar_servicio.setEnabled(true);
        btn_cancelar_cambios.setEnabled(true);
        btn_modificar_servicio.setEnabled(false);
        modificar = false;
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevo_serviciosActionPerformed

    private void btn_guardar_servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_servicioActionPerformed
 
        try {
            Service servicio_dto = new Service();
            servicio_dto.setName(txt_nombre_servicio.getText().trim());
            double precio = (double) Double.parseDouble(txt_precio_servicio.getText());
            servicio_dto.setPrice(precio);
            boolean es_activo = chk_estado.isSelected();
            servicio_dto.setEnable(es_activo);
            
            if(modificar)
            {
                try {
                    //modificar
                    servicio_dto.setId(getId());
                    cTR_03_Service.update(servicio_dto);
                    txt_nombre_servicio.setText("");
                    txt_precio_servicio.setText("");
                    chk_estado.setSelected(false);
                } catch (SQLException ex) {
                    Logger.getLogger(frm_05_servicios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else
            {
                try {
                    
                    cTR_03_Service.insert(servicio_dto);
                    txt_nombre_servicio.setText("");
                    txt_precio_servicio.setText("");
                    chk_estado.setSelected(false);
                    //
                    //actualizar la tabla de abajito
                    
                } catch (SQLException ex) {
                    Logger.getLogger(frm_05_servicios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            table_services.setModel(cTR_03_Service.ListService());
            btn_guardar_servicio.setEnabled(false);
            setId(0);
            btn_cancelar_cambios.setEnabled(false);
            btn_modificar_servicio.setEnabled(false);
            btn_nuevo_servicios.setEnabled(true);
        } catch (DaoException ex) {
            Logger.getLogger(frm_05_servicios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frm_05_servicios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                    // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardar_servicioActionPerformed

    private void btn_modificar_servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar_servicioActionPerformed
 try {
            // TODO add your handling code here:
            Service dto = new Service();
            dto = cTR_03_Service.SelectService(getId());
            
            txt_nombre_servicio.setText(dto.getName());
            txt_precio_servicio.setText(Double.toString(dto.getPrice())); // convertir
            chk_estado.setSelected(dto.isEnable());
            
            btn_modificar_servicio.setEnabled(false);
            btn_guardar_servicio.setEnabled(true);
            btn_cancelar_cambios.setEnabled(true);
            btn_nuevo_servicios.setEnabled(false);
            modificar = true;
            
        } catch (SQLException ex) {
            Logger.getLogger(frm_05_servicios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DaoException ex) {
            Logger.getLogger(frm_05_servicios.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modificar_servicioActionPerformed

    private void btn_cancelar_cambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_cambiosActionPerformed
    btn_guardar_servicio.setEnabled(false);
        btn_cancelar_cambios.setEnabled(false);
        btn_modificar_servicio.setEnabled(false);
        btn_nuevo_servicios.setEnabled(true);
        setId(0);
        modificar = false;
        
        txt_nombre_servicio.setText("");
        txt_precio_servicio.setText("");
        chk_estado.setSelected(false);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelar_cambiosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btn_cancelar_cambios;
    private newscomponents.RSButtonFlat_new btn_guardar_servicio;
    private newscomponents.RSButtonFlat_new btn_modificar_servicio;
    private newscomponents.RSButtonFlat_new btn_nuevo_servicios;
    private RSMaterialComponent.RSCheckBoxMaterial chk_estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private RSMaterialComponent.RSPanelMaterial menu_salir1;
    private RSMaterialComponent.RSPanelMaterial menu_salir3;
    private RSMaterialComponent.RSPanelBorderGradient rSPanelBorderGradient1;
    private rojerusan.RSTableMetro table_services;
    private rscomponentshade.RSFormatFieldShade txt_nombre_servicio;
    private rscomponentshade.RSFormatFieldShade txt_precio_servicio;
    // End of variables declaration//GEN-END:variables
}
