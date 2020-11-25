
package WIN33CLC_VIEW;

import java.awt.Color;
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
        btn_paciente_02 = new newscomponents.RSButtonFlat_new();
        btn_citas_2 = new newscomponents.RSButtonFlat_new();
        btn_salir_02 = new newscomponents.RSButtonFlat_new();
        btn_facturas_02 = new newscomponents.RSButtonFlat_new();
        btn_gestionar_citas_02 = new newscomponents.RSButtonFlat_new();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        btn_inicio_02.setOpaque(true);
        btn_inicio_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicio_02ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_inicio_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 270, 130));

        btn_paciente_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_paciente_02.setForeground(new java.awt.Color(0, 0, 0));
        btn_paciente_02.setText("Pacientes");
        btn_paciente_02.setBorderPainted(false);
        btn_paciente_02.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_paciente_02.setOpaque(true);
        btn_paciente_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paciente_02ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_paciente_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 270, 110));

        btn_citas_2.setBackground(new java.awt.Color(255, 255, 255));
        btn_citas_2.setForeground(new java.awt.Color(0, 0, 0));
        btn_citas_2.setText("Citas");
        btn_citas_2.setBorderPainted(false);
        btn_citas_2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_citas_2.setOpaque(true);
        btn_citas_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_citas_2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_citas_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 270, 90));

        btn_salir_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_salir_02.setForeground(new java.awt.Color(0, 0, 0));
        btn_salir_02.setText("Salir");
        btn_salir_02.setBorderPainted(false);
        btn_salir_02.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_salir_02.setOpaque(true);
        btn_salir_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salir_02ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salir_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 670, 270, -1));

        btn_facturas_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_facturas_02.setForeground(new java.awt.Color(0, 0, 0));
        btn_facturas_02.setText("Facturas");
        btn_facturas_02.setBorderPainted(false);
        btn_facturas_02.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_facturas_02.setOpaque(true);
        btn_facturas_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_facturas_02ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_facturas_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 270, 110));

        btn_gestionar_citas_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_gestionar_citas_02.setForeground(new java.awt.Color(0, 0, 0));
        btn_gestionar_citas_02.setText("Gestionar Citas");
        btn_gestionar_citas_02.setBorderPainted(false);
        btn_gestionar_citas_02.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_gestionar_citas_02.setOpaque(true);
        btn_gestionar_citas_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gestionar_citas_02ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_gestionar_citas_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 270, 80));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 740));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inicio_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicio_02ActionPerformed

        
        
    }//GEN-LAST:event_btn_inicio_02ActionPerformed

    private void btn_gestionar_citas_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gestionar_citas_02ActionPerformed

    }//GEN-LAST:event_btn_gestionar_citas_02ActionPerformed

    private void btn_facturas_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_facturas_02ActionPerformed

    }//GEN-LAST:event_btn_facturas_02ActionPerformed

    private void btn_salir_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salir_02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salir_02ActionPerformed

    private void btn_citas_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_citas_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_citas_2ActionPerformed

    private void btn_paciente_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paciente_02ActionPerformed

    }//GEN-LAST:event_btn_paciente_02ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btn_citas_2;
    private newscomponents.RSButtonFlat_new btn_facturas_02;
    private newscomponents.RSButtonFlat_new btn_gestionar_citas_02;
    private newscomponents.RSButtonFlat_new btn_inicio_02;
    private newscomponents.RSButtonFlat_new btn_paciente_02;
    private newscomponents.RSButtonFlat_new btn_salir_02;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
