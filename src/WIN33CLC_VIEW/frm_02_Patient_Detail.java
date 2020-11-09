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
/**
 *
 * @author Cesar
 */
public class frm_02_Patient_Detail extends javax.swing.JPanel {

    
    public frm_02_Patient_Detail() {
        initComponents();
         setBackground(new Color (255,255,255,240));
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
        txt_dni = new LIB.FSTexFieldMD();
        txt_name = new LIB.FSTexFieldMD();
        txt_apellidoPAT = new LIB.FSTexFieldMD();
        txt_phone = new LIB.FSTexFieldMD();
        txt_apellidoMAT = new LIB.FSTexFieldMD();
        txt_email = new LIB.FSTexFieldMD();
        txt_direccion = new LIB.FSTexFieldMD();
        jLabel11 = new javax.swing.JLabel();
        fSGradientPanel2 = new LIB.FSGradientPanel();
        jLabel12 = new javax.swing.JLabel();
        rSButtonMaterialGradientOne1 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        rSButtonMaterialGradientOne2 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        rSButtonMaterialGradientOne3 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_save = new RSMaterialComponent.RSButtonMaterialGradientOne();
        cbx_departamento = new RSMaterialComponent.RSComboBoxMaterial();
        rSComboBoxMaterial1 = new RSMaterialComponent.RSComboBoxMaterial();
        rSComboBoxMaterial2 = new RSMaterialComponent.RSComboBoxMaterial();
        txt_buscar_reniec = new RSMaterialComponent.RSButtonMaterialGradientOne();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(10, 117, 167));
        jLabel1.setText("DNI:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(10, 117, 167));
        jLabel2.setText("Nombres:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(10, 117, 167));
        jLabel3.setText("Apellido Paterno:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(10, 117, 167));
        jLabel4.setText("Apellido Materno:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(10, 117, 167));
        jLabel5.setText("Teléfono:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(10, 117, 167));
        jLabel6.setText("Email:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(10, 117, 167));
        jLabel7.setText("Direccion:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        jLabel8.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(10, 117, 167));
        jLabel8.setText("Departamento:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, -1));

        jLabel9.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(10, 117, 167));
        jLabel9.setText("Provincia:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, -1, -1));

        jLabel10.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(10, 117, 167));
        jLabel10.setText("Distrito:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, -1, -1));

        txt_dni.setForeground(new java.awt.Color(10, 117, 167));
        txt_dni.setBordeColorFocus(new java.awt.Color(10, 117, 167));
        txt_dni.setColorTransparente(true);
        txt_dni.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 14)); // NOI18N
        txt_dni.setPlaceholder("");
        add(txt_dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 120, 40));

        txt_name.setForeground(new java.awt.Color(0, 0, 0));
        txt_name.setBordeColorFocus(new java.awt.Color(10, 117, 167));
        txt_name.setColorTransparente(true);
        txt_name.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        txt_name.setPlaceholder("");
        add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 180, -1));

        txt_apellidoPAT.setForeground(new java.awt.Color(0, 0, 0));
        txt_apellidoPAT.setBordeColorFocus(new java.awt.Color(10, 117, 167));
        txt_apellidoPAT.setColorTransparente(true);
        txt_apellidoPAT.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 15)); // NOI18N
        txt_apellidoPAT.setPlaceholder("");
        add(txt_apellidoPAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 130, -1));

        txt_phone.setForeground(new java.awt.Color(0, 0, 0));
        txt_phone.setBordeColorFocus(new java.awt.Color(10, 117, 167));
        txt_phone.setColorTransparente(true);
        txt_phone.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 15)); // NOI18N
        txt_phone.setPlaceholder("");
        add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 130, -1));

        txt_apellidoMAT.setForeground(new java.awt.Color(0, 0, 0));
        txt_apellidoMAT.setBordeColorFocus(new java.awt.Color(10, 117, 167));
        txt_apellidoMAT.setColorTransparente(true);
        txt_apellidoMAT.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 15)); // NOI18N
        txt_apellidoMAT.setPlaceholder("");
        add(txt_apellidoMAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 150, 40));

        txt_email.setForeground(new java.awt.Color(0, 0, 0));
        txt_email.setBordeColorFocus(new java.awt.Color(10, 117, 167));
        txt_email.setColorTransparente(true);
        txt_email.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 15)); // NOI18N
        txt_email.setPlaceholder("");
        add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 240, -1));

        txt_direccion.setForeground(new java.awt.Color(0, 0, 0));
        txt_direccion.setBordeColorFocus(new java.awt.Color(10, 117, 167));
        txt_direccion.setColorTransparente(true);
        txt_direccion.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 15)); // NOI18N
        txt_direccion.setPlaceholder("");
        add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 460, -1));

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
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, -1, -1));

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

        rSButtonMaterialGradientOne1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-cancelar-30.png"))); // NOI18N
        rSButtonMaterialGradientOne1.setText("Cancelar Cambios");
        rSButtonMaterialGradientOne1.setColorPrimario(new java.awt.Color(42, 170, 232));
        rSButtonMaterialGradientOne1.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        rSButtonMaterialGradientOne1.setColorSecundario(new java.awt.Color(3, 102, 183));
        rSButtonMaterialGradientOne1.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        rSButtonMaterialGradientOne1.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        fSGradientPanel2.add(rSButtonMaterialGradientOne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 210, -1));

        rSButtonMaterialGradientOne2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-añadir-usuario-masculino-30.png"))); // NOI18N
        rSButtonMaterialGradientOne2.setText("Nuevo Paciente");
        rSButtonMaterialGradientOne2.setColorPrimario(new java.awt.Color(42, 170, 232));
        rSButtonMaterialGradientOne2.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        rSButtonMaterialGradientOne2.setColorSecundario(new java.awt.Color(3, 102, 183));
        rSButtonMaterialGradientOne2.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        rSButtonMaterialGradientOne2.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        fSGradientPanel2.add(rSButtonMaterialGradientOne2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 210, -1));

        rSButtonMaterialGradientOne3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-editar-usuario-masculino-30.png"))); // NOI18N
        rSButtonMaterialGradientOne3.setText("Modificar Paciente");
        rSButtonMaterialGradientOne3.setColorPrimario(new java.awt.Color(42, 170, 232));
        rSButtonMaterialGradientOne3.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        rSButtonMaterialGradientOne3.setColorSecundario(new java.awt.Color(3, 102, 183));
        rSButtonMaterialGradientOne3.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        rSButtonMaterialGradientOne3.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        fSGradientPanel2.add(rSButtonMaterialGradientOne3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 210, -1));

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

        cbx_departamento.setColorMaterial(new java.awt.Color(10, 117, 167));
        cbx_departamento.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        add(cbx_departamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, -1, -1));

        rSComboBoxMaterial1.setColorMaterial(new java.awt.Color(10, 117, 167));
        rSComboBoxMaterial1.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        rSComboBoxMaterial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSComboBoxMaterial1ActionPerformed(evt);
            }
        });
        add(rSComboBoxMaterial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, -1, -1));

        rSComboBoxMaterial2.setColorMaterial(new java.awt.Color(10, 117, 167));
        rSComboBoxMaterial2.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 0, 14)); // NOI18N
        add(rSComboBoxMaterial2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, -1, -1));

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
        add(txt_buscar_reniec, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, 210, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void fSGradientPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fSGradientPanel2MousePressed

    }//GEN-LAST:event_fSGradientPanel2MousePressed

    private void fSGradientPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fSGradientPanel2MouseDragged

    }//GEN-LAST:event_fSGradientPanel2MouseDragged

    private void rSComboBoxMaterial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSComboBoxMaterial1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSComboBoxMaterial1ActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_save;
    private RSMaterialComponent.RSComboBoxMaterial cbx_departamento;
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
    private RSMaterialComponent.RSButtonMaterialGradientOne rSButtonMaterialGradientOne1;
    private RSMaterialComponent.RSButtonMaterialGradientOne rSButtonMaterialGradientOne2;
    private RSMaterialComponent.RSButtonMaterialGradientOne rSButtonMaterialGradientOne3;
    private RSMaterialComponent.RSComboBoxMaterial rSComboBoxMaterial1;
    private RSMaterialComponent.RSComboBoxMaterial rSComboBoxMaterial2;
    private LIB.FSTexFieldMD txt_apellidoMAT;
    private LIB.FSTexFieldMD txt_apellidoPAT;
    private RSMaterialComponent.RSButtonMaterialGradientOne txt_buscar_reniec;
    private LIB.FSTexFieldMD txt_direccion;
    private LIB.FSTexFieldMD txt_dni;
    private LIB.FSTexFieldMD txt_email;
    private LIB.FSTexFieldMD txt_name;
    private LIB.FSTexFieldMD txt_phone;
    // End of variables declaration//GEN-END:variables
}
