
package WIN33CLC_VIEW;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import rojerusan.RSPanelsSlider;

public class frm_Main extends javax.swing.JFrame {

  
    public frm_Main() {
        initComponents();
        
        setBackground(new Color (3,111,198,230));
        
        
         setLocationRelativeTo(null); 
        Shape forma = new RoundRectangle2D.Double(0, 0, getBounds().width, getBounds().height, 20, 20);
        AWTUtilities.setWindowShape(this, forma);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fSGradientPanel1 = new LIB.FSGradientPanel();
        btn1 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn2 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_guardar_cita2 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        rSPanelsSlider1 = new rojerusan.RSPanelsSlider();
        panel1 = new javax.swing.JPanel();
        frm_02_Patient_Detail2 = new WIN33CLC_VIEW.frm_02_Patient_Detail();
        panel2 = new javax.swing.JPanel();
        vista11 = new WIN33CLC_VIEW.vista1();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fSGradientPanel1.setFSEndColor(new java.awt.Color(3, 111, 198));
        fSGradientPanel1.setFSStartColor(new java.awt.Color(101, 208, 250));
        fSGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-hoy-30.png"))); // NOI18N
        btn1.setText("Paciente");
        btn1.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn1.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn1.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn1.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn1.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        btn1.setSelected(true);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        fSGradientPanel1.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 210, -1));

        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-hoy-30.png"))); // NOI18N
        btn2.setText("Cita");
        btn2.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn2.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn2.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn2.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn2.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        fSGradientPanel1.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 210, -1));

        btn_guardar_cita2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-hoy-30.png"))); // NOI18N
        btn_guardar_cita2.setText("Guardar Cita");
        btn_guardar_cita2.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn_guardar_cita2.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn_guardar_cita2.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn_guardar_cita2.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn_guardar_cita2.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        fSGradientPanel1.add(btn_guardar_cita2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 210, -1));

        getContentPane().add(fSGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 740));

        rSPanelsSlider1.setBackground(new java.awt.Color(255, 255, 255));

        panel1.setName("panel1"); // NOI18N
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel1.add(frm_02_Patient_Detail2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 740));

        rSPanelsSlider1.add(panel1, "card2");

        panel2.setName("panel2"); // NOI18N
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panel2.add(vista11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, -1));

        rSPanelsSlider1.add(panel2, "card3");

        getContentPane().add(rSPanelsSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 1130, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed

        
        if (!this.btn1.isSelected())
        {
           this.btn1.setSelected(true);
           this.btn2.setSelected(false);
                    
                    
                    rSPanelsSlider1.slidPanel(20, panel1, RSPanelsSlider.direct.Right);
                            
        }


    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
       
        
        
        if (!this.btn2.isSelected())
        {
           this.btn1.setSelected(false);
           this.btn2.setSelected(true);
                    
                    
                    rSPanelsSlider1.slidPanel(20, panel2, RSPanelsSlider.direct.Right);
                            
        }
    }//GEN-LAST:event_btn2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialGradientOne btn1;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn2;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_guardar_cita2;
    private LIB.FSGradientPanel fSGradientPanel1;
    private WIN33CLC_VIEW.frm_02_Patient_Detail frm_02_Patient_Detail2;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    private WIN33CLC_VIEW.vista1 vista11;
    // End of variables declaration//GEN-END:variables
}
