
package WIN33CLC_VIEW;

import RSMaterialComponent.RSPanelMaterial;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;


public class ayuda extends javax.swing.JPanel {

FondoPanel fondo = new FondoPanel();
    public ayuda() {
       
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 765, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 747, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

class FondoPanel extends RSPanelMaterial

{
    
    private Image imagen;
    
    @Override
    public void paint(Graphics g)
    {
        imagen = new ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES_UI/wallpaper.png")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }
}

}
