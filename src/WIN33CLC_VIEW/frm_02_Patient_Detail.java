/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN33CLC_VIEW;
import WIN30CLC_DAO.DaoException;
import WIN31CLC_DTO.Patient;
import WIN32CLC_CTR.CTR_02_Patient;
import java.awt.Color;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.JSONException;
import rojerusan.RSNotifyFade;
import rojerusan.RSNotifyShadowFade;
/**
 *
 * @author Cesar
 */
public class frm_02_Patient_Detail extends javax.swing.JPanel {

    
    public frm_02_Patient_Detail() {
        initComponents();
         setBackground(new Color (255,255,255,253));
         
         
         txt_dni.setBackground(new Color (0,0,0,1));
         txt_name.setBackground(new Color (0,0,0,1));
         txt_apellidoPAT.setBackground(new Color (0,0,0,1));
         txt_apellidoMAT.setBackground(new Color (0,0,0,1));
         txt_direccion.setBackground(new Color (0,0,0,1));
         txt_direccion.setBackground(new Color (0,0,0,1));
         txt_email.setBackground(new Color (0,0,0,1));
         
                
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fSGradientPanel2 = new LIB.FSGradientPanel();
        jLabel12 = new javax.swing.JLabel();
        btn_cancelar_cambios = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_nuevo_paciente = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_modificar_paciente = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_save = new RSMaterialComponent.RSButtonMaterialGradientOne();
        cbx_departamento = new RSMaterialComponent.RSComboBoxMaterial();
        cbx_provincia = new RSMaterialComponent.RSComboBoxMaterial();
        cbx_distrito = new RSMaterialComponent.RSComboBoxMaterial();
        txt_buscar_reniec = new RSMaterialComponent.RSButtonMaterialGradientOne();
        txt_dni = new rojerusan.RSMetroTextPlaceHolder();
        txt_apellidoMAT = new rojerusan.RSMetroTextPlaceHolder();
        txt_name = new rojerusan.RSMetroTextPlaceHolder();
        txt_apellidoPAT = new rojerusan.RSMetroTextPlaceHolder();
        txt_phone = new rojerusan.RSMetroTextPlaceHolder();
        txt_email = new rojerusan.RSMetroTextPlaceHolder();
        txt_direccion = new rojerusan.RSMetroTextPlaceHolder();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("DNI");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel2.setText("Nombres");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel3.setText("Apellido Paterno");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel4.setText("Apellido Materno");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel5.setText("Teléfono");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel6.setText("Email");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setText("Direccion");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel8.setText("Departamento");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel9.setText("Provincia");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel10.setText("Distrito");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 390, -1, -1));

        jLabel11.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(10, 86, 145));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("x");
        jLabel11.setToolTipText("Cerrar la Aplicacion");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, -1, -1));

        fSGradientPanel2.setFSEndColor(new java.awt.Color(101, 208, 250));
        fSGradientPanel2.setFSStartColor(new java.awt.Color(3, 111, 198));
        fSGradientPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                fSGradientPanel2MouseDragged(evt);
            }
        });
        fSGradientPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fSGradientPanel2MousePressed(evt);
            }
        });
        fSGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-gestión-de-clientes-100.png"))); // NOI18N
        fSGradientPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 110, 90));

        btn_cancelar_cambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-cancelar-30.png"))); // NOI18N
        btn_cancelar_cambios.setText("Cancelar Cambios");
        btn_cancelar_cambios.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn_cancelar_cambios.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn_cancelar_cambios.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn_cancelar_cambios.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn_cancelar_cambios.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        fSGradientPanel2.add(btn_cancelar_cambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 220, -1));

        btn_nuevo_paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-añadir-usuario-masculino-30.png"))); // NOI18N
        btn_nuevo_paciente.setText("Nuevo Paciente");
        btn_nuevo_paciente.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn_nuevo_paciente.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn_nuevo_paciente.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn_nuevo_paciente.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn_nuevo_paciente.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        btn_nuevo_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevo_pacienteActionPerformed(evt);
            }
        });
        fSGradientPanel2.add(btn_nuevo_paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 210, -1));

        btn_modificar_paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-editar-usuario-masculino-30.png"))); // NOI18N
        btn_modificar_paciente.setText("Modificar Paciente");
        btn_modificar_paciente.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn_modificar_paciente.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn_modificar_paciente.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn_modificar_paciente.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn_modificar_paciente.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        fSGradientPanel2.add(btn_modificar_paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 210, -1));

        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-guardar-como-30.png"))); // NOI18N
        btn_save.setText("Guardar Paciente");
        btn_save.setColorPrimario(new java.awt.Color(42, 170, 232));
        btn_save.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        btn_save.setColorSecundario(new java.awt.Color(3, 102, 183));
        btn_save.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        btn_save.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        fSGradientPanel2.add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 210, -1));

        add(fSGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 500));

        cbx_departamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija una Opcion.", "RSItem 2", "RSItem 3", "RSItem 4" }));
        cbx_departamento.setColorMaterial(new java.awt.Color(10, 117, 167));
        cbx_departamento.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        cbx_departamento.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        add(cbx_departamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 220, -1));

        cbx_provincia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija una Opcion.", "RSItem 2", "RSItem 3", "RSItem 4" }));
        cbx_provincia.setColorMaterial(new java.awt.Color(10, 117, 167));
        cbx_provincia.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        cbx_provincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_provinciaActionPerformed(evt);
            }
        });
        add(cbx_provincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 220, -1));

        cbx_distrito.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elija una Opcion.", "RSItem 2", "RSItem 3", "RSItem 4" }));
        cbx_distrito.setColorMaterial(new java.awt.Color(10, 117, 167));
        cbx_distrito.setFont(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        add(cbx_distrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 420, 210, -1));

        txt_buscar_reniec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-encuentra-hombre-usuario-30.png"))); // NOI18N
        txt_buscar_reniec.setText("Buscar en Reniec");
        txt_buscar_reniec.setColorPrimario(new java.awt.Color(42, 170, 232));
        txt_buscar_reniec.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        txt_buscar_reniec.setColorSecundario(new java.awt.Color(3, 102, 183));
        txt_buscar_reniec.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        txt_buscar_reniec.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 16)); // NOI18N
        txt_buscar_reniec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscar_reniecActionPerformed(evt);
            }
        });
        add(txt_buscar_reniec, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 210, -1));

        txt_dni.setForeground(new java.awt.Color(0, 0, 0));
        txt_dni.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_dni.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 150, -1));

        txt_apellidoMAT.setForeground(new java.awt.Color(0, 0, 0));
        txt_apellidoMAT.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_apellidoMAT.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        add(txt_apellidoMAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 180, 220, -1));

        txt_name.setForeground(new java.awt.Color(0, 0, 0));
        txt_name.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_name.setBotonColor(new java.awt.Color(3, 111, 198));
        txt_name.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 220, -1));

        txt_apellidoPAT.setForeground(new java.awt.Color(0, 0, 0));
        txt_apellidoPAT.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_apellidoPAT.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        add(txt_apellidoPAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, 220, -1));

        txt_phone.setForeground(new java.awt.Color(0, 0, 0));
        txt_phone.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_phone.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 220, -1));

        txt_email.setForeground(new java.awt.Color(0, 0, 0));
        txt_email.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_email.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 300, 220, -1));

        txt_direccion.setForeground(new java.awt.Color(0, 0, 0));
        txt_direccion.setBorderColor(new java.awt.Color(153, 153, 153));
        txt_direccion.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 220, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void fSGradientPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fSGradientPanel2MousePressed

    }//GEN-LAST:event_fSGradientPanel2MousePressed

    private void fSGradientPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fSGradientPanel2MouseDragged

    }//GEN-LAST:event_fSGradientPanel2MouseDragged

    private void cbx_provinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_provinciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_provinciaActionPerformed

    private void txt_buscar_reniecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscar_reniecActionPerformed
        try {
            if(txt_dni.getText().length() >= 8){
                CTR_02_Patient ctr = new  CTR_02_Patient();
                Patient entidad = new Patient();
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
                if(entidad.getId() != 0){
                    // existe el dni
                    // despliega un mensaje
                    JOptionPane.showMessageDialog(null, "El DNI ingresado ya existe!",
                        "Dental SyS", JOptionPane.WARNING_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese el DNI",
                    "Dental SyS", JOptionPane.WARNING_MESSAGE);
            }

        } catch (IOException ex) {
            Logger.getLogger(frm_02_register_patient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException ex) {
            Logger.getLogger(frm_02_register_patient.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }//GEN-LAST:event_txt_buscar_reniecActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed

 try {
            Patient patient = new Patient();

            patient.setDni(txt_dni.getText());
            patient.setName(txt_name.getText());
            patient.setLastname(txt_apellidoPAT.getText());
            patient.setSurename(txt_apellidoMAT.getText());
            patient.setPhone(txt_phone.getText());
            patient.setEmail(txt_email.getText());
            patient.setAddress(txt_direccion.getText());
            patient.setUbigeo("150602");
            patient.setEnable(true);

            CTR_02_Patient ctrp = new CTR_02_Patient();
            ctrp.InsertPatient(patient);

        } catch (SQLException ex) {
            Logger.getLogger(frm_02_register_patient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DaoException ex) {
            Logger.getLogger(frm_02_register_patient.class.getName()).log(Level.SEVERE, null, ex);
        }      
       
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_nuevo_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevo_pacienteActionPerformed

txt_dni.setText("");
txt_name.setText("");
txt_apellidoPAT.setText("");
txt_apellidoMAT.setText("");
txt_phone.setText("");
txt_email.setText("");
txt_direccion.setText("");
cbx_departamento.setSelectedIndex(0);
cbx_provincia.setSelectedIndex(0);
cbx_distrito.setSelectedIndex(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nuevo_pacienteActionPerformed

    private void btn_modificar_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificar_pacienteActionPerformed

       new rojerusan.RSNotifyFade("ACTUALIZACION", "Se cambio los datos del paciente", 7, 
               RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_modificar_pacienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_cancelar_cambios;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_modificar_paciente;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_nuevo_paciente;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_save;
    private RSMaterialComponent.RSComboBoxMaterial cbx_departamento;
    private RSMaterialComponent.RSComboBoxMaterial cbx_distrito;
    private RSMaterialComponent.RSComboBoxMaterial cbx_provincia;
    private LIB.FSGradientPanel fSGradientPanel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private rojerusan.RSMetroTextPlaceHolder txt_apellidoMAT;
    private rojerusan.RSMetroTextPlaceHolder txt_apellidoPAT;
    private RSMaterialComponent.RSButtonMaterialGradientOne txt_buscar_reniec;
    private rojerusan.RSMetroTextPlaceHolder txt_direccion;
    private rojerusan.RSMetroTextPlaceHolder txt_dni;
    private rojerusan.RSMetroTextPlaceHolder txt_email;
    private rojerusan.RSMetroTextPlaceHolder txt_name;
    private rojerusan.RSMetroTextPlaceHolder txt_phone;
    // End of variables declaration//GEN-END:variables
}
