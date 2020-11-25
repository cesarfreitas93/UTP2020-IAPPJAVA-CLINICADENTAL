
package WIN33CLC_VIEW;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import AppPackage.AnimationClass;
import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class prueba extends javax.swing.JFrame {
static boolean maximized = true;

    public prueba() {
        initComponents();
        paneles ();
        setBackground(new Color (0,0,0,100));
        setLocationRelativeTo(null); 
        execute();
    }
    
    
    private void execute() {
        ImageIcon iconCita = new ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-chebrón-hacia-la-derecha-28.png"));
        ImageIcon iconSubMenu = new ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-hoy-28.png"));
        
        //  create submenu staff
        MenuItem gestionarcita = new MenuItem(iconSubMenu, "Gestionar Citas", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               // panelBody.add(new Panel1());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });

        MenuItem menucitas = new MenuItem(iconCita, "Citas", null, gestionarcita);

        addMenu(menucitas);
    }
    
    private void addMenu(MenuItem... menu) {
        for (int i = 0; i < menu.length; i++) {
            panel_menu.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for (MenuItem m : subMenu) {
                addMenu(m);
            }
        }
        panel_menu.revalidate();
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
         
            jPanel3.setVisible(true);
       }
       if(panel_mad.isVisible()== true)
       {
           panel_mad.setVisible(false);
           jPanel3.setVisible(true);
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
        java.awt.GridBagConstraints gridBagConstraints;

        p1 = new javax.swing.JPanel();
        rSButtonMaterialGradientOne1 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        rSButtonMaterialGradientOne2 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        rSButtonMaterialGradientOne3 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        rSButtonMaterialGradientOne4 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        rSButtonMaterialGradientOne5 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        rSButtonMaterialGradientOne6 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        jPanel3 = new javax.swing.JPanel();
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
        panel_menu = new javax.swing.JPanel();
        panelBody = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        p1.setBackground(new java.awt.Color(255, 255, 255));
        p1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        p1.add(rSButtonMaterialGradientOne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, 30, -1));

        rSButtonMaterialGradientOne2.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne2.setBorder(null);
        rSButtonMaterialGradientOne2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-persona-de-sexo-masculino-30.png"))); // NOI18N
        rSButtonMaterialGradientOne2.setBorderPainted(false);
        rSButtonMaterialGradientOne2.setColorPrimario(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne2.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne2.setColorSecundario(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne2.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne2.setFocusPainted(false);
        rSButtonMaterialGradientOne2.setIconTextGap(0);
        rSButtonMaterialGradientOne2.setRippleColor(new java.awt.Color(204, 204, 204));
        p1.add(rSButtonMaterialGradientOne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 30, -1));

        rSButtonMaterialGradientOne3.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne3.setBorder(null);
        rSButtonMaterialGradientOne3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/calendario icono.png"))); // NOI18N
        rSButtonMaterialGradientOne3.setBorderPainted(false);
        rSButtonMaterialGradientOne3.setColorPrimario(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne3.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne3.setColorSecundario(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne3.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        rSButtonMaterialGradientOne3.setFocusPainted(false);
        rSButtonMaterialGradientOne3.setIconTextGap(0);
        rSButtonMaterialGradientOne3.setRippleColor(new java.awt.Color(204, 204, 204));
        p1.add(rSButtonMaterialGradientOne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 30, -1));

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
        p1.add(rSButtonMaterialGradientOne4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 30, -1));

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
        p1.add(rSButtonMaterialGradientOne5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 30, -1));

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
        p1.add(rSButtonMaterialGradientOne6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 30, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridBagLayout());

        btn_mad.setText("Real Madrid");
        btn_mad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_madActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 91;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 60);
        jPanel3.add(btn_mad, gridBagConstraints);

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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 156;
        gridBagConstraints.ipady = 123;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 60);
        jPanel3.add(panel_bar, gridBagConstraints);

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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 156;
        gridBagConstraints.ipady = 113;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 100, 60);
        jPanel3.add(panel_mad, gridBagConstraints);

        btn_bar.setBackground(new java.awt.Color(255, 255, 255));
        btn_bar.setForeground(new java.awt.Color(0, 0, 0));
        btn_bar.setText("Barcelona");
        btn_bar.setBorderPainted(false);
        btn_bar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_barActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 135;
        gridBagConstraints.ipady = 33;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 20, 0, 60);
        jPanel3.add(btn_bar, gridBagConstraints);

        panel_menu.setBackground(new java.awt.Color(255, 255, 255));

        panelBody.setBackground(new java.awt.Color(204, 255, 204));

        jToggleButton1.setText("jToggleButton1");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBodyLayout = new javax.swing.GroupLayout(panelBody);
        panelBody.setLayout(panelBodyLayout);
        panelBodyLayout.setHorizontalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jToggleButton1)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        panelBodyLayout.setVerticalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jToggleButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(panel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonMaterialGradientOne4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialGradientOne4ActionPerformed
        
    }//GEN-LAST:event_rSButtonMaterialGradientOne4ActionPerformed

 
    
    private void btn_madActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_madActionPerformed
        show_submenu(panel_mad);
    }//GEN-LAST:event_btn_madActionPerformed

    private void rSButtonFlat_new1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonFlat_new1ActionPerformed
        ocultar_paneles ();
    }//GEN-LAST:event_rSButtonFlat_new1ActionPerformed

    private void rSButtonFlat_new5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonFlat_new5ActionPerformed
        ocultar_paneles ();
    }//GEN-LAST:event_rSButtonFlat_new5ActionPerformed

    private void rSButtonFlat_new7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonFlat_new7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonFlat_new7ActionPerformed

    private void btn_barActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_barActionPerformed
        show_submenu(panel_bar);
    }//GEN-LAST:event_btn_barActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if(maximized){
            //handle fullscreen - taskbar
            prueba.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            prueba.this.setMaximizedBounds(env.getMaximumWindowBounds());
            maximized = false;
        }else{
            setExtendedState(JFrame.NORMAL);
            maximized = true;
        }               // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btn_bar;
    private RSMaterialComponent.RSButtonMaterialOne btn_mad;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panel_bar;
    private javax.swing.JPanel panel_mad;
    private javax.swing.JPanel panel_menu;
    private newscomponents.RSButtonFlat_new rSButtonFlat_new1;
    private newscomponents.RSButtonFlat_new rSButtonFlat_new3;
    private newscomponents.RSButtonFlat_new rSButtonFlat_new4;
    private newscomponents.RSButtonFlat_new rSButtonFlat_new5;
    private newscomponents.RSButtonFlat_new rSButtonFlat_new6;
    private newscomponents.RSButtonFlat_new rSButtonFlat_new7;
    private RSMaterialComponent.RSButtonMaterialGradientOne rSButtonMaterialGradientOne1;
    private RSMaterialComponent.RSButtonMaterialGradientOne rSButtonMaterialGradientOne2;
    private RSMaterialComponent.RSButtonMaterialGradientOne rSButtonMaterialGradientOne3;
    private RSMaterialComponent.RSButtonMaterialGradientOne rSButtonMaterialGradientOne4;
    private RSMaterialComponent.RSButtonMaterialGradientOne rSButtonMaterialGradientOne5;
    private RSMaterialComponent.RSButtonMaterialGradientOne rSButtonMaterialGradientOne6;
    // End of variables declaration//GEN-END:variables


}
