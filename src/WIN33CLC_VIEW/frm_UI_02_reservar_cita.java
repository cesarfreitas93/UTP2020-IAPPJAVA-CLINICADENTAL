
package WIN33CLC_VIEW;

import WIN30CLC_DAO.DaoException;
import WIN31CLC_DTO.Citas;
import WIN31CLC_DTO.Patient;
import WIN31CLC_DTO.Service;
import WIN31CLC_DTO.Specialist;
import WIN31CLC_DTO.horario_citas;
import WIN32CLC_CTR.CTR_02_Patient;
import WIN32CLC_CTR.CTR_03_Service;
import WIN32CLC_CTR.CTR_04_Specialist;
import WIN32CLC_CTR.CTR_05_Citas;
import WIN_2020_UTILS.Validators;
import static WIN_2020_UTILS.Validators.getSelectedButtonIndex;
import static WIN_2020_UTILS.Validators.getSelectedButtonText;
import static WIN_2020_UTILS.Validators.inputStringIngresado;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
import javax.swing.JOptionPane;
import rojerusan.RSNotifyFade;



public class frm_UI_02_reservar_cita extends javax.swing.JPanel {

    CTR_02_Patient cTR_02_Patient = new CTR_02_Patient();
    CTR_05_Citas cTR_05_Citas = new CTR_05_Citas();

    ArrayList<Service> service_list = null;
    ArrayList<Specialist> specialist_list = null;
    Patient patient = null;
    
    
    public frm_UI_02_reservar_cita() {
        initComponents();
        LoadData();
        btn_nueva_cita.setEnabled(true);
        btn_cancelar_cambios.setEnabled(false);
        btn_guardar_cita.setEnabled(false);
        setBackground(new Color (255,255,255,0));
        p1.setColorPrimario(new Color (255,255,255,200));
        p1.setColorSecundario(new Color (255,255,255,200));
          botones_block();
       
    }
    
           public void limpiar() {

        txt_dni.setText("");
        cbx_service.setSelectedItem("--Seleccionar--");
        cbx_especialista.setSelectedItem("--Seleccionar--");
       // buttonGroup1.clearSelection();
        lbl_patient.setText("Nombre y Apellidos Completos");

    }
    public void botones_block()
    {
        
        btn_guardar_cita.setEnabled(false);
        btn_cancelar_cambios.setEnabled(false);
        txt_dni.setEnabled(false);
        btn_buscar_paciente.setEnabled(false);
        cbx_service.setEnabled(false);
        cbx_especialista.setEnabled(false);
        btn_horario_disponible.setEnabled(false);
       
            
    }
          public void botones_Unlock()
    {
           
        txt_dni.setEnabled(true);
        btn_buscar_paciente.setEnabled(true);
        cbx_service.setEnabled(true);
        cbx_especialista.setEnabled(true);
        btn_horario_disponible.setEnabled(true);
        
            
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
        String asunto_cita = "<html><b>Dental`s pro</b>: Cita Revervada con Exito</html>" ;
        //String mensaje = txtMensaje.getText();
        String mensaje_cita = "DETALLE DE LA CITA:  \n"+
                              "===================  \n"+
                               "\n"+
                               "Nombre del Paciente= " +citas.getPatient().getName()+" "+citas.getPatient().getLastname()+" "+citas.getPatient().getSurename()
                                +"\n Nombre del Especialista= "+citas.getSpecialist().getName()+ " "+citas.getSpecialist().getLastname()+" "+citas.getSpecialist().getSurename()
                                +"\n Servicio odontologico= "+citas.getService().getName()
                                +"\n Fecha de la cita= "+ fechacita.toString()
                                +"\n Hora de la cita= "+horacita
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
 void loadmam() {

    }

    public void LoadData() {
        try {
            checkbox_horario(false);
            // traer los servicios
            CTR_03_Service ctr_Service = new CTR_03_Service();
            service_list = new ArrayList<Service>();
            Service service = new Service();
            cbx_service.removeAllItems();
            service.setId(0);
            service.setName("--Seleccionar--");
            service.setPrice(0);
            service_list.add(service);
            service_list.addAll(ctr_Service.listService());
            if (service_list != null) {
                for (int i = 0; i < service_list.size(); i++) {
                    cbx_service.addItem(service_list.get(i).getName());
                }
            }

            // traer los especialistar por servicio
            reset_cbx_specialist();

            CTR_04_Specialist cTR_04_Specialist = new CTR_04_Specialist();

            ActionListener actionListener = new ActionListener() {
                public void actionPerformed(ActionEvent actionEvent) {
                    //System.out.println("Selected: " + cbx_service.getSelectedItem());
                    //System.out.println(", Position: " + cbx_service.getSelectedIndex());
                    if (cbx_service.getSelectedIndex() > 0) {
                        try {
                            specialist_list = new ArrayList<Specialist>();
                            Specialist Specialist_e = new Specialist();
                            cbx_especialista.removeAllItems();
                            Specialist_e.setId(0);
                            Specialist_e.setName("--Seleccionar--");
                            Specialist_e.setFullname("--Seleccionar--");

                            specialist_list.add(Specialist_e);
                            Service parametro = service_list.get(cbx_service.getSelectedIndex());
                            specialist_list.addAll(cTR_04_Specialist.listSpecialist(parametro.getId()));
                            cbx_especialista.setEnabled(true);
                            if (specialist_list.size() > 0) {
                                for (int i = 0; i < specialist_list.size(); i++) {
                                    cbx_especialista.addItem(specialist_list.get(i).getFullname());
                                }
                            } else {
                                reset_cbx_specialist();
                            }

                        } catch (SQLException ex) {
                            Logger.getLogger(frm_03_reservar_cita.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        reset_cbx_specialist();
                    }
                }
            };
            // add event al cbs_Service

            cbx_service.addActionListener(actionListener);

        } catch (SQLException ex) {
            Logger.getLogger(frm_03_reservar_cita.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DaoException ex) {
            Logger.getLogger(frm_03_reservar_cita.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void reset_cbx_specialist() {

        specialist_list = new ArrayList<Specialist>();
        Specialist Specialist_e = new Specialist();
        cbx_especialista.removeAllItems();
        Specialist_e.setId(0);
        Specialist_e.setName("--Seleccionar--");
        Specialist_e.setFullname("--Seleccionar--");
        specialist_list.add(Specialist_e);
        cbx_especialista.addItem(Specialist_e.getFullname());
        cbx_especialista.setEnabled(false);

    }


    @SuppressWarnings("unchecked")
    
    
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
            Service e_service = service_list.get(cbx_service.getSelectedIndex());
            Specialist e_especialista = specialist_list.get(cbx_especialista.getSelectedIndex());
            validar_hora_cita_posterior_al_dia(feSeleccionada, fecha_sistema, hora_sistema, e_especialista.getId(), e_service.getId());
        } else {
            Service e_service = service_list.get(cbx_service.getSelectedIndex());
            Specialist e_especialista = specialist_list.get(cbx_especialista.getSelectedIndex());
            validarHoraCita_Del_Dia(feSeleccionada, fecha_sistema, hora_sistema, e_especialista.getId(), e_service.getId());
        }
    }

    public void validarHoraCita_Del_Dia(String feSeleccionada, String fecha_sistema, String hora_sistema, long id_especialista, long id_servicio) {
        rbx_1.setEnabled(false);

        try {
            horario_citas ehorarios_citas = new horario_citas();
            horario_citas ehorarios_citas_disponible = new horario_citas();
            horario_citas ehorarios_citas_reservadas = new horario_citas();
            int registros = cTR_05_Citas.capturar_cantidad_fechas(feSeleccionada);

            if (registros > 0) {

                List horarios_citas_reservadas = cTR_05_Citas.capturar_cantidad_fechas_v1(feSeleccionada, id_especialista, id_servicio);
                List horarios_citas_disponible = cTR_05_Citas.listando_horario_disponible();

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

                List horarios_citas = cTR_05_Citas.listando_horario_disponible();
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
            horario_citas ehorarios_citas = new horario_citas();
            horario_citas ehorarios_citas_disponible = new horario_citas();
            horario_citas ehorarios_citas_reservadas = new horario_citas();
            int registros = cTR_05_Citas.capturar_cantidad_fechas(feSeleccionada);

            // if (registros > 0) {
            List horarios_citas_reservadas = cTR_05_Citas.capturar_cantidad_fechas_v1(feSeleccionada, id_especialista, id_servicio);
            List horarios_citas_disponible = cTR_05_Citas.listando_horario_disponible();

            if (horarios_citas_disponible != null && horarios_citas_disponible.size() != 0) {
                if (horarios_citas_reservadas != null && horarios_citas_reservadas.size() != 0) {
                    checkbox_horario(true);
                    for (int z = 0; z < horarios_citas_reservadas.size(); z++) {
                        ehorarios_citas_reservadas = (horario_citas) horarios_citas_reservadas.get(z);

                        for (int i = 0; i < horarios_citas_disponible.size(); i++) {
                            ehorarios_citas_disponible = (horario_citas) horarios_citas_disponible.get(i);

//                                if (ehorarios_citas_disponible.getCita_horario_inicio().equals(ehorarios_citas_reservadas.getCita_horario_inicio()) && ehorarios_citas_disponible.getCita_horario_fin().equals(ehorarios_citas_reservadas.getCita_horario_fin())) {
//                                    check_horario_validacion(ehorarios_citas_disponible.getId_horario(), false);
//
//                                } else {
                            // check_horario_validacion(ehorarios_citas_disponible.getId_horario(), true);
                            //   if (hora_sistema.compareTo(ehorarios_citas_disponible.getCita_horario_inicio()) >= 0 && hora_sistema.compareTo(ehorarios_citas_disponible.getCita_horario_fin()) >= 0) {
                            //     check_horario_validacion(ehorarios_citas_disponible.getId_horario(), false);
                            //  } else {
                            if (ehorarios_citas_disponible.getCita_horario_inicio().equals(ehorarios_citas_reservadas.getCita_horario_inicio()) && ehorarios_citas_disponible.getCita_horario_fin().equals(ehorarios_citas_reservadas.getCita_horario_fin())) {
                                check_horario_validacion(ehorarios_citas_disponible.getId_horario(), false);
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
    
  
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        p2 = new RSMaterialComponent.RSPanelMaterial();
        jLabel10 = new javax.swing.JLabel();
        lbl_patient = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btn_buscar_paciente = new newscomponents.RSButtonFlat_new();
        txt_dni = new rscomponentshade.RSFormatFieldShade();
        p3 = new RSMaterialComponent.RSPanelMaterial();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbx_especialista = new RSMaterialComponent.RSComboBoxMaterial();
        cbx_service = new RSMaterialComponent.RSComboBoxMaterial();
        p1 = new RSMaterialComponent.RSPanelBorderGradient();
        jLabel12 = new javax.swing.JLabel();
        btn_nueva_cita = new newscomponents.RSButtonFlat_new();
        btn_guardar_cita = new newscomponents.RSButtonFlat_new();
        btn_cancelar_cambios = new newscomponents.RSButtonFlat_new();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        p4 = new RSMaterialComponent.RSPanelMaterial();
        p7 = new javax.swing.JPanel();
        btn_horario_disponible = new newscomponents.RSButtonFlat_new();
        rSDateChooser2 = new rojeru_san.componentes.RSDateChooser();
        jLabel11 = new javax.swing.JLabel();
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

        p2.setBackground(new java.awt.Color(255, 255, 255));
        p2.setBgShade(new java.awt.Color(204, 204, 204));
        p2.setPixels(0);
        p2.setPreferredSize(new java.awt.Dimension(90, 62));
        p2.setRound(40);

        jLabel10.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Paciente:");

        lbl_patient.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lbl_patient.setForeground(new java.awt.Color(51, 51, 51));
        lbl_patient.setText("Nombres y Apellidos Completos");

        jLabel14.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Dni:");

        btn_buscar_paciente.setBackground(new java.awt.Color(139, 198, 255));
        btn_buscar_paciente.setForeground(new java.awt.Color(51, 51, 51));
        btn_buscar_paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-encuentra-hombre-usuario-24.png"))); // NOI18N
        btn_buscar_paciente.setText("Buscar Paciente");
        btn_buscar_paciente.setBorderPainted(false);
        btn_buscar_paciente.setContentAreaFilled(true);
        btn_buscar_paciente.setCornerRound(45);
        btn_buscar_paciente.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_buscar_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_pacienteActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(lbl_patient, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
                    .addGroup(p2Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_dni, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_buscar_paciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(btn_buscar_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lbl_patient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        lbl_patient.getAccessibleContext().setAccessibleName("");

        p3.setBackground(new java.awt.Color(255, 255, 255));
        p3.setBgShade(new java.awt.Color(204, 204, 204));
        p3.setPixels(0);
        p3.setPreferredSize(new java.awt.Dimension(90, 62));
        p3.setRound(40);

        jLabel8.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Servicios");

        jLabel13.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Especialista");

        cbx_especialista.setForeground(new java.awt.Color(51, 51, 51));
        cbx_especialista.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija una Opcion.", "RSItem 2", "RSItem 3", "RSItem 4" }));
        cbx_especialista.setColorMaterial(new java.awt.Color(10, 117, 167));
        cbx_especialista.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        cbx_especialista.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        cbx_especialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_especialistaActionPerformed(evt);
            }
        });

        cbx_service.setForeground(new java.awt.Color(51, 51, 51));
        cbx_service.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija una Opcion.", "RSItem 2", "RSItem 3", "RSItem 4" }));
        cbx_service.setColorMaterial(new java.awt.Color(10, 117, 167));
        cbx_service.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        cbx_service.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        cbx_service.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_serviceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addContainerGap(125, Short.MAX_VALUE)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_service, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_especialista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_especialista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_service, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        p1.setBackground(new java.awt.Color(204, 204, 204));
        p1.setBgShade(new java.awt.Color(255, 255, 255));
        p1.setColorPrimario(new java.awt.Color(200, 232, 250));
        p1.setColorSecundario(new java.awt.Color(200, 232, 250));
        p1.setGradiente(RSMaterialComponent.RSPanelBorderGradient.Gradiente.HORIZONTAL);
        p1.setRound(40);
        p1.setWidthBorder(0);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-calendario-100 (1).png"))); // NOI18N

        btn_nueva_cita.setBackground(new java.awt.Color(139, 198, 255));
        btn_nueva_cita.setForeground(new java.awt.Color(51, 51, 51));
        btn_nueva_cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-agregar-archivo-24.png"))); // NOI18N
        btn_nueva_cita.setText("Nueva Cita");
        btn_nueva_cita.setBorderPainted(false);
        btn_nueva_cita.setContentAreaFilled(true);
        btn_nueva_cita.setCornerRound(45);
        btn_nueva_cita.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_nueva_cita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nueva_citaActionPerformed(evt);
            }
        });

        btn_guardar_cita.setBackground(new java.awt.Color(139, 198, 255));
        btn_guardar_cita.setForeground(new java.awt.Color(51, 51, 51));
        btn_guardar_cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-guardar-24.png"))); // NOI18N
        btn_guardar_cita.setText("Guardar Cita");
        btn_guardar_cita.setBorderPainted(false);
        btn_guardar_cita.setContentAreaFilled(true);
        btn_guardar_cita.setCornerRound(45);
        btn_guardar_cita.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_guardar_cita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_citaActionPerformed(evt);
            }
        });

        btn_cancelar_cambios.setBackground(new java.awt.Color(139, 198, 255));
        btn_cancelar_cambios.setForeground(new java.awt.Color(51, 51, 51));
        btn_cancelar_cambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/cancelar.png"))); // NOI18N
        btn_cancelar_cambios.setText("Cancelar Cambios");
        btn_cancelar_cambios.setBorderPainted(false);
        btn_cancelar_cambios.setContentAreaFilled(true);
        btn_cancelar_cambios.setCornerRound(45);
        btn_cancelar_cambios.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_cancelar_cambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelar_cambiosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 42)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Reservar");

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 42)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Citas");

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(81, 81, 81))
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_nueva_cita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cancelar_cambios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_guardar_cita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(101, 101, 101)
                .addComponent(btn_nueva_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_guardar_cita, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_cancelar_cambios, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jLabel11.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("FECHA DE LA CITA:");

        javax.swing.GroupLayout p7Layout = new javax.swing.GroupLayout(p7);
        p7.setLayout(p7Layout);
        p7Layout.setHorizontalGroup(
            p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p7Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addGap(18, 22, Short.MAX_VALUE)
                .addComponent(rSDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btn_horario_disponible, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        p7Layout.setVerticalGroup(
            p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p7Layout.createSequentialGroup()
                .addGroup(p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p7Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(p7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_horario_disponible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rSDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(p7Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel11)))
                .addContainerGap(24, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
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
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                    .addComponent(p7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        p4Layout.setVerticalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p3, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
                    .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
                    .addComponent(p4, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(p4, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE))
            .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_especialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_especialistaActionPerformed
    
    }//GEN-LAST:event_cbx_especialistaActionPerformed

    private void cbx_serviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_serviceActionPerformed

    }//GEN-LAST:event_cbx_serviceActionPerformed

    private void btn_nueva_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nueva_citaActionPerformed
botones_Unlock();
        
        btn_guardar_cita.setEnabled(true);
        btn_cancelar_cambios.setEnabled(true);
    }//GEN-LAST:event_btn_nueva_citaActionPerformed

    private void btn_guardar_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_citaActionPerformed
 String msg = "";
        int focus = 0;
        if (txt_dni.getText().length() < 8 || txt_dni.getText().length() > 8) {
            msg = msg + "Ingrese un DNI válido \n";
            focus = 0;
        } else if (!inputStringIngresado(txt_dni.getText())) {
            msg = msg + "Ingrese Dni \n";
            focus = 1;
        } else if (cbx_service.getSelectedIndex() == 0) {
            msg = msg + "Seleccione Servicio \n";
            focus = 2;

        } else if (cbx_especialista.getSelectedIndex() == 0) {
            msg = msg + "Seleccione Especialista \n";
            focus = 3;

        }

        try {
            if (msg.length() > 0) {
                JOptionPane.showMessageDialog(null, msg,
                        "Dental SyS", JOptionPane.ERROR_MESSAGE);
                switch (focus) {
                    case 0:
                        txt_dni.requestFocus();
                        break;
                    case 1:
                        txt_dni.requestFocus();
                        break;
                    case 2:
                        cbx_service.requestFocus();
                        break;
                    case 3:
                        cbx_service.requestFocus();
                        break;
                    default:
                        txt_dni.requestFocus();
                        break;
                }
            } else {
                //patient = cTR_02_Patient.SelectPatient(txt_dni.getText());
               // if (patient.getId() == 0) {

                    Service e_service = service_list.get(cbx_service.getSelectedIndex());
                    Specialist e_especialista = specialist_list.get(cbx_especialista.getSelectedIndex());
                    Citas citas_e = new Citas();
                    java.util.Date date = rSDateChooser2.getDatoFecha();
                    java.sql.Date date1 = new java.sql.Date(date.getTime());
                    citas_e.setFechadecita(date1);
                    citas_e.setStatus(1);
                    citas_e.setPatient_id(patient.getId());
                    citas_e.setService_id(e_service.getId());
                    citas_e.setEspecialista_id(e_especialista.getId());
                    citas_e.setId_horario(getSelectedButtonIndex(buttonGroup1));
                    
                    citas_e.setService(e_service);
                    citas_e.setSpecialist(e_especialista);
                    citas_e.setPatient(patient);

                    String hora = Validators.getSelectedButtonText(buttonGroup1);

                    enviar_confirmacion(citas_e,date1,hora);


                    botones_block();
                    limpiar();

                    cTR_05_Citas.insert(citas_e);
                    
                    new rojerusan.RSNotifyFade("DentalSys", "Se reservo correctamente la cita del paciente en el sistema.", 7,
                    RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                    
                    
                    btn_cancelar_cambios.setEnabled(false);
                    btn_guardar_cita.setEnabled(false);
                    btn_nueva_cita.setEnabled(true);
                //} else {
                    //new rojerusan.RSNotifyFade("DentalSys", "No se guardaron los datos! \n Intente nuevamente", 7,
                            //RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.WARNING).setVisible(true);
               // }
            }

        } catch (SQLException ex) {
            // Logger.getLogger(frm_02_register_patient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DaoException ex) {
            //Logger.getLogger(frm_02_register_patient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_guardar_citaActionPerformed

    private void btn_cancelar_cambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelar_cambiosActionPerformed
limpiar();
botones_block();
    }//GEN-LAST:event_btn_cancelar_cambiosActionPerformed

    private void btn_buscar_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_pacienteActionPerformed
  try {
            patient = cTR_02_Patient.SelectPatient(txt_dni.getText());
            lbl_patient.setText(patient.getName() + ", " + patient.getLastname() + " " + patient.getSurename());
        } catch (SQLException ex) {
            lbl_patient.setText(ex.getMessage());
        } catch (DaoException ex) {
            lbl_patient.setText(ex.getMessage());
        }    
    }//GEN-LAST:event_btn_buscar_pacienteActionPerformed

    private void btn_horario_disponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_horario_disponibleActionPerformed
   if (rSDateChooser2.getDatoFecha() == null) {
            JOptionPane.showMessageDialog(null, "Elija la fecha de la cita primero");
        } else {

            if (cbx_service.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Seleccione Servicio");

            } else if (cbx_especialista.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Seleccione Especialista");

            } else {
                validarFechaCita();//procedimiento para mostrar las horas disponibles segun la fecha elegida
            }
        }
    }//GEN-LAST:event_btn_horario_disponibleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btn_buscar_paciente;
    private newscomponents.RSButtonFlat_new btn_cancelar_cambios;
    private newscomponents.RSButtonFlat_new btn_guardar_cita;
    private newscomponents.RSButtonFlat_new btn_horario_disponible;
    private newscomponents.RSButtonFlat_new btn_nueva_cita;
    private javax.swing.ButtonGroup buttonGroup1;
    private RSMaterialComponent.RSComboBoxMaterial cbx_especialista;
    private RSMaterialComponent.RSComboBoxMaterial cbx_service;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl_patient;
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
    private rscomponentshade.RSFormatFieldShade txt_dni;
    // End of variables declaration//GEN-END:variables
}
