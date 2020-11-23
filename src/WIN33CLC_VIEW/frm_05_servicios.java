
package WIN33CLC_VIEW;


public class frm_05_servicios extends javax.swing.JPanel {

    public frm_05_servicios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_contenedor_servicios = new javax.swing.JPanel();
        fSGradientPanel1 = new LIB.FSGradientPanel();
        jLabel13 = new javax.swing.JLabel();
        btn_guardar_servicio = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_cancelar_cambios1 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_modificar_servicio = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_nuevo_servicio = new RSMaterialComponent.RSButtonMaterialGradientOne();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_precio_servicio = new rojerusan.RSMetroTextFullPlaceHolder();
        txt_nombre_servicio = new rojerusan.RSMetroTextFullPlaceHolder();
        chk_estado = new RSMaterialComponent.RSCheckBoxMaterial();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_services = new rojerusan.RSTableMetro();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_contenedor_servicios.setBackground(new java.awt.Color(255, 255, 255));
        panel_contenedor_servicios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fSGradientPanel1.setFSEndColor(new java.awt.Color(3, 111, 198));
        fSGradientPanel1.setFSStartColor(new java.awt.Color(101, 208, 250));
        fSGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-maletín-médico-100.png"))); // NOI18N
        fSGradientPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 110, 90));

        btn_guardar_servicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-guardar-como-30.png"))); // NOI18N
        btn_guardar_servicio.setText("Guardar Servicio");
        btn_guardar_servicio.setBorderPainted(false);
        btn_guardar_servicio.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn_guardar_servicio.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn_guardar_servicio.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn_guardar_servicio.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn_guardar_servicio.setFocusPainted(false);
        btn_guardar_servicio.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        btn_guardar_servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_servicioActionPerformed(evt);
            }
        });
        fSGradientPanel1.add(btn_guardar_servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 210, -1));

        btn_cancelar_cambios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-cancelar-30.png"))); // NOI18N
        btn_cancelar_cambios1.setText("Cancelar Cambios");
        btn_cancelar_cambios1.setBorderPainted(false);
        btn_cancelar_cambios1.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn_cancelar_cambios1.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn_cancelar_cambios1.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn_cancelar_cambios1.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn_cancelar_cambios1.setFocusPainted(false);
        btn_cancelar_cambios1.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        fSGradientPanel1.add(btn_cancelar_cambios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 210, -1));

        btn_modificar_servicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-editar-archivo-30.png"))); // NOI18N
        btn_modificar_servicio.setText("Modificar Servicio");
        btn_modificar_servicio.setBorderPainted(false);
        btn_modificar_servicio.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn_modificar_servicio.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn_modificar_servicio.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn_modificar_servicio.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn_modificar_servicio.setFocusPainted(false);
        btn_modificar_servicio.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        fSGradientPanel1.add(btn_modificar_servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 210, -1));

        btn_nuevo_servicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-agregar-archivo-30.png"))); // NOI18N
        btn_nuevo_servicio.setText("Nueva Servicio");
        btn_nuevo_servicio.setBorderPainted(false);
        btn_nuevo_servicio.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn_nuevo_servicio.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn_nuevo_servicio.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn_nuevo_servicio.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn_nuevo_servicio.setFocusPainted(false);
        btn_nuevo_servicio.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        btn_nuevo_servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevo_servicioActionPerformed(evt);
            }
        });
        fSGradientPanel1.add(btn_nuevo_servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 210, -1));

        panel_contenedor_servicios.add(fSGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 740));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos lista de Servicios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setText("Nombre del Servicio:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setText("Precio del servicio (s/.):");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txt_precio_servicio.setForeground(new java.awt.Color(0, 0, 0));
        txt_precio_servicio.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_precio_servicio.setBotonColor(new java.awt.Color(3, 111, 198));
        txt_precio_servicio.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txt_precio_servicio.setPlaceholder("");
        jPanel1.add(txt_precio_servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 80, -1));

        txt_nombre_servicio.setForeground(new java.awt.Color(0, 0, 0));
        txt_nombre_servicio.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_nombre_servicio.setBotonColor(new java.awt.Color(3, 111, 198));
        txt_nombre_servicio.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txt_nombre_servicio.setPlaceholder("");
        jPanel1.add(txt_nombre_servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 220, -1));

        chk_estado.setForeground(new java.awt.Color(0, 0, 0));
        chk_estado.setText(" Activo");
        chk_estado.setColorCheck(new java.awt.Color(3, 111, 198));
        chk_estado.setColorUnCheck(new java.awt.Color(3, 111, 198));
        chk_estado.setFocusPainted(false);
        chk_estado.setRippleColor(new java.awt.Color(3, 111, 198));
        jPanel1.add(chk_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 110, -1));

        panel_contenedor_servicios.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 560, 240));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.CardLayout());

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
        table_services.setFuenteFilas(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        table_services.setFuenteFilasSelect(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        table_services.setFuenteHead(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        table_services.setGrosorBordeFilas(0);
        table_services.setGrosorBordeHead(0);
        jScrollPane1.setViewportView(table_services);

        jPanel2.add(jScrollPane1, "card2");

        panel_contenedor_servicios.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 560, 320));

        add(panel_contenedor_servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 740));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardar_servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_servicioActionPerformed
      
    }//GEN-LAST:event_btn_guardar_servicioActionPerformed

    private void btn_nuevo_servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevo_servicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevo_servicioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_cancelar_cambios1;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_guardar_servicio;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_modificar_servicio;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_nuevo_servicio;
    private RSMaterialComponent.RSCheckBoxMaterial chk_estado;
    private LIB.FSGradientPanel fSGradientPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_contenedor_servicios;
    private rojerusan.RSTableMetro table_services;
    private rojerusan.RSMetroTextFullPlaceHolder txt_nombre_servicio;
    private rojerusan.RSMetroTextFullPlaceHolder txt_precio_servicio;
    // End of variables declaration//GEN-END:variables
}
