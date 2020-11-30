
package WIN33CLC_VIEW;

import java.awt.Color;


public class frm_UI_03_gestionar_citas extends javax.swing.JPanel {

    public frm_UI_03_gestionar_citas() {
        initComponents();
     
        setBackground(new Color (255,255,255,1));
        btn_nuevo_paciente.setBackground(new Color (41,177,255,0));
        
        btn_guardar_paciente.setBackground(new Color (41,177,255,0));
        btn_cancelar_cambios.setBackground(new Color (41,177,255,0));
       
    }
    
        public void ocultar_form_gestion(boolean b)
    {
    menu_salir1.setVisible(b);
    menu_salir2.setVisible(b);
            menu_salir4.setVisible(b);
            rSPanelBorderGradient1.setVisible(b);
            
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel14 = new javax.swing.JLabel();
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
        btn_nuevo_paciente = new newscomponents.RSButtonFlat_new();
        btn_guardar_paciente = new newscomponents.RSButtonFlat_new();
        btn_cancelar_cambios = new newscomponents.RSButtonFlat_new();
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
        menu_salir4 = new RSMaterialComponent.RSPanelMaterial();
        jLabel10 = new javax.swing.JLabel();
        rSDateChooser2 = new rojerusan.RSDateChooser();
        btn_horario_disponible1 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        rSRadioButtonMaterial15 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial16 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial17 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial18 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial19 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial20 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial21 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial22 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial23 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial24 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial25 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial26 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial27 = new RSMaterialComponent.RSRadioButtonMaterial();
        rSRadioButtonMaterial28 = new RSMaterialComponent.RSRadioButtonMaterial();

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("FECHA DE LA CITA:");

        menu_salir1.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir1.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir1.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir1.setRound(40);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N

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
        table_citas_vigentes.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        table_citas_vigentes.setFuenteFilas(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        table_citas_vigentes.setFuenteFilasSelect(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        table_citas_vigentes.setFuenteHead(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
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
        table_citas_programadas.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        table_citas_programadas.setFuenteFilas(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        table_citas_programadas.setFuenteFilasSelect(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        table_citas_programadas.setFuenteHead(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
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
        table_citas_vencidas.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        table_citas_vencidas.setFuenteFilas(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        table_citas_vencidas.setFuenteFilasSelect(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        table_citas_vencidas.setFuenteHead(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
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
        rSPanelBorderGradient1.setColorPrimario(new java.awt.Color(41, 177, 255));
        rSPanelBorderGradient1.setColorSecundario(new java.awt.Color(41, 177, 255));
        rSPanelBorderGradient1.setGradiente(RSMaterialComponent.RSPanelBorderGradient.Gradiente.HORIZONTAL);
        rSPanelBorderGradient1.setRound(40);
        rSPanelBorderGradient1.setWidthBorder(0);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-horas-extras-100 (1).png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("GESTIONAR CITAS");

        btn_nuevo_paciente.setBackground(new java.awt.Color(0, 160, 253));
        btn_nuevo_paciente.setForeground(new java.awt.Color(51, 51, 51));
        btn_nuevo_paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-añadir-usuario-masculino-24.png"))); // NOI18N
        btn_nuevo_paciente.setText("Anular Cita");
        btn_nuevo_paciente.setBorderPainted(false);
        btn_nuevo_paciente.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N

        btn_guardar_paciente.setBackground(new java.awt.Color(0, 160, 253));
        btn_guardar_paciente.setForeground(new java.awt.Color(51, 51, 51));
        btn_guardar_paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-guardar-24.png"))); // NOI18N
        btn_guardar_paciente.setText("Programar Cita");
        btn_guardar_paciente.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N

        btn_cancelar_cambios.setBackground(new java.awt.Color(0, 160, 253));
        btn_cancelar_cambios.setForeground(new java.awt.Color(51, 51, 51));
        btn_cancelar_cambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-cancelar-24.png"))); // NOI18N
        btn_cancelar_cambios.setText("Eliminar Cita");
        btn_cancelar_cambios.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N

        javax.swing.GroupLayout rSPanelBorderGradient1Layout = new javax.swing.GroupLayout(rSPanelBorderGradient1);
        rSPanelBorderGradient1.setLayout(rSPanelBorderGradient1Layout);
        rSPanelBorderGradient1Layout.setHorizontalGroup(
            rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelBorderGradient1Layout.createSequentialGroup()
                .addGroup(rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelBorderGradient1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelBorderGradient1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(34, 34, 34)))
                        .addGap(16, 16, 16))
                    .addGroup(rSPanelBorderGradient1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_cancelar_cambios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_guardar_paciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_nuevo_paciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(31, 31, 31))
        );
        rSPanelBorderGradient1Layout.setVerticalGroup(
            rSPanelBorderGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelBorderGradient1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_nuevo_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btn_guardar_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btn_cancelar_cambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu_salir2.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir2.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir2.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir2.setRound(40);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("CITA NRO:");

        lbl_numero_cita.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        lbl_numero_cita.setForeground(new java.awt.Color(255, 0, 51));
        lbl_numero_cita.setText("000000");

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("TELÉFONO:");

        lbl_phone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_phone.setForeground(new java.awt.Color(51, 51, 51));
        lbl_phone.setText("000-000-000");

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("PACIENTE:");

        lbl_patient.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_patient.setForeground(new java.awt.Color(51, 51, 51));
        lbl_patient.setText("NOMBRES Y APELLIDOS COMPLETOS");

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("CORREO ELECTRÓNICO");

        lbl_correo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_correo.setForeground(new java.awt.Color(51, 51, 51));
        lbl_correo.setText("USUARIO@DOMINIO.COM");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("ESPECIALISTA:");

        lbl_especialista.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_especialista.setForeground(new java.awt.Color(51, 51, 51));
        lbl_especialista.setText("NOMBRE Y APELLIDOS COMPLETOS");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("SERVICIO");

        lbl_servicio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_servicio.setForeground(new java.awt.Color(51, 51, 51));
        lbl_servicio.setText("NOMBRE DEL SERVICIO");

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("CITA HORA:");

        lbl_hora_cita.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_hora_cita.setForeground(new java.awt.Color(51, 51, 51));
        lbl_hora_cita.setText("00:00");

        jLabel20.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("FECHA DE LA CITA:");

        lbl_fecha_cita.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_fecha_cita.setForeground(new java.awt.Color(51, 51, 51));
        lbl_fecha_cita.setText("00/00/0000");

        javax.swing.GroupLayout menu_salir2Layout = new javax.swing.GroupLayout(menu_salir2);
        menu_salir2.setLayout(menu_salir2Layout);
        menu_salir2Layout.setHorizontalGroup(
            menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir2Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(lbl_numero_cita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(lbl_phone, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(lbl_hora_cita, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_especialista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_fecha_cita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menu_salir2Layout.createSequentialGroup()
                        .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_patient, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_correo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_servicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(58, Short.MAX_VALUE))
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

        menu_salir4.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir4.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir4.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir4.setRound(40);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("FECHA DE LA CITA:");

        rSDateChooser2.setColorBackground(new java.awt.Color(23, 144, 244));
        rSDateChooser2.setColorButtonHover(new java.awt.Color(23, 144, 244));
        rSDateChooser2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rSDateChooser2.setFormatoFecha("dd/MM/yyyy");
        rSDateChooser2.setFuente(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btn_horario_disponible1.setForeground(new java.awt.Color(51, 51, 51));
        btn_horario_disponible1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-buscar-en-la-lista-24.png"))); // NOI18N
        btn_horario_disponible1.setText("Ver horario disponible");
        btn_horario_disponible1.setBorderPainted(false);
        btn_horario_disponible1.setColorPrimario(new java.awt.Color(41, 177, 255));
        btn_horario_disponible1.setColorPrimarioHover(new java.awt.Color(41, 177, 255));
        btn_horario_disponible1.setColorSecundario(new java.awt.Color(41, 177, 255));
        btn_horario_disponible1.setColorSecundarioHover(new java.awt.Color(41, 177, 255));
        btn_horario_disponible1.setFocusPainted(false);
        btn_horario_disponible1.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N

        rSRadioButtonMaterial15.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial15.setText("8:00 - 8:30");
        rSRadioButtonMaterial15.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial15.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial15.setFocusPainted(false);
        rSRadioButtonMaterial15.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rSRadioButtonMaterial15.setRippleColor(new java.awt.Color(0, 112, 192));

        rSRadioButtonMaterial16.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial16.setText("8:30 - 9:00");
        rSRadioButtonMaterial16.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial16.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial16.setFocusPainted(false);
        rSRadioButtonMaterial16.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rSRadioButtonMaterial16.setRippleColor(new java.awt.Color(0, 112, 192));

        rSRadioButtonMaterial17.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial17.setText("9:00 - 9:30");
        rSRadioButtonMaterial17.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial17.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial17.setFocusPainted(false);
        rSRadioButtonMaterial17.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rSRadioButtonMaterial17.setRippleColor(new java.awt.Color(0, 112, 192));

        rSRadioButtonMaterial18.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial18.setText("9:30 - 10:00");
        rSRadioButtonMaterial18.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial18.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial18.setFocusPainted(false);
        rSRadioButtonMaterial18.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rSRadioButtonMaterial18.setRippleColor(new java.awt.Color(0, 112, 192));

        rSRadioButtonMaterial19.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial19.setText("10:00 - 10:30");
        rSRadioButtonMaterial19.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial19.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial19.setFocusPainted(false);
        rSRadioButtonMaterial19.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rSRadioButtonMaterial19.setRippleColor(new java.awt.Color(0, 112, 192));

        rSRadioButtonMaterial20.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial20.setText("10:30 - 11:00");
        rSRadioButtonMaterial20.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial20.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial20.setFocusPainted(false);
        rSRadioButtonMaterial20.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rSRadioButtonMaterial20.setRippleColor(new java.awt.Color(0, 112, 192));

        rSRadioButtonMaterial21.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial21.setText("11:00 - 11:30");
        rSRadioButtonMaterial21.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial21.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial21.setFocusPainted(false);
        rSRadioButtonMaterial21.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rSRadioButtonMaterial21.setRippleColor(new java.awt.Color(0, 112, 192));

        rSRadioButtonMaterial22.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial22.setText("11:30 - 12:00");
        rSRadioButtonMaterial22.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial22.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial22.setFocusPainted(false);
        rSRadioButtonMaterial22.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rSRadioButtonMaterial22.setRippleColor(new java.awt.Color(0, 112, 192));

        rSRadioButtonMaterial23.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial23.setText("12:00 - 12:30");
        rSRadioButtonMaterial23.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial23.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial23.setFocusPainted(false);
        rSRadioButtonMaterial23.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rSRadioButtonMaterial23.setRippleColor(new java.awt.Color(0, 112, 192));

        rSRadioButtonMaterial24.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial24.setText("12:30 - 13:00");
        rSRadioButtonMaterial24.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial24.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial24.setFocusPainted(false);
        rSRadioButtonMaterial24.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rSRadioButtonMaterial24.setRippleColor(new java.awt.Color(0, 112, 192));

        rSRadioButtonMaterial25.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial25.setText("13:00 - 13:30");
        rSRadioButtonMaterial25.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial25.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial25.setFocusPainted(false);
        rSRadioButtonMaterial25.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rSRadioButtonMaterial25.setRippleColor(new java.awt.Color(0, 112, 192));

        rSRadioButtonMaterial26.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial26.setText("13:30 - 14:00");
        rSRadioButtonMaterial26.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial26.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial26.setFocusPainted(false);
        rSRadioButtonMaterial26.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rSRadioButtonMaterial26.setRippleColor(new java.awt.Color(0, 112, 192));

        rSRadioButtonMaterial27.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial27.setText("14:00 - 14:30");
        rSRadioButtonMaterial27.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial27.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial27.setFocusPainted(false);
        rSRadioButtonMaterial27.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rSRadioButtonMaterial27.setRippleColor(new java.awt.Color(0, 112, 192));

        rSRadioButtonMaterial28.setForeground(new java.awt.Color(51, 51, 51));
        rSRadioButtonMaterial28.setText("14:30 - 15:00");
        rSRadioButtonMaterial28.setColorCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial28.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSRadioButtonMaterial28.setFocusPainted(false);
        rSRadioButtonMaterial28.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        rSRadioButtonMaterial28.setRippleColor(new java.awt.Color(0, 112, 192));

        javax.swing.GroupLayout menu_salir4Layout = new javax.swing.GroupLayout(menu_salir4);
        menu_salir4.setLayout(menu_salir4Layout);
        menu_salir4Layout.setHorizontalGroup(
            menu_salir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menu_salir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(menu_salir4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(menu_salir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rSRadioButtonMaterial23, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(rSRadioButtonMaterial19, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(rSRadioButtonMaterial27, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(rSRadioButtonMaterial15, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menu_salir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu_salir4Layout.createSequentialGroup()
                        .addComponent(rSDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(59, 59, 59)
                        .addComponent(btn_horario_disponible1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(menu_salir4Layout.createSequentialGroup()
                        .addGroup(menu_salir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rSRadioButtonMaterial20, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(rSRadioButtonMaterial24, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(rSRadioButtonMaterial16, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(rSRadioButtonMaterial28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(menu_salir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rSRadioButtonMaterial17, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(rSRadioButtonMaterial21, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(rSRadioButtonMaterial25, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(menu_salir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rSRadioButtonMaterial22, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(rSRadioButtonMaterial18, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(rSRadioButtonMaterial26, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        menu_salir4Layout.setVerticalGroup(
            menu_salir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir4Layout.createSequentialGroup()
                .addGroup(menu_salir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu_salir4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(menu_salir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_horario_disponible1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(menu_salir4Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addGroup(menu_salir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSRadioButtonMaterial15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSRadioButtonMaterial16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSRadioButtonMaterial17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSRadioButtonMaterial18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(menu_salir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSRadioButtonMaterial19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSRadioButtonMaterial20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSRadioButtonMaterial21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSRadioButtonMaterial22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(menu_salir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSRadioButtonMaterial23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSRadioButtonMaterial24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSRadioButtonMaterial25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSRadioButtonMaterial26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(menu_salir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSRadioButtonMaterial27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSRadioButtonMaterial28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
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
                    .addComponent(menu_salir4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu_salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_salir2, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_salir4, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addComponent(rSPanelBorderGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btn_cancelar_cambios;
    private newscomponents.RSButtonFlat_new btn_guardar_paciente;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_horario_disponible1;
    private newscomponents.RSButtonFlat_new btn_nuevo_paciente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
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
    private RSMaterialComponent.RSPanelMaterial menu_salir4;
    private rojerusan.RSDateChooser rSDateChooser2;
    private RSMaterialComponent.RSPanelBorderGradient rSPanelBorderGradient1;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial15;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial16;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial17;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial18;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial19;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial20;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial21;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial22;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial23;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial24;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial25;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial26;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial27;
    private RSMaterialComponent.RSRadioButtonMaterial rSRadioButtonMaterial28;
    private rojerusan.RSTableMetro table_citas_programadas;
    private rojerusan.RSTableMetro table_citas_vencidas;
    private rojerusan.RSTableMetro table_citas_vigentes;
    // End of variables declaration//GEN-END:variables
}
