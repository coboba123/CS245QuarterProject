/***************************************************************
* File: HelpFrame.java
* Author: Albert Gil, Cody Nguyen, Ynebin Yin, Matt Musquiz
* Class: CS 245 - Programming Graphical User Interfaces
*
* Assignment: Hangman V1.0
* Date last modified: 10/9/17
*
* Purpose: This class creates a menu that shows the player how to play the game 
* when the question mark button is pressed
****************************************************************/ 
package Main;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

/**
 *
 * @author Computer
 */
public class HelpFrame extends javax.swing.JFrame {

    /**
     *
     */
    public HelpFrame() {
        escapeListener();
        initComponents();
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        jTextPane1.setEditable(false);
        jTextPane1.setText("How To Play:\n\nHangman is a guessing game where you need to guess letters until you have found the correct word. Once you select a letter, that letter will either be filled into the answer or a piece of the \"Hangman\" will be drawn. You win if you guess all the letters correctly before the \"Hangman\" is completely drawn, and you lose if the \"Hangman\" is completed.");
        jTextPane1.setPreferredSize(new java.awt.Dimension(300, 200));
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, java.awt.BorderLayout.PAGE_END);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
