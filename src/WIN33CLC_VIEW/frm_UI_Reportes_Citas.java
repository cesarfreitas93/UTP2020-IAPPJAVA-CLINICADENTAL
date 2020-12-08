
package WIN33CLC_VIEW;

import WIN30CLC_DAO.DaoException;
import WIN32CLC_CTR.CTR_05_Citas;
import WIN35CLC_REPORTS.CLASS.Rpt_Citas;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class frm_UI_Reportes_Citas extends javax.swing.JPanel {
   
    private int total_registros_bd;
    private int paginas_page;
    private boolean reload_page;

    public frm_UI_Reportes_Citas() {
        initComponents();
        setBackground(new Color (255,255,255,0));
        Load();
    }
public int getTotal_registros_bd() {
        return total_registros_bd;
    }

    public int getPaginas_page() {
        return paginas_page;
    }

    public void setTotal_registros_bd(int total_registros_bd) {
        this.total_registros_bd = total_registros_bd;
    }

    public void setPaginas_page(int paginas_page) {
        this.paginas_page = paginas_page;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu_salir2 = new RSMaterialComponent.RSPanelMaterial();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_citas = new rojerusan.RSTableMetro();
        menu_salir3 = new RSMaterialComponent.RSPanelMaterial();
        jLabel3 = new javax.swing.JLabel();
        cbx_filas = new RSMaterialComponent.RSComboBoxMaterial();
        btn_anterior = new newscomponents.RSButtonFlat_new();
        btn_principio = new newscomponents.RSButtonFlat_new();
        btn_siguiente = new newscomponents.RSButtonFlat_new();
        btn_final = new newscomponents.RSButtonFlat_new();
        cbx_paginas = new RSMaterialComponent.RSComboBoxMaterial();
        menu_salir4 = new RSMaterialComponent.RSPanelMaterial();
        jLabel5 = new javax.swing.JLabel();
        txt_filtro = new rscomponentshade.RSFormatFieldShade();
        btn_buscar = new newscomponents.RSButtonFlat_new();
        jLabel6 = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        btn_print = new newscomponents.RSButtonFlat_new();

        menu_salir2.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir2.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir2.setPixels(0);
        menu_salir2.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir2.setRound(40);

        table_citas.setForeground(new java.awt.Color(74, 74, 74));
        table_citas.setModel(new javax.swing.table.DefaultTableModel(
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
        table_citas.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        table_citas.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        table_citas.setColorFilasForeground2(new java.awt.Color(74, 74, 74));
        table_citas.setFont(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        table_citas.setFuenteFilas(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        table_citas.setFuenteFilasSelect(new java.awt.Font("Poppins Light", 0, 15)); // NOI18N
        table_citas.setFuenteHead(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        table_citas.setGridColor(new java.awt.Color(153, 153, 153));
        table_citas.setGrosorBordeFilas(0);
        table_citas.setGrosorBordeHead(0);
        table_citas.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(table_citas);

        javax.swing.GroupLayout menu_salir2Layout = new javax.swing.GroupLayout(menu_salir2);
        menu_salir2.setLayout(menu_salir2Layout);
        menu_salir2Layout.setHorizontalGroup(
            menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                .addContainerGap())
        );
        menu_salir2Layout.setVerticalGroup(
            menu_salir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addContainerGap())
        );

        menu_salir3.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir3.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir3.setPixels(0);
        menu_salir3.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir3.setRound(40);

        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Filas:");

        cbx_filas.setForeground(new java.awt.Color(51, 51, 51));
        cbx_filas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "25", "50", "100" }));
        cbx_filas.setColorMaterial(new java.awt.Color(10, 117, 167));
        cbx_filas.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        btn_anterior.setBackground(new java.awt.Color(139, 198, 255));
        btn_anterior.setForeground(new java.awt.Color(51, 51, 51));
        btn_anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-atrás-24.png"))); // NOI18N
        btn_anterior.setBorderPainted(false);
        btn_anterior.setContentAreaFilled(true);
        btn_anterior.setCornerRound(45);
        btn_anterior.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anteriorActionPerformed(evt);
            }
        });

        btn_principio.setBackground(new java.awt.Color(139, 198, 255));
        btn_principio.setForeground(new java.awt.Color(51, 51, 51));
        btn_principio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-primero-24.png"))); // NOI18N
        btn_principio.setBorderPainted(false);
        btn_principio.setContentAreaFilled(true);
        btn_principio.setCornerRound(45);
        btn_principio.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_principio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_principioActionPerformed(evt);
            }
        });

        btn_siguiente.setBackground(new java.awt.Color(139, 198, 255));
        btn_siguiente.setForeground(new java.awt.Color(51, 51, 51));
        btn_siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-adelante-24.png"))); // NOI18N
        btn_siguiente.setBorderPainted(false);
        btn_siguiente.setContentAreaFilled(true);
        btn_siguiente.setCornerRound(45);
        btn_siguiente.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siguienteActionPerformed(evt);
            }
        });

        btn_final.setBackground(new java.awt.Color(139, 198, 255));
        btn_final.setForeground(new java.awt.Color(51, 51, 51));
        btn_final.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-último-24.png"))); // NOI18N
        btn_final.setBorderPainted(false);
        btn_final.setContentAreaFilled(true);
        btn_final.setCornerRound(45);
        btn_final.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_final.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_finalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu_salir3Layout = new javax.swing.GroupLayout(menu_salir3);
        menu_salir3.setLayout(menu_salir3Layout);
        menu_salir3Layout.setHorizontalGroup(
            menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbx_filas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_principio, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_final, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu_salir3Layout.setVerticalGroup(
            menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_salir3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_salir3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_principio, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_final, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbx_filas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        cbx_paginas.setForeground(new java.awt.Color(51, 51, 51));
        cbx_paginas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "25", "50", "100" }));
        cbx_paginas.setColorMaterial(new java.awt.Color(10, 117, 167));
        cbx_paginas.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        menu_salir4.setBackground(new java.awt.Color(255, 255, 255));
        menu_salir4.setBgShade(new java.awt.Color(204, 204, 204));
        menu_salir4.setPixels(0);
        menu_salir4.setPreferredSize(new java.awt.Dimension(90, 62));
        menu_salir4.setRound(40);

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("                              Filtro:");

        txt_filtro.setBackground(new java.awt.Color(247, 248, 251));
        txt_filtro.setForeground(new java.awt.Color(51, 51, 51));
        txt_filtro.setBgShade(new java.awt.Color(255, 255, 255));
        txt_filtro.setBgShadeHover(new java.awt.Color(204, 204, 204));
        txt_filtro.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        txt_filtro.setIntensity(0);
        txt_filtro.setPhColor(new java.awt.Color(255, 255, 255));
        txt_filtro.setPixels(0);
        txt_filtro.setPlaceholder("");
        txt_filtro.setRound(40);

        btn_buscar.setBackground(new java.awt.Color(139, 198, 255));
        btn_buscar.setForeground(new java.awt.Color(51, 51, 51));
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-búsqueda-24.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.setBorderPainted(false);
        btn_buscar.setContentAreaFilled(true);
        btn_buscar.setCornerRound(45);
        btn_buscar.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Nro Total de Registros");

        lbl_total.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lbl_total.setForeground(new java.awt.Color(51, 51, 51));
        lbl_total.setText("0000");

        btn_print.setBackground(new java.awt.Color(139, 198, 255));
        btn_print.setForeground(new java.awt.Color(51, 51, 51));
        btn_print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/icons8-presentación-30.png"))); // NOI18N
        btn_print.setText("Generar Reporte");
        btn_print.setBorderPainted(false);
        btn_print.setContentAreaFilled(true);
        btn_print.setCornerRound(45);
        btn_print.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu_salir4Layout = new javax.swing.GroupLayout(menu_salir4);
        menu_salir4.setLayout(menu_salir4Layout);
        menu_salir4Layout.setHorizontalGroup(
            menu_salir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_salir4Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(menu_salir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(menu_salir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_filtro, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(lbl_total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addGroup(menu_salir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        menu_salir4Layout.setVerticalGroup(
            menu_salir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_salir4Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(menu_salir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(24, 24, 24)
                .addGroup(menu_salir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(lbl_total))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(cbx_paginas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu_salir3, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addComponent(menu_salir2, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                    .addComponent(menu_salir4, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu_salir4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(menu_salir2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(menu_salir3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cbx_paginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_anteriorActionPerformed

    private void btn_principioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_principioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_principioActionPerformed

    private void btn_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siguienteActionPerformed
       int rows = Integer.parseInt(""+cbx_filas.getSelectedItem());
    }//GEN-LAST:event_btn_siguienteActionPerformed

    private void btn_finalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_finalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_finalActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        try {
            CTR_05_Citas ctr = new CTR_05_Citas();
            int total_filas;
            total_filas = Integer.parseInt(cbx_filas.getSelectedItem().toString());
            this.table_citas.setModel(ctr.ExploradorCitas(txt_filtro.getText(), total_filas, 1));
            btn_principio.setEnabled(false);
            btn_anterior.setEnabled(false);

        } catch (SQLException ex) {
            Logger.getLogger(frm_exploradorCitas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DaoException ex) {
            Logger.getLogger(frm_exploradorCitas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        try {
            // TODO add your handling code here:

            // imprimir reporte

            Rpt_Citas citas = new Rpt_Citas();
            citas.CallExplorerRPT(txt_filtro.getText(), 10, 1);
        } catch (IOException ex) {
            Logger.getLogger(frm_exploradorCitas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_printActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private newscomponents.RSButtonFlat_new btn_anterior;
    private newscomponents.RSButtonFlat_new btn_buscar;
    private newscomponents.RSButtonFlat_new btn_final;
    private newscomponents.RSButtonFlat_new btn_principio;
    private newscomponents.RSButtonFlat_new btn_print;
    private newscomponents.RSButtonFlat_new btn_siguiente;
    private RSMaterialComponent.RSComboBoxMaterial cbx_filas;
    private RSMaterialComponent.RSComboBoxMaterial cbx_paginas;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_total;
    private RSMaterialComponent.RSPanelMaterial menu_salir2;
    private RSMaterialComponent.RSPanelMaterial menu_salir3;
    private RSMaterialComponent.RSPanelMaterial menu_salir4;
    private rojerusan.RSTableMetro table_citas;
    private rscomponentshade.RSFormatFieldShade txt_filtro;
    // End of variables declaration//GEN-END:variables

 private void Load() {
        
        getCitas("",10,1, true);
        
        ActionListener actionListener_paginas = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Selected: " + cbx_paginas.getSelectedItem());
               System.out.print(", Position: " + cbx_paginas.getSelectedIndex());
                int rows = Integer.parseInt(cbx_filas.getSelectedItem().toString());
               int page = Integer.parseInt(cbx_paginas.getSelectedItem().toString());
                if(reload_page)
                    getCitas(txt_filtro.getText(), rows, page, false);
            }
        };
        // add event al cbs_Service

       cbx_paginas.addActionListener(actionListener_paginas);
        
        
        ActionListener actionListener_filas = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Selected: " + cbx_filas.getSelectedItem());
                System.out.print(", Position: " + cbx_filas.getSelectedIndex());
                int rows = Integer.parseInt(""+cbx_filas.getSelectedItem());
                getCitas(txt_filtro.getText(), rows, 1, false);
            }
        };
        
        // add event al cbs_Service

        cbx_filas.addActionListener(actionListener_filas);
    }

    private void getCitas(String Filtro, int showrows, int page, boolean no_reload_page) {
        try {
            
            
            
            CTR_05_Citas ctr = new CTR_05_Citas();
            this.table_citas.setModel(ctr.ExploradorCitas(Filtro, showrows, page));
            this.setPaginas_page(ctr.getPaginas_page());
            this.setTotal_registros_bd(ctr.getTotal_registros_bd());
            
            lbl_total.setText(total_registros_bd+ "");
            
            reload_page = no_reload_page;
            if(no_reload_page){
              cbx_paginas.removeAllItems();
                for(int a = 1; a <= this.paginas_page; a++){
                 cbx_paginas.addItem(a+"");
                }
              cbx_paginas.setSelectedIndex(0);
                reload_page = true;
            }
            
            btn_principio.setEnabled(false);
            btn_anterior.setEnabled(false);
        } catch (SQLException ex) {
            Logger.getLogger(frm_exploradorCitas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DaoException ex) {
            Logger.getLogger(frm_exploradorCitas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
