
package WIN33CLC_VIEW;

import WIN30CLC_DAO.DaoException;
import WIN32CLC_CTR.CTR_01_Auth;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UI_V5_login extends javax.swing.JFrame {

    public UI_V5_login() {
        initComponents();
        setLocationRelativeTo(null);
       
        Shape forma = new RoundRectangle2D.Double(0, 0, getBounds().width, getBounds().height, 40, 40);
        AWTUtilities.setWindowShape(this, forma);
        
       
        txt_user.setBackground(new Color (247,248,251,150));
        txt_pass.setBackground(new Color (247,248,251,150));
        btn_cancelar.setBackground(new Color (248, 228, 229,220));
        btn_ingresar.setBackground(new Color (73, 162, 235,150));
    }

int xx,xy;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelImage1 = new rojerusan.RSPanelImage();
        txt_user = new rscomponentshade.RSFormatFieldShade();
        txt_pass = new rscomponentshade.RSPassFieldShade();
        jLabel1 = new javax.swing.JLabel();
        btn_ingresar = new newscomponents.RSButtonFlat_new();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_cancelar = new newscomponents.RSButtonFlat_new();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/f0.jpg"))); // NOI18N
        rSPanelImage1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                rSPanelImage1MouseDragged(evt);
            }
        });
        rSPanelImage1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rSPanelImage1MousePressed(evt);
            }
        });

        txt_user.setBackground(new java.awt.Color(247, 248, 251));
        txt_user.setForeground(new java.awt.Color(51, 51, 51));
        txt_user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_user.setBgShade(new java.awt.Color(255, 255, 255));
        txt_user.setBgShadeHover(new java.awt.Color(255, 255, 255));
        txt_user.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_user.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_user.setDoubleBuffered(true);
        txt_user.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txt_user.setIntensity(0);
        txt_user.setPixels(0);
        txt_user.setPlaceholder("Usuario o Administrador");
        txt_user.setRound(40);

        txt_pass.setBackground(new java.awt.Color(247, 248, 251));
        txt_pass.setForeground(new java.awt.Color(51, 51, 51));
        txt_pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_pass.setBgShade(new java.awt.Color(255, 255, 255));
        txt_pass.setBgShadeHover(new java.awt.Color(255, 255, 255));
        txt_pass.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_pass.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_pass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_pass.setPixels(0);
        txt_pass.setPlaceholder("Contraseña");
        txt_pass.setRound(40);

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Ingrese sus Credenciales");

        btn_ingresar.setBackground(new java.awt.Color(73, 162, 235));
        btn_ingresar.setForeground(new java.awt.Color(51, 51, 51));
        btn_ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-accede-redondeado-derecho-24 (1).png"))); // NOI18N
        btn_ingresar.setText("Ingresar");
        btn_ingresar.setBorderPainted(false);
        btn_ingresar.setContentAreaFilled(true);
        btn_ingresar.setCornerRound(45);
        btn_ingresar.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("DentalSys");

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Bienvenido al Sistema Dental");

        btn_cancelar.setBackground(new java.awt.Color(248, 228, 229));
        btn_cancelar.setForeground(new java.awt.Color(51, 51, 51));
        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-cerrar-ventana-24.png"))); // NOI18N
        btn_cancelar.setText("Salir");
        btn_cancelar.setBorderPainted(false);
        btn_cancelar.setContentAreaFilled(true);
        btn_cancelar.setCornerRound(45);
        btn_cancelar.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_cancelar.setMargin(new java.awt.Insets(0, 2, 2, 14));
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelImage1Layout.createSequentialGroup()
                .addGroup(rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelImage1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3))
                    .addGroup(rSPanelImage1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rSPanelImage1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1))
                    .addGroup(rSPanelImage1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rSPanelImage1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rSPanelImage1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelImage1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel3)
                .addGap(11, 11, 11)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void login() {
        try {

            CTR_01_Auth ctr = new CTR_01_Auth();
            char clave[] = txt_pass.getPassword();
            String clavedef = new String(clave);

            if (ctr.CheckAuth(txt_user.getText(), clavedef)) {
                UI_V5_mainWindow frm_m = new UI_V5_mainWindow();
                frm_m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frm_m.pack();
  //frm_m.setLocationRelativeTo(null);  // *** this will center your app ***
                frm_m.setVisible(true);

                this.dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña Incorrecto");

            }
        } catch (SQLException ex) {
           // Logger.getLogger(frm_01_login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DaoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "Dental SyS", JOptionPane.ERROR_MESSAGE);
         //   Logger.getLogger(frm_01_login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
  login();          // TODO add your handling code here:
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void rSPanelImage1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSPanelImage1MousePressed
  xx=evt.getX();
 xy=evt.getY();         // TODO add your handling code here:
    }//GEN-LAST:event_rSPanelImage1MousePressed

    private void rSPanelImage1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSPanelImage1MouseDragged
     int x=evt.getXOnScreen();
       int y=evt.getYOnScreen();
       
        this.setLocation(x-xx, y-xy);           // TODO add your handling code here:
    }//GEN-LAST:event_rSPanelImage1MouseDragged

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
System.exit(0);         // TODO add your handling code here:
    }//GEN-LAST:event_btn_cancelarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_V5_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btn_cancelar;
    private newscomponents.RSButtonFlat_new btn_ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private rojerusan.RSPanelImage rSPanelImage1;
    private rscomponentshade.RSPassFieldShade txt_pass;
    private rscomponentshade.RSFormatFieldShade txt_user;
    // End of variables declaration//GEN-END:variables
}
