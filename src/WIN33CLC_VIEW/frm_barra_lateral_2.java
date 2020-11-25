
package WIN33CLC_VIEW;

public class frm_barra_lateral_2 extends javax.swing.JPanel {

    public frm_barra_lateral_2() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fSGradientPanel1 = new LIB.FSGradientPanel();
        btn_servicios_02 = new newscomponents.RSButtonFlat_new();
        btn_especialista_02 = new newscomponents.RSButtonFlat_new();
        btn_base_datos_3 = new newscomponents.RSButtonFlat_new();
        btn_usuarios_02 = new newscomponents.RSButtonFlat_new();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("DentalSys ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        fSGradientPanel1.setFSEndColor(new java.awt.Color(3, 111, 198));
        fSGradientPanel1.setFSStartColor(new java.awt.Color(101, 208, 250));
        add(fSGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 160));

        btn_servicios_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_servicios_02.setForeground(new java.awt.Color(0, 0, 0));
        btn_servicios_02.setText("Servicios");
        btn_servicios_02.setBorderPainted(false);
        btn_servicios_02.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_servicios_02.setIconTextGap(2);
        btn_servicios_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_servicios_02ActionPerformed(evt);
            }
        });
        add(btn_servicios_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 270, 90));

        btn_especialista_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_especialista_02.setForeground(new java.awt.Color(0, 0, 0));
        btn_especialista_02.setText("Especialistas");
        btn_especialista_02.setBorderPainted(false);
        btn_especialista_02.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_especialista_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_especialista_02ActionPerformed(evt);
            }
        });
        add(btn_especialista_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 270, 80));

        btn_base_datos_3.setBackground(new java.awt.Color(255, 255, 255));
        btn_base_datos_3.setForeground(new java.awt.Color(0, 0, 0));
        btn_base_datos_3.setText("Base de Datos");
        btn_base_datos_3.setBorderPainted(false);
        btn_base_datos_3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_base_datos_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_base_datos_3ActionPerformed(evt);
            }
        });
        add(btn_base_datos_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 270, 90));

        btn_usuarios_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_usuarios_02.setForeground(new java.awt.Color(0, 0, 0));
        btn_usuarios_02.setText("Usuarios");
        btn_usuarios_02.setBorderPainted(false);
        btn_usuarios_02.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_usuarios_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuarios_02ActionPerformed(evt);
            }
        });
        add(btn_usuarios_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 270, 80));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_servicios_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_servicios_02ActionPerformed

    }//GEN-LAST:event_btn_servicios_02ActionPerformed

    private void btn_especialista_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_especialista_02ActionPerformed

    }//GEN-LAST:event_btn_especialista_02ActionPerformed

    private void btn_base_datos_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_base_datos_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_base_datos_3ActionPerformed

    private void btn_usuarios_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuarios_02ActionPerformed

    }//GEN-LAST:event_btn_usuarios_02ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btn_base_datos_3;
    private newscomponents.RSButtonFlat_new btn_especialista_02;
    private newscomponents.RSButtonFlat_new btn_servicios_02;
    private newscomponents.RSButtonFlat_new btn_usuarios_02;
    private LIB.FSGradientPanel fSGradientPanel1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
