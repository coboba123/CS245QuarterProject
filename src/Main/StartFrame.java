/** *************************************************************
 * file: HighScoreFrame.java
 * author: Albert Gil, Cody Nguyen, Ynebin Yin, Matt Musquiz
 * class: CS 245 - Programming Graphical User Interfaces
 *
 * assignment: Hangman V1.0
 * date last modified: 10/3/17
 *
 * purpose: This class appears first when the program is run, and stays for 3
 * seconds, then transitions into the Main Menu.
 *************************************************************** */
package Main;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

public class StartFrame extends javax.swing.JFrame {

    public StartFrame() {
        escapeListener();
        initComponents();
    }

    public void run() throws IOException {
        new MainMenuFrame().setVisible(true);
    }
    
     public final void escapeListener() {
        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "Cancel");
        getRootPane().getActionMap().put("Cancel", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public void stall() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException ex) {
            Logger.getLogger(StartFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        TeamName = new javax.swing.JLabel();
        BackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        Title.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        Title.setText("CS 245 Quarter Project");
        getContentPane().add(Title);
        Title.setBounds(340, 50, 200, 14);

        TeamName.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        TeamName.setText("Team Diamond Dogs");
        getContentPane().add(TeamName);
        TeamName.setBounds(400, 70, 150, 16);

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/BackGround.jpg"))); // NOI18N
        BackGround.setText("jLabel1");
        BackGround.setMaximumSize(new java.awt.Dimension(600, 400));
        BackGround.setMinimumSize(new java.awt.Dimension(100, 40));
        BackGround.setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().add(BackGround);
        BackGround.setBounds(0, -90, 780, 480);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) throws IOException {
        StartFrame Main = new StartFrame();
        Main.setVisible(true);
        Main.stall();
        Main.dispose();
        
        Main.run();

    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGround;
    private javax.swing.JLabel TeamName;
    private javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables

}
