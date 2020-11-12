
package WIN33CLC_VIEW;

import WIN30CLC_DAO.DaoException;
import WIN31CLC_DTO.Patient;
import WIN32CLC_CTR.CTR_02_Patient;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;


public class frm_02_Patient extends javax.swing.JFrame {

    private CTR_02_Patient cTR_02_Patient;
    public frm_02_Patient() {
        initComponents();
        cTR_02_Patient = new CTR_02_Patient();
      //getContentPane().setBackground(Color.YELLOW);
         //setBackground(new Color (255,255,255,250));
        
         panelContenedor.setOpaque(false);
        
        setLocationRelativeTo(null); 
        Shape forma = new RoundRectangle2D.Double(0, 0, getBounds().width, getBounds().height, 20, 20);
        AWTUtilities.setWindowShape(this, forma);
        LoadData();
       // tablePatients.setBackground(new Color (255,255,255,250));
        
        
    }
int xx,xy;


    public void LoadData() {
        try {
            CTR_02_Patient ctr = new CTR_02_Patient();
            this.tablePatients.setModel(ctr.ListPatients());
            this.tablePatients.getSelectionModel().addListSelectionListener(e ->{
                boolean seleccionValid = (tablePatients.getSelectedRow() != -1);
                //btnEdit.setEnabled(seleccionValid);
                //btnDelete.setEnabled(seleccionValid);
            });
        } catch (DaoException ex) {
            Logger.getLogger(frm_02_Patient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frm_02_Patient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.tablePatients.setDefaultRenderer(JButton.class, new TableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object objeto, boolean estaSeleccionado, boolean tieneElFoco, int fila, int columna) {
                return (Component) objeto;
            }
        });
        
        this.tablePatients.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = tablePatients.rowAtPoint(e.getPoint());
                int columna = tablePatients.columnAtPoint(e.getPoint());

                System.out.println("click"); 
                detalle.setEditable(true);
                
                if (tablePatients.getModel().getColumnClass(columna).equals(JButton.class)) {
                    try {
                        System.out.println(tablePatients.getModel().getValueAt(fila, 0));
                        cTR_02_Patient.DeletePatien((long)tablePatients.getModel().getValueAt(fila, 0));   
                        System.out.println("eliminado por el botton");
                        tablePatients.setModel(cTR_02_Patient.ListPatients());
                        detalle.setEditable(false);
                    } catch (SQLException ex) {
                        Logger.getLogger(frm_02_Patient.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (DaoException ex) {
                        Logger.getLogger(frm_02_Patient.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                if (!tablePatients.getModel().getColumnClass(0).equals(JButton.class)) {
                        //System.out.println(tablePatients.getModel().getValueAt(fila, 0)); 
                        detalle.setId((long)tablePatients.getModel().getValueAt(fila, 0));

                }
                
            }

        
        });
    }
  
    private Patient getPatientSelected() throws SQLException, DaoException{
        CTR_02_Patient ctr = new CTR_02_Patient();
        int id = (int) tablePatients.getValueAt(tablePatients.getSelectedRow(), 0);
        return ctr.SelectPatient(id);
    }

    public void mensaje() throws DaoException, SQLException{
        tablePatients.setModel(cTR_02_Patient.ListPatients());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContenedor = new javax.swing.JPanel();
        detalle = new WIN33CLC_VIEW.frm_02_Patient_Detail();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePatients = new rojerusan.RSTableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setUndecorated(true);

        panelContenedor.setBackground(new java.awt.Color(255, 255, 255));
        panelContenedor.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelContenedorMouseDragged(evt);
            }
        });
        panelContenedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelContenedorMousePressed(evt);
            }
        });
        panelContenedor.setLayout(new java.awt.BorderLayout());

        detalle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                detalleMouseDragged(evt);
            }
        });
        detalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                detalleMousePressed(evt);
            }
        });
        detalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                detalleKeyPressed(evt);
            }
        });
        panelContenedor.add(detalle, java.awt.BorderLayout.PAGE_START);

        tablePatients.setModel(new javax.swing.table.DefaultTableModel(
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
        tablePatients.setColorBackgoundHead(new java.awt.Color(3, 111, 198));
        tablePatients.setColorFilasBackgound2(new java.awt.Color(42, 170, 232));
        tablePatients.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tablePatients.setColorFilasForeground2(new java.awt.Color(255, 255, 255));
        tablePatients.setFuenteFilas(new java.awt.Font("Segoe UI Light", 0, 15)); // NOI18N
        tablePatients.setFuenteFilasSelect(new java.awt.Font("ITC Avant Garde Std Bk", 1, 15)); // NOI18N
        tablePatients.setFuenteHead(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        tablePatients.setGrosorBordeFilas(0);
        tablePatients.setGrosorBordeHead(0);
        tablePatients.setRowHeight(24);
        jScrollPane2.setViewportView(tablePatients);

        panelContenedor.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 1079, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void detalleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_detalleKeyPressed

    }//GEN-LAST:event_detalleKeyPressed

    private void detalleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detalleMousePressed

    }//GEN-LAST:event_detalleMousePressed

    private void detalleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detalleMouseDragged
    
    }//GEN-LAST:event_detalleMouseDragged

    private void panelContenedorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContenedorMousePressed
      xx=evt.getX();
  xy=evt.getY();      
    }//GEN-LAST:event_panelContenedorMousePressed

    private void panelContenedorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelContenedorMouseDragged
     int x=evt.getXOnScreen();
       int y=evt.getYOnScreen();
       
        this.setLocation(x-xx, y-xy);   
    }//GEN-LAST:event_panelContenedorMouseDragged

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
            java.util.logging.Logger.getLogger(frm_02_Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_02_Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_02_Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_02_Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_02_Patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private WIN33CLC_VIEW.frm_02_Patient_Detail detalle;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelContenedor;
    private rojerusan.RSTableMetro tablePatients;
    // End of variables declaration//GEN-END:variables
}
