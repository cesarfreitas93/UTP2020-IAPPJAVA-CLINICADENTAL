
package WIN33CLC_VIEW;

import java.awt.Color;


public class frm_UI_02_reservar_cita extends javax.swing.JPanel {

    public frm_UI_02_reservar_cita() {
        initComponents();
     
        setBackground(new Color (255,255,255,0));

       
    }
    
     public void ocultar_form_cita(boolean b)
    {
    menu_salir1.setVisible(b);
    menu_salir2.setVisible(b);
    menu_salir3.setVisible(b);
    rSPanelBorderGradient1.setVisible(b);
            
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        menu_salir1 = new RSMaterialComponent.RSPanelMaterial();
        jLabel10 = new javax.swing.JLabel();
        lbl_patient = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btn_cancelar_cambios1 = new newscomponents.RSButtonFlat_new();
        txt_dni = new rscomponentshade.RSFormatFieldShade();
        menu_salir2 = new RSMaterialComponent.RSPanelMaterial();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbx_especialista = new RSMaterialComponent.RSComboBoxMaterial();
        cbx_servicios = new RSMaterialComponent.RSComboBoxMaterial();
        menu_salir3 = new RSMaterialComponent.RSPanelMaterial();
        jLabel9 = new javax.swing.JLabel();
        rSDateChooser1 = new rojerusan.RSDateChooser();
        btn_cancelar_cambios2 = new newscomponents.RSButtonFlat_new();
        jPanel2 = new javax.swing.JPanel();
        rSRadioButtonMaterial29 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial30 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial31 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial32 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial33 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial34 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial35 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial36 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial37 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial38 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial39 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial41 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial42 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial43 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSPanelBorderGradient1 = new RSMaterialComponent.RSPanelBorderGradient();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_nueva_cita = new newscomponents.RSButtonFlat_new();
        btn_guardar_cita = new newscomponents.RSButtonFlat_new();
        btn_cancelar_cambios = new newscomponents.RSButtonFlat_new();

        menu_salir1.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir1.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir1.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir1.setRound(40);

        jLabel10.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Paciente:");

        lbl_patient.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lbl_patient.setForeground(new java.awt.Color(51, 51, 51));
        lbl_patient.setText("Nombres y Apellidos Completos");

        jLabel14.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Dni:");

        btn_cancelar_cambios1.setBackground(new java.awt.Color(139, 198, 255));
        btn_cancelar_cambios1.setForeground(new java.awt.Color(51, 51, 51));
        btn_cancelar_cambios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-encuentra-hombre-usuario-24.png"))); // NOI18N
        btn_cancelar_cambios1.setText("Buscar Paciente");
        btn_cancelar_cambios1.setBorderPainted(false);
        btn_cancelar_cambios1.setContentAreaFilled(true);
        btn_cancelar_cambios1.setCornerRound(45);
        btn_cancelar_cambios1.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_cancelar_cambios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_cambios1ActionPerformed(evt);
            }
        });

        txt_dni.setBackground(new java.awt.Color(246, 247, 251));
        txt_dni.setBgShade(new java.awt.Color(255, 255, 255));
        txt_dni.setBgShadeHover(new java.awt.Color(255, 255, 255));
        txt_dni.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_dni.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_dni.setDoubleBuffered(true);
        txt_dni.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txt_dni.setIntensity(0);
        txt_dni.setPhColor(new java.awt.Color(255, 255, 255));
        txt_dni.setPixels(0);
        txt_dni.setPlaceholder("");
        txt_dni.setRound(40);

        javax.swing.GroupLayout menu_salir1Layout = new javax.swing.GroupLayout(menu_salir1);
        menu_salir1.setLayout(menu_salir1Layout);
        menu_salir1Layout.setHorizontalGroup(
            menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir1Layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu_salir1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(lbl_patient, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
                    .addGroup(menu_salir1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_dni, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cancelar_cambios1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        menu_salir1Layout.setVerticalGroup(
            menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(btn_cancelar_cambios1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lbl_patient))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        menu_salir2.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir2.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir2.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir2.setRound(40);

        jLabel8.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Servicios");

        jLabel13.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Especialista");

        cbx_especialista.setForeground(new java.awt.Color(51, 51, 51));
        cbx_especialista.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija una Opcion.", "RSItem 2", "RSItem 3", "RSItem 4" }));
        cbx_especialista.setColorMaterial(new java.awt.Color(10, 117, 167));
        cbx_especialista.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        cbx_especialista.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        cbx_especialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_especialistaActionPerformed(evt);
            }
        });

        cbx_servicios.setForeground(new java.awt.Color(51, 51, 51));
        cbx_servicios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija una Opcion.", "RSItem 2", "RSItem 3", "RSItem 4" }));
        cbx_servicios.setColorMaterial(new java.awt.Color(10, 117, 167));
        cbx_servicios.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        cbx_servicios.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        cbx_servicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_serviciosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu_salir2Layout = new javax.swing.GroupLayout(menu_salir2);
        menu_salir2.setLayout(menu_salir2Layout);
        menu_salir2Layout.setHorizontalGroup(
            menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir2Layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_servicios, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_especialista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        menu_salir2Layout.setVerticalGroup(
            menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_especialista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_servicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        menu_salir3.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir3.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir3.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir3.setRound(40);

        jLabel9.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("FECHA DE LA CITA:");

        rSDateChooser1.setColorBackground(new java.awt.Color(23, 144, 244));
        rSDateChooser1.setColorButtonHover(new java.awt.Color(23, 144, 244));
        rSDateChooser1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        rSDateChooser1.setFormatoFecha("dd/MM/yyyy");
        rSDateChooser1.setFuente(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        btn_cancelar_cambios2.setBackground(new java.awt.Color(139, 198, 255));
        btn_cancelar_cambios2.setForeground(new java.awt.Color(51, 51, 51));
        btn_cancelar_cambios2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-buscar-en-la-lista-24.png"))); // NOI18N
        btn_cancelar_cambios2.setText("Ver Horario Disponible");
        btn_cancelar_cambios2.setBorderPainted(false);
        btn_cancelar_cambios2.setContentAreaFilled(true);
        btn_cancelar_cambios2.setCornerRound(45);
        btn_cancelar_cambios2.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_cancelar_cambios2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_cambios2ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        buttonGroup1.add(rSRadioButtonMaterial29);
        rSRadioButtonMaterial29.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial29.setText("8:00 - 8:30");
        rSRadioButtonMaterial29.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial29.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial29.setFocusPainted(false);
        rSRadioButtonMaterial29.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        rSRadioButtonMaterial29.setRippleColor(new java.awt.Color(0, 112, 192));

        buttonGroup1.add(rSRadioButtonMaterial30);
        rSRadioButtonMaterial30.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial30.setText("10:00 - 10:30");
        rSRadioButtonMaterial30.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial30.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial30.setFocusPainted(false);
        rSRadioButtonMaterial30.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        rSRadioButtonMaterial30.setRippleColor(new java.awt.Color(0, 112, 192));

        buttonGroup1.add(rSRadioButtonMaterial31);
        rSRadioButtonMaterial31.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial31.setText("12:00 - 12:30");
        rSRadioButtonMaterial31.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial31.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial31.setFocusPainted(false);
        rSRadioButtonMaterial31.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        rSRadioButtonMaterial31.setRippleColor(new java.awt.Color(0, 112, 192));

        buttonGroup1.add(rSRadioButtonMaterial32);
        rSRadioButtonMaterial32.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial32.setText("14:00 - 14:30");
        rSRadioButtonMaterial32.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial32.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial32.setFocusPainted(false);
        rSRadioButtonMaterial32.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        rSRadioButtonMaterial32.setRippleColor(new java.awt.Color(0, 112, 192));

        buttonGroup1.add(rSRadioButtonMaterial33);
        rSRadioButtonMaterial33.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial33.setText("8:30 - 9:00");
        rSRadioButtonMaterial33.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial33.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial33.setFocusPainted(false);
        rSRadioButtonMaterial33.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        rSRadioButtonMaterial33.setRippleColor(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSRadioButtonMaterial33ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rSRadioButtonMaterial34);
        rSRadioButtonMaterial34.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial34.setText("10:30 - 11:00");
        rSRadioButtonMaterial34.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial34.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial34.setFocusPainted(false);
        rSRadioButtonMaterial34.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        rSRadioButtonMaterial34.setRippleColor(new java.awt.Color(0, 112, 192));

        buttonGroup1.add(rSRadioButtonMaterial35);
        rSRadioButtonMaterial35.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial35.setText("12:30 - 13:00");
        rSRadioButtonMaterial35.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial35.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial35.setFocusPainted(false);
        rSRadioButtonMaterial35.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        rSRadioButtonMaterial35.setRippleColor(new java.awt.Color(0, 112, 192));

        buttonGroup1.add(rSRadioButtonMaterial36);
        rSRadioButtonMaterial36.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial36.setText("14:30 - 15:00");
        rSRadioButtonMaterial36.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial36.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial36.setFocusPainted(false);
        rSRadioButtonMaterial36.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        rSRadioButtonMaterial36.setRippleColor(new java.awt.Color(0, 112, 192));

        buttonGroup1.add(rSRadioButtonMaterial37);
        rSRadioButtonMaterial37.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial37.setText("9:00 - 9:30");
        rSRadioButtonMaterial37.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial37.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial37.setFocusPainted(false);
        rSRadioButtonMaterial37.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        rSRadioButtonMaterial37.setRippleColor(new java.awt.Color(0, 112, 192));

        buttonGroup1.add(rSRadioButtonMaterial38);
        rSRadioButtonMaterial38.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial38.setText("11:.00 - 11:30");
        rSRadioButtonMaterial38.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial38.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial38.setFocusPainted(false);
        rSRadioButtonMaterial38.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        rSRadioButtonMaterial38.setRippleColor(new java.awt.Color(0, 112, 192));

        buttonGroup1.add(rSRadioButtonMaterial39);
        rSRadioButtonMaterial39.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial39.setText("13:00 - 13:30");
        rSRadioButtonMaterial39.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial39.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial39.setFocusPainted(false);
        rSRadioButtonMaterial39.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        rSRadioButtonMaterial39.setRippleColor(new java.awt.Color(0, 112, 192));

        buttonGroup1.add(rSRadioButtonMaterial41);
        rSRadioButtonMaterial41.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial41.setText("9:00 - 9:30");
        rSRadioButtonMaterial41.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial41.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial41.setFocusPainted(false);
        rSRadioButtonMaterial41.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        rSRadioButtonMaterial41.setRippleColor(new java.awt.Color(0, 112, 192));

        buttonGroup1.add(rSRadioButtonMaterial42);
        rSRadioButtonMaterial42.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial42.setText("11:.00 - 11:30");
        rSRadioButtonMaterial42.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial42.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial42.setFocusPainted(false);
        rSRadioButtonMaterial42.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        rSRadioButtonMaterial42.setRippleColor(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSRadioButtonMaterial42ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rSRadioButtonMaterial43);
        rSRadioButtonMaterial43.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial43.setText("13:00 - 13:30");
        rSRadioButtonMaterial43.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial43.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial43.setFocusPainted(false);
        rSRadioButtonMaterial43.setFont(new java.awt.Font("Poppins", 0, 13)); // NOI18N
        rSRadioButtonMaterial43.setRippleColor(new java.awt.Color(0, 112, 192));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rSRadioButtonMaterial30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(rSRadioButtonMaterial29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(rSRadioButtonMaterial32, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(rSRadioButtonMaterial31, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addGap(18, 25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSRadioButtonMaterial33, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(rSRadioButtonMaterial34, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(rSRadioButtonMaterial35, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(rSRadioButtonMaterial36, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSRadioButtonMaterial37, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(rSRadioButtonMaterial38, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(rSRadioButtonMaterial39, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSRadioButtonMaterial41, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(rSRadioButtonMaterial42, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(rSRadioButtonMaterial43, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rSRadioButtonMaterial41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rSRadioButtonMaterial37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rSRadioButtonMaterial29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rSRadioButtonMaterial33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rSRadioButtonMaterial34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSRadioButtonMaterial38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSRadioButtonMaterial42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rSRadioButtonMaterial30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSRadioButtonMaterial35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSRadioButtonMaterial31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSRadioButtonMaterial39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSRadioButtonMaterial43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSRadioButtonMaterial36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSRadioButtonMaterial32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menu_salir3Layout = new javax.swing.GroupLayout(menu_salir3);
        menu_salir3.setLayout(menu_salir3Layout);
        menu_salir3Layout.setHorizontalGroup(
            menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_salir3Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu_salir3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(rSDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(btn_cancelar_cambios2, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        menu_salir3Layout.setVerticalGroup(
            menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir3Layout.createSequentialGroup()
                .addGroup(menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu_salir3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel9))
                    .addGroup(menu_salir3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(rSDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menu_salir3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btn_cancelar_cambios2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        rSPanelBorderGradient1.setBackground(new java.awt.Color(204, 204, 204));
        rSPanelBorderGradient1.setBgShade(new java.awt.Color(255, 255, 255));
        rSPanelBorderGradient1.setColorPrimario(new java.awt.Color(200, 232, 250));
        rSPanelBorderGradient1.setColorSecundario(new java.awt.Color(200, 232, 250));
        rSPanelBorderGradient1.setGradiente(RSMaterialComponent.RSPanelBorderGradient.Gradiente.HORIZONTAL);
        rSPanelBorderGradient1.setRound(40);
        rSPanelBorderGradient1.setWidthBorder(0);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-calendario-100 (1).png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Poppins ExtraBold", 0, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("RESERVA DE CITAS");

        btn_nueva_cita.setBackground(new java.awt.Color(139, 198, 255));
        btn_nueva_cita.setForeground(new java.awt.Color(51, 51, 51));
        btn_nueva_cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-agregar-archivo-24.png"))); // NOI18N
        btn_nueva_cita.setText("Nueva Cita");
        btn_nueva_cita.setBorderPainted(false);
        btn_nueva_cita.setContentAreaFilled(true);
        btn_nueva_cita.setCornerRound(45);
        btn_nueva_cita.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_nueva_cita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nueva_citaActionPerformed(evt);
            }
        });

        btn_guardar_cita.setBackground(new java.awt.Color(139, 198, 255));
        btn_guardar_cita.setForeground(new java.awt.Color(51, 51, 51));
        btn_guardar_cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-guardar-24.png"))); // NOI18N
        btn_guardar_cita.setText("Guardar Cita");
        btn_guardar_cita.setBorderPainted(false);
        btn_guardar_cita.setContentAreaFilled(true);
        btn_guardar_cita.setCornerRound(45);
        btn_guardar_cita.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_guardar_cita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_citaActionPerformed(evt);
            }
        });

        btn_cancelar_cambios.setBackground(new java.awt.Color(139, 198, 255));
        btn_cancelar_cambios.setForeground(new java.awt.Color(51, 51, 51));
        btn_cancelar_cambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/cancelar.png"))); // NOI18N
        btn_cancelar_cambios.setText("Cancelar Cambios");
        btn_cancelar_cambios.setBorderPainted(false);
        btn_cancelar_cambios.setContentAreaFilled(true);
        btn_cancelar_cambios.setCornerRound(45);
        btn_cancelar_cambios.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_cancelar_cambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_cambiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rSPanelBorderGradient1Layout = new javax.swing.GroupLayout(rSPanelBorderGradient1);
        rSPanelBorderGradient1.setLayout(rSPanelBorderGradient1Layout);
        rSPanelBorderGradient1Layout.setHorizontalGroup(
            rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelBorderGradient1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelBorderGradient1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelBorderGradient1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39))))
            .addGroup(rSPanelBorderGradient1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_nueva_cita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar_cambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardar_cita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        rSPanelBorderGradient1Layout.setVerticalGroup(
            rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelBorderGradient1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(129, 129, 129)
                .addComponent(btn_nueva_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_guardar_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_cancelar_cambios, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rSPanelBorderGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu_salir2, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                    .addComponent(menu_salir3, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                    .addComponent(menu_salir1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(rSPanelBorderGradient1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(menu_salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(menu_salir2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(menu_salir3, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_especialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_especialistaActionPerformed
    
    }//GEN-LAST:event_cbx_especialistaActionPerformed

    private void cbx_serviciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_serviciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_serviciosActionPerformed

    private void btn_nueva_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nueva_citaActionPerformed
          
        btn_guardar_cita.setEnabled(true);
        btn_cancelar_cambios.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nueva_citaActionPerformed

    private void btn_guardar_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_citaActionPerformed
          // TODO add your handling code here:
    }//GEN-LAST:event_btn_guardar_citaActionPerformed

    private void btn_cancelar_cambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_cambiosActionPerformed
           // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelar_cambiosActionPerformed

    private void btn_cancelar_cambios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_cambios1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelar_cambios1ActionPerformed

    private void btn_cancelar_cambios2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_cambios2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelar_cambios2ActionPerformed

    private void rSRadioButtonMaterial33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSRadioButtonMaterial33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSRadioButtonMaterial33ActionPerformed

    private void rSRadioButtonMaterial42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSRadioButtonMaterial42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSRadioButtonMaterial42ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btn_cancelar_cambios;
    private newscomponents.RSButtonFlat_new btn_cancelar_cambios1;
    private newscomponents.RSButtonFlat_new btn_cancelar_cambios2;
    private newscomponents.RSButtonFlat_new btn_guardar_cita;
    private newscomponents.RSButtonFlat_new btn_nueva_cita;
    private javax.swing.ButtonGroup buttonGroup1;
    private RSMaterialComponent.RSComboBoxMaterial cbx_especialista;
    private RSMaterialComponent.RSComboBoxMaterial cbx_servicios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_patient;
    private RSMaterialComponent.RSPanelMaterial menu_salir1;
    private RSMaterialComponent.RSPanelMaterial menu_salir2;
    private RSMaterialComponent.RSPanelMaterial menu_salir3;
    private rojerusan.RSDateChooser rSDateChooser1;
    private RSMaterialComponent.RSPanelBorderGradient rSPanelBorderGradient1;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial29;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial30;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial31;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial32;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial33;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial34;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial35;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial36;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial37;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial38;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial39;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial41;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial42;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial43;
    private rscomponentshade.RSFormatFieldShade txt_dni;
    // End of variables declaration//GEN-END:variables
}
