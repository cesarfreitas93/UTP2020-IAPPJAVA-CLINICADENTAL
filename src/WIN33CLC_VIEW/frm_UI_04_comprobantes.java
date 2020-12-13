
package WIN33CLC_VIEW;

import java.awt.Color;


public class frm_UI_04_comprobantes extends javax.swing.JPanel {

    public frm_UI_04_comprobantes() {
        initComponents();
     
        setBackground(new Color (255,255,255,1));
      p1.setColorPrimario(new Color (255,255,255,200));
     p1.setColorSecundario(new Color (255,255,255,200));
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        menu_salir3 = new RSMaterialComponent.RSPanelMaterial();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePatients = new rojerusan.RSTableMetro();
        jLabel18 = new javax.swing.JLabel();
        p1 = new RSMaterialComponent.RSPanelBorderGradient();
        jLabel12 = new javax.swing.JLabel();
        btn_nuevo_comprobante = new newscomponents.RSButtonFlat_new();
        btn_pagar_comprobante = new newscomponents.RSButtonFlat_new();
        btn_imprimir_comprobante = new newscomponents.RSButtonFlat_new();
        btn_cancelar_cambios = new newscomponents.RSButtonFlat_new();
        jLabel3 = new javax.swing.JLabel();
        menu_salir2 = new RSMaterialComponent.RSPanelMaterial();
        rSCheckBoxMaterial1 = new RSMaterialComponent.RSCheckBoxMaterial();
        rSCheckBoxMaterial2 = new RSMaterialComponent.RSCheckBoxMaterial();
        menu_salir4 = new RSMaterialComponent.RSPanelMaterial();
        txt_dni = new rscomponentshade.RSFormatFieldShade();
        btn_buscar_reniec = new newscomponents.RSButtonFlat_new();
        menu_salir5 = new RSMaterialComponent.RSPanelMaterial();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbl_patient = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_dni1 = new rscomponentshade.RSFormatFieldShade();
        jLabel2 = new javax.swing.JLabel();
        menu_salir6 = new RSMaterialComponent.RSPanelMaterial();
        jLabel19 = new javax.swing.JLabel();
        lbl_total_pago = new javax.swing.JLabel();

        menu_salir3.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir3.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir3.setPixels(0);
        menu_salir3.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir3.setRound(40);

        tablePatients.setForeground(new java.awt.Color(74, 74, 74));
        tablePatients.setModel(new javax.swing.table.DefaultTableModel(
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
        tablePatients.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablePatients.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        tablePatients.setColorFilasForeground2(new java.awt.Color(74, 74, 74));
        tablePatients.setFont(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        tablePatients.setFuenteFilas(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        tablePatients.setFuenteFilasSelect(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        tablePatients.setFuenteHead(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        tablePatients.setGridColor(new java.awt.Color(153, 153, 153));
        tablePatients.setGrosorBordeFilas(0);
        tablePatients.setGrosorBordeHead(0);
        tablePatients.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tablePatients);

        jLabel18.setFont(new java.awt.Font("Poppins ExtraBold", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Listado de Citas del Paciente");

        javax.swing.GroupLayout menu_salir3Layout = new javax.swing.GroupLayout(menu_salir3);
        menu_salir3.setLayout(menu_salir3Layout);
        menu_salir3Layout.setHorizontalGroup(
            menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(menu_salir3Layout.createSequentialGroup()
                .addContainerGap(210, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        menu_salir3Layout.setVerticalGroup(
            menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_salir3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        p1.setBackground(new java.awt.Color(204, 204, 204));
        p1.setBgShade(new java.awt.Color(255, 255, 255));
        p1.setColorPrimario(new java.awt.Color(200, 232, 250));
        p1.setColorSecundario(new java.awt.Color(200, 232, 250));
        p1.setGradiente(RSMaterialComponent.RSPanelBorderGradient.Gradiente.HORIZONTAL);
        p1.setRound(40);
        p1.setWidthBorder(0);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-factura-100.png"))); // NOI18N

        btn_nuevo_comprobante.setBackground(new java.awt.Color(139, 198, 255));
        btn_nuevo_comprobante.setForeground(new java.awt.Color(51, 51, 51));
        btn_nuevo_comprobante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-agregar-recibo-24.png"))); // NOI18N
        btn_nuevo_comprobante.setText("Nuevo Comprobante");
        btn_nuevo_comprobante.setBorderPainted(false);
        btn_nuevo_comprobante.setContentAreaFilled(true);
        btn_nuevo_comprobante.setCornerRound(45);
        btn_nuevo_comprobante.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_nuevo_comprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevo_comprobanteActionPerformed(evt);
            }
        });

        btn_pagar_comprobante.setBackground(new java.awt.Color(139, 198, 255));
        btn_pagar_comprobante.setForeground(new java.awt.Color(51, 51, 51));
        btn_pagar_comprobante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-pagado-24.png"))); // NOI18N
        btn_pagar_comprobante.setText("Pagar Comprobante");
        btn_pagar_comprobante.setBorderPainted(false);
        btn_pagar_comprobante.setContentAreaFilled(true);
        btn_pagar_comprobante.setCornerRound(45);
        btn_pagar_comprobante.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_pagar_comprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pagar_comprobanteActionPerformed(evt);
            }
        });

        btn_imprimir_comprobante.setBackground(new java.awt.Color(139, 198, 255));
        btn_imprimir_comprobante.setForeground(new java.awt.Color(51, 51, 51));
        btn_imprimir_comprobante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-imprimir-24.png"))); // NOI18N
        btn_imprimir_comprobante.setText("Imprimir Comprobante");
        btn_imprimir_comprobante.setBorderPainted(false);
        btn_imprimir_comprobante.setContentAreaFilled(true);
        btn_imprimir_comprobante.setCornerRound(45);
        btn_imprimir_comprobante.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_imprimir_comprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimir_comprobanteActionPerformed(evt);
            }
        });

        btn_cancelar_cambios.setBackground(new java.awt.Color(139, 198, 255));
        btn_cancelar_cambios.setForeground(new java.awt.Color(51, 51, 51));
        btn_cancelar_cambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/cancelar.png"))); // NOI18N
        btn_cancelar_cambios.setText("Cancelar cambios");
        btn_cancelar_cambios.setBorderPainted(false);
        btn_cancelar_cambios.setContentAreaFilled(true);
        btn_cancelar_cambios.setCornerRound(45);
        btn_cancelar_cambios.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_cancelar_cambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_cambiosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Comprobantes");

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(81, 81, 81))
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_cancelar_cambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_nuevo_comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_imprimir_comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pagar_comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addContainerGap())
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138)
                .addComponent(btn_nuevo_comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_pagar_comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_imprimir_comprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_cancelar_cambios, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        menu_salir2.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir2.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir2.setPixels(0);
        menu_salir2.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir2.setRound(40);

        buttonGroup1.add(rSCheckBoxMaterial1);
        rSCheckBoxMaterial1.setForeground(new java.awt.Color(51, 51, 51));
        rSCheckBoxMaterial1.setText("Boleta");
        rSCheckBoxMaterial1.setColorCheck(new java.awt.Color(0, 112, 192));
        rSCheckBoxMaterial1.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSCheckBoxMaterial1.setFocusPainted(false);
        rSCheckBoxMaterial1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        buttonGroup1.add(rSCheckBoxMaterial2);
        rSCheckBoxMaterial2.setForeground(new java.awt.Color(51, 51, 51));
        rSCheckBoxMaterial2.setText("Factura");
        rSCheckBoxMaterial2.setColorCheck(new java.awt.Color(0, 112, 192));
        rSCheckBoxMaterial2.setColorUnCheck(new java.awt.Color(0, 112, 192));
        rSCheckBoxMaterial2.setFocusPainted(false);
        rSCheckBoxMaterial2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        javax.swing.GroupLayout menu_salir2Layout = new javax.swing.GroupLayout(menu_salir2);
        menu_salir2.setLayout(menu_salir2Layout);
        menu_salir2Layout.setHorizontalGroup(
            menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(rSCheckBoxMaterial1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addGap(18, 27, Short.MAX_VALUE)
                .addComponent(rSCheckBoxMaterial2, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        menu_salir2Layout.setVerticalGroup(
            menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSCheckBoxMaterial1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSCheckBoxMaterial2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        menu_salir4.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir4.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir4.setPixels(0);
        menu_salir4.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir4.setRound(40);

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

        btn_buscar_reniec.setBackground(new java.awt.Color(139, 198, 255));
        btn_buscar_reniec.setForeground(new java.awt.Color(51, 51, 51));
        btn_buscar_reniec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-encuentra-hombre-usuario-24.png"))); // NOI18N
        btn_buscar_reniec.setText("Buscar Paciente");
        btn_buscar_reniec.setBorderPainted(false);
        btn_buscar_reniec.setContentAreaFilled(true);
        btn_buscar_reniec.setCornerRound(45);
        btn_buscar_reniec.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_buscar_reniec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_reniecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu_salir4Layout = new javax.swing.GroupLayout(menu_salir4);
        menu_salir4.setLayout(menu_salir4Layout);
        menu_salir4Layout.setHorizontalGroup(
            menu_salir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_salir4Layout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addComponent(btn_buscar_reniec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(menu_salir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menu_salir4Layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(txt_dni, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addGap(255, 255, 255)))
        );
        menu_salir4Layout.setVerticalGroup(
            menu_salir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btn_buscar_reniec, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(menu_salir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menu_salir4Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(25, Short.MAX_VALUE)))
        );

        menu_salir5.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir5.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir5.setPixels(0);
        menu_salir5.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir5.setRound(40);

        jLabel10.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Comprobante Nro:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jLabel11.setText("0000000");

        jLabel13.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Paciente:");

        lbl_patient.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lbl_patient.setForeground(new java.awt.Color(51, 51, 51));
        lbl_patient.setText("NOMBRES Y APELLIDOS COMPLETOS");

        jLabel14.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Fecha emisión:");

        jLabel15.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("DD/MM/AA");

        jLabel17.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Ruc Nro:");

        txt_dni1.setBackground(new java.awt.Color(246, 247, 251));
        txt_dni1.setBgShade(new java.awt.Color(255, 255, 255));
        txt_dni1.setBgShadeHover(new java.awt.Color(204, 204, 204));
        txt_dni1.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_dni1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_dni1.setDoubleBuffered(true);
        txt_dni1.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txt_dni1.setIntensity(0);
        txt_dni1.setPhColor(new java.awt.Color(255, 255, 255));
        txt_dni1.setPixels(0);
        txt_dni1.setPlaceholder("");
        txt_dni1.setRound(40);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("dwadawdwad");

        javax.swing.GroupLayout menu_salir5Layout = new javax.swing.GroupLayout(menu_salir5);
        menu_salir5.setLayout(menu_salir5Layout);
        menu_salir5Layout.setHorizontalGroup(
            menu_salir5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir5Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(menu_salir5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_patient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(menu_salir5Layout.createSequentialGroup()
                        .addGroup(menu_salir5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(menu_salir5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(menu_salir5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu_salir5Layout.createSequentialGroup()
                        .addGroup(menu_salir5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_dni1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        menu_salir5Layout.setVerticalGroup(
            menu_salir5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(menu_salir5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(27, 27, 27)
                .addGroup(menu_salir5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel17)
                    .addComponent(jLabel2))
                .addGap(2, 2, 2)
                .addGroup(menu_salir5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_patient)
                    .addComponent(txt_dni1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        menu_salir6.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir6.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir6.setPixels(0);
        menu_salir6.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir6.setRound(40);

        jLabel19.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Total a Pagar");

        lbl_total_pago.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        lbl_total_pago.setForeground(new java.awt.Color(51, 51, 51));
        lbl_total_pago.setText("S/.000000");

        javax.swing.GroupLayout menu_salir6Layout = new javax.swing.GroupLayout(menu_salir6);
        menu_salir6.setLayout(menu_salir6Layout);
        menu_salir6Layout.setHorizontalGroup(
            menu_salir6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_salir6Layout.createSequentialGroup()
                .addContainerGap(314, Short.MAX_VALUE)
                .addGroup(menu_salir6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_total_pago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(313, Short.MAX_VALUE))
        );
        menu_salir6Layout.setVerticalGroup(
            menu_salir6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir6Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(lbl_total_pago)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu_salir3, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(menu_salir2, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(menu_salir4, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE))
                    .addComponent(menu_salir5, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                    .addComponent(menu_salir6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu_salir2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu_salir4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_salir5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_salir3, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_salir6, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
            .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nuevo_comprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevo_comprobanteActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevo_comprobanteActionPerformed

    private void btn_pagar_comprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pagar_comprobanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pagar_comprobanteActionPerformed

    private void btn_imprimir_comprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimir_comprobanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_imprimir_comprobanteActionPerformed

    private void btn_cancelar_cambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_cambiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelar_cambiosActionPerformed

    private void btn_buscar_reniecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_reniecActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscar_reniecActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btn_buscar_reniec;
    private newscomponents.RSButtonFlat_new btn_cancelar_cambios;
    private newscomponents.RSButtonFlat_new btn_imprimir_comprobante;
    private newscomponents.RSButtonFlat_new btn_nuevo_comprobante;
    private newscomponents.RSButtonFlat_new btn_pagar_comprobante;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_patient;
    private javax.swing.JLabel lbl_total_pago;
    private RSMaterialComponent.RSPanelMaterial menu_salir2;
    private RSMaterialComponent.RSPanelMaterial menu_salir3;
    private RSMaterialComponent.RSPanelMaterial menu_salir4;
    private RSMaterialComponent.RSPanelMaterial menu_salir5;
    private RSMaterialComponent.RSPanelMaterial menu_salir6;
    private RSMaterialComponent.RSPanelBorderGradient p1;
    private RSMaterialComponent.RSCheckBoxMaterial rSCheckBoxMaterial1;
    private RSMaterialComponent.RSCheckBoxMaterial rSCheckBoxMaterial2;
    private rojerusan.RSTableMetro tablePatients;
    private rscomponentshade.RSFormatFieldShade txt_dni;
    private rscomponentshade.RSFormatFieldShade txt_dni1;
    // End of variables declaration//GEN-END:variables
}
