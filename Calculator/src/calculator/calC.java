/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Sohan
 */
public class calC extends javax.swing.JFrame 
{
    double x,y;
    char opt;
    int opVar;

    /**
     * Creates new form calC
     */
    public calC() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        display = new javax.swing.JTextField();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        plusop = new javax.swing.JButton();
        minusop = new javax.swing.JButton();
        multop = new javax.swing.JButton();
        divop = new javax.swing.JButton();
        modop = new javax.swing.JButton();
        equalop = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        resetB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        plusop.setText("+");
        plusop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusopActionPerformed(evt);
            }
        });

        minusop.setText("-");
        minusop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusopActionPerformed(evt);
            }
        });

        multop.setText("*");
        multop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multopActionPerformed(evt);
            }
        });

        divop.setText("/");
        divop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divopActionPerformed(evt);
            }
        });

        modop.setText("%");
        modop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modopActionPerformed(evt);
            }
        });

        equalop.setText("=");
        equalop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalopActionPerformed(evt);
            }
        });

        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        dot.setText(".");
        dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotActionPerformed(evt);
            }
        });

        resetB.setText("RESET");
        resetB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(display)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(four, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(five)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(six, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eight)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(multop)
                                .addGap(18, 18, 18)
                                .addComponent(divop))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(zero)
                                .addGap(18, 18, 18)
                                .addComponent(dot))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(plusop, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(minusop))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(modop)
                        .addGap(18, 18, 18)
                        .addComponent(equalop)))
                .addGap(18, 18, 18)
                .addComponent(resetB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {eight, five, four, nine, one, seven, six, three, two});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {divop, dot, equalop, minusop, modop, multop, plusop, zero});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(two)
                            .addComponent(three))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(six)
                            .addComponent(five)
                            .addComponent(four))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(seven)
                                .addComponent(eight)
                                .addComponent(nine))
                            .addComponent(zero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(plusop, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(minusop))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(divop)
                            .addComponent(multop))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(equalop)
                            .addComponent(modop)))
                    .addComponent(resetB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {eight, five, four, nine, one, seven, six, three, two});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {divop, equalop, minusop, modop, multop, plusop});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed

        
        String value=display.getText();
        if(value==""){
        display.setText("1");
        }
        else
        {
            display.setText(value+"1");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed

        String value=display.getText();
        if(value==""){
        display.setText("2");
        }
        else
        {
            display.setText(value+"2");
        }// TODO add your handling code here:
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed

        String value=display.getText();
        if(value==""){
        display.setText("3");
        }
        else
        {
            display.setText(value+"3");
        }// TODO add your handling code here:
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed

        String value=display.getText();
        if(value==""){
        display.setText("4");
        }
        else
        {
            display.setText(value+"4");
        }// TODO add your handling code here:
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed

        String value=display.getText();
        if(value==""){
        display.setText("5");
        }
        else
        {
            display.setText(value+"5");
        }// TODO add your handling code here:
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed

        String value=display.getText();
        if(value==""){
        display.setText("6");
        }
        else
        {
            display.setText(value+"6");
        }// TODO add your handling code here:
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed

        String value=display.getText();
        if(value==""){
        display.setText("7");
        }
        else
        {
            display.setText(value+"7");
        }// TODO add your handling code here:
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed

        String value=display.getText();
        if(value==""){
        display.setText("8");
        }
        else
        {
            display.setText(value+"8");
        }// TODO add your handling code here:
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed

        String value=display.getText();
        if(value==""){
        display.setText("9");
        }
        else
        {
            display.setText(value+"9");
        }// TODO add your handling code here:
    }//GEN-LAST:event_nineActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed

        String value=display.getText();
        if(value==""){
        display.setText("0");
        }
        else
        {
            display.setText(value+"0");
        }// TODO add your handling code here:
    }//GEN-LAST:event_zeroActionPerformed

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotActionPerformed

        String value=display.getText();
        if(value==""){
        display.setText(".");
        }
        else
        {
            display.setText(value+".");
        }// TODO add your handling code here:
    }//GEN-LAST:event_dotActionPerformed

    private void plusopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusopActionPerformed

        String s=display.getText();
        x=Double.parseDouble(s);
        opVar=1;
        display.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_plusopActionPerformed

    private void equalopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalopActionPerformed

        String s1=display.getText();
        y=Double.parseDouble(s1);
        if(opVar==1)
        {
            double sum=x+y;
            String sr=String.valueOf(sum);
            display.setText(sr);
            
        }
        if(opVar==2)
        {
            double sum=x-y;
            String sr=String.valueOf(sum);
            display.setText(sr);
            
        }
        if(opVar==3)
        {
            double sum=x*y;
            String sr=String.valueOf(sum);
            display.setText(sr);
            
        }
        if(opVar==4)
        {
            double sum=x/y;
            String sr=String.valueOf(sum);
            display.setText(sr);
            
        }
        if(opVar==5)
        {
            double sum=x%y;
            String sr=String.valueOf(sum);
            display.setText(sr);
            
        }
        
// TODO add your handling code here:
    }//GEN-LAST:event_equalopActionPerformed

    private void minusopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusopActionPerformed

        String s=display.getText();
        x=Double.parseDouble(s);
        opVar=2;
        display.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_minusopActionPerformed

    private void multopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multopActionPerformed

        String s=display.getText();
        x=Double.parseDouble(s);
        opVar=3;
        display.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_multopActionPerformed

    private void divopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divopActionPerformed

        String s=display.getText();
        x=Double.parseDouble(s);
        opVar=4;
        display.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_divopActionPerformed

    private void modopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modopActionPerformed

        String s=display.getText();
        x=Double.parseDouble(s);
        opVar=5;
        display.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_modopActionPerformed

    private void resetBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBActionPerformed

        display.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_resetBActionPerformed

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
            java.util.logging.Logger.getLogger(calC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField display;
    private javax.swing.JButton divop;
    private javax.swing.JButton dot;
    private javax.swing.JButton eight;
    private javax.swing.JButton equalop;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton minusop;
    private javax.swing.JButton modop;
    private javax.swing.JButton multop;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton plusop;
    private javax.swing.JButton resetB;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
