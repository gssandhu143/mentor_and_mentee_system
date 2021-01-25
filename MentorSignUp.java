
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class MentorSignUp extends javax.swing.JFrame {

   
    public MentorSignUp() {
        initComponents();
        setSize(500,600);
          setLocation(100,100);
          setTitle("Mentor Signup");
            for(int i=0;i<extra.sques.length;i++)
        {
           
            cb1.addItem(extra.sques[i]);
            
        }
       
          setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        tf7 = new javax.swing.JTextField();
        tf1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox();
        bt1 = new javax.swing.JButton();
        pf2 = new javax.swing.JPasswordField();
        pf1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("UserName");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 70, 100, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 120, 100, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 270, 100, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Confirm Password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 310, 140, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Security Question");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 360, 140, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Sign Up");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(160, 10, 100, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Security Answer");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 410, 130, 40);

        tf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf2ActionPerformed(evt);
            }
        });
        getContentPane().add(tf2);
        tf2.setBounds(200, 130, 220, 30);
        getContentPane().add(tf3);
        tf3.setBounds(200, 180, 220, 30);
        getContentPane().add(tf4);
        tf4.setBounds(200, 220, 220, 30);
        getContentPane().add(tf7);
        tf7.setBounds(200, 410, 220, 30);
        getContentPane().add(tf1);
        tf1.setBounds(200, 80, 220, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("E-Mail");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 170, 100, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Phone No. ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 220, 100, 40);

        getContentPane().add(cb1);
        cb1.setBounds(200, 370, 220, 30);

        bt1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt1.setText("Sign Up");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(150, 460, 120, 40);
        getContentPane().add(pf2);
        pf2.setBounds(201, 320, 220, 30);
        getContentPane().add(pf1);
        pf1.setBounds(200, 270, 220, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf2ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed

        String user=tf1.getText();
          String name=tf2.getText();
        String email=tf3.getText();
        String phone = tf4.getText();
        String pass=pf1.getText();
         String cpass=pf2.getText();
         String sques=cb1.getSelectedItem().toString();
         String sans=tf4.getText();
          if(user.equals("")|| email.equals("")||phone.equals("")|| pass.equals("")||cpass.equals("")||sques.equals("")||
                 sans.equals("")|| name.equals(""))
         {
             JOptionPane.showMessageDialog(this, "All Fields Are Required!!");
         }
          else
          {
               if(pass.equals(cpass))
         {   HttpResponse <String> httpobj;
           try {
               httpobj = Unirest.get("http://localhost:8888/MentorSignUp").queryString("user",user).queryString("name",name).queryString("email",email)
                       .queryString("phone",phone).queryString("pass",pass).queryString("cpass",cpass).queryString("sques",sques)
                       .queryString("sans",sans).asString();
                if(httpobj.getStatus()==200)
               {
                    if(httpobj.getBody().equals("SignUp Successfully"))
                {
                    
                 mentor_login obj=new mentor_login();
                }
                else
                {
                   JOptionPane.showMessageDialog(this, httpobj.getBody());
                }
               }
           } catch (UnirestException ex) {
               Logger.getLogger(MentorSignUp.class.getName()).log(Level.SEVERE, null, ex);
           }
         }
         else
         {
             JOptionPane.showMessageDialog(this, "Password and Confirm Password Doesn't match!!!");
         }
          }
         


// TODO add your handling code here:
    }//GEN-LAST:event_bt1ActionPerformed
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
            java.util.logging.Logger.getLogger(MentorSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MentorSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MentorSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MentorSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MentorSignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JComboBox cb1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField pf1;
    private javax.swing.JPasswordField pf2;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf7;
    // End of variables declaration//GEN-END:variables
}
