package onlinebankingapplication;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BankMain extends javax.swing.JFrame {
    public BankMain() {
        initComponents();
    }
    static int acc_flag = 0;
    static Long num;
    static String name_1;
    private double balance;
    private long accNum  ;
    private String accHolder;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new JButton();
        jLabel1 = new JLabel();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton6 = new JButton();
        jButton7 = new JButton();
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        jMenuItem1 = new JMenuItem();
        jSeparator1 = new JPopupMenu.Separator();
        jMenuItem3 = new JMenuItem();
        jMenuItem4 = new JMenuItem();
        jMenu2 = new JMenu();
        jMenuItem5 = new JMenuItem();
        jMenuItem6 = new JMenuItem();
        jMenuItem7 = new JMenuItem();

        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("SATHYABAMA Bank Account Manager");

        jButton1.setText("Create Account");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            	new AccountCreation();
            }
        });

        jLabel1.setFont(new Font("Microsoft Sans Serif", 1, 15)); // NOI18N
        jLabel1.setText("WELCOME TO SATHYABAMA BANK RECORD MANAGER!");

        jButton2.setText("Deposit");
        jButton2.setMaximumSize(new Dimension(107, 23));
        jButton2.setMinimumSize(new Dimension(107, 23));
        jButton2.setPreferredSize(new Dimension(107, 23));
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Withdraw");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Check Balance");
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("About");
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("EXIT");
        jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jMenu1.setText("New");

        jMenuItem1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
        jMenuItem1.setText("New Account..");
        jMenuItem1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem3.setText("About");
        jMenuItem3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
        jMenuItem4.setText("Exit");
        jMenuItem4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Transaction");

        jMenuItem5.setText("Deposit Amount..");
        jMenuItem5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Withdraw Amount..");
        jMenuItem6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_MASK));
        jMenuItem7.setText("Check Account Balance..");
        jMenuItem7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jButton6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(110, 110, 110))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private static Account acc;
    
    private void jMenuItem6ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
           try
           {
               String num;
               num = JOptionPane.showInputDialog(null, "Enter a Amount To Withdraw:", "Withdraw Amount", 1);
               double num1 = Double.parseDouble(num);
//               acc.withdraw(num1);
               balance = balance - num1;
           }
           catch(Exception ex)
           {
               JOptionPane.showMessageDialog(null, ex, "Error", 2);
           }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try
        {
        	if(acc_flag == 1)
        	{
        		String num;
                num = JOptionPane.showInputDialog(null, "Enter a Value To Deposit:", "Deposit Amount", 1);
                double num1 = Double.parseDouble(num);
                if(num1 > 0)
                {
                	balance = balance + num1;
                }
                else
                	JOptionPane.showMessageDialog(null,"Enter Valid Amount");
        	}
        	else
        		JOptionPane.showMessageDialog(null,"Account Not Found");
        }
        catch(NumberFormatException | NullPointerException nfe1)
        {
            JOptionPane.showMessageDialog(null, nfe1, "Error", 2);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton6ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JOptionPane.showMessageDialog(null,"Created By SATHYABAMA STUDENTS ", "About", 1);
    }

    private void jMenuItem3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        JOptionPane.showMessageDialog(null,"Created By SATHYABAMA STUDENTS", "About", 1);
    }

    private void jMenuItem4ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        System.exit(0);
    }

    private void jMenuItem5ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try
        {
        	if(acc_flag == 1)
        	{
        		String num;
                num = JOptionPane.showInputDialog(null, "Enter a Value To Deposit:", "Deposit Amount", 1);
                double num1 = Double.parseDouble(num);
                if(num1 > 0)
                {
                	balance = balance + num1;
                }
                else
                	JOptionPane.showMessageDialog(null,"Enter Valid Amount");
        	}
        	else
        		JOptionPane.showMessageDialog(null,"Account Not Found");
           
        }
        catch(NumberFormatException | NullPointerException nfe1)
        {
            JOptionPane.showMessageDialog(null, nfe1, "Error", 2);
        }
    }

    private void jMenuItem7ActionPerformed(ActionEvent evt) {
       try
       {
    	   double num = balance;
         JOptionPane.showMessageDialog(null, "Current Balance: " + num, "Current Balance", 1);
       }
       catch(NullPointerException npe)
       {
           JOptionPane.showMessageDialog(null, npe, "Error", 2);
       }
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        try
           {
        	if(acc_flag == 1)
        	{
        		if(balance > 0)
        		{
        			 String num;
                     num = JOptionPane.showInputDialog(null, "Enter a Amount To Withdraw:", "Withdraw Amount", 1);
                     double num1 = Double.parseDouble(num);
                     balance = balance - num1;
        		}
        		else
        			JOptionPane.showMessageDialog(null,"Insufficient Balance");
        	}
        	else
        	{
        		JOptionPane.showMessageDialog(null,"Account Not Found");
        	}
           }
           catch(Exception ex)
           {
               JOptionPane.showMessageDialog(null, ex, "Error", 2);
               ex.printStackTrace();
           }
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
       try
       {
    	   if(acc_flag == 1)
    	   {
    		   double num = balance;
    	       JOptionPane.showMessageDialog(null, "Current Balance: " + num, "Current Balance", 1);  
    	   }
    	   else
    	   {
    		   JOptionPane.showMessageDialog(null,"Account Not Found");
    	   }
       }
       catch(NullPointerException npe)
       {
           JOptionPane.showMessageDialog(null, npe, "Error", 2);
           npe.printStackTrace();
       }
    }
    private void jButton7ActionPerformed(ActionEvent evt) {
        System.exit(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(BankMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        java.awt.EventQueue.invokeLater(() -> {
            new BankMain().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton6;
    private JButton jButton7;
    private JLabel jLabel1;
    private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem1;
    private JMenuItem jMenuItem3;
    private JMenuItem jMenuItem4;
    private JMenuItem jMenuItem5;
    private JMenuItem jMenuItem6;
    private JMenuItem jMenuItem7;
    private JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}