
package WIN33CLC_VIEW;

import java.awt.Color;


public class frm_UI_03_gestionar_cita extends javax.swing.JPanel {

    public frm_UI_03_gestionar_cita() {
        initComponents();
    setBackground(new Color (255,255,255,0));
      p1.setColorPrimario(new Color (255,255,255,200));
     p1.setColorSecundario(new Color (255,255,255,200));

    }
    
     public void ocultar_form_cita(boolean b)
    {

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        p1 = new RSMaterialComponent.RSPanelBorderGradient();
        jLabel12 = new javax.swing.JLabel();
        btn_anular_cita = new newscomponents.RSButtonFlat_new();
        btn_reprogramar_cita = new newscomponents.RSButtonFlat_new();
        btn_eliminar_cita = new newscomponents.RSButtonFlat_new();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        p2 = new RSMaterialComponent.RSPanelMaterial();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        table_citas_vigentes = new rojerusan.RSTableMetro();
        jScrollPane6 = new javax.swing.JScrollPane();
        table_citas_programadas = new rojerusan.RSTableMetro();
        jScrollPane7 = new javax.swing.JScrollPane();
        table_citas_vencidas = new rojerusan.RSTableMetro();
        p3 = new RSMaterialComponent.RSPanelMaterial();
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
        jLabel6 = new javax.swing.JLabel();
        lbl_servicio = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbl_hora_cita = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lbl_fecha_cita = new javax.swing.JLabel();

        p1.setBackground(new java.awt.Color(204, 204, 204));
        p1.setBgShade(new java.awt.Color(255, 255, 255));
        p1.setColorPrimario(new java.awt.Color(200, 232, 250));
        p1.setColorSecundario(new java.awt.Color(200, 232, 250));
        p1.setGradiente(RSMaterialComponent.RSPanelBorderGradient.Gradiente.HORIZONTAL);
        p1.setRound(40);
        p1.setWidthBorder(0);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-calendario-100 (1).png"))); // NOI18N

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

        btn_reprogramar_cita.setBackground(new java.awt.Color(139, 198, 255));
        btn_reprogramar_cita.setForeground(new java.awt.Color(51, 51, 51));
        btn_reprogramar_cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-horas-extras-24.png"))); // NOI18N
        btn_reprogramar_cita.setText("Reprogramar Cita");
        btn_reprogramar_cita.setBorderPainted(false);
        btn_reprogramar_cita.setContentAreaFilled(true);
        btn_reprogramar_cita.setCornerRound(45);
        btn_reprogramar_cita.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_reprogramar_cita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reprogramar_citaActionPerformed(evt);
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

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 42)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText(" Gestionar");

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 42)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("    Citas");

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(p1Layout.createSequentialGroup()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_eliminar_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btn_reprogramar_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btn_anular_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(btn_anular_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btn_reprogramar_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_eliminar_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p2.setBackground(new java.awt.Color(255, 255, 255));
        p2.setBgShade(new java.awt.Color(204, 204, 204));
        p2.setPixels(0);
        p2.setPreferredSize(new java.awt.Dimension(90, 62));
        p2.setRound(40);

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

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addGap(18, 18, 18))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        p3.setBackground(new java.awt.Color(255, 255, 255));
        p3.setBgShade(new java.awt.Color(204, 204, 204));
        p3.setPixels(0);
        p3.setPreferredSize(new java.awt.Dimension(90, 62));
        p3.setRound(40);

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

        jLabel6.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Servicio");

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

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_numero_cita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_phone, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(lbl_hora_cita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_especialista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_fecha_cita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, p3Layout.createSequentialGroup()
                        .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_patient, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_correo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_servicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_numero_cita)
                    .addComponent(lbl_patient)
                    .addComponent(lbl_correo))
                .addGap(18, 18, 18)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_phone)
                    .addComponent(lbl_especialista)
                    .addComponent(lbl_servicio))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_hora_cita)
                    .addComponent(lbl_fecha_cita))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                    .addComponent(p3, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p3, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                .addGap(294, 294, 294))
            .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_eliminar_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_citaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminar_citaActionPerformed

    private void btn_reprogramar_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reprogramar_citaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reprogramar_citaActionPerformed

    private void btn_anular_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anular_citaActionPerformed

        btn_reprogramar_cita.setEnabled(true);
        btn_eliminar_cita.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_anular_citaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btn_anular_cita;
    private newscomponents.RSButtonFlat_new btn_eliminar_cita;
    private newscomponents.RSButtonFlat_new btn_reprogramar_cita;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
    private RSMaterialComponent.RSPanelBorderGradient p1;
    private RSMaterialComponent.RSPanelMaterial p2;
    private RSMaterialComponent.RSPanelMaterial p3;
    private rojerusan.RSTableMetro table_citas_programadas;
    private rojerusan.RSTableMetro table_citas_vencidas;
    private rojerusan.RSTableMetro table_citas_vigentes;
    // End of variables declaration//GEN-END:variables
}
