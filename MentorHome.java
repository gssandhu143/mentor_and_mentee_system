
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.StringTokenizer;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class MentorHome extends javax.swing.JFrame {
   
    
    public MentorHome() {
        
        initComponents();
        Dimension dm=Toolkit.getDefaultToolkit().getScreenSize();
        int height=dm.height;
        int width=dm.width;
      
        jp2.setBounds(10, 140, 165, height-210);
        jp1.setBounds(10, 10, 1150,120);
        jScrollPane2.setBounds(180, 140, width-400, height-240);
       
        setSize(width-175,height-40);
        getdata();
        setVisible(true);
        setTitle("Mentor Home");
        
        //photo set manually
          
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jp2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jp1.setBackground(new java.awt.Color(204, 204, 255));
        jp1.setForeground(new java.awt.Color(153, 255, 153));
        jp1.setLayout(null);

        jButton1.setText("Log-out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jp1.add(jButton1);
        jButton1.setBounds(960, 10, 150, 30);

        jButton2.setText("Change Password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jp1.add(jButton2);
        jButton2.setBounds(960, 70, 150, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Name:- ");
        jp1.add(jLabel1);
        jLabel1.setBounds(230, 20, 60, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Designation:-");
        jp1.add(jLabel2);
        jLabel2.setBounds(570, 30, 110, 30);

        jLabel3.setText("Photo");
        jp1.add(jLabel3);
        jLabel3.setBounds(0, 0, 110, 110);

        getContentPane().add(jp1);
        jp1.setBounds(13, 9, 1170, 110);

        jp2.setBackground(new java.awt.Color(255, 153, 153));
        jp2.setLayout(null);

        jButton3.setText("Students");
        jp2.add(jButton3);
        jButton3.setBounds(30, 20, 100, 40);

        jButton4.setText("Requests");
        jp2.add(jButton4);
        jButton4.setBounds(30, 100, 100, 40);

        jButton5.setText("Responses");
        jp2.add(jButton5);
        jButton5.setBounds(30, 270, 100, 40);

        jButton6.setText("Ranking");
        jp2.add(jButton6);
        jButton6.setBounds(30, 360, 100, 40);

        jButton7.setText("Update Info");
        jp2.add(jButton7);
        jButton7.setBounds(30, 450, 100, 40);

        jButton8.setText("Refresh");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jp2.add(jButton8);
        jButton8.setBounds(30, 180, 100, 40);

        getContentPane().add(jp2);
        jp2.setBounds(10, 130, 140, 560);

        jScrollPane2.setPreferredSize(new java.awt.Dimension(2002, 2002));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1038, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 671, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(170, 130, 570, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         mentor_login obj=new mentor_login();
         this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       getdata();
    }//GEN-LAST:event_jButton8ActionPerformed

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MentorHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jp1;
    private javax.swing.JPanel jp2;
    // End of variables declaration//GEN-END:variables
  
    public  void  getdata()
    {
         
            int x=10;
            int y=10;
            int i=0;
            
            mentorhomepanel pd[]=new mentorhomepanel[10] ;
             while(i<9){
                pd[i] = new mentorhomepanel();
               
                pd[i].setBounds(x, y, 930, 230);
                y = y+250;
             jPanel1.add(pd[i]);
                repaint();
                pd[i].repaint();
                repaint();
                jPanel1.repaint();
                i++;
             }
    }


}
