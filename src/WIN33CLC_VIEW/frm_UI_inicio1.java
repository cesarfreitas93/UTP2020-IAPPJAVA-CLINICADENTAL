
package WIN33CLC_VIEW;

import WIN31CLC_DTO.Dashboard;
import WIN32CLC_CTR.CTR_12_Dashboard;
import java.awt.Color;


public class frm_UI_inicio1 extends javax.swing.JPanel {

    Dashboard dashboard;
    
    CTR_12_Dashboard cTR_12_Dashboard = null;
    
    public frm_UI_inicio1() {
        
        initComponents();
         setBackground(new Color (255,255,255,0));

          panel_opciones.setBackground(new Color (255,255,255,100));
          panel_contenedor.setBackground(new Color (255,255,255,200));
          lbl_paciente.setBackground(new Color (255,255,255,0));
          
          
          
          
          
        setBackground(new Color (255,255,255,1));
        cTR_12_Dashboard = new  CTR_12_Dashboard();
        loaddata();
    }

    public Dashboard getDashboard() {
        return dashboard;
    }

    public void setDashboard(Dashboard dashboard) {
        this.dashboard = dashboard;
    }

      public void ocultar_form_inicio(boolean b)
    {
    
          
            
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panel_opciones = new RSMaterialComponent.RSPanelMaterial();
        lbl_paciente = new javax.swing.JLabel();
        lbl_citas = new javax.swing.JLabel();
        lbl_comprobantes = new javax.swing.JLabel();
        panel_contenedor = new RSMaterialComponent.RSPanelMaterial();
        panel_paciente = new javax.swing.JPanel();
        frm_UI_inicio_paciente1 = new WIN33CLC_VIEW.frm_UI_inicio_paciente();

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Dashboard");

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("      Lunes, 07 de Diciembre, 2020");
        jLabel4.setIconTextGap(2);

        panel_opciones.setBackground(new java.awt.Color(255, 255, 255));
        panel_opciones.setBgShade(new java.awt.Color(255, 255, 255));
        panel_opciones.setIntensity(0);
        panel_opciones.setPixels(0);
        panel_opciones.setRound(40);

        lbl_paciente.setBackground(new java.awt.Color(255, 255, 255));
        lbl_paciente.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        lbl_paciente.setForeground(new java.awt.Color(102, 102, 102));
        lbl_paciente.setText("Paciente");
        lbl_paciente.setFocusable(false);
        lbl_paciente.setOpaque(true);
        lbl_paciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_pacienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_pacienteMouseExited(evt);
            }
        });

        lbl_citas.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        lbl_citas.setForeground(new java.awt.Color(102, 102, 102));
        lbl_citas.setText("Citas");

        lbl_comprobantes.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        lbl_comprobantes.setForeground(new java.awt.Color(102, 102, 102));
        lbl_comprobantes.setText("Comprobantes");

        javax.swing.GroupLayout panel_opcionesLayout = new javax.swing.GroupLayout(panel_opciones);
        panel_opciones.setLayout(panel_opcionesLayout);
        panel_opcionesLayout.setHorizontalGroup(
            panel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_opcionesLayout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addComponent(lbl_paciente, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(lbl_citas, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(lbl_comprobantes, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap(180, Short.MAX_VALUE))
        );
        panel_opcionesLayout.setVerticalGroup(
            panel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_opcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_opcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_paciente)
                    .addComponent(lbl_citas)
                    .addComponent(lbl_comprobantes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_contenedor.setBackground(new java.awt.Color(255, 255, 255));
        panel_contenedor.setBgShade(new java.awt.Color(255, 255, 255));
        panel_contenedor.setIntensity(0);
        panel_contenedor.setPixels(0);
        panel_contenedor.setRound(40);
        panel_contenedor.setLayout(new java.awt.CardLayout());

        panel_paciente.setLayout(new java.awt.CardLayout());
        panel_paciente.add(frm_UI_inicio_paciente1, "card2");

        panel_contenedor.add(panel_paciente, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(86, 86, 86)
                    .addComponent(panel_opciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(86, 86, 86)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(panel_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(32, 32, 32)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(643, 643, 643))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(140, 140, 140)
                    .addComponent(panel_opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(562, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(236, 236, 236)
                    .addComponent(panel_contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_pacienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_pacienteMouseEntered

        lbl_paciente.setBackground(new Color (255,255,255,0));
       lbl_paciente.setForeground(new Color (51,51,51));        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_pacienteMouseEntered

    private void lbl_pacienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_pacienteMouseExited
      lbl_paciente.setBackground(new Color (255,255,255,0));
        lbl_paciente.setForeground(new Color (102,102,102)); 
    }//GEN-LAST:event_lbl_pacienteMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private WIN33CLC_VIEW.frm_UI_inicio_paciente frm_UI_inicio_paciente1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_citas;
    private javax.swing.JLabel lbl_comprobantes;
    private javax.swing.JLabel lbl_paciente;
    private RSMaterialComponent.RSPanelMaterial panel_contenedor;
    private RSMaterialComponent.RSPanelMaterial panel_opciones;
    private javax.swing.JPanel panel_paciente;
    private RSMaterialComponent.RSButtonMaterialGradientOne rSButtonMaterialGradientOne1;
    private RSMaterialComponent.RSButtonMaterialGradientOne rSButtonMaterialGradientOne2;
    private RSMaterialComponent.RSButtonMaterialGradientOne rSButtonMaterialGradientOne3;
    private RSMaterialComponent.RSButtonMaterialGradientOne rSButtonMaterialGradientOne4;
    private RSMaterialComponent.RSButtonMaterialGradientOne rSButtonMaterialGradientOne5;
    private RSMaterialComponent.RSButtonMaterialGradientOne rSButtonMaterialGradientOne6;
    private RSMaterialComponent.RSPanelMaterial rSPanelMaterial2;
    private RSMaterialComponent.RSPanelMaterial rSPanelMaterial3;
    // End of variables declaration//GEN-END:variables

    private void loaddata() {
        
    }
}
