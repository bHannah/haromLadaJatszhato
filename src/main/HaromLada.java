package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class HaromLada extends javax.swing.JFrame {
    
    boolean vanEKincs=true;
    public HaromLada() throws IOException {
        initComponents();
        InputStream szoveg = HaromLada.class.getClassLoader().getResourceAsStream("res/ladafeliratok.txt");
        BufferedReader ladaFeliratok = new BufferedReader(new InputStreamReader(szoveg));
        aranyLada.setText(ladaFeliratok.readLine());
        ezustLada.setText(ladaFeliratok.readLine());
        bronzLada.setText(ladaFeliratok.readLine());
        gombKiveszem.setVisible(false);
        gombNemVeszem.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        konténer = new javax.swing.JPanel();
        foCim = new javax.swing.JLabel();
        ezustLada = new javax.swing.JButton();
        bronzLada = new javax.swing.JButton();
        aranyLada = new javax.swing.JButton();
        leiras = new javax.swing.JLabel();
        feladat = new javax.swing.JLabel();
        gombUjra = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        gombKiveszem = new javax.swing.JButton();
        gombNemVeszem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        konténer.setMaximumSize(new java.awt.Dimension(0, 0));

        foCim.setText("Három Láda Logikai játék");

        ezustLada.setBackground(new java.awt.Color(204, 204, 204));
        ezustLada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ezustLadaActionPerformed(evt);
            }
        });

        bronzLada.setBackground(new java.awt.Color(195, 125, 125));
        bronzLada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bronzLadaActionPerformed(evt);
            }
        });

        aranyLada.setBackground(new java.awt.Color(255, 204, 102));
        aranyLada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aranyLadaActionPerformed(evt);
            }
        });

        leiras.setText("A három láda feliratai közül csak 1 lehet igaz, ");
        leiras.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        feladat.setText("Kattints arra a ládára amiben szerinted a kincs van");

        gombUjra.setText("Újra");
        gombUjra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gombUjraActionPerformed(evt);
            }
        });

        jLabel1.setText("a másik kettő biztosan hamis.");

        gombKiveszem.setText("Kiveszem a pénzt");
        gombKiveszem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gombKiveszemActionPerformed(evt);
            }
        });

        gombNemVeszem.setText("Nem veszem ki");

        javax.swing.GroupLayout konténerLayout = new javax.swing.GroupLayout(konténer);
        konténer.setLayout(konténerLayout);
        konténerLayout.setHorizontalGroup(
            konténerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(konténerLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(konténerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leiras)
                    .addGroup(konténerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, konténerLayout.createSequentialGroup()
                            .addComponent(gombKiveszem)
                            .addGap(18, 18, 18)
                            .addComponent(gombNemVeszem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(konténerLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gombUjra))
                        .addComponent(aranyLada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ezustLada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bronzLada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(feladat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, konténerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(foCim)
                .addGap(135, 135, 135))
        );
        konténerLayout.setVerticalGroup(
            konténerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, konténerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(foCim, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(feladat)
                .addGap(18, 18, 18)
                .addComponent(aranyLada, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ezustLada, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(konténerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gombKiveszem)
                    .addComponent(gombNemVeszem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bronzLada, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(leiras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(konténerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gombUjra)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(konténer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(konténer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ezustLadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ezustLadaActionPerformed
        InputStream szoveg = HaromLada.class.getClassLoader().getResourceAsStream("res/nyert.txt");
        BufferedReader nyert = new BufferedReader(new InputStreamReader(szoveg));
        try {
            ezustLada.setText(nyert.readLine());
        } catch (IOException ex) {
            Logger.getLogger(HaromLada.class.getName()).log(Level.SEVERE, null, ex);
        }
        aranyLada.setEnabled(false);
        bronzLada.setEnabled(false);
        gombKiveszem.setVisible(true);
        gombNemVeszem.setVisible(true);
    }//GEN-LAST:event_ezustLadaActionPerformed

    private void aranyLadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aranyLadaActionPerformed
        InputStream szoveg = HaromLada.class.getClassLoader().getResourceAsStream("res/nemnyert.txt");
        BufferedReader nemnyert = new BufferedReader(new InputStreamReader(szoveg));
        try {
            aranyLada.setText(nemnyert.readLine());
        } catch (IOException ex) {
            Logger.getLogger(HaromLada.class.getName()).log(Level.SEVERE, null, ex);
        }
        ezustLada.setEnabled(false);
        bronzLada.setEnabled(false);
    }//GEN-LAST:event_aranyLadaActionPerformed

    private void bronzLadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bronzLadaActionPerformed
        InputStream szoveg = HaromLada.class.getClassLoader().getResourceAsStream("res/nemnyert.txt");
        BufferedReader nemnyert = new BufferedReader(new InputStreamReader(szoveg));
        try {
            bronzLada.setText(nemnyert.readLine());
        } catch (IOException ex) {
            Logger.getLogger(HaromLada.class.getName()).log(Level.SEVERE, null, ex);
        }
        aranyLada.setEnabled(false);
        ezustLada.setEnabled(false);
    }//GEN-LAST:event_bronzLadaActionPerformed

    private void gombUjraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gombUjraActionPerformed
        aranyLada.setEnabled(true);
        ezustLada.setEnabled(true);
        bronzLada.setEnabled(true);
        gombKiveszem.setVisible(false);
        gombNemVeszem.setVisible(false);
    }//GEN-LAST:event_gombUjraActionPerformed

    private void gombKiveszemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gombKiveszemActionPerformed

        if (vanEKincs==true){
            vanEKincs=false;
            JOptionPane.showMessageDialog(null,"Sikerült kivenned a kincset!");
        }else{
            JOptionPane.showMessageDialog(null,"Már kivetted a kincset!");
        }
        
    }//GEN-LAST:event_gombKiveszemActionPerformed

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String args[]) throws IOException {
        
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new HaromLada().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(HaromLada.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aranyLada;
    private javax.swing.JButton bronzLada;
    private javax.swing.JButton ezustLada;
    private javax.swing.JLabel feladat;
    private javax.swing.JLabel foCim;
    private javax.swing.JButton gombKiveszem;
    private javax.swing.JButton gombNemVeszem;
    private javax.swing.JButton gombUjra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel konténer;
    private javax.swing.JLabel leiras;
    // End of variables declaration//GEN-END:variables
}

