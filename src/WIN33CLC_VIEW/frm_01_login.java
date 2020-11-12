
package WIN33CLC_VIEW;

import com.sun.awt.AWTUtilities;
import WIN30CLC_DAO.DaoException;
import WIN32CLC_CTR.CTR_01_Auth;
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Cesar
 */
public class frm_01_login extends javax.swing.JFrame {

    /**
     * Creates new form frm_01_login
     */
    public frm_01_login(){
       
        initComponents();
        
      
         setBackground(new Color (255,255,255,245));
        jPanel2.setOpaque(false);
        txt_username.setBackground(new Color (0,0,0,1));
        txt_password.setBackground(new Color (0,0,0,1));
        
        setLocationRelativeTo(null); 
        Shape forma = new RoundRectangle2D.Double(0, 0, getBounds().width, getBounds().height, 20, 20);
        AWTUtilities.setWindowShape(this, forma);
     
    }
    
     int xx,xy;

    public void login() {
        try {
            
            
            CTR_01_Auth ctr = new CTR_01_Auth();
            char clave[]=txt_password.getPassword();
            String clavedef=new String(clave);
            
            if (ctr.CheckAuth(txt_username.getText(), clavedef )){
                System.out.println("yes");
            }
        } catch (SQLException ex) {
            Logger.getLogger(frm_01_login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DaoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                "Dental SyS", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(frm_01_login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fSGradientPanel1 = new LIB.FSGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_password = new LIB.FSPasswordFieldMD();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_username = new LIB.FSTexFieldMD();
        rSButtonMaterialGradientOne1 = new RSMaterialComponent.RSButtonMaterialGradientOne();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/Logo_animado_100.gif"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 115, -1, 152));

        jLabel4.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(10, 117, 167));
        jLabel4.setText("App Version 1.0");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 392, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 420));

        fSGradientPanel1.setFSEndColor(new java.awt.Color(3, 111, 198));
        fSGradientPanel1.setFSStartColor(new java.awt.Color(101, 208, 250));
        fSGradientPanel1.setOpaque(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-usuario-30 (1).png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-olvidó-su-contraseña-30.png"))); // NOI18N

        txt_password.setBackground(new java.awt.Color(20, 145, 204));
        txt_password.setForeground(new java.awt.Color(255, 255, 255));
        txt_password.setBordeColorFocus(new java.awt.Color(10, 117, 167));
        txt_password.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 18)); // NOI18N
        txt_password.setPlaceholder("Contraseña");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-usuario-masculino-en-círculo-100.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Gotham Thin", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(10, 86, 145));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("x");
        jLabel9.setToolTipText("Cerrar la Aplicacion");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        txt_username.setBorder(null);
        txt_username.setForeground(new java.awt.Color(255, 255, 255));
        txt_username.setBordeColorFocus(new java.awt.Color(10, 117, 167));
        txt_username.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_username.setColorTransparente(true);
        txt_username.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 18)); // NOI18N
        txt_username.setPlaceholder("Usuario");

        rSButtonMaterialGradientOne1.setText("Iniciar");
        rSButtonMaterialGradientOne1.setColorPrimario(new java.awt.Color(42, 170, 232));
        rSButtonMaterialGradientOne1.setColorPrimarioHover(new java.awt.Color(101, 208, 250));
        rSButtonMaterialGradientOne1.setColorSecundario(new java.awt.Color(3, 102, 183));
        rSButtonMaterialGradientOne1.setColorSecundarioHover(new java.awt.Color(3, 102, 183));
        rSButtonMaterialGradientOne1.setFont(new java.awt.Font("ITC Avant Garde Std Bk", 1, 18)); // NOI18N
        rSButtonMaterialGradientOne1.setRippleColor(new java.awt.Color(204, 255, 255));
        rSButtonMaterialGradientOne1.setRound(3);

        javax.swing.GroupLayout fSGradientPanel1Layout = new javax.swing.GroupLayout(fSGradientPanel1);
        fSGradientPanel1.setLayout(fSGradientPanel1Layout);
        fSGradientPanel1Layout.setHorizontalGroup(
            fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                        .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jLabel3))
                            .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(10, 10, 10)
                                        .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rSButtonMaterialGradientOne1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fSGradientPanel1Layout.createSequentialGroup()
                        .addGap(0, 300, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        fSGradientPanel1Layout.setVerticalGroup(
            fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fSGradientPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(fSGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fSGradientPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(rSButtonMaterialGradientOne1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        getContentPane().add(fSGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 340, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
xx=evt.getX();
  xy=evt.getY();        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
int x=evt.getXOnScreen();
       int y=evt.getYOnScreen();
       
        this.setLocation(x-xx, y-xy);          // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseDragged

    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_01_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_01_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_01_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_01_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_01_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LIB.FSGradientPanel fSGradientPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private RSMaterialComponent.RSButtonMaterialGradientOne rSButtonMaterialGradientOne1;
    private LIB.FSPasswordFieldMD txt_password;
    private LIB.FSTexFieldMD txt_username;
    // End of variables declaration//GEN-END:variables
}
