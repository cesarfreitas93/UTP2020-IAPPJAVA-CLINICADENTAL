/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN33CLC_VIEW;

/**
 *
 * @author LuFraVaPe
 */
public class frm_06_especialistas extends javax.swing.JPanel {

    /**
     * Creates new form frm_06_especialistas
     */
    public frm_06_especialistas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_contenedor = new javax.swing.JPanel();
        fSGradientPanel1 = new LIB.FSGradientPanel();
        jLabel13 = new javax.swing.JLabel();
        btn_guardar_especialista = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_cancelar_cambios = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_modificar_especialista = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_nuevo_especialista = new RSMaterialComponent.RSButtonMaterialGradientOne();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_buscar_reniec_especialista = new RSMaterialComponent.RSButtonMaterialGradientOne();
        txt_dni = new rojerusan.RSMetroTextFullPlaceHolder();
        txt_apellidoMAT = new rojerusan.RSMetroTextFullPlaceHolder();
        txt_phone = new rojerusan.RSMetroTextFullPlaceHolder();
        txt_direccion = new rojerusan.RSMetroTextFullPlaceHolder();
        txt_name = new rojerusan.RSMetroTextFullPlaceHolder();
        txt_apellidoPAT = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        chx_estado = new RSMaterialComponent.RSCheckBoxMaterial();
        cbx_servicio = new RSMaterialComponent.RSComboBoxMaterial();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_especialista = new rojerusan.RSTableMetro();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout());

        panel_contenedor.setBackground(new java.awt.Color(255, 255, 255));
        panel_contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fSGradientPanel1.setFSEndColor(new java.awt.Color(3, 111, 198));
        fSGradientPanel1.setFSStartColor(new java.awt.Color(101, 208, 250));
        fSGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-doctor-en-medicina-100.png"))); // NOI18N
        fSGradientPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 110, 90));

        btn_guardar_especialista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-guardar-como-30.png"))); // NOI18N
        btn_guardar_especialista.setText("Guardar Especialista");
        btn_guardar_especialista.setBorderPainted(false);
        btn_guardar_especialista.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn_guardar_especialista.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn_guardar_especialista.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn_guardar_especialista.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn_guardar_especialista.setFocusPainted(false);
        btn_guardar_especialista.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        btn_guardar_especialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_especialistaActionPerformed(evt);
            }
        });
        fSGradientPanel1.add(btn_guardar_especialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 220, -1));

        btn_cancelar_cambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-cancelar-30.png"))); // NOI18N
        btn_cancelar_cambios.setText("Cancelar Cambios");
        btn_cancelar_cambios.setBorderPainted(false);
        btn_cancelar_cambios.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn_cancelar_cambios.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn_cancelar_cambios.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn_cancelar_cambios.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn_cancelar_cambios.setFocusPainted(false);
        btn_cancelar_cambios.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        fSGradientPanel1.add(btn_cancelar_cambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 220, -1));

        btn_modificar_especialista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-editar-archivo-30.png"))); // NOI18N
        btn_modificar_especialista.setText("Modificar Especialista");
        btn_modificar_especialista.setBorderPainted(false);
        btn_modificar_especialista.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn_modificar_especialista.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn_modificar_especialista.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn_modificar_especialista.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn_modificar_especialista.setFocusPainted(false);
        btn_modificar_especialista.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        fSGradientPanel1.add(btn_modificar_especialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 220, -1));

        btn_nuevo_especialista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-documentos-30.png"))); // NOI18N
        btn_nuevo_especialista.setText("Nuev8 Especialista");
        btn_nuevo_especialista.setBorderPainted(false);
        btn_nuevo_especialista.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn_nuevo_especialista.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn_nuevo_especialista.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn_nuevo_especialista.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn_nuevo_especialista.setFocusPainted(false);
        btn_nuevo_especialista.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        btn_nuevo_especialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevo_especialistaActionPerformed(evt);
            }
        });
        fSGradientPanel1.add(btn_nuevo_especialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 220, -1));

        panel_contenedor.add(fSGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 740));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Especialista", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setText("Teléfono");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("DNI");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setText("Apellido Paterno");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setText("Direccion");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setText("Apellido Materno");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));

        btn_buscar_reniec_especialista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-encuentra-hombre-usuario-30.png"))); // NOI18N
        btn_buscar_reniec_especialista.setText("Buscar en Reniec");
        btn_buscar_reniec_especialista.setBorderPainted(false);
        btn_buscar_reniec_especialista.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn_buscar_reniec_especialista.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn_buscar_reniec_especialista.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn_buscar_reniec_especialista.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn_buscar_reniec_especialista.setFocusPainted(false);
        btn_buscar_reniec_especialista.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        btn_buscar_reniec_especialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_reniec_especialistaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_buscar_reniec_especialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 220, -1));

        txt_dni.setForeground(new java.awt.Color(0, 0, 0));
        txt_dni.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_dni.setBotonColor(new java.awt.Color(3, 111, 198));
        txt_dni.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txt_dni.setPlaceholder("");
        jPanel1.add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 150, -1));

        txt_apellidoMAT.setForeground(new java.awt.Color(0, 0, 0));
        txt_apellidoMAT.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_apellidoMAT.setBotonColor(new java.awt.Color(3, 111, 198));
        txt_apellidoMAT.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txt_apellidoMAT.setPlaceholder("");
        jPanel1.add(txt_apellidoMAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 170, -1));

        txt_phone.setForeground(new java.awt.Color(0, 0, 0));
        txt_phone.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_phone.setBotonColor(new java.awt.Color(3, 111, 198));
        txt_phone.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txt_phone.setPlaceholder("");
        jPanel1.add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 170, -1));

        txt_direccion.setForeground(new java.awt.Color(0, 0, 0));
        txt_direccion.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_direccion.setBotonColor(new java.awt.Color(3, 111, 198));
        txt_direccion.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txt_direccion.setPlaceholder("");
        jPanel1.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 380, -1));

        txt_name.setForeground(new java.awt.Color(0, 0, 0));
        txt_name.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_name.setBotonColor(new java.awt.Color(3, 111, 198));
        txt_name.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txt_name.setPlaceholder("");
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 170, -1));

        txt_apellidoPAT.setForeground(new java.awt.Color(0, 0, 0));
        txt_apellidoPAT.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_apellidoPAT.setBotonColor(new java.awt.Color(3, 111, 198));
        txt_apellidoPAT.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txt_apellidoPAT.setPlaceholder("");
        jPanel1.add(txt_apellidoPAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 170, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("Nombres");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        panel_contenedor.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 720, 370));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones del Especialista", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15))); // NOI18N

        chx_estado.setForeground(new java.awt.Color(0, 0, 0));
        chx_estado.setText(" Activo");
        chx_estado.setColorCheck(new java.awt.Color(3, 111, 198));
        chx_estado.setColorUnCheck(new java.awt.Color(3, 111, 198));
        chx_estado.setFocusPainted(false);
        chx_estado.setRippleColor(new java.awt.Color(3, 111, 198));

        cbx_servicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escoga un servicio.", "RSItem 2", "RSItem 3", "RSItem 4" }));
        cbx_servicio.setColorMaterial(new java.awt.Color(3, 111, 198));
        cbx_servicio.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setText("Estado: ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setText("Servicio:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(chx_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jLabel8)
                .addGap(27, 27, 27)
                .addComponent(cbx_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chx_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel8)))
                .addGap(28, 28, 28))
        );

        panel_contenedor.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 720, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.CardLayout());

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
        table_especialista.setFuenteFilas(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        table_especialista.setFuenteFilasSelect(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        table_especialista.setFuenteHead(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        table_especialista.setGrosorBordeFilas(0);
        table_especialista.setGrosorBordeHead(0);
        jScrollPane1.setViewportView(table_especialista);

        jPanel3.add(jScrollPane1, "card2");

        panel_contenedor.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, 720, 190));

        add(panel_contenedor, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardar_especialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_especialistaActionPerformed

    }//GEN-LAST:event_btn_guardar_especialistaActionPerformed

    private void btn_buscar_reniec_especialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_reniec_especialistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscar_reniec_especialistaActionPerformed

    private void btn_nuevo_especialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevo_especialistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevo_especialistaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_buscar_reniec_especialista;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_cancelar_cambios;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_guardar_especialista;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_modificar_especialista;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_nuevo_especialista;
    private RSMaterialComponent.RSComboBoxMaterial cbx_servicio;
    private RSMaterialComponent.RSCheckBoxMaterial chx_estado;
    private LIB.FSGradientPanel fSGradientPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_contenedor;
    private rojerusan.RSTableMetro table_especialista;
    private rojerusan.RSMetroTextFullPlaceHolder txt_apellidoMAT;
    private rojerusan.RSMetroTextFullPlaceHolder txt_apellidoPAT;
    private rojerusan.RSMetroTextFullPlaceHolder txt_direccion;
    private rojerusan.RSMetroTextFullPlaceHolder txt_dni;
    private rojerusan.RSMetroTextFullPlaceHolder txt_name;
    private rojerusan.RSMetroTextFullPlaceHolder txt_phone;
    // End of variables declaration//GEN-END:variables
}