package face;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class TestFace extends javax.swing.JFrame {
    Face f;
    Graphics g;
    
    public TestFace() {
        initComponents();
        f = new Face (facepanel.getGraphics(),100,100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        movefacebtn = new javax.swing.JButton();
        resizefacebtn = new javax.swing.JButton();
        changecolorbtn = new javax.swing.JButton();
        togglemoodbtn = new javax.swing.JButton();
        facepanel = new javax.swing.JPanel();
        initialbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        movefacebtn.setBackground(new java.awt.Color(204, 204, 255));
        movefacebtn.setText("Move Face");
        movefacebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movefacebtnActionPerformed(evt);
            }
        });

        resizefacebtn.setBackground(new java.awt.Color(204, 204, 255));
        resizefacebtn.setText("Resize Face");
        resizefacebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resizefacebtnActionPerformed(evt);
            }
        });

        changecolorbtn.setBackground(new java.awt.Color(204, 204, 255));
        changecolorbtn.setText("Change Color");
        changecolorbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changecolorbtnActionPerformed(evt);
            }
        });

        togglemoodbtn.setBackground(new java.awt.Color(204, 204, 255));
        togglemoodbtn.setText("Toggle Mood");
        togglemoodbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                togglemoodbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(movefacebtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resizefacebtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changecolorbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(togglemoodbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changecolorbtn)
                    .addComponent(togglemoodbtn)
                    .addComponent(resizefacebtn)
                    .addComponent(movefacebtn))
                .addContainerGap())
        );

        facepanel.setBackground(new java.awt.Color(255, 255, 255));
        facepanel.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout facepanelLayout = new javax.swing.GroupLayout(facepanel);
        facepanel.setLayout(facepanelLayout);
        facepanelLayout.setHorizontalGroup(
            facepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        facepanelLayout.setVerticalGroup(
            facepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 235, Short.MAX_VALUE)
        );

        initialbtn.setBackground(new java.awt.Color(204, 204, 255));
        initialbtn.setText("Set Initial Face");
        initialbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initialbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(facepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(initialbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(facepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(initialbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initialbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initialbtnActionPerformed
        //enables all 4 face control buttons these should start out disabled
        togglemoodbtn.setEnabled(true);
        changecolorbtn.setEnabled(true);
        resizefacebtn.setEnabled(true);
        movefacebtn.setEnabled(true);
        f.erase();
        f.draw();
    }//GEN-LAST:event_initialbtnActionPerformed

    private void togglemoodbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_togglemoodbtnActionPerformed
       f.togglemood();
       f.erase();
       f.draw();
            
    }//GEN-LAST:event_togglemoodbtnActionPerformed

    private void changecolorbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changecolorbtnActionPerformed
        Color newColor = JColorChooser.showDialog(this, "Pick Face Color", Color.red);
        f.setfaceColor(newColor);
        newColor = JColorChooser.showDialog(this, "Pick Eye Color", Color.red);
        f.seteyeColor(newColor);
        f.erase();
        f.draw();
    }//GEN-LAST:event_changecolorbtnActionPerformed

    private void resizefacebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resizefacebtnActionPerformed
        int newd = Integer.parseInt(JOptionPane.showInputDialog(this,"Enter New Diameter"));
        f.erase();
        f.resize(g,newd);
    }//GEN-LAST:event_resizefacebtnActionPerformed

    private void movefacebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movefacebtnActionPerformed
        int newx = Integer.parseInt(JOptionPane.showInputDialog(this,"Enter New X"));
        int newy = Integer.parseInt(JOptionPane.showInputDialog(this,"Enter New Y"));
        f.erase();
        f.move(g,newx,newy);
        
    }//GEN-LAST:event_movefacebtnActionPerformed

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
            java.util.logging.Logger.getLogger(TestFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestFace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changecolorbtn;
    private javax.swing.JPanel facepanel;
    private javax.swing.JButton initialbtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton movefacebtn;
    private javax.swing.JButton resizefacebtn;
    private javax.swing.JButton togglemoodbtn;
    // End of variables declaration//GEN-END:variables
}
