
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import javax.swing.JOptionPane;


public class mentor_login extends javax.swing.JFrame
{
  
    public mentor_login() {
        initComponents();
        setBounds(20, 20, 470, 370);
     
        setTitle("Mentor Login");
       
        setVisible(true);
    }
   public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mentor_login().setVisible(true);
            }
        });
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        pf1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        lb1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb1.setText("User Name :-");
        getContentPane().add(lb1);
        lb1.setBounds(20, 80, 100, 40);

        lb2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb2.setText("Password :-");
        getContentPane().add(lb2);
        lb2.setBounds(20, 150, 90, 30);
        getContentPane().add(tf1);
        tf1.setBounds(130, 90, 210, 30);
        getContentPane().add(pf1);
        pf1.setBounds(130, 150, 210, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Sign up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(170, 220, 90, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Sign In");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(275, 220, 90, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Sign In");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 20, 130, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          String user=tf1.getText();
      String pass=pf1.getText();
        
        try {
            HttpResponse<String> httpobj = Unirest.get("http://localhost:8888/MentorLogin").
                    queryString("email",user)
                    .queryString("password",pass).asString();
       
            if(httpobj.getStatus()==200)
            {
                if(httpobj.getBody().equals("success"))
                {
                    System.out.println("success");
                     MentorHome mh=new MentorHome();
                }
                else
                {
                   JOptionPane.showMessageDialog(this, httpobj.getBody());
                }
            }
        
        
        
        
        }
        catch (UnirestException ex) 
        {
            ex.printStackTrace();
        }
        
        
        
      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MentorSignUp s=new MentorSignUp();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JPasswordField pf1;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables
}
