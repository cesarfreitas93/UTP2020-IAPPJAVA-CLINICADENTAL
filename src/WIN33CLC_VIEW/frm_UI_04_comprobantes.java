package WIN33CLC_VIEW;

import WIN30CLC_DAO.DaoException;
import WIN31CLC_DTO.CitasPatient;
import WIN31CLC_DTO.Comprobante;
import WIN31CLC_DTO.Patient;
import WIN32CLC_CTR.CTR_02_Patient;
import WIN32CLC_CTR.CTR_08_Comprobante;
import WIN35CLC_REPORTS.CLASS.Rpt_Comprobante;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import rojerusan.RSNotifyFade;
import rojerusan.RSTableMetro;

public class frm_UI_04_comprobantes extends javax.swing.JPanel {

    CTR_08_Comprobante cTR_08_Comprobante;
    public List<CitasPatient> lista_citas = new ArrayList();
    public Patient  patient;
    public Comprobante comprobante;
    public String tipocomprobante;
    public frm_UI_04_comprobantes() {
        initComponents();

        setBackground(new Color(255, 255, 255, 1));
        p1.setColorPrimario(new Color(255, 255, 255, 200));
        p1.setColorSecundario(new Color(255, 255, 255, 200));

        Load();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        menu_salir3 = new RSMaterialComponent.RSPanelMaterial();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablecitas = new rojerusan.RSTableMetro();
        jLabel18 = new javax.swing.JLabel();
        p1 = new RSMaterialComponent.RSPanelBorderGradient();
        jLabel12 = new javax.swing.JLabel();
        btn_nuevo_comprobante = new newscomponents.RSButtonFlat_new();
        btn_pagar_comprobante = new newscomponents.RSButtonFlat_new();
        btn_imprimir_comprobante = new newscomponents.RSButtonFlat_new();
        btn_cancelar_cambios = new newscomponents.RSButtonFlat_new();
        jLabel3 = new javax.swing.JLabel();
        menu_salir2 = new RSMaterialComponent.RSPanelMaterial();
        chk_boleta = new RSMaterialComponent.RSCheckBoxMaterial();
        chk_factura = new RSMaterialComponent.RSCheckBoxMaterial();
        menu_salir4 = new RSMaterialComponent.RSPanelMaterial();
        txt_dni = new rscomponentshade.RSFormatFieldShade();
        btn_buscar_reniec = new newscomponents.RSButtonFlat_new();
        menu_salir5 = new RSMaterialComponent.RSPanelMaterial();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbl_patient = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbl_fechaemision = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_ruc = new rscomponentshade.RSFormatFieldShade();
        jLabel2 = new javax.swing.JLabel();
        menu_salir6 = new RSMaterialComponent.RSPanelMaterial();
        jLabel19 = new javax.swing.JLabel();
        lbl_total_pago = new javax.swing.JLabel();

        menu_salir3.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir3.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir3.setPixels(0);
        menu_salir3.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir3.setRound(40);

        tablecitas.setForeground(new java.awt.Color(74, 74, 74));
        tablecitas.setModel(new javax.swing.table.DefaultTableModel(
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
        tablecitas.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablecitas.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        tablecitas.setColorFilasForeground2(new java.awt.Color(74, 74, 74));
        tablecitas.setFont(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        tablecitas.setFuenteFilas(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        tablecitas.setFuenteFilasSelect(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        tablecitas.setFuenteHead(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        tablecitas.setGridColor(new java.awt.Color(153, 153, 153));
        tablecitas.setGrosorBordeFilas(0);
        tablecitas.setGrosorBordeHead(0);
        tablecitas.setRowHeight(32);
        tablecitas.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tablecitas);

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

        buttonGroup1.add(chk_boleta);
        chk_boleta.setForeground(new java.awt.Color(51, 51, 51));
        chk_boleta.setText("Boleta");
        chk_boleta.setColorCheck(new java.awt.Color(0, 112, 192));
        chk_boleta.setColorUnCheck(new java.awt.Color(0, 112, 192));
        chk_boleta.setFocusPainted(false);
        chk_boleta.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        buttonGroup1.add(chk_factura);
        chk_factura.setForeground(new java.awt.Color(51, 51, 51));
        chk_factura.setText("Factura");
        chk_factura.setColorCheck(new java.awt.Color(0, 112, 192));
        chk_factura.setColorUnCheck(new java.awt.Color(0, 112, 192));
        chk_factura.setFocusPainted(false);
        chk_factura.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        javax.swing.GroupLayout menu_salir2Layout = new javax.swing.GroupLayout(menu_salir2);
        menu_salir2.setLayout(menu_salir2Layout);
        menu_salir2Layout.setHorizontalGroup(
            menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(chk_boleta, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addGap(18, 27, Short.MAX_VALUE)
                .addComponent(chk_factura, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        menu_salir2Layout.setVerticalGroup(
            menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk_boleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chk_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        lbl_fechaemision.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lbl_fechaemision.setForeground(new java.awt.Color(51, 51, 51));
        lbl_fechaemision.setText("DD/MM/AA");

        jLabel17.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Ruc Nro:");

        txt_ruc.setBackground(new java.awt.Color(246, 247, 251));
        txt_ruc.setBgShade(new java.awt.Color(255, 255, 255));
        txt_ruc.setBgShadeHover(new java.awt.Color(204, 204, 204));
        txt_ruc.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_ruc.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_ruc.setDoubleBuffered(true);
        txt_ruc.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txt_ruc.setIntensity(0);
        txt_ruc.setPhColor(new java.awt.Color(255, 255, 255));
        txt_ruc.setPixels(0);
        txt_ruc.setPlaceholder("");
        txt_ruc.setRound(40);

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_fechaemision, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                    .addGroup(menu_salir5Layout.createSequentialGroup()
                        .addComponent(txt_ruc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu_salir5Layout.setVerticalGroup(
            menu_salir5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(menu_salir5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(lbl_fechaemision))
                .addGap(27, 27, 27)
                .addGroup(menu_salir5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel17)
                    .addComponent(jLabel2))
                .addGap(2, 2, 2)
                .addGroup(menu_salir5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_patient)
                    .addComponent(txt_ruc, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        lbl_total_pago.setText("S/ 0.00");

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
        btn_nuevo_comprobante.setEnabled(false);
        btn_pagar_comprobante.setEnabled(true);
        btn_imprimir_comprobante.setEnabled(false);
        btn_cancelar_cambios.setEnabled(true);
        
        txt_dni.setEnabled(true);
        txt_ruc.setEnabled(true);
        btn_buscar_reniec.setEnabled(true);
        
        chk_boleta.setEnabled(true);
        chk_factura.setEnabled(true);
        chk_boleta.setSelected(true);
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevo_comprobanteActionPerformed

    private void btn_pagar_comprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pagar_comprobanteActionPerformed
        try {
            // TODO add your handling code here:
            comprobante = new Comprobante();
            comprobante.setNumero("N0001");
            comprobante.setSerie("001");
            comprobante.setFechaEmision(lbl_fechaemision.getText());
            comprobante.setPatienid(patient.getId());
            comprobante.setRuc("");
            if(tipocomprobante.equals("FACTURA"))
                comprobante.setRuc(txt_ruc.getText().toString());
            
            comprobante = cTR_08_Comprobante.Insertar(comprobante);
            
            if(comprobante.getId()> 0)
            {
                System.out.println("exito al guardar !");
                
                // GUARDAMOS LAS CITAS EN EL DETALLE
                cTR_08_Comprobante.InsertarDetalle(lista_citas, comprobante.getId());
                // HACIENDO UN BUCLE
                
                btn_imprimir_comprobante.setEnabled(true);
                new rojerusan.RSNotifyFade("DentalSys", "Comprobante registrado", 7,
                RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
            }
            
        } catch (DaoException ex) {
            Logger.getLogger(frm_UI_04_comprobantes.class.getName()).log(Level.SEVERE, null, ex);
            new rojerusan.RSNotifyFade("DentalSys", ex.toString(), 7,
                    RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.ERROR).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(frm_UI_04_comprobantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_pagar_comprobanteActionPerformed

    private void btn_imprimir_comprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimir_comprobanteActionPerformed
        try {
            // TODO add your handling code here:
            Rpt_Comprobante rpt = new Rpt_Comprobante();
            rpt.CallExplorerRPT(comprobante.getId(), patient.getId(), tipocomprobante );
        } catch (IOException ex) {
            Logger.getLogger(frm_UI_04_comprobantes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btn_imprimir_comprobanteActionPerformed

    private void btn_cancelar_cambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_cambiosActionPerformed
        try {
            // TODO add your handling code here:
            btn_nuevo_comprobante.setEnabled(true);
            btn_pagar_comprobante.setEnabled(false);
            btn_imprimir_comprobante.setEnabled(false);
            btn_cancelar_cambios.setEnabled(false);
            List<CitasPatient> lista_citas = new ArrayList();
            this.tablecitas .setModel(cTR_08_Comprobante.List(lista_citas));
            
            txt_dni.setEnabled(false);
            txt_ruc.setEnabled(false);
            lbl_total_pago.setText("S/ 0.00");
            
        } catch (DaoException ex) {
            Logger.getLogger(frm_UI_04_comprobantes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frm_UI_04_comprobantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_cancelar_cambiosActionPerformed

    private void btn_buscar_reniecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_reniecActionPerformed
        boolean error = false;
        try {
            // buscar paciente por dni
            
            CTR_02_Patient cTR_02_Patient = new CTR_02_Patient();
            String DNI = txt_dni.getText();
            patient = cTR_02_Patient.CheckDNI(DNI);
            
            if(patient.getId() > 0){                
                String name =  patient.getName()+", " + patient.getLastname()+ " " + patient.getSurename();
                String pattern = "dd/MM/yyyy HH:mm:ss";
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
                String date = simpleDateFormat.format(new Date());
                lbl_fechaemision.setText(date);
                lbl_patient.setText(name.toString());
                
                getCitas(patient.getId());
            }
            else{
                System.out.println("El DNI ingresado no existe");
                error = true;
            }
        } catch (SQLException ex) {
            error = true;
            Logger.getLogger(frm_UI_04_comprobantes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DaoException ex) {
            // salta la excepcion de dao
            error = true;
            Logger.getLogger(frm_UI_04_comprobantes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(error){
            try {
                patient = new Patient();
                lbl_fechaemision.setText("");
                lbl_patient.setText("");
                List<CitasPatient> lista_citas = new ArrayList();
                this.tablecitas .setModel(cTR_08_Comprobante.List(lista_citas));
                new rojerusan.RSNotifyFade("DentalSys", "El DNI ingresado no existe en la base de datos.", 7,
                        RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.ERROR).setVisible(true);
            } catch (DaoException ex) {
                Logger.getLogger(frm_UI_04_comprobantes.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(frm_UI_04_comprobantes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_buscar_reniecActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btn_buscar_reniec;
    private newscomponents.RSButtonFlat_new btn_cancelar_cambios;
    private newscomponents.RSButtonFlat_new btn_imprimir_comprobante;
    private newscomponents.RSButtonFlat_new btn_nuevo_comprobante;
    private newscomponents.RSButtonFlat_new btn_pagar_comprobante;
    private javax.swing.ButtonGroup buttonGroup1;
    private RSMaterialComponent.RSCheckBoxMaterial chk_boleta;
    private RSMaterialComponent.RSCheckBoxMaterial chk_factura;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_fechaemision;
    private javax.swing.JLabel lbl_patient;
    private javax.swing.JLabel lbl_total_pago;
    private RSMaterialComponent.RSPanelMaterial menu_salir2;
    private RSMaterialComponent.RSPanelMaterial menu_salir3;
    private RSMaterialComponent.RSPanelMaterial menu_salir4;
    private RSMaterialComponent.RSPanelMaterial menu_salir5;
    private RSMaterialComponent.RSPanelMaterial menu_salir6;
    private RSMaterialComponent.RSPanelBorderGradient p1;
    private rojerusan.RSTableMetro tablecitas;
    private rscomponentshade.RSFormatFieldShade txt_dni;
    private rscomponentshade.RSFormatFieldShade txt_ruc;
    // End of variables declaration//GEN-END:variables

    private void Load() {
        try {
            patient = new Patient();
            getCitas(0);
            
            chk_boleta.addItemListener(new ItemListener() {
                
                @Override
                public void itemStateChanged(ItemEvent e) {
                    //System.out.println(e.getStateChange() == ItemEvent.SELECTED ? "boleta" : "DESELECTED");
                    if(e.getStateChange() == ItemEvent.SELECTED){
                        txt_ruc.setEnabled(false);
                        tipocomprobante = "BOLETA";
                    }
                }
                
            });
            
            chk_factura.addItemListener(new ItemListener() {
                
                @Override
                public void itemStateChanged(ItemEvent e) {
                    //System.out.println(e.getStateChange() == ItemEvent.SELECTED ? "factura" : "DESELECTED");
                    if(e.getStateChange() == ItemEvent.SELECTED){
                        txt_ruc.setEnabled(true);
                        tipocomprobante = "FACTURA";
                    }
                }
                
            });
            
            btn_nuevo_comprobante.setEnabled(true);
            btn_pagar_comprobante.setEnabled(false);
            btn_imprimir_comprobante.setEnabled(false);
            btn_cancelar_cambios.setEnabled(false);
            
            txt_ruc.setEnabled(false);
            txt_dni.setEnabled(false);
            btn_buscar_reniec.setEnabled(false);
            
            chk_boleta.setEnabled(false);
            chk_factura.setEnabled(false);
            List<CitasPatient> lista_citas = new ArrayList();
            this.tablecitas .setModel(cTR_08_Comprobante.List(lista_citas));
        } catch (DaoException ex) {
            Logger.getLogger(frm_UI_04_comprobantes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frm_UI_04_comprobantes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean click_row = false;
    private void getCitas(long i) {
        try {
            cTR_08_Comprobante = new CTR_08_Comprobante();
            this.tablecitas .setModel(cTR_08_Comprobante.List(i));
            this.tablecitas.getSelectionModel().addListSelectionListener(e -> {
                boolean seleccionValid = (tablecitas.getSelectedRow() != -1);
                //btnEdit.setEnabled(seleccionValid);
                //btnDelete.setEnabled(seleccionValid);
            });
            this.lista_citas =cTR_08_Comprobante.getLista();
        } catch (DaoException ex) {
            Logger.getLogger(frm_UI_04_comprobantes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frm_UI_04_comprobantes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        this.tablecitas.setDefaultRenderer(JButton.class, new TableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object objeto, boolean estaSeleccionado, boolean tieneElFoco, int fila, int columna) {
                return (Component) objeto;
            }
        });
        
        this.tablecitas.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = tablecitas.rowAtPoint(e.getPoint());
                int columna = tablecitas.columnAtPoint(e.getPoint());
             
                if (tablecitas.getModel().getColumnClass(0).equals(Boolean.class)) {
     
                    try {
                        ChangeValueListAndUpdateModel(fila);
                    } catch (DaoException ex) {
                        Logger.getLogger(frm_UI_04_comprobantes.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(frm_UI_04_comprobantes.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }   
            }    
            
        });
    }

    int paso = 0;
    public void ChangeValueListAndUpdateModel(int fila) throws DaoException, SQLException {
        paso++;
        int res = paso%2;
        if (res == 0) {
            if(lista_citas.get(fila).isSelected())
                lista_citas.get(fila).setSelected(false);
            else
                lista_citas.get(fila).setSelected(true);

            cTR_08_Comprobante = new CTR_08_Comprobante();
            this.tablecitas .setModel(cTR_08_Comprobante.List(lista_citas));
            this.lista_citas =cTR_08_Comprobante.getLista();
            DecimalFormat df = new DecimalFormat("#.##");
            double suma = 0;
            for(int a = 0; a<lista_citas.size(); a++)
                if(lista_citas.get(a).isSelected())
                    suma += lista_citas.get(a).getPrecio();
                        

            lbl_total_pago.setText("S/ "+df.format(suma));
        }
    }
  
}
