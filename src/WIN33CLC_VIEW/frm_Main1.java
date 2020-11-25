
package WIN33CLC_VIEW;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.GraphicsEnvironment;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import rojerusan.RSPanelsSlider;

public class frm_Main1 extends javax.swing.JFrame  {
static boolean maximized = true;
 int xMouse;
    int yMouse;
    public frm_Main1() {
        initComponents();
         panel_menu_despegable_2.setVisible(false);
         setBackground(new Color (255,255,255,253));
         
         setLocationRelativeTo(null); 
       //------------------
       
        lblinicio.setBackground(new Color(255,255,255));
        lblpaciente.setBackground(new Color(255,255,255));
        lblcita.setBackground(new Color(255,255,255));
        lblgestioncita.setBackground(new Color(255,255,255));
        lblfactura.setBackground(new Color(255,255,255));
            
    
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
        lblfactura = new javax.swing.JLabel();
        lblinicio = new javax.swing.JLabel();
        lblpaciente = new javax.swing.JLabel();
        lblcita = new javax.swing.JLabel();
        lblgestioncita = new javax.swing.JLabel();
        Panel_menu_opcion2 = new javax.swing.JPanel();
        btn_especialista = new RSMaterialComponent.RSButtonMaterialGradientOne();
        lb_menu_despegable_2 = new javax.swing.JLabel();
        btn_servicios = new RSMaterialComponent.RSButtonMaterialGradientOne();
        min = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_base_datos = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_usuario1 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        maxi = new RSMaterialComponent.RSButtonMaterialGradientOne();
        Panel_Menu_despegable = new javax.swing.JPanel();
        btn_inicio_02 = new newscomponents.RSButtonFlat_new();
        jLabel1 = new javax.swing.JLabel();
        btn_paciente_02 = new newscomponents.RSButtonFlat_new();
        btn_citas_2 = new newscomponents.RSButtonFlat_new();
        btn_gestionar_citas_02 = new newscomponents.RSButtonFlat_new();
        btn_facturas_02 = new newscomponents.RSButtonFlat_new();
        btn_salir_02 = new newscomponents.RSButtonFlat_new();
        panel_menu_despegable_2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_servicios_02 = new newscomponents.RSButtonFlat_new();
        btn_especialista_02 = new newscomponents.RSButtonFlat_new();
        btn_base_datos_2 = new newscomponents.RSButtonFlat_new();
        btn_usuarios_02 = new newscomponents.RSButtonFlat_new();
        rSPanelsSlider1 = new rojerusan.RSPanelsSlider();
        panel_inicio = new javax.swing.JPanel();
        frm_inicio2 = new WIN33CLC_VIEW.frm_inicio();
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
        setPreferredSize(new java.awt.Dimension(1240, 741));
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
        lb_menu_despegable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-menú-30.png"))); // NOI18N
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
        btn_salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salir1ActionPerformed(evt);
            }
        });
        Panel_menu.add(btn_salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 680, 50, -1));

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

        lblfactura.setBackground(new java.awt.Color(101, 208, 250));
        lblfactura.setOpaque(true);
        Panel_menu.add(lblfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 10, 40));

        lblinicio.setBackground(new java.awt.Color(101, 208, 250));
        lblinicio.setOpaque(true);
        Panel_menu.add(lblinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 10, 40));

        lblpaciente.setBackground(new java.awt.Color(101, 208, 250));
        lblpaciente.setOpaque(true);
        Panel_menu.add(lblpaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 10, 40));

        lblcita.setBackground(new java.awt.Color(101, 208, 250));
        lblcita.setOpaque(true);
        Panel_menu.add(lblcita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 10, 40));

        lblgestioncita.setBackground(new java.awt.Color(101, 208, 250));
        lblgestioncita.setOpaque(true);
        Panel_menu.add(lblgestioncita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 10, 40));

        getContentPane().add(Panel_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 740));

        Panel_menu_opcion2.setBackground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout Panel_menu_opcion2Layout = new javax.swing.GroupLayout(Panel_menu_opcion2);
        Panel_menu_opcion2.setLayout(Panel_menu_opcion2Layout);
        Panel_menu_opcion2Layout.setHorizontalGroup(
            Panel_menu_opcion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_menu_opcion2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lb_menu_despegable_2))
            .addGroup(Panel_menu_opcion2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btn_servicios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(Panel_menu_opcion2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btn_especialista, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(Panel_menu_opcion2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btn_base_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(Panel_menu_opcion2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btn_usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(Panel_menu_opcion2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(maxi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(Panel_menu_opcion2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Panel_menu_opcion2Layout.setVerticalGroup(
            Panel_menu_opcion2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_menu_opcion2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lb_menu_despegable_2)
                .addGap(170, 170, 170)
                .addComponent(btn_servicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btn_especialista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(btn_base_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btn_usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(maxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(Panel_menu_opcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, 70, 740));

        Panel_Menu_despegable.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Menu_despegable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        Panel_Menu_despegable.add(btn_inicio_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 270, 140));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("DentalSys");
        Panel_Menu_despegable.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

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
        Panel_Menu_despegable.add(btn_paciente_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 270, 150));

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
        Panel_Menu_despegable.add(btn_citas_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 270, 60));

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
        Panel_Menu_despegable.add(btn_gestionar_citas_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 270, 80));

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
        Panel_Menu_despegable.add(btn_facturas_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 270, 110));

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
        Panel_Menu_despegable.add(btn_salir_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 670, 270, 60));

        getContentPane().add(Panel_Menu_despegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(-340, 0, 340, 740));

        panel_menu_despegable_2.setBackground(new java.awt.Color(255, 255, 255));
        panel_menu_despegable_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("DentalSys ");
        panel_menu_despegable_2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

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
        panel_menu_despegable_2.add(btn_servicios_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 270, 90));

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
        panel_menu_despegable_2.add(btn_especialista_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 270, 80));

        btn_base_datos_2.setBackground(new java.awt.Color(255, 255, 255));
        btn_base_datos_2.setForeground(new java.awt.Color(0, 0, 0));
        btn_base_datos_2.setText("Base de Datos");
        btn_base_datos_2.setBorderPainted(false);
        btn_base_datos_2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_base_datos_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_base_datos_2ActionPerformed(evt);
            }
        });
        panel_menu_despegable_2.add(btn_base_datos_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 270, 90));

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
        panel_menu_despegable_2.add(btn_usuarios_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 270, 80));

        getContentPane().add(panel_menu_despegable_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 340, 740));

        panel_inicio.setName("panel_inicio"); // NOI18N
        panel_inicio.setLayout(new java.awt.CardLayout());
        panel_inicio.add(frm_inicio2, "card2");

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

        getAccessibleContext().setAccessibleParent(this);

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
            
             lblinicio.setBackground(new Color(255,255,255));
        lblpaciente.setBackground(new Color(255,255,255));
        lblcita.setBackground(new Color(255,255,255));
        lblgestioncita.setBackground(new Color(255,255,255));
        lblfactura.setBackground(new Color(101,208,250));
            
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
            
            
            lblinicio.setBackground(new Color(255,255,255));
        lblpaciente.setBackground(new Color(101,208,250));
        lblcita.setBackground(new Color(255,255,255));
        lblgestioncita.setBackground(new Color(255,255,255));
        lblfactura.setBackground(new Color(255,255,255));
            
            
        rSPanelsSlider1.slidPanel(20, panel_paciente, RSPanelsSlider.direct.Right);
        
       } 
        
     




   
    }//GEN-LAST:event_btn_pacienteActionPerformed

    private void btn_citasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_citasActionPerformed

if(!this.btn_citas.isSelected()){
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_citas.setSelected(true);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            this.btn_especialista.setSelected(false);
            
        lblinicio.setBackground(new Color(255,255,255));
        lblpaciente.setBackground(new Color(255,255,255));
        lblcita.setBackground(new Color(101,208,250));
        lblgestioncita.setBackground(new Color(255,255,255));
        lblfactura.setBackground(new Color(255,255,255));
            
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
        
        lblinicio.setBackground(new Color(101,208,250));
        lblpaciente.setBackground(new Color(255,255,255));
        lblcita.setBackground(new Color(255,255,255));
        lblgestioncita.setBackground(new Color(255,255,255));
        lblfactura.setBackground(new Color(255,255,255));
        
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

    private void lb_menu_despegable_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_menu_despegable_2MouseClicked
        int posicion = this.panel_menu_despegable_2.getX();
        
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
       }
    }//GEN-LAST:event_lb_menu_despegable_2MouseClicked

    private void lb_menu_despegable_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_menu_despegable_2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lb_menu_despegable_2MouseEntered

    private void lb_menu_despegable_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_menu_despegable_2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lb_menu_despegable_2MouseExited

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

    private void minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minActionPerformed
  this.setState(Frame.ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_minActionPerformed

    private void btn_base_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_base_datosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_base_datosActionPerformed

    private void btn_gestionar_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gestionar_citaActionPerformed
          lblinicio.setBackground(new Color(255,255,255));
        lblpaciente.setBackground(new Color(255,255,255));
        lblcita.setBackground(new Color(255,255,255));
        lblgestioncita.setBackground(new Color(101,208,250));
        lblfactura.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btn_gestionar_citaActionPerformed

    private void btn_salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salir1ActionPerformed
System.exit(0);
   
    }//GEN-LAST:event_btn_salir1ActionPerformed

    private void btn_inicio_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicio_02ActionPerformed
if(!this.btn_inicio_02.isSelected()){
            
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_citas.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            this.btn_especialista.setSelected(false);
            
            //----------------------------------------
            
            this.btn_inicio_02.setSelected(true);
            this.btn_paciente_02.setSelected(false);
            this.btn_citas_2.setSelected(false);
            this.btn_facturas_02.setSelected(false);
            this.btn_servicios_02.setSelected(false);
            this.btn_especialista_02.setSelected(false);
            
         
            
        rSPanelsSlider1.slidPanel(20, panel_inicio, RSPanelsSlider.direct.Right);
        
        
        Panel_Menu_despegable.setVisible(true);
        
       } 
       
    }//GEN-LAST:event_btn_inicio_02ActionPerformed

    private void btn_paciente_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paciente_02ActionPerformed
if(!this.btn_paciente_02.isSelected()){
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_citas.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            this.btn_especialista.setSelected(false);
            
            //-----------------------------------------
            
            this.btn_inicio_02.setSelected(false);
            this.btn_paciente_02.setSelected(true);
            this.btn_citas_2.setSelected(false);
            this.btn_facturas_02.setSelected(false);
            this.btn_servicios_02.setSelected(false);
            this.btn_especialista_02.setSelected(false);
            
        rSPanelsSlider1.slidPanel(20, panel_paciente, RSPanelsSlider.direct.Right);
        
       } 
    }//GEN-LAST:event_btn_paciente_02ActionPerformed

    private void btn_citas_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_citas_2ActionPerformed
if(!this.btn_citas_2.isSelected()){
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_citas.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            this.btn_especialista.setSelected(false);
            
            //----------------------------------------
            
            this.btn_inicio_02.setSelected(false);
            this.btn_paciente_02.setSelected(false);
            this.btn_citas_2.setSelected(true);
            this.btn_facturas_02.setSelected(false);
            this.btn_servicios_02.setSelected(false);
            this.btn_especialista_02.setSelected(false);
            
        rSPanelsSlider1.slidPanel(20, panel_cita, RSPanelsSlider.direct.Right);
        
       }         
    }//GEN-LAST:event_btn_citas_2ActionPerformed

    private void btn_gestionar_citas_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gestionar_citas_02ActionPerformed

    }//GEN-LAST:event_btn_gestionar_citas_02ActionPerformed

    private void btn_facturas_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_facturas_02ActionPerformed
if(!this.btn_facturas_02.isSelected()){
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_citas.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            this.btn_especialista.setSelected(false);
            
            //----------------------------------------
            
            this.btn_inicio_02.setSelected(false);
            this.btn_paciente_02.setSelected(false);
            this.btn_citas_2.setSelected(false);
            this.btn_facturas_02.setSelected(true);
            this.btn_servicios_02.setSelected(false);
            this.btn_especialista_02.setSelected(false);
            
        rSPanelsSlider1.slidPanel(20, panel_factura, RSPanelsSlider.direct.Right);
        
       }       
    }//GEN-LAST:event_btn_facturas_02ActionPerformed

    private void btn_salir_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salir_02ActionPerformed
System.exit(0);       
    }//GEN-LAST:event_btn_salir_02ActionPerformed

    private void btn_servicios_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_servicios_02ActionPerformed
if(!this.btn_servicios_02.isSelected()){
            this.btn_servicios.setSelected(false);
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_citas.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_especialista.setSelected(false);
            
            //----------------------------------------
            
            this.btn_inicio_02.setSelected(false);
            this.btn_paciente_02.setSelected(false);
            this.btn_citas_2.setSelected(false);
            this.btn_facturas_02.setSelected(false);
            this.btn_servicios_02.setSelected(true);
            this.btn_especialista_02.setSelected(false);
            
        rSPanelsSlider1.slidPanel(20,panel_servicios, RSPanelsSlider.direct.Left);
        
       }        
    }//GEN-LAST:event_btn_servicios_02ActionPerformed

    private void btn_especialista_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_especialista_02ActionPerformed
if(!this.btn_especialista_02.isSelected()){
            this.btn_especialista.setSelected(false);
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_citas.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            
            //----------------------------------------
            
            this.btn_inicio_02.setSelected(false);
            this.btn_paciente_02.setSelected(false);
            this.btn_citas_2.setSelected(false);
            this.btn_facturas_02.setSelected(false);
            this.btn_servicios_02.setSelected(false);
            this.btn_especialista_02.setSelected(true);
            
        rSPanelsSlider1.slidPanel(20,panel_especialista, RSPanelsSlider.direct.Left);
        
       }       
    }//GEN-LAST:event_btn_especialista_02ActionPerformed

    private void btn_base_datos_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_base_datos_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_base_datos_2ActionPerformed

    private void btn_usuarios_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuarios_02ActionPerformed

    }//GEN-LAST:event_btn_usuarios_02ActionPerformed

    private void btn_usuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_usuario1ActionPerformed

    private void maxiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxiActionPerformed
    if(maximized){
          
            frm_Main1.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            frm_Main1.this.setMaximizedBounds(env.getMaximumWindowBounds());
            maximized = false;
        }else{
            setExtendedState(JFrame.NORMAL);
            maximized = true;
        }       
    }//GEN-LAST:event_maxiActionPerformed

 
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Main1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Menu_despegable;
    private javax.swing.JPanel Panel_menu;
    private javax.swing.JPanel Panel_menu_opcion2;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_base_datos;
    private newscomponents.RSButtonFlat_new btn_base_datos_2;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_citas;
    private newscomponents.RSButtonFlat_new btn_citas_2;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_especialista;
    private newscomponents.RSButtonFlat_new btn_especialista_02;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_factura;
    private newscomponents.RSButtonFlat_new btn_facturas_02;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_gestionar_cita;
    private newscomponents.RSButtonFlat_new btn_gestionar_citas_02;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_inicio;
    private newscomponents.RSButtonFlat_new btn_inicio_02;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_paciente;
    private newscomponents.RSButtonFlat_new btn_paciente_02;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_salir1;
    private newscomponents.RSButtonFlat_new btn_salir_02;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_servicios;
    private newscomponents.RSButtonFlat_new btn_servicios_02;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_usuario1;
    private newscomponents.RSButtonFlat_new btn_usuarios_02;
    private WIN33CLC_VIEW.frm_02_Patient_Detail frm_02_Patient_Detail1;
    private WIN33CLC_VIEW.frm_03_reservar_cita frm_03_reservar_cita1;
    private WIN33CLC_VIEW.frm_04_comprobantes frm_04_comprobantes1;
    private WIN33CLC_VIEW.frm_05_servicios frm_05_servicios1;
    private WIN33CLC_VIEW.frm_06_especialistas frm_06_especialistas1;
    private WIN33CLC_VIEW.frm_inicio frm_inicio2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lb_menu_despegable;
    private javax.swing.JLabel lb_menu_despegable_2;
    private javax.swing.JLabel lblcita;
    private javax.swing.JLabel lblfactura;
    private javax.swing.JLabel lblgestioncita;
    private javax.swing.JLabel lblinicio;
    private javax.swing.JLabel lblpaciente;
    private RSMaterialComponent.RSButtonMaterialGradientOne maxi;
    private RSMaterialComponent.RSButtonMaterialGradientOne min;
    private javax.swing.JPanel panel_cita;
    private javax.swing.JPanel panel_especialista;
    private javax.swing.JPanel panel_factura;
    private javax.swing.JPanel panel_inicio;
    private javax.swing.JPanel panel_menu_despegable_2;
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

