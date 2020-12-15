
package WIN33CLC_VIEW;

import WIN30CLC_DAO.DaoException;
import WIN31CLC_DTO.Citas;
import WIN31CLC_DTO.Patient;
import WIN31CLC_DTO.horario_citas;
import WIN32CLC_CTR.CTR_02_Patient;
import WIN32CLC_CTR.CTR_05_Citas;
import WIN_2020_UTILS.Validators;
import static WIN_2020_UTILS.Validators.getSelectedButtonIndex;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.TableCellRenderer;

public class frm_UI_03_gestionar_citas extends javax.swing.JPanel {
   // CTR_02_Patient cTR_02_Patient = new CTR_02_Patient();
    
    private CTR_05_Citas ctr;
    private Citas dtos;
    private horario_citas ehorarios_citas;
    private horario_citas ehorarios_citas_disponible;
    private horario_citas ehorarios_citas_reservadas;
   // Patient patient = null;
    private horario_citas ehorarios_citas_del_dia;
    private horario_citas ehorarios_citas_disponible_del_dia;
    private horario_citas ehorarios_citas_reservadas_del_dia;
    
    
    
    
    public frm_UI_03_gestionar_citas() {
        initComponents();
        setBackground(new Color (255,255,255,0));
        
        p1.setColorPrimario(new Color (255,255,255,200));
        p1.setColorSecundario(new Color (255,255,255,200));
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
                        lbl_especialista.setText(dtos.getSpecialist().getName()+ " "+dtos.getSpecialist().getLastname()+" "+dtos.getSpecialist().getSurename());
                        lbl_patient.setText(dtos.getPatient().getName() + " " + dtos.getPatient().getLastname() + " " + dtos.getPatient().getSurename());
                        
                        lbl_correo.setText(dtos.getPatient().getEmail());
                        
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
                        lbl_especialista.setText(dtos.getSpecialist().getName()+ " "+dtos.getSpecialist().getLastname()+" "+dtos.getSpecialist().getSurename());
                        lbl_patient.setText(dtos.getPatient().getName() + " " + dtos.getPatient().getLastname() + " " + dtos.getPatient().getSurename());
                        lbl_correo.setText(dtos.getPatient().getEmail());
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
                        lbl_especialista.setText(dtos.getSpecialist().getName()+ " "+dtos.getSpecialist().getLastname()+" "+dtos.getSpecialist().getSurename());
                        lbl_patient.setText(dtos.getPatient().getName() + " " + dtos.getPatient().getLastname() + " " + dtos.getPatient().getSurename());
                        lbl_phone.setText(dtos.getPatient().getPhone());
                        lbl_correo.setText(dtos.getPatient().getEmail());
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
    
    public void enviar_confirmacion(Citas citas, Date fechacita, String horacita)

    {
    Properties propiedad = new Properties();
        propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable", "true");
        propiedad.setProperty("mail.smtp.port", "587");
        propiedad.setProperty("mail.smtp.auth", "true");
        
        Session sesion = Session.getDefaultInstance(propiedad);
        
        
       
        
        String correoEnvia = "dentalpro.clinica.notificacion@gmail.com";
        String contrasena = "Redes2015";
        String destinatario = citas.getPatient().getEmail();
        String asunto_cita = "Dental`s pro: Su cita se ha reprogramado" ;
        //String mensaje = txtMensaje.getText();
        String mensaje_cita = "DETALLE DE SU NUEVA CITA:  \n"+
                              "===================  \n"+
                               "\n"+
                               "Nombre del Paciente= " +citas.getPatient().getName()+" "+citas.getPatient().getLastname()+" "+citas.getPatient().getSurename()
                                +"\n Nombre del Especialista=  "+citas.getSpecialist().getName()+ " "+citas.getSpecialist().getLastname()+" "+citas.getSpecialist().getSurename()
                                +"\n Servicio odontologico=  "+citas.getService().getName()
                                +"\n Nueva Fecha de la cita=  "+ fechacita.toString()
                                +"\n Nueva Hora de la cita=  "+horacita
                                +"\n" 
                                +"\n -- LLege 30 minutos antes de la hora de su cita. "
                                +"\n" 
                                +"\n Dental`s pro le agradece su preferencia."

                ;
                
              
        MimeMessage mail = new MimeMessage(sesion);
        
        try {
            mail.setFrom(new InternetAddress (correoEnvia));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
            mail.setSubject(asunto_cita);
            mail.setText(mensaje_cita);
            
            
            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(correoEnvia,contrasena);
            transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();
            
            JOptionPane.showMessageDialog(null, "DentalSys: Se envio la confirmacion de la cita al Email del paciente");
            
            
            
            
            
        } catch (AddressException ex) {
            Logger.getLogger(frm_UI_02_reservar_cita.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(frm_UI_02_reservar_cita.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
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
        tabla_citas_vigentes = new rojerusan.RSTableMetro();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabla_citas_reprogramadas = new rojerusan.RSTableMetro();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabla_citas_vencidas = new rojerusan.RSTableMetro();
        p3 = new RSMaterialComponent.RSPanelMaterial();
        jLabel2 = new javax.swing.JLabel();
        lblnro_cita = new javax.swing.JLabel();
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
        p4 = new RSMaterialComponent.RSPanelMaterial();
        p7 = new javax.swing.JPanel();
        btn_horario_disponible = new newscomponents.RSButtonFlat_new();
        rSDateChooser2 = new rojeru_san.componentes.RSDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
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

        p1.setBackground(new java.awt.Color(204, 204, 204));
        p1.setBgShade(new java.awt.Color(255, 255, 255));
        p1.setColorPrimario(new java.awt.Color(200, 232, 250));
        p1.setColorSecundario(new java.awt.Color(200, 232, 250));
        p1.setGradiente(RSMaterialComponent.RSPanelBorderGradient.Gradiente.HORIZONTAL);
        p1.setRound(40);
        p1.setWidthBorder(0);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-horas-extras-100 (1).png"))); // NOI18N

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
        jLabel3.setText("Gestionar");

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 42)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("     Citas");

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_anular_cita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_eliminar_cita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_reprogramar_cita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(btn_anular_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
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

        tabla_citas_vigentes.setForeground(new java.awt.Color(51, 51, 51));
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
        tabla_citas_vigentes.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        tabla_citas_vigentes.setColorFilasForeground2(new java.awt.Color(51, 51, 51));
        tabla_citas_vigentes.setFont(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        tabla_citas_vigentes.setFuenteFilas(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        tabla_citas_vigentes.setFuenteFilasSelect(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        tabla_citas_vigentes.setFuenteHead(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        tabla_citas_vigentes.setGridColor(new java.awt.Color(153, 153, 153));
        tabla_citas_vigentes.setGrosorBordeFilas(0);
        tabla_citas_vigentes.setGrosorBordeHead(0);
        tabla_citas_vigentes.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setViewportView(tabla_citas_vigentes);

        jTabbedPane1.addTab("CITAS VIGENTES", jScrollPane5);

        tabla_citas_reprogramadas.setForeground(new java.awt.Color(51, 51, 51));
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
        tabla_citas_reprogramadas.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        tabla_citas_reprogramadas.setColorFilasForeground2(new java.awt.Color(51, 51, 51));
        tabla_citas_reprogramadas.setFont(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        tabla_citas_reprogramadas.setFuenteFilas(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        tabla_citas_reprogramadas.setFuenteFilasSelect(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        tabla_citas_reprogramadas.setFuenteHead(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        tabla_citas_reprogramadas.setGridColor(new java.awt.Color(153, 153, 153));
        tabla_citas_reprogramadas.setGrosorBordeFilas(0);
        tabla_citas_reprogramadas.setGrosorBordeHead(0);
        tabla_citas_reprogramadas.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane6.setViewportView(tabla_citas_reprogramadas);

        jTabbedPane1.addTab("CITAS PROGRAMADAS", jScrollPane6);

        tabla_citas_vencidas.setForeground(new java.awt.Color(51, 51, 51));
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
        tabla_citas_vencidas.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        tabla_citas_vencidas.setColorFilasForeground2(new java.awt.Color(51, 51, 51));
        tabla_citas_vencidas.setFont(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        tabla_citas_vencidas.setFuenteFilas(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        tabla_citas_vencidas.setFuenteFilasSelect(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        tabla_citas_vencidas.setFuenteHead(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        tabla_citas_vencidas.setGridColor(new java.awt.Color(153, 153, 153));
        tabla_citas_vencidas.setGrosorBordeFilas(0);
        tabla_citas_vencidas.setGrosorBordeHead(0);
        tabla_citas_vencidas.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane7.setViewportView(tabla_citas_vencidas);

        jTabbedPane1.addTab("CITAS VENCIDAS", jScrollPane7);

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        lblnro_cita.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lblnro_cita.setForeground(new java.awt.Color(255, 0, 51));
        lblnro_cita.setText("000000");

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
                    .addComponent(lblnro_cita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_phone, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(lbl_hora_cita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
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
                    .addComponent(lblnro_cita)
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

        p4.setBackground(new java.awt.Color(255, 255, 255));
        p4.setBgShade(new java.awt.Color(204, 204, 204));
        p4.setPixels(0);
        p4.setPreferredSize(new java.awt.Dimension(90, 62));
        p4.setRound(40);

        p7.setBackground(new java.awt.Color(255, 255, 255));

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

        rSDateChooser2.setColorBackground(new java.awt.Color(3, 111, 198));
        rSDateChooser2.setColorButtonHover(new java.awt.Color(3, 111, 198));
        rSDateChooser2.setColorDiaActual(new java.awt.Color(255, 0, 0));
        rSDateChooser2.setColorForeground(new java.awt.Color(3, 111, 198));
        rSDateChooser2.setFuente(new java.awt.Font("Poppins", 0, 15)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("FECHA DE LA CITA:");

        javax.swing.GroupLayout p7Layout = new javax.swing.GroupLayout(p7);
        p7.setLayout(p7Layout);
        p7Layout.setHorizontalGroup(
            p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p7Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addGap(18, 22, Short.MAX_VALUE)
                .addComponent(rSDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btn_horario_disponible, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        p7Layout.setVerticalGroup(
            p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p7Layout.createSequentialGroup()
                .addGroup(p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_horario_disponible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rSDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(p7Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(688, 187));

        buttonGroup1.add(rbx_1);
        rbx_1.setForeground(new java.awt.Color(0, 0, 0));
        rbx_1.setText("8:00 - 8:30");
        rbx_1.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_1.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_1.setFocusPainted(false);
        rbx_1.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_1.setRippleColor(new java.awt.Color(3, 111, 198));

        buttonGroup1.add(rbx_2);
        rbx_2.setForeground(new java.awt.Color(0, 0, 0));
        rbx_2.setText("8:30 - 9:00");
        rbx_2.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_2.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_2.setFocusPainted(false);
        rbx_2.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_2.setRippleColor(new java.awt.Color(3, 111, 198));

        buttonGroup1.add(rbx_3);
        rbx_3.setForeground(new java.awt.Color(0, 0, 0));
        rbx_3.setText("9:00 - 9:30");
        rbx_3.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_3.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rbx_3.setFocusPainted(false);
        rbx_3.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_3.setRippleColor(new java.awt.Color(3, 111, 198));

        buttonGroup1.add(rbx_4);
        rbx_4.setForeground(new java.awt.Color(0, 0, 0));
        rbx_4.setText("9:30 - 10:00");
        rbx_4.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_4.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_4.setFocusPainted(false);
        rbx_4.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_4.setRippleColor(new java.awt.Color(3, 111, 198));

        buttonGroup1.add(rbx_5);
        rbx_5.setForeground(new java.awt.Color(0, 0, 0));
        rbx_5.setText("10:00 - 10:30");
        rbx_5.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_5.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_5.setFocusPainted(false);
        rbx_5.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_5.setRippleColor(new java.awt.Color(3, 111, 198));

        buttonGroup1.add(rbx_6);
        rbx_6.setForeground(new java.awt.Color(0, 0, 0));
        rbx_6.setText("10:30 - 11:00");
        rbx_6.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_6.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_6.setFocusPainted(false);
        rbx_6.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_6.setRippleColor(new java.awt.Color(3, 111, 198));

        buttonGroup1.add(rbx_7);
        rbx_7.setForeground(new java.awt.Color(0, 0, 0));
        rbx_7.setText("11:00 - 11:30");
        rbx_7.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_7.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_7.setFocusPainted(false);
        rbx_7.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_7.setRippleColor(new java.awt.Color(3, 111, 198));

        buttonGroup1.add(rbx_8);
        rbx_8.setForeground(new java.awt.Color(0, 0, 0));
        rbx_8.setText("11:30 - 12:00");
        rbx_8.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_8.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_8.setFocusPainted(false);
        rbx_8.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_8.setRippleColor(new java.awt.Color(3, 111, 198));

        rbx_9.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(rbx_9);
        rbx_9.setForeground(new java.awt.Color(0, 0, 0));
        rbx_9.setText("12:00 - 12:30");
        rbx_9.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_9.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_9.setFocusPainted(false);
        rbx_9.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_9.setRippleColor(new java.awt.Color(3, 111, 198));

        buttonGroup1.add(rbx_10);
        rbx_10.setForeground(new java.awt.Color(0, 0, 0));
        rbx_10.setText("12:30 - 13:00");
        rbx_10.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_10.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_10.setFocusPainted(false);
        rbx_10.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_10.setRippleColor(new java.awt.Color(3, 111, 198));

        buttonGroup1.add(rbx_11);
        rbx_11.setForeground(new java.awt.Color(0, 0, 0));
        rbx_11.setText("13:00 - 13:30");
        rbx_11.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_11.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_11.setFocusPainted(false);
        rbx_11.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_11.setRippleColor(new java.awt.Color(3, 111, 198));

        buttonGroup1.add(rbx_12);
        rbx_12.setForeground(new java.awt.Color(0, 0, 0));
        rbx_12.setText("13:30 - 14:00");
        rbx_12.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_12.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_12.setFocusPainted(false);
        rbx_12.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_12.setRippleColor(new java.awt.Color(3, 111, 198));

        buttonGroup1.add(rbx_13);
        rbx_13.setForeground(new java.awt.Color(0, 0, 0));
        rbx_13.setText("14:00 - 14:00");
        rbx_13.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_13.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_13.setFocusPainted(false);
        rbx_13.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_13.setRippleColor(new java.awt.Color(3, 111, 198));

        buttonGroup1.add(rbx_14);
        rbx_14.setForeground(new java.awt.Color(0, 0, 0));
        rbx_14.setText("14:30 - 15:00");
        rbx_14.setColorCheck(new java.awt.Color(3, 111, 198));
        rbx_14.setColorUnCheck(new java.awt.Color(3, 111, 198));
        rbx_14.setFocusPainted(false);
        rbx_14.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rbx_14.setRippleColor(new java.awt.Color(3, 111, 198));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rbx_9, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(rbx_5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(rbx_1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(rbx_13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbx_10, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(rbx_6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(rbx_2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(rbx_14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbx_11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(rbx_7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(rbx_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbx_8, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(rbx_4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(rbx_12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbx_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbx_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbx_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbx_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbx_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbx_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbx_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbx_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbx_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbx_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbx_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbx_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbx_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbx_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout p4Layout = new javax.swing.GroupLayout(p4);
        p4.setLayout(p4Layout);
        p4Layout.setHorizontalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p4Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                    .addComponent(p7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        p4Layout.setVerticalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addComponent(p3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
                    .addComponent(p4, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p3, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void btn_reprogramar_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reprogramar_citaActionPerformed
 if (dtos != null) {
            try {
                //modificar&& getSelectedButtonIndex(buttonGroup1) != 0
                if (rSDateChooser2.getDatoFecha() != null) {
                    Citas repro = new Citas();
                   
                    
                     List<horario_citas> repro2 = new ArrayList<horario_citas>();


                    
                    repro = dtos;
                    repro.setStatus(2);
                    java.util.Date date = rSDateChooser2.getDatoFecha();
                    java.sql.Date date1 = new java.sql.Date(date.getTime());
                    repro.setFechadecita(date1);
                    horario_citas dto4 = new horario_citas();
                    dto4.setId_horario(getSelectedButtonIndex(buttonGroup1));
                    
                    repro2 = ctr.listando_horario_disponible();
                    
                    for (int i=0;i<repro2.size(); i++ )
                    {
                        if(dto4.getId_horario()==repro2.get(i).getId_horario())
                                {
                                    dto4.setCita_horario_inicio(repro2.get(i).getCita_horario_inicio());
                                    dto4.setCita_horario_fin(repro2.get(i).getCita_horario_fin());
                                    break;
                                }
                        
                        
                    }
                    
                    //dto4.setCita_horario_inicio(C);
                    
                    
                    
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
                        
                        String hora = Validators.getSelectedButtonText(buttonGroup1);
                        enviar_confirmacion(repro,date1,repro.getHorario_citas().getCita_horario_inicio()+" "+repro.getHorario_citas().getCita_horario_fin());
                        
                        
                        
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

    private void btn_eliminar_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_citaActionPerformed
     
    }//GEN-LAST:event_btn_eliminar_citaActionPerformed

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
    private newscomponents.RSButtonFlat_new btn_anular_cita;
    private newscomponents.RSButtonFlat_new btn_eliminar_cita;
    private newscomponents.RSButtonFlat_new btn_horario_disponible;
    private newscomponents.RSButtonFlat_new btn_reprogramar_cita;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_correo;
    private javax.swing.JLabel lbl_especialista;
    private javax.swing.JLabel lbl_fecha_cita;
    private javax.swing.JLabel lbl_hora_cita;
    private javax.swing.JLabel lbl_patient;
    private javax.swing.JLabel lbl_phone;
    private javax.swing.JLabel lbl_servicio;
    private javax.swing.JLabel lblnro_cita;
    private RSMaterialComponent.RSPanelBorderGradient p1;
    private RSMaterialComponent.RSPanelMaterial p2;
    private RSMaterialComponent.RSPanelMaterial p3;
    private RSMaterialComponent.RSPanelMaterial p4;
    private javax.swing.JPanel p7;
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
