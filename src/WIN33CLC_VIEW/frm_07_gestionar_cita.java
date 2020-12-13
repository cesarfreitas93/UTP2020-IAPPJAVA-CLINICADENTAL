package WIN33CLC_VIEW;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.Dao_05_Citas;
import WIN31CLC_DTO.Citas;
import WIN31CLC_DTO.horario_citas;
import WIN32CLC_CTR.CTR_05_Citas;
import static WIN_2020_UTILS.Validators.getSelectedButtonIndex;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.TableCellRenderer;

public class frm_07_gestionar_cita extends javax.swing.JPanel {

    private CTR_05_Citas ctr;
    private Citas dtos;
    private horario_citas ehorarios_citas;
    private horario_citas ehorarios_citas_disponible;
    private horario_citas ehorarios_citas_reservadas;

    private horario_citas ehorarios_citas_del_dia;
    private horario_citas ehorarios_citas_disponible_del_dia;
    private horario_citas ehorarios_citas_reservadas_del_dia;

    public frm_07_gestionar_cita() {
        initComponents();
        LoadData();
        limpiar_menu();
        btn_eliminar_cita.setEnabled(false);
        btn_reprogramar_cita.setEnabled(false);
        btn_anular_cita.setEnabled(false);
        rSDateChooser2.setEnabled(false);
        rSDateChooser2.setDatoFecha(null);
        btn_horario_disponible.setEnabled(false);

    }

    public void LoadData() {
        checkbox_horario(false);

        try {
            ctr = new CTR_05_Citas();
            this.tabla_citas_vigentes.setModel(ctr.ListCitas(1));
            this.tabla_citas_reprogramadas.setModel(ctr.ListCitas(2));
            this.tabla_citas_vencidas.setModel(ctr.ListCitas(3));

            this.tabla_citas_vigentes.getSelectionModel().addListSelectionListener(e -> {
                boolean seleccionValid = (tabla_citas_vigentes.getSelectedRow() != -1);
                //btnEdit.setEnabled(seleccionValid);
                //btnDelete.setEnabled(seleccionValid);
            });
        } catch (DaoException ex) {
            // Logger.getLogger(frm_02_Patient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            //   Logger.getLogger(frm_02_Patient.class.getName()).log(Level.SEVERE, null, ex);
        }
        ////////------------------tabla_citas_vigentes

        this.tabla_citas_vigentes.setDefaultRenderer(JButton.class, new TableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object objeto, boolean estaSeleccionado, boolean tieneElFoco, int fila, int columna) {
                return (Component) objeto;
            }
        });
        this.tabla_citas_vigentes.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    int fila = tabla_citas_vigentes.rowAtPoint(e.getPoint());
                    int columna = tabla_citas_vigentes.columnAtPoint(e.getPoint());

                    System.out.println("click");
//                if (!tabla_citas_vigentes.getModel().getColumnClass(0).equals(JButton.class)) {
//                    //System.out.println(tabla_citas_vigentes.getModel().getValueAt(fila, 0)); 
//                    setId((long) tabla_citas_vigentes.getModel().getValueAt(fila, 0));
//
//                }

                    dtos = new Citas();
                    long id = (long) tabla_citas_vigentes.getModel().getValueAt(fila, 0);
                    dtos = ctr.SelecteCitasGestionar(id);
                    if (dtos != null) {
                        lblnro_cita.setText(String.valueOf(dtos.getId()));
                        lbl_servicio.setText(dtos.getService().getName());
                        lbl_especialista.setText(dtos.getSpecialist().getName());
                        lbl_patient.setText(dtos.getPatient().getName() + " " + dtos.getPatient().getLastname() + " " + dtos.getPatient().getSurename());
                        lbl_phone.setText(dtos.getPatient().getPhone());
                        lbl_fecha_cita.setText(String.valueOf(dtos.getFechadecita()));
                        lbl_hora_cita.setText(String.valueOf(dtos.getHorario_citas().getCita_horario_inicio()) + " - " + String.valueOf(dtos.getHorario_citas().getCita_horario_fin()));
                        btn_eliminar_cita.setEnabled(false);
                        btn_reprogramar_cita.setEnabled(true);
                        btn_anular_cita.setEnabled(true);
                        rSDateChooser2.setEnabled(true);
                        btn_horario_disponible.setEnabled(true);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(frm_07_gestionar_cita.class.getName()).log(Level.SEVERE, null, ex);
                } catch (DaoException ex) {
                    Logger.getLogger(frm_07_gestionar_cita.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        });

        ////////------------------tabla_citas_reprogramadas
        this.tabla_citas_reprogramadas.setDefaultRenderer(JButton.class, new TableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object objeto, boolean estaSeleccionado, boolean tieneElFoco, int fila, int columna) {
                return (Component) objeto;
            }
        });
        this.tabla_citas_reprogramadas.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    int fila = tabla_citas_reprogramadas.rowAtPoint(e.getPoint());
                    int columna = tabla_citas_reprogramadas.columnAtPoint(e.getPoint());

                    System.out.println("click");
//                if (!tabla_citas_vigentes.getModel().getColumnClass(0).equals(JButton.class)) {
//                    //System.out.println(tabla_citas_vigentes.getModel().getValueAt(fila, 0)); 
//                    setId((long) tabla_citas_vigentes.getModel().getValueAt(fila, 0));
//
//                }

                    dtos = new Citas();
                    long id = (long) tabla_citas_reprogramadas.getModel().getValueAt(fila, 0);
                    dtos = ctr.SelecteCitasGestionar(id);
                    if (dtos != null) {
                        lblnro_cita.setText(String.valueOf(dtos.getId()));
                        lbl_servicio.setText(dtos.getService().getName());
                        lbl_especialista.setText(dtos.getSpecialist().getName());
                        lbl_patient.setText(dtos.getPatient().getName() + " " + dtos.getPatient().getLastname() + " " + dtos.getPatient().getSurename());
                        lbl_phone.setText(dtos.getPatient().getPhone());
                        lbl_fecha_cita.setText(String.valueOf(dtos.getFechadecita()));
                        lbl_hora_cita.setText(String.valueOf(dtos.getHorario_citas().getCita_horario_inicio()) + " - " + String.valueOf(dtos.getHorario_citas().getCita_horario_fin()));
                        btn_eliminar_cita.setEnabled(true);
                        btn_reprogramar_cita.setEnabled(false);
                        btn_anular_cita.setEnabled(true);
                        rSDateChooser2.setEnabled(false);
                        btn_horario_disponible.setEnabled(false);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(frm_07_gestionar_cita.class.getName()).log(Level.SEVERE, null, ex);
                } catch (DaoException ex) {
                    Logger.getLogger(frm_07_gestionar_cita.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        });
        ////////------------------tabla_citas_vencidas
        this.tabla_citas_vencidas.setDefaultRenderer(JButton.class, new TableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object objeto, boolean estaSeleccionado, boolean tieneElFoco, int fila, int columna) {
                return (Component) objeto;
            }
        });
        this.tabla_citas_vencidas.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    int fila = tabla_citas_vencidas.rowAtPoint(e.getPoint());
                    int columna = tabla_citas_vencidas.columnAtPoint(e.getPoint());

                    System.out.println("click");
//                if (!tabla_citas_vigentes.getModel().getColumnClass(0).equals(JButton.class)) {
//                    //System.out.println(tabla_citas_vigentes.getModel().getValueAt(fila, 0)); 
//                    setId((long) tabla_citas_vigentes.getModel().getValueAt(fila, 0));
//
//                }

                    dtos = new Citas();
                    long id = (long) tabla_citas_vencidas.getModel().getValueAt(fila, 0);
                    dtos = ctr.SelecteCitasGestionar(id);
                    if (dtos != null) {
                        lblnro_cita.setText(String.valueOf(dtos.getId()));
                        lbl_servicio.setText(dtos.getService().getName());
                        lbl_especialista.setText(dtos.getSpecialist().getName());
                        lbl_patient.setText(dtos.getPatient().getName() + " " + dtos.getPatient().getLastname() + " " + dtos.getPatient().getSurename());
                        lbl_phone.setText(dtos.getPatient().getPhone());
                        lbl_fecha_cita.setText(String.valueOf(dtos.getFechadecita()));
                        lbl_hora_cita.setText(String.valueOf(dtos.getHorario_citas().getCita_horario_inicio()) + " - " + String.valueOf(dtos.getHorario_citas().getCita_horario_fin()));
                        btn_eliminar_cita.setEnabled(false);
                        btn_reprogramar_cita.setEnabled(false);
                        btn_anular_cita.setEnabled(false);
                        rSDateChooser2.setEnabled(false);
                        btn_horario_disponible.setEnabled(false);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(frm_07_gestionar_cita.class.getName()).log(Level.SEVERE, null, ex);
                } catch (DaoException ex) {
                    Logger.getLogger(frm_07_gestionar_cita.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        });
        jTabbedPane1.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                if (jTabbedPane1.getSelectedIndex() != 0) {
                    btn_eliminar_cita.setEnabled(false);
                    btn_reprogramar_cita.setEnabled(false);
                    btn_anular_cita.setEnabled(false);
                    rSDateChooser2.setEnabled(false);
                    rSDateChooser2.setDatoFecha(null);
                    limpiar_menu();
                    buttonGroup1.clearSelection();
                    btn_horario_disponible.setEnabled(false);
                }
            }
        });
    }

//    private Citas getCitasSelected() throws SQLException, DaoException {
//        CTR_05_Citas ctr = new CTR_05_Citas();
//        int id = (int) tabla_citas_vigentes.getValueAt(tabla_citas_vigentes.getSelectedRow(), 0);
//        return ctr.SelecteCitasGestionar(id);
//    }
    public void limpiar_menu() {
        lblnro_cita.setText("");
        lbl_servicio.setText("");
        lbl_especialista.setText("");
        lbl_patient.setText("");
        lbl_phone.setText("");
        lbl_fecha_cita.setText("");
        lbl_hora_cita.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        fSGradientPanel1 = new LIB.FSGradientPanel();
        jLabel13 = new javax.swing.JLabel();
        btn_anular_cita = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_eliminar_cita = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_reprogramar_cita = new RSMaterialComponent.RSButtonMaterialGradientOne();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_citas_vigentes = new rojerusan.RSTableMetro();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_citas_reprogramadas = new rojerusan.RSTableMetro();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_citas_vencidas = new rojerusan.RSTableMetro();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        rSDateChooser2 = new rojeru_san.componentes.RSDateChooser();
        btn_horario_disponible = new RSMaterialComponent.RSButtonMaterialGradientOne();
        jPanel5 = new javax.swing.JPanel();
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
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblnro_cita = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_especialista = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_hora_cita = new javax.swing.JLabel();
        lbl_servicio = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_patient = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_phone = new javax.swing.JLabel();
        lbl_fecha_cita = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fSGradientPanel1.setFSEndColor(new java.awt.Color(3, 111, 198));
        fSGradientPanel1.setFSStartColor(new java.awt.Color(101, 208, 250));
        fSGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-horas-extras-100.png"))); // NOI18N
        fSGradientPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 110, 90));

        btn_anular_cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-calendario-menos-30.png"))); // NOI18N
        btn_anular_cita.setText("Anular Cita");
        btn_anular_cita.setBorderPainted(false);
        btn_anular_cita.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn_anular_cita.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn_anular_cita.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn_anular_cita.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn_anular_cita.setFocusPainted(false);
        btn_anular_cita.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_anular_cita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anular_citaActionPerformed(evt);
            }
        });
        fSGradientPanel1.add(btn_anular_cita, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 210, -1));

        btn_eliminar_cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-cancelar-30.png"))); // NOI18N
        btn_eliminar_cita.setText("Eliminar Cita");
        btn_eliminar_cita.setBorderPainted(false);
        btn_eliminar_cita.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn_eliminar_cita.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn_eliminar_cita.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn_eliminar_cita.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn_eliminar_cita.setFocusPainted(false);
        btn_eliminar_cita.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        fSGradientPanel1.add(btn_eliminar_cita, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 210, -1));

        btn_reprogramar_cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-guardar-como-30.png"))); // NOI18N
        btn_reprogramar_cita.setText("Reprogramar Cita");
        btn_reprogramar_cita.setBorderPainted(false);
        btn_reprogramar_cita.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn_reprogramar_cita.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn_reprogramar_cita.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn_reprogramar_cita.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn_reprogramar_cita.setFocusPainted(false);
        btn_reprogramar_cita.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btn_reprogramar_cita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reprogramar_citaActionPerformed(evt);
            }
        });
        fSGradientPanel1.add(btn_reprogramar_cita, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 210, -1));

        add(fSGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 740));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.CardLayout());

        tabla_citas_vigentes.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla_citas_vigentes.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tabla_citas_vigentes.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tabla_citas_vigentes.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tabla_citas_vigentes.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        tabla_citas_vigentes.setFuenteFilas(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        tabla_citas_vigentes.setFuenteFilasSelect(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        tabla_citas_vigentes.setFuenteHead(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        tabla_citas_vigentes.setGrosorBordeFilas(0);
        tabla_citas_vigentes.setGrosorBordeHead(0);
        tabla_citas_vigentes.setRowHeight(24);
        jScrollPane2.setViewportView(tabla_citas_vigentes);

        jPanel2.add(jScrollPane2, "card2");

        jTabbedPane1.addTab("CITAS VIGENTES", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.CardLayout());

        tabla_citas_reprogramadas.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla_citas_reprogramadas.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tabla_citas_reprogramadas.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tabla_citas_reprogramadas.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tabla_citas_reprogramadas.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        tabla_citas_reprogramadas.setFuenteFilas(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        tabla_citas_reprogramadas.setFuenteFilasSelect(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        tabla_citas_reprogramadas.setFuenteHead(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        tabla_citas_reprogramadas.setGrosorBordeFilas(0);
        tabla_citas_reprogramadas.setGrosorBordeHead(0);
        tabla_citas_reprogramadas.setRowHeight(24);
        jScrollPane3.setViewportView(tabla_citas_reprogramadas);

        jPanel3.add(jScrollPane3, "card2");

        jTabbedPane1.addTab("CITAS REPROGRAMADAS", jPanel3);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.CardLayout());

        tabla_citas_vencidas.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla_citas_vencidas.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tabla_citas_vencidas.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tabla_citas_vencidas.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tabla_citas_vencidas.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        tabla_citas_vencidas.setFuenteFilas(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        tabla_citas_vencidas.setFuenteFilasSelect(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        tabla_citas_vencidas.setFuenteHead(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        tabla_citas_vencidas.setGrosorBordeFilas(0);
        tabla_citas_vencidas.setGrosorBordeHead(0);
        tabla_citas_vencidas.setRowHeight(24);
        jScrollPane4.setViewportView(tabla_citas_vencidas);

        jPanel1.add(jScrollPane4, "card2");

        jTabbedPane1.addTab("CITAS VENCIDAS", jPanel1);

        add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 780, 220));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RESERVAR CITA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI Black", 0, 15))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel12.setText("Fecha de la Cita");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 51, -1, -1));

        rSDateChooser2.setColorBackground(new java.awt.Color(3, 111, 198));
        rSDateChooser2.setColorButtonHover(new java.awt.Color(3, 111, 198));
        rSDateChooser2.setColorDiaActual(new java.awt.Color(255, 0, 0));
        rSDateChooser2.setColorForeground(new java.awt.Color(3, 111, 198));
        rSDateChooser2.setFormatoFecha("dd/MM/yyyy");
        rSDateChooser2.setFuente(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jPanel4.add(rSDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        btn_horario_disponible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-horas-extras-30.png"))); // NOI18N
        btn_horario_disponible.setText("Ver Horario Disponible");
        btn_horario_disponible.setBorderPainted(false);
        btn_horario_disponible.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn_horario_disponible.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn_horario_disponible.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn_horario_disponible.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn_horario_disponible.setFocusPainted(false);
        btn_horario_disponible.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 16)); // NOI18N
        btn_horario_disponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_horario_disponibleActionPerformed(evt);
            }
        });
        jPanel4.add(btn_horario_disponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 250, 40));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(rbx_1);
        rbx_1.setForeground(new java.awt.Color(0, 0, 0));
        rbx_1.setText("8:00 - 8:30");
        rbx_1.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_1.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_1.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_1.setRippleColor(new java.awt.Color(3, 111, 198));
        jPanel5.add(rbx_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 5, -1, -1));

        buttonGroup1.add(rbx_2);
        rbx_2.setForeground(new java.awt.Color(0, 0, 0));
        rbx_2.setText("8:30 - 9:00");
        rbx_2.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_2.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_2.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_2.setRippleColor(new java.awt.Color(3, 111, 198));
        jPanel5.add(rbx_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 5, -1, -1));

        buttonGroup1.add(rbx_3);
        rbx_3.setForeground(new java.awt.Color(0, 0, 0));
        rbx_3.setText("9:00 - 9:30");
        rbx_3.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_3.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rbx_3.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_3.setRippleColor(new java.awt.Color(3, 111, 198));
        jPanel5.add(rbx_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 5, -1, -1));

        buttonGroup1.add(rbx_4);
        rbx_4.setForeground(new java.awt.Color(0, 0, 0));
        rbx_4.setText("9:30 - 10:00");
        rbx_4.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_4.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_4.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_4.setRippleColor(new java.awt.Color(3, 111, 198));
        jPanel5.add(rbx_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 5, -1, -1));

        buttonGroup1.add(rbx_5);
        rbx_5.setForeground(new java.awt.Color(0, 0, 0));
        rbx_5.setText("10:00 - 10:30");
        rbx_5.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_5.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_5.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_5.setRippleColor(new java.awt.Color(3, 111, 198));
        jPanel5.add(rbx_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 50, -1, -1));

        buttonGroup1.add(rbx_6);
        rbx_6.setForeground(new java.awt.Color(0, 0, 0));
        rbx_6.setText("10:30 - 11:00");
        rbx_6.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_6.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_6.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_6.setRippleColor(new java.awt.Color(3, 111, 198));
        jPanel5.add(rbx_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 50, -1, -1));

        buttonGroup1.add(rbx_7);
        rbx_7.setForeground(new java.awt.Color(0, 0, 0));
        rbx_7.setText("11:00 - 11:30");
        rbx_7.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_7.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_7.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_7.setRippleColor(new java.awt.Color(3, 111, 198));
        jPanel5.add(rbx_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 50, -1, -1));

        buttonGroup1.add(rbx_8);
        rbx_8.setForeground(new java.awt.Color(0, 0, 0));
        rbx_8.setText("11:30 - 12:00");
        rbx_8.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_8.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_8.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_8.setRippleColor(new java.awt.Color(3, 111, 198));
        jPanel5.add(rbx_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 50, -1, -1));

        rbx_9.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(rbx_9);
        rbx_9.setForeground(new java.awt.Color(0, 0, 0));
        rbx_9.setText("12:00 - 12:30");
        rbx_9.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_9.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_9.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_9.setRippleColor(new java.awt.Color(3, 111, 198));
        jPanel5.add(rbx_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 95, -1, -1));

        buttonGroup1.add(rbx_10);
        rbx_10.setForeground(new java.awt.Color(0, 0, 0));
        rbx_10.setText("12:30 - 13:00");
        rbx_10.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_10.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_10.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_10.setRippleColor(new java.awt.Color(3, 111, 198));
        jPanel5.add(rbx_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 95, -1, -1));

        buttonGroup1.add(rbx_11);
        rbx_11.setForeground(new java.awt.Color(0, 0, 0));
        rbx_11.setText("13:00 - 13:30");
        rbx_11.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_11.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_11.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_11.setRippleColor(new java.awt.Color(3, 111, 198));
        jPanel5.add(rbx_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 95, -1, -1));

        buttonGroup1.add(rbx_12);
        rbx_12.setForeground(new java.awt.Color(0, 0, 0));
        rbx_12.setText("13:30 - 14:00");
        rbx_12.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_12.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_12.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_12.setRippleColor(new java.awt.Color(3, 111, 198));
        jPanel5.add(rbx_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 95, -1, -1));

        buttonGroup1.add(rbx_13);
        rbx_13.setForeground(new java.awt.Color(0, 0, 0));
        rbx_13.setText("14:00 - 14:00");
        rbx_13.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_13.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_13.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_13.setRippleColor(new java.awt.Color(3, 111, 198));
        jPanel5.add(rbx_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 140, -1, -1));

        buttonGroup1.add(rbx_14);
        rbx_14.setForeground(new java.awt.Color(0, 0, 0));
        rbx_14.setText("14:30 - 15:00");
        rbx_14.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_14.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_14.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_14.setRippleColor(new java.awt.Color(3, 111, 198));
        jPanel5.add(rbx_14, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 140, -1, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 710, 200));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 770, 310));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DETALLE DE LA CITA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 15))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        jLabel1.setText("CITA N°:");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 34, -1, -1));

        lblnro_cita.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblnro_cita.setForeground(new java.awt.Color(255, 0, 0));
        lblnro_cita.setText("Numero");
        jPanel6.add(lblnro_cita, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 34, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        jLabel4.setText("ESPECIALISTA:");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, 30));

        lbl_especialista.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbl_especialista.setText("Nombres y apellidos");
        jPanel6.add(lbl_especialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 370, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        jLabel5.setText("HORA CITA:");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, -1, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        jLabel6.setText("SERVICIO:");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, 30));

        lbl_hora_cita.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbl_hora_cita.setText("Teléfono");
        jPanel6.add(lbl_hora_cita, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 90, 30));

        lbl_servicio.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbl_servicio.setText("Servicio");
        jPanel6.add(lbl_servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 330, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        jLabel7.setText("PACIENTE: ");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 30));

        lbl_patient.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbl_patient.setText("Nombres y apellidos");
        jPanel6.add(lbl_patient, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 450, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        jLabel8.setText("TELÉFONO:");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 15)); // NOI18N
        jLabel9.setText("FECHA CITA:");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, 30));

        lbl_phone.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbl_phone.setText("Teléfono");
        jPanel6.add(lbl_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 160, 30));

        lbl_fecha_cita.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbl_fecha_cita.setText("10/25/200");
        jPanel6.add(lbl_fecha_cita, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 130, 30));
        jPanel6.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 720, 10));

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 780, 170));
    }// </editor-fold>//GEN-END:initComponents
public void deshabilitar_rbx_Gestionar_cita(boolean b) {
        //jPanel3.setVisible(b);
        rbx_4.setVisible(b);
        rbx_8.setVisible(b);
        rbx_12.setVisible(b);
        rbx_3.setVisible(b);
        rbx_7.setVisible(b);
        rbx_11.setVisible(b);
        rbx_14.setVisible(b);

    }
    private void btn_reprogramar_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reprogramar_citaActionPerformed
        if (dtos != null) {
            try {
                //modificar&& getSelectedButtonIndex(buttonGroup1) != 0
                if (rSDateChooser2.getDatoFecha() != null) {
                    Citas repro = new Citas();
                    repro = dtos;
                    repro.setStatus(2);
                    java.util.Date date = rSDateChooser2.getDatoFecha();
                    java.sql.Date date1 = new java.sql.Date(date.getTime());
                    repro.setFechadecita(date1);
                    horario_citas dto4 = new horario_citas();
                    dto4.setId_horario(getSelectedButtonIndex(buttonGroup1));
                    repro.setHorario_citas(dto4);

                    boolean dato = ctr.UpdateCitas_reprogramar(repro);
                    if (dato) {
                        this.tabla_citas_vigentes.setModel(ctr.ListCitas(1));
                        this.tabla_citas_reprogramadas.setModel(ctr.ListCitas(2));
                        this.tabla_citas_vencidas.setModel(ctr.ListCitas(3));
                        btn_eliminar_cita.setEnabled(false);
                        btn_reprogramar_cita.setEnabled(false);
                        btn_anular_cita.setEnabled(false);
                        dtos = new Citas();
                        rSDateChooser2.setDatoFecha(null);
                        lblnro_cita.setText("");
                        lbl_servicio.setText("");
                        lbl_especialista.setText("");
                        lbl_patient.setText("");
                        lbl_phone.setText("");
                        lbl_fecha_cita.setText("");
                        lbl_hora_cita.setText("");
                        buttonGroup1.clearSelection();
                        checkbox_horario(false);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(frm_07_gestionar_cita.class.getName()).log(Level.SEVERE, null, ex);
            } catch (DaoException ex) {
                Logger.getLogger(frm_07_gestionar_cita.class.getName()).log(Level.SEVERE, null, ex);
            }

            //frm_02_Patient frame = (frm_02_Patient) this.getTopLevelAncestor();
            //frame.mensaje();
//            mensaje();
        }
//else {
    }//GEN-LAST:event_btn_reprogramar_citaActionPerformed

    private void btn_horario_disponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_horario_disponibleActionPerformed
        if (rSDateChooser2.getDatoFecha() == null) {
            JOptionPane.showMessageDialog(null, "Elija la fecha de la cita primero");
        } else {

            if (dtos.getId() == 0) {
                JOptionPane.showMessageDialog(null, "Seleccione una Cita en la Tabla");

            } else {
                validarFechaCita();//procedimiento para mostrar las horas disponibles segun la fecha elegida
            }
        }

    }//GEN-LAST:event_btn_horario_disponibleActionPerformed
    private void validarFechaCita() {
        java.util.Date capturar_fecha_sistema = new java.util.Date();

        DateFormat dateFormat_fecha = new SimpleDateFormat("yyyyMMdd");
        String fecha_sistema = dateFormat_fecha.format(capturar_fecha_sistema);

        DateFormat dateFormat_hora = new SimpleDateFormat("HH:mm");
        String hora_sistema = dateFormat_hora.format(capturar_fecha_sistema);

        String feSeleccionada;
        int fec;

        //para obtener la fecha
        String formato = "yyyyMMdd";
        java.util.Date date = rSDateChooser2.getDatoFecha();
        feSeleccionada = String.valueOf(date);
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        feSeleccionada = (sdf.format(date));

        if (feSeleccionada.compareTo(fecha_sistema) < 0) {
            JOptionPane.showMessageDialog(null, "Error, Verifique la fecha de la nueva cita");
            JOptionPane.showMessageDialog(null, "Fecha Actual " + fecha_sistema + " Fecha Elejida " + feSeleccionada);
        } else if (feSeleccionada.compareTo(fecha_sistema) > 0) {

            validar_hora_cita_posterior_al_dia(feSeleccionada, fecha_sistema, hora_sistema, dtos.getSpecialist().getId(), dtos.getService().getId());
        } else {

            validarHoraCita_Del_Dia(feSeleccionada, fecha_sistema, hora_sistema, dtos.getSpecialist().getId(), dtos.getService().getId());
        }
    }

    public void validarHoraCita_Del_Dia(String feSeleccionada, String fecha_sistema, String hora_sistema, long id_especialista, long id_servicio) {
        rbx_1.setEnabled(false);

        try {
            ehorarios_citas = new horario_citas();
            ehorarios_citas_disponible = new horario_citas();
            ehorarios_citas_reservadas = new horario_citas();
            int registros = ctr.capturar_cantidad_fechas(feSeleccionada);

            if (registros > 0) {

                List horarios_citas_reservadas = ctr.capturar_cantidad_fechas_v1(feSeleccionada, id_especialista, id_servicio);
                List horarios_citas_disponible = ctr.listando_horario_disponible();

                if (horarios_citas_disponible != null && horarios_citas_disponible.size() != 0) {
                    if (horarios_citas_reservadas != null && horarios_citas_reservadas.size() != 0) {

                        for (int z = 0; z < horarios_citas_reservadas.size(); z++) {
                            ehorarios_citas_reservadas = (horario_citas) horarios_citas_reservadas.get(z);

                            for (int i = 0; i < horarios_citas_disponible.size(); i++) {
                                ehorarios_citas_disponible = (horario_citas) horarios_citas_disponible.get(i);

//                                if (ehorarios_citas_disponible.getCita_horario_inicio().equals(ehorarios_citas_reservadas.getCita_horario_inicio()) && ehorarios_citas_disponible.getCita_horario_fin().equals(ehorarios_citas_reservadas.getCita_horario_fin())) {
//                                    check_horario_validacion(ehorarios_citas_disponible.getId_horario(), false);
//
//                                } else {
                                // check_horario_validacion(ehorarios_citas_disponible.getId_horario(), true);
                                if (hora_sistema.compareTo(ehorarios_citas_disponible.getCita_horario_inicio()) >= 0 && hora_sistema.compareTo(ehorarios_citas_disponible.getCita_horario_fin()) >= 0) {

                                    check_horario_validacion(ehorarios_citas_disponible.getId_horario(), false);

                                } else {
                                    if (ehorarios_citas_disponible.getCita_horario_inicio().equals(ehorarios_citas_reservadas.getCita_horario_inicio()) && ehorarios_citas_disponible.getCita_horario_fin().equals(ehorarios_citas_reservadas.getCita_horario_fin())) {
                                        check_horario_validacion(ehorarios_citas_disponible.getId_horario(), false);
                                    } else {
                                        check_horario_validacion(ehorarios_citas_disponible.getId_horario(), true);

                                    }
                                }

                            }

                        }
                    } else {
                        if (horarios_citas_disponible != null) {
                            for (int i = 0; i < horarios_citas_disponible.size(); i++) {
                                ehorarios_citas = (horario_citas) horarios_citas_disponible.get(i);

                                if (hora_sistema.compareTo(ehorarios_citas.getCita_horario_inicio()) >= 0 && hora_sistema.compareTo(ehorarios_citas.getCita_horario_fin()) >= 0) {

                                    check_horario_validacion(ehorarios_citas.getId_horario(), false);

                                } else {
                                    check_horario_validacion(ehorarios_citas.getId_horario(), true);

                                }

                            }

                        } else {
                            checkbox_horario(false);
                        }
                    }
                } else {
                    checkbox_horario(false);
                }

            } else {

                List horarios_citas = ctr.listando_horario_disponible();
                if (horarios_citas != null) {
                    for (int i = 0; i < horarios_citas.size(); i++) {
                        ehorarios_citas = (horario_citas) horarios_citas.get(i);

                        if (hora_sistema.compareTo(ehorarios_citas.getCita_horario_inicio()) >= 0 && hora_sistema.compareTo(ehorarios_citas.getCita_horario_fin()) >= 0) {

                            check_horario_validacion(ehorarios_citas.getId_horario(), false);

                        } else {
                            check_horario_validacion(ehorarios_citas.getId_horario(), true);

                        }

                    }
                } else {
                    checkbox_horario(false);
                }

            }

        } catch (DaoException ex) {
        } catch (SQLException ex) {
        }
    }

    public void validar_hora_cita_posterior_al_dia(String feSeleccionada, String fecha_sistema, String hora_sistema, long id_especialista, long id_servicio) {
        try {
            ehorarios_citas_del_dia = new horario_citas();
            ehorarios_citas_disponible_del_dia = new horario_citas();
            ehorarios_citas_reservadas_del_dia = new horario_citas();
            int registros = ctr.capturar_cantidad_fechas(feSeleccionada);

            // if (registros > 0) {
            List horarios_citas_reservadas = ctr.capturar_cantidad_fechas_v1(feSeleccionada, id_especialista, id_servicio);
            List horarios_citas_disponible = ctr.listando_horario_disponible();

            if (horarios_citas_disponible != null && horarios_citas_disponible.size() != 0) {
                if (horarios_citas_reservadas != null && horarios_citas_reservadas.size() != 0) {
                    checkbox_horario(true);
                    for (int z = 0; z < horarios_citas_reservadas.size(); z++) {
                        ehorarios_citas_reservadas_del_dia = (horario_citas) horarios_citas_reservadas.get(z);

                        for (int i = 0; i < horarios_citas_disponible.size(); i++) {
                            ehorarios_citas_disponible_del_dia = (horario_citas) horarios_citas_disponible.get(i);

//                                if (ehorarios_citas_disponible.getCita_horario_inicio().equals(ehorarios_citas_reservadas_del_dia.getCita_horario_inicio()) && ehorarios_citas_disponible.getCita_horario_fin().equals(ehorarios_citas_reservadas_del_dia.getCita_horario_fin())) {
//                                    check_horario_validacion(ehorarios_citas_disponible.getId_horario(), false);
//
//                                } else {
                            // check_horario_validacion(ehorarios_citas_disponible.getId_horario(), true);
                            //   if (hora_sistema.compareTo(ehorarios_citas_disponible.getCita_horario_inicio()) >= 0 && hora_sistema.compareTo(ehorarios_citas_disponible.getCita_horario_fin()) >= 0) {
                            //     check_horario_validacion(ehorarios_citas_disponible.getId_horario(), false);
                            //  } else {
                            if (ehorarios_citas_disponible_del_dia.getCita_horario_inicio().equals(ehorarios_citas_reservadas_del_dia.getCita_horario_inicio()) && ehorarios_citas_disponible_del_dia.getCita_horario_fin().equals(ehorarios_citas_reservadas_del_dia.getCita_horario_fin())) {
                                check_horario_validacion(ehorarios_citas_disponible_del_dia.getId_horario(), false);
                            }
//else {
//                                check_horario_validacion(ehorarios_citas_disponible.getId_horario(), true);
//
//                            }
                        }

                    }

                } else {

                    checkbox_horario(true);
                }
            } else {
                checkbox_horario(false);

            }
//            } else {
//
//                List horarios_citas = cTR_05_Citas.listando_horario_disponible();
//                if (horarios_citas != null) {
//                    for (int i = 0; i < horarios_citas.size(); i++) {
//                        ehorarios_citas = (horario_citas) horarios_citas.get(i);
//
//                        if (hora_sistema.compareTo(ehorarios_citas.getCita_horario_inicio()) >= 0 && hora_sistema.compareTo(ehorarios_citas.getCita_horario_fin()) >= 0) {
//
//                            check_horario_validacion(ehorarios_citas.getId_horario(), false);
//
//                        } else {
//                            check_horario_validacion(ehorarios_citas.getId_horario(), true);
//
//                        }
//
//                    }
//                } else {
//                    checkbox_horario(false);
//                }
//
//            }

        } catch (DaoException ex) {
        } catch (SQLException ex) {
        }
    }

    public void checkbox_horario(boolean bloqueo) {
        rbx_1.setEnabled(bloqueo);
        rbx_2.setEnabled(bloqueo);
        rbx_3.setEnabled(bloqueo);
        rbx_4.setEnabled(bloqueo);
        rbx_5.setEnabled(bloqueo);
        rbx_6.setEnabled(bloqueo);
        rbx_7.setEnabled(bloqueo);
        rbx_8.setEnabled(bloqueo);
        rbx_9.setEnabled(bloqueo);
        rbx_10.setEnabled(bloqueo);
        rbx_11.setEnabled(bloqueo);
        rbx_12.setEnabled(bloqueo);
        rbx_13.setEnabled(bloqueo);
        rbx_14.setEnabled(bloqueo);
    }

    public void check_horario_validacion(int tipo, boolean bloqueo) {
        if (tipo == 1) {
            rbx_1.setEnabled(bloqueo);
        }
        if (tipo == 2) {
            rbx_2.setEnabled(bloqueo);
        }
        if (tipo == 3) {
            rbx_3.setEnabled(bloqueo);
        }
        if (tipo == 4) {
            rbx_4.setEnabled(bloqueo);
        }
        if (tipo == 5) {
            rbx_5.setEnabled(bloqueo);
        }
        if (tipo == 6) {
            rbx_6.setEnabled(bloqueo);
        }
        if (tipo == 7) {
            rbx_7.setEnabled(bloqueo);
        }
        if (tipo == 8) {
            rbx_8.setEnabled(bloqueo);
        }
        if (tipo == 9) {
            rbx_9.setEnabled(bloqueo);
        }
        if (tipo == 10) {
            rbx_10.setEnabled(bloqueo);
        }
        if (tipo == 11) {
            rbx_11.setEnabled(bloqueo);
        }
        if (tipo == 12) {
            rbx_12.setEnabled(bloqueo);
        }
        if (tipo == 13) {
            rbx_13.setEnabled(bloqueo);
        }
        if (tipo == 14) {
            rbx_14.setEnabled(bloqueo);
        }

    }
    private void btn_anular_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anular_citaActionPerformed
        if (dtos != null) {
            try {
                //modificar&& getSelectedButtonIndex(buttonGroup1) != 0
              
                    Citas repro = new Citas();
                    repro = dtos;
                    repro.setStatus(4);
                    boolean dato = ctr.Anular_citas(repro);
                    if (dato) {
                        this.tabla_citas_vigentes.setModel(ctr.ListCitas(1));
                        this.tabla_citas_reprogramadas.setModel(ctr.ListCitas(2));
                        this.tabla_citas_vencidas.setModel(ctr.ListCitas(3));
                        btn_eliminar_cita.setEnabled(false);
                        btn_reprogramar_cita.setEnabled(false);
                        btn_anular_cita.setEnabled(false);
                        dtos = new Citas();
                        rSDateChooser2.setDatoFecha(null);
                        limpiar_menu();
                        buttonGroup1.clearSelection();
                        checkbox_horario(false);
                    }
                
            } catch (SQLException ex) {
                Logger.getLogger(frm_07_gestionar_cita.class.getName()).log(Level.SEVERE, null, ex);
            } catch (DaoException ex) {
                Logger.getLogger(frm_07_gestionar_cita.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_anular_citaActionPerformed

    private boolean editable;
    private Citas dto;

    public Citas getDto() {
        return dto;
    }

    public void setDto(Citas dto) {
        this.dto = dto;
    }

    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_anular_cita;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_eliminar_cita;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_horario_disponible;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_reprogramar_cita;
    private javax.swing.ButtonGroup buttonGroup1;
    private LIB.FSGradientPanel fSGradientPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_especialista;
    private javax.swing.JLabel lbl_fecha_cita;
    private javax.swing.JLabel lbl_hora_cita;
    private javax.swing.JLabel lbl_patient;
    private javax.swing.JLabel lbl_phone;
    private javax.swing.JLabel lbl_servicio;
    private javax.swing.JLabel lblnro_cita;
    private rojeru_san.componentes.RSDateChooser rSDateChooser2;
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
    private rojerusan.RSTableMetro tabla_citas_reprogramadas;
    private rojerusan.RSTableMetro tabla_citas_vencidas;
    private rojerusan.RSTableMetro tabla_citas_vigentes;
    // End of variables declaration//GEN-END:variables
}
