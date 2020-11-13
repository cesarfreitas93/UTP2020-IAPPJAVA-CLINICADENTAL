
package WIN33CLC_VIEW;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import rojerusan.RSPanelsSlider;

public class frm_Main extends javax.swing.JFrame {

  
    public frm_Main() {
        initComponents();
        //setBackground(new Color (3,11,198,220));
         setBackground(new Color (255,255,255,253));
        jPanel3.setBackground(new Color (255,255,255,150));
        jPanel1.setOpaque(false);
        //------------------
        rSButtonFlat_new1.setBackground(new Color(255,255,255,100));
        btn_mad.setBackground(new Color(255,255,255,100));
         setLocationRelativeTo(null); 
       //------------------
       paneles();
       
       
       
       
    }
    
    private void paneles ()
    {
        
        panel_bar.setVisible(false);
        panel_mad.setVisible(false);
    }
    
    private void ocultar_paneles ()
    {
        
       if(panel_bar.isVisible()== true)
       {
           panel_bar.setVisible(false);
       }
       if(panel_mad.isVisible()== true)
       {
           panel_mad.setVisible(false);
       }
    }
    
    private void show_submenu (JPanel submenu )
    {
        
       if(submenu.isVisible()==false)
       {
           ocultar_paneles ();
           submenu.setVisible(true);
       }
       else
           submenu.setVisible(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rSButtonMaterialGradientOne1 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        rSButtonMaterialGradientOne3 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        rSButtonMaterialGradientOne4 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        rSButtonMaterialGradientOne5 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        rSButtonMaterialGradientOne6 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        rSButtonMaterialGradientOne7 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        rSButtonMaterialGradientOne11 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_mad = new RSMaterialComponent.RSButtonMaterialOne();
        panel_bar = new javax.swing.JPanel();
        rSButtonFlat_new1 = new newscomponents.RSButtonFlat_new();
        rSButtonFlat_new3 = new newscomponents.RSButtonFlat_new();
        rSButtonFlat_new4 = new newscomponents.RSButtonFlat_new();
        panel_mad = new javax.swing.JPanel();
        rSButtonFlat_new5 = new newscomponents.RSButtonFlat_new();
        rSButtonFlat_new6 = new newscomponents.RSButtonFlat_new();
        rSButtonFlat_new7 = new newscomponents.RSButtonFlat_new();
        btn_bar = new newscomponents.RSButtonFlat_new();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonMaterialGradientOne1.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne1.setBorder(null);
        rSButtonMaterialGradientOne1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-salida-30.png"))); // NOI18N
        rSButtonMaterialGradientOne1.setBorderPainted(false);
        rSButtonMaterialGradientOne1.setColorPrimario(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne1.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne1.setColorSecundario(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne1.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne1.setFocusPainted(false);
        rSButtonMaterialGradientOne1.setIconTextGap(0);
        rSButtonMaterialGradientOne1.setRippleColor(new java.awt.Color(204, 204, 204));
        jPanel1.add(rSButtonMaterialGradientOne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 50, -1));

        rSButtonMaterialGradientOne3.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne3.setBorder(null);
        rSButtonMaterialGradientOne3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-persona-de-sexo-masculino-30.png"))); // NOI18N
        rSButtonMaterialGradientOne3.setBorderPainted(false);
        rSButtonMaterialGradientOne3.setColorPrimario(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne3.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne3.setColorSecundario(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne3.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne3.setFocusPainted(false);
        rSButtonMaterialGradientOne3.setIconTextGap(0);
        rSButtonMaterialGradientOne3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        rSButtonMaterialGradientOne3.setRippleColor(new java.awt.Color(204, 204, 204));
        rSButtonMaterialGradientOne3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialGradientOne3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonMaterialGradientOne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 50, -1));

        rSButtonMaterialGradientOne4.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne4.setBorder(null);
        rSButtonMaterialGradientOne4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-factura-30.png"))); // NOI18N
        rSButtonMaterialGradientOne4.setBorderPainted(false);
        rSButtonMaterialGradientOne4.setColorPrimario(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne4.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne4.setColorSecundario(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne4.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne4.setFocusPainted(false);
        rSButtonMaterialGradientOne4.setIconTextGap(0);
        rSButtonMaterialGradientOne4.setRippleColor(new java.awt.Color(204, 204, 204));
        rSButtonMaterialGradientOne4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialGradientOne4ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonMaterialGradientOne4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 50, -1));

        rSButtonMaterialGradientOne5.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne5.setBorder(null);
        rSButtonMaterialGradientOne5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-base-de-datos-30.png"))); // NOI18N
        rSButtonMaterialGradientOne5.setBorderPainted(false);
        rSButtonMaterialGradientOne5.setColorPrimario(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne5.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne5.setColorSecundario(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne5.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne5.setFocusPainted(false);
        rSButtonMaterialGradientOne5.setIconTextGap(0);
        rSButtonMaterialGradientOne5.setRippleColor(new java.awt.Color(204, 204, 204));
        jPanel1.add(rSButtonMaterialGradientOne5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 50, -1));

        rSButtonMaterialGradientOne6.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne6.setBorder(null);
        rSButtonMaterialGradientOne6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-usuario-masculino-en-círculo-30.png"))); // NOI18N
        rSButtonMaterialGradientOne6.setBorderPainted(false);
        rSButtonMaterialGradientOne6.setColorPrimario(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne6.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne6.setColorSecundario(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne6.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne6.setFocusPainted(false);
        rSButtonMaterialGradientOne6.setIconTextGap(0);
        rSButtonMaterialGradientOne6.setRippleColor(new java.awt.Color(204, 204, 204));
        jPanel1.add(rSButtonMaterialGradientOne6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 50, -1));

        rSButtonMaterialGradientOne7.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne7.setBorder(null);
        rSButtonMaterialGradientOne7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/calendario icono.png"))); // NOI18N
        rSButtonMaterialGradientOne7.setBorderPainted(false);
        rSButtonMaterialGradientOne7.setColorPrimario(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne7.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne7.setColorSecundario(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne7.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne7.setFocusPainted(false);
        rSButtonMaterialGradientOne7.setIconTextGap(0);
        rSButtonMaterialGradientOne7.setRippleColor(new java.awt.Color(204, 204, 204));
        jPanel1.add(rSButtonMaterialGradientOne7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 50, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/Menu.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 70, 740));

        jPanel2.setBackground(new java.awt.Color(255, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonMaterialGradientOne11.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonMaterialGradientOne11.setText("Salir");
        rSButtonMaterialGradientOne11.setBorderPainted(false);
        rSButtonMaterialGradientOne11.setColorPrimario(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne11.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne11.setColorSecundario(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne11.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne11.setFocusPainted(false);
        rSButtonMaterialGradientOne11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        rSButtonMaterialGradientOne11.setRippleColor(new java.awt.Color(204, 204, 204));
        jPanel3.add(rSButtonMaterialGradientOne11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 260, -1));

        btn_mad.setText("Real Madrid");
        btn_mad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_madActionPerformed(evt);
            }
        });
        jPanel3.add(btn_mad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        rSButtonFlat_new1.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonFlat_new1.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonFlat_new1.setText("1");
        rSButtonFlat_new1.setBorderPainted(false);
        rSButtonFlat_new1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonFlat_new1ActionPerformed(evt);
            }
        });
        panel_bar.add(rSButtonFlat_new1);

        rSButtonFlat_new3.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonFlat_new3.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonFlat_new3.setText("2");
        rSButtonFlat_new3.setBorderPainted(false);
        panel_bar.add(rSButtonFlat_new3);

        rSButtonFlat_new4.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonFlat_new4.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonFlat_new4.setText("3");
        rSButtonFlat_new4.setBorderPainted(false);
        panel_bar.add(rSButtonFlat_new4);

        jPanel3.add(panel_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, 140));

        rSButtonFlat_new5.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonFlat_new5.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonFlat_new5.setText("1");
        rSButtonFlat_new5.setBorderPainted(false);
        rSButtonFlat_new5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonFlat_new5ActionPerformed(evt);
            }
        });
        panel_mad.add(rSButtonFlat_new5);

        rSButtonFlat_new6.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonFlat_new6.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonFlat_new6.setText("2");
        rSButtonFlat_new6.setBorderPainted(false);
        panel_mad.add(rSButtonFlat_new6);

        rSButtonFlat_new7.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonFlat_new7.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonFlat_new7.setText("3");
        rSButtonFlat_new7.setBorderPainted(false);
        rSButtonFlat_new7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonFlat_new7ActionPerformed(evt);
            }
        });
        panel_mad.add(rSButtonFlat_new7);

        jPanel3.add(panel_mad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 200, 160));

        btn_bar.setBackground(new java.awt.Color(255, 255, 255));
        btn_bar.setForeground(new java.awt.Color(0, 0, 0));
        btn_bar.setText("Barcelona");
        btn_bar.setBorderPainted(false);
        btn_bar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_barActionPerformed(evt);
            }
        });
        jPanel3.add(btn_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 740));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 1220, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonMaterialGradientOne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialGradientOne4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonMaterialGradientOne4ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
      int posicion = this.jPanel3.getX();
        
       if (posicion< -1)
            
       {
        
        Animacion.Animacion.mover_derecha(-330, 0  , 2, 2, jPanel3);
       
            
       }
       
       else
           
       {
           Animacion.Animacion.mover_izquierda(0 ,-330, 2, 2, jPanel3);
       }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
      labelcolor(jLabel2);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
       resetlabelcolor(jLabel2);
    }//GEN-LAST:event_jLabel2MouseExited

    private void rSButtonMaterialGradientOne3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialGradientOne3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonMaterialGradientOne3ActionPerformed

    private void rSButtonFlat_new7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonFlat_new7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonFlat_new7ActionPerformed

    private void rSButtonFlat_new5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonFlat_new5ActionPerformed
        ocultar_paneles ();
    }//GEN-LAST:event_rSButtonFlat_new5ActionPerformed

    private void btn_madActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_madActionPerformed
        show_submenu(panel_mad);
    }//GEN-LAST:event_btn_madActionPerformed

    private void rSButtonFlat_new1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonFlat_new1ActionPerformed
        ocultar_paneles ();
    }//GEN-LAST:event_rSButtonFlat_new1ActionPerformed

    private void btn_barActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_barActionPerformed
        show_submenu(panel_bar);
    }//GEN-LAST:event_btn_barActionPerformed

 
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btn_bar;
    private RSMaterialComponent.RSButtonMaterialOne btn_mad;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panel_bar;
    private javax.swing.JPanel panel_mad;
    private newscomponents.RSButtonFlat_new rSButtonFlat_new1;
    private newscomponents.RSButtonFlat_new rSButtonFlat_new3;
    private newscomponents.RSButtonFlat_new rSButtonFlat_new4;
    private newscomponents.RSButtonFlat_new rSButtonFlat_new5;
    private newscomponents.RSButtonFlat_new rSButtonFlat_new6;
    private newscomponents.RSButtonFlat_new rSButtonFlat_new7;
    private RSMaterialComponent.RSButtonMaterialGradientOne rSButtonMaterialGradientOne1;
    private RSMaterialComponent.RSButtonMaterialGradientOne rSButtonMaterialGradientOne11;
    private RSMaterialComponent.RSButtonMaterialGradientOne rSButtonMaterialGradientOne3;
    private RSMaterialComponent.RSButtonMaterialGradientOne rSButtonMaterialGradientOne4;
    private RSMaterialComponent.RSButtonMaterialGradientOne rSButtonMaterialGradientOne5;
    private RSMaterialComponent.RSButtonMaterialGradientOne rSButtonMaterialGradientOne6;
    private RSMaterialComponent.RSButtonMaterialGradientOne rSButtonMaterialGradientOne7;
    // End of variables declaration//GEN-END:variables
private void labelcolor(JLabel label){
        label.setBackground(new java.awt.Color(53,162,107));
    }
    
    private void resetlabelcolor(JLabel label){
        label.setBackground(new java.awt.Color(54,70,78));
    }


}

