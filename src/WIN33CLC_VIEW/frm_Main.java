
package WIN33CLC_VIEW;

import com.sun.awt.AWTUtilities;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import rojerusan.RSPanelsSlider;

public class frm_Main extends javax.swing.JFrame {

  
    public frm_Main() {
        initComponents();
        //setBackground(new Color (3,11,198,220));
         setBackground(new Color (255,255,255,253));
      // jPanel3.setBackground(new Color (255,255,255,200));
       // jPanel1.setOpaque(false);
        //------------------
        
        //btn_mad.setBackground(new Color(255,255,255,100));
         setLocationRelativeTo(null); 
       //------------------
    
       panel_cerrar.setVisible(true);
       panel_cerrar.setEnabled(true);
           }
    
    
    
    
    
    public void changeimage(JLabel button, String resourcheimg){
        ImageIcon aimg = new ImageIcon(getClass().getResource(resourcheimg));
        button.setIcon(aimg);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_cerrar = new javax.swing.JPanel();
        btn_salir_sistema = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_salir_sistema2 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_salir_sistema1 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        Panel_menu = new javax.swing.JPanel();
        btn_paciente = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_factura = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_inicio = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_user = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_citas = new RSMaterialComponent.RSButtonMaterialGradientOne();
        lb_menu_despegable = new javax.swing.JLabel();
        btn_base_datos = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_salir1 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        Panel_Menu_despegable = new javax.swing.JPanel();
        fm_barra_lateral1 = new WIN33CLC_VIEW.fm_barra_lateral();
        rSPanelsSlider1 = new rojerusan.RSPanelsSlider();
        panel_inicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel_paciente = new javax.swing.JPanel();
        frm_02_Patient_Detail1 = new WIN33CLC_VIEW.frm_02_Patient_Detail();
        panel_cita = new javax.swing.JPanel();
        frm_03_reservar_cita1 = new WIN33CLC_VIEW.frm_03_reservar_cita();
        panel_factura = new javax.swing.JPanel();
        frm_04_comprobantes1 = new WIN33CLC_VIEW.frm_04_comprobantes();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setExtendedState(6);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_cerrar.setBackground(new java.awt.Color(255, 255, 255));
        panel_cerrar.setLayout(new javax.swing.BoxLayout(panel_cerrar, javax.swing.BoxLayout.LINE_AXIS));

        btn_salir_sistema.setBackground(new java.awt.Color(255, 255, 255));
        btn_salir_sistema.setBorder(null);
        btn_salir_sistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-menos-22.png"))); // NOI18N
        btn_salir_sistema.setBorderPainted(false);
        btn_salir_sistema.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_salir_sistema.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_salir_sistema.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_salir_sistema.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_salir_sistema.setFocusPainted(false);
        btn_salir_sistema.setIconTextGap(0);
        btn_salir_sistema.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_salir_sistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salir_sistemaActionPerformed(evt);
            }
        });
        panel_cerrar.add(btn_salir_sistema);

        btn_salir_sistema2.setBackground(new java.awt.Color(255, 255, 255));
        btn_salir_sistema2.setBorder(null);
        btn_salir_sistema2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-pantalla-completa-22.png"))); // NOI18N
        btn_salir_sistema2.setBorderPainted(false);
        btn_salir_sistema2.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_salir_sistema2.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_salir_sistema2.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_salir_sistema2.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_salir_sistema2.setFocusPainted(false);
        btn_salir_sistema2.setIconTextGap(0);
        btn_salir_sistema2.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_salir_sistema2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salir_sistema2ActionPerformed(evt);
            }
        });
        panel_cerrar.add(btn_salir_sistema2);

        btn_salir_sistema1.setBackground(new java.awt.Color(255, 255, 255));
        btn_salir_sistema1.setBorder(null);
        btn_salir_sistema1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-multiplicar-22.png"))); // NOI18N
        btn_salir_sistema1.setBorderPainted(false);
        btn_salir_sistema1.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_salir_sistema1.setColorPrimarioHover(new java.awt.Color(255, 0, 51));
        btn_salir_sistema1.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_salir_sistema1.setColorSecundarioHover(new java.awt.Color(255, 0, 51));
        btn_salir_sistema1.setFocusPainted(false);
        btn_salir_sistema1.setIconTextGap(0);
        btn_salir_sistema1.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_salir_sistema1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salir_sistema1ActionPerformed(evt);
            }
        });
        panel_cerrar.add(btn_salir_sistema1);

        getContentPane().add(panel_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 0, 130, 30));

        Panel_menu.setBackground(new java.awt.Color(255, 255, 255));
        Panel_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_paciente.setBackground(new java.awt.Color(255, 255, 255));
        btn_paciente.setBorder(null);
        btn_paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-persona-de-sexo-masculino-30.png"))); // NOI18N
        btn_paciente.setBorderPainted(false);
        btn_paciente.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_paciente.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_paciente.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_paciente.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_paciente.setFocusPainted(false);
        btn_paciente.setIconTextGap(0);
        btn_paciente.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_paciente.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pacienteActionPerformed(evt);
            }
        });
        Panel_menu.add(btn_paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 50, -1));

        btn_factura.setBackground(new java.awt.Color(255, 255, 255));
        btn_factura.setBorder(null);
        btn_factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-factura-30.png"))); // NOI18N
        btn_factura.setBorderPainted(false);
        btn_factura.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_factura.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_factura.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_factura.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_factura.setFocusPainted(false);
        btn_factura.setIconTextGap(0);
        btn_factura.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_facturaActionPerformed(evt);
            }
        });
        Panel_menu.add(btn_factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 50, -1));

        btn_inicio.setBackground(new java.awt.Color(255, 255, 255));
        btn_inicio.setBorder(null);
        btn_inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-casa-30.png"))); // NOI18N
        btn_inicio.setBorderPainted(false);
        btn_inicio.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_inicio.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_inicio.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_inicio.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_inicio.setFocusPainted(false);
        btn_inicio.setIconTextGap(0);
        btn_inicio.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicioActionPerformed(evt);
            }
        });
        Panel_menu.add(btn_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 50, -1));

        btn_user.setBackground(new java.awt.Color(255, 255, 255));
        btn_user.setBorder(null);
        btn_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-usuario-masculino-en-círculo-30.png"))); // NOI18N
        btn_user.setBorderPainted(false);
        btn_user.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_user.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_user.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_user.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_user.setFocusPainted(false);
        btn_user.setIconTextGap(0);
        btn_user.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_userActionPerformed(evt);
            }
        });
        Panel_menu.add(btn_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 50, -1));

        btn_citas.setBackground(new java.awt.Color(255, 255, 255));
        btn_citas.setBorder(null);
        btn_citas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/calendario icono.png"))); // NOI18N
        btn_citas.setBorderPainted(false);
        btn_citas.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_citas.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_citas.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_citas.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_citas.setFocusPainted(false);
        btn_citas.setIconTextGap(0);
        btn_citas.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_citas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_citasActionPerformed(evt);
            }
        });
        Panel_menu.add(btn_citas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 50, -1));

        lb_menu_despegable.setBackground(new java.awt.Color(0, 0, 0));
        lb_menu_despegable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/Menu.png"))); // NOI18N
        lb_menu_despegable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_menu_despegableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_menu_despegableMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_menu_despegableMouseExited(evt);
            }
        });
        Panel_menu.add(lb_menu_despegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

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
        Panel_menu.add(btn_base_datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 50, -1));

        btn_salir1.setBackground(new java.awt.Color(255, 255, 255));
        btn_salir1.setBorder(null);
        btn_salir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-salida-30.png"))); // NOI18N
        btn_salir1.setBorderPainted(false);
        btn_salir1.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_salir1.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_salir1.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_salir1.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_salir1.setFocusPainted(false);
        btn_salir1.setIconTextGap(0);
        btn_salir1.setRippleColor(new java.awt.Color(204, 204, 204));
        Panel_menu.add(btn_salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 680, 50, -1));

        getContentPane().add(Panel_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 70, 740));

        Panel_Menu_despegable.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Menu_despegable.setLayout(new java.awt.CardLayout());
        Panel_Menu_despegable.add(fm_barra_lateral1, "card2");

        getContentPane().add(Panel_Menu_despegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(-340, 0, 340, 740));

        panel_inicio.setName("panel_inicio"); // NOI18N
        panel_inicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("INICIO");
        panel_inicio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 1220, 740));

        rSPanelsSlider1.add(panel_inicio, "card2");

        panel_paciente.setName("panel_paciente"); // NOI18N
        panel_paciente.setLayout(new java.awt.CardLayout());
        panel_paciente.add(frm_02_Patient_Detail1, "card2");

        rSPanelsSlider1.add(panel_paciente, "card3");

        panel_cita.setName("panel_cita"); // NOI18N
        panel_cita.setLayout(new java.awt.CardLayout());
        panel_cita.add(frm_03_reservar_cita1, "card2");

        rSPanelsSlider1.add(panel_cita, "card4");

        panel_factura.setName("panel_factura"); // NOI18N
        panel_factura.setLayout(new java.awt.CardLayout());
        panel_factura.add(frm_04_comprobantes1, "card2");

        rSPanelsSlider1.add(panel_factura, "card5");

        getContentPane().add(rSPanelsSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 1100, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_facturaActionPerformed

if(!this.btn_factura.isSelected()){
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_citas.setSelected(false);
            this.btn_factura.setSelected(true);
            
        rSPanelsSlider1.slidPanel(20, panel_factura, RSPanelsSlider.direct.Right);
        
       }        
    }//GEN-LAST:event_btn_facturaActionPerformed

    private void lb_menu_despegableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_menu_despegableMouseClicked
      
        
        int posicion = this.Panel_Menu_despegable.getX();
        
       if (posicion< -1)
            
       {
           changeimage(lb_menu_despegable, "/WIN34CLC_RESOURCES/icons8-atrás-30.png");
       
        Animacion.Animacion.mover_derecha(-340, 0 , 1, 4, Panel_Menu_despegable);
        
            SwingUtilities.updateComponentTreeUI(this);
          //  frm_03_reservar_cita2.deshabilitar_panel_citas(false);
            //frm_02_Patient_Detail2.deshabilitar_form_paciente(false);
            Panel_Menu_despegable.setVisible(true);
            Panel_Menu_despegable.setEnabled(true);
       }
       
       else
           
       {
            changeimage(lb_menu_despegable, "/WIN34CLC_RESOURCES/icons8-menú-30.png");
           
           Animacion.Animacion.mover_izquierda(0 ,-340, 2, 4, Panel_Menu_despegable);
         //  frm_03_reservar_cita2.deshabilitar_panel_citas(false);
           // frm_02_Patient_Detail2.deshabilitar_form_paciente(false);
           SwingUtilities.updateComponentTreeUI(this);
       }
    }//GEN-LAST:event_lb_menu_despegableMouseClicked

    private void lb_menu_despegableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_menu_despegableMouseEntered
      labelcolor(lb_menu_despegable);
    }//GEN-LAST:event_lb_menu_despegableMouseEntered

    private void lb_menu_despegableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_menu_despegableMouseExited
       resetlabelcolor(lb_menu_despegable);
    }//GEN-LAST:event_lb_menu_despegableMouseExited

    private void btn_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pacienteActionPerformed

if(!this.btn_paciente.isSelected()){
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(true);
            this.btn_citas.setSelected(false);
            this.btn_factura.setSelected(false);
            
        rSPanelsSlider1.slidPanel(20, panel_paciente, RSPanelsSlider.direct.Right);
        
       } 
        
     




        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pacienteActionPerformed

    private void btn_citasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_citasActionPerformed

if(!this.btn_citas.isSelected()){
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_citas.setSelected(true);
            this.btn_factura.setSelected(false);
            
        rSPanelsSlider1.slidPanel(20, panel_cita, RSPanelsSlider.direct.Right);
        
       }       
       
    }//GEN-LAST:event_btn_citasActionPerformed

    private void btn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicioActionPerformed
if(!this.btn_inicio.isSelected()){
            this.btn_inicio.setSelected(true);
            this.btn_paciente.setSelected(false);
            this.btn_citas.setSelected(false);
            this.btn_factura.setSelected(false);
            
        rSPanelsSlider1.slidPanel(20, panel_inicio, RSPanelsSlider.direct.Right);
        
       } 
       
    }//GEN-LAST:event_btn_inicioActionPerformed

    private void btn_base_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_base_datosActionPerformed
       
    }//GEN-LAST:event_btn_base_datosActionPerformed

    private void btn_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_userActionPerformed
       
    }//GEN-LAST:event_btn_userActionPerformed

    private void btn_salir_sistema1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salir_sistema1ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salir_sistema1ActionPerformed

    private void btn_salir_sistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salir_sistemaActionPerformed
        this.setExtendedState(1);
    }//GEN-LAST:event_btn_salir_sistemaActionPerformed

    private void btn_salir_sistema2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salir_sistema2ActionPerformed
  // panel_cerrar.setExtendedState(JFrame.MAXIMIZED_BOTH);   
    }//GEN-LAST:event_btn_salir_sistema2ActionPerformed

 
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Menu_despegable;
    private javax.swing.JPanel Panel_menu;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_base_datos;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_citas;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_factura;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_inicio;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_paciente;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_salir1;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_salir_sistema;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_salir_sistema1;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_salir_sistema2;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_user;
    private WIN33CLC_VIEW.fm_barra_lateral fm_barra_lateral1;
    private WIN33CLC_VIEW.frm_02_Patient_Detail frm_02_Patient_Detail1;
    private WIN33CLC_VIEW.frm_03_reservar_cita frm_03_reservar_cita1;
    private WIN33CLC_VIEW.frm_04_comprobantes frm_04_comprobantes1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_menu_despegable;
    private javax.swing.JPanel panel_cerrar;
    private javax.swing.JPanel panel_cita;
    private javax.swing.JPanel panel_factura;
    private javax.swing.JPanel panel_inicio;
    private javax.swing.JPanel panel_paciente;
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    // End of variables declaration//GEN-END:variables
private void labelcolor(JLabel label){
        label.setBackground(new java.awt.Color(53,162,107));
    }
    
    private void resetlabelcolor(JLabel label){
        label.setBackground(new java.awt.Color(54,70,78));
    }


}

