package inlämningsprojekt_ny;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
/**
 *
 * @author svanteskold
 */
public class ProjektchefMeny extends javax.swing.JFrame {
private InfDB idb;
private String inloggadAnvandare;
private int aid;
private String pid;
    /**
     * Creates new form Meny
     */
    public ProjektchefMeny(InfDB idb,String inloggadAnvandare, int aid) {
        this.idb= idb;    
        this.aid = aid;
        this.inloggadAnvandare = inloggadAnvandare;
        this.pid = pid;
        try{
        initComponents();
        inloggadAnvandareLabel.setText(inloggadAnvandare);
        //hej
        getContentPane().setBackground(new java.awt.Color(30, 30, 30));
        
        huvudmenyLabel.setForeground(new java.awt.Color(255, 192, 203));
        inloggadAnvandareLabel.setForeground(new java.awt.Color(255, 192, 203));
        
        javax.swing.JButton[] knappar = {
            minaProjektButton, avdelningButton, hallbarhetsmalenButton,
            minProfilButton, loggaUtButton, projektchefStatistikButton
        };
        for(javax.swing.JButton knapp : knappar){
            knapp.setBackground(new java.awt.Color(0, 0, 0));
            knapp.setForeground(new java.awt.Color(255, 255, 255));
            knapp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            knapp.setFocusPainted(false);
            knapp.setOpaque(true);
            knapp.setContentAreaFilled(true);
        }
        }catch (Exception e) {
            e.printStackTrace();
        }
             
             //hej
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inloggadAnvandareLabel = new javax.swing.JLabel();
        minaProjektButton = new javax.swing.JButton();
        avdelningButton = new javax.swing.JButton();
        hallbarhetsmalenButton = new javax.swing.JButton();
        minProfilButton = new javax.swing.JButton();
        huvudmenyLabel = new javax.swing.JLabel();
        loggaUtButton = new javax.swing.JButton();
        projektchefStatistikButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inloggadAnvandareLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        inloggadAnvandareLabel.setText("Användare:");

        minaProjektButton.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        minaProjektButton.setText("Mina Projekt");
        minaProjektButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minaProjektButtonActionPerformed(evt);
            }
        });

        avdelningButton.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        avdelningButton.setText("Avdelning");
        avdelningButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avdelningButtonActionPerformed(evt);
            }
        });

        hallbarhetsmalenButton.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        hallbarhetsmalenButton.setText("Hållbarhetsmålen");
        hallbarhetsmalenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hallbarhetsmalenButtonActionPerformed(evt);
            }
        });

        minProfilButton.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        minProfilButton.setText("Min Profil");
        minProfilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minProfilButtonActionPerformed(evt);
            }
        });

        huvudmenyLabel.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        huvudmenyLabel.setText("Projektchef");

        loggaUtButton.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        loggaUtButton.setText("Logga Ut");
        loggaUtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loggaUtButtonActionPerformed(evt);
            }
        });

        projektchefStatistikButton.setText("Statistik");
        projektchefStatistikButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projektchefStatistikButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loggaUtButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(minProfilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 52, Short.MAX_VALUE)
                        .addComponent(minaProjektButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inloggadAnvandareLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(projektchefStatistikButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(avdelningButton, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                        .addGap(57, 57, 57)
                        .addComponent(hallbarhetsmalenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(huvudmenyLabel)
                .addGap(293, 293, 293))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(huvudmenyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inloggadAnvandareLabel)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(avdelningButton, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                        .addComponent(hallbarhetsmalenButton, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                    .addComponent(minaProjektButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(75, 75, 75)
                .addComponent(projektchefStatistikButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loggaUtButton)
                    .addComponent(minProfilButton))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avdelningButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avdelningButtonActionPerformed
    // TODO add your handling code here:
    new ProjektchefAvdelning(idb, inloggadAnvandare, aid).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_avdelningButtonActionPerformed

    private void loggaUtButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggaUtButtonActionPerformed
        // TODO add your handling code here:
        new Inloggning(idb).setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_loggaUtButtonActionPerformed

    private void minaProjektButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minaProjektButtonActionPerformed
        // TODO add your handling code here:
        new ProjektchefMinaProjekt(idb, inloggadAnvandare, aid, pid).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_minaProjektButtonActionPerformed

    private void hallbarhetsmalenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hallbarhetsmalenButtonActionPerformed
        // TODO add your handling code here:
        new ProjektchefHallbarhetsmal(idb, inloggadAnvandare, aid).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_hallbarhetsmalenButtonActionPerformed

    private void minProfilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minProfilButtonActionPerformed
        // TODO add your handling code here:
        String sqlFraga="SELECT aid FROM anstalld WHERE epost = '" + inloggadAnvandare+"';";
        String userId;
    try {
        userId = idb.fetchSingle(sqlFraga);
        System.out.println("Hämtat userId från databasen: " + userId);
        if(userId == null || userId.isEmpty()){
            JOptionPane.showMessageDialog(this, "Användare hittades inte i databasen.");
            return;
        }
          int aid = Integer.parseInt(userId);
          System.out.println("Öppnar Personuppgifter med aid: " + aid);
          
        new ProjekchefPersonuppgifter(idb, aid, inloggadAnvandare).setVisible(true);
        this.dispose();
    } catch (InfException ex) {
        Logger.getLogger(ProjektchefMeny.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Fel vid hämtning av anställnings-ID: " + ex.getMessage());
    }
    }//GEN-LAST:event_minProfilButtonActionPerformed

    private void projektchefStatistikButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projektchefStatistikButtonActionPerformed
        // TODO add your handling code here:
        new ProjektchefStatistik(idb, inloggadAnvandare, aid).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_projektchefStatistikButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ProjektchefMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjektchefMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjektchefMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjektchefMeny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Meny().setVisible(true);
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avdelningButton;
    private javax.swing.JButton hallbarhetsmalenButton;
    private javax.swing.JLabel huvudmenyLabel;
    private javax.swing.JLabel inloggadAnvandareLabel;
    private javax.swing.JButton loggaUtButton;
    private javax.swing.JButton minProfilButton;
    private javax.swing.JButton minaProjektButton;
    private javax.swing.JButton projektchefStatistikButton;
    // End of variables declaration//GEN-END:variables
}
