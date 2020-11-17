
package WIN33CLC_VIEW;

import javax.swing.JPanel;


public class fm_barra_lateral extends javax.swing.JPanel {

    public fm_barra_lateral() {
        initComponents();
       
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_inicio_02 = new newscomponents.RSButtonFlat_new();
        jPanel2 = new javax.swing.JPanel();
        btn_base_datos_02 = new newscomponents.RSButtonFlat_new();
        btn_users_02 = new newscomponents.RSButtonFlat_new();
        jPanel3 = new javax.swing.JPanel();
        btn_citas_02 = new newscomponents.RSButtonFlat_new();
        btn_facturas_02 = new newscomponents.RSButtonFlat_new();
        btn_paciente_02 = new newscomponents.RSButtonFlat_new();
        btn_salir_02 = new newscomponents.RSButtonFlat_new();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new javax.swing.OverlayLayout(this));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("DentalSys");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        btn_inicio_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_inicio_02.setForeground(new java.awt.Color(0, 0, 0));
        btn_inicio_02.setText("Inicio");
        btn_inicio_02.setBorderPainted(false);
        btn_inicio_02.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_inicio_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicio_02ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_inicio_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 270, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_base_datos_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_base_datos_02.setForeground(new java.awt.Color(0, 0, 0));
        btn_base_datos_02.setText("Base de datos");
        btn_base_datos_02.setBorderPainted(false);
        btn_base_datos_02.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_base_datos_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_base_datos_02ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_base_datos_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, -1));

        btn_users_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_users_02.setForeground(new java.awt.Color(0, 0, 0));
        btn_users_02.setText("Gestionar Usuarios");
        btn_users_02.setBorderPainted(false);
        btn_users_02.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_users_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_users_02ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_users_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 270, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 270, 170));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_citas_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_citas_02.setForeground(new java.awt.Color(0, 0, 0));
        btn_citas_02.setText("Citas");
        btn_citas_02.setBorderPainted(false);
        btn_citas_02.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_citas_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_citas_02ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_citas_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 270, 70));

        btn_facturas_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_facturas_02.setForeground(new java.awt.Color(0, 0, 0));
        btn_facturas_02.setText("Facturas");
        btn_facturas_02.setBorderPainted(false);
        btn_facturas_02.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_facturas_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_facturas_02ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_facturas_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 270, 70));

        btn_paciente_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_paciente_02.setForeground(new java.awt.Color(0, 0, 0));
        btn_paciente_02.setText("Pacientes");
        btn_paciente_02.setBorderPainted(false);
        btn_paciente_02.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_paciente_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paciente_02ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_paciente_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 70));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 270, 210));

        btn_salir_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_salir_02.setForeground(new java.awt.Color(0, 0, 0));
        btn_salir_02.setText("Salir");
        btn_salir_02.setBorderPainted(false);
        btn_salir_02.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_salir_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salir_02ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salir_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 680, 270, -1));

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inicio_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicio_02ActionPerformed

        
        
    }//GEN-LAST:event_btn_inicio_02ActionPerformed

    private void btn_paciente_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paciente_02ActionPerformed

     
    }//GEN-LAST:event_btn_paciente_02ActionPerformed

    private void btn_citas_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_citas_02ActionPerformed

    }//GEN-LAST:event_btn_citas_02ActionPerformed

    private void btn_facturas_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_facturas_02ActionPerformed

    }//GEN-LAST:event_btn_facturas_02ActionPerformed

    private void btn_base_datos_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_base_datos_02ActionPerformed

    }//GEN-LAST:event_btn_base_datos_02ActionPerformed

    private void btn_users_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_users_02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_users_02ActionPerformed

    private void btn_salir_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salir_02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salir_02ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btn_base_datos_02;
    private newscomponents.RSButtonFlat_new btn_citas_02;
    private newscomponents.RSButtonFlat_new btn_facturas_02;
    private newscomponents.RSButtonFlat_new btn_inicio_02;
    private newscomponents.RSButtonFlat_new btn_paciente_02;
    private newscomponents.RSButtonFlat_new btn_salir_02;
    private newscomponents.RSButtonFlat_new btn_users_02;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
