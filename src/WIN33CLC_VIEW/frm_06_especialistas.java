/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN33CLC_VIEW;

import WIN30CLC_DAO.DaoException;
import WIN31CLC_DTO.Patient;
import WIN31CLC_DTO.Service;
import WIN31CLC_DTO.Specialist;
import WIN32CLC_CTR.CTR_02_Patient;
import WIN32CLC_CTR.CTR_03_Service;
import WIN32CLC_CTR.CTR_04_Specialist;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import org.json.JSONException;

/**
 *
 * @author LuFraVaPe
 */
public class frm_06_especialistas extends javax.swing.JPanel {

    /**
     * Creates new form frm_06_especialistas
     */
    ArrayList<Service> service_list = null;
    CTR_04_Specialist cTR_04_Specialist;
    public frm_06_especialistas() {
        initComponents();
        
        btn_nuevo_especialista.setEnabled(true);
        btn_guardar_especialista.setEnabled(false);
        btn_cancelar_cambios.setEnabled(false);
        btn_modificar_especialista.setEnabled(false);
        
        txt_apellidoMAT.setEnabled(false);
        txt_apellidoPAT.setEnabled(false);
        txt_direccion.setEnabled(false);
        txt_direccion.setEnabled(false);
        txt_dni.setEnabled(false);
        txt_name.setEnabled(false);
        txt_phone.setEnabled(false);
        btn_buscar_reniec_especialista.setEnabled(false);
        
        
        LoadData();
    }

    private long id;
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public void LoadData() {
        try {
            // traer los servicios
            CTR_03_Service ctr_Service = new CTR_03_Service();
            cTR_04_Specialist = new CTR_04_Specialist();
            service_list = new ArrayList<Service>();
            Service service = new Service();
            service.setId(0);
            service.setName("--Seleccionar--");
            service.setPrice(0);
            
            service_list.add(service);
            service_list.addAll(ctr_Service.listService());
            cbx_servicio.removeAllItems();
            if (service_list != null) {
                for (int i = 0; i < service_list.size(); i++) {
                    cbx_servicio.addItem(service_list.get(i).getName());
                }
            }

            
        } catch (SQLException ex) {
            Logger.getLogger(frm_03_reservar_cita.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DaoException ex) {
            Logger.getLogger(frm_03_reservar_cita.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        try {
          
            this.table_especialista.setModel(cTR_04_Specialist.List());
            this.table_especialista.getSelectionModel().addListSelectionListener(e -> {
                boolean seleccionValid = (table_especialista.getSelectedRow() != -1);
                //btnEdit.setEnabled(seleccionValid);
                //btnDelete.setEnabled(seleccionValid);
            });
        } catch (DaoException ex) {
           // Logger.getLogger(frm_02_Patient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
         //   Logger.getLogger(frm_02_Patient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.table_especialista.setDefaultRenderer(JButton.class, new TableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object objeto, boolean estaSeleccionado, boolean tieneElFoco, int fila, int columna) {
                return (Component) objeto;
            }
        });
        
        this.table_especialista.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = table_especialista.rowAtPoint(e.getPoint());
                int columna = table_especialista.columnAtPoint(e.getPoint());
                
                System.out.println("click");
                //setEditable(true);
                
                if (table_especialista.getModel().getColumnClass(columna).equals(JButton.class)) {
     
                    try {
                        cTR_04_Specialist.Delete((long) table_especialista.getModel().getValueAt(fila, 0));
                        btn_modificar_especialista.setEnabled(false);
                        btn_cancelar_cambios.setEnabled(false);
                        btn_guardar_especialista.setEnabled(false);
                        table_especialista.setModel(cTR_04_Specialist.List());

                    } catch (DaoException ex) {
                        Logger.getLogger(frm_05_servicios.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(frm_05_servicios.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }else
                {
                //if (!table_services.getModel().getColumnClass(0).equals(JButton.class)) {
                    setId((long) table_especialista.getModel().getValueAt(fila, 0));
                    btn_modificar_especialista.setEnabled(true);
                }
                
            }
            
        });
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_contenedor = new javax.swing.JPanel();
        fSGradientPanel1 = new LIB.FSGradientPanel();
        jLabel13 = new javax.swing.JLabel();
        btn_guardar_especialista = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_cancelar_cambios = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_modificar_especialista = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_nuevo_especialista = new RSMaterialComponent.RSButtonMaterialGradientOne();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_buscar_reniec_especialista = new RSMaterialComponent.RSButtonMaterialGradientOne();
        txt_dni = new rojerusan.RSMetroTextFullPlaceHolder();
        txt_apellidoMAT = new rojerusan.RSMetroTextFullPlaceHolder();
        txt_phone = new rojerusan.RSMetroTextFullPlaceHolder();
        txt_direccion = new rojerusan.RSMetroTextFullPlaceHolder();
        txt_name = new rojerusan.RSMetroTextFullPlaceHolder();
        txt_apellidoPAT = new rojerusan.RSMetroTextFullPlaceHolder();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        chx_estado = new RSMaterialComponent.RSCheckBoxMaterial();
        cbx_servicio = new RSMaterialComponent.RSComboBoxMaterial();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_especialista = new rojerusan.RSTableMetro();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout());

        panel_contenedor.setBackground(new java.awt.Color(255, 255, 255));
        panel_contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fSGradientPanel1.setFSEndColor(new java.awt.Color(3, 111, 198));
        fSGradientPanel1.setFSStartColor(new java.awt.Color(101, 208, 250));
        fSGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-doctor-en-medicina-100.png"))); // NOI18N
        fSGradientPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 110, 90));

        btn_guardar_especialista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-guardar-como-30.png"))); // NOI18N
        btn_guardar_especialista.setText("Guardar Especialista");
        btn_guardar_especialista.setBorderPainted(false);
        btn_guardar_especialista.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn_guardar_especialista.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn_guardar_especialista.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn_guardar_especialista.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn_guardar_especialista.setFocusPainted(false);
        btn_guardar_especialista.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        btn_guardar_especialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_especialistaActionPerformed(evt);
            }
        });
        fSGradientPanel1.add(btn_guardar_especialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 220, -1));

        btn_cancelar_cambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-cancelar-30.png"))); // NOI18N
        btn_cancelar_cambios.setText("Cancelar Cambios");
        btn_cancelar_cambios.setBorderPainted(false);
        btn_cancelar_cambios.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn_cancelar_cambios.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn_cancelar_cambios.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn_cancelar_cambios.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn_cancelar_cambios.setFocusPainted(false);
        btn_cancelar_cambios.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        btn_cancelar_cambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_cambiosActionPerformed(evt);
            }
        });
        fSGradientPanel1.add(btn_cancelar_cambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 220, -1));

        btn_modificar_especialista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-editar-archivo-30.png"))); // NOI18N
        btn_modificar_especialista.setText("Modificar Especialista");
        btn_modificar_especialista.setBorderPainted(false);
        btn_modificar_especialista.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn_modificar_especialista.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn_modificar_especialista.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn_modificar_especialista.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn_modificar_especialista.setFocusPainted(false);
        btn_modificar_especialista.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        btn_modificar_especialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificar_especialistaActionPerformed(evt);
            }
        });
        fSGradientPanel1.add(btn_modificar_especialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 220, -1));

        btn_nuevo_especialista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-documentos-30.png"))); // NOI18N
        btn_nuevo_especialista.setText("Nuevo Especialista");
        btn_nuevo_especialista.setBorderPainted(false);
        btn_nuevo_especialista.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn_nuevo_especialista.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn_nuevo_especialista.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn_nuevo_especialista.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn_nuevo_especialista.setFocusPainted(false);
        btn_nuevo_especialista.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        btn_nuevo_especialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevo_especialistaActionPerformed(evt);
            }
        });
        fSGradientPanel1.add(btn_nuevo_especialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 220, -1));

        panel_contenedor.add(fSGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 740));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Especialista", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setText("Teléfono");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("DNI");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setText("Apellido Paterno");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setText("Direccion");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setText("Apellido Materno");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));

        btn_buscar_reniec_especialista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-encuentra-hombre-usuario-30.png"))); // NOI18N
        btn_buscar_reniec_especialista.setText("Buscar en Reniec");
        btn_buscar_reniec_especialista.setBorderPainted(false);
        btn_buscar_reniec_especialista.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn_buscar_reniec_especialista.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn_buscar_reniec_especialista.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn_buscar_reniec_especialista.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn_buscar_reniec_especialista.setFocusPainted(false);
        btn_buscar_reniec_especialista.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        btn_buscar_reniec_especialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_reniec_especialistaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_buscar_reniec_especialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 220, -1));

        txt_dni.setForeground(new java.awt.Color(0, 0, 0));
        txt_dni.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_dni.setBotonColor(new java.awt.Color(3, 111, 198));
        txt_dni.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txt_dni.setPlaceholder("");
        jPanel1.add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 170, -1));

        txt_apellidoMAT.setForeground(new java.awt.Color(0, 0, 0));
        txt_apellidoMAT.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_apellidoMAT.setBotonColor(new java.awt.Color(3, 111, 198));
        txt_apellidoMAT.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txt_apellidoMAT.setPlaceholder("");
        jPanel1.add(txt_apellidoMAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 170, -1));

        txt_phone.setForeground(new java.awt.Color(0, 0, 0));
        txt_phone.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_phone.setBotonColor(new java.awt.Color(3, 111, 198));
        txt_phone.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txt_phone.setPlaceholder("");
        jPanel1.add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 170, -1));

        txt_direccion.setForeground(new java.awt.Color(0, 0, 0));
        txt_direccion.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_direccion.setBotonColor(new java.awt.Color(3, 111, 198));
        txt_direccion.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txt_direccion.setPlaceholder("");
        jPanel1.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 380, -1));

        txt_name.setForeground(new java.awt.Color(0, 0, 0));
        txt_name.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_name.setBotonColor(new java.awt.Color(3, 111, 198));
        txt_name.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txt_name.setPlaceholder("");
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 170, -1));

        txt_apellidoPAT.setForeground(new java.awt.Color(0, 0, 0));
        txt_apellidoPAT.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_apellidoPAT.setBotonColor(new java.awt.Color(3, 111, 198));
        txt_apellidoPAT.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        txt_apellidoPAT.setPlaceholder("");
        jPanel1.add(txt_apellidoPAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 170, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("Nombres");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        panel_contenedor.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 720, 370));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones del Especialista", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15))); // NOI18N

        chx_estado.setForeground(new java.awt.Color(0, 0, 0));
        chx_estado.setText(" Activo");
        chx_estado.setColorCheck(new java.awt.Color(3, 111, 198));
        chx_estado.setColorUnCheck(new java.awt.Color(3, 111, 198));
        chx_estado.setFocusPainted(false);
        chx_estado.setRippleColor(new java.awt.Color(3, 111, 198));

        cbx_servicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escoga un servicio.", "RSItem 2", "RSItem 3", "RSItem 4" }));
        cbx_servicio.setColorMaterial(new java.awt.Color(3, 111, 198));
        cbx_servicio.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setText("Estado: ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setText("Servicio:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(chx_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbx_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chx_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel8)))
                .addGap(28, 28, 28))
        );

        panel_contenedor.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 720, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.CardLayout());

        table_especialista.setModel(new javax.swing.table.DefaultTableModel(
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
        table_especialista.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        table_especialista.setFuenteFilas(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        table_especialista.setFuenteFilasSelect(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        table_especialista.setFuenteHead(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        table_especialista.setGrosorBordeFilas(0);
        table_especialista.setGrosorBordeHead(0);
        table_especialista.setRowHeight(32);
        jScrollPane1.setViewportView(table_especialista);

        jPanel3.add(jScrollPane1, "card2");

        panel_contenedor.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, 720, 190));

        add(panel_contenedor, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardar_especialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_especialistaActionPerformed

        try {
            Specialist entity = new Specialist();
            entity.setDni(txt_dni.getText());
            entity.setName(txt_name.getText());
            entity.setLastname(txt_apellidoPAT.getText());
            entity.setSurename(txt_apellidoMAT.getText());
            entity.setEnable(chx_estado.isSelected());
            entity.setPhone(txt_phone.getText());
            entity.setAddress(txt_direccion.getText());
            Service parametro = service_list.get(cbx_servicio.getSelectedIndex());
            entity.setServices_id(parametro.getId());
            if(modificar){
                entity.setId(getId());
                cTR_04_Specialist.update(entity);
                limpiar();
            }else{

                cTR_04_Specialist.insert(entity);
                table_especialista.setModel(cTR_04_Specialist.List());
                btn_guardar_especialista.setEnabled(false);
                setId(0);
                btn_cancelar_cambios.setEnabled(false);
                btn_modificar_especialista.setEnabled(false);
                btn_nuevo_especialista.setEnabled(true);
                limpiar();
            }
            
            table_especialista.setModel(cTR_04_Specialist.List());
        } catch (DaoException ex) {
            Logger.getLogger(frm_06_especialistas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frm_06_especialistas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_guardar_especialistaActionPerformed

    private void btn_buscar_reniec_especialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_reniec_especialistaActionPerformed
        // buscar en reniec 
        
        try {
            if (txt_dni.getText().length() >= 8) {
                CTR_04_Specialist ctr = new CTR_04_Specialist();
                Specialist entidad = new Specialist();
                //buscar si existe el paciente el la base de datos
                try {
                    entidad = ctr.CheckDNI(txt_dni.getText());
                } catch (Exception e) {
                    //JOptionPane.showMessageDialog(null, e.getMessage(),
                    //"Dental SyS", JOptionPane.WARNING_MESSAGE);

                    //muestra los datos de la reniec en el fomrulario
                    entidad = ctr.SearchReniec(txt_dni.getText());
                    txt_name.setText(entidad.getName());
                    txt_apellidoPAT.setText(entidad.getLastname());
                    txt_apellidoMAT.setText(entidad.getSurename());
                }
                if (entidad.getId() != 0) {
                    // existe el dni
                    // despliega un mensaje

                    /* JOptionPane.showMessageDialog(null, "El DNI ingresado ya existe!",
                        "Dental SyS", JOptionPane.WARNING_MESSAGE);*/
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese el DNI",
                        "Dental SyS", JOptionPane.WARNING_MESSAGE);
            }
            
        } catch (IOException ex) {
            //Logger.getLogger(frm_02_register_patient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException ex) {
            // Logger.getLogger(frm_02_register_patient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_buscar_reniec_especialistaActionPerformed

    boolean modificar = true;
    private void btn_nuevo_especialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevo_especialistaActionPerformed
        btn_nuevo_especialista.setEnabled(false);
        btn_guardar_especialista.setEnabled(true);
        btn_cancelar_cambios.setEnabled(true);
        btn_modificar_especialista.setEnabled(false);
        modificar = false;
        
        txt_apellidoMAT.setEnabled(true);
        txt_apellidoPAT.setEnabled(true);
        txt_direccion.setEnabled(true);
        txt_direccion.setEnabled(true);
        txt_dni.setEnabled(true);
        txt_name.setEnabled(true);
        txt_phone.setEnabled(true);
        btn_buscar_reniec_especialista.setEnabled(true);
        
        txt_dni.requestFocus();
    }//GEN-LAST:event_btn_nuevo_especialistaActionPerformed

    private void btn_cancelar_cambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_cambiosActionPerformed
        limpiar();
    }//GEN-LAST:event_btn_cancelar_cambiosActionPerformed

    private void btn_modificar_especialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar_especialistaActionPerformed
        try {
            // TODO add your handling code here:
            Specialist dto = new Specialist();
            dto = cTR_04_Specialist.Select(getId());
            
            txt_apellidoPAT.setText(dto.getLastname());
            txt_apellidoMAT.setText(dto.getSurename());
            txt_direccion.setText(dto.getAddress());
            txt_dni.setText(dto.getDni());
            txt_name.setText(dto.getName());
            txt_phone.setText(dto.getPhone());
            chx_estado.setSelected(dto.isEnable());
            
            for(int a = 0; a < service_list.size(); a++){
                if(service_list.get(a).getId() == (dto.getServices_id())){
                    cbx_servicio.setSelectedIndex(a);
                    break;
                }
            }
            
            btn_modificar_especialista.setEnabled(false);
            btn_guardar_especialista.setEnabled(true);
            btn_cancelar_cambios.setEnabled(true);
            btn_nuevo_especialista.setEnabled(false);
            modificar = true;
            
        txt_apellidoMAT.setEnabled(true);
        txt_apellidoPAT.setEnabled(true);
        txt_direccion.setEnabled(true);
        txt_dni.setEnabled(false);
        txt_name.setEnabled(true);
        txt_phone.setEnabled(true);
            
        } catch (SQLException ex) {
            Logger.getLogger(frm_05_servicios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DaoException ex) {
            Logger.getLogger(frm_05_servicios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_modificar_especialistaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_buscar_reniec_especialista;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_cancelar_cambios;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_guardar_especialista;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_modificar_especialista;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_nuevo_especialista;
    private RSMaterialComponent.RSComboBoxMaterial cbx_servicio;
    private RSMaterialComponent.RSCheckBoxMaterial chx_estado;
    private LIB.FSGradientPanel fSGradientPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_contenedor;
    private rojerusan.RSTableMetro table_especialista;
    private rojerusan.RSMetroTextFullPlaceHolder txt_apellidoMAT;
    private rojerusan.RSMetroTextFullPlaceHolder txt_apellidoPAT;
    private rojerusan.RSMetroTextFullPlaceHolder txt_direccion;
    private rojerusan.RSMetroTextFullPlaceHolder txt_dni;
    private rojerusan.RSMetroTextFullPlaceHolder txt_name;
    private rojerusan.RSMetroTextFullPlaceHolder txt_phone;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        txt_apellidoMAT.setEnabled(false);
        txt_apellidoPAT.setEnabled(false);
        txt_direccion.setEnabled(false);
        txt_direccion.setEnabled(false);
        txt_dni.setEnabled(false);
        txt_name.setEnabled(false);
        txt_phone.setEnabled(false);
        btn_buscar_reniec_especialista.setEnabled(false);
        
        // TODO add your handling code here:
        btn_guardar_especialista.setEnabled(false);
        btn_cancelar_cambios.setEnabled(false);
        btn_modificar_especialista.setEnabled(false);
        btn_nuevo_especialista.setEnabled(true);
        setId(0);
        modificar = false;
        
        
        txt_apellidoMAT.setText("");
        txt_apellidoPAT.setText("");
        txt_direccion.setText("");
        txt_direccion.setText("");
        txt_dni.setText("");
        txt_name.setText("");
        txt_phone.setText("");
        chx_estado.setSelected(false);
        
        cbx_servicio.setSelectedIndex(0);
    }
}
