
package WIN33CLC_VIEW;

import javax.swing.JFrame;


public class frm_04_comprobantes extends javax.swing.JPanel {

  
    public frm_04_comprobantes() {
        initComponents();
    }

  public void deshabilitar_form_comprobantes(boolean b)
  {
      panel_contenedor.setVisible(b);
  }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_tipo = new javax.swing.ButtonGroup();
        panel_contenedor = new javax.swing.JPanel();
        fSGradientPanel1 = new LIB.FSGradientPanel();
        jLabel13 = new javax.swing.JLabel();
        btn_guardar_comprobante = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_cancelar_cambios1 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_modificar_comprobante = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_nuevo_comprobante = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_cancelar_cambios2 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        jPanel1 = new javax.swing.JPanel();
        rSCheckBoxMaterial1 = new RSMaterialComponent.RSCheckBoxMaterial();
        rSCheckBoxMaterial2 = new RSMaterialComponent.RSCheckBoxMaterial();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_buscar_paciente = new RSMaterialComponent.RSButtonMaterialGradientOne();
        jLabel2 = new javax.swing.JLabel();
        lbl_nombre_paciente = new javax.swing.JLabel();
        txt_paciente1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_ruc = new rojerusan.RSMetroTextPlaceHolder();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_citas = new rojerusan.RSTableMetro();
        jPanel5 = new javax.swing.JPanel();
        rSCheckBoxMaterial3 = new RSMaterialComponent.RSCheckBoxMaterial();
        jLabel4 = new javax.swing.JLabel();
        txt_total_pagar = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_contenedor.setBackground(new java.awt.Color(255, 255, 255));
        panel_contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fSGradientPanel1.setFSEndColor(new java.awt.Color(3, 111, 198));
        fSGradientPanel1.setFSStartColor(new java.awt.Color(101, 208, 250));
        fSGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-factura-100.png"))); // NOI18N
        fSGradientPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 120, 110));

        btn_guardar_comprobante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-pagado-30.png"))); // NOI18N
        btn_guardar_comprobante.setText("Pagar Comprobante");
        btn_guardar_comprobante.setBorderPainted(false);
        btn_guardar_comprobante.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn_guardar_comprobante.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn_guardar_comprobante.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn_guardar_comprobante.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn_guardar_comprobante.setFocusPainted(false);
        btn_guardar_comprobante.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        btn_guardar_comprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_comprobanteActionPerformed(evt);
            }
        });
        fSGradientPanel1.add(btn_guardar_comprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 230, -1));

        btn_cancelar_cambios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-cancelar-30.png"))); // NOI18N
        btn_cancelar_cambios1.setText("Cancelar Cambios");
        btn_cancelar_cambios1.setBorderPainted(false);
        btn_cancelar_cambios1.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn_cancelar_cambios1.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn_cancelar_cambios1.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn_cancelar_cambios1.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn_cancelar_cambios1.setFocusPainted(false);
        btn_cancelar_cambios1.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        fSGradientPanel1.add(btn_cancelar_cambios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 210, -1));

        btn_modificar_comprobante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-editar-propiedad-30.png"))); // NOI18N
        btn_modificar_comprobante.setText("Modificar Comprobante");
        btn_modificar_comprobante.setBorderPainted(false);
        btn_modificar_comprobante.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn_modificar_comprobante.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn_modificar_comprobante.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn_modificar_comprobante.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn_modificar_comprobante.setFocusPainted(false);
        btn_modificar_comprobante.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        fSGradientPanel1.add(btn_modificar_comprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 250, -1));

        btn_nuevo_comprobante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-agregar-recibo-30.png"))); // NOI18N
        btn_nuevo_comprobante.setText("Nuevo Comprobante");
        btn_nuevo_comprobante.setBorderPainted(false);
        btn_nuevo_comprobante.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn_nuevo_comprobante.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn_nuevo_comprobante.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn_nuevo_comprobante.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn_nuevo_comprobante.setFocusPainted(false);
        btn_nuevo_comprobante.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        btn_nuevo_comprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevo_comprobanteActionPerformed(evt);
            }
        });
        fSGradientPanel1.add(btn_nuevo_comprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 230, -1));

        btn_cancelar_cambios2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-imprimir-30.png"))); // NOI18N
        btn_cancelar_cambios2.setText("Imprimir Comprobante");
        btn_cancelar_cambios2.setBorderPainted(false);
        btn_cancelar_cambios2.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn_cancelar_cambios2.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn_cancelar_cambios2.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn_cancelar_cambios2.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn_cancelar_cambios2.setFocusPainted(false);
        btn_cancelar_cambios2.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        fSGradientPanel1.add(btn_cancelar_cambios2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 250, -1));

        panel_contenedor.add(fSGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 740));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de Comprobante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15))); // NOI18N

        bg_tipo.add(rSCheckBoxMaterial1);
        rSCheckBoxMaterial1.setForeground(new java.awt.Color(0, 0, 0));
        rSCheckBoxMaterial1.setText("  Factura");
        rSCheckBoxMaterial1.setColorCheck(new java.awt.Color(3, 111, 198));
        rSCheckBoxMaterial1.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rSCheckBoxMaterial1.setFocusPainted(false);
        rSCheckBoxMaterial1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        bg_tipo.add(rSCheckBoxMaterial2);
        rSCheckBoxMaterial2.setForeground(new java.awt.Color(0, 0, 0));
        rSCheckBoxMaterial2.setText("   Boleta");
        rSCheckBoxMaterial2.setBorderPaintedFlat(true);
        rSCheckBoxMaterial2.setColorCheck(new java.awt.Color(3, 111, 198));
        rSCheckBoxMaterial2.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rSCheckBoxMaterial2.setFocusPainted(false);
        rSCheckBoxMaterial2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(rSCheckBoxMaterial2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(rSCheckBoxMaterial1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSCheckBoxMaterial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSCheckBoxMaterial2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_contenedor.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 710, 80));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("DNI");

        txt_buscar_paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-encuentra-hombre-usuario-30.png"))); // NOI18N
        txt_buscar_paciente.setText("Buscar Paciente");
        txt_buscar_paciente.setBorderPainted(false);
        txt_buscar_paciente.setColorPrimario(new java.awt.Color(42, 170, 232));
        txt_buscar_paciente.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        txt_buscar_paciente.setColorSecundario(new java.awt.Color(3, 102, 183));
        txt_buscar_paciente.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        txt_buscar_paciente.setFocusPainted(false);
        txt_buscar_paciente.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 16)); // NOI18N
        txt_buscar_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscar_pacienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        jLabel2.setText("PACIENTE: ");

        lbl_nombre_paciente.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbl_nombre_paciente.setText("jLabel3");

        txt_paciente1.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txt_paciente1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        txt_paciente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_paciente1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(txt_paciente1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_buscar_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_nombre_paciente))
                .addContainerGap(212, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_buscar_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_paciente1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbl_nombre_paciente))
                .addGap(19, 19, 19))
        );

        panel_contenedor.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del comprobante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setText("RUC:");

        txt_ruc.setForeground(new java.awt.Color(0, 0, 0));
        txt_ruc.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_ruc.setBotonColor(new java.awt.Color(3, 111, 198));
        txt_ruc.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txt_ruc.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_ruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(368, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_ruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panel_contenedor.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 710, 110));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de Citas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15))); // NOI18N

        tabla_citas.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla_citas.setColorBackgoundHead(new java.awt.Color(3, 111, 198));
        tabla_citas.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tabla_citas.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tabla_citas.setColorFilasForeground2(new java.awt.Color(255, 255, 255));
        tabla_citas.setFuenteFilas(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        tabla_citas.setFuenteFilasSelect(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        tabla_citas.setFuenteHead(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        tabla_citas.setGrosorBordeFilas(0);
        tabla_citas.setGrosorBordeHead(0);
        tabla_citas.setInheritsPopupMenu(true);
        jScrollPane1.setViewportView(tabla_citas);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_contenedor.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 710, 200));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle del Pago", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15))); // NOI18N

        rSCheckBoxMaterial3.setForeground(new java.awt.Color(0, 0, 0));
        rSCheckBoxMaterial3.setText("  IGV");
        rSCheckBoxMaterial3.setColorCheck(new java.awt.Color(3, 111, 198));
        rSCheckBoxMaterial3.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rSCheckBoxMaterial3.setFocusPainted(false);
        rSCheckBoxMaterial3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setText("Total a Pagar:");

        txt_total_pagar.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txt_total_pagar.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        txt_total_pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_total_pagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(rSCheckBoxMaterial3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txt_total_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txt_total_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rSCheckBoxMaterial3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        panel_contenedor.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 610, 690, 110));

        add(panel_contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardar_comprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_comprobanteActionPerformed

    }//GEN-LAST:event_btn_guardar_comprobanteActionPerformed

    private void btn_nuevo_comprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevo_comprobanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevo_comprobanteActionPerformed

    private void txt_buscar_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscar_pacienteActionPerformed

    }//GEN-LAST:event_txt_buscar_pacienteActionPerformed

    private void txt_paciente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_paciente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_paciente1ActionPerformed

    private void txt_total_pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_total_pagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_total_pagarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_tipo;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_cancelar_cambios1;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_cancelar_cambios2;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_guardar_comprobante;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_modificar_comprobante;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_nuevo_comprobante;
    private LIB.FSGradientPanel fSGradientPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_nombre_paciente;
    private javax.swing.JPanel panel_contenedor;
    private RSMaterialComponent.RSCheckBoxMaterial rSCheckBoxMaterial1;
    private RSMaterialComponent.RSCheckBoxMaterial rSCheckBoxMaterial2;
    private RSMaterialComponent.RSCheckBoxMaterial rSCheckBoxMaterial3;
    private rojerusan.RSTableMetro tabla_citas;
    private RSMaterialComponent.RSButtonMaterialGradientOne txt_buscar_paciente;
    private javax.swing.JTextField txt_paciente1;
    private rojerusan.RSMetroTextPlaceHolder txt_ruc;
    private javax.swing.JTextField txt_total_pagar;
    // End of variables declaration//GEN-END:variables
}
