
package WIN33CLC_VIEW;

import java.awt.Color;


public class frm_UI_03_gestionar_citas extends javax.swing.JPanel {

    public frm_UI_03_gestionar_citas() {
        initComponents();
     
        setBackground(new Color (255,255,255,1));

       
    }
    
        public void ocultar_form_gestion(boolean b)
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        table_citas_vigentes = new rojerusan.RSTableMetro();
        jScrollPane6 = new javax.swing.JScrollPane();
        table_citas_programadas = new rojerusan.RSTableMetro();
        jScrollPane7 = new javax.swing.JScrollPane();
        table_citas_vencidas = new rojerusan.RSTableMetro();
        rSPanelBorderGradient1 = new RSMaterialComponent.RSPanelBorderGradient();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_anular_cita = new newscomponents.RSButtonFlat_new();
        btn_programar_cita = new newscomponents.RSButtonFlat_new();
        btn_eliminar_cita = new newscomponents.RSButtonFlat_new();
        menu_salir2 = new RSMaterialComponent.RSPanelMaterial();
        jLabel2 = new javax.swing.JLabel();
        lbl_numero_cita = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_phone = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_patient = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lbl_correo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_especialista = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_servicio = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbl_hora_cita = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lbl_fecha_cita = new javax.swing.JLabel();
        menu_salir3 = new RSMaterialComponent.RSPanelMaterial();
        jLabel9 = new javax.swing.JLabel();
        rSDateChooser1 = new rojerusan.RSDateChooser();
        btn_horario_disponible = new newscomponents.RSButtonFlat_new();
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

        menu_salir1.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir1.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir1.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir1.setRound(40);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N

        table_citas_vigentes.setForeground(new java.awt.Color(51, 51, 51));
        table_citas_vigentes.setModel(new javax.swing.table.DefaultTableModel(
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
        table_citas_vigentes.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        table_citas_vigentes.setColorFilasForeground1(new java.awt.Color(204, 204, 204));
        table_citas_vigentes.setColorFilasForeground2(new java.awt.Color(204, 204, 204));
        table_citas_vigentes.setFont(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        table_citas_vigentes.setFuenteFilas(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        table_citas_vigentes.setFuenteFilasSelect(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        table_citas_vigentes.setFuenteHead(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        table_citas_vigentes.setGridColor(new java.awt.Color(153, 153, 153));
        table_citas_vigentes.setGrosorBordeFilas(0);
        table_citas_vigentes.setGrosorBordeHead(0);
        table_citas_vigentes.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setViewportView(table_citas_vigentes);

        jTabbedPane1.addTab("CITAS VIGENTES", jScrollPane5);

        table_citas_programadas.setForeground(new java.awt.Color(51, 51, 51));
        table_citas_programadas.setModel(new javax.swing.table.DefaultTableModel(
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
        table_citas_programadas.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        table_citas_programadas.setColorFilasForeground1(new java.awt.Color(204, 204, 204));
        table_citas_programadas.setColorFilasForeground2(new java.awt.Color(204, 204, 204));
        table_citas_programadas.setFont(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        table_citas_programadas.setFuenteFilas(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        table_citas_programadas.setFuenteFilasSelect(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        table_citas_programadas.setFuenteHead(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        table_citas_programadas.setGridColor(new java.awt.Color(153, 153, 153));
        table_citas_programadas.setGrosorBordeFilas(0);
        table_citas_programadas.setGrosorBordeHead(0);
        table_citas_programadas.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane6.setViewportView(table_citas_programadas);

        jTabbedPane1.addTab("CITAS PROGRAMADAS", jScrollPane6);

        table_citas_vencidas.setForeground(new java.awt.Color(51, 51, 51));
        table_citas_vencidas.setModel(new javax.swing.table.DefaultTableModel(
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
        table_citas_vencidas.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        table_citas_vencidas.setColorFilasForeground1(new java.awt.Color(204, 204, 204));
        table_citas_vencidas.setColorFilasForeground2(new java.awt.Color(204, 204, 204));
        table_citas_vencidas.setFont(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        table_citas_vencidas.setFuenteFilas(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        table_citas_vencidas.setFuenteFilasSelect(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        table_citas_vencidas.setFuenteHead(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        table_citas_vencidas.setGridColor(new java.awt.Color(153, 153, 153));
        table_citas_vencidas.setGrosorBordeFilas(0);
        table_citas_vencidas.setGrosorBordeHead(0);
        table_citas_vencidas.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane7.setViewportView(table_citas_vencidas);

        jTabbedPane1.addTab("CITAS VENCIDAS", jScrollPane7);

        javax.swing.GroupLayout menu_salir1Layout = new javax.swing.GroupLayout(menu_salir1);
        menu_salir1.setLayout(menu_salir1Layout);
        menu_salir1Layout.setHorizontalGroup(
            menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        menu_salir1Layout.setVerticalGroup(
            menu_salir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_salir1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        rSPanelBorderGradient1.setBackground(new java.awt.Color(204, 204, 204));
        rSPanelBorderGradient1.setBgShade(new java.awt.Color(255, 255, 255));
        rSPanelBorderGradient1.setColorPrimario(new java.awt.Color(200, 232, 250));
        rSPanelBorderGradient1.setColorSecundario(new java.awt.Color(200, 232, 250));
        rSPanelBorderGradient1.setGradiente(RSMaterialComponent.RSPanelBorderGradient.Gradiente.HORIZONTAL);
        rSPanelBorderGradient1.setRound(40);
        rSPanelBorderGradient1.setWidthBorder(0);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-horas-extras-100 (1).png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Poppins ExtraBold", 0, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("GESTIONAR CITAS");

        btn_anular_cita.setBackground(new java.awt.Color(139, 198, 255));
        btn_anular_cita.setForeground(new java.awt.Color(51, 51, 51));
        btn_anular_cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-calendario-menos-24.png"))); // NOI18N
        btn_anular_cita.setText("Anular Cita");
        btn_anular_cita.setBorderPainted(false);
        btn_anular_cita.setContentAreaFilled(true);
        btn_anular_cita.setCornerRound(45);
        btn_anular_cita.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_anular_cita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anular_citaActionPerformed(evt);
            }
        });

        btn_programar_cita.setBackground(new java.awt.Color(139, 198, 255));
        btn_programar_cita.setForeground(new java.awt.Color(51, 51, 51));
        btn_programar_cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-horas-extras-24.png"))); // NOI18N
        btn_programar_cita.setText("Reprogramar Cita");
        btn_programar_cita.setBorderPainted(false);
        btn_programar_cita.setContentAreaFilled(true);
        btn_programar_cita.setCornerRound(45);
        btn_programar_cita.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_programar_cita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_programar_citaActionPerformed(evt);
            }
        });

        btn_eliminar_cita.setBackground(new java.awt.Color(139, 198, 255));
        btn_eliminar_cita.setForeground(new java.awt.Color(51, 51, 51));
        btn_eliminar_cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/cancelar.png"))); // NOI18N
        btn_eliminar_cita.setText("Eliminar Cita");
        btn_eliminar_cita.setBorderPainted(false);
        btn_eliminar_cita.setContentAreaFilled(true);
        btn_eliminar_cita.setCornerRound(45);
        btn_eliminar_cita.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_eliminar_cita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_citaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rSPanelBorderGradient1Layout = new javax.swing.GroupLayout(rSPanelBorderGradient1);
        rSPanelBorderGradient1.setLayout(rSPanelBorderGradient1Layout);
        rSPanelBorderGradient1Layout.setHorizontalGroup(
            rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelBorderGradient1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelBorderGradient1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(34, 34, 34)))
                .addGap(47, 47, 47))
            .addGroup(rSPanelBorderGradient1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_anular_cita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar_cita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_programar_cita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rSPanelBorderGradient1Layout.setVerticalGroup(
            rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelBorderGradient1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_anular_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_programar_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_eliminar_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );

        menu_salir2.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir2.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir2.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir2.setRound(40);

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Cita Nro:");

        lbl_numero_cita.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lbl_numero_cita.setForeground(new java.awt.Color(255, 0, 51));
        lbl_numero_cita.setText("000000");

        jLabel11.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Teléfono:");

        lbl_phone.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lbl_phone.setForeground(new java.awt.Color(51, 51, 51));
        lbl_phone.setText("000-000-000");

        jLabel8.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Pacitente:");

        lbl_patient.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lbl_patient.setForeground(new java.awt.Color(51, 51, 51));
        lbl_patient.setText("NOMBRES Y APELLIDOS COMPLETOS");

        jLabel18.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Correo electrónico:");

        lbl_correo.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lbl_correo.setForeground(new java.awt.Color(51, 51, 51));
        lbl_correo.setText("USUARIO@DOMINIO.COM");

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Especialista:");

        lbl_especialista.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lbl_especialista.setForeground(new java.awt.Color(51, 51, 51));
        lbl_especialista.setText("NOMBRE Y APELLIDOS COMPLETOS");

        jLabel4.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Servicio");

        lbl_servicio.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lbl_servicio.setForeground(new java.awt.Color(51, 51, 51));
        lbl_servicio.setText("NOMBRE DEL SERVICIO");

        jLabel15.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Cita Hora:");

        lbl_hora_cita.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lbl_hora_cita.setForeground(new java.awt.Color(51, 51, 51));
        lbl_hora_cita.setText("00:00");

        jLabel20.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Fecha Cita:");

        lbl_fecha_cita.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lbl_fecha_cita.setForeground(new java.awt.Color(51, 51, 51));
        lbl_fecha_cita.setText("00/00/0000");

        javax.swing.GroupLayout menu_salir2Layout = new javax.swing.GroupLayout(menu_salir2);
        menu_salir2.setLayout(menu_salir2Layout);
        menu_salir2Layout.setHorizontalGroup(
            menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir2Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(lbl_numero_cita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(lbl_phone, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(lbl_hora_cita, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_especialista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_fecha_cita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menu_salir2Layout.createSequentialGroup()
                        .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_patient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_correo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_servicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        menu_salir2Layout.setVerticalGroup(
            menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_numero_cita)
                    .addComponent(lbl_patient)
                    .addComponent(lbl_correo))
                .addGap(18, 18, 18)
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_phone)
                    .addComponent(lbl_especialista)
                    .addComponent(lbl_servicio))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_hora_cita)
                    .addComponent(lbl_fecha_cita))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        btn_horario_disponible.setBackground(new java.awt.Color(139, 198, 255));
        btn_horario_disponible.setForeground(new java.awt.Color(51, 51, 51));
        btn_horario_disponible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-buscar-en-la-lista-24.png"))); // NOI18N
        btn_horario_disponible.setText("Ver Horario Disponible");
        btn_horario_disponible.setBorderPainted(false);
        btn_horario_disponible.setContentAreaFilled(true);
        btn_horario_disponible.setCornerRound(45);
        btn_horario_disponible.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_horario_disponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_horario_disponibleActionPerformed(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
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
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu_salir3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(rSDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(btn_horario_disponible, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(72, Short.MAX_VALUE))
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
                        .addComponent(btn_horario_disponible, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rSPanelBorderGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu_salir1, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
                    .addComponent(menu_salir2, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
                    .addComponent(menu_salir3, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu_salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_salir2, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_salir3, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(rSPanelBorderGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_anular_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anular_citaActionPerformed

       // TODO add your handling code here:
    }//GEN-LAST:event_btn_anular_citaActionPerformed

    private void btn_programar_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_programar_citaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_programar_citaActionPerformed

    private void btn_eliminar_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_citaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminar_citaActionPerformed

    private void btn_horario_disponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_horario_disponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_horario_disponibleActionPerformed

    private void rSRadioButtonMaterial33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSRadioButtonMaterial33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSRadioButtonMaterial33ActionPerformed

    private void rSRadioButtonMaterial42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSRadioButtonMaterial42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSRadioButtonMaterial42ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btn_anular_cita;
    private newscomponents.RSButtonFlat_new btn_eliminar_cita;
    private newscomponents.RSButtonFlat_new btn_horario_disponible;
    private newscomponents.RSButtonFlat_new btn_programar_cita;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_correo;
    private javax.swing.JLabel lbl_especialista;
    private javax.swing.JLabel lbl_fecha_cita;
    private javax.swing.JLabel lbl_hora_cita;
    private javax.swing.JLabel lbl_numero_cita;
    private javax.swing.JLabel lbl_patient;
    private javax.swing.JLabel lbl_phone;
    private javax.swing.JLabel lbl_servicio;
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
    private rojerusan.RSTableMetro table_citas_programadas;
    private rojerusan.RSTableMetro table_citas_vencidas;
    private rojerusan.RSTableMetro table_citas_vigentes;
    // End of variables declaration//GEN-END:variables
}
