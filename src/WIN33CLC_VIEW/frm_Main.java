
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
    
           }
    
    
    
    
    
    public void changeimage(JLabel button, String resourcheimg){
        ImageIcon aimg = new ImageIcon(getClass().getResource(resourcheimg));
        button.setIcon(aimg);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_menu = new javax.swing.JPanel();
        btn_paciente = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_factura = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_inicio = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_citas = new RSMaterialComponent.RSButtonMaterialGradientOne();
        lb_menu_despegable = new javax.swing.JLabel();
        btn_salir1 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_gestionar_cita = new RSMaterialComponent.RSButtonMaterialGradientOne();
        Panel_menu_opcion2 = new javax.swing.JPanel();
        btn_especialista = new RSMaterialComponent.RSButtonMaterialGradientOne();
        lb_menu_despegable1 = new javax.swing.JLabel();
        btn_servicios = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_user1 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_base_datos1 = new RSMaterialComponent.RSButtonMaterialGradientOne();
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
        panel_servicios = new javax.swing.JPanel();
        frm_05_servicios1 = new WIN33CLC_VIEW.frm_05_servicios();
        panel_especialista = new javax.swing.JPanel();
        frm_06_especialistas1 = new WIN33CLC_VIEW.frm_06_especialistas();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        Panel_menu.add(btn_paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 50, -1));

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
        Panel_menu.add(btn_factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 50, -1));

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
        Panel_menu.add(btn_citas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 50, -1));

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
        Panel_menu.add(btn_salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, 50, -1));

        btn_gestionar_cita.setBackground(new java.awt.Color(255, 255, 255));
        btn_gestionar_cita.setBorder(null);
        btn_gestionar_cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-horas-extras-30.png"))); // NOI18N
        btn_gestionar_cita.setBorderPainted(false);
        btn_gestionar_cita.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_gestionar_cita.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_gestionar_cita.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_gestionar_cita.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_gestionar_cita.setFocusPainted(false);
        btn_gestionar_cita.setIconTextGap(0);
        btn_gestionar_cita.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_gestionar_cita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gestionar_citaActionPerformed(evt);
            }
        });
        Panel_menu.add(btn_gestionar_cita, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 50, -1));

        getContentPane().add(Panel_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 70, 740));

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
        Panel_menu_opcion2.add(btn_especialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 50, -1));

        lb_menu_despegable1.setBackground(new java.awt.Color(0, 0, 0));
        lb_menu_despegable1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/Menu.png"))); // NOI18N
        lb_menu_despegable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_menu_despegable1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_menu_despegable1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_menu_despegable1MouseExited(evt);
            }
        });
        Panel_menu_opcion2.add(lb_menu_despegable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

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
        Panel_menu_opcion2.add(btn_servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 50, -1));

        btn_user1.setBackground(new java.awt.Color(255, 255, 255));
        btn_user1.setBorder(null);
        btn_user1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-usuario-masculino-en-círculo-30.png"))); // NOI18N
        btn_user1.setBorderPainted(false);
        btn_user1.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_user1.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_user1.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_user1.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_user1.setFocusPainted(false);
        btn_user1.setIconTextGap(0);
        btn_user1.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_user1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_user1ActionPerformed(evt);
            }
        });
        Panel_menu_opcion2.add(btn_user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 50, -1));

        btn_base_datos1.setBackground(new java.awt.Color(255, 255, 255));
        btn_base_datos1.setBorder(null);
        btn_base_datos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-base-de-datos-30.png"))); // NOI18N
        btn_base_datos1.setBorderPainted(false);
        btn_base_datos1.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_base_datos1.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_base_datos1.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_base_datos1.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_base_datos1.setFocusPainted(false);
        btn_base_datos1.setIconTextGap(0);
        btn_base_datos1.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_base_datos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_base_datos1ActionPerformed(evt);
            }
        });
        Panel_menu_opcion2.add(btn_base_datos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 50, -1));

        getContentPane().add(Panel_menu_opcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, 70, 740));

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

        panel_servicios.setName("panel_servicios"); // NOI18N
        panel_servicios.setLayout(new java.awt.CardLayout());
        panel_servicios.add(frm_05_servicios1, "card2");

        rSPanelsSlider1.add(panel_servicios, "card6");

        panel_especialista.setName("panel_especialista"); // NOI18N
        panel_especialista.setLayout(new java.awt.CardLayout());
        panel_especialista.add(frm_06_especialistas1, "card2");

        rSPanelsSlider1.add(panel_especialista, "card3");

        getContentPane().add(rSPanelsSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 1100, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_facturaActionPerformed

if(!this.btn_factura.isSelected()){
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_citas.setSelected(false);
            this.btn_factura.setSelected(true);
            this.btn_servicios.setSelected(false);
            this.btn_especialista.setSelected(false);
            
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
            this.btn_servicios.setSelected(false);
            this.btn_especialista.setSelected(false);
            
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
            this.btn_servicios.setSelected(false);
            this.btn_especialista.setSelected(false);
            
        rSPanelsSlider1.slidPanel(20, panel_cita, RSPanelsSlider.direct.Right);
        
       }       
       
    }//GEN-LAST:event_btn_citasActionPerformed

    private void btn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicioActionPerformed
if(!this.btn_inicio.isSelected()){
            this.btn_inicio.setSelected(true);
            this.btn_paciente.setSelected(false);
            this.btn_citas.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            this.btn_especialista.setSelected(false);
            
        rSPanelsSlider1.slidPanel(20, panel_inicio, RSPanelsSlider.direct.Right);
        
       } 
       
    }//GEN-LAST:event_btn_inicioActionPerformed

    private void btn_especialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_especialistaActionPerformed
     if(!this.btn_especialista.isSelected()){
            this.btn_especialista.setSelected(true);
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_citas.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            
        rSPanelsSlider1.slidPanel(20,panel_especialista, RSPanelsSlider.direct.Left);
        
       }        
        
        
        
        
    }//GEN-LAST:event_btn_especialistaActionPerformed

    private void lb_menu_despegable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_menu_despegable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lb_menu_despegable1MouseClicked

    private void lb_menu_despegable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_menu_despegable1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lb_menu_despegable1MouseEntered

    private void lb_menu_despegable1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_menu_despegable1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lb_menu_despegable1MouseExited

    private void btn_serviciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_serviciosActionPerformed
if(!this.btn_servicios.isSelected()){
            this.btn_servicios.setSelected(true);
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_citas.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_especialista.setSelected(false);
            
        rSPanelsSlider1.slidPanel(20,panel_servicios, RSPanelsSlider.direct.Left);
        
       }        
    }//GEN-LAST:event_btn_serviciosActionPerformed

    private void btn_user1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_user1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_user1ActionPerformed

    private void btn_base_datos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_base_datos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_base_datos1ActionPerformed

    private void btn_gestionar_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gestionar_citaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_gestionar_citaActionPerformed

 
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
    private javax.swing.JPanel Panel_menu_opcion2;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_base_datos1;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_citas;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_especialista;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_factura;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_gestionar_cita;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_inicio;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_paciente;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_salir1;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_servicios;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_user1;
    private WIN33CLC_VIEW.fm_barra_lateral fm_barra_lateral1;
    private WIN33CLC_VIEW.frm_02_Patient_Detail frm_02_Patient_Detail1;
    private WIN33CLC_VIEW.frm_03_reservar_cita frm_03_reservar_cita1;
    private WIN33CLC_VIEW.frm_04_comprobantes frm_04_comprobantes1;
    private WIN33CLC_VIEW.frm_05_servicios frm_05_servicios1;
    private WIN33CLC_VIEW.frm_06_especialistas frm_06_especialistas1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_menu_despegable;
    private javax.swing.JLabel lb_menu_despegable1;
    private javax.swing.JPanel panel_cita;
    private javax.swing.JPanel panel_especialista;
    private javax.swing.JPanel panel_factura;
    private javax.swing.JPanel panel_inicio;
    private javax.swing.JPanel panel_paciente;
    private javax.swing.JPanel panel_servicios;
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    // End of variables declaration//GEN-END:variables
private void labelcolor(JLabel label){
        label.setBackground(new java.awt.Color(53,162,107));
    }
    
    private void resetlabelcolor(JLabel label){
        label.setBackground(new java.awt.Color(54,70,78));
    }


}

