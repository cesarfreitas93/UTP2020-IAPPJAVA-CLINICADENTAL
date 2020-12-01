
package WIN33CLC_VIEW;

import RSMaterialComponent.RSButtonMaterialGradientOne;
import static WIN33CLC_VIEW.frm_Main.maximized;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GraphicsEnvironment;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import rojerusan.RSPanelsSlider;

public class UI_v5_11111 extends javax.swing.JFrame {
 static boolean maximized = true;
boolean a=true;


    public UI_v5_11111() {
        initComponents();
        rSPanelMaterial4.setBackground(new Color (255,255,255,0));
        rSPanelMaterial4.setOpaque(false);

      
        setBackground(new Color (255,255,255,200));
        setLocationRelativeTo(null);
       
        
         //------------------
       labels_iniciales();
    
        colores_menus_despegables();
        
        
        
           frm_UI_01_Patien1.ocultar_form_patient(false);
           frm_UI_02_reservar_cita1.ocultar_form_cita(false);
           frm_UI_03_gestionar_citas1.ocultar_form_gestion(false);
           frm_UI_04_comprobantes2.ocultar_form_comprobantes(false);
           frm_UI_05_servicios1.ocultar_form_servicios(false);
           frm_UI_06_especialista11.ocultar_form_especialista(false);
           frm_UI_07_usuarios1.ocultar_form_usuarios(false);
           frm_UI_inicio2.ocultar_form_inicio(true);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_menu2 = new RSMaterialComponent.RSPanelMaterial();
        lbl_menu_2 = new javax.swing.JLabel();
        panel_despegable_1 = new RSMaterialComponent.RSPanelMaterial();
        btn_inicio_02 = new newscomponents.RSButtonFlat_new();
        btn_paciente_02 = new newscomponents.RSButtonFlat_new();
        btn_cita_02 = new newscomponents.RSButtonFlat_new();
        btn_gestionar_cita_02 = new newscomponents.RSButtonFlat_new();
        btn_comprobante_02 = new newscomponents.RSButtonFlat_new();
        menu_02 = new RSMaterialComponent.RSPanelMaterial();
        lblservicios = new javax.swing.JLabel();
        btn_servicios = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_usuario = new RSMaterialComponent.RSButtonMaterialGradientOne();
        lblusuarios = new javax.swing.JLabel();
        btn_especialista = new RSMaterialComponent.RSButtonMaterialGradientOne();
        lblespecialista = new javax.swing.JLabel();
        rSPanelMaterial4 = new RSMaterialComponent.RSPanelMaterial();
        panel_inicio = new javax.swing.JPanel();
        frm_UI_inicio2 = new WIN33CLC_VIEW.frm_UI_inicio();
        panel_paciente = new javax.swing.JPanel();
        frm_UI_01_Patien1 = new WIN33CLC_VIEW.frm_UI_01_Patien();
        panel_cita = new javax.swing.JPanel();
        frm_UI_02_reservar_cita1 = new WIN33CLC_VIEW.frm_UI_02_reservar_cita();
        panel_gestion_cita = new javax.swing.JPanel();
        frm_UI_03_gestionar_citas1 = new WIN33CLC_VIEW.frm_UI_03_gestionar_citas();
        panel_comprobante = new javax.swing.JPanel();
        frm_UI_04_comprobantes2 = new WIN33CLC_VIEW.frm_UI_04_comprobantes();
        panel_servicios = new javax.swing.JPanel();
        frm_UI_05_servicios1 = new WIN33CLC_VIEW.frm_UI_05_servicios();
        panel_especialista = new javax.swing.JPanel();
        frm_UI_06_especialista11 = new WIN33CLC_VIEW.frm_UI_06_especialista1();
        panel_usuarios = new javax.swing.JPanel();
        frm_UI_07_usuarios1 = new WIN33CLC_VIEW.frm_UI_07_usuarios();
        menu_ventana = new RSMaterialComponent.RSPanelMaterial();
        btn_min = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_max = new RSMaterialComponent.RSButtonMaterialGradientOne();
        menu_01 = new RSMaterialComponent.RSPanelMaterial();
        lblinicio = new javax.swing.JLabel();
        btn_inicio = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_paciente = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_cita = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_gestionar_cita = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_factura = new RSMaterialComponent.RSButtonMaterialGradientOne();
        lblpacientes = new javax.swing.JLabel();
        lblcita = new javax.swing.JLabel();
        lblgestionar_cita = new javax.swing.JLabel();
        lblfactura = new javax.swing.JLabel();
        menu_salir = new RSMaterialComponent.RSPanelMaterial();
        btn_salir = new RSMaterialComponent.RSButtonMaterialGradientOne();
        panel_menu = new RSMaterialComponent.RSPanelMaterial();
        lbl_menu_1 = new javax.swing.JLabel();
        panel_despegable_2 = new RSMaterialComponent.RSPanelMaterial();
        btn_servicios_02 = new newscomponents.RSButtonFlat_new();
        btn_usuario_02 = new newscomponents.RSButtonFlat_new();
        btn_especialista_02 = new newscomponents.RSButtonFlat_new();
        panel_despegable_base_datos = new RSMaterialComponent.RSPanelMaterial();
        btn_restaurar_bd = new newscomponents.RSButtonFlat_new();
        btn_vaciar_bd = new newscomponents.RSButtonFlat_new();
        btn_copia_Seguridad_bd = new newscomponents.RSButtonFlat_new();
        panel_despegable_ventana = new RSMaterialComponent.RSPanelMaterial();
        btn_max_02 = new newscomponents.RSButtonFlat_new();
        btn_min_02 = new newscomponents.RSButtonFlat_new();
        panel_despegable_titulo_2 = new RSMaterialComponent.RSPanelMaterial();
        jLabel1 = new javax.swing.JLabel();
        menu_bd = new RSMaterialComponent.RSPanelMaterial();
        btn_base_datos = new RSMaterialComponent.RSButtonMaterialGradientOne();
        lblbasedatos = new javax.swing.JLabel();
        panel_despegable_titulo_1 = new RSMaterialComponent.RSPanelMaterial();
        jLabel2 = new javax.swing.JLabel();
        panel_despegable_salir_1 = new RSMaterialComponent.RSPanelMaterial();
        btn_salir_02 = new javax.swing.JLabel();
        menu_salir1 = new RSMaterialComponent.RSPanelMaterial();
        lblreporte = new javax.swing.JLabel();
        btn_reportes = new RSMaterialComponent.RSButtonMaterialGradientOne();
        panel_despegable_reportes = new RSMaterialComponent.RSPanelMaterial();
        btn_reporte_cita = new newscomponents.RSButtonFlat_new();
        btn_reportes_facturas = new newscomponents.RSButtonFlat_new();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel_menu2.setBackground(new java.awt.Color(255, 255, 255));
        panel_menu2.setBgShade(new java.awt.Color(204, 204, 204));
        panel_menu2.setPreferredSize(new java.awt.Dimension(90, 62));
        panel_menu2.setRound(40);

        lbl_menu_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-menú-30.png"))); // NOI18N
        lbl_menu_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_menu_2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_menu2Layout = new javax.swing.GroupLayout(panel_menu2);
        panel_menu2.setLayout(panel_menu2Layout);
        panel_menu2Layout.setHorizontalGroup(
            panel_menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menu2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbl_menu_2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_menu2Layout.setVerticalGroup(
            panel_menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menu2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_menu_2)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        panel_despegable_1.setBackground(new java.awt.Color(255, 255, 255));
        panel_despegable_1.setBgShade(new java.awt.Color(255, 255, 255));
        panel_despegable_1.setPixels(2);
        panel_despegable_1.setPreferredSize(new java.awt.Dimension(10, 722));
        panel_despegable_1.setRound(40);

        btn_inicio_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_inicio_02.setForeground(new java.awt.Color(104, 102, 110));
        btn_inicio_02.setText("Inicio");
        btn_inicio_02.setBorderPainted(false);
        btn_inicio_02.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_inicio_02.setRolloverEnabled(false);
        btn_inicio_02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_inicio_02MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_inicio_02MouseExited(evt);
            }
        });
        btn_inicio_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicio_02ActionPerformed(evt);
            }
        });

        btn_paciente_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_paciente_02.setForeground(new java.awt.Color(104, 102, 110));
        btn_paciente_02.setText("Paciente");
        btn_paciente_02.setBorderPainted(false);
        btn_paciente_02.setDefaultCapable(false);
        btn_paciente_02.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_paciente_02.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btn_paciente_02.setIconTextGap(0);
        btn_paciente_02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_paciente_02MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_paciente_02MouseExited(evt);
            }
        });
        btn_paciente_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paciente_02ActionPerformed(evt);
            }
        });

        btn_cita_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_cita_02.setForeground(new java.awt.Color(104, 102, 110));
        btn_cita_02.setText("Reserva de Cita");
        btn_cita_02.setBorderPainted(false);
        btn_cita_02.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_cita_02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cita_02MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cita_02MouseExited(evt);
            }
        });
        btn_cita_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cita_02ActionPerformed(evt);
            }
        });

        btn_gestionar_cita_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_gestionar_cita_02.setForeground(new java.awt.Color(104, 102, 110));
        btn_gestionar_cita_02.setText("Gestión de Citas");
        btn_gestionar_cita_02.setBorderPainted(false);
        btn_gestionar_cita_02.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_gestionar_cita_02.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btn_gestionar_cita_02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_gestionar_cita_02MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_gestionar_cita_02MouseExited(evt);
            }
        });
        btn_gestionar_cita_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gestionar_cita_02ActionPerformed(evt);
            }
        });

        btn_comprobante_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_comprobante_02.setForeground(new java.awt.Color(104, 102, 110));
        btn_comprobante_02.setText("Comprobante");
        btn_comprobante_02.setBorderPainted(false);
        btn_comprobante_02.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_comprobante_02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_comprobante_02MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_comprobante_02MouseExited(evt);
            }
        });
        btn_comprobante_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comprobante_02ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_despegable_1Layout = new javax.swing.GroupLayout(panel_despegable_1);
        panel_despegable_1.setLayout(panel_despegable_1Layout);
        panel_despegable_1Layout.setHorizontalGroup(
            panel_despegable_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_despegable_1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_despegable_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_inicio_02, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn_paciente_02, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn_cita_02, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn_gestionar_cita_02, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn_comprobante_02, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_despegable_1Layout.setVerticalGroup(
            panel_despegable_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_despegable_1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btn_inicio_02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(btn_paciente_02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_cita_02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_gestionar_cita_02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_comprobante_02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        menu_02.setBackground(new java.awt.Color(255, 255, 255));
        menu_02.setBgShade(new java.awt.Color(204, 204, 204));
        menu_02.setRound(40);

        lblservicios.setBackground(new java.awt.Color(101, 208, 250));
        lblservicios.setOpaque(true);

        btn_servicios.setBackground(new java.awt.Color(255, 255, 255));
        btn_servicios.setBorder(null);
        btn_servicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-maletín-médico-30.png"))); // NOI18N
        btn_servicios.setBorderPainted(false);
        btn_servicios.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_servicios.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_servicios.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_servicios.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_servicios.setFocusPainted(false);
        btn_servicios.setIconTextGap(0);
        btn_servicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_serviciosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_serviciosMouseExited(evt);
            }
        });
        btn_servicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_serviciosActionPerformed(evt);
            }
        });

        btn_usuario.setBackground(new java.awt.Color(255, 255, 255));
        btn_usuario.setBorder(null);
        btn_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-usuario-masculino-en-círculo-30 (1).png"))); // NOI18N
        btn_usuario.setBorderPainted(false);
        btn_usuario.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_usuario.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_usuario.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_usuario.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_usuario.setFocusPainted(false);
        btn_usuario.setIconTextGap(0);
        btn_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_usuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_usuarioMouseExited(evt);
            }
        });
        btn_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuarioActionPerformed(evt);
            }
        });

        lblusuarios.setBackground(new java.awt.Color(101, 208, 250));
        lblusuarios.setOpaque(true);

        btn_especialista.setBackground(new java.awt.Color(255, 255, 255));
        btn_especialista.setBorder(null);
        btn_especialista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-doctor-en-medicina-30.png"))); // NOI18N
        btn_especialista.setBorderPainted(false);
        btn_especialista.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_especialista.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_especialista.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_especialista.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_especialista.setFocusPainted(false);
        btn_especialista.setIconTextGap(0);
        btn_especialista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_especialistaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_especialistaMouseExited(evt);
            }
        });
        btn_especialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_especialistaActionPerformed(evt);
            }
        });

        lblespecialista.setBackground(new java.awt.Color(101, 208, 250));
        lblespecialista.setOpaque(true);

        javax.swing.GroupLayout menu_02Layout = new javax.swing.GroupLayout(menu_02);
        menu_02.setLayout(menu_02Layout);
        menu_02Layout.setHorizontalGroup(
            menu_02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_02Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(menu_02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_02Layout.createSequentialGroup()
                        .addComponent(btn_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblusuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_02Layout.createSequentialGroup()
                        .addComponent(btn_especialista, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblespecialista, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_02Layout.createSequentialGroup()
                        .addComponent(btn_servicios, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblservicios, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu_02Layout.setVerticalGroup(
            menu_02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_02Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(menu_02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblservicios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_servicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(menu_02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblespecialista, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_especialista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menu_02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblusuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
        );

        rSPanelMaterial4.setBackground(new java.awt.Color(255, 255, 255));
        rSPanelMaterial4.setBgShade(new java.awt.Color(204, 204, 204));
        rSPanelMaterial4.setPreferredSize(new java.awt.Dimension(989, 461));
        rSPanelMaterial4.setRound(40);
        rSPanelMaterial4.setLayout(new java.awt.CardLayout());

        panel_inicio.setBackground(new java.awt.Color(255, 255, 255));
        panel_inicio.setName("panel_inicio"); // NOI18N
        panel_inicio.setLayout(new java.awt.CardLayout());
        panel_inicio.add(frm_UI_inicio2, "card2");

        rSPanelMaterial4.add(panel_inicio, "card3");

        panel_paciente.setBackground(new java.awt.Color(255, 255, 255));
        panel_paciente.setName("panel_paciente"); // NOI18N
        panel_paciente.setLayout(new java.awt.CardLayout());
        panel_paciente.add(frm_UI_01_Patien1, "card2");

        rSPanelMaterial4.add(panel_paciente, "card3");

        panel_cita.setBackground(new java.awt.Color(255, 255, 255));
        panel_cita.setName("panel_cita"); // NOI18N
        panel_cita.setLayout(new java.awt.CardLayout());
        panel_cita.add(frm_UI_02_reservar_cita1, "card2");

        rSPanelMaterial4.add(panel_cita, "card3");

        panel_gestion_cita.setBackground(new java.awt.Color(255, 255, 255));
        panel_gestion_cita.setName("panel_gestion_cita"); // NOI18N
        panel_gestion_cita.setLayout(new java.awt.CardLayout());
        panel_gestion_cita.add(frm_UI_03_gestionar_citas1, "card2");

        rSPanelMaterial4.add(panel_gestion_cita, "card2");

        panel_comprobante.setBackground(new java.awt.Color(255, 255, 255));
        panel_comprobante.setName("panel_comprobante"); // NOI18N
        panel_comprobante.setLayout(new java.awt.CardLayout());
        panel_comprobante.add(frm_UI_04_comprobantes2, "card2");

        rSPanelMaterial4.add(panel_comprobante, "card3");

        panel_servicios.setBackground(new java.awt.Color(255, 255, 255));
        panel_servicios.setName("panel_servicios"); // NOI18N
        panel_servicios.setLayout(new java.awt.CardLayout());
        panel_servicios.add(frm_UI_05_servicios1, "card2");

        rSPanelMaterial4.add(panel_servicios, "card3");

        panel_especialista.setBackground(new java.awt.Color(255, 255, 255));
        panel_especialista.setName("panel_especialista"); // NOI18N
        panel_especialista.setLayout(new java.awt.CardLayout());
        panel_especialista.add(frm_UI_06_especialista11, "card2");

        rSPanelMaterial4.add(panel_especialista, "card3");

        panel_usuarios.setBackground(new java.awt.Color(255, 255, 255));
        panel_usuarios.setName("panel_usuarios"); // NOI18N
        panel_usuarios.setLayout(new java.awt.CardLayout());
        panel_usuarios.add(frm_UI_07_usuarios1, "card2");

        rSPanelMaterial4.add(panel_usuarios, "card3");

        menu_ventana.setBackground(new java.awt.Color(255, 255, 255));
        menu_ventana.setBgShade(new java.awt.Color(204, 204, 204));
        menu_ventana.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_ventana.setRound(40);

        btn_min.setBackground(new java.awt.Color(255, 255, 255));
        btn_min.setBorder(null);
        btn_min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-menos-30 (1).png"))); // NOI18N
        btn_min.setBorderPainted(false);
        btn_min.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_min.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_min.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_min.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_min.setFocusPainted(false);
        btn_min.setIconTextGap(0);
        btn_min.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_minMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_minMouseExited(evt);
            }
        });
        btn_min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minActionPerformed(evt);
            }
        });

        btn_max.setBackground(new java.awt.Color(255, 255, 255));
        btn_max.setBorder(null);
        btn_max.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-rectángulo-redondeado-30.png"))); // NOI18N
        btn_max.setBorderPainted(false);
        btn_max.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_max.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_max.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_max.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_max.setFocusPainted(false);
        btn_max.setIconTextGap(0);
        btn_max.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_max.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_maxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_maxMouseExited(evt);
            }
        });
        btn_max.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_maxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu_ventanaLayout = new javax.swing.GroupLayout(menu_ventana);
        menu_ventana.setLayout(menu_ventanaLayout);
        menu_ventanaLayout.setHorizontalGroup(
            menu_ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_ventanaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(menu_ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_max, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_min, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        menu_ventanaLayout.setVerticalGroup(
            menu_ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_ventanaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_max, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_min, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        menu_01.setBackground(new java.awt.Color(255, 255, 255));
        menu_01.setBgShade(new java.awt.Color(204, 204, 204));
        menu_01.setRound(40);

        lblinicio.setBackground(new java.awt.Color(101, 208, 250));
        lblinicio.setOpaque(true);

        btn_inicio.setBackground(new java.awt.Color(255, 255, 255));
        btn_inicio.setBorder(null);
        btn_inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-casa-30 (1).png"))); // NOI18N
        btn_inicio.setBorderPainted(false);
        btn_inicio.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_inicio.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_inicio.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_inicio.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_inicio.setFocusPainted(false);
        btn_inicio.setIconTextGap(0);
        btn_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_inicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_inicioMouseExited(evt);
            }
        });
        btn_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicioActionPerformed(evt);
            }
        });

        btn_paciente.setBackground(new java.awt.Color(255, 255, 255));
        btn_paciente.setBorder(null);
        btn_paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-persona-de-sexo-masculino-30 (2).png"))); // NOI18N
        btn_paciente.setBorderPainted(false);
        btn_paciente.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_paciente.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_paciente.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_paciente.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_paciente.setFocusPainted(false);
        btn_paciente.setIconTextGap(0);
        btn_paciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_pacienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_pacienteMouseExited(evt);
            }
        });
        btn_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pacienteActionPerformed(evt);
            }
        });

        btn_cita.setBackground(new java.awt.Color(255, 255, 255));
        btn_cita.setBorder(null);
        btn_cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-calendario-30 (1).png"))); // NOI18N
        btn_cita.setBorderPainted(false);
        btn_cita.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_cita.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_cita.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_cita.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_cita.setFocusPainted(false);
        btn_cita.setIconTextGap(0);
        btn_cita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_citaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_citaMouseExited(evt);
            }
        });
        btn_cita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_citaActionPerformed(evt);
            }
        });

        btn_gestionar_cita.setBackground(new java.awt.Color(255, 255, 255));
        btn_gestionar_cita.setBorder(null);
        btn_gestionar_cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-horas-extras-30 (1).png"))); // NOI18N
        btn_gestionar_cita.setBorderPainted(false);
        btn_gestionar_cita.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_gestionar_cita.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_gestionar_cita.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_gestionar_cita.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_gestionar_cita.setFocusPainted(false);
        btn_gestionar_cita.setIconTextGap(0);
        btn_gestionar_cita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_gestionar_citaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_gestionar_citaMouseExited(evt);
            }
        });
        btn_gestionar_cita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gestionar_citaActionPerformed(evt);
            }
        });

        btn_factura.setBackground(new java.awt.Color(255, 255, 255));
        btn_factura.setBorder(null);
        btn_factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-factura-30 (1).png"))); // NOI18N
        btn_factura.setBorderPainted(false);
        btn_factura.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_factura.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_factura.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_factura.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_factura.setFocusPainted(false);
        btn_factura.setIconTextGap(0);
        btn_factura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_facturaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_facturaMouseExited(evt);
            }
        });
        btn_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_facturaActionPerformed(evt);
            }
        });

        lblpacientes.setBackground(new java.awt.Color(101, 208, 250));
        lblpacientes.setOpaque(true);

        lblcita.setBackground(new java.awt.Color(101, 208, 250));
        lblcita.setOpaque(true);

        lblgestionar_cita.setBackground(new java.awt.Color(101, 208, 250));
        lblgestionar_cita.setOpaque(true);

        lblfactura.setBackground(new java.awt.Color(101, 208, 250));
        lblfactura.setOpaque(true);

        javax.swing.GroupLayout menu_01Layout = new javax.swing.GroupLayout(menu_01);
        menu_01.setLayout(menu_01Layout);
        menu_01Layout.setHorizontalGroup(
            menu_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_01Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(menu_01Layout.createSequentialGroup()
                        .addComponent(lblfactura, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menu_01Layout.createSequentialGroup()
                        .addComponent(lblgestionar_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_gestionar_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menu_01Layout.createSequentialGroup()
                        .addComponent(lblcita, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menu_01Layout.createSequentialGroup()
                        .addComponent(lblpacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menu_01Layout.createSequentialGroup()
                        .addComponent(lblinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        menu_01Layout.setVerticalGroup(
            menu_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_01Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(menu_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menu_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(menu_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_cita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcita, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(menu_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_gestionar_cita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblgestionar_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(menu_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfactura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        menu_salir.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir.setRound(40);

        btn_salir.setBackground(new java.awt.Color(255, 255, 255));
        btn_salir.setBorder(null);
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/apagar.png"))); // NOI18N
        btn_salir.setBorderPainted(false);
        btn_salir.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_salir.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_salir.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_salir.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_salir.setFocusPainted(false);
        btn_salir.setIconTextGap(0);
        btn_salir.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_salirMouseExited(evt);
            }
        });
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu_salirLayout = new javax.swing.GroupLayout(menu_salir);
        menu_salir.setLayout(menu_salirLayout);
        menu_salirLayout.setHorizontalGroup(
            menu_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_salirLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        menu_salirLayout.setVerticalGroup(
            menu_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        panel_menu.setBackground(new java.awt.Color(255, 255, 255));
        panel_menu.setBgShade(new java.awt.Color(204, 204, 204));
        panel_menu.setPreferredSize(new java.awt.Dimension(90, 62));
        panel_menu.setRound(40);

        lbl_menu_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-menú-30.png"))); // NOI18N
        lbl_menu_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_menu_1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_menuLayout = new javax.swing.GroupLayout(panel_menu);
        panel_menu.setLayout(panel_menuLayout);
        panel_menuLayout.setHorizontalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbl_menu_1)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        panel_menuLayout.setVerticalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_menu_1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        panel_despegable_2.setBackground(new java.awt.Color(255, 255, 255));
        panel_despegable_2.setBgShade(new java.awt.Color(255, 255, 255));
        panel_despegable_2.setPixels(2);
        panel_despegable_2.setPreferredSize(new java.awt.Dimension(10, 722));
        panel_despegable_2.setRound(40);

        btn_servicios_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_servicios_02.setForeground(new java.awt.Color(104, 102, 110));
        btn_servicios_02.setText("Servicios");
        btn_servicios_02.setBorderPainted(false);
        btn_servicios_02.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_servicios_02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_servicios_02MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_servicios_02MouseExited(evt);
            }
        });
        btn_servicios_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_servicios_02ActionPerformed(evt);
            }
        });

        btn_usuario_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_usuario_02.setForeground(new java.awt.Color(104, 102, 110));
        btn_usuario_02.setText("Usuarios");
        btn_usuario_02.setBorderPainted(false);
        btn_usuario_02.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_usuario_02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_usuario_02MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_usuario_02MouseExited(evt);
            }
        });
        btn_usuario_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuario_02ActionPerformed(evt);
            }
        });

        btn_especialista_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_especialista_02.setForeground(new java.awt.Color(104, 102, 110));
        btn_especialista_02.setText("Especialista");
        btn_especialista_02.setBorderPainted(false);
        btn_especialista_02.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_especialista_02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_especialista_02MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_especialista_02MouseExited(evt);
            }
        });
        btn_especialista_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_especialista_02ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_despegable_2Layout = new javax.swing.GroupLayout(panel_despegable_2);
        panel_despegable_2.setLayout(panel_despegable_2Layout);
        panel_despegable_2Layout.setHorizontalGroup(
            panel_despegable_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_despegable_2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panel_despegable_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_especialista_02, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_usuario_02, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_servicios_02, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_despegable_2Layout.setVerticalGroup(
            panel_despegable_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_despegable_2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(btn_servicios_02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btn_especialista_02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_usuario_02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );

        panel_despegable_base_datos.setBackground(new java.awt.Color(255, 255, 255));
        panel_despegable_base_datos.setBgShade(new java.awt.Color(255, 255, 255));
        panel_despegable_base_datos.setPixels(2);
        panel_despegable_base_datos.setPreferredSize(new java.awt.Dimension(10, 722));
        panel_despegable_base_datos.setRound(40);

        btn_restaurar_bd.setBackground(new java.awt.Color(255, 255, 255));
        btn_restaurar_bd.setForeground(new java.awt.Color(104, 102, 110));
        btn_restaurar_bd.setText("Restaurar BD");
        btn_restaurar_bd.setBorderPainted(false);
        btn_restaurar_bd.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btn_restaurar_bd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_restaurar_bdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_restaurar_bdMouseExited(evt);
            }
        });
        btn_restaurar_bd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaurar_bdActionPerformed(evt);
            }
        });

        btn_vaciar_bd.setBackground(new java.awt.Color(255, 255, 255));
        btn_vaciar_bd.setForeground(new java.awt.Color(104, 102, 110));
        btn_vaciar_bd.setText("Vaciar BD");
        btn_vaciar_bd.setBorderPainted(false);
        btn_vaciar_bd.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btn_vaciar_bd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_vaciar_bdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_vaciar_bdMouseExited(evt);
            }
        });
        btn_vaciar_bd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vaciar_bdActionPerformed(evt);
            }
        });

        btn_copia_Seguridad_bd.setBackground(new java.awt.Color(255, 255, 255));
        btn_copia_Seguridad_bd.setForeground(new java.awt.Color(104, 102, 110));
        btn_copia_Seguridad_bd.setText("Copia de Seguridad BD");
        btn_copia_Seguridad_bd.setBorderPainted(false);
        btn_copia_Seguridad_bd.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btn_copia_Seguridad_bd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_copia_Seguridad_bdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_copia_Seguridad_bdMouseExited(evt);
            }
        });
        btn_copia_Seguridad_bd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_copia_Seguridad_bdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_despegable_base_datosLayout = new javax.swing.GroupLayout(panel_despegable_base_datos);
        panel_despegable_base_datos.setLayout(panel_despegable_base_datosLayout);
        panel_despegable_base_datosLayout.setHorizontalGroup(
            panel_despegable_base_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_despegable_base_datosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panel_despegable_base_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_restaurar_bd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(btn_vaciar_bd, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn_copia_Seguridad_bd, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_despegable_base_datosLayout.setVerticalGroup(
            panel_despegable_base_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_despegable_base_datosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btn_copia_Seguridad_bd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_restaurar_bd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_vaciar_bd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        panel_despegable_ventana.setBackground(new java.awt.Color(255, 255, 255));
        panel_despegable_ventana.setBgShade(new java.awt.Color(255, 255, 255));
        panel_despegable_ventana.setPixels(2);
        panel_despegable_ventana.setPreferredSize(new java.awt.Dimension(10, 722));
        panel_despegable_ventana.setRound(40);

        btn_max_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_max_02.setForeground(new java.awt.Color(104, 102, 110));
        btn_max_02.setText("Maximizar");
        btn_max_02.setBorderPainted(false);
        btn_max_02.setFont(new java.awt.Font("Segoe UI Black", 0, 17)); // NOI18N
        btn_max_02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_max_02MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_max_02MouseExited(evt);
            }
        });
        btn_max_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_max_02ActionPerformed(evt);
            }
        });

        btn_min_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_min_02.setForeground(new java.awt.Color(104, 102, 110));
        btn_min_02.setText("Minimizar");
        btn_min_02.setBorderPainted(false);
        btn_min_02.setFont(new java.awt.Font("Segoe UI Black", 0, 17)); // NOI18N
        btn_min_02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_min_02MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_min_02MouseExited(evt);
            }
        });
        btn_min_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_min_02ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_despegable_ventanaLayout = new javax.swing.GroupLayout(panel_despegable_ventana);
        panel_despegable_ventana.setLayout(panel_despegable_ventanaLayout);
        panel_despegable_ventanaLayout.setHorizontalGroup(
            panel_despegable_ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_despegable_ventanaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panel_despegable_ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_min_02, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_max_02, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_despegable_ventanaLayout.setVerticalGroup(
            panel_despegable_ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_despegable_ventanaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btn_max_02, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_min_02, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_despegable_titulo_2.setBackground(new java.awt.Color(255, 255, 255));
        panel_despegable_titulo_2.setBgShade(new java.awt.Color(255, 255, 255));
        panel_despegable_titulo_2.setPixels(2);
        panel_despegable_titulo_2.setPreferredSize(new java.awt.Dimension(10, 722));
        panel_despegable_titulo_2.setRound(40);

        jLabel1.setBackground(new java.awt.Color(104, 102, 110));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setText("DENTALSYS");

        javax.swing.GroupLayout panel_despegable_titulo_2Layout = new javax.swing.GroupLayout(panel_despegable_titulo_2);
        panel_despegable_titulo_2.setLayout(panel_despegable_titulo_2Layout);
        panel_despegable_titulo_2Layout.setHorizontalGroup(
            panel_despegable_titulo_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_despegable_titulo_2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_despegable_titulo_2Layout.setVerticalGroup(
            panel_despegable_titulo_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_despegable_titulo_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menu_bd.setBackground(new java.awt.Color(255, 255, 255));
        menu_bd.setBgShade(new java.awt.Color(204, 204, 204));
        menu_bd.setPreferredSize(new java.awt.Dimension(80, 128));
        menu_bd.setRound(40);

        btn_base_datos.setBackground(new java.awt.Color(255, 255, 255));
        btn_base_datos.setBorder(null);
        btn_base_datos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-base-de-datos-30.png"))); // NOI18N
        btn_base_datos.setBorderPainted(false);
        btn_base_datos.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_base_datos.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_base_datos.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_base_datos.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_base_datos.setFocusPainted(false);
        btn_base_datos.setIconTextGap(0);
        btn_base_datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_base_datosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_base_datosMouseExited(evt);
            }
        });
        btn_base_datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_base_datosActionPerformed(evt);
            }
        });

        lblbasedatos.setBackground(new java.awt.Color(101, 208, 250));
        lblbasedatos.setOpaque(true);

        javax.swing.GroupLayout menu_bdLayout = new javax.swing.GroupLayout(menu_bd);
        menu_bd.setLayout(menu_bdLayout);
        menu_bdLayout.setHorizontalGroup(
            menu_bdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_bdLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btn_base_datos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblbasedatos, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu_bdLayout.setVerticalGroup(
            menu_bdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_bdLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(menu_bdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblbasedatos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_base_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_despegable_titulo_1.setBackground(new java.awt.Color(255, 255, 255));
        panel_despegable_titulo_1.setBgShade(new java.awt.Color(255, 255, 255));
        panel_despegable_titulo_1.setPixels(2);
        panel_despegable_titulo_1.setPreferredSize(new java.awt.Dimension(10, 722));
        panel_despegable_titulo_1.setRound(40);

        jLabel2.setBackground(new java.awt.Color(104, 102, 110));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setText("DENTALSYS");

        javax.swing.GroupLayout panel_despegable_titulo_1Layout = new javax.swing.GroupLayout(panel_despegable_titulo_1);
        panel_despegable_titulo_1.setLayout(panel_despegable_titulo_1Layout);
        panel_despegable_titulo_1Layout.setHorizontalGroup(
            panel_despegable_titulo_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_despegable_titulo_1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(56, 56, 56))
        );
        panel_despegable_titulo_1Layout.setVerticalGroup(
            panel_despegable_titulo_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_despegable_titulo_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_despegable_salir_1.setBackground(new java.awt.Color(255, 255, 255));
        panel_despegable_salir_1.setBgShade(new java.awt.Color(255, 255, 255));
        panel_despegable_salir_1.setPixels(2);
        panel_despegable_salir_1.setPreferredSize(new java.awt.Dimension(10, 74));
        panel_despegable_salir_1.setRound(40);

        btn_salir_02.setBackground(new java.awt.Color(104, 102, 110));
        btn_salir_02.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btn_salir_02.setForeground(new java.awt.Color(104, 102, 110));
        btn_salir_02.setText("Salir");

        javax.swing.GroupLayout panel_despegable_salir_1Layout = new javax.swing.GroupLayout(panel_despegable_salir_1);
        panel_despegable_salir_1.setLayout(panel_despegable_salir_1Layout);
        panel_despegable_salir_1Layout.setHorizontalGroup(
            panel_despegable_salir_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_despegable_salir_1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(btn_salir_02)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_despegable_salir_1Layout.setVerticalGroup(
            panel_despegable_salir_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_despegable_salir_1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btn_salir_02)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        menu_salir1.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir1.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir1.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir1.setRound(40);

        lblreporte.setBackground(new java.awt.Color(101, 208, 250));
        lblreporte.setOpaque(true);

        btn_reportes.setBackground(new java.awt.Color(255, 255, 255));
        btn_reportes.setBorder(null);
        btn_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-reporte-de-negocios-30.png"))); // NOI18N
        btn_reportes.setBorderPainted(false);
        btn_reportes.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_reportes.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_reportes.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_reportes.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_reportes.setFocusPainted(false);
        btn_reportes.setIconTextGap(0);
        btn_reportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_reportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_reportesMouseExited(evt);
            }
        });
        btn_reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu_salir1Layout = new javax.swing.GroupLayout(menu_salir1);
        menu_salir1.setLayout(menu_salir1Layout);
        menu_salir1Layout.setHorizontalGroup(
            menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblreporte, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        menu_salir1Layout.setVerticalGroup(
            menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_salir1Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_reportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblreporte, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        panel_despegable_reportes.setBackground(new java.awt.Color(255, 255, 255));
        panel_despegable_reportes.setBgShade(new java.awt.Color(255, 255, 255));
        panel_despegable_reportes.setPixels(2);
        panel_despegable_reportes.setPreferredSize(new java.awt.Dimension(10, 74));
        panel_despegable_reportes.setRound(40);

        btn_reporte_cita.setBackground(new java.awt.Color(255, 255, 255));
        btn_reporte_cita.setForeground(new java.awt.Color(104, 102, 110));
        btn_reporte_cita.setText("Reportes Citas");
        btn_reporte_cita.setBorderPainted(false);
        btn_reporte_cita.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        btn_reportes_facturas.setBackground(new java.awt.Color(255, 255, 255));
        btn_reportes_facturas.setForeground(new java.awt.Color(104, 102, 110));
        btn_reportes_facturas.setText("Reportes Facturas");
        btn_reportes_facturas.setBorderPainted(false);
        btn_reportes_facturas.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        javax.swing.GroupLayout panel_despegable_reportesLayout = new javax.swing.GroupLayout(panel_despegable_reportes);
        panel_despegable_reportes.setLayout(panel_despegable_reportesLayout);
        panel_despegable_reportesLayout.setHorizontalGroup(
            panel_despegable_reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_despegable_reportesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_despegable_reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_reporte_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn_reportes_facturas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_despegable_reportesLayout.setVerticalGroup(
            panel_despegable_reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_despegable_reportesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btn_reporte_cita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_reportes_facturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu_01, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu_salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu_salir1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_despegable_titulo_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_despegable_salir_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panel_despegable_reportes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_despegable_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSPanelMaterial4, javax.swing.GroupLayout.DEFAULT_SIZE, 1021, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_despegable_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_despegable_base_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_despegable_titulo_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_despegable_ventana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menu_ventana, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(panel_menu2, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(menu_bd, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(menu_02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel_despegable_titulo_2, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(panel_menu2, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel_despegable_2, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                            .addComponent(menu_02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panel_despegable_base_datos, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(menu_bd, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel_despegable_ventana, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(menu_ventana, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(rSPanelMaterial4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(panel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                .addComponent(panel_despegable_titulo_1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(panel_despegable_1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                                .addComponent(menu_01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(menu_salir1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                .addComponent(panel_despegable_reportes, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(menu_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(panel_despegable_salir_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
       public void labels_iniciales ()
    {
         lblinicio.setBackground(new Color(101,208,250));
        lblpacientes.setBackground(new Color(255,255,255));
        lblcita.setBackground(new Color(255,255,255));
        lblgestionar_cita.setBackground(new Color(255,255,255));
        lblfactura.setBackground(new Color(255,255,255));
        lblreporte.setBackground(new Color(255,255,255));
        lblservicios.setBackground(new Color(255,255,255));
        lblespecialista.setBackground(new Color(255,255,255));
        lblbasedatos.setBackground(new Color(255,255,255));
        lblusuarios.setBackground(new Color(255,255,255));
    } 
    public void colores_menus_despegables ()
    {
        panel_despegable_1.setBackground(new Color (255,255,255,150));
        //panel_despegable_titulo_1.setBackground(new Color (255,255,255,150));
       // panel_despegable_salir_1.setBackground(new Color (255,255,255,150));
        panel_despegable_reportes.setBackground(new Color (255,255,255,150));
        
        panel_despegable_2.setBackground(new Color (255,255,255,150));
       // panel_despegable_titulo_2.setBackground(new Color (255,255,255,150));
       // panel_despegable_ventana.setBackground(new Color (255,255,255,150));
        panel_despegable_base_datos.setBackground(new Color (255,255,255,150));
        //-------
        
          btn_inicio_02.setBackground(new Color (255,255,255,0));
        btn_paciente_02.setBackground(new Color (255,255,255,0));
        btn_cita_02.setBackground(new Color (255,255,255,0));
        
        btn_gestionar_cita_02.setBackground(new Color (255,255,255,0));
        btn_comprobante_02.setBackground(new Color (255,255,255,0));
        btn_reporte_cita.setBackground(new Color (255,255,255,0));
        btn_reportes_facturas.setBackground(new Color (255,255,255,0));
        btn_salir_02.setBackground(new Color (255,255,255,0));
        
         //-------
        btn_servicios_02.setBackground(new Color (255,255,255,0));
        btn_especialista_02.setBackground(new Color (255,255,255,0));
        btn_usuario_02.setBackground(new Color (255,255,255,0));
        
        btn_copia_Seguridad_bd.setBackground(new Color (255,255,255,0));
        btn_restaurar_bd.setBackground(new Color (255,255,255,0));
        btn_vaciar_bd.setBackground(new Color (255,255,255,0));
        
        btn_max_02.setBackground(new Color (255,255,255,0));
        btn_min_02.setBackground(new Color (255,255,255,0));
    }
    
    public void changeimage(JLabel button, String resourcheimg){
        ImageIcon aimg = new ImageIcon(getClass().getResource(resourcheimg));
        button.setIcon(aimg);
    }
    public void changeimage_boton(RSButtonMaterialGradientOne button, String resourcheimg){
        ImageIcon aimg = new ImageIcon(getClass().getResource(resourcheimg));
        button.setIcon(aimg);
    }
    
     public void boton_inicio()
    {
        
        if(!this.btn_inicio.isSelected()){
            this.btn_inicio.setSelected(true);
            this.btn_paciente.setSelected(false);
            this.btn_cita.setSelected(false);
            this.btn_gestionar_cita.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            this.btn_especialista.setSelected(false);            
            this.btn_reportes.setSelected(false);
            this.btn_usuario.setSelected(false);
            
            panel_inicio.setVisible(true);
            panel_paciente.setVisible(false);
            panel_cita.setVisible(false);
            panel_gestion_cita.setVisible(false);
            panel_comprobante.setVisible(false);
            panel_servicios.setVisible(false);
            panel_especialista.setVisible(false);
            panel_usuarios.setVisible(false);

           frm_UI_01_Patien1.ocultar_form_patient(false);
           frm_UI_02_reservar_cita1.ocultar_form_cita(false);
           frm_UI_03_gestionar_citas1.ocultar_form_gestion(false);
           frm_UI_04_comprobantes2.ocultar_form_comprobantes(false);
           frm_UI_05_servicios1.ocultar_form_servicios(false);
           frm_UI_06_especialista11.ocultar_form_especialista(false);
           frm_UI_07_usuarios1.ocultar_form_usuarios(false);
           frm_UI_inicio2.ocultar_form_inicio(true);
            

    
                   
        }
        
        lblinicio.setBackground(new Color(101,208,250));
        lblpacientes.setBackground(new Color(255,255,255));
        lblcita.setBackground(new Color(255,255,255));
        lblgestionar_cita.setBackground(new Color(255,255,255));
        lblfactura.setBackground(new Color(255,255,255));
        lblservicios.setBackground(new Color(255,255,255));
        lblespecialista.setBackground(new Color(255,255,255));
        lblbasedatos.setBackground(new Color(255,255,255));
        lblusuarios.setBackground(new Color(255,255,255));
    }
     
     
    public void boton_paciente()
    {
        
        if(!this.btn_paciente.isSelected()){
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(true);
            this.btn_cita.setSelected(false);
            this.btn_gestionar_cita.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            this.btn_especialista.setSelected(false);
            this.btn_reportes.setSelected(false);
            this.btn_usuario.setSelected(false);
            
            panel_inicio.setVisible(false);
            panel_paciente.setVisible(true);
            panel_cita.setVisible(false);
            panel_gestion_cita.setVisible(false);
            panel_comprobante.setVisible(false);
            panel_servicios.setVisible(false);
            panel_especialista.setVisible(false);
            panel_usuarios.setVisible(false);
            
           frm_UI_01_Patien1.ocultar_form_patient(true);
           frm_UI_02_reservar_cita1.ocultar_form_cita(false);
           frm_UI_03_gestionar_citas1.ocultar_form_gestion(false);
           frm_UI_04_comprobantes2.ocultar_form_comprobantes(false);
           frm_UI_05_servicios1.ocultar_form_servicios(false);
           frm_UI_06_especialista11.ocultar_form_especialista(false);
           frm_UI_07_usuarios1.ocultar_form_usuarios(false);
           frm_UI_inicio2.ocultar_form_inicio(false);
           
            
changeimage_boton(btn_paciente, "/WIN34CLC_RESOURCES_UI/icons8-persona-de-sexo-masculino-30.png");
   
        }
        
        
        lblinicio.setBackground(new Color(255,255,255));
        lblpacientes.setBackground(new Color(101,208,250));
        lblcita.setBackground(new Color(255,255,255));
        lblgestionar_cita.setBackground(new Color(255,255,255));
        lblfactura.setBackground(new Color(255,255,255));
        lblservicios.setBackground(new Color(255,255,255));
        lblespecialista.setBackground(new Color(255,255,255));
        lblbasedatos.setBackground(new Color(255,255,255));
        lblusuarios.setBackground(new Color(255,255,255));
    }
    
     public void boton_cita()
    {
        
        if(!this.btn_cita.isSelected()){
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_cita.setSelected(true);
            this.btn_gestionar_cita.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            this.btn_especialista.setSelected(false);
            this.btn_reportes.setSelected(false);
            this.btn_usuario.setSelected(false);
            
            panel_inicio.setVisible(false);
            panel_paciente.setVisible(false);
            panel_cita.setVisible(true);
            panel_gestion_cita.setVisible(false);
            panel_comprobante.setVisible(false);
            panel_servicios.setVisible(false);
            panel_especialista.setVisible(false);
            panel_usuarios.setVisible(false);
            
           frm_UI_01_Patien1.ocultar_form_patient(false);
           frm_UI_02_reservar_cita1.ocultar_form_cita(true);
           frm_UI_03_gestionar_citas1.ocultar_form_gestion(false);
           frm_UI_04_comprobantes2.ocultar_form_comprobantes(false);
           frm_UI_05_servicios1.ocultar_form_servicios(false);
           frm_UI_06_especialista11.ocultar_form_especialista(false);
           frm_UI_07_usuarios1.ocultar_form_usuarios(false);
           frm_UI_inicio2.ocultar_form_inicio(false);
            
     
             
        }
        
       
        
        
        lblinicio.setBackground(new Color(255,255,255));
        lblpacientes.setBackground(new Color(255,255,255));
        lblcita.setBackground(new Color(101,208,250));
        lblgestionar_cita.setBackground(new Color(255,255,255));
        lblfactura.setBackground(new Color(255,255,255));
        lblservicios.setBackground(new Color(255,255,255));
        lblespecialista.setBackground(new Color(255,255,255));
        lblbasedatos.setBackground(new Color(255,255,255));
        lblusuarios.setBackground(new Color(255,255,255));
    }
     
    public void boton_gestionarCita()
    {
        if(!this.btn_gestionar_cita.isSelected()){
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_cita.setSelected(false);
            this.btn_gestionar_cita.setSelected(true);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            this.btn_especialista.setSelected(false);
            this.btn_reportes.setSelected(false);
            this.btn_usuario.setSelected(false);
            
            panel_gestion_cita.updateUI();
            
            panel_inicio.setVisible(false);
            panel_paciente.setVisible(false);
            panel_cita.setVisible(false);
            panel_gestion_cita.setVisible(true);
            panel_comprobante.setVisible(false);
            panel_servicios.setVisible(false);
            panel_especialista.setVisible(false);
            panel_usuarios.setVisible(false);
            
             frm_UI_01_Patien1.ocultar_form_patient(false);
           frm_UI_02_reservar_cita1.ocultar_form_cita(false);
           frm_UI_03_gestionar_citas1.ocultar_form_gestion(true);
           frm_UI_04_comprobantes2.ocultar_form_comprobantes(false);
           frm_UI_05_servicios1.ocultar_form_servicios(false);
           frm_UI_06_especialista11.ocultar_form_especialista(false);
           frm_UI_07_usuarios1.ocultar_form_usuarios(false);
           frm_UI_inicio2.ocultar_form_inicio(false);
        
        
        }
        
          
        
        lblinicio.setBackground(new Color(255,255,255));
        lblpacientes.setBackground(new Color(255,255,255));
        lblcita.setBackground(new Color(255,255,255));
        lblgestionar_cita.setBackground(new Color(101,208,250));
        lblfactura.setBackground(new Color(255,255,255));
        lblservicios.setBackground(new Color(255,255,255));
        lblespecialista.setBackground(new Color(255,255,255));
        lblbasedatos.setBackground(new Color(255,255,255));
        lblusuarios.setBackground(new Color(255,255,255));
       
    }
    
    public void boton_comprobante()
    {
        
         if(!this.btn_factura.isSelected()){
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_cita.setSelected(false);
            this.btn_gestionar_cita.setSelected(false);
            this.btn_factura.setSelected(true);
            this.btn_servicios.setSelected(false);
            this.btn_especialista.setSelected(false);
            this.btn_reportes.setSelected(false);
            this.btn_usuario.setSelected(false);
            
              panel_inicio.setVisible(false);
            panel_paciente.setVisible(false);
            panel_cita.setVisible(false);
            panel_gestion_cita.setVisible(false);
            panel_comprobante.setVisible(true);
            panel_servicios.setVisible(false);
            panel_especialista.setVisible(false);
            panel_usuarios.setVisible(false);
            
           frm_UI_01_Patien1.ocultar_form_patient(false);
           frm_UI_02_reservar_cita1.ocultar_form_cita(false);
           frm_UI_03_gestionar_citas1.ocultar_form_gestion(false);
           frm_UI_04_comprobantes2.ocultar_form_comprobantes(true);
           frm_UI_05_servicios1.ocultar_form_servicios(false);
           frm_UI_06_especialista11.ocultar_form_especialista(false);
           frm_UI_07_usuarios1.ocultar_form_usuarios(false);
           frm_UI_inicio2.ocultar_form_inicio(false);
           
            
         }
         
        lblinicio.setBackground(new Color(255,255,255));
        lblpacientes.setBackground(new Color(255,255,255));
        lblcita.setBackground(new Color(255,255,255));
        lblgestionar_cita.setBackground(new Color(255,255,255));
        lblfactura.setBackground(new Color(101,208,250));
        lblservicios.setBackground(new Color(255,255,255));
        lblespecialista.setBackground(new Color(255,255,255));
        lblbasedatos.setBackground(new Color(255,255,255));
        lblusuarios.setBackground(new Color(255,255,255));
    }
    
    public void boton_reportes ()
    {
        
         if(a==true){
       
                 hideshow(panel_despegable_1, a);
           hideshow(panel_despegable_titulo_1, a);
            hideshow(panel_despegable_salir_1, a);
            hideshow(panel_despegable_reportes, a);
            
           hideshow(panel_despegable_2, a);
           hideshow(panel_despegable_titulo_2, a);
           hideshow(panel_despegable_base_datos, a);
           hideshow(panel_despegable_ventana, a);
            
          SwingUtilities.updateComponentTreeUI(this);
                    
          a=false;
          
            changeimage(lbl_menu_1, "/WIN34CLC_RESOURCES_UI/icons8-menú-30.png");
            changeimage(lbl_menu_2, "/WIN34CLC_RESOURCES_UI/icons8-menú-30.png");
        }
        else{
         
              hideshow(panel_despegable_1, a);
              hideshow(panel_despegable_titulo_1, a);
            hideshow(panel_despegable_salir_1, a);
            hideshow(panel_despegable_reportes, a);
            
         
            
            SwingUtilities.updateComponentTreeUI(this);
            a=true;
            changeimage(lbl_menu_1, "/WIN34CLC_RESOURCES_UI/icons8-atrás-30.png");
            
            
          
   }
        
        
        
        
        lblinicio.setBackground(new Color(255,255,255));
        lblpacientes.setBackground(new Color(255,255,255));
        lblcita.setBackground(new Color(255,255,255));
        lblgestionar_cita.setBackground(new Color(255,255,255));
        lblfactura.setBackground(new Color(255,255,255));
        lblreporte.setBackground(new Color(101,208,250));
        lblservicios.setBackground(new Color(255,255,255));
        lblespecialista.setBackground(new Color(255,255,255));
        lblbasedatos.setBackground(new Color(255,255,255));
        lblusuarios.setBackground(new Color(255,255,255));
    }
    
    
    public void boton_servicios()
    {
        
        if(!this.btn_servicios.isSelected()){
            this.btn_servicios.setSelected(true);
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_cita.setSelected(false);
            this.btn_gestionar_cita.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_especialista.setSelected(false);
            this.btn_reportes.setSelected(false);
            this.btn_usuario.setSelected(false);
            
            panel_inicio.setVisible(false);
            panel_paciente.setVisible(false);
            panel_cita.setVisible(false);
            panel_gestion_cita.setVisible(false);
            panel_comprobante.setVisible(false);
            panel_servicios.setVisible(true);
            panel_especialista.setVisible(false);
            panel_usuarios.setVisible(false);
            
           frm_UI_01_Patien1.ocultar_form_patient(false);
           frm_UI_02_reservar_cita1.ocultar_form_cita(false);
           frm_UI_03_gestionar_citas1.ocultar_form_gestion(false);
           frm_UI_04_comprobantes2.ocultar_form_comprobantes(false);
           frm_UI_05_servicios1.ocultar_form_servicios(true);
           frm_UI_06_especialista11.ocultar_form_especialista(false);
           frm_UI_07_usuarios1.ocultar_form_usuarios(false);
           frm_UI_inicio2.ocultar_form_inicio(false);
            
            
            
        }
        lblinicio.setBackground(new Color(255,255,255));
        lblpacientes.setBackground(new Color(255,255,255));
        lblcita.setBackground(new Color(255,255,255));
        lblgestionar_cita.setBackground(new Color(255,255,255));
        lblfactura.setBackground(new Color(255,255,255));
        lblservicios.setBackground(new Color(101,208,250));
        lblespecialista.setBackground(new Color(255,255,255));
        lblbasedatos.setBackground(new Color(255,255,255));
        lblusuarios.setBackground(new Color(255,255,255));
    }
    
     public void boton_especialistas()
    {
        
        if(!this.btn_especialista.isSelected()){
            this.btn_especialista.setSelected(true);
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_cita.setSelected(false);
            this.btn_gestionar_cita.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            this.btn_reportes.setSelected(false);
            this.btn_usuario.setSelected(false);
            
            panel_inicio.setVisible(false);
            panel_paciente.setVisible(false);
            panel_cita.setVisible(false);
            panel_gestion_cita.setVisible(false);
            panel_comprobante.setVisible(false);
            panel_servicios.setVisible(false);
            panel_especialista.setVisible(true);
            panel_usuarios.setVisible(false);
            
           frm_UI_01_Patien1.ocultar_form_patient(false);
           frm_UI_02_reservar_cita1.ocultar_form_cita(false);
           frm_UI_03_gestionar_citas1.ocultar_form_gestion(false);
           frm_UI_04_comprobantes2.ocultar_form_comprobantes(false);
           frm_UI_05_servicios1.ocultar_form_servicios(false);
           frm_UI_06_especialista11.ocultar_form_especialista(true);
           frm_UI_07_usuarios1.ocultar_form_usuarios(false);
           frm_UI_inicio2.ocultar_form_inicio(false);
            
           
        }
        lblinicio.setBackground(new Color(255,255,255));
        lblpacientes.setBackground(new Color(255,255,255));
        lblcita.setBackground(new Color(255,255,255));
        lblgestionar_cita.setBackground(new Color(255,255,255));
        lblfactura.setBackground(new Color(255,255,255));
        lblservicios.setBackground(new Color(255,255,255));
        lblespecialista.setBackground(new Color(101,208,250));
        lblbasedatos.setBackground(new Color(255,255,255));
        lblusuarios.setBackground(new Color(255,255,255));
    }
     
     public void boton_base_datos()
    {
        if(a==true){
         hideshow(panel_despegable_titulo_2, a);
          hideshow(panel_despegable_2, a);
          hideshow(panel_despegable_base_datos, a);
         hideshow(panel_despegable_ventana, a);
         
          hideshow(panel_despegable_1, a);
           hideshow(panel_despegable_titulo_1, a);
            hideshow(panel_despegable_salir_1, a);
            hideshow(panel_despegable_reportes, a);
         
          SwingUtilities.updateComponentTreeUI(this);
                    
          a=false;
          
            changeimage(lbl_menu_2, "/WIN34CLC_RESOURCES_UI/icons8-menú-30.png");
            changeimage(lbl_menu_1, "/WIN34CLC_RESOURCES_UI/icons8-menú-30.png");
        }
        else{
            hideshow(panel_despegable_2, a);
            hideshow(panel_despegable_titulo_2, a);
        
        hideshow(panel_despegable_base_datos, a);
         hideshow(panel_despegable_ventana, a);
            SwingUtilities.updateComponentTreeUI(this);
            a=true;
            
              changeimage(lbl_menu_2, "/WIN34CLC_RESOURCES_UI/icons8-adelante-30.png");
   }//       
        
        
        lblinicio.setBackground(new Color(255,255,255));
        lblpacientes.setBackground(new Color(255,255,255));
        lblcita.setBackground(new Color(255,255,255));
        lblgestionar_cita.setBackground(new Color(255,255,255));
        lblfactura.setBackground(new Color(255,255,255));
        lblservicios.setBackground(new Color(255,255,255));
        lblespecialista.setBackground(new Color(255,255,255));
        lblbasedatos.setBackground(new Color(101,208,250));
        lblusuarios.setBackground(new Color(255,255,255));
    }
     
     public void boton_usuarios()
    {
        
        if(!this.btn_usuario.isSelected()){
            this.btn_especialista.setSelected(false);
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_cita.setSelected(false);
            this.btn_gestionar_cita.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            this.btn_reportes.setSelected(false);
            this.btn_usuario.setSelected(true);
            
            panel_inicio.setVisible(false);
            panel_paciente.setVisible(false);
            panel_cita.setVisible(false);
            panel_gestion_cita.setVisible(false);
            panel_comprobante.setVisible(false);
            panel_servicios.setVisible(false);
            panel_especialista.setVisible(false);
            panel_usuarios.setVisible(true);
            
           frm_UI_01_Patien1.ocultar_form_patient(false);
           frm_UI_02_reservar_cita1.ocultar_form_cita(false);
           frm_UI_03_gestionar_citas1.ocultar_form_gestion(false);
           frm_UI_04_comprobantes2.ocultar_form_comprobantes(false);
           frm_UI_05_servicios1.ocultar_form_servicios(false);
           frm_UI_06_especialista11.ocultar_form_especialista(false);
           frm_UI_07_usuarios1.ocultar_form_usuarios(true);
           frm_UI_inicio2.ocultar_form_inicio(false);
            
         
        }
        lblinicio.setBackground(new Color(255,255,255));
        lblpacientes.setBackground(new Color(255,255,255));
        lblcita.setBackground(new Color(255,255,255));
        lblgestionar_cita.setBackground(new Color(255,255,255));
        lblfactura.setBackground(new Color(255,255,255));
        lblservicios.setBackground(new Color(255,255,255));
        lblespecialista.setBackground(new Color(255,255,255));
        lblbasedatos.setBackground(new Color(255,255,255));
        lblusuarios.setBackground(new Color(101,208,250));
    }
     
    
    
    public void hideshow (JPanel menushowhide, boolean dashboard)
    {
        if (dashboard == true)
        {
            menushowhide.setPreferredSize(new Dimension(10, menushowhide.getHeight()));
        }
        else
        {
            menushowhide.setPreferredSize(new Dimension(220, menushowhide.getHeight()));
        }
    }
    
    private void btn_minMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_minMouseEntered

    private void btn_minMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_minMouseExited

    private void btn_minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minActionPerformed
this.setState(Frame.ICONIFIED);         // TODO add your handling code here:
    }//GEN-LAST:event_btn_minActionPerformed

    private void btn_maxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_maxMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_maxMouseEntered

    private void btn_maxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_maxMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_maxMouseExited

    private void btn_maxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_maxActionPerformed
 if(maximized){
          
            UI_v5_11111.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            UI_v5_11111.this.setMaximizedBounds(env.getMaximumWindowBounds());
            maximized = false;
        }else{
            setExtendedState(JFrame.NORMAL);
            maximized = true;
        }     
    }//GEN-LAST:event_btn_maxActionPerformed

    private void lbl_menu_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_menu_1MouseClicked
 if(a==true){
          hideshow(panel_despegable_1, a);
           hideshow(panel_despegable_titulo_1, a);
            hideshow(panel_despegable_salir_1, a);
            hideshow(panel_despegable_reportes, a);
            
                hideshow(panel_despegable_2, a);
           hideshow(panel_despegable_titulo_2, a);
           hideshow(panel_despegable_base_datos, a);
            hideshow(panel_despegable_ventana, a);
            
          SwingUtilities.updateComponentTreeUI(this);
                    
          a=false;
          
            changeimage(lbl_menu_1, "/WIN34CLC_RESOURCES_UI/icons8-menú-30.png");
            changeimage(lbl_menu_2, "/WIN34CLC_RESOURCES_UI/icons8-menú-30.png");
        }
        else{
            hideshow(panel_despegable_1, a);
              hideshow(panel_despegable_titulo_1, a);
            hideshow(panel_despegable_salir_1, a);
            hideshow(panel_despegable_reportes, a);
            //-------------
            
         
            
            SwingUtilities.updateComponentTreeUI(this);
            a=true;
            changeimage(lbl_menu_1, "/WIN34CLC_RESOURCES_UI/icons8-atrás-30.png");
            
            
          
   }//        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_menu_1MouseClicked

    private void btn_inicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioMouseEntered
lblinicio.setBackground(new Color(101,208,250));         // TODO add your handling code here:
    }//GEN-LAST:event_btn_inicioMouseEntered

    private void btn_inicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioMouseExited
  if(!this.btn_inicio .isSelected()){
            lblinicio.setBackground(new Color(255,255,255));
        }   
    }//GEN-LAST:event_btn_inicioMouseExited

    private void btn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicioActionPerformed
boton_inicio();       // TODO add your handling code here:
    }//GEN-LAST:event_btn_inicioActionPerformed

    private void btn_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salirMouseEntered

    private void btn_salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salirMouseExited

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_pacienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pacienteMouseEntered
lblpacientes.setBackground(new Color(101,208,250));         // TODO add your handling code here:
    }//GEN-LAST:event_btn_pacienteMouseEntered

    private void btn_pacienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pacienteMouseExited
     if(!this.btn_paciente .isSelected()){
            lblpacientes.setBackground(new Color(255,255,255));
        }   
    }//GEN-LAST:event_btn_pacienteMouseExited

    private void btn_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pacienteActionPerformed
boton_paciente();     

// TODO add your handling code here:
    }//GEN-LAST:event_btn_pacienteActionPerformed

    private void btn_citaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_citaMouseEntered
      lblcita.setBackground(new Color(101,208,250)); 
    }//GEN-LAST:event_btn_citaMouseEntered

    private void btn_citaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_citaMouseExited
         if(!this.btn_cita .isSelected()){
            lblcita.setBackground(new Color(255,255,255));
        }   
    }//GEN-LAST:event_btn_citaMouseExited

    private void btn_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_citaActionPerformed
boton_cita();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_citaActionPerformed

    private void btn_gestionar_citaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gestionar_citaMouseEntered
lblgestionar_cita.setBackground(new Color(101,208,250));         // TODO add your handling code here:
    }//GEN-LAST:event_btn_gestionar_citaMouseEntered

    private void btn_gestionar_citaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gestionar_citaMouseExited
       if(!this.btn_gestionar_cita.isSelected()){
            lblgestionar_cita.setBackground(new Color(255,255,255));
        }   
    }//GEN-LAST:event_btn_gestionar_citaMouseExited

    private void btn_gestionar_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gestionar_citaActionPerformed
boton_gestionarCita();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_gestionar_citaActionPerformed

    private void btn_facturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_facturaMouseEntered
      lblfactura.setBackground(new Color(101,208,250));
    }//GEN-LAST:event_btn_facturaMouseEntered

    private void btn_facturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_facturaMouseExited
  if(!this.btn_factura .isSelected()){
            lblfactura.setBackground(new Color(255,255,255));
        }           // TODO add your handling code here:
    }//GEN-LAST:event_btn_facturaMouseExited

    private void btn_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_facturaActionPerformed
boton_comprobante();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_facturaActionPerformed

    private void btn_serviciosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_serviciosMouseEntered
lblservicios.setBackground(new Color(101,208,250));        
    }//GEN-LAST:event_btn_serviciosMouseEntered

    private void btn_serviciosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_serviciosMouseExited
       if(!this.btn_servicios .isSelected()){
            lblservicios.setBackground(new Color(255,255,255));
        }   
    }//GEN-LAST:event_btn_serviciosMouseExited

    private void btn_serviciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_serviciosActionPerformed
boton_servicios();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_serviciosActionPerformed

    private void btn_usuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usuarioMouseEntered
lblusuarios.setBackground(new Color(101,208,250));         // TODO add your handling code here:
    }//GEN-LAST:event_btn_usuarioMouseEntered

    private void btn_usuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usuarioMouseExited
       if(!this.btn_usuario .isSelected()){
            lblusuarios.setBackground(new Color(255,255,255));
        }   
    }//GEN-LAST:event_btn_usuarioMouseExited

    private void btn_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuarioActionPerformed
boton_usuarios();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_usuarioActionPerformed

    private void btn_servicios_02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_servicios_02MouseEntered
             // TODO add your handling code here:
    }//GEN-LAST:event_btn_servicios_02MouseEntered

    private void btn_servicios_02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_servicios_02MouseExited
       
    }//GEN-LAST:event_btn_servicios_02MouseExited

    private void btn_servicios_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_servicios_02ActionPerformed
      
    }//GEN-LAST:event_btn_servicios_02ActionPerformed

    private void btn_especialistaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_especialistaMouseEntered
lblespecialista.setBackground(new Color(101,208,250));         // TODO add your handling code here:
    }//GEN-LAST:event_btn_especialistaMouseEntered

    private void btn_especialistaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_especialistaMouseExited
      if(!this.btn_especialista .isSelected()){
            lblespecialista.setBackground(new Color(255,255,255));
        }   
    }//GEN-LAST:event_btn_especialistaMouseExited

    private void btn_especialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_especialistaActionPerformed
boton_especialistas();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_especialistaActionPerformed

    private void btn_base_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_base_datosActionPerformed
boton_base_datos();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_base_datosActionPerformed

    private void btn_base_datosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_base_datosMouseExited
     if(!this.btn_base_datos .isSelected()){
            lblbasedatos.setBackground(new Color(255,255,255));
        }   
    }//GEN-LAST:event_btn_base_datosMouseExited

    private void btn_base_datosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_base_datosMouseEntered
lblbasedatos.setBackground(new Color(101,208,250));        // TODO add your handling code here:
    }//GEN-LAST:event_btn_base_datosMouseEntered

    private void btn_usuario_02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usuario_02MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_usuario_02MouseEntered

    private void btn_usuario_02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usuario_02MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_usuario_02MouseExited

    private void btn_usuario_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuario_02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_usuario_02ActionPerformed

    private void btn_especialista_02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_especialista_02MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_especialista_02MouseEntered

    private void btn_especialista_02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_especialista_02MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_especialista_02MouseExited

    private void btn_especialista_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_especialista_02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_especialista_02ActionPerformed

    private void btn_restaurar_bdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_restaurar_bdMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_restaurar_bdMouseEntered

    private void btn_restaurar_bdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_restaurar_bdMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_restaurar_bdMouseExited

    private void btn_restaurar_bdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaurar_bdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_restaurar_bdActionPerformed

    private void btn_vaciar_bdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_vaciar_bdMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_vaciar_bdMouseEntered

    private void btn_vaciar_bdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_vaciar_bdMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_vaciar_bdMouseExited

    private void btn_vaciar_bdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vaciar_bdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_vaciar_bdActionPerformed

    private void btn_max_02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_max_02MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_max_02MouseEntered

    private void btn_max_02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_max_02MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_max_02MouseExited

    private void btn_max_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_max_02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_max_02ActionPerformed

    private void btn_min_02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_min_02MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_min_02MouseEntered

    private void btn_min_02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_min_02MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_min_02MouseExited

    private void btn_min_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_min_02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_min_02ActionPerformed

    private void btn_inicio_02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicio_02MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_inicio_02MouseEntered

    private void btn_inicio_02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicio_02MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_inicio_02MouseExited

    private void btn_inicio_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicio_02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_inicio_02ActionPerformed

    private void btn_paciente_02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_paciente_02MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_paciente_02MouseEntered

    private void btn_paciente_02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_paciente_02MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_paciente_02MouseExited

    private void btn_paciente_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paciente_02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_paciente_02ActionPerformed

    private void btn_cita_02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cita_02MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cita_02MouseEntered

    private void btn_cita_02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cita_02MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cita_02MouseExited

    private void btn_cita_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cita_02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cita_02ActionPerformed

    private void btn_gestionar_cita_02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gestionar_cita_02MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_gestionar_cita_02MouseEntered

    private void btn_gestionar_cita_02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gestionar_cita_02MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_gestionar_cita_02MouseExited

    private void btn_gestionar_cita_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gestionar_cita_02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_gestionar_cita_02ActionPerformed

    private void btn_comprobante_02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_comprobante_02MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_comprobante_02MouseEntered

    private void btn_comprobante_02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_comprobante_02MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_comprobante_02MouseExited

    private void btn_comprobante_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comprobante_02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_comprobante_02ActionPerformed

    private void btn_copia_Seguridad_bdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_copia_Seguridad_bdMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_copia_Seguridad_bdMouseEntered

    private void btn_copia_Seguridad_bdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_copia_Seguridad_bdMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_copia_Seguridad_bdMouseExited

    private void btn_copia_Seguridad_bdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_copia_Seguridad_bdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_copia_Seguridad_bdActionPerformed

    private void btn_reportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportesMouseEntered
lblreporte.setBackground(new Color(101,208,250));         // TODO add your handling code here:
    }//GEN-LAST:event_btn_reportesMouseEntered

    private void btn_reportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportesMouseExited
          if(!this.btn_reportes .isSelected()){
            lblreporte.setBackground(new Color(255,255,255));
        }   // TODO add your handling code here:
    }//GEN-LAST:event_btn_reportesMouseExited

    private void btn_reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportesActionPerformed
        boton_reportes();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reportesActionPerformed

    private void lbl_menu_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_menu_2MouseClicked
if(a==true){
         hideshow(panel_despegable_titulo_2, a);
          hideshow(panel_despegable_2, a);
          hideshow(panel_despegable_base_datos, a);
         hideshow(panel_despegable_ventana, a);
         
          hideshow(panel_despegable_1, a);
           hideshow(panel_despegable_titulo_1, a);
            hideshow(panel_despegable_salir_1, a);
            hideshow(panel_despegable_reportes, a);
         
          SwingUtilities.updateComponentTreeUI(this);
                    
          a=false;
          
            changeimage(lbl_menu_2, "/WIN34CLC_RESOURCES_UI/icons8-menú-30.png");
            changeimage(lbl_menu_1, "/WIN34CLC_RESOURCES_UI/icons8-menú-30.png");
        }
        else{
            hideshow(panel_despegable_2, a);
            hideshow(panel_despegable_titulo_2, a);
        
        hideshow(panel_despegable_base_datos, a);
         hideshow(panel_despegable_ventana, a);
            SwingUtilities.updateComponentTreeUI(this);
            a=true;
            
              changeimage(lbl_menu_2, "/WIN34CLC_RESOURCES_UI/icons8-adelante-30.png");
   }//              // TODO add your handling code here:
    }//GEN-LAST:event_lbl_menu_2MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_v5_11111().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_base_datos;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_cita;
    private newscomponents.RSButtonFlat_new btn_cita_02;
    private newscomponents.RSButtonFlat_new btn_comprobante_02;
    private newscomponents.RSButtonFlat_new btn_copia_Seguridad_bd;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_especialista;
    private newscomponents.RSButtonFlat_new btn_especialista_02;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_factura;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_gestionar_cita;
    private newscomponents.RSButtonFlat_new btn_gestionar_cita_02;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_inicio;
    private newscomponents.RSButtonFlat_new btn_inicio_02;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_max;
    private newscomponents.RSButtonFlat_new btn_max_02;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_min;
    private newscomponents.RSButtonFlat_new btn_min_02;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_paciente;
    private newscomponents.RSButtonFlat_new btn_paciente_02;
    private newscomponents.RSButtonFlat_new btn_reporte_cita;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_reportes;
    private newscomponents.RSButtonFlat_new btn_reportes_facturas;
    private newscomponents.RSButtonFlat_new btn_restaurar_bd;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_salir;
    private javax.swing.JLabel btn_salir_02;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_servicios;
    private newscomponents.RSButtonFlat_new btn_servicios_02;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_usuario;
    private newscomponents.RSButtonFlat_new btn_usuario_02;
    private newscomponents.RSButtonFlat_new btn_vaciar_bd;
    private WIN33CLC_VIEW.frm_UI_01_Patien frm_UI_01_Patien1;
    private WIN33CLC_VIEW.frm_UI_02_reservar_cita frm_UI_02_reservar_cita1;
    private WIN33CLC_VIEW.frm_UI_03_gestionar_citas frm_UI_03_gestionar_citas1;
    private WIN33CLC_VIEW.frm_UI_04_comprobantes frm_UI_04_comprobantes2;
    private WIN33CLC_VIEW.frm_UI_05_servicios frm_UI_05_servicios1;
    private WIN33CLC_VIEW.frm_UI_06_especialista1 frm_UI_06_especialista11;
    private WIN33CLC_VIEW.frm_UI_07_usuarios frm_UI_07_usuarios1;
    private WIN33CLC_VIEW.frm_UI_inicio frm_UI_inicio2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_menu_1;
    private javax.swing.JLabel lbl_menu_2;
    private javax.swing.JLabel lblbasedatos;
    private javax.swing.JLabel lblcita;
    private javax.swing.JLabel lblespecialista;
    private javax.swing.JLabel lblfactura;
    private javax.swing.JLabel lblgestionar_cita;
    private javax.swing.JLabel lblinicio;
    private javax.swing.JLabel lblpacientes;
    private javax.swing.JLabel lblreporte;
    private javax.swing.JLabel lblservicios;
    private javax.swing.JLabel lblusuarios;
    private RSMaterialComponent.RSPanelMaterial menu_01;
    private RSMaterialComponent.RSPanelMaterial menu_02;
    private RSMaterialComponent.RSPanelMaterial menu_bd;
    private RSMaterialComponent.RSPanelMaterial menu_salir;
    private RSMaterialComponent.RSPanelMaterial menu_salir1;
    private RSMaterialComponent.RSPanelMaterial menu_ventana;
    private javax.swing.JPanel panel_cita;
    private javax.swing.JPanel panel_comprobante;
    private RSMaterialComponent.RSPanelMaterial panel_despegable_1;
    private RSMaterialComponent.RSPanelMaterial panel_despegable_2;
    private RSMaterialComponent.RSPanelMaterial panel_despegable_base_datos;
    private RSMaterialComponent.RSPanelMaterial panel_despegable_reportes;
    private RSMaterialComponent.RSPanelMaterial panel_despegable_salir_1;
    private RSMaterialComponent.RSPanelMaterial panel_despegable_titulo_1;
    private RSMaterialComponent.RSPanelMaterial panel_despegable_titulo_2;
    private RSMaterialComponent.RSPanelMaterial panel_despegable_ventana;
    private javax.swing.JPanel panel_especialista;
    private javax.swing.JPanel panel_gestion_cita;
    private javax.swing.JPanel panel_inicio;
    private RSMaterialComponent.RSPanelMaterial panel_menu;
    private RSMaterialComponent.RSPanelMaterial panel_menu2;
    private javax.swing.JPanel panel_paciente;
    private javax.swing.JPanel panel_servicios;
    private javax.swing.JPanel panel_usuarios;
    private RSMaterialComponent.RSPanelMaterial rSPanelMaterial4;
    // End of variables declaration//GEN-END:variables
}
