
package WIN33CLC_VIEW;

import java.awt.Color;


public class frm_UI_07_usuarios extends javax.swing.JPanel {

    public frm_UI_07_usuarios() {
        initComponents();
     
        setBackground(new Color (255,255,255,1));
        btn_nuevo_usuario.setBackground(new Color (41,177,255,0));
        btn_modificar_usuario.setBackground(new Color (41,177,255,0));
        btn_guardar_usuario.setBackground(new Color (41,177,255,0));
        btn_cancelar_cambios.setBackground(new Color (41,177,255,0));
       
    }

    public void ocultar_form_usuarios(boolean b)
    {
    menu_salir1.setVisible(b);
    
            menu_salir3.setVisible(b);
            rSPanelBorderGradient1.setVisible(b);
            
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        menu_salir1 = new RSMaterialComponent.RSPanelMaterial();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_user = new rojerusan.RSMetroTextPlaceHolder();
        txt_pass = new rojerusan.RSMetroTextPassPlaceHolder();
        chk_admin = new RSMaterialComponent.RSCheckBoxMaterial();
        chk_recepcionista = new RSMaterialComponent.RSCheckBoxMaterial();
        menu_salir3 = new RSMaterialComponent.RSPanelMaterial();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePatients = new rojerusan.RSTableMetro();
        rSPanelBorderGradient1 = new RSMaterialComponent.RSPanelBorderGradient();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_nuevo_usuario = new newscomponents.RSButtonFlat_new();
        btn_guardar_usuario = new newscomponents.RSButtonFlat_new();
        btn_modificar_usuario = new newscomponents.RSButtonFlat_new();
        btn_cancelar_cambios = new newscomponents.RSButtonFlat_new();

        menu_salir1.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir1.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir1.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir1.setRound(40);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("USUARIO");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("CONTRASEÑA");

        txt_user.setForeground(new java.awt.Color(51, 51, 51));
        txt_user.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_user.setBotonColor(new java.awt.Color(3, 111, 198));
        txt_user.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        txt_pass.setForeground(new java.awt.Color(51, 51, 51));
        txt_pass.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_pass.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txt_pass.setPhColor(new java.awt.Color(51, 51, 51));
        txt_pass.setPlaceholder("");

        buttonGroup1.add(chk_admin);
        chk_admin.setForeground(new java.awt.Color(51, 51, 51));
        chk_admin.setText("ADMINISTRADOR");
        chk_admin.setColorCheck(new java.awt.Color(0, 112, 192));
        chk_admin.setColorUnCheck(new java.awt.Color(0, 112, 192));
        chk_admin.setFocusPainted(false);
        chk_admin.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N

        buttonGroup1.add(chk_recepcionista);
        chk_recepcionista.setForeground(new java.awt.Color(51, 51, 51));
        chk_recepcionista.setText("RECEPCIONISTA");
        chk_recepcionista.setColorCheck(new java.awt.Color(0, 112, 192));
        chk_recepcionista.setColorUnCheck(new java.awt.Color(0, 112, 192));
        chk_recepcionista.setFocusPainted(false);
        chk_recepcionista.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        chk_recepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_recepcionistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu_salir1Layout = new javax.swing.GroupLayout(menu_salir1);
        menu_salir1.setLayout(menu_salir1Layout);
        menu_salir1Layout.setHorizontalGroup(
            menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir1Layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_user, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk_admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chk_recepcionista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        menu_salir1Layout.setVerticalGroup(
            menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk_recepcionista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
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

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-usuario-masculino-en-círculo-100.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("USUARIOS");

        btn_nuevo_usuario.setBackground(new java.awt.Color(0, 160, 253));
        btn_nuevo_usuario.setForeground(new java.awt.Color(51, 51, 51));
        btn_nuevo_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-añadir-usuario-masculino-24.png"))); // NOI18N
        btn_nuevo_usuario.setText("Nuevo Usuario");
        btn_nuevo_usuario.setBorderPainted(false);
        btn_nuevo_usuario.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N

        btn_guardar_usuario.setBackground(new java.awt.Color(0, 160, 253));
        btn_guardar_usuario.setForeground(new java.awt.Color(51, 51, 51));
        btn_guardar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-guardar-24.png"))); // NOI18N
        btn_guardar_usuario.setText("Guardar Usuario");
        btn_guardar_usuario.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N

        btn_modificar_usuario.setBackground(new java.awt.Color(0, 160, 253));
        btn_modificar_usuario.setForeground(new java.awt.Color(51, 51, 51));
        btn_modificar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-editar-usuario-masculino-24.png"))); // NOI18N
        btn_modificar_usuario.setText("Modificar usuario");
        btn_modificar_usuario.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N

        btn_cancelar_cambios.setBackground(new java.awt.Color(0, 160, 253));
        btn_cancelar_cambios.setForeground(new java.awt.Color(51, 51, 51));
        btn_cancelar_cambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/cancelar.png"))); // NOI18N
        btn_cancelar_cambios.setText("Cancelar Cambios");
        btn_cancelar_cambios.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N

        javax.swing.GroupLayout rSPanelBorderGradient1Layout = new javax.swing.GroupLayout(rSPanelBorderGradient1);
        rSPanelBorderGradient1.setLayout(rSPanelBorderGradient1Layout);
        rSPanelBorderGradient1Layout.setHorizontalGroup(
            rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelBorderGradient1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelBorderGradient1Layout.createSequentialGroup()
                        .addGroup(rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_modificar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cancelar_cambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_guardar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_nuevo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelBorderGradient1Layout.createSequentialGroup()
                        .addGroup(rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel12))
                        .addGap(81, 81, 81))))
        );
        rSPanelBorderGradient1Layout.setVerticalGroup(
            rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelBorderGradient1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(btn_nuevo_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btn_guardar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btn_modificar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(menu_salir3, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                    .addComponent(menu_salir1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(menu_salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(menu_salir3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(rSPanelBorderGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chk_recepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_recepcionistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_recepcionistaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btn_cancelar_cambios;
    private newscomponents.RSButtonFlat_new btn_guardar_usuario;
    private newscomponents.RSButtonFlat_new btn_modificar_usuario;
    private newscomponents.RSButtonFlat_new btn_nuevo_usuario;
    private javax.swing.ButtonGroup buttonGroup1;
    private RSMaterialComponent.RSCheckBoxMaterial chk_admin;
    private RSMaterialComponent.RSCheckBoxMaterial chk_recepcionista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane1;
    private RSMaterialComponent.RSPanelMaterial menu_salir1;
    private RSMaterialComponent.RSPanelMaterial menu_salir3;
    private RSMaterialComponent.RSPanelBorderGradient rSPanelBorderGradient1;
    private rojerusan.RSTableMetro tablePatients;
    private rojerusan.RSMetroTextPassPlaceHolder txt_pass;
    private rojerusan.RSMetroTextPlaceHolder txt_user;
    // End of variables declaration//GEN-END:variables
}
