
package WIN33CLC_VIEW;

import static com.sun.xml.internal.ws.client.ContentNegotiation.none;
import java.awt.Color;

public class paciente extends javax.swing.JPanel {


    public paciente() {
        initComponents();
         setBackground(new Color (255,255,255,0));
         p1.setBackground(new Color (255,255,255,200));
        // rSPanelBorder1.setBackground(new Color (255,255,255,200));
         //rSPanelImage1.setImagen();
         p3.setBackground(new Color (255,255,255,200));
         
        
        

         b1.setColorPrimario(new Color (139,198,255,200));
         b1.setColorSecundario(new Color (139,198,255,200));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        p1 = new RSMaterialComponent.RSPanelMaterial();
        b1 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        p3 = new RSMaterialComponent.RSPanelMaterial();
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

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 42)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Pacientes");

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 42)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-grupo-de-usuarios-hombre-y-mujer-55.png"))); // NOI18N

        p1.setBackground(new java.awt.Color(255, 255, 255));
        p1.setBgShade(new java.awt.Color(204, 204, 204));
        p1.setPixels(0);
        p1.setPreferredSize(new java.awt.Dimension(90, 62));
        p1.setRound(40);

        b1.setBorder(null);
        b1.setText("boton");
        b1.setBorderPainted(false);
        b1.setColorPrimario(new java.awt.Color(139, 198, 255));
        b1.setColorPrimarioHover(new java.awt.Color(139, 198, 255));
        b1.setColorSecundario(new java.awt.Color(139, 198, 255));
        b1.setColorSecundarioHover(new java.awt.Color(139, 198, 255));
        b1.setFocusPainted(false);
        b1.setOpaque(true);
        b1.setRound(32);

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(260, Short.MAX_VALUE))
        );

        p3.setBackground(new java.awt.Color(255, 255, 255));
        p3.setBgShade(new java.awt.Color(204, 204, 204));
        p3.setPixels(0);
        p3.setPreferredSize(new java.awt.Dimension(90, 62));
        p3.setRound(40);

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 221, Short.MAX_VALUE)
        );

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
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(txt_dni, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_apellidoPAT, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(btn_buscar_reniec, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(txt_apellidoMAT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p3, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 660, Short.MAX_VALUE))
                            .addComponent(menu_salir1, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                    .addComponent(menu_salir1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscar_reniecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_reniecActionPerformed
          // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscar_reniecActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialGradientOne b1;
    private newscomponents.RSButtonFlat_new btn_buscar_reniec;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private RSMaterialComponent.RSPanelMaterial menu_salir1;
    private RSMaterialComponent.RSPanelMaterial p1;
    private RSMaterialComponent.RSPanelMaterial p3;
    private rscomponentshade.RSFormatFieldShade txt_apellidoMAT;
    private rscomponentshade.RSFormatFieldShade txt_apellidoPAT;
    private rscomponentshade.RSFormatFieldShade txt_direccion;
    private rscomponentshade.RSFormatFieldShade txt_dni;
    private rscomponentshade.RSFormatFieldShade txt_email;
    private rscomponentshade.RSFormatFieldShade txt_name;
    private rscomponentshade.RSFormatFieldShade txt_phone;
    // End of variables declaration//GEN-END:variables
}
