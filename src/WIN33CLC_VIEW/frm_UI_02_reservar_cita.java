
package WIN33CLC_VIEW;

import java.awt.Color;


public class frm_UI_02_reservar_cita extends javax.swing.JPanel {

    public frm_UI_02_reservar_cita() {
        initComponents();
     
        setBackground(new Color (255,255,255,1));
        btn_nueva_cita.setBackground(new Color (41,177,255,0));
       
        btn_guardar_cita.setBackground(new Color (41,177,255,0));
        btn_cancelar_cambios.setBackground(new Color (41,177,255,0));
       
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
        txt_dni = new rojerusan.RSMetroTextPlaceHolder();
        btn_buscar_reniec = new RSMaterialComponent.RSButtonMaterialGradientOne();
        menu_salir2 = new RSMaterialComponent.RSPanelMaterial();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbx_especialista = new RSMaterialComponent.RSComboBoxMaterial();
        cbx_servicios = new RSMaterialComponent.RSComboBoxMaterial();
        menu_salir3 = new RSMaterialComponent.RSPanelMaterial();
        jLabel9 = new javax.swing.JLabel();
        rSDateChooser1 = new rojerusan.RSDateChooser();
        btn_horario_disponible = new RSMaterialComponent.RSButtonMaterialGradientOne();
        rSRadioButtonMaterial1 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial2 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial3 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial4 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial5 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial6 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial7 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial8 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial9 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial10 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial11 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial12 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial13 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial14 = new RSMaterialComponent.RSRadioButtonMaterial();
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

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("PACIENTE:");

        lbl_patient.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_patient.setForeground(new java.awt.Color(51, 51, 51));
        lbl_patient.setText("NOMBRES Y APELLIDOS COMPLETOS");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("DNI:");

        txt_dni.setForeground(new java.awt.Color(51, 51, 51));
        txt_dni.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_dni.setBotonColor(new java.awt.Color(3, 111, 198));
        txt_dni.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        btn_buscar_reniec.setForeground(new java.awt.Color(51, 51, 51));
        btn_buscar_reniec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-encuentra-hombre-usuario-24.png"))); // NOI18N
        btn_buscar_reniec.setText("Buscar en Reniec");
        btn_buscar_reniec.setBorderPainted(false);
        btn_buscar_reniec.setColorPrimario(new java.awt.Color(41, 177, 255));
        btn_buscar_reniec.setColorPrimarioHover(new java.awt.Color(41, 177, 255));
        btn_buscar_reniec.setColorSecundario(new java.awt.Color(41, 177, 255));
        btn_buscar_reniec.setColorSecundarioHover(new java.awt.Color(41, 177, 255));
        btn_buscar_reniec.setFocusPainted(false);
        btn_buscar_reniec.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N

        javax.swing.GroupLayout menu_salir1Layout = new javax.swing.GroupLayout(menu_salir1);
        menu_salir1.setLayout(menu_salir1Layout);
        menu_salir1Layout.setHorizontalGroup(
            menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu_salir1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_patient, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menu_salir1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(btn_buscar_reniec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu_salir1Layout.setVerticalGroup(
            menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar_reniec, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lbl_patient))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        menu_salir2.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir2.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir2.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir2.setRound(40);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("SERVICIOS");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("ESPECIALISTA");

        cbx_especialista.setForeground(new java.awt.Color(51, 51, 51));
        cbx_especialista.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija una Opcion.", "RSItem 2", "RSItem 3", "RSItem 4" }));
        cbx_especialista.setColorMaterial(new java.awt.Color(10, 117, 167));
        cbx_especialista.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        cbx_especialista.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        cbx_especialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_especialistaActionPerformed(evt);
            }
        });

        cbx_servicios.setForeground(new java.awt.Color(51, 51, 51));
        cbx_servicios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija una Opcion.", "RSItem 2", "RSItem 3", "RSItem 4" }));
        cbx_servicios.setColorMaterial(new java.awt.Color(10, 117, 167));
        cbx_servicios.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbx_servicios, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbx_especialista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(32, Short.MAX_VALUE))
        );

        menu_salir3.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir3.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir3.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir3.setRound(40);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("FECHA DE LA CITA:");

        rSDateChooser1.setColorBackground(new java.awt.Color(23, 144, 244));
        rSDateChooser1.setColorButtonHover(new java.awt.Color(23, 144, 244));
        rSDateChooser1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rSDateChooser1.setFormatoFecha("dd/MM/yyyy");
        rSDateChooser1.setFuente(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btn_horario_disponible.setForeground(new java.awt.Color(51, 51, 51));
        btn_horario_disponible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-buscar-en-la-lista-24.png"))); // NOI18N
        btn_horario_disponible.setText("Ver horario disponible");
        btn_horario_disponible.setBorderPainted(false);
        btn_horario_disponible.setColorPrimario(new java.awt.Color(41, 177, 255));
        btn_horario_disponible.setColorPrimarioHover(new java.awt.Color(41, 177, 255));
        btn_horario_disponible.setColorSecundario(new java.awt.Color(41, 177, 255));
        btn_horario_disponible.setColorSecundarioHover(new java.awt.Color(41, 177, 255));
        btn_horario_disponible.setFocusPainted(false);
        btn_horario_disponible.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N

        buttonGroup1.add(rSRadioButtonMaterial1);
        rSRadioButtonMaterial1.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial1.setText("8:00 - 8:30");
        rSRadioButtonMaterial1.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial1.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial1.setFocusPainted(false);
        rSRadioButtonMaterial1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rSRadioButtonMaterial1.setRippleColor(new java.awt.Color(0, 112, 192));

        buttonGroup1.add(rSRadioButtonMaterial2);
        rSRadioButtonMaterial2.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial2.setText("8:30 - 9:00");
        rSRadioButtonMaterial2.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial2.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial2.setFocusPainted(false);
        rSRadioButtonMaterial2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rSRadioButtonMaterial2.setRippleColor(new java.awt.Color(0, 112, 192));

        buttonGroup1.add(rSRadioButtonMaterial3);
        rSRadioButtonMaterial3.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial3.setText("9:00 - 9:30");
        rSRadioButtonMaterial3.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial3.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial3.setFocusPainted(false);
        rSRadioButtonMaterial3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rSRadioButtonMaterial3.setRippleColor(new java.awt.Color(0, 112, 192));

        buttonGroup1.add(rSRadioButtonMaterial4);
        rSRadioButtonMaterial4.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial4.setText("9:30 - 10:00");
        rSRadioButtonMaterial4.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial4.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial4.setFocusPainted(false);
        rSRadioButtonMaterial4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rSRadioButtonMaterial4.setRippleColor(new java.awt.Color(0, 112, 192));

        buttonGroup1.add(rSRadioButtonMaterial5);
        rSRadioButtonMaterial5.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial5.setText("10:00 - 10:30");
        rSRadioButtonMaterial5.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial5.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial5.setFocusPainted(false);
        rSRadioButtonMaterial5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rSRadioButtonMaterial5.setRippleColor(new java.awt.Color(0, 112, 192));

        buttonGroup1.add(rSRadioButtonMaterial6);
        rSRadioButtonMaterial6.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial6.setText("10:30 - 11:00");
        rSRadioButtonMaterial6.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial6.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial6.setFocusPainted(false);
        rSRadioButtonMaterial6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rSRadioButtonMaterial6.setRippleColor(new java.awt.Color(0, 112, 192));

        buttonGroup1.add(rSRadioButtonMaterial7);
        rSRadioButtonMaterial7.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial7.setText("11:00 - 11:30");
        rSRadioButtonMaterial7.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial7.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial7.setFocusPainted(false);
        rSRadioButtonMaterial7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rSRadioButtonMaterial7.setRippleColor(new java.awt.Color(0, 112, 192));

        buttonGroup1.add(rSRadioButtonMaterial8);
        rSRadioButtonMaterial8.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial8.setText("11:30 - 12:00");
        rSRadioButtonMaterial8.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial8.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial8.setFocusPainted(false);
        rSRadioButtonMaterial8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rSRadioButtonMaterial8.setRippleColor(new java.awt.Color(0, 112, 192));

        buttonGroup1.add(rSRadioButtonMaterial9);
        rSRadioButtonMaterial9.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial9.setText("12:00 - 12:30");
        rSRadioButtonMaterial9.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial9.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial9.setFocusPainted(false);
        rSRadioButtonMaterial9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rSRadioButtonMaterial9.setRippleColor(new java.awt.Color(0, 112, 192));

        buttonGroup1.add(rSRadioButtonMaterial10);
        rSRadioButtonMaterial10.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial10.setText("12:30 - 13:00");
        rSRadioButtonMaterial10.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial10.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial10.setFocusPainted(false);
        rSRadioButtonMaterial10.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rSRadioButtonMaterial10.setRippleColor(new java.awt.Color(0, 112, 192));

        buttonGroup1.add(rSRadioButtonMaterial11);
        rSRadioButtonMaterial11.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial11.setText("13:00 - 13:30");
        rSRadioButtonMaterial11.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial11.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial11.setFocusPainted(false);
        rSRadioButtonMaterial11.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rSRadioButtonMaterial11.setRippleColor(new java.awt.Color(0, 112, 192));

        buttonGroup1.add(rSRadioButtonMaterial12);
        rSRadioButtonMaterial12.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial12.setText("13:30 - 14:00");
        rSRadioButtonMaterial12.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial12.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial12.setFocusPainted(false);
        rSRadioButtonMaterial12.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rSRadioButtonMaterial12.setRippleColor(new java.awt.Color(0, 112, 192));

        buttonGroup1.add(rSRadioButtonMaterial13);
        rSRadioButtonMaterial13.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial13.setText("14:00 - 14:30");
        rSRadioButtonMaterial13.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial13.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial13.setFocusPainted(false);
        rSRadioButtonMaterial13.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rSRadioButtonMaterial13.setRippleColor(new java.awt.Color(0, 112, 192));

        buttonGroup1.add(rSRadioButtonMaterial14);
        rSRadioButtonMaterial14.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial14.setText("14:30 - 15:00");
        rSRadioButtonMaterial14.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial14.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial14.setFocusPainted(false);
        rSRadioButtonMaterial14.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rSRadioButtonMaterial14.setRippleColor(new java.awt.Color(0, 112, 192));

        javax.swing.GroupLayout menu_salir3Layout = new javax.swing.GroupLayout(menu_salir3);
        menu_salir3.setLayout(menu_salir3Layout);
        menu_salir3Layout.setHorizontalGroup(
            menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir3Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addGroup(menu_salir3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rSRadioButtonMaterial9, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(rSRadioButtonMaterial5, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(rSRadioButtonMaterial13, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(rSRadioButtonMaterial1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                .addGroup(menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu_salir3Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(rSDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(btn_horario_disponible, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(menu_salir3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rSRadioButtonMaterial6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(rSRadioButtonMaterial10, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(rSRadioButtonMaterial2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(rSRadioButtonMaterial14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rSRadioButtonMaterial3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(rSRadioButtonMaterial7, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(rSRadioButtonMaterial11, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rSRadioButtonMaterial8, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(rSRadioButtonMaterial4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(rSRadioButtonMaterial12, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        menu_salir3Layout.setVerticalGroup(
            menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir3Layout.createSequentialGroup()
                .addGroup(menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu_salir3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_horario_disponible, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(menu_salir3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel9)))
                .addGap(52, 52, 52)
                .addGroup(menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSRadioButtonMaterial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSRadioButtonMaterial2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSRadioButtonMaterial3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSRadioButtonMaterial4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSRadioButtonMaterial5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSRadioButtonMaterial6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSRadioButtonMaterial7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSRadioButtonMaterial8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSRadioButtonMaterial9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSRadioButtonMaterial10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSRadioButtonMaterial11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSRadioButtonMaterial12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSRadioButtonMaterial13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSRadioButtonMaterial14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        rSPanelBorderGradient1.setBackground(new java.awt.Color(204, 204, 204));
        rSPanelBorderGradient1.setBgShade(new java.awt.Color(255, 255, 255));
        rSPanelBorderGradient1.setColorPrimario(new java.awt.Color(41, 177, 255));
        rSPanelBorderGradient1.setColorSecundario(new java.awt.Color(41, 177, 255));
        rSPanelBorderGradient1.setGradiente(RSMaterialComponent.RSPanelBorderGradient.Gradiente.HORIZONTAL);
        rSPanelBorderGradient1.setRound(40);
        rSPanelBorderGradient1.setWidthBorder(0);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-calendario-100 (1).png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("RESERVA DE CITAS");

        btn_nueva_cita.setBackground(new java.awt.Color(0, 160, 253));
        btn_nueva_cita.setForeground(new java.awt.Color(51, 51, 51));
        btn_nueva_cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-crear-nuevo-24.png"))); // NOI18N
        btn_nueva_cita.setText("Nueva Cita");
        btn_nueva_cita.setBorderPainted(false);
        btn_nueva_cita.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N

        btn_guardar_cita.setBackground(new java.awt.Color(0, 160, 253));
        btn_guardar_cita.setForeground(new java.awt.Color(51, 51, 51));
        btn_guardar_cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-guardar-24.png"))); // NOI18N
        btn_guardar_cita.setText("Guardar Cita");
        btn_guardar_cita.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N

        btn_cancelar_cambios.setBackground(new java.awt.Color(0, 160, 253));
        btn_cancelar_cambios.setForeground(new java.awt.Color(51, 51, 51));
        btn_cancelar_cambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-cancelar-24.png"))); // NOI18N
        btn_cancelar_cambios.setText("Cancelar Cambios");
        btn_cancelar_cambios.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N

        javax.swing.GroupLayout rSPanelBorderGradient1Layout = new javax.swing.GroupLayout(rSPanelBorderGradient1);
        rSPanelBorderGradient1.setLayout(rSPanelBorderGradient1Layout);
        rSPanelBorderGradient1Layout.setHorizontalGroup(
            rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelBorderGradient1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelBorderGradient1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelBorderGradient1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelBorderGradient1Layout.createSequentialGroup()
                        .addGroup(rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_cancelar_cambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_guardar_cita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_nueva_cita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))))
        );
        rSPanelBorderGradient1Layout.setVerticalGroup(
            rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelBorderGradient1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(149, 149, 149)
                .addComponent(btn_nueva_cita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btn_guardar_cita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btn_cancelar_cambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(menu_salir2, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
                    .addComponent(menu_salir3, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
                    .addComponent(menu_salir1, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu_salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(menu_salir2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(menu_salir3, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(rSPanelBorderGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_especialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_especialistaActionPerformed
    
    }//GEN-LAST:event_cbx_especialistaActionPerformed

    private void cbx_serviciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_serviciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_serviciosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_buscar_reniec;
    private newscomponents.RSButtonFlat_new btn_cancelar_cambios;
    private newscomponents.RSButtonFlat_new btn_guardar_cita;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_horario_disponible;
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
    private javax.swing.JLabel lbl_patient;
    private RSMaterialComponent.RSPanelMaterial menu_salir1;
    private RSMaterialComponent.RSPanelMaterial menu_salir2;
    private RSMaterialComponent.RSPanelMaterial menu_salir3;
    private rojerusan.RSDateChooser rSDateChooser1;
    private RSMaterialComponent.RSPanelBorderGradient rSPanelBorderGradient1;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial1;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial10;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial11;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial12;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial13;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial14;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial2;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial3;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial4;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial5;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial6;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial7;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial8;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial9;
    private rojerusan.RSMetroTextPlaceHolder txt_dni;
    // End of variables declaration//GEN-END:variables
}
