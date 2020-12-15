
package WIN33CLC_VIEW;

import WIN30CLC_DAO.DaoException;
import WIN32CLC_CTR.CTR_05_Citas;
import WIN32CLC_CTR.CTR_08_Comprobante;
import WIN35CLC_REPORTS.CLASS.Rpt_Citas;
import WIN35CLC_REPORTS.CLASS.Rpt_Comprobante;
import WIN35CLC_REPORTS.CLASS.Rpt_Facturas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class frm_exploradorCitas extends javax.swing.JFrame {

    private int total_registros_bd;
    private int paginas_page;
    private boolean reload_page;
    private int paginanumber = 1;


    public frm_exploradorCitas() {
        initComponents();
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

        panel_filtro = new javax.swing.JPanel();
        txt_filtro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        btn_print = new javax.swing.JButton();
        panel_table = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_citas = new javax.swing.JTable();
        panel_navigation = new javax.swing.JPanel();
        btn_principio = new javax.swing.JButton();
        btn_anterior = new javax.swing.JButton();
        btn_siguiente = new javax.swing.JButton();
        btn_final = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbx_filas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Filtro");

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_print.setText("Generar Reporte");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_filtroLayout = new javax.swing.GroupLayout(panel_filtro);
        panel_filtro.setLayout(panel_filtroLayout);
        panel_filtroLayout.setHorizontalGroup(
            panel_filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_filtroLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_print)
                .addContainerGap())
        );
        panel_filtroLayout.setVerticalGroup(
            panel_filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_filtroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btn_buscar)
                    .addComponent(btn_print))
                .addContainerGap())
        );

        panel_table.setLayout(new java.awt.BorderLayout());

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
        table_citas.setRowHeight(24);
        jScrollPane1.setViewportView(table_citas);

        panel_table.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        btn_principio.setText("Principio");
        btn_principio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_principioActionPerformed(evt);
            }
        });

        btn_anterior.setText("Anterior");
        btn_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anteriorActionPerformed(evt);
            }
        });

        btn_siguiente.setText("Siguiente");
        btn_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siguienteActionPerformed(evt);
            }
        });

        btn_final.setText("Final");
        btn_final.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_finalActionPerformed(evt);
            }
        });

        jLabel2.setText("Total de Registros:");

        lbl_total.setText("100");

        jLabel5.setText("Filas");

        cbx_filas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3", "10", "25", "50", "100" }));

        javax.swing.GroupLayout panel_navigationLayout = new javax.swing.GroupLayout(panel_navigation);
        panel_navigation.setLayout(panel_navigationLayout);
        panel_navigationLayout.setHorizontalGroup(
            panel_navigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_navigationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbx_filas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addComponent(btn_principio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_anterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_siguiente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_final)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_total)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        panel_navigationLayout.setVerticalGroup(
            panel_navigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_navigationLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(panel_navigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_principio)
                    .addComponent(btn_anterior)
                    .addComponent(btn_siguiente)
                    .addComponent(btn_final)
                    .addComponent(jLabel2)
                    .addComponent(lbl_total)
                    .addComponent(jLabel5)
                    .addComponent(cbx_filas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_navigation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_filtro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_navigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
            CTR_08_Comprobante ctr = new CTR_08_Comprobante();
            int total_filas;
            total_filas = Integer.parseInt(cbx_filas.getSelectedItem().toString());
            getComprobantes(txt_filtro.getText(), total_filas , this.paginanumber  , false);
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        try {
            // TODO add your handling code here:
            
            // imprimir reporte
            
            Rpt_Facturas citas = new Rpt_Facturas();
            String filtro = txt_filtro.getText();
            citas.CallExplorerRPT(filtro, 1000, 1);
        } catch (IOException ex) {
            Logger.getLogger(frm_exploradorCitas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_printActionPerformed

    private void btn_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siguienteActionPerformed
        // TODO add your handling code here:
        int rows = Integer.parseInt(""+cbx_filas.getSelectedItem());
        this.paginanumber ++;
        getComprobantes(txt_filtro.getText(), rows , this.paginanumber  , false);
        
    }//GEN-LAST:event_btn_siguienteActionPerformed

    private void btn_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anteriorActionPerformed
        // TODO add your handling code here:
        int rows = Integer.parseInt(""+cbx_filas.getSelectedItem());
        this.paginanumber --;
        getComprobantes(txt_filtro.getText(), rows , this.paginanumber  , false);
    }//GEN-LAST:event_btn_anteriorActionPerformed

    private void btn_principioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_principioActionPerformed
        // TODO add your handling code here:
        int rows = Integer.parseInt(""+cbx_filas.getSelectedItem());
        this.paginanumber = 1;
        getComprobantes(txt_filtro.getText(), rows , this.paginanumber  , false);
    }//GEN-LAST:event_btn_principioActionPerformed

    private void btn_finalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_finalActionPerformed
        // TODO add your handling code here:
        int rows = Integer.parseInt(""+cbx_filas.getSelectedItem());
        this.paginanumber = this.getPaginas_page();
        getComprobantes(txt_filtro.getText(), rows , this.paginanumber  , false);
    }//GEN-LAST:event_btn_finalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_exploradorCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_exploradorCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_exploradorCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_exploradorCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_exploradorCitas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_anterior;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_final;
    private javax.swing.JButton btn_principio;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_siguiente;
    private javax.swing.JComboBox<String> cbx_filas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JPanel panel_filtro;
    private javax.swing.JPanel panel_navigation;
    private javax.swing.JPanel panel_table;
    private javax.swing.JTable table_citas;
    private javax.swing.JTextField txt_filtro;
    // End of variables declaration//GEN-END:variables

    private void Load() {
        
        getComprobantes("",3,1, true);
        
        ActionListener actionListener_filas = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Selected: " + cbx_filas.getSelectedItem());
                System.out.print(", Position: " + cbx_filas.getSelectedIndex());
                int rows = Integer.parseInt(""+cbx_filas.getSelectedItem());
                paginanumber = 1;
                getComprobantes(txt_filtro.getText(), rows, paginanumber, false);
            }
        };
        cbx_filas.addActionListener(actionListener_filas);
    }

    private void getComprobantes(String Filtro, int showrows, int page, boolean no_reload_page) {
        try {
            
            CTR_08_Comprobante ctr = new CTR_08_Comprobante();
            this.table_citas.setModel(ctr.ExploradorCitas(Filtro, showrows, page));
            this.setPaginas_page(ctr.getPaginas_page());
            this.setTotal_registros_bd(ctr.getTotal_registros_bd());
            
            lbl_total.setText(total_registros_bd+ "");
            int rows = Integer.parseInt(""+cbx_filas.getSelectedItem());    
            
            
            if(this.paginanumber == this.paginas_page)
            {
                btn_siguiente.setEnabled(false); 
                btn_final.setEnabled(false);
                btn_principio.setEnabled(true);
                btn_anterior.setEnabled(true);
            }
            if(this.paginanumber == 1)
            {
                btn_siguiente.setEnabled(true); 
                btn_final.setEnabled(true);
                btn_principio.setEnabled(false);
                btn_anterior.setEnabled(false);
            }
            if(total_registros_bd <= rows ){
                btn_siguiente.setEnabled(false); 
                btn_final.setEnabled(false);
                btn_principio.setEnabled(false);
                btn_anterior.setEnabled(false);
            }
            if(paginanumber > 1 && paginanumber < this.paginas_page){
               btn_siguiente.setEnabled(true); 
               btn_final.setEnabled(true);
               btn_principio.setEnabled(true);
               btn_anterior.setEnabled(true);
            }

        } catch (SQLException ex) {
            Logger.getLogger(frm_exploradorCitas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DaoException ex) {
            Logger.getLogger(frm_exploradorCitas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
