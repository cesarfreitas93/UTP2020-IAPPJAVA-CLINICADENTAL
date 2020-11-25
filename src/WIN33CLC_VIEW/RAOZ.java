/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN33CLC_VIEW;

import static WIN33CLC_VIEW.frm_Main1.maximized;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;


public class RAOZ extends javax.swing.JFrame {
static boolean maximized = true;
  
    public RAOZ() {
        initComponents();
        setLocationRelativeTo(null);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fSGradientPanel1 = new LIB.FSGradientPanel();
        Panel_menu_opcion2 = new javax.swing.JPanel();
        btn_especialista = new RSMaterialComponent.RSButtonMaterialGradientOne();
        lb_menu_despegable_2 = new javax.swing.JLabel();
        btn_servicios = new RSMaterialComponent.RSButtonMaterialGradientOne();
        min = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_base_datos = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_usuario1 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        maxi = new RSMaterialComponent.RSButtonMaterialGradientOne();
        fSButtonMD1 = new LIB.FSButtonMD();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fSGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(fSGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 740));

        Panel_menu_opcion2.setBackground(new java.awt.Color(255, 255, 255));
        Panel_menu_opcion2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_especialista.setBackground(new java.awt.Color(255, 255, 255));
        btn_especialista.setBorder(null);
        btn_especialista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-doctor-en-medicina-30.png"))); // NOI18N
        btn_especialista.setBorderPainted(false);
        btn_especialista.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_especialista.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_especialista.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_especialista.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_especialista.setFocusPainted(false);
        btn_especialista.setIconTextGap(0);
        btn_especialista.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_especialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_especialistaActionPerformed(evt);
            }
        });
        Panel_menu_opcion2.add(btn_especialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 50, -1));

        lb_menu_despegable_2.setBackground(new java.awt.Color(0, 0, 0));
        lb_menu_despegable_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-menú-30.png"))); // NOI18N
        lb_menu_despegable_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_menu_despegable_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_menu_despegable_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_menu_despegable_2MouseExited(evt);
            }
        });
        Panel_menu_opcion2.add(lb_menu_despegable_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btn_servicios.setBackground(new java.awt.Color(255, 255, 255));
        btn_servicios.setBorder(null);
        btn_servicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-maletín-médico-30.png"))); // NOI18N
        btn_servicios.setBorderPainted(false);
        btn_servicios.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_servicios.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_servicios.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_servicios.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_servicios.setFocusPainted(false);
        btn_servicios.setIconTextGap(0);
        btn_servicios.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_servicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_serviciosActionPerformed(evt);
            }
        });
        Panel_menu_opcion2.add(btn_servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 50, -1));

        min.setBackground(new java.awt.Color(255, 255, 255));
        min.setBorder(null);
        min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-minimizar-la-ventana-30.png"))); // NOI18N
        min.setBorderPainted(false);
        min.setColorPrimario(new java.awt.Color(255, 255, 255));
        min.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        min.setColorSecundario(new java.awt.Color(255, 255, 255));
        min.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        min.setFocusPainted(false);
        min.setIconTextGap(0);
        min.setRippleColor(new java.awt.Color(204, 204, 204));
        min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minActionPerformed(evt);
            }
        });
        Panel_menu_opcion2.add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 680, 50, -1));

        btn_base_datos.setBackground(new java.awt.Color(255, 255, 255));
        btn_base_datos.setBorder(null);
        btn_base_datos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-base-de-datos-30.png"))); // NOI18N
        btn_base_datos.setBorderPainted(false);
        btn_base_datos.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_base_datos.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_base_datos.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_base_datos.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_base_datos.setFocusPainted(false);
        btn_base_datos.setIconTextGap(0);
        btn_base_datos.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_base_datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_base_datosActionPerformed(evt);
            }
        });
        Panel_menu_opcion2.add(btn_base_datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 50, -1));

        btn_usuario1.setBackground(new java.awt.Color(255, 255, 255));
        btn_usuario1.setBorder(null);
        btn_usuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-usuario-masculino-en-círculo-30.png"))); // NOI18N
        btn_usuario1.setBorderPainted(false);
        btn_usuario1.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_usuario1.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_usuario1.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_usuario1.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_usuario1.setFocusPainted(false);
        btn_usuario1.setIconTextGap(0);
        btn_usuario1.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_usuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuario1ActionPerformed(evt);
            }
        });
        Panel_menu_opcion2.add(btn_usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 50, -1));

        maxi.setBackground(new java.awt.Color(255, 255, 255));
        maxi.setBorder(null);
        maxi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-maximizar-la-ventana-30.png"))); // NOI18N
        maxi.setBorderPainted(false);
        maxi.setColorPrimario(new java.awt.Color(255, 255, 255));
        maxi.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        maxi.setColorSecundario(new java.awt.Color(255, 255, 255));
        maxi.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        maxi.setFocusPainted(false);
        maxi.setIconTextGap(0);
        maxi.setRippleColor(new java.awt.Color(204, 204, 204));
        maxi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxiActionPerformed(evt);
            }
        });
        Panel_menu_opcion2.add(maxi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 50, -1));

        fSButtonMD1.setText("fSButtonMD1");
        fSButtonMD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fSButtonMD1ActionPerformed(evt);
            }
        });
        Panel_menu_opcion2.add(fSButtonMD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 50, 20));

        jPanel1.add(Panel_menu_opcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 0, -1, 740));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1242, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleParent(Panel_menu_opcion2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fSButtonMD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fSButtonMD1ActionPerformed
        if(maximized){

            RAOZ.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            RAOZ.this.setMaximizedBounds(env.getMaximumWindowBounds());
            maximized = false;
        }else{
            setExtendedState(JFrame.NORMAL);
            maximized = true;
        }        // TODO add your handling code here:
    }//GEN-LAST:event_fSButtonMD1ActionPerformed

    private void btn_especialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_especialistaActionPerformed
     /**   if(!this.btn_especialista.isSelected()){
            this.btn_especialista.setSelected(true);
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_citas.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);

            rSPanelsSlider1.slidPanel(20,panel_especialista, RSPanelsSlider.direct.Left);

        }
*/
    }//GEN-LAST:event_btn_especialistaActionPerformed

    private void lb_menu_despegable_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_menu_despegable_2MouseClicked
     /*   int posicion = this.panel_menu_despegable_2.getX();

        if (posicion> 900)

        {
            changeimage(lb_menu_despegable_2, "/WIN34CLC_RESOURCES/icons8-adelante-30.png");

            Animacion.Animacion.mover_izquierda(1240, 900 , 1, 4, panel_menu_despegable_2);

            SwingUtilities.updateComponentTreeUI(this);
            //  frm_03_reservar_cita2.deshabilitar_panel_citas(false);
            //frm_02_Patient_Detail2.deshabilitar_form_paciente(false);
            panel_menu_despegable_2.setVisible(true);
            panel_menu_despegable_2.setEnabled(true);

            frm_03_reservar_cita1.deshabilitar_rbx(false);
        }

        else

        {
            changeimage(lb_menu_despegable_2, "/WIN34CLC_RESOURCES/icons8-menú-30.png");

            Animacion.Animacion.mover_derecha(900 ,1240, 2, 4, panel_menu_despegable_2);
            //  frm_03_reservar_cita2.deshabilitar_panel_citas(false);
            // frm_02_Patient_Detail2.deshabilitar_form_paciente(false);
            SwingUtilities.updateComponentTreeUI(this);
            frm_03_reservar_cita1.deshabilitar_rbx(true);
            panel_menu_despegable_2.setVisible(false);
        }*/
    }//GEN-LAST:event_lb_menu_despegable_2MouseClicked

    private void lb_menu_despegable_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_menu_despegable_2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lb_menu_despegable_2MouseEntered

    private void lb_menu_despegable_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_menu_despegable_2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lb_menu_despegable_2MouseExited

    private void btn_serviciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_serviciosActionPerformed
      /*  if(!this.btn_servicios.isSelected()){
            this.btn_servicios.setSelected(true);
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_citas.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_especialista.setSelected(false);

            rSPanelsSlider1.slidPanel(20,panel_servicios, RSPanelsSlider.direct.Left);

        }*/
    }//GEN-LAST:event_btn_serviciosActionPerformed

    private void minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minActionPerformed
     /*   this.setState(Frame.ICONIFIED);   */     // TODO add your handling code here:
    }//GEN-LAST:event_minActionPerformed

    private void btn_base_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_base_datosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_base_datosActionPerformed

    private void btn_usuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_usuario1ActionPerformed

    private void maxiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxiActionPerformed
    /**    if(maximized){

            frm_Main1.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            frm_Main1.this.setMaximizedBounds(env.getMaximumWindowBounds());
            maximized = false;
        }else{
            setExtendedState(JFrame.NORMAL);
            maximized = true;
        }*/
    }//GEN-LAST:event_maxiActionPerformed

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
            java.util.logging.Logger.getLogger(RAOZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RAOZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RAOZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RAOZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RAOZ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_menu_opcion2;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_base_datos;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_especialista;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_servicios;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_usuario1;
    private LIB.FSButtonMD fSButtonMD1;
    private LIB.FSGradientPanel fSGradientPanel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_menu_despegable_2;
    private RSMaterialComponent.RSButtonMaterialGradientOne maxi;
    private RSMaterialComponent.RSButtonMaterialGradientOne min;
    // End of variables declaration//GEN-END:variables
}
