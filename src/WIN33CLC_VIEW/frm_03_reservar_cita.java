
package WIN33CLC_VIEW;


public class frm_03_reservar_cita extends javax.swing.JPanel {

 
    public frm_03_reservar_cita() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panel_contenedor = new javax.swing.JPanel();
        fSGradientPanel1 = new LIB.FSGradientPanel();
        jLabel13 = new javax.swing.JLabel();
        btn_nueva_cita = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_cancelar_cambios1 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_guardar_cita1 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        jPanel1 = new javax.swing.JPanel();
        txt_buscar_paciente = new RSMaterialComponent.RSButtonMaterialGradientOne();
        jLabel1 = new javax.swing.JLabel();
        txt_fname1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojerusan.RSTableMetro();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rSComboBoxMaterial1 = new RSMaterialComponent.RSComboBoxMaterial();
        rSComboBoxMaterial2 = new RSMaterialComponent.RSComboBoxMaterial();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        rSDateChooser2 = new rojeru_san.componentes.RSDateChooser();
        txt_buscar_horarios = new RSMaterialComponent.RSButtonMaterialGradientOne();
        jPanel3 = new javax.swing.JPanel();
        rbx_1 = new RSMaterialComponent.RSRadioButtonMaterial();
        rbx_2 = new RSMaterialComponent.RSRadioButtonMaterial();
        rbx_3 = new RSMaterialComponent.RSRadioButtonMaterial();
        rbx_4 = new RSMaterialComponent.RSRadioButtonMaterial();
        rbx_5 = new RSMaterialComponent.RSRadioButtonMaterial();
        rbx_6 = new RSMaterialComponent.RSRadioButtonMaterial();
        rbx_7 = new RSMaterialComponent.RSRadioButtonMaterial();
        rbx_8 = new RSMaterialComponent.RSRadioButtonMaterial();
        rbx_9 = new RSMaterialComponent.RSRadioButtonMaterial();
        rbx_10 = new RSMaterialComponent.RSRadioButtonMaterial();
        rbx_11 = new RSMaterialComponent.RSRadioButtonMaterial();
        rbx_12 = new RSMaterialComponent.RSRadioButtonMaterial();
        rbx_13 = new RSMaterialComponent.RSRadioButtonMaterial();
        rbx_14 = new RSMaterialComponent.RSRadioButtonMaterial();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_contenedor.setBackground(new java.awt.Color(255, 255, 255));
        panel_contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fSGradientPanel1.setFSEndColor(new java.awt.Color(3, 111, 198));
        fSGradientPanel1.setFSStartColor(new java.awt.Color(101, 208, 250));
        fSGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-calendario-100.png"))); // NOI18N
        fSGradientPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 110, 90));

        btn_nueva_cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-hoy-30.png"))); // NOI18N
        btn_nueva_cita.setText("Nueva Cita");
        btn_nueva_cita.setBorderPainted(false);
        btn_nueva_cita.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn_nueva_cita.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn_nueva_cita.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn_nueva_cita.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn_nueva_cita.setFocusPainted(false);
        btn_nueva_cita.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        fSGradientPanel1.add(btn_nueva_cita, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 210, -1));

        btn_cancelar_cambios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-cancelar-30.png"))); // NOI18N
        btn_cancelar_cambios1.setText("Cancelar Cambios");
        btn_cancelar_cambios1.setBorderPainted(false);
        btn_cancelar_cambios1.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn_cancelar_cambios1.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn_cancelar_cambios1.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn_cancelar_cambios1.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn_cancelar_cambios1.setFocusPainted(false);
        btn_cancelar_cambios1.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        fSGradientPanel1.add(btn_cancelar_cambios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 210, -1));

        btn_guardar_cita1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-guardar-como-30.png"))); // NOI18N
        btn_guardar_cita1.setText("Guardar Cita");
        btn_guardar_cita1.setBorderPainted(false);
        btn_guardar_cita1.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn_guardar_cita1.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn_guardar_cita1.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn_guardar_cita1.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn_guardar_cita1.setFocusPainted(false);
        btn_guardar_cita1.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        fSGradientPanel1.add(btn_guardar_cita1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 210, -1));

        panel_contenedor.add(fSGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 740));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 15))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_buscar_paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-encuentra-hombre-usuario-30.png"))); // NOI18N
        txt_buscar_paciente.setText("Buscar Paciente");
        txt_buscar_paciente.setBorderPainted(false);
        txt_buscar_paciente.setColorPrimario(new java.awt.Color(42, 170, 232));
        txt_buscar_paciente.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        txt_buscar_paciente.setColorSecundario(new java.awt.Color(3, 102, 183));
        txt_buscar_paciente.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        txt_buscar_paciente.setFocusPainted(false);
        txt_buscar_paciente.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 16)); // NOI18N
        txt_buscar_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscar_pacienteActionPerformed(evt);
            }
        });
        jPanel1.add(txt_buscar_paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("DNI");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, 20));

        txt_fname1.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txt_fname1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));
        txt_fname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fname1ActionPerformed(evt);
            }
        });
        jPanel1.add(txt_fname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 120, 30));

        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        rSTableMetro1.setColorBackgoundHead(new java.awt.Color(3, 111, 198));
        rSTableMetro1.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        rSTableMetro1.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        rSTableMetro1.setColorFilasForeground2(new java.awt.Color(255, 255, 255));
        rSTableMetro1.setFuenteFilas(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        rSTableMetro1.setFuenteFilasSelect(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        rSTableMetro1.setFuenteHead(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        rSTableMetro1.setGrosorBordeFilas(0);
        rSTableMetro1.setGrosorBordeHead(0);
        rSTableMetro1.setInheritsPopupMenu(true);
        jScrollPane1.setViewportView(rSTableMetro1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 750, 120));

        panel_contenedor.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 770, 230));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reserva de Servicios y Especialista", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setText("Especialista");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setText("Servicios");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        rSComboBoxMaterial1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija un servicio", "RSItem 2", "RSItem 3", "RSItem 4" }));
        rSComboBoxMaterial1.setColorMaterial(new java.awt.Color(3, 111, 198));
        rSComboBoxMaterial1.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 15)); // NOI18N
        jPanel4.add(rSComboBoxMaterial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        rSComboBoxMaterial2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija un Especialista", "RSItem 2", "RSItem 3", "RSItem 4" }));
        rSComboBoxMaterial2.setColorMaterial(new java.awt.Color(3, 111, 198));
        rSComboBoxMaterial2.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 15)); // NOI18N
        jPanel4.add(rSComboBoxMaterial2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, -1));

        panel_contenedor.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 770, 100));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reserva de cita", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 1, 15))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel12.setText("Fecha de la Cita");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 51, -1, -1));

        rSDateChooser2.setColorBackground(new java.awt.Color(3, 111, 198));
        rSDateChooser2.setColorButtonHover(new java.awt.Color(3, 111, 198));
        rSDateChooser2.setColorDiaActual(new java.awt.Color(255, 0, 0));
        rSDateChooser2.setColorForeground(new java.awt.Color(3, 111, 198));
        rSDateChooser2.setFuente(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jPanel2.add(rSDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        txt_buscar_horarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-horas-extras-30.png"))); // NOI18N
        txt_buscar_horarios.setText("Ver Horario Disponible");
        txt_buscar_horarios.setBorderPainted(false);
        txt_buscar_horarios.setColorPrimario(new java.awt.Color(42, 170, 232));
        txt_buscar_horarios.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        txt_buscar_horarios.setColorSecundario(new java.awt.Color(3, 102, 183));
        txt_buscar_horarios.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        txt_buscar_horarios.setFocusPainted(false);
        txt_buscar_horarios.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 16)); // NOI18N
        txt_buscar_horarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscar_horariosActionPerformed(evt);
            }
        });
        jPanel2.add(txt_buscar_horarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 250, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(rbx_1);
        rbx_1.setForeground(new java.awt.Color(0, 0, 0));
        rbx_1.setText("8:00 - 8:30");
        rbx_1.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_1.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_1.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_1.setRippleColor(new java.awt.Color(3, 111, 198));
        jPanel3.add(rbx_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 5, -1, -1));

        buttonGroup1.add(rbx_2);
        rbx_2.setForeground(new java.awt.Color(0, 0, 0));
        rbx_2.setText("8:30 - 9:00");
        rbx_2.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_2.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_2.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_2.setRippleColor(new java.awt.Color(3, 111, 198));
        jPanel3.add(rbx_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 5, -1, -1));

        buttonGroup1.add(rbx_3);
        rbx_3.setForeground(new java.awt.Color(0, 0, 0));
        rbx_3.setText("9:00 - 9:30");
        rbx_3.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_3.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rbx_3.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_3.setRippleColor(new java.awt.Color(3, 111, 198));
        jPanel3.add(rbx_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 5, -1, -1));

        buttonGroup1.add(rbx_4);
        rbx_4.setForeground(new java.awt.Color(0, 0, 0));
        rbx_4.setText("9:30 - 10:00");
        rbx_4.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_4.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_4.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_4.setRippleColor(new java.awt.Color(3, 111, 198));
        jPanel3.add(rbx_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 5, -1, -1));

        buttonGroup1.add(rbx_5);
        rbx_5.setForeground(new java.awt.Color(0, 0, 0));
        rbx_5.setText("10:00 - 10:30");
        rbx_5.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_5.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_5.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_5.setRippleColor(new java.awt.Color(3, 111, 198));
        jPanel3.add(rbx_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 50, -1, -1));

        buttonGroup1.add(rbx_6);
        rbx_6.setForeground(new java.awt.Color(0, 0, 0));
        rbx_6.setText("10:30 - 11:00");
        rbx_6.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_6.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_6.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_6.setRippleColor(new java.awt.Color(3, 111, 198));
        jPanel3.add(rbx_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 50, -1, -1));

        buttonGroup1.add(rbx_7);
        rbx_7.setForeground(new java.awt.Color(0, 0, 0));
        rbx_7.setText("11:00 - 11:30");
        rbx_7.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_7.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_7.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_7.setRippleColor(new java.awt.Color(3, 111, 198));
        jPanel3.add(rbx_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 50, -1, -1));

        buttonGroup1.add(rbx_8);
        rbx_8.setForeground(new java.awt.Color(0, 0, 0));
        rbx_8.setText("11:30 - 12:00");
        rbx_8.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_8.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_8.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_8.setRippleColor(new java.awt.Color(3, 111, 198));
        jPanel3.add(rbx_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 50, -1, -1));

        rbx_9.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(rbx_9);
        rbx_9.setForeground(new java.awt.Color(0, 0, 0));
        rbx_9.setText("12:00 - 12:30");
        rbx_9.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_9.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_9.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_9.setRippleColor(new java.awt.Color(3, 111, 198));
        jPanel3.add(rbx_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 95, -1, -1));

        buttonGroup1.add(rbx_10);
        rbx_10.setForeground(new java.awt.Color(0, 0, 0));
        rbx_10.setText("12:30 - 13:00");
        rbx_10.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_10.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_10.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_10.setRippleColor(new java.awt.Color(3, 111, 198));
        jPanel3.add(rbx_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 95, -1, -1));

        buttonGroup1.add(rbx_11);
        rbx_11.setForeground(new java.awt.Color(0, 0, 0));
        rbx_11.setText("13:00 - 13:30");
        rbx_11.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_11.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_11.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_11.setRippleColor(new java.awt.Color(3, 111, 198));
        jPanel3.add(rbx_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 95, -1, -1));

        buttonGroup1.add(rbx_12);
        rbx_12.setForeground(new java.awt.Color(0, 0, 0));
        rbx_12.setText("13:30 - 14:00");
        rbx_12.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_12.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_12.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_12.setRippleColor(new java.awt.Color(3, 111, 198));
        jPanel3.add(rbx_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 95, -1, -1));

        buttonGroup1.add(rbx_13);
        rbx_13.setForeground(new java.awt.Color(0, 0, 0));
        rbx_13.setText("14:00 - 14:00");
        rbx_13.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_13.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_13.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_13.setRippleColor(new java.awt.Color(3, 111, 198));
        jPanel3.add(rbx_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 140, -1, -1));

        buttonGroup1.add(rbx_14);
        rbx_14.setForeground(new java.awt.Color(0, 0, 0));
        rbx_14.setText("14:30 - 15:00");
        rbx_14.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_14.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_14.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_14.setRippleColor(new java.awt.Color(3, 111, 198));
        jPanel3.add(rbx_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 140, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 740, 210));

        panel_contenedor.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 770, 330));

        add(panel_contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 740));
    }// </editor-fold>//GEN-END:initComponents
 public void deshabilitar_rbx(  boolean b)
  {
    //jPanel3.setVisible(b);
     rbx_4.setVisible(b);rbx_8.setVisible(b);rbx_12.setVisible(b);
      
  }
    private void txt_buscar_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscar_pacienteActionPerformed

    }//GEN-LAST:event_txt_buscar_pacienteActionPerformed

    private void txt_fname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fname1ActionPerformed

    private void txt_buscar_horariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscar_horariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscar_horariosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_cancelar_cambios1;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_guardar_cita1;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_nueva_cita;
    private javax.swing.ButtonGroup buttonGroup1;
    private LIB.FSGradientPanel fSGradientPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_contenedor;
    private RSMaterialComponent.RSComboBoxMaterial rSComboBoxMaterial1;
    private RSMaterialComponent.RSComboBoxMaterial rSComboBoxMaterial2;
    private rojeru_san.componentes.RSDateChooser rSDateChooser2;
    private rojerusan.RSTableMetro rSTableMetro1;
    private RSMaterialComponent.RSRadioButtonMaterial rbx_1;
    private RSMaterialComponent.RSRadioButtonMaterial rbx_10;
    private RSMaterialComponent.RSRadioButtonMaterial rbx_11;
    private RSMaterialComponent.RSRadioButtonMaterial rbx_12;
    private RSMaterialComponent.RSRadioButtonMaterial rbx_13;
    private RSMaterialComponent.RSRadioButtonMaterial rbx_14;
    private RSMaterialComponent.RSRadioButtonMaterial rbx_2;
    private RSMaterialComponent.RSRadioButtonMaterial rbx_3;
    private RSMaterialComponent.RSRadioButtonMaterial rbx_4;
    private RSMaterialComponent.RSRadioButtonMaterial rbx_5;
    private RSMaterialComponent.RSRadioButtonMaterial rbx_6;
    private RSMaterialComponent.RSRadioButtonMaterial rbx_7;
    private RSMaterialComponent.RSRadioButtonMaterial rbx_8;
    private RSMaterialComponent.RSRadioButtonMaterial rbx_9;
    private RSMaterialComponent.RSButtonMaterialGradientOne txt_buscar_horarios;
    private RSMaterialComponent.RSButtonMaterialGradientOne txt_buscar_paciente;
    private javax.swing.JTextField txt_fname1;
    // End of variables declaration//GEN-END:variables
}
