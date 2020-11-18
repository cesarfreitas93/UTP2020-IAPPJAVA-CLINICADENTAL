
package WIN33CLC_VIEW;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MenuItem extends javax.swing.JPanel {

    public void setShowing(boolean showing) {
        this.showing = showing;
    }

    public ArrayList<MenuItem> getSubMenu() {
        return subMenu;
    }


    private final ArrayList<MenuItem> subMenu = new ArrayList<>();
    private ActionListener act;

    public MenuItem(Icon icon, String menuName, ActionListener act, MenuItem... subMenu) {
        initComponents();
        lbIcon.setIcon(icon);
        lbName.setText(menuName);
        if (act != null) {
            this.act = act;
        }
        this.setSize(new Dimension(Integer.MAX_VALUE, 45));
        this.setMaximumSize(new Dimension(Integer.MAX_VALUE, 45));
        this.setMinimumSize(new Dimension(Integer.MAX_VALUE, 45));
        for (int i = 0; i < subMenu.length; i++) {
            this.subMenu.add(subMenu[i]);
            subMenu[i].setVisible(false);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIcon = new javax.swing.JLabel();
        lbName = new newscomponents.RSButtonFlat_new();

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        lbName.setBackground(new java.awt.Color(255, 255, 255));
        lbName.setForeground(new java.awt.Color(0, 0, 0));
        lbName.setText("Citas");
        lbName.setBorderPainted(false);
        lbName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents
 public void changeimage(JLabel button, String resourcheimg){
        ImageIcon aimg = new ImageIcon(getClass().getResource(resourcheimg));
        button.setIcon(aimg);
    }
    private boolean showing = false;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        if (showing) {
            hideMenu();
            changeimage(lbIcon, "/WIN34CLC_RESOURCES/icons8-chebrón-hacia-la-derecha-28.png");
        } else {
            showMenu();
            changeimage(lbIcon, "/WIN34CLC_RESOURCES/icons8-flecha-ampliar-28.png");
        }
        if (act != null) {
            act.actionPerformed(null);
        }
    }//GEN-LAST:event_formMousePressed

    private void showMenu() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < subMenu.size(); i++) {
                    sleep();
                    subMenu.get(i).setVisible(true);
                }
                showing = true;
                getParent().repaint();
                getParent().revalidate();
            }
        }).start();
    }

    private void hideMenu() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = subMenu.size() - 1; i >= 0; i--) {
                    sleep();
                    subMenu.get(i).setVisible(false);
                    subMenu.get(i).hideMenu();
                }
                getParent().repaint();
                getParent().revalidate();
                showing = false;
            }
        }).start();
    }

    private void sleep() {
        try {
            Thread.sleep(20);
        } catch (Exception e) {
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbIcon;
    private newscomponents.RSButtonFlat_new lbName;
    // End of variables declaration//GEN-END:variables
}
