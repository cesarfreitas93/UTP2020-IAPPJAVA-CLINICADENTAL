package WIN33CLC_VIEW;

import RSMaterialComponent.RSButtonMaterialGradientOne;
import RSMaterialComponent.RSPanelMaterial;
import WIN31CLC_DTO.User;
import WIN32CLC_CTR.CTR_11_DataBaseConfiguration;
import static WIN33CLC_VIEW.frm_Main.maximized;
import WIN_2020_UTILS.ConfigReader;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class UI_V5_main1 extends javax.swing.JFrame {

    static boolean maximized = true;

    boolean a = true;

    public UI_V5_main1() {

        initComponents();
        rSPanelMaterial4.setBackground(new Color(255, 255, 255, 0));
        rSPanelMaterial4.setOpaque(false);

        btn_cita_02.setBackground(new Color(255, 255, 255, 0));
        btn_inicio_02.setBackground(new Color(255, 255, 255, 0));
        btn_paciente_02.setBackground(new Color(255, 255, 255, 0));
        btn_gestionar_cita_02.setBackground(new Color(255, 255, 255, 0));
        btn_comprobantes_02.setBackground(new Color(255, 255, 255, 0));

        btn_servicios_02.setBackground(new Color(255, 255, 255, 0));
        btn_especialista_02.setBackground(new Color(255, 255, 255, 0));
        btn_usuarios_02.setBackground(new Color(255, 255, 255, 0));

        setBackground(new Color(255, 255, 255, 0));
        setLocationRelativeTo(null);

        boton_inicio();
        //------------------
        labels_iniciales();

        colores_menus_despegables();

        estado_usuario();

    }

    int xx, xy;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_menu = new RSMaterialComponent.RSPanelMaterial();
        lbl_menu_1 = new javax.swing.JLabel();
        panel_menu2 = new RSMaterialComponent.RSPanelMaterial();
        lbl_menu_2 = new javax.swing.JLabel();
        panel_despegable_1 = new RSMaterialComponent.RSPanelMaterial();
        btn_inicio_02 = new newscomponents.RSButtonFlat_new();
        btn_paciente_02 = new newscomponents.RSButtonFlat_new();
        btn_cita_02 = new newscomponents.RSButtonFlat_new();
        btn_gestionar_cita_02 = new newscomponents.RSButtonFlat_new();
        btn_comprobantes_02 = new newscomponents.RSButtonFlat_new();
        menu_02 = new RSMaterialComponent.RSPanelMaterial();
        lblservicios = new javax.swing.JLabel();
        btn_servicios = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_usuario = new RSMaterialComponent.RSButtonMaterialGradientOne();
        lblusuarios = new javax.swing.JLabel();
        btn_especialista = new RSMaterialComponent.RSButtonMaterialGradientOne();
        lblespecialista = new javax.swing.JLabel();
        rSPanelMaterial4 = new RSMaterialComponent.RSPanelMaterial();
        panel_inicio = new javax.swing.JPanel();
        frm_UI_inicio11 = new WIN33CLC_VIEW.frm_UI_inicio1();
        panel_paciente = new javax.swing.JPanel();
        panel_gestion_cita = new javax.swing.JPanel();
        frm_UI_03_gestionar_citas1 = new WIN33CLC_VIEW.frm_UI_03_gestionar_citas();
        panel_comprobante = new javax.swing.JPanel();
        frm_UI_04_comprobantes1 = new WIN33CLC_VIEW.frm_UI_04_comprobantes();
        panel_servicios = new javax.swing.JPanel();
        panel_especialista = new javax.swing.JPanel();
        panel_usuarios = new javax.swing.JPanel();
        frm_UI_07_usuarios1 = new WIN33CLC_VIEW.frm_UI_07_usuarios();
        panel_reportes_citas = new javax.swing.JPanel();
        panel_cita = new javax.swing.JPanel();
        frm_UI_02_reservar_cita11 = new WIN33CLC_VIEW.frm_UI_02_reservar_cita();
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
        panel_despegable_2 = new RSMaterialComponent.RSPanelMaterial();
        btn_usuarios_02 = new newscomponents.RSButtonFlat_new();
        btn_servicios_02 = new newscomponents.RSButtonFlat_new();
        btn_especialista_02 = new newscomponents.RSButtonFlat_new();
        panel_despegable_base_datos = new RSMaterialComponent.RSPanelMaterial();
        btn_createbackup = new newscomponents.RSButtonFlat_new();
        btn_restoredatabase = new newscomponents.RSButtonFlat_new();
        btn_resetdatabase = new newscomponents.RSButtonFlat_new();
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
        btn_salir_02 = new newscomponents.RSButtonFlat_new();
        menu_salir1 = new RSMaterialComponent.RSPanelMaterial();
        lblreporte = new javax.swing.JLabel();
        btn_reportes = new RSMaterialComponent.RSButtonMaterialGradientOne();
        panel_despegable_reportes = new RSMaterialComponent.RSPanelMaterial();
        btn_reporte_citas = new newscomponents.RSButtonFlat_new();
        btn_reportes_facturas = new newscomponents.RSButtonFlat_new();
        rSPanelImage1 = new rojerusan.RSPanelImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel_menu.setBackground(new java.awt.Color(255, 255, 255));
        panel_menu.setBgShade(new java.awt.Color(204, 204, 204));
        panel_menu.setPixels(0);
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
                .addGap(29, 29, 29)
                .addComponent(lbl_menu_1)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panel_menuLayout.setVerticalGroup(
            panel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_menu_1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        panel_menu2.setBackground(new java.awt.Color(255, 255, 255));
        panel_menu2.setBgShade(new java.awt.Color(204, 204, 204));
        panel_menu2.setPixels(0);
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
        panel_despegable_1.setFocusable(false);
        panel_despegable_1.setPixels(0);
        panel_despegable_1.setPreferredSize(new java.awt.Dimension(10, 722));
        panel_despegable_1.setRequestFocusEnabled(false);
        panel_despegable_1.setRound(40);

        btn_inicio_02.setBackground(new java.awt.Color(246, 247, 251));
        btn_inicio_02.setForeground(new java.awt.Color(131, 137, 152));
        btn_inicio_02.setText("Inicio");
        btn_inicio_02.setBorderPainted(false);
        btn_inicio_02.setContentAreaFilled(true);
        btn_inicio_02.setCornerRound(40);
        btn_inicio_02.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btn_inicio_02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_inicio_02MouseClicked(evt);
            }
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

        btn_paciente_02.setBackground(new java.awt.Color(246, 247, 251));
        btn_paciente_02.setForeground(new java.awt.Color(131, 137, 152));
        btn_paciente_02.setText("Paciente");
        btn_paciente_02.setBorderPainted(false);
        btn_paciente_02.setContentAreaFilled(true);
        btn_paciente_02.setCornerRound(40);
        btn_paciente_02.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
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

        btn_cita_02.setBackground(new java.awt.Color(246, 247, 251));
        btn_cita_02.setForeground(new java.awt.Color(131, 137, 152));
        btn_cita_02.setText("Reservar Cita");
        btn_cita_02.setBorderPainted(false);
        btn_cita_02.setContentAreaFilled(true);
        btn_cita_02.setCornerRound(40);
        btn_cita_02.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
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

        btn_gestionar_cita_02.setBackground(new java.awt.Color(246, 247, 251));
        btn_gestionar_cita_02.setForeground(new java.awt.Color(131, 137, 152));
        btn_gestionar_cita_02.setText("Gestionar Citas");
        btn_gestionar_cita_02.setBorderPainted(false);
        btn_gestionar_cita_02.setContentAreaFilled(true);
        btn_gestionar_cita_02.setCornerRound(40);
        btn_gestionar_cita_02.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
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

        btn_comprobantes_02.setBackground(new java.awt.Color(246, 247, 251));
        btn_comprobantes_02.setForeground(new java.awt.Color(131, 137, 152));
        btn_comprobantes_02.setText("Comprobantes");
        btn_comprobantes_02.setBorderPainted(false);
        btn_comprobantes_02.setContentAreaFilled(true);
        btn_comprobantes_02.setCornerRound(40);
        btn_comprobantes_02.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btn_comprobantes_02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_comprobantes_02MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_comprobantes_02MouseExited(evt);
            }
        });
        btn_comprobantes_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comprobantes_02ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_despegable_1Layout = new javax.swing.GroupLayout(panel_despegable_1);
        panel_despegable_1.setLayout(panel_despegable_1Layout);
        panel_despegable_1Layout.setHorizontalGroup(
            panel_despegable_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_despegable_1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_despegable_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_despegable_1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_inicio_02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_despegable_1Layout.createSequentialGroup()
                        .addGroup(panel_despegable_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_paciente_02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cita_02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_gestionar_cita_02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_comprobantes_02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_despegable_1Layout.setVerticalGroup(
            panel_despegable_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_despegable_1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btn_inicio_02, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(btn_paciente_02, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cita_02, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_gestionar_cita_02, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_comprobantes_02, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        menu_02.setBackground(new java.awt.Color(255, 255, 255));
        menu_02.setBgShade(new java.awt.Color(204, 204, 204));
        menu_02.setPixels(0);
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
        btn_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-usuario-masculino-en-círculo-30.png"))); // NOI18N
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
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
        panel_inicio.add(frm_UI_inicio11, "card2");

        rSPanelMaterial4.add(panel_inicio, "card3");

        panel_paciente.setBackground(new java.awt.Color(255, 255, 255));
        panel_paciente.setName("panel_paciente"); // NOI18N
        panel_paciente.setLayout(new java.awt.CardLayout());
        rSPanelMaterial4.add(panel_paciente, "card3");

        panel_gestion_cita.setLayout(new java.awt.CardLayout());
        panel_gestion_cita.add(frm_UI_03_gestionar_citas1, "card2");

        rSPanelMaterial4.add(panel_gestion_cita, "card9");

        panel_comprobante.setBackground(new java.awt.Color(255, 255, 255));
        panel_comprobante.setName("panel_comprobante"); // NOI18N
        panel_comprobante.setLayout(new java.awt.CardLayout());
        panel_comprobante.add(frm_UI_04_comprobantes1, "card2");

        rSPanelMaterial4.add(panel_comprobante, "card3");

        panel_servicios.setBackground(new java.awt.Color(255, 255, 255));
        panel_servicios.setName("panel_servicios"); // NOI18N
        panel_servicios.setLayout(new java.awt.CardLayout());
        rSPanelMaterial4.add(panel_servicios, "card3");

        panel_especialista.setBackground(new java.awt.Color(255, 255, 255));
        panel_especialista.setName("panel_especialista"); // NOI18N
        panel_especialista.setLayout(new java.awt.CardLayout());
        rSPanelMaterial4.add(panel_especialista, "card3");

        panel_usuarios.setBackground(new java.awt.Color(255, 255, 255));
        panel_usuarios.setName("panel_usuarios"); // NOI18N
        panel_usuarios.setLayout(new java.awt.CardLayout());
        panel_usuarios.add(frm_UI_07_usuarios1, "card2");

        rSPanelMaterial4.add(panel_usuarios, "card3");

        panel_reportes_citas.setBackground(new java.awt.Color(255, 255, 255));
        panel_reportes_citas.setName("panel_inicio"); // NOI18N
        panel_reportes_citas.setLayout(new java.awt.CardLayout());
        rSPanelMaterial4.add(panel_reportes_citas, "card3");

        panel_cita.setBackground(new java.awt.Color(255, 255, 255));
        panel_cita.setLayout(new java.awt.CardLayout());
        panel_cita.add(frm_UI_02_reservar_cita11, "card2");

        rSPanelMaterial4.add(panel_cita, "card2");

        menu_ventana.setBackground(new java.awt.Color(255, 255, 255));
        menu_ventana.setBgShade(new java.awt.Color(204, 204, 204));
        menu_ventana.setPixels(0);
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
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(btn_max, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_min, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        menu_01.setBackground(new java.awt.Color(255, 255, 255));
        menu_01.setBgShade(new java.awt.Color(204, 204, 204));
        menu_01.setPixels(0);
        menu_01.setRound(40);
        menu_01.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                menu_01MouseDragged(evt);
            }
        });
        menu_01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu_01MousePressed(evt);
            }
        });

        lblinicio.setBackground(new java.awt.Color(101, 208, 250));
        lblinicio.setOpaque(true);

        btn_inicio.setBackground(new java.awt.Color(255, 255, 255));
        btn_inicio.setBorder(null);
        btn_inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-casa-30.png"))); // NOI18N
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
        btn_paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-usuario-30.png"))); // NOI18N
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
        btn_cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-calendario-30.png"))); // NOI18N
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
        btn_gestionar_cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-horas-extras-30.png"))); // NOI18N
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
        btn_factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-factura-30.png"))); // NOI18N
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
                .addGroup(menu_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_01Layout.createSequentialGroup()
                        .addComponent(lblfactura, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btn_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(menu_01Layout.createSequentialGroup()
                        .addComponent(lblinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(btn_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(menu_01Layout.createSequentialGroup()
                        .addComponent(lblpacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btn_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(menu_01Layout.createSequentialGroup()
                        .addGroup(menu_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcita, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblgestionar_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(menu_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_gestionar_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btn_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        menu_01Layout.setVerticalGroup(
            menu_01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_01Layout.createSequentialGroup()
                .addGap(60, 60, 60)
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
        menu_salir.setPixels(0);
        menu_salir.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir.setRound(40);

        btn_salir.setBackground(new java.awt.Color(255, 255, 255));
        btn_salir.setBorder(null);
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/apagar 2.png"))); // NOI18N
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
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        menu_salirLayout.setVerticalGroup(
            menu_salirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        panel_despegable_2.setBackground(new java.awt.Color(255, 255, 255));
        panel_despegable_2.setBgShade(new java.awt.Color(255, 255, 255));
        panel_despegable_2.setPixels(0);
        panel_despegable_2.setPreferredSize(new java.awt.Dimension(10, 360));
        panel_despegable_2.setRound(40);

        btn_usuarios_02.setBackground(new java.awt.Color(246, 247, 251));
        btn_usuarios_02.setForeground(new java.awt.Color(131, 137, 152));
        btn_usuarios_02.setText("Usuarios");
        btn_usuarios_02.setBorderPainted(false);
        btn_usuarios_02.setContentAreaFilled(true);
        btn_usuarios_02.setCornerRound(40);
        btn_usuarios_02.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btn_usuarios_02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_usuarios_02MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_usuarios_02MouseExited(evt);
            }
        });
        btn_usuarios_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuarios_02ActionPerformed(evt);
            }
        });

        btn_servicios_02.setBackground(new java.awt.Color(246, 247, 251));
        btn_servicios_02.setForeground(new java.awt.Color(131, 137, 152));
        btn_servicios_02.setText("Servicios");
        btn_servicios_02.setBorderPainted(false);
        btn_servicios_02.setContentAreaFilled(true);
        btn_servicios_02.setCornerRound(40);
        btn_servicios_02.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
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

        btn_especialista_02.setBackground(new java.awt.Color(246, 247, 251));
        btn_especialista_02.setForeground(new java.awt.Color(131, 137, 152));
        btn_especialista_02.setText("Especialistas");
        btn_especialista_02.setBorderPainted(false);
        btn_especialista_02.setContentAreaFilled(true);
        btn_especialista_02.setCornerRound(40);
        btn_especialista_02.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_despegable_2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_despegable_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_servicios_02, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn_especialista_02, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn_usuarios_02, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_despegable_2Layout.setVerticalGroup(
            panel_despegable_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_despegable_2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(btn_servicios_02, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(btn_especialista_02, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(btn_usuarios_02, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_despegable_base_datos.setBackground(new java.awt.Color(255, 255, 255));
        panel_despegable_base_datos.setBgShade(new java.awt.Color(255, 255, 255));
        panel_despegable_base_datos.setPixels(0);
        panel_despegable_base_datos.setPreferredSize(new java.awt.Dimension(10, 722));
        panel_despegable_base_datos.setRound(40);

        btn_createbackup.setBackground(new java.awt.Color(246, 247, 251));
        btn_createbackup.setForeground(new java.awt.Color(131, 137, 152));
        btn_createbackup.setText("Copia de Seguridad BD");
        btn_createbackup.setBorderPainted(false);
        btn_createbackup.setContentAreaFilled(true);
        btn_createbackup.setCornerRound(40);
        btn_createbackup.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btn_createbackup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_createbackupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_createbackupMouseExited(evt);
            }
        });
        btn_createbackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createbackupActionPerformed(evt);
            }
        });

        btn_restoredatabase.setBackground(new java.awt.Color(246, 247, 251));
        btn_restoredatabase.setForeground(new java.awt.Color(131, 137, 152));
        btn_restoredatabase.setText("Restaurar BD");
        btn_restoredatabase.setBorderPainted(false);
        btn_restoredatabase.setContentAreaFilled(true);
        btn_restoredatabase.setCornerRound(40);
        btn_restoredatabase.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btn_restoredatabase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_restoredatabaseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_restoredatabaseMouseExited(evt);
            }
        });
        btn_restoredatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restoredatabaseActionPerformed(evt);
            }
        });

        btn_resetdatabase.setBackground(new java.awt.Color(246, 247, 251));
        btn_resetdatabase.setForeground(new java.awt.Color(131, 137, 152));
        btn_resetdatabase.setText("Vaciar");
        btn_resetdatabase.setBorderPainted(false);
        btn_resetdatabase.setContentAreaFilled(true);
        btn_resetdatabase.setCornerRound(40);
        btn_resetdatabase.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btn_resetdatabase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_resetdatabaseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_resetdatabaseMouseExited(evt);
            }
        });
        btn_resetdatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetdatabaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_despegable_base_datosLayout = new javax.swing.GroupLayout(panel_despegable_base_datos);
        panel_despegable_base_datos.setLayout(panel_despegable_base_datosLayout);
        panel_despegable_base_datosLayout.setHorizontalGroup(
            panel_despegable_base_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_despegable_base_datosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_despegable_base_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_createbackup, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn_restoredatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn_resetdatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_despegable_base_datosLayout.setVerticalGroup(
            panel_despegable_base_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_despegable_base_datosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btn_createbackup, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_restoredatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_resetdatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panel_despegable_ventana.setBackground(new java.awt.Color(255, 255, 255));
        panel_despegable_ventana.setBgShade(new java.awt.Color(255, 255, 255));
        panel_despegable_ventana.setPixels(0);
        panel_despegable_ventana.setPreferredSize(new java.awt.Dimension(10, 722));
        panel_despegable_ventana.setRound(40);

        btn_max_02.setBackground(new java.awt.Color(246, 247, 251));
        btn_max_02.setForeground(new java.awt.Color(131, 137, 152));
        btn_max_02.setText("Maximizar");
        btn_max_02.setBorderPainted(false);
        btn_max_02.setContentAreaFilled(true);
        btn_max_02.setCornerRound(40);
        btn_max_02.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
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

        btn_min_02.setBackground(new java.awt.Color(246, 247, 251));
        btn_min_02.setForeground(new java.awt.Color(131, 137, 152));
        btn_min_02.setText("Minimizar");
        btn_min_02.setBorderPainted(false);
        btn_min_02.setContentAreaFilled(true);
        btn_min_02.setCornerRound(40);
        btn_min_02.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
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
                .addGap(37, 37, 37)
                .addGroup(panel_despegable_ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_max_02, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(btn_min_02, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_despegable_ventanaLayout.setVerticalGroup(
            panel_despegable_ventanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_despegable_ventanaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btn_max_02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_min_02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_despegable_titulo_2.setBackground(new java.awt.Color(255, 255, 255));
        panel_despegable_titulo_2.setBgShade(new java.awt.Color(255, 255, 255));
        panel_despegable_titulo_2.setPixels(0);
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
        menu_bd.setPixels(0);
        menu_bd.setPreferredSize(new java.awt.Dimension(80, 128));
        menu_bd.setRound(40);

        btn_base_datos.setBackground(new java.awt.Color(255, 255, 255));
        btn_base_datos.setBorder(null);
        btn_base_datos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-base-de-datos.png"))); // NOI18N
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
                .addContainerGap(80, Short.MAX_VALUE))
        );

        panel_despegable_titulo_1.setBackground(new java.awt.Color(255, 255, 255));
        panel_despegable_titulo_1.setBgShade(new java.awt.Color(255, 255, 255));
        panel_despegable_titulo_1.setFocusable(false);
        panel_despegable_titulo_1.setPixels(0);
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
        panel_despegable_salir_1.setPixels(0);
        panel_despegable_salir_1.setPreferredSize(new java.awt.Dimension(10, 74));
        panel_despegable_salir_1.setRound(40);

        btn_salir_02.setBackground(new java.awt.Color(246, 247, 251));
        btn_salir_02.setForeground(new java.awt.Color(131, 137, 152));
        btn_salir_02.setText("Salir");
        btn_salir_02.setBorderPainted(false);
        btn_salir_02.setContentAreaFilled(true);
        btn_salir_02.setCornerRound(40);
        btn_salir_02.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btn_salir_02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_salir_02MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_salir_02MouseExited(evt);
            }
        });
        btn_salir_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salir_02ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_despegable_salir_1Layout = new javax.swing.GroupLayout(panel_despegable_salir_1);
        panel_despegable_salir_1.setLayout(panel_despegable_salir_1Layout);
        panel_despegable_salir_1Layout.setHorizontalGroup(
            panel_despegable_salir_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_despegable_salir_1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btn_salir_02, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_despegable_salir_1Layout.setVerticalGroup(
            panel_despegable_salir_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_despegable_salir_1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(btn_salir_02, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menu_salir1.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir1.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir1.setFocusable(false);
        menu_salir1.setPixels(0);
        menu_salir1.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir1.setRound(40);

        lblreporte.setBackground(new java.awt.Color(101, 208, 250));
        lblreporte.setOpaque(true);

        btn_reportes.setBackground(new java.awt.Color(255, 255, 255));
        btn_reportes.setBorder(null);
        btn_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-presentación-30.png"))); // NOI18N
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
                .addComponent(btn_reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        panel_despegable_reportes.setFocusable(false);
        panel_despegable_reportes.setPixels(0);
        panel_despegable_reportes.setPreferredSize(new java.awt.Dimension(10, 74));
        panel_despegable_reportes.setRound(40);

        btn_reporte_citas.setBackground(new java.awt.Color(246, 247, 251));
        btn_reporte_citas.setForeground(new java.awt.Color(131, 137, 152));
        btn_reporte_citas.setText("Reporte de Citas");
        btn_reporte_citas.setBorderPainted(false);
        btn_reporte_citas.setContentAreaFilled(true);
        btn_reporte_citas.setCornerRound(40);
        btn_reporte_citas.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btn_reporte_citas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_reporte_citasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_reporte_citasMouseExited(evt);
            }
        });
        btn_reporte_citas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reporte_citasActionPerformed(evt);
            }
        });

        btn_reportes_facturas.setBackground(new java.awt.Color(246, 247, 251));
        btn_reportes_facturas.setForeground(new java.awt.Color(131, 137, 152));
        btn_reportes_facturas.setText("Reporte de facturas");
        btn_reportes_facturas.setBorderPainted(false);
        btn_reportes_facturas.setContentAreaFilled(true);
        btn_reportes_facturas.setCornerRound(40);
        btn_reportes_facturas.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btn_reportes_facturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_reportes_facturasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_reportes_facturasMouseExited(evt);
            }
        });
        btn_reportes_facturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportes_facturasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_despegable_reportesLayout = new javax.swing.GroupLayout(panel_despegable_reportes);
        panel_despegable_reportes.setLayout(panel_despegable_reportesLayout);
        panel_despegable_reportesLayout.setHorizontalGroup(
            panel_despegable_reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_despegable_reportesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_despegable_reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_reporte_citas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_reportes_facturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_despegable_reportesLayout.setVerticalGroup(
            panel_despegable_reportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_despegable_reportesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btn_reporte_citas, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_reportes_facturas, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/f27.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1244, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menu_01, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu_salir1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(menu_salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(panel_menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_despegable_titulo_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_despegable_salir_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panel_despegable_reportes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_despegable_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSPanelMaterial4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(rSPanelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel_despegable_titulo_2, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(panel_menu2, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel_despegable_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                .addComponent(panel_despegable_salir_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(rSPanelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        public void estado_usuario() {

        User global_User = new User();
        global_User = WIN31CLC_DTO.declaraciones.getGlobal_User();
        if (global_User.getUsername() != null) {
            if (global_User.getRole().equals("1")) {
                btn_usuario.setEnabled(true);
                btn_usuarios_02.setEnabled(true);
                btn_base_datos.setEnabled(true);
                btn_createbackup.setEnabled(true);
                btn_restoredatabase.setEnabled(true);
                btn_resetdatabase.setEnabled(true);
            } else if (global_User.getRole().equals("2")) {
                btn_usuario.setEnabled(false);
                btn_usuarios_02.setEnabled(false);
                btn_base_datos.setEnabled(false);
                btn_createbackup.setEnabled(false);
                btn_restoredatabase.setEnabled(false);
                btn_resetdatabase.setEnabled(false);

            }
        }

    }

    public void labels_iniciales() {
        lblinicio.setBackground(new Color(101, 208, 250));
        lblpacientes.setBackground(new Color(255, 255, 255));
        lblcita.setBackground(new Color(255, 255, 255));
        lblgestionar_cita.setBackground(new Color(255, 255, 255));
        lblfactura.setBackground(new Color(255, 255, 255));
        lblreporte.setBackground(new Color(255, 255, 255));
        lblservicios.setBackground(new Color(255, 255, 255));
        lblespecialista.setBackground(new Color(255, 255, 255));
        lblbasedatos.setBackground(new Color(255, 255, 255));
        lblusuarios.setBackground(new Color(255, 255, 255));

        btn_inicio_02.setBackground(new Color(139, 198, 255, 255));
        btn_inicio_02.setForeground(new Color(255, 255, 255));
        changeimage_button(btn_inicio, "/WIN34CLC_RESOURCES_UI/1.png");
    }

    public void colores_menus_despegables() {
        panel_despegable_1.setBackground(new Color(255, 255, 255, 150));
        panel_despegable_titulo_1.setBackground(new Color(255, 255, 255, 220));
        panel_despegable_salir_1.setBackground(new Color(255, 255, 255, 220));
        panel_despegable_reportes.setBackground(new Color(255, 255, 255, 150));

        panel_despegable_2.setBackground(new Color(255, 255, 255, 150));
        panel_despegable_titulo_2.setBackground(new Color(255, 255, 255, 220));
        panel_despegable_ventana.setBackground(new Color(255, 255, 255, 220));
        panel_despegable_base_datos.setBackground(new Color(255, 255, 255, 150));
        //-------

        btn_reporte_citas.setBackground(new Color(255, 255, 255, 0));
        btn_reportes_facturas.setBackground(new Color(255, 255, 255, 0));
        btn_salir_02.setBackground(new Color(255, 255, 255, 0));

        //-------
        btn_reporte_citas.setBackground(new Color(255, 255, 255, 0));
        btn_reportes_facturas.setBackground(new Color(255, 255, 255, 0));
        //btn_paciente_5.setBackground(new Color (255,255,255,0));

        btn_createbackup.setBackground(new Color(255, 255, 255, 0));
        btn_restoredatabase.setBackground(new Color(255, 255, 255, 0));
        btn_resetdatabase.setBackground(new Color(255, 255, 255, 0));

        btn_max_02.setBackground(new Color(255, 255, 255, 0));
        btn_min_02.setBackground(new Color(255, 255, 255, 0));
    }

    public void changeimage(JLabel button, String resourcheimg) {
        ImageIcon aimg = new ImageIcon(getClass().getResource(resourcheimg));
        button.setIcon(aimg);
    }

    public void changeimage_button(RSButtonMaterialGradientOne button, String resourcheimg) {
        ImageIcon aimg = new ImageIcon(getClass().getResource(resourcheimg));
        button.setIcon(aimg);
    }

    public void boton_inicio() {

        if (!this.btn_inicio.isSelected()) {
            this.btn_inicio.setSelected(true);
            this.btn_paciente.setSelected(false);
            this.btn_cita.setSelected(false);
            this.btn_gestionar_cita.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            this.btn_especialista.setSelected(false);
            this.btn_reportes.setSelected(false);
            this.btn_usuario.setSelected(false);
            this.btn_reporte_citas.setSelected(false);
            this.btn_reportes_facturas.setSelected(false);
            this.btn_createbackup.setSelected(false);
            this.btn_restoredatabase.setSelected(false);
            this.btn_resetdatabase.setSelected(false);
            this.btn_base_datos.setSelected(false);

            btn_inicio_02.setBackground(new Color(139, 198, 255, 255));
            btn_inicio_02.setForeground(new Color(255, 255, 255, 255));
            btn_paciente_02.setBackground(new Color(255, 255, 255, 0));
            btn_paciente_02.setForeground(new Color(131, 137, 152));
            btn_cita_02.setBackground(new Color(255, 255, 255, 0));
            btn_cita_02.setForeground(new Color(131, 137, 152));
            btn_gestionar_cita_02.setBackground(new Color(255, 255, 255, 0));
            btn_gestionar_cita_02.setForeground(new Color(131, 137, 152));
            btn_comprobantes_02.setBackground(new Color(255, 255, 255, 0));
            btn_comprobantes_02.setForeground(new Color(131, 137, 152));
            btn_servicios_02.setBackground(new Color(255, 255, 255, 0));
            btn_servicios_02.setForeground(new Color(131, 137, 152));
            btn_especialista_02.setBackground(new Color(255, 255, 255, 0));
            btn_especialista_02.setForeground(new Color(131, 137, 152));
            btn_usuarios_02.setBackground(new Color(255, 255, 255, 0));
            btn_usuarios_02.setForeground(new Color(131, 137, 152));
            btn_reporte_citas.setBackground(new Color(255, 255, 255, 0));
            btn_reporte_citas.setForeground(new Color(131, 137, 152));
            btn_reportes_facturas.setBackground(new Color(255, 255, 255, 0));
            btn_reportes_facturas.setForeground(new Color(131, 137, 152));
            btn_createbackup.setBackground(new Color(255, 255, 255, 0));
            btn_createbackup.setForeground(new Color(131, 137, 152));
            btn_restoredatabase.setBackground(new Color(255, 255, 255, 0));
            btn_restoredatabase.setForeground(new Color(131, 137, 152));
            btn_resetdatabase.setBackground(new Color(255, 255, 255, 0));
            btn_resetdatabase.setForeground(new Color(131, 137, 152));

            panel_inicio.setVisible(true);
            panel_paciente.setVisible(false);
            panel_cita.setVisible(false);
            panel_gestion_cita.setVisible(false);
            panel_comprobante.setVisible(false);
            panel_servicios.setVisible(false);
            panel_especialista.setVisible(false);
            panel_usuarios.setVisible(false);
            panel_reportes_citas.setVisible(false);

            changeimage_button(btn_inicio, "/WIN34CLC_RESOURCES_UI/1.png");
            changeimage_button(btn_paciente, "/WIN34CLC_RESOURCES_UI/icons8-usuario-30.png");
            changeimage_button(btn_cita, "/WIN34CLC_RESOURCES_UI/icons8-calendario-30.png");
            changeimage_button(btn_gestionar_cita, "/WIN34CLC_RESOURCES_UI/icons8-horas-extras-30.png");
            changeimage_button(btn_factura, "/WIN34CLC_RESOURCES_UI/icons8-factura-30.png");
            changeimage_button(btn_reportes, "/WIN34CLC_RESOURCES_UI/icons8-presentación-30.png");
            changeimage_button(btn_servicios, "/WIN34CLC_RESOURCES_UI/icons8-maletín-médico-30.png");
            changeimage_button(btn_especialista, "/WIN34CLC_RESOURCES_UI/icons8-doctor-en-medicina-30.png");
            changeimage_button(btn_usuario, "/WIN34CLC_RESOURCES_UI/icons8-usuario-masculino-en-círculo-30.png");
            changeimage_button(btn_base_datos, "/WIN34CLC_RESOURCES_UI/icons8-base-de-datos.png");

        }

        lblinicio.setBackground(new Color(101, 208, 250));
        lblpacientes.setBackground(new Color(255, 255, 255));
        lblcita.setBackground(new Color(255, 255, 255));
        lblgestionar_cita.setBackground(new Color(255, 255, 255));
        lblfactura.setBackground(new Color(255, 255, 255));
        lblreporte.setBackground(new Color(255, 255, 255));
        lblservicios.setBackground(new Color(255, 255, 255));
        lblespecialista.setBackground(new Color(255, 255, 255));
        lblbasedatos.setBackground(new Color(255, 255, 255));
        lblusuarios.setBackground(new Color(255, 255, 255));
    }

    public void boton_paciente() {

        if (!this.btn_paciente.isSelected()) {
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(true);
            this.btn_cita.setSelected(false);
            this.btn_gestionar_cita.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            this.btn_especialista.setSelected(false);
            this.btn_reportes.setSelected(false);
            this.btn_usuario.setSelected(false);
            this.btn_reporte_citas.setSelected(false);
            this.btn_reportes_facturas.setSelected(false);
            this.btn_createbackup.setSelected(false);
            this.btn_restoredatabase.setSelected(false);
            this.btn_resetdatabase.setSelected(false);
            this.btn_base_datos.setSelected(false);

            btn_inicio_02.setBackground(new Color(255, 255, 255, 0));
            btn_inicio_02.setForeground(new Color(131, 137, 152));
            btn_paciente_02.setBackground(new Color(139, 198, 255, 255));
            btn_paciente_02.setForeground(new Color(255, 255, 255, 255));
            btn_cita_02.setBackground(new Color(255, 255, 255, 0));
            btn_cita_02.setForeground(new Color(131, 137, 152));
            btn_gestionar_cita_02.setBackground(new Color(255, 255, 255, 0));
            btn_gestionar_cita_02.setForeground(new Color(131, 137, 152));
            btn_comprobantes_02.setBackground(new Color(255, 255, 255, 0));
            btn_comprobantes_02.setForeground(new Color(131, 137, 152));
            btn_servicios_02.setBackground(new Color(255, 255, 255, 0));
            btn_servicios_02.setForeground(new Color(131, 137, 152));
            btn_especialista_02.setBackground(new Color(255, 255, 255, 0));
            btn_especialista_02.setForeground(new Color(131, 137, 152));
            btn_usuarios_02.setBackground(new Color(255, 255, 255, 0));
            btn_usuarios_02.setForeground(new Color(131, 137, 152));
            btn_reporte_citas.setBackground(new Color(255, 255, 255, 0));
            btn_reporte_citas.setForeground(new Color(131, 137, 152));
            btn_reportes_facturas.setBackground(new Color(255, 255, 255, 0));
            btn_reportes_facturas.setForeground(new Color(131, 137, 152));
            btn_createbackup.setBackground(new Color(255, 255, 255, 0));
            btn_createbackup.setForeground(new Color(131, 137, 152));
            btn_restoredatabase.setBackground(new Color(255, 255, 255, 0));
            btn_restoredatabase.setForeground(new Color(131, 137, 152));
            btn_resetdatabase.setBackground(new Color(255, 255, 255, 0));
            btn_resetdatabase.setForeground(new Color(131, 137, 152));

            panel_inicio.setVisible(false);
            panel_paciente.setVisible(true);
            panel_cita.setVisible(false);
            panel_gestion_cita.setVisible(false);
            panel_comprobante.setVisible(false);
            panel_servicios.setVisible(false);
            panel_especialista.setVisible(false);
            panel_usuarios.setVisible(false);
            panel_reportes_citas.setVisible(false);

            changeimage_button(btn_paciente, "/WIN34CLC_RESOURCES_UI/2.png");

            changeimage_button(btn_inicio, "/WIN34CLC_RESOURCES_UI/icons8-casa-30.png");

            changeimage_button(btn_cita, "/WIN34CLC_RESOURCES_UI/icons8-calendario-30.png");
            changeimage_button(btn_gestionar_cita, "/WIN34CLC_RESOURCES_UI/icons8-horas-extras-30.png");
            changeimage_button(btn_factura, "/WIN34CLC_RESOURCES_UI/icons8-factura-30.png");
            changeimage_button(btn_reportes, "/WIN34CLC_RESOURCES_UI/icons8-presentación-30.png");
            changeimage_button(btn_servicios, "/WIN34CLC_RESOURCES_UI/icons8-maletín-médico-30.png");
            changeimage_button(btn_especialista, "/WIN34CLC_RESOURCES_UI/icons8-doctor-en-medicina-30.png");
            changeimage_button(btn_usuario, "/WIN34CLC_RESOURCES_UI/icons8-usuario-masculino-en-círculo-30.png");
            changeimage_button(btn_base_datos, "/WIN34CLC_RESOURCES_UI/icons8-base-de-datos.png");

        }

        lblinicio.setBackground(new Color(255, 255, 255));
        lblpacientes.setBackground(new Color(101, 208, 250));
        lblcita.setBackground(new Color(255, 255, 255));
        lblgestionar_cita.setBackground(new Color(255, 255, 255));
        lblfactura.setBackground(new Color(255, 255, 255));
        lblreporte.setBackground(new Color(255, 255, 255));
        lblservicios.setBackground(new Color(255, 255, 255));
        lblespecialista.setBackground(new Color(255, 255, 255));
        lblbasedatos.setBackground(new Color(255, 255, 255));
        lblusuarios.setBackground(new Color(255, 255, 255));
    }

    public void boton_cita() {

        if (!this.btn_cita.isSelected()) {
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_cita.setSelected(true);
            this.btn_gestionar_cita.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            this.btn_especialista.setSelected(false);
            this.btn_reportes.setSelected(false);
            this.btn_usuario.setSelected(false);
            this.btn_reporte_citas.setSelected(false);
            this.btn_reportes_facturas.setSelected(false);
            this.btn_createbackup.setSelected(false);
            this.btn_restoredatabase.setSelected(false);
            this.btn_resetdatabase.setSelected(false);
            this.btn_base_datos.setSelected(false);

            btn_inicio_02.setBackground(new Color(255, 255, 255, 0));
            btn_inicio_02.setForeground(new Color(131, 137, 152));
            btn_paciente_02.setBackground(new Color(255, 255, 255, 0));
            btn_paciente_02.setForeground(new Color(131, 137, 152));
            btn_cita_02.setBackground(new Color(139, 198, 255, 255));
            btn_cita_02.setForeground(new Color(255, 255, 255, 255));
            btn_gestionar_cita_02.setBackground(new Color(255, 255, 255, 0));
            btn_gestionar_cita_02.setForeground(new Color(131, 137, 152));
            btn_comprobantes_02.setBackground(new Color(255, 255, 255, 0));
            btn_comprobantes_02.setForeground(new Color(131, 137, 152));
            btn_servicios_02.setBackground(new Color(255, 255, 255, 0));
            btn_servicios_02.setForeground(new Color(131, 137, 152));
            btn_especialista_02.setBackground(new Color(255, 255, 255, 0));
            btn_especialista_02.setForeground(new Color(131, 137, 152));
            btn_usuarios_02.setBackground(new Color(255, 255, 255, 0));
            btn_usuarios_02.setForeground(new Color(131, 137, 152));

            btn_reporte_citas.setBackground(new Color(255, 255, 255, 0));
            btn_reporte_citas.setForeground(new Color(131, 137, 152));
            btn_reportes_facturas.setBackground(new Color(255, 255, 255, 0));
            btn_reportes_facturas.setForeground(new Color(131, 137, 152));
            btn_createbackup.setBackground(new Color(255, 255, 255, 0));
            btn_createbackup.setForeground(new Color(131, 137, 152));
            btn_restoredatabase.setBackground(new Color(255, 255, 255, 0));
            btn_restoredatabase.setForeground(new Color(131, 137, 152));
            btn_resetdatabase.setBackground(new Color(255, 255, 255, 0));
            btn_resetdatabase.setForeground(new Color(131, 137, 152));

            panel_inicio.setVisible(false);
            panel_paciente.setVisible(false);
            panel_cita.setVisible(true);
            panel_gestion_cita.setVisible(false);
            panel_comprobante.setVisible(false);
            panel_servicios.setVisible(false);
            panel_especialista.setVisible(false);
            panel_usuarios.setVisible(false);
            panel_reportes_citas.setVisible(false);

            changeimage_button(btn_inicio, "/WIN34CLC_RESOURCES_UI/icons8-casa-30.png");
            changeimage_button(btn_paciente, "/WIN34CLC_RESOURCES_UI/icons8-usuario-30.png");
            changeimage_button(btn_cita, "/WIN34CLC_RESOURCES_UI/3.png");
            changeimage_button(btn_gestionar_cita, "/WIN34CLC_RESOURCES_UI/icons8-horas-extras-30.png");
            changeimage_button(btn_factura, "/WIN34CLC_RESOURCES_UI/icons8-factura-30.png");
            changeimage_button(btn_reportes, "/WIN34CLC_RESOURCES_UI/icons8-presentación-30.png");
            changeimage_button(btn_servicios, "/WIN34CLC_RESOURCES_UI/icons8-maletín-médico-30.png");
            changeimage_button(btn_especialista, "/WIN34CLC_RESOURCES_UI/icons8-doctor-en-medicina-30.png");
            changeimage_button(btn_usuario, "/WIN34CLC_RESOURCES_UI/icons8-usuario-masculino-en-círculo-30.png");
            changeimage_button(btn_base_datos, "/WIN34CLC_RESOURCES_UI/icons8-base-de-datos.png");

        }

        lblinicio.setBackground(new Color(255, 255, 255));
        lblpacientes.setBackground(new Color(255, 255, 255));
        lblcita.setBackground(new Color(101, 208, 250));
        lblgestionar_cita.setBackground(new Color(255, 255, 255));
        lblfactura.setBackground(new Color(255, 255, 255));
        lblreporte.setBackground(new Color(255, 255, 255));
        lblservicios.setBackground(new Color(255, 255, 255));
        lblespecialista.setBackground(new Color(255, 255, 255));
        lblbasedatos.setBackground(new Color(255, 255, 255));
        lblusuarios.setBackground(new Color(255, 255, 255));
    }

    public void boton_gestionarCita() {
        if (!this.btn_gestionar_cita.isSelected()) {
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_cita.setSelected(false);
            this.btn_gestionar_cita.setSelected(true);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            this.btn_especialista.setSelected(false);
            this.btn_reportes.setSelected(false);
            this.btn_usuario.setSelected(false);
            this.btn_reporte_citas.setSelected(false);
            this.btn_reportes_facturas.setSelected(false);
            this.btn_createbackup.setSelected(false);
            this.btn_restoredatabase.setSelected(false);
            this.btn_resetdatabase.setSelected(false);
            this.btn_base_datos.setSelected(false);

            btn_inicio_02.setBackground(new Color(255, 255, 255, 0));
            btn_inicio_02.setForeground(new Color(131, 137, 152));
            btn_paciente_02.setBackground(new Color(255, 255, 255, 0));
            btn_paciente_02.setForeground(new Color(131, 137, 152));
            btn_cita_02.setBackground(new Color(255, 255, 255, 0));
            btn_cita_02.setForeground(new Color(131, 137, 152));
            btn_gestionar_cita_02.setBackground(new Color(139, 198, 255, 255));
            btn_gestionar_cita_02.setForeground(new Color(255, 255, 255, 255));
            btn_comprobantes_02.setBackground(new Color(255, 255, 255, 0));
            btn_comprobantes_02.setForeground(new Color(131, 137, 152));
            btn_servicios_02.setBackground(new Color(255, 255, 255, 0));
            btn_servicios_02.setForeground(new Color(131, 137, 152));
            btn_especialista_02.setBackground(new Color(255, 255, 255, 0));
            btn_especialista_02.setForeground(new Color(131, 137, 152));
            btn_usuarios_02.setBackground(new Color(255, 255, 255, 0));
            btn_usuarios_02.setForeground(new Color(131, 137, 152));

            btn_reporte_citas.setBackground(new Color(255, 255, 255, 0));
            btn_reporte_citas.setForeground(new Color(131, 137, 152));
            btn_reportes_facturas.setBackground(new Color(255, 255, 255, 0));
            btn_reportes_facturas.setForeground(new Color(131, 137, 152));
            btn_createbackup.setBackground(new Color(255, 255, 255, 0));
            btn_createbackup.setForeground(new Color(131, 137, 152));
            btn_restoredatabase.setBackground(new Color(255, 255, 255, 0));
            btn_restoredatabase.setForeground(new Color(131, 137, 152));
            btn_resetdatabase.setBackground(new Color(255, 255, 255, 0));
            btn_resetdatabase.setForeground(new Color(131, 137, 152));

            panel_inicio.setVisible(false);
            panel_paciente.setVisible(false);
            panel_cita.setVisible(false);
            panel_gestion_cita.setVisible(true);
            panel_comprobante.setVisible(false);
            panel_servicios.setVisible(false);
            panel_especialista.setVisible(false);
            panel_usuarios.setVisible(false);
            panel_reportes_citas.setVisible(false);

            changeimage_button(btn_inicio, "/WIN34CLC_RESOURCES_UI/icons8-casa-30.png");
            changeimage_button(btn_paciente, "/WIN34CLC_RESOURCES_UI/icons8-usuario-30.png");
            changeimage_button(btn_cita, "/WIN34CLC_RESOURCES_UI/icons8-calendario-30.png");
            changeimage_button(btn_gestionar_cita, "/WIN34CLC_RESOURCES_UI/4.png");
            changeimage_button(btn_factura, "/WIN34CLC_RESOURCES_UI/icons8-factura-30.png");
            changeimage_button(btn_reportes, "/WIN34CLC_RESOURCES_UI/icons8-presentación-30.png");
            changeimage_button(btn_servicios, "/WIN34CLC_RESOURCES_UI/icons8-maletín-médico-30.png");
            changeimage_button(btn_especialista, "/WIN34CLC_RESOURCES_UI/icons8-doctor-en-medicina-30.png");
            changeimage_button(btn_usuario, "/WIN34CLC_RESOURCES_UI/icons8-usuario-masculino-en-círculo-30.png");
            changeimage_button(btn_base_datos, "/WIN34CLC_RESOURCES_UI/icons8-base-de-datos.png");

        }

        lblinicio.setBackground(new Color(255, 255, 255));
        lblpacientes.setBackground(new Color(255, 255, 255));
        lblcita.setBackground(new Color(255, 255, 255));
        lblgestionar_cita.setBackground(new Color(101, 208, 250));
        lblfactura.setBackground(new Color(255, 255, 255));
        lblreporte.setBackground(new Color(255, 255, 255));
        lblservicios.setBackground(new Color(255, 255, 255));
        lblespecialista.setBackground(new Color(255, 255, 255));
        lblbasedatos.setBackground(new Color(255, 255, 255));
        lblusuarios.setBackground(new Color(255, 255, 255));

    }

    public void boton_comprobante() {

        if (!this.btn_factura.isSelected()) {
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_cita.setSelected(false);
            this.btn_gestionar_cita.setSelected(false);
            this.btn_factura.setSelected(true);
            this.btn_servicios.setSelected(false);
            this.btn_especialista.setSelected(false);
            this.btn_reportes.setSelected(false);
            this.btn_usuario.setSelected(false);
            this.btn_reporte_citas.setSelected(false);
            this.btn_reportes_facturas.setSelected(false);
            this.btn_createbackup.setSelected(false);
            this.btn_restoredatabase.setSelected(false);
            this.btn_resetdatabase.setSelected(false);
            this.btn_base_datos.setSelected(false);

            btn_inicio_02.setBackground(new Color(255, 255, 255, 0));
            btn_inicio_02.setForeground(new Color(131, 137, 152));
            btn_paciente_02.setBackground(new Color(255, 255, 255, 0));
            btn_paciente_02.setForeground(new Color(131, 137, 152));
            btn_cita_02.setBackground(new Color(255, 255, 255, 0));
            btn_cita_02.setForeground(new Color(131, 137, 152));
            btn_gestionar_cita_02.setBackground(new Color(255, 255, 255, 0));
            btn_gestionar_cita_02.setForeground(new Color(131, 137, 152));
            btn_comprobantes_02.setBackground(new Color(139, 198, 255, 255));
            btn_comprobantes_02.setForeground(new Color(255, 255, 255, 255));
            btn_servicios_02.setBackground(new Color(255, 255, 255, 0));
            btn_servicios_02.setForeground(new Color(131, 137, 152));
            btn_especialista_02.setBackground(new Color(255, 255, 255, 0));
            btn_especialista_02.setForeground(new Color(131, 137, 152));
            btn_usuarios_02.setBackground(new Color(255, 255, 255, 0));
            btn_usuarios_02.setForeground(new Color(131, 137, 152));

            btn_reporte_citas.setBackground(new Color(255, 255, 255, 0));
            btn_reporte_citas.setForeground(new Color(131, 137, 152));
            btn_reportes_facturas.setBackground(new Color(255, 255, 255, 0));
            btn_reportes_facturas.setForeground(new Color(131, 137, 152));
            btn_createbackup.setBackground(new Color(255, 255, 255, 0));
            btn_createbackup.setForeground(new Color(131, 137, 152));
            btn_restoredatabase.setBackground(new Color(255, 255, 255, 0));
            btn_restoredatabase.setForeground(new Color(131, 137, 152));
            btn_resetdatabase.setBackground(new Color(255, 255, 255, 0));
            btn_resetdatabase.setForeground(new Color(131, 137, 152));

            panel_inicio.setVisible(false);
            panel_paciente.setVisible(false);
            panel_cita.setVisible(false);
            panel_gestion_cita.setVisible(false);
            panel_comprobante.setVisible(true);
            panel_servicios.setVisible(false);
            panel_especialista.setVisible(false);
            panel_usuarios.setVisible(false);
            panel_reportes_citas.setVisible(false);

            changeimage_button(btn_inicio, "/WIN34CLC_RESOURCES_UI/icons8-casa-30.png");
            changeimage_button(btn_paciente, "/WIN34CLC_RESOURCES_UI/icons8-usuario-30.png");
            changeimage_button(btn_cita, "/WIN34CLC_RESOURCES_UI/icons8-calendario-30.png");
            changeimage_button(btn_gestionar_cita, "/WIN34CLC_RESOURCES_UI/icons8-horas-extras-30.png");
            changeimage_button(btn_factura, "/WIN34CLC_RESOURCES_UI/5.png");
            changeimage_button(btn_reportes, "/WIN34CLC_RESOURCES_UI/icons8-presentación-30.png");
            changeimage_button(btn_servicios, "/WIN34CLC_RESOURCES_UI/icons8-maletín-médico-30.png");
            changeimage_button(btn_especialista, "/WIN34CLC_RESOURCES_UI/icons8-doctor-en-medicina-30.png");
            changeimage_button(btn_usuario, "/WIN34CLC_RESOURCES_UI/icons8-usuario-masculino-en-círculo-30.png");
            changeimage_button(btn_base_datos, "/WIN34CLC_RESOURCES_UI/icons8-base-de-datos.png");

        }

        lblinicio.setBackground(new Color(255, 255, 255));
        lblpacientes.setBackground(new Color(255, 255, 255));
        lblcita.setBackground(new Color(255, 255, 255));
        lblgestionar_cita.setBackground(new Color(255, 255, 255));
        lblfactura.setBackground(new Color(101, 208, 250));
        lblreporte.setBackground(new Color(255, 255, 255));
        lblservicios.setBackground(new Color(255, 255, 255));
        lblespecialista.setBackground(new Color(255, 255, 255));
        lblbasedatos.setBackground(new Color(255, 255, 255));
        lblusuarios.setBackground(new Color(255, 255, 255));
    }

    public void boton_reportes() {
        if (!this.btn_reportes.isSelected()) {
            this.btn_reportes.setSelected(true);
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_cita.setSelected(false);
            this.btn_gestionar_cita.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            this.btn_especialista.setSelected(false);
            this.btn_usuario.setSelected(false);
            this.btn_base_datos.setSelected(false);

            changeimage_button(btn_inicio, "/WIN34CLC_RESOURCES_UI/icons8-casa-30.png");
            changeimage_button(btn_paciente, "/WIN34CLC_RESOURCES_UI/icons8-usuario-30.png");
            changeimage_button(btn_cita, "/WIN34CLC_RESOURCES_UI/icons8-calendario-30.png");
            changeimage_button(btn_gestionar_cita, "/WIN34CLC_RESOURCES_UI/icons8-horas-extras-30.png");
            changeimage_button(btn_factura, "/WIN34CLC_RESOURCES_UI/icons8-factura-30.png");
            changeimage_button(btn_reportes, "/WIN34CLC_RESOURCES_UI/6.png");
            changeimage_button(btn_servicios, "/WIN34CLC_RESOURCES_UI/icons8-maletín-médico-30.png");
            changeimage_button(btn_especialista, "/WIN34CLC_RESOURCES_UI/icons8-doctor-en-medicina-30.png");
            changeimage_button(btn_usuario, "/WIN34CLC_RESOURCES_UI/icons8-usuario-masculino-en-círculo-30.png");
            changeimage_button(btn_base_datos, "/WIN34CLC_RESOURCES_UI/icons8-base-de-datos.png");

            btn_inicio_02.setBackground(new Color(255, 255, 255, 0));
            btn_inicio_02.setForeground(new Color(131, 137, 152));
            btn_paciente_02.setBackground(new Color(255, 255, 255, 0));
            btn_paciente_02.setForeground(new Color(131, 137, 152));
            btn_cita_02.setBackground(new Color(255, 255, 255, 0));
            btn_cita_02.setForeground(new Color(131, 137, 152));
            btn_gestionar_cita_02.setBackground(new Color(255, 255, 255, 0));
            btn_gestionar_cita_02.setForeground(new Color(131, 137, 152));
            btn_comprobantes_02.setBackground(new Color(255, 255, 255, 0));
            btn_comprobantes_02.setForeground(new Color(131, 137, 152));
            btn_servicios_02.setBackground(new Color(255, 255, 255, 0));
            btn_servicios_02.setForeground(new Color(131, 137, 152));
            btn_especialista_02.setBackground(new Color(255, 255, 255, 0));
            btn_especialista_02.setForeground(new Color(131, 137, 152));
            btn_usuarios_02.setBackground(new Color(255, 255, 255, 0));
            btn_usuarios_02.setForeground(new Color(131, 137, 152));

        }

        if (a == true) {

            hideshow(panel_despegable_1, a);
            hideshow(panel_despegable_titulo_1, a);
            hideshow(panel_despegable_salir_1, a);
            hideshow(panel_despegable_reportes, a);

            hideshow(panel_despegable_2, a);
            hideshow(panel_despegable_titulo_2, a);
            hideshow(panel_despegable_base_datos, a);
            hideshow(panel_despegable_ventana, a);

            SwingUtilities.updateComponentTreeUI(this);

            a = false;

            changeimage(lbl_menu_1, "/WIN34CLC_RESOURCES_UI/icons8-menú-30.png");
            changeimage(lbl_menu_2, "/WIN34CLC_RESOURCES_UI/icons8-menú-30.png");
        } else {

            hideshow(panel_despegable_1, a);
            hideshow(panel_despegable_titulo_1, a);
            hideshow(panel_despegable_salir_1, a);
            hideshow(panel_despegable_reportes, a);

            SwingUtilities.updateComponentTreeUI(this);
            a = true;
            changeimage(lbl_menu_1, "/WIN34CLC_RESOURCES_UI/icons8-atrás-30.png");

        }

        lblinicio.setBackground(new Color(255, 255, 255));
        lblpacientes.setBackground(new Color(255, 255, 255));
        lblcita.setBackground(new Color(255, 255, 255));
        lblgestionar_cita.setBackground(new Color(255, 255, 255));
        lblfactura.setBackground(new Color(255, 255, 255));
        lblreporte.setBackground(new Color(101, 208, 250));
        lblservicios.setBackground(new Color(255, 255, 255));
        lblespecialista.setBackground(new Color(255, 255, 255));
        lblbasedatos.setBackground(new Color(255, 255, 255));
        lblusuarios.setBackground(new Color(255, 255, 255));
    }

    public void boton_servicios() {

        if (!this.btn_servicios.isSelected()) {
            this.btn_servicios.setSelected(true);
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_cita.setSelected(false);
            this.btn_gestionar_cita.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_especialista.setSelected(false);
            this.btn_reportes.setSelected(false);
            this.btn_usuario.setSelected(false);
            this.btn_reporte_citas.setSelected(false);
            this.btn_reportes_facturas.setSelected(false);
            this.btn_createbackup.setSelected(false);
            this.btn_restoredatabase.setSelected(false);
            this.btn_resetdatabase.setSelected(false);
            this.btn_base_datos.setSelected(false);

            panel_inicio.setVisible(false);
            panel_paciente.setVisible(false);
            panel_cita.setVisible(false);
            panel_gestion_cita.setVisible(false);
            panel_comprobante.setVisible(false);
            panel_servicios.setVisible(true);
            panel_especialista.setVisible(false);
            panel_usuarios.setVisible(false);
            panel_reportes_citas.setVisible(false);

            btn_inicio_02.setBackground(new Color(255, 255, 255, 0));
            btn_inicio_02.setForeground(new Color(131, 137, 152));
            btn_paciente_02.setBackground(new Color(255, 255, 255, 0));
            btn_paciente_02.setForeground(new Color(131, 137, 152));
            btn_cita_02.setBackground(new Color(255, 255, 255, 0));
            btn_cita_02.setForeground(new Color(131, 137, 152));
            btn_gestionar_cita_02.setBackground(new Color(255, 255, 255, 0));
            btn_gestionar_cita_02.setForeground(new Color(131, 137, 152));
            btn_comprobantes_02.setBackground(new Color(255, 255, 255, 0));
            btn_comprobantes_02.setForeground(new Color(131, 137, 152));
            btn_servicios_02.setBackground(new Color(139, 198, 255, 255));
            btn_servicios_02.setForeground(new Color(255, 255, 255, 255));
            btn_especialista_02.setBackground(new Color(255, 255, 255, 0));
            btn_especialista_02.setForeground(new Color(131, 137, 152));
            btn_usuarios_02.setBackground(new Color(255, 255, 255, 0));
            btn_usuarios_02.setForeground(new Color(131, 137, 152));

            btn_reporte_citas.setBackground(new Color(255, 255, 255, 0));
            btn_reporte_citas.setForeground(new Color(131, 137, 152));
            btn_reportes_facturas.setBackground(new Color(255, 255, 255, 0));
            btn_reportes_facturas.setForeground(new Color(131, 137, 152));
            btn_createbackup.setBackground(new Color(255, 255, 255, 0));
            btn_createbackup.setForeground(new Color(131, 137, 152));
            btn_restoredatabase.setBackground(new Color(255, 255, 255, 0));
            btn_restoredatabase.setForeground(new Color(131, 137, 152));
            btn_resetdatabase.setBackground(new Color(255, 255, 255, 0));
            btn_resetdatabase.setForeground(new Color(131, 137, 152));

            changeimage_button(btn_inicio, "/WIN34CLC_RESOURCES_UI/icons8-casa-30.png");
            changeimage_button(btn_paciente, "/WIN34CLC_RESOURCES_UI/icons8-usuario-30.png");
            changeimage_button(btn_cita, "/WIN34CLC_RESOURCES_UI/icons8-calendario-30.png");
            changeimage_button(btn_gestionar_cita, "/WIN34CLC_RESOURCES_UI/icons8-horas-extras-30.png");
            changeimage_button(btn_factura, "/WIN34CLC_RESOURCES_UI/icons8-factura-30.png");
            changeimage_button(btn_reportes, "/WIN34CLC_RESOURCES_UI/icons8-presentación-30.png");
            changeimage_button(btn_servicios, "/WIN34CLC_RESOURCES_UI/7.png");
            changeimage_button(btn_especialista, "/WIN34CLC_RESOURCES_UI/icons8-doctor-en-medicina-30.png");
            changeimage_button(btn_usuario, "/WIN34CLC_RESOURCES_UI/icons8-usuario-masculino-en-círculo-30.png");
            changeimage_button(btn_base_datos, "/WIN34CLC_RESOURCES_UI/icons8-base-de-datos.png");

        }
        lblinicio.setBackground(new Color(255, 255, 255));
        lblpacientes.setBackground(new Color(255, 255, 255));
        lblcita.setBackground(new Color(255, 255, 255));
        lblgestionar_cita.setBackground(new Color(255, 255, 255));
        lblfactura.setBackground(new Color(255, 255, 255));
        lblreporte.setBackground(new Color(255, 255, 255));
        lblservicios.setBackground(new Color(101, 208, 250));
        lblespecialista.setBackground(new Color(255, 255, 255));
        lblbasedatos.setBackground(new Color(255, 255, 255));
        lblusuarios.setBackground(new Color(255, 255, 255));
    }

    public void boton_especialistas() {

        if (!this.btn_especialista.isSelected()) {
            this.btn_especialista.setSelected(true);
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_cita.setSelected(false);
            this.btn_gestionar_cita.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            this.btn_reportes.setSelected(false);
            this.btn_usuario.setSelected(false);
            this.btn_reporte_citas.setSelected(false);
            this.btn_reportes_facturas.setSelected(false);
            this.btn_createbackup.setSelected(false);
            this.btn_restoredatabase.setSelected(false);
            this.btn_resetdatabase.setSelected(false);
            this.btn_base_datos.setSelected(false);

            panel_inicio.setVisible(false);
            panel_paciente.setVisible(false);
            panel_cita.setVisible(false);
            panel_gestion_cita.setVisible(false);
            panel_comprobante.setVisible(false);
            panel_servicios.setVisible(false);
            panel_especialista.setVisible(true);
            panel_usuarios.setVisible(false);
            panel_reportes_citas.setVisible(false);

            btn_inicio_02.setBackground(new Color(255, 255, 255, 0));
            btn_inicio_02.setForeground(new Color(131, 137, 152));
            btn_paciente_02.setBackground(new Color(255, 255, 255, 0));
            btn_paciente_02.setForeground(new Color(131, 137, 152));
            btn_cita_02.setBackground(new Color(255, 255, 255, 0));
            btn_cita_02.setForeground(new Color(131, 137, 152));
            btn_gestionar_cita_02.setBackground(new Color(255, 255, 255, 0));
            btn_gestionar_cita_02.setForeground(new Color(131, 137, 152));
            btn_comprobantes_02.setBackground(new Color(255, 255, 255, 0));
            btn_comprobantes_02.setForeground(new Color(131, 137, 152));
            btn_servicios_02.setBackground(new Color(255, 255, 255, 0));
            btn_servicios_02.setForeground(new Color(131, 137, 152));
            btn_especialista_02.setBackground(new Color(139, 198, 255, 255));
            btn_especialista_02.setForeground(new Color(255, 255, 255, 255));
            btn_usuarios_02.setBackground(new Color(255, 255, 255, 0));
            btn_usuarios_02.setForeground(new Color(131, 137, 152));

            btn_reporte_citas.setBackground(new Color(255, 255, 255, 0));
            btn_reporte_citas.setForeground(new Color(131, 137, 152));
            btn_reportes_facturas.setBackground(new Color(255, 255, 255, 0));
            btn_reportes_facturas.setForeground(new Color(131, 137, 152));
            btn_createbackup.setBackground(new Color(255, 255, 255, 0));
            btn_createbackup.setForeground(new Color(131, 137, 152));
            btn_restoredatabase.setBackground(new Color(255, 255, 255, 0));
            btn_restoredatabase.setForeground(new Color(131, 137, 152));
            btn_resetdatabase.setBackground(new Color(255, 255, 255, 0));
            btn_resetdatabase.setForeground(new Color(131, 137, 152));

            changeimage_button(btn_inicio, "/WIN34CLC_RESOURCES_UI/icons8-casa-30.png");
            changeimage_button(btn_paciente, "/WIN34CLC_RESOURCES_UI/icons8-usuario-30.png");
            changeimage_button(btn_cita, "/WIN34CLC_RESOURCES_UI/icons8-calendario-30.png");
            changeimage_button(btn_gestionar_cita, "/WIN34CLC_RESOURCES_UI/icons8-horas-extras-30.png");
            changeimage_button(btn_factura, "/WIN34CLC_RESOURCES_UI/icons8-factura-30.png");
            changeimage_button(btn_reportes, "/WIN34CLC_RESOURCES_UI/icons8-presentación-30.png");
            changeimage_button(btn_servicios, "/WIN34CLC_RESOURCES_UI/icons8-maletín-médico-30.png");
            changeimage_button(btn_especialista, "/WIN34CLC_RESOURCES_UI/8.png");
            changeimage_button(btn_usuario, "/WIN34CLC_RESOURCES_UI/icons8-usuario-masculino-en-círculo-30.png");
            changeimage_button(btn_base_datos, "/WIN34CLC_RESOURCES_UI/icons8-base-de-datos.png");

        }
        lblinicio.setBackground(new Color(255, 255, 255));
        lblpacientes.setBackground(new Color(255, 255, 255));
        lblcita.setBackground(new Color(255, 255, 255));
        lblgestionar_cita.setBackground(new Color(255, 255, 255));
        lblfactura.setBackground(new Color(255, 255, 255));
        lblreporte.setBackground(new Color(255, 255, 255));
        lblservicios.setBackground(new Color(255, 255, 255));
        lblespecialista.setBackground(new Color(101, 208, 250));
        lblbasedatos.setBackground(new Color(255, 255, 255));
        lblusuarios.setBackground(new Color(255, 255, 255));
    }

    public void boton_base_datos() {

        if (!this.btn_base_datos.isSelected()) {
            this.btn_especialista.setSelected(false);
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_cita.setSelected(false);
            this.btn_gestionar_cita.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            this.btn_reportes.setSelected(false);
            this.btn_usuario.setSelected(false);
            this.btn_base_datos.setSelected(true);
            this.btn_reporte_citas.setSelected(false);
            this.btn_reportes_facturas.setSelected(false);

            changeimage_button(btn_inicio, "/WIN34CLC_RESOURCES_UI/icons8-casa-30.png");
            changeimage_button(btn_paciente, "/WIN34CLC_RESOURCES_UI/icons8-usuario-30.png");
            changeimage_button(btn_cita, "/WIN34CLC_RESOURCES_UI/icons8-calendario-30.png");
            changeimage_button(btn_gestionar_cita, "/WIN34CLC_RESOURCES_UI/icons8-horas-extras-30.png");
            changeimage_button(btn_factura, "/WIN34CLC_RESOURCES_UI/icons8-factura-30.png");
            changeimage_button(btn_reportes, "/WIN34CLC_RESOURCES_UI/icons8-presentación-30.png");
            changeimage_button(btn_servicios, "/WIN34CLC_RESOURCES_UI/icons8-maletín-médico-30.png");
            changeimage_button(btn_especialista, "/WIN34CLC_RESOURCES_UI/icons8-doctor-en-medicina-30.png");
            changeimage_button(btn_usuario, "/WIN34CLC_RESOURCES_UI/icons8-usuario-masculino-en-círculo-30.png");
            changeimage_button(btn_base_datos, "/WIN34CLC_RESOURCES_UI/10.png");

            btn_inicio_02.setBackground(new Color(255, 255, 255, 0));
            btn_inicio_02.setForeground(new Color(131, 137, 152));
            btn_paciente_02.setBackground(new Color(255, 255, 255, 0));
            btn_paciente_02.setForeground(new Color(131, 137, 152));
            btn_cita_02.setBackground(new Color(255, 255, 255, 0));
            btn_cita_02.setForeground(new Color(131, 137, 152));
            btn_gestionar_cita_02.setBackground(new Color(255, 255, 255, 0));
            btn_gestionar_cita_02.setForeground(new Color(131, 137, 152));
            btn_comprobantes_02.setBackground(new Color(255, 255, 255, 0));
            btn_comprobantes_02.setForeground(new Color(131, 137, 152));
            btn_servicios_02.setBackground(new Color(255, 255, 255, 0));
            btn_servicios_02.setForeground(new Color(131, 137, 152));
            btn_especialista_02.setBackground(new Color(255, 255, 255, 0));
            btn_especialista_02.setForeground(new Color(131, 137, 152));
            btn_usuarios_02.setBackground(new Color(255, 255, 255, 0));
            btn_usuarios_02.setForeground(new Color(131, 137, 152));

            //       
        }

        if (a == true) {
            hideshow(panel_despegable_titulo_2, a);
            hideshow(panel_despegable_2, a);
            hideshow(panel_despegable_base_datos, a);
            hideshow(panel_despegable_ventana, a);

            hideshow(panel_despegable_1, a);
            hideshow(panel_despegable_titulo_1, a);
            hideshow(panel_despegable_salir_1, a);
            hideshow(panel_despegable_reportes, a);

            SwingUtilities.updateComponentTreeUI(this);

            a = false;

            changeimage(lbl_menu_2, "/WIN34CLC_RESOURCES_UI/icons8-menú-30.png");
            changeimage(lbl_menu_1, "/WIN34CLC_RESOURCES_UI/icons8-menú-30.png");
        } else {
            hideshow(panel_despegable_2, a);
            hideshow(panel_despegable_titulo_2, a);
            hideshow(panel_despegable_base_datos, a);
            hideshow(panel_despegable_ventana, a);
            SwingUtilities.updateComponentTreeUI(this);
            a = true;

            changeimage(lbl_menu_2, "/WIN34CLC_RESOURCES_UI/icons8-adelante-30.png");
        }

        lblinicio.setBackground(new Color(255, 255, 255));
        lblpacientes.setBackground(new Color(255, 255, 255));
        lblcita.setBackground(new Color(255, 255, 255));
        lblgestionar_cita.setBackground(new Color(255, 255, 255));
        lblfactura.setBackground(new Color(255, 255, 255));
        lblreporte.setBackground(new Color(255, 255, 255));
        lblservicios.setBackground(new Color(255, 255, 255));
        lblespecialista.setBackground(new Color(255, 255, 255));
        lblbasedatos.setBackground(new Color(101, 208, 250));
        lblusuarios.setBackground(new Color(255, 255, 255));
    }

    public void boton_usuarios() {

        if (!this.btn_usuario.isSelected()) {
            this.btn_especialista.setSelected(false);
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_cita.setSelected(false);
            this.btn_gestionar_cita.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            this.btn_reportes.setSelected(false);
            this.btn_usuario.setSelected(true);
            this.btn_reporte_citas.setSelected(false);
            this.btn_reportes_facturas.setSelected(false);
            this.btn_createbackup.setSelected(false);
            this.btn_restoredatabase.setSelected(false);
            this.btn_resetdatabase.setSelected(false);
            this.btn_base_datos.setSelected(false);

            panel_inicio.setVisible(false);
            panel_paciente.setVisible(false);
            panel_cita.setVisible(false);
            panel_gestion_cita.setVisible(false);
            panel_comprobante.setVisible(false);
            panel_servicios.setVisible(false);
            panel_especialista.setVisible(false);
            panel_usuarios.setVisible(true);
            panel_reportes_citas.setVisible(false);

            btn_inicio_02.setBackground(new Color(255, 255, 255, 0));
            btn_inicio_02.setForeground(new Color(131, 137, 152));
            btn_paciente_02.setBackground(new Color(255, 255, 255, 0));
            btn_paciente_02.setForeground(new Color(131, 137, 152));
            btn_cita_02.setBackground(new Color(255, 255, 255, 0));
            btn_cita_02.setForeground(new Color(131, 137, 152));
            btn_gestionar_cita_02.setBackground(new Color(255, 255, 255, 0));
            btn_gestionar_cita_02.setForeground(new Color(131, 137, 152));
            btn_comprobantes_02.setBackground(new Color(255, 255, 255, 0));
            btn_comprobantes_02.setForeground(new Color(131, 137, 152));
            btn_servicios_02.setBackground(new Color(255, 255, 255, 0));
            btn_servicios_02.setForeground(new Color(131, 137, 152));
            btn_especialista_02.setBackground(new Color(255, 255, 255, 0));
            btn_especialista_02.setForeground(new Color(131, 137, 152));
            btn_usuarios_02.setBackground(new Color(139, 198, 255, 255));
            btn_usuarios_02.setForeground(new Color(255, 255, 255, 255));

            btn_reporte_citas.setBackground(new Color(255, 255, 255, 0));
            btn_reporte_citas.setForeground(new Color(131, 137, 152));
            btn_reportes_facturas.setBackground(new Color(255, 255, 255, 0));
            btn_reportes_facturas.setForeground(new Color(131, 137, 152));
            btn_createbackup.setBackground(new Color(255, 255, 255, 0));
            btn_createbackup.setForeground(new Color(131, 137, 152));
            btn_restoredatabase.setBackground(new Color(255, 255, 255, 0));
            btn_restoredatabase.setForeground(new Color(131, 137, 152));
            btn_resetdatabase.setBackground(new Color(255, 255, 255, 0));
            btn_resetdatabase.setForeground(new Color(131, 137, 152));

            changeimage_button(btn_inicio, "/WIN34CLC_RESOURCES_UI/icons8-casa-30.png");
            changeimage_button(btn_paciente, "/WIN34CLC_RESOURCES_UI/icons8-usuario-30.png");
            changeimage_button(btn_cita, "/WIN34CLC_RESOURCES_UI/icons8-calendario-30.png");
            changeimage_button(btn_gestionar_cita, "/WIN34CLC_RESOURCES_UI/icons8-horas-extras-30.png");
            changeimage_button(btn_factura, "/WIN34CLC_RESOURCES_UI/icons8-factura-30.png");
            changeimage_button(btn_reportes, "/WIN34CLC_RESOURCES_UI/icons8-presentación-30.png");
            changeimage_button(btn_servicios, "/WIN34CLC_RESOURCES_UI/icons8-maletín-médico-30.png");
            changeimage_button(btn_especialista, "/WIN34CLC_RESOURCES_UI/icons8-doctor-en-medicina-30.png");
            changeimage_button(btn_usuario, "/WIN34CLC_RESOURCES_UI/9.png");
            changeimage_button(btn_base_datos, "/WIN34CLC_RESOURCES_UI/icons8-base-de-datos.png");

        }
        lblinicio.setBackground(new Color(255, 255, 255));
        lblpacientes.setBackground(new Color(255, 255, 255));
        lblcita.setBackground(new Color(255, 255, 255));
        lblgestionar_cita.setBackground(new Color(255, 255, 255));
        lblfactura.setBackground(new Color(255, 255, 255));
        lblreporte.setBackground(new Color(255, 255, 255));
        lblservicios.setBackground(new Color(255, 255, 255));
        lblespecialista.setBackground(new Color(255, 255, 255));
        lblbasedatos.setBackground(new Color(255, 255, 255));
        lblusuarios.setBackground(new Color(101, 208, 250));
    }

    /// METODOS PARA DISE:O DE LOS SUB-MENUS
    ///**************************************
    public void subboton_reporte_cita() {
        if (!this.btn_reporte_citas.isSelected()) {
            this.btn_especialista.setSelected(false);
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_cita.setSelected(false);
            this.btn_gestionar_cita.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            this.btn_reportes.setSelected(false);/**/
            this.btn_usuario.setSelected(false);
            this.btn_reporte_citas.setSelected(true);
            this.btn_reportes_facturas.setSelected(false);
            this.btn_createbackup.setSelected(false);
            this.btn_restoredatabase.setSelected(false);
            this.btn_resetdatabase.setSelected(false);
            this.btn_base_datos.setSelected(false);

            panel_inicio.setVisible(false);
            panel_paciente.setVisible(false);
            panel_cita.setVisible(false);
            panel_gestion_cita.setVisible(false);
            panel_comprobante.setVisible(false);
            panel_servicios.setVisible(false);
            panel_especialista.setVisible(false);
            panel_usuarios.setVisible(false);
            panel_reportes_citas.setVisible(true);

            btn_inicio_02.setBackground(new Color(255, 255, 255, 0));
            btn_inicio_02.setForeground(new Color(131, 137, 152));
            btn_paciente_02.setBackground(new Color(255, 255, 255, 0));
            btn_paciente_02.setForeground(new Color(131, 137, 152));
            btn_cita_02.setBackground(new Color(255, 255, 255, 0));
            btn_cita_02.setForeground(new Color(131, 137, 152));
            btn_gestionar_cita_02.setBackground(new Color(255, 255, 255, 0));
            btn_gestionar_cita_02.setForeground(new Color(131, 137, 152));
            btn_comprobantes_02.setBackground(new Color(255, 255, 255, 0));
            btn_comprobantes_02.setForeground(new Color(131, 137, 152));
            btn_servicios_02.setBackground(new Color(255, 255, 255, 0));
            btn_servicios_02.setForeground(new Color(131, 137, 152));
            btn_especialista_02.setBackground(new Color(255, 255, 255, 0));
            btn_especialista_02.setForeground(new Color(131, 137, 152));
            btn_usuarios_02.setBackground(new Color(255, 255, 255, 0));
            btn_usuarios_02.setForeground(new Color(131, 137, 152));
            btn_reporte_citas.setBackground(new Color(139, 198, 255, 255));
            btn_reporte_citas.setForeground(new Color(255, 255, 255, 255));
            btn_reportes_facturas.setBackground(new Color(255, 255, 255, 0));
            btn_reportes_facturas.setForeground(new Color(131, 137, 152));
            btn_createbackup.setBackground(new Color(255, 255, 255, 0));
            btn_createbackup.setForeground(new Color(131, 137, 152));
            btn_restoredatabase.setBackground(new Color(255, 255, 255, 0));
            btn_restoredatabase.setForeground(new Color(131, 137, 152));
            btn_resetdatabase.setBackground(new Color(255, 255, 255, 0));
            btn_resetdatabase.setForeground(new Color(131, 137, 152));

        }
    }

    public void subboton_reporte_facturas() {
        if (!this.btn_reportes_facturas.isSelected()) {
            this.btn_especialista.setSelected(false);
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_cita.setSelected(false);
            this.btn_gestionar_cita.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            this.btn_reportes.setSelected(false);
            this.btn_usuario.setSelected(false);
            this.btn_reporte_citas.setSelected(false);
            this.btn_reportes_facturas.setSelected(true);
            this.btn_createbackup.setSelected(false);
            this.btn_restoredatabase.setSelected(false);
            this.btn_resetdatabase.setSelected(false);
            this.btn_base_datos.setSelected(false);

            btn_inicio_02.setBackground(new Color(255, 255, 255, 0));
            btn_inicio_02.setForeground(new Color(131, 137, 152));
            btn_paciente_02.setBackground(new Color(255, 255, 255, 0));
            btn_paciente_02.setForeground(new Color(131, 137, 152));
            btn_cita_02.setBackground(new Color(255, 255, 255, 0));
            btn_cita_02.setForeground(new Color(131, 137, 152));
            btn_gestionar_cita_02.setBackground(new Color(255, 255, 255, 0));
            btn_gestionar_cita_02.setForeground(new Color(131, 137, 152));
            btn_comprobantes_02.setBackground(new Color(255, 255, 255, 0));
            btn_comprobantes_02.setForeground(new Color(131, 137, 152));
            btn_servicios_02.setBackground(new Color(255, 255, 255, 0));
            btn_servicios_02.setForeground(new Color(131, 137, 152));
            btn_especialista_02.setBackground(new Color(255, 255, 255, 0));
            btn_especialista_02.setForeground(new Color(131, 137, 152));
            btn_usuarios_02.setBackground(new Color(255, 255, 255, 0));
            btn_usuarios_02.setForeground(new Color(131, 137, 152));
            btn_reporte_citas.setBackground(new Color(255, 255, 255, 0));
            btn_reporte_citas.setForeground(new Color(131, 137, 152));
            btn_reportes_facturas.setBackground(new Color(139, 198, 255, 255));
            btn_reportes_facturas.setForeground(new Color(255, 255, 255, 255));
            btn_createbackup.setBackground(new Color(255, 255, 255, 0));
            btn_createbackup.setForeground(new Color(131, 137, 152));
            btn_restoredatabase.setBackground(new Color(255, 255, 255, 0));
            btn_restoredatabase.setForeground(new Color(131, 137, 152));
            btn_resetdatabase.setBackground(new Color(255, 255, 255, 0));
            btn_resetdatabase.setForeground(new Color(131, 137, 152));

        }
    }

    public void subboton_copia_bd() {
        if (!this.btn_createbackup.isSelected()) {
            this.btn_especialista.setSelected(false);
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_cita.setSelected(false);
            this.btn_gestionar_cita.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            this.btn_reportes.setSelected(false);
            this.btn_usuario.setSelected(false);
            this.btn_reporte_citas.setSelected(false);
            this.btn_reportes_facturas.setSelected(false);
            this.btn_createbackup.setSelected(true);
            this.btn_restoredatabase.setSelected(false);
            this.btn_resetdatabase.setSelected(false);

            btn_inicio_02.setBackground(new Color(255, 255, 255, 0));
            btn_inicio_02.setForeground(new Color(131, 137, 152));
            btn_paciente_02.setBackground(new Color(255, 255, 255, 0));
            btn_paciente_02.setForeground(new Color(131, 137, 152));
            btn_cita_02.setBackground(new Color(255, 255, 255, 0));
            btn_cita_02.setForeground(new Color(131, 137, 152));
            btn_gestionar_cita_02.setBackground(new Color(255, 255, 255, 0));
            btn_gestionar_cita_02.setForeground(new Color(131, 137, 152));
            btn_comprobantes_02.setBackground(new Color(255, 255, 255, 0));
            btn_comprobantes_02.setForeground(new Color(131, 137, 152));
            btn_servicios_02.setBackground(new Color(255, 255, 255, 0));
            btn_servicios_02.setForeground(new Color(131, 137, 152));
            btn_especialista_02.setBackground(new Color(255, 255, 255, 0));
            btn_especialista_02.setForeground(new Color(131, 137, 152));
            btn_usuarios_02.setBackground(new Color(255, 255, 255, 0));
            btn_usuarios_02.setForeground(new Color(131, 137, 152));
            btn_reporte_citas.setBackground(new Color(255, 255, 255, 0));
            btn_reporte_citas.setForeground(new Color(131, 137, 152));
            btn_reportes_facturas.setBackground(new Color(255, 255, 255, 0));
            btn_reportes_facturas.setForeground(new Color(131, 137, 152));
            btn_createbackup.setBackground(new Color(139, 198, 255, 255));
            btn_createbackup.setForeground(new Color(255, 255, 255, 255));
            btn_restoredatabase.setBackground(new Color(255, 255, 255, 0));
            btn_restoredatabase.setForeground(new Color(131, 137, 152));
            btn_resetdatabase.setBackground(new Color(255, 255, 255, 0));
            btn_resetdatabase.setForeground(new Color(131, 137, 152));

        }
    }

    public void subboton_restuarar_bd() {
        if (!this.btn_restoredatabase.isSelected()) {
            this.btn_especialista.setSelected(false);
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_cita.setSelected(false);
            this.btn_gestionar_cita.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            this.btn_reportes.setSelected(false);
            this.btn_usuario.setSelected(false);
            this.btn_reporte_citas.setSelected(false);
            this.btn_reportes_facturas.setSelected(false);
            this.btn_createbackup.setSelected(false);
            this.btn_restoredatabase.setSelected(true);
            this.btn_resetdatabase.setSelected(false);

            btn_inicio_02.setBackground(new Color(255, 255, 255, 0));
            btn_inicio_02.setForeground(new Color(131, 137, 152));
            btn_paciente_02.setBackground(new Color(255, 255, 255, 0));
            btn_paciente_02.setForeground(new Color(131, 137, 152));
            btn_cita_02.setBackground(new Color(255, 255, 255, 0));
            btn_cita_02.setForeground(new Color(131, 137, 152));
            btn_gestionar_cita_02.setBackground(new Color(255, 255, 255, 0));
            btn_gestionar_cita_02.setForeground(new Color(131, 137, 152));
            btn_comprobantes_02.setBackground(new Color(255, 255, 255, 0));
            btn_comprobantes_02.setForeground(new Color(131, 137, 152));
            btn_servicios_02.setBackground(new Color(255, 255, 255, 0));
            btn_servicios_02.setForeground(new Color(131, 137, 152));
            btn_especialista_02.setBackground(new Color(255, 255, 255, 0));
            btn_especialista_02.setForeground(new Color(131, 137, 152));
            btn_usuarios_02.setBackground(new Color(255, 255, 255, 0));
            btn_usuarios_02.setForeground(new Color(131, 137, 152));
            btn_reporte_citas.setBackground(new Color(255, 255, 255, 0));
            btn_reporte_citas.setForeground(new Color(131, 137, 152));
            btn_reportes_facturas.setBackground(new Color(255, 255, 255, 0));
            btn_reportes_facturas.setForeground(new Color(131, 137, 152));
            btn_createbackup.setBackground(new Color(255, 255, 255, 0));
            btn_createbackup.setForeground(new Color(131, 137, 152));
            btn_restoredatabase.setBackground(new Color(139, 198, 255, 255));
            btn_restoredatabase.setForeground(new Color(255, 255, 255, 255));
            btn_resetdatabase.setBackground(new Color(255, 255, 255, 0));
            btn_resetdatabase.setForeground(new Color(131, 137, 152));
        }
    }

    public void subboton_vaciar_bd() {
        if (!this.btn_resetdatabase.isSelected()) {
            this.btn_especialista.setSelected(false);
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_cita.setSelected(false);
            this.btn_gestionar_cita.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            this.btn_reportes.setSelected(false);
            this.btn_usuario.setSelected(false);
            this.btn_reporte_citas.setSelected(false);
            this.btn_reportes_facturas.setSelected(false);
            this.btn_createbackup.setSelected(false);
            this.btn_restoredatabase.setSelected(false);
            this.btn_resetdatabase.setSelected(true);

            btn_inicio_02.setBackground(new Color(255, 255, 255, 0));
            btn_inicio_02.setForeground(new Color(131, 137, 152));
            btn_paciente_02.setBackground(new Color(255, 255, 255, 0));
            btn_paciente_02.setForeground(new Color(131, 137, 152));
            btn_cita_02.setBackground(new Color(255, 255, 255, 0));
            btn_cita_02.setForeground(new Color(131, 137, 152));
            btn_gestionar_cita_02.setBackground(new Color(255, 255, 255, 0));
            btn_gestionar_cita_02.setForeground(new Color(131, 137, 152));
            btn_comprobantes_02.setBackground(new Color(255, 255, 255, 0));
            btn_comprobantes_02.setForeground(new Color(131, 137, 152));
            btn_servicios_02.setBackground(new Color(255, 255, 255, 0));
            btn_servicios_02.setForeground(new Color(131, 137, 152));
            btn_especialista_02.setBackground(new Color(255, 255, 255, 0));
            btn_especialista_02.setForeground(new Color(131, 137, 152));
            btn_usuarios_02.setBackground(new Color(255, 255, 255, 0));
            btn_usuarios_02.setForeground(new Color(131, 137, 152));
            btn_reporte_citas.setBackground(new Color(255, 255, 255, 0));
            btn_reporte_citas.setForeground(new Color(131, 137, 152));
            btn_reportes_facturas.setBackground(new Color(255, 255, 255, 0));
            btn_reportes_facturas.setForeground(new Color(131, 137, 152));
            btn_createbackup.setBackground(new Color(255, 255, 255, 0));
            btn_createbackup.setForeground(new Color(131, 137, 152));
            btn_restoredatabase.setBackground(new Color(255, 255, 255, 0));
            btn_restoredatabase.setForeground(new Color(131, 137, 152));
            btn_resetdatabase.setBackground(new Color(139, 198, 255, 255));
            btn_resetdatabase.setForeground(new Color(255, 255, 255, 255));

        }
    }

    public void hideshow(JPanel menushowhide, boolean dashboard) {
        if (dashboard == true) {
            menushowhide.setPreferredSize(new Dimension(10, menushowhide.getHeight()));
        } else {
            menushowhide.setPreferredSize(new Dimension(220, menushowhide.getHeight()));
        }
    }

    private void btn_minMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minMouseEntered
        changeimage_button(btn_min, "/WIN34CLC_RESOURCES_UI/min.png");
        btn_min_02.setBackground(new Color(200, 232, 250, 150));
        btn_min_02.setForeground(new Color(131, 137, 152));
    }//GEN-LAST:event_btn_minMouseEntered

    private void btn_minMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minMouseExited
        changeimage_button(btn_min, "/WIN34CLC_RESOURCES_UI/icons8-menos-30 (1).png");

        btn_min_02.setBackground(new Color(255, 255, 255, 0));
        btn_min_02.setForeground(new Color(131, 137, 152));

    }//GEN-LAST:event_btn_minMouseExited

    private void btn_minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minActionPerformed
        this.setState(Frame.ICONIFIED);         // TODO add your handling code here:
    }//GEN-LAST:event_btn_minActionPerformed

    private void btn_maxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_maxMouseEntered
        changeimage_button(btn_max, "/WIN34CLC_RESOURCES_UI/max.png");
        btn_max_02.setBackground(new Color(200, 232, 250, 150));
        btn_max_02.setForeground(new Color(131, 137, 152));// TODO add your handling code here:
    }//GEN-LAST:event_btn_maxMouseEntered

    private void btn_maxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_maxMouseExited
        changeimage_button(btn_max, "/WIN34CLC_RESOURCES_UI/icons8-rectángulo-redondeado-30.png");
        btn_max_02.setBackground(new Color(255, 255, 255, 0));
        btn_max_02.setForeground(new Color(131, 137, 152));
    }//GEN-LAST:event_btn_maxMouseExited

    private void btn_maxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_maxActionPerformed
        if (maximized) {

            UI_V5_main1.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            UI_V5_main1.this.setMaximizedBounds(env.getMaximumWindowBounds());
            maximized = false;
        } else {
            setExtendedState(JFrame.NORMAL);
            maximized = true;
        }
    }//GEN-LAST:event_btn_maxActionPerformed

    private void lbl_menu_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_menu_1MouseClicked
        if (a == true) {
            hideshow(panel_despegable_1, a);
            hideshow(panel_despegable_titulo_1, a);
            hideshow(panel_despegable_salir_1, a);
            hideshow(panel_despegable_reportes, a);

            hideshow(panel_despegable_2, a);
            hideshow(panel_despegable_titulo_2, a);
            hideshow(panel_despegable_base_datos, a);
            hideshow(panel_despegable_ventana, a);

            SwingUtilities.updateComponentTreeUI(this);

            a = false;

            changeimage(lbl_menu_1, "/WIN34CLC_RESOURCES_UI/icons8-menú-30.png");
            changeimage(lbl_menu_2, "/WIN34CLC_RESOURCES_UI/icons8-menú-30.png");
        } else {
            hideshow(panel_despegable_1, a);
            hideshow(panel_despegable_titulo_1, a);
            hideshow(panel_despegable_salir_1, a);
            hideshow(panel_despegable_reportes, a);
            //-------------

            SwingUtilities.updateComponentTreeUI(this);
            a = true;
            changeimage(lbl_menu_1, "/WIN34CLC_RESOURCES_UI/icons8-atrás-30.png");

        }//        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_menu_1MouseClicked

    private void btn_inicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioMouseEntered
        if (!this.btn_inicio.isSelected()) {

            changeimage_button(btn_inicio, "/WIN34CLC_RESOURCES_UI/1.png");

            btn_inicio_02.setBackground(new Color(247, 248, 251));
            btn_inicio_02.setForeground(new Color(131, 137, 152));

        }
        lblinicio.setBackground(new Color(101, 208, 250));

    }//GEN-LAST:event_btn_inicioMouseEntered

    private void btn_inicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioMouseExited
        if (!this.btn_inicio.isSelected()) {

            changeimage_button(btn_inicio, "/WIN34CLC_RESOURCES_UI/icons8-casa-30.png");
            lblinicio.setBackground(new Color(255, 255, 255));
            btn_inicio_02.setBackground(new Color(255, 255, 255, 0));
            btn_inicio_02.setForeground(new Color(131, 137, 152));
        }
    }//GEN-LAST:event_btn_inicioMouseExited

    private void btn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicioActionPerformed
        boton_inicio();       // TODO add your handling code here:
    }//GEN-LAST:event_btn_inicioActionPerformed

    private void btn_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseEntered
        changeimage_button(btn_salir, "/WIN34CLC_RESOURCES_UI/apagar.png");
        btn_salir_02.setBackground(new Color(200, 232, 250, 150));
        btn_salir_02.setForeground(new Color(131, 137, 152));// TODO add your handling code here:
    }//GEN-LAST:event_btn_salirMouseEntered

    private void btn_salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseExited
        if (!this.btn_salir.isSelected()) {
            changeimage_button(btn_salir, "/WIN34CLC_RESOURCES_UI/apagar 2.png");
            btn_salir_02.setBackground(new Color(255, 255, 255, 0));
            btn_salir_02.setForeground(new Color(131, 137, 152));
        }
    }//GEN-LAST:event_btn_salirMouseExited

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_pacienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pacienteMouseEntered
        if (!this.btn_paciente.isSelected()) {
            changeimage_button(btn_paciente, "/WIN34CLC_RESOURCES_UI/2.png");
            btn_paciente_02.setBackground(new Color(247, 248, 251));
            btn_paciente_02.setForeground(new Color(131, 137, 152));

        }

        lblpacientes.setBackground(new Color(101, 208, 250));

    }//GEN-LAST:event_btn_pacienteMouseEntered

    private void btn_pacienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pacienteMouseExited
        if (!this.btn_paciente.isSelected()) {
            changeimage_button(btn_paciente, "/WIN34CLC_RESOURCES_UI/icons8-usuario-30.png");
            lblpacientes.setBackground(new Color(255, 255, 255));
            btn_paciente_02.setBackground(new Color(255, 255, 255, 0));
            btn_paciente_02.setForeground(new Color(131, 137, 152));
        }
    }//GEN-LAST:event_btn_pacienteMouseExited

    private void btn_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pacienteActionPerformed
        boton_paciente();

// TODO add your handling code here:
    }//GEN-LAST:event_btn_pacienteActionPerformed

    private void btn_citaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_citaMouseEntered
        if (!this.btn_cita.isSelected()) {

            btn_cita_02.setBackground(new Color(247, 248, 251));
            btn_cita_02.setForeground(new Color(131, 137, 152));
            changeimage_button(btn_cita, "/WIN34CLC_RESOURCES_UI/3.png");
        }

        lblcita.setBackground(new Color(101, 208, 250));


    }//GEN-LAST:event_btn_citaMouseEntered

    private void btn_citaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_citaMouseExited
        if (!this.btn_cita.isSelected()) {
            lblcita.setBackground(new Color(255, 255, 255));
            btn_cita_02.setBackground(new Color(255, 255, 255, 0));
            changeimage_button(btn_cita, "/WIN34CLC_RESOURCES_UI/icons8-calendario-30.png");
            btn_cita_02.setForeground(new Color(131, 137, 152));
        }
    }//GEN-LAST:event_btn_citaMouseExited

    private void btn_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_citaActionPerformed
        boton_cita();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_citaActionPerformed

    private void btn_gestionar_citaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gestionar_citaMouseEntered

        if (!this.btn_gestionar_cita.isSelected()) {
            changeimage_button(btn_gestionar_cita, "/WIN34CLC_RESOURCES_UI/4.png");
            btn_gestionar_cita_02.setBackground(new Color(247, 248, 251));
            btn_gestionar_cita_02.setForeground(new Color(131, 137, 152));

        }
        lblgestionar_cita.setBackground(new Color(101, 208, 250));
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_gestionar_citaMouseEntered

    private void btn_gestionar_citaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gestionar_citaMouseExited
        if (!this.btn_gestionar_cita.isSelected()) {
            lblgestionar_cita.setBackground(new Color(255, 255, 255));
            btn_gestionar_cita_02.setBackground(new Color(255, 255, 255, 0));
            btn_gestionar_cita_02.setForeground(new Color(131, 137, 152));

            changeimage_button(btn_gestionar_cita, "/WIN34CLC_RESOURCES_UI/icons8-horas-extras-30.png");
        }
    }//GEN-LAST:event_btn_gestionar_citaMouseExited

    private void btn_gestionar_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gestionar_citaActionPerformed
        boton_gestionarCita();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_gestionar_citaActionPerformed

    private void btn_serviciosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_serviciosMouseEntered

        if (!this.btn_servicios.isSelected()) {
            changeimage_button(btn_servicios, "/WIN34CLC_RESOURCES_UI/7.png");
            btn_servicios_02.setBackground(new Color(247, 248, 251));
            btn_servicios_02.setForeground(new Color(131, 137, 152));

        }
        lblservicios.setBackground(new Color(101, 208, 250));

    }//GEN-LAST:event_btn_serviciosMouseEntered

    private void btn_serviciosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_serviciosMouseExited
        if (!this.btn_servicios.isSelected()) {
            lblservicios.setBackground(new Color(255, 255, 255));
            btn_servicios_02.setBackground(new Color(255, 255, 255, 0));
            changeimage_button(btn_servicios, "/WIN34CLC_RESOURCES_UI/icons8-maletín-médico-30.png");
            btn_servicios_02.setForeground(new Color(131, 137, 152));
        }
    }//GEN-LAST:event_btn_serviciosMouseExited

    private void btn_serviciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_serviciosActionPerformed
        boton_servicios();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_serviciosActionPerformed

    private void btn_usuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usuarioMouseEntered

        if (!this.btn_usuario.isSelected()) {

            btn_usuarios_02.setBackground(new Color(247, 248, 251));
            btn_usuarios_02.setForeground(new Color(131, 137, 152));
            changeimage_button(btn_usuario, "/WIN34CLC_RESOURCES_UI/9.png");
        }
        lblusuarios.setBackground(new Color(101, 208, 250));

    }//GEN-LAST:event_btn_usuarioMouseEntered

    private void btn_usuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usuarioMouseExited
        if (!this.btn_usuario.isSelected()) {
            lblusuarios.setBackground(new Color(255, 255, 255));
            btn_usuarios_02.setBackground(new Color(255, 255, 255, 0));
            btn_usuarios_02.setForeground(new Color(131, 137, 152));
            changeimage_button(btn_usuario, "/WIN34CLC_RESOURCES_UI/icons8-usuario-masculino-en-círculo-30.png");
        }
    }//GEN-LAST:event_btn_usuarioMouseExited

    private void btn_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuarioActionPerformed
        boton_usuarios();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_usuarioActionPerformed

    private void btn_especialistaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_especialistaMouseEntered
        if (!this.btn_especialista.isSelected()) {
            changeimage_button(btn_especialista, "/WIN34CLC_RESOURCES_UI/8.png");
            btn_especialista_02.setBackground(new Color(247, 248, 251));
            btn_especialista_02.setForeground(new Color(131, 137, 152));

        }
        lblespecialista.setBackground(new Color(101, 208, 250));
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_especialistaMouseEntered

    private void btn_especialistaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_especialistaMouseExited
        if (!this.btn_especialista.isSelected()) {
            lblespecialista.setBackground(new Color(255, 255, 255));
            btn_especialista_02.setBackground(new Color(255, 255, 255, 0));
            btn_especialista_02.setForeground(new Color(131, 137, 152));
            changeimage_button(btn_especialista, "/WIN34CLC_RESOURCES_UI/icons8-doctor-en-medicina-30.png");
        }
    }//GEN-LAST:event_btn_especialistaMouseExited

    private void btn_especialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_especialistaActionPerformed
        boton_especialistas();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_especialistaActionPerformed

    private void btn_base_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_base_datosActionPerformed
        boton_base_datos();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_base_datosActionPerformed

    private void btn_base_datosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_base_datosMouseExited
        if (!this.btn_base_datos.isSelected()) {
            lblbasedatos.setBackground(new Color(255, 255, 255));
            changeimage_button(btn_base_datos, "/WIN34CLC_RESOURCES_UI/icons8-base-de-datos.png");
        }
    }//GEN-LAST:event_btn_base_datosMouseExited

    private void btn_base_datosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_base_datosMouseEntered
        lblbasedatos.setBackground(new Color(101, 208, 250));
        changeimage_button(btn_base_datos, "/WIN34CLC_RESOURCES_UI/10.png");// TODO add your handling code here:
    }//GEN-LAST:event_btn_base_datosMouseEntered

    private void btn_reportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportesMouseEntered
        lblreporte.setBackground(new Color(101, 208, 250));
        changeimage_button(btn_reportes, "/WIN34CLC_RESOURCES_UI/6.png");
        //   btn_reporte_citas.setBackground(new Color (139,198,255,255));
        // btn_reporte_citas.setForeground(new Color (255,255,255,255));

    }//GEN-LAST:event_btn_reportesMouseEntered

    private void btn_reportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportesMouseExited
        if (!this.btn_reportes.isSelected()) {
            lblreporte.setBackground(new Color(255, 255, 255));
            changeimage_button(btn_reportes, "/WIN34CLC_RESOURCES_UI/icons8-presentación-30.png");
        }   // TODO add your handling code here:
    }//GEN-LAST:event_btn_reportesMouseExited

    private void btn_reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportesActionPerformed
        boton_reportes();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reportesActionPerformed

    private void lbl_menu_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_menu_2MouseClicked
        if (a == true) {
            hideshow(panel_despegable_titulo_2, a);
            hideshow(panel_despegable_2, a);
            hideshow(panel_despegable_base_datos, a);
            hideshow(panel_despegable_ventana, a);

            hideshow(panel_despegable_1, a);
            hideshow(panel_despegable_titulo_1, a);
            hideshow(panel_despegable_salir_1, a);
            hideshow(panel_despegable_reportes, a);

            SwingUtilities.updateComponentTreeUI(this);

            a = false;

            changeimage(lbl_menu_2, "/WIN34CLC_RESOURCES_UI/icons8-menú-30.png");
            changeimage(lbl_menu_1, "/WIN34CLC_RESOURCES_UI/icons8-menú-30.png");
        } else {
            hideshow(panel_despegable_2, a);
            hideshow(panel_despegable_titulo_2, a);

            hideshow(panel_despegable_base_datos, a);
            hideshow(panel_despegable_ventana, a);
            SwingUtilities.updateComponentTreeUI(this);
            a = true;

            changeimage(lbl_menu_2, "/WIN34CLC_RESOURCES_UI/icons8-adelante-30.png");
        }//              // TODO add your handling code here:
    }//GEN-LAST:event_lbl_menu_2MouseClicked

    private void btn_inicio_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicio_02ActionPerformed
        boton_inicio();
    }//GEN-LAST:event_btn_inicio_02ActionPerformed

    private void btn_paciente_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paciente_02ActionPerformed
        boton_paciente();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_paciente_02ActionPerformed

    private void btn_cita_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cita_02ActionPerformed
        boton_cita();  // TODO add your handling code here:
    }//GEN-LAST:event_btn_cita_02ActionPerformed

    private void btn_gestionar_cita_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gestionar_cita_02ActionPerformed
        boton_gestionarCita();// TODO add your handling code here:
    }//GEN-LAST:event_btn_gestionar_cita_02ActionPerformed

    private void btn_comprobantes_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comprobantes_02ActionPerformed
        boton_comprobante();  // TODO add your handling code here:
    }//GEN-LAST:event_btn_comprobantes_02ActionPerformed

    private void btn_inicio_02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicio_02MouseClicked
        boton_inicio();
        // btn_inicio_02.setBackground(new Color (139,198,255,255));           // TODO add your handling code here:
    }//GEN-LAST:event_btn_inicio_02MouseClicked

    private void btn_inicio_02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicio_02MouseExited
        if (!this.btn_inicio.isSelected()) {
            lblinicio.setBackground(new Color(255, 255, 255));
            btn_inicio_02.setBackground(new Color(255, 255, 255, 0));
            btn_inicio_02.setForeground(new Color(131, 137, 152));
            changeimage_button(btn_inicio, "/WIN34CLC_RESOURCES_UI/icons8-casa-30.png");

        }
    }//GEN-LAST:event_btn_inicio_02MouseExited

    private void btn_inicio_02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicio_02MouseEntered
        if (!this.btn_inicio.isSelected()) {
            changeimage_button(btn_inicio, "/WIN34CLC_RESOURCES_UI/1.png");
            btn_inicio_02.setBackground(new Color(247, 248, 251));
            btn_inicio_02.setForeground(new Color(131, 137, 152));;

        }

        lblinicio.setBackground(new Color(101, 208, 250));               // TODO add your handling code here:
    }//GEN-LAST:event_btn_inicio_02MouseEntered

    private void btn_reporte_citasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reporte_citasActionPerformed
        subboton_reporte_cita();
        // frm_exploradorCitas citas = new frm_exploradorCitas();
        //citas.setVisible(true);
    }//GEN-LAST:event_btn_reporte_citasActionPerformed

    private void btn_reportes_facturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportes_facturasActionPerformed
        subboton_reporte_facturas();
    }//GEN-LAST:event_btn_reportes_facturasActionPerformed

    private void btn_usuarios_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuarios_02ActionPerformed
        boton_usuarios();
    }//GEN-LAST:event_btn_usuarios_02ActionPerformed

    private void btn_servicios_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_servicios_02ActionPerformed
        boton_servicios();
    }//GEN-LAST:event_btn_servicios_02ActionPerformed

    private void btn_especialista_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_especialista_02ActionPerformed
        boton_especialistas();
    }//GEN-LAST:event_btn_especialista_02ActionPerformed

    private void btn_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_facturaActionPerformed
        boton_comprobante();
    }//GEN-LAST:event_btn_facturaActionPerformed

    private void btn_facturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_facturaMouseExited
        if (!this.btn_factura.isSelected()) {
            lblfactura.setBackground(new Color(255, 255, 255));
            btn_comprobantes_02.setBackground(new Color(255, 255, 255, 0));
            btn_comprobantes_02.setForeground(new Color(131, 137, 152));
            changeimage_button(btn_factura, "/WIN34CLC_RESOURCES_UI/icons8-factura-30.png");
        }


    }//GEN-LAST:event_btn_facturaMouseExited

    private void btn_facturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_facturaMouseEntered
        lblfactura.setBackground(new Color(101, 208, 250));

        if (!this.btn_factura.isSelected()) {
            changeimage_button(btn_factura, "/WIN34CLC_RESOURCES_UI/5.png");
            btn_comprobantes_02.setBackground(new Color(247, 248, 251));
            btn_comprobantes_02.setForeground(new Color(131, 137, 152));;

        }
    }//GEN-LAST:event_btn_facturaMouseEntered

    private void menu_01MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_01MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_menu_01MousePressed

    private void menu_01MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_01MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_menu_01MouseDragged

    private void btn_paciente_02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_paciente_02MouseEntered
        lblpacientes.setBackground(new Color(101, 208, 250));
        if (!this.btn_paciente.isSelected()) {
            changeimage_button(btn_paciente, "/WIN34CLC_RESOURCES_UI/2.png");
            btn_paciente_02.setBackground(new Color(247, 248, 251));
            btn_paciente_02.setForeground(new Color(131, 137, 152));;

        }       // TODO add your handling code here:
    }//GEN-LAST:event_btn_paciente_02MouseEntered

    private void btn_paciente_02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_paciente_02MouseExited
        if (!this.btn_paciente.isSelected()) {
            lblpacientes.setBackground(new Color(255, 255, 255));
            btn_paciente_02.setBackground(new Color(255, 255, 255, 0));
            btn_paciente_02.setForeground(new Color(131, 137, 152));
            changeimage_button(btn_paciente, "/WIN34CLC_RESOURCES_UI/icons8-usuario-30.png");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_paciente_02MouseExited

    private void btn_cita_02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cita_02MouseEntered
        lblcita.setBackground(new Color(101, 208, 250));

        if (!this.btn_cita.isSelected()) {
            changeimage_button(btn_cita, "/WIN34CLC_RESOURCES_UI/3.png");
            btn_cita_02.setBackground(new Color(247, 248, 251));
            btn_cita_02.setForeground(new Color(131, 137, 152));;

        }       // TODO add your handling code here:
    }//GEN-LAST:event_btn_cita_02MouseEntered

    private void btn_cita_02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cita_02MouseExited
        if (!this.btn_cita.isSelected()) {
            lblcita.setBackground(new Color(255, 255, 255));
            btn_cita_02.setBackground(new Color(255, 255, 255, 0));
            btn_cita_02.setForeground(new Color(131, 137, 152));
            changeimage_button(btn_cita, "/WIN34CLC_RESOURCES_UI/icons8-calendario-30.png");

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cita_02MouseExited

    private void btn_gestionar_cita_02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gestionar_cita_02MouseEntered
        lblgestionar_cita.setBackground(new Color(101, 208, 250));
        if (!this.btn_gestionar_cita.isSelected()) {
            changeimage_button(btn_gestionar_cita, "/WIN34CLC_RESOURCES_UI/4.png");
            btn_gestionar_cita_02.setBackground(new Color(247, 248, 251));
            btn_gestionar_cita_02.setForeground(new Color(131, 137, 152));;

        }       // TODO add your handling code here:
    }//GEN-LAST:event_btn_gestionar_cita_02MouseEntered

    private void btn_gestionar_cita_02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gestionar_cita_02MouseExited
        if (!this.btn_gestionar_cita.isSelected()) {
            lblgestionar_cita.setBackground(new Color(255, 255, 255));
            changeimage_button(btn_gestionar_cita, "/WIN34CLC_RESOURCES_UI/icons8-horas-extras-30.png");

            btn_gestionar_cita_02.setBackground(new Color(255, 255, 255, 0));
            btn_gestionar_cita_02.setForeground(new Color(131, 137, 152));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_gestionar_cita_02MouseExited

    private void btn_comprobantes_02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_comprobantes_02MouseEntered
        lblfactura.setBackground(new Color(101, 208, 250));
        if (!this.btn_factura.isSelected()) {
            changeimage_button(btn_factura, "/WIN34CLC_RESOURCES_UI/5.png");

            btn_comprobantes_02.setBackground(new Color(247, 248, 251));
            btn_comprobantes_02.setForeground(new Color(131, 137, 152));;

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_comprobantes_02MouseEntered

    private void btn_comprobantes_02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_comprobantes_02MouseExited

        if (!this.btn_factura.isSelected()) {
            lblfactura.setBackground(new Color(255, 255, 255));
            btn_comprobantes_02.setBackground(new Color(255, 255, 255, 0));
            btn_comprobantes_02.setForeground(new Color(131, 137, 152));
            changeimage_button(btn_factura, "/WIN34CLC_RESOURCES_UI/icons8-factura-30.png");

        }                   // TODO add your handling code here:
    }//GEN-LAST:event_btn_comprobantes_02MouseExited

    private void btn_usuarios_02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usuarios_02MouseEntered
        lblusuarios.setBackground(new Color(101, 208, 250));
        if (!this.btn_usuario.isSelected()) {
            changeimage_button(btn_usuario, "/WIN34CLC_RESOURCES_UI/9.png");

            btn_usuarios_02.setBackground(new Color(247, 248, 251));
            btn_usuarios_02.setForeground(new Color(131, 137, 152));;

        }       // TODO add your handling code here:
    }//GEN-LAST:event_btn_usuarios_02MouseEntered

    private void btn_usuarios_02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usuarios_02MouseExited
        if (!this.btn_usuario.isSelected()) {
            lblusuarios.setBackground(new Color(255, 255, 255));
            btn_usuarios_02.setBackground(new Color(255, 255, 255, 0));
            btn_usuarios_02.setForeground(new Color(131, 137, 152));
            changeimage_button(btn_usuario, "/WIN34CLC_RESOURCES_UI/icons8-usuario-masculino-en-círculo-30.png");

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_usuarios_02MouseExited

    private void btn_servicios_02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_servicios_02MouseEntered
        lblservicios.setBackground(new Color(101, 208, 250));

        if (!this.btn_servicios.isSelected()) {
            changeimage_button(btn_servicios, "/WIN34CLC_RESOURCES_UI/7.png");
            btn_servicios_02.setBackground(new Color(247, 248, 251));
            btn_servicios_02.setForeground(new Color(131, 137, 152));;

        }       // TODO add your handling code here:
    }//GEN-LAST:event_btn_servicios_02MouseEntered

    private void btn_servicios_02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_servicios_02MouseExited
        if (!this.btn_servicios.isSelected()) {
            lblservicios.setBackground(new Color(255, 255, 255));

            changeimage_button(btn_servicios, "/WIN34CLC_RESOURCES_UI/icons8-maletín-médico-30.png");
            btn_servicios_02.setBackground(new Color(255, 255, 255, 0));
            btn_servicios_02.setForeground(new Color(131, 137, 152));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_servicios_02MouseExited

    private void btn_especialista_02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_especialista_02MouseEntered
        lblespecialista.setBackground(new Color(101, 208, 250));

        if (!this.btn_especialista.isSelected()) {
            changeimage_button(btn_especialista, "/WIN34CLC_RESOURCES_UI/8.png");

            btn_especialista_02.setBackground(new Color(247, 248, 251));
            btn_especialista_02.setForeground(new Color(131, 137, 152));;

        }       // TODO add your handling code here:
    }//GEN-LAST:event_btn_especialista_02MouseEntered

    private void btn_especialista_02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_especialista_02MouseExited
        if (!this.btn_especialista.isSelected()) {
            lblespecialista.setBackground(new Color(255, 255, 255));
            changeimage_button(btn_especialista, "/WIN34CLC_RESOURCES_UI/icons8-doctor-en-medicina-30.png");

            btn_especialista_02.setBackground(new Color(255, 255, 255, 0));
            btn_especialista_02.setForeground(new Color(131, 137, 152));

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_especialista_02MouseExited

    private void btn_salir_02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salir_02MouseEntered
        changeimage_button(btn_salir, "/WIN34CLC_RESOURCES_UI/apagar.png");
        btn_salir_02.setBackground(new Color(200, 232, 250, 150));
        btn_salir_02.setForeground(new Color(131, 137, 152));        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salir_02MouseEntered

    private void btn_salir_02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salir_02MouseExited
        changeimage_button(btn_salir, "/WIN34CLC_RESOURCES_UI/apagar 2.png");
        btn_salir_02.setBackground(new Color(255, 255, 255, 0));
        btn_salir_02.setForeground(new Color(131, 137, 152));
    }//GEN-LAST:event_btn_salir_02MouseExited

    private void btn_salir_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salir_02ActionPerformed
        System.exit(0);           // TODO add your handling code here:
    }//GEN-LAST:event_btn_salir_02ActionPerformed

    private void btn_reporte_citasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reporte_citasMouseEntered
        btn_reporte_citas.setBackground(new Color(247, 248, 251));
        btn_reporte_citas.setForeground(new Color(131, 137, 152));;        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reporte_citasMouseEntered

    private void btn_max_02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_max_02MouseEntered
        btn_max_02.setBackground(new Color(200, 232, 250, 150));
        btn_max_02.setForeground(new Color(131, 137, 152));
        changeimage_button(btn_max, "/WIN34CLC_RESOURCES_UI/max.png");
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_max_02MouseEntered

    private void btn_max_02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_max_02MouseExited

        changeimage_button(btn_max, "/WIN34CLC_RESOURCES_UI/icons8-rectángulo-redondeado-30.png");

        btn_max_02.setBackground(new Color(255, 255, 255, 0));
        btn_max_02.setForeground(new Color(131, 137, 152));

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_max_02MouseExited

    private void btn_max_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_max_02ActionPerformed
        if (maximized) {

            UI_V5_main1.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            UI_V5_main1.this.setMaximizedBounds(env.getMaximumWindowBounds());
            maximized = false;
        } else {
            setExtendedState(JFrame.NORMAL);
            maximized = true;
        }
    }//GEN-LAST:event_btn_max_02ActionPerformed

    private void btn_min_02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_min_02MouseEntered
        btn_min_02.setBackground(new Color(200, 232, 250, 150));
        btn_min_02.setForeground(new Color(131, 137, 152));
        changeimage_button(btn_min, "/WIN34CLC_RESOURCES_UI/min.png");         // TODO add your handling code here:
    }//GEN-LAST:event_btn_min_02MouseEntered

    private void btn_min_02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_min_02MouseExited
        changeimage_button(btn_min, "/WIN34CLC_RESOURCES_UI/icons8-menos-30 (1).png");
        btn_min_02.setBackground(new Color(255, 255, 255, 0));
        btn_min_02.setForeground(new Color(131, 137, 152));// TODO add your handling code here:
    }//GEN-LAST:event_btn_min_02MouseExited

    private void btn_min_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_min_02ActionPerformed
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btn_min_02ActionPerformed

    private void btn_createbackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createbackupActionPerformed
        try {
            generateBackUpMysql();
        } catch (IOException ex) {
            Logger.getLogger(UI_V5_main1.class.getName()).log(Level.SEVERE, null, ex);
        }

        subboton_copia_bd();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_createbackupActionPerformed

    private void btn_restoredatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restoredatabaseActionPerformed
        try {
            restoreBackUpMysql();
        } catch (IOException ex) {
            Logger.getLogger(UI_V5_main1.class.getName()).log(Level.SEVERE, null, ex);
        }
        subboton_restuarar_bd();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_restoredatabaseActionPerformed

    private void btn_resetdatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetdatabaseActionPerformed
        try {
            // preguntar si se resetea o no

            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "¿Esta seguro de limpiar por completo la base de datos?\n" + "Asegurese de tener una copia de seguridad.", "DentalSys", dialogButton);
            if (dialogResult == 0) {

                CTR_11_DataBaseConfiguration baseConfiguration = new CTR_11_DataBaseConfiguration();
                if (baseConfiguration.RESETDATABASE()) {
                    JOptionPane optionPane = new JOptionPane("Success!", JOptionPane.INFORMATION_MESSAGE);
                    JDialog dialog = optionPane.createDialog("DentalSys");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                } else {
                    JOptionPane optionPane = new JOptionPane("Puede que no se haya borrado limpiado la base de datos", JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("DentalSys");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);
                }

            } else {
                System.out.println("No Option");
            }

        } catch (SQLException ex) {
            Logger.getLogger(test_para_lanzar_metodos.class.getName()).log(Level.SEVERE, null, ex);
        }

        subboton_vaciar_bd();

    }//GEN-LAST:event_btn_resetdatabaseActionPerformed

    private void btn_reporte_citasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reporte_citasMouseExited
        btn_reporte_citas.setBackground(new Color(255, 255, 255, 0));
        btn_reporte_citas.setForeground(new Color(131, 137, 152));          // TODO add your handling code here:
    }//GEN-LAST:event_btn_reporte_citasMouseExited

    private void btn_reportes_facturasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportes_facturasMouseEntered
        btn_reportes_facturas.setBackground(new Color(247, 248, 251));
        btn_reportes_facturas.setForeground(new Color(131, 137, 152));        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reportes_facturasMouseEntered

    private void btn_reportes_facturasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportes_facturasMouseExited
        btn_reportes_facturas.setBackground(new Color(255, 255, 255, 0));
        btn_reportes_facturas.setForeground(new Color(131, 137, 152));         // TODO add your handling code here:
    }//GEN-LAST:event_btn_reportes_facturasMouseExited

    private void btn_createbackupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_createbackupMouseEntered
        btn_createbackup.setBackground(new Color(247, 248, 251));
        btn_createbackup.setForeground(new Color(131, 137, 152));        // TODO add your handling code here:
    }//GEN-LAST:event_btn_createbackupMouseEntered

    private void btn_createbackupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_createbackupMouseExited
        btn_createbackup.setBackground(new Color(255, 255, 255, 0));
        btn_createbackup.setForeground(new Color(131, 137, 152));          // TODO add your handling code here:
    }//GEN-LAST:event_btn_createbackupMouseExited

    private void btn_restoredatabaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_restoredatabaseMouseEntered
        btn_restoredatabase.setBackground(new Color(247, 248, 251));
        btn_restoredatabase.setForeground(new Color(131, 137, 152));        // TODO add your handling code here:
    }//GEN-LAST:event_btn_restoredatabaseMouseEntered

    private void btn_restoredatabaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_restoredatabaseMouseExited
        btn_restoredatabase.setBackground(new Color(255, 255, 255, 0));
        btn_restoredatabase.setForeground(new Color(131, 137, 152));          // TODO add your handling code here:
    }//GEN-LAST:event_btn_restoredatabaseMouseExited

    private void btn_resetdatabaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_resetdatabaseMouseEntered
        btn_resetdatabase.setBackground(new Color(247, 248, 251));
        btn_resetdatabase.setForeground(new Color(131, 137, 152));        // TODO add your handling code here:
    }//GEN-LAST:event_btn_resetdatabaseMouseEntered

    private void btn_resetdatabaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_resetdatabaseMouseExited
        btn_resetdatabase.setBackground(new Color(255, 255, 255, 0));
        btn_resetdatabase.setForeground(new Color(131, 137, 152));        // TODO add your handling code here:
    }//GEN-LAST:event_btn_resetdatabaseMouseExited

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_V5_main1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_base_datos;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_cita;
    private newscomponents.RSButtonFlat_new btn_cita_02;
    private newscomponents.RSButtonFlat_new btn_comprobantes_02;
    private newscomponents.RSButtonFlat_new btn_createbackup;
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
    private newscomponents.RSButtonFlat_new btn_reporte_citas;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_reportes;
    private newscomponents.RSButtonFlat_new btn_reportes_facturas;
    private newscomponents.RSButtonFlat_new btn_resetdatabase;
    private newscomponents.RSButtonFlat_new btn_restoredatabase;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_salir;
    private newscomponents.RSButtonFlat_new btn_salir_02;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_servicios;
    private newscomponents.RSButtonFlat_new btn_servicios_02;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_usuario;
    private newscomponents.RSButtonFlat_new btn_usuarios_02;
    private WIN33CLC_VIEW.frm_UI_02_reservar_cita frm_UI_02_reservar_cita11;
    private WIN33CLC_VIEW.frm_UI_03_gestionar_citas frm_UI_03_gestionar_citas1;
    private WIN33CLC_VIEW.frm_UI_04_comprobantes frm_UI_04_comprobantes1;
    private WIN33CLC_VIEW.frm_UI_07_usuarios frm_UI_07_usuarios1;
    private WIN33CLC_VIEW.frm_UI_inicio1 frm_UI_inicio11;
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
    private javax.swing.JPanel panel_reportes_citas;
    private javax.swing.JPanel panel_servicios;
    private javax.swing.JPanel panel_usuarios;
    private rojerusan.RSPanelImage rSPanelImage1;
    private RSMaterialComponent.RSPanelMaterial rSPanelMaterial4;
    // End of variables declaration//GEN-END:variables
private void generateBackUpMysql() throws IOException {
        properties = new ConfigReader();

        String dbName = properties.getPropValues().getMySqlDAOMANAGER_db_name();
        String dbUserName = properties.getPropValues().getMySqlDAOMANAGER_db_user();
        String dbPassword = properties.getPropValues().getMySqlDAOMANAGER_db_pass();

        Calendar c = Calendar.getInstance();//creamos una instancia de la clase calendar de java
        //java.util.Date fecha = new Date();
        String DiaHoy = Integer.toString(c.get(Calendar.DATE));
        String MesHoy = Integer.toString(c.get(Calendar.MONTH) + 1);
        String AnioHoy = Integer.toString(c.get(Calendar.YEAR));

        JFileChooser RealizarBackupMySQL = new JFileChooser();
        int resp;
        resp = RealizarBackupMySQL.showSaveDialog(this);//JFileChooser de nombre RealizarBackupMySQL
        if (resp == JFileChooser.APPROVE_OPTION) {//Si el usuario presiona aceptar; se genera el Backup
            try {
                Runtime runtime = Runtime.getRuntime();
                File backupFile = new File(String.valueOf(RealizarBackupMySQL.getSelectedFile().toString()) + " " + DiaHoy + "-" + MesHoy + "-" + AnioHoy + ".sql");
                FileWriter fw = new FileWriter(backupFile);
                Process child = runtime.exec(properties.getPropValues().getPathMysqlDump() + " --routines --opt --password=" + dbPassword + " --user=" + dbUserName + " --databases " + dbName);
                InputStreamReader irs = new InputStreamReader(child.getInputStream());
                BufferedReader br = new BufferedReader(irs);
                String line;
                while ((line = br.readLine()) != null) {
                    fw.write(line + "\n");
                }
                fw.close();
                irs.close();
                br.close();
                JOptionPane.showMessageDialog(null, "Archivo generado", "Verificar", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error no se genero el archivo por el siguiente motivo:" + e.getMessage(), "Verificar", JOptionPane.ERROR_MESSAGE);
            }
        } else if (resp == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Ha sido cancelada la generacion del Backup");
        }
    }
    protected ConfigReader properties = null;

    private void restoreBackUpMysql() throws IOException {

        properties = new ConfigReader();

        String dbName = properties.getPropValues().getMySqlDAOMANAGER_db_name();
        String dbUserName = properties.getPropValues().getMySqlDAOMANAGER_db_user();
        String dbPassword = properties.getPropValues().getMySqlDAOMANAGER_db_pass();

        int resp;
        JFileChooser RealizarBackupMySQL = new JFileChooser();
        resp = RealizarBackupMySQL.showOpenDialog(this);//Muestra el cuadro con la opcion abrir
        if (resp == JFileChooser.APPROVE_OPTION) {//Si el usuario presiona aceptar(Abrir); Backup
            try {
                String ubicacion = String.valueOf(RealizarBackupMySQL.getSelectedFile().toString().trim());

                //en nombre almacenamos la ruta del fichero con extension sql que se desea restaurar...
                String nombre = ubicacion.toString().substring(ubicacion.lastIndexOf('/') + 1);
                File fichero = new File(nombre);
//                System.out.println("Path: " + ubicacion + " -- File: " + nombre);
                String dd = fichero.getName();//aqui obtenermos el nombre del fichero con extension sql.

                String[] executeCmd = new String[]{properties.getPropValues().getPathMysql(), "--password=" + dbPassword, "--user=" + dbUserName, dbName, "-e", "source " + nombre};
                Process runtimeProcess;

                try {

                    runtimeProcess = Runtime.getRuntime().exec(executeCmd);

                    int processComplete = runtimeProcess.waitFor();

                    if (processComplete == 0) {
                        JOptionPane.showMessageDialog(null, "Backup realizado satisfactoriamente");
                        JOptionPane.showMessageDialog(null, dd);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo realizar el Backup");
                        JOptionPane.showMessageDialog(null, dd);
                    }
                } catch (Exception ex) {
                }
            } catch (Exception ex) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ha sido cancelada la actualizacion del Backup");
        }

    }

}
