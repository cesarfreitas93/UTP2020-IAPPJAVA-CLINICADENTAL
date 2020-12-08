
package WIN33CLC_VIEW;

import java.awt.Color;


public class frm_UI_inicio extends javax.swing.JPanel {

    public frm_UI_inicio() {
        initComponents();
         setBackground(new Color (255,255,255,1));
    }

      public void ocultar_form_inicio(boolean b)
    {
    menu_salir2.setVisible(b);
    menu_salir3.setVisible(b);
    menu_salir4.setVisible(b);
    menu_salir5.setVisible(b);
     menu_salir6.setVisible(b);
          
            
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu_salir2 = new RSMaterialComponent.RSPanelMaterial();
        menu_salir3 = new RSMaterialComponent.RSPanelMaterial();
        lbl_cantidad_pacientes = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menu_salir4 = new RSMaterialComponent.RSPanelMaterial();
        menu_salir5 = new RSMaterialComponent.RSPanelMaterial();
        menu_salir6 = new RSMaterialComponent.RSPanelMaterial();

        menu_salir2.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir2.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir2.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir2.setRound(40);

        javax.swing.GroupLayout menu_salir2Layout = new javax.swing.GroupLayout(menu_salir2);
        menu_salir2.setLayout(menu_salir2Layout);
        menu_salir2Layout.setHorizontalGroup(
            menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        menu_salir2Layout.setVerticalGroup(
            menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
        );

        menu_salir3.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir3.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir3.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir3.setRound(40);

        lbl_cantidad_pacientes.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lbl_cantidad_pacientes.setText("123");

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Cantidad Pacientes");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-documentos-30.png"))); // NOI18N

        javax.swing.GroupLayout menu_salir3Layout = new javax.swing.GroupLayout(menu_salir3);
        menu_salir3.setLayout(menu_salir3Layout);
        menu_salir3Layout.setHorizontalGroup(
            menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir3Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu_salir3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(menu_salir3Layout.createSequentialGroup()
                        .addComponent(lbl_cantidad_pacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        menu_salir3Layout.setVerticalGroup(
            menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_salir3Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menu_salir3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_cantidad_pacientes)
                        .addGap(15, 15, 15)))
                .addGap(66, 66, 66))
        );

        menu_salir4.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir4.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir4.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir4.setRound(40);

        javax.swing.GroupLayout menu_salir4Layout = new javax.swing.GroupLayout(menu_salir4);
        menu_salir4.setLayout(menu_salir4Layout);
        menu_salir4Layout.setHorizontalGroup(
            menu_salir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );
        menu_salir4Layout.setVerticalGroup(
            menu_salir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 224, Short.MAX_VALUE)
        );

        menu_salir5.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir5.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir5.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir5.setRound(40);

        javax.swing.GroupLayout menu_salir5Layout = new javax.swing.GroupLayout(menu_salir5);
        menu_salir5.setLayout(menu_salir5Layout);
        menu_salir5Layout.setHorizontalGroup(
            menu_salir5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );
        menu_salir5Layout.setVerticalGroup(
            menu_salir5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 224, Short.MAX_VALUE)
        );

        menu_salir6.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir6.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir6.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir6.setRound(40);

        javax.swing.GroupLayout menu_salir6Layout = new javax.swing.GroupLayout(menu_salir6);
        menu_salir6.setLayout(menu_salir6Layout);
        menu_salir6Layout.setHorizontalGroup(
            menu_salir6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );
        menu_salir6Layout.setVerticalGroup(
            menu_salir6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 224, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(menu_salir2, javax.swing.GroupLayout.DEFAULT_SIZE, 856, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(menu_salir3, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(menu_salir4, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(menu_salir5, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(menu_salir6, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)))
                .addGap(131, 131, 131))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(menu_salir2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu_salir3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu_salir4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu_salir5, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu_salir6, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_cantidad_pacientes;
    private RSMaterialComponent.RSPanelMaterial menu_salir2;
    private RSMaterialComponent.RSPanelMaterial menu_salir3;
    private RSMaterialComponent.RSPanelMaterial menu_salir4;
    private RSMaterialComponent.RSPanelMaterial menu_salir5;
    private RSMaterialComponent.RSPanelMaterial menu_salir6;
    // End of variables declaration//GEN-END:variables
}
