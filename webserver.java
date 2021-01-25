
import com.vmm.JHTTPServer;
import static com.vmm.NanoHTTPD.HTTP_OK;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


public class webserver extends JHTTPServer {
    public webserver(int port) throws IOException {
        super(port);

    }
    
     public Response serve(String uri, String method, Properties header, Properties parms, Properties files) {
        Response res;
        res = new Response(HTTP_OK, "text/html", "<body style='background: #D46A6A; color: #fff'><center><h1>Hello</h1><br> <h3>Welcome To JHTTP Server (Version 1.0)</h3></body></center>");
        if (uri.contains("/mentorlogin")) {
            String u = parms.getProperty("email");
            String p = parms.getProperty("password");

            System.out.println(u + " " + p);

            try {
                ResultSet rs = DBLoader.executeQuery("select * from mentorlogin where username='" + u + "' and password ='" + p + "'");

                if (rs.next()) {
                    res = new Response(HTTP_OK, "text/plain", "success");
                    System.out.println("login");

                } else {
                    res = new Response(HTTP_OK, "text/plain", "failed");
                
                    System.out.println("failed");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
         else if (uri.contains("/MentorSignUp"))
       {
         String user = parms.getProperty("user");
            String email  = parms.getProperty("email");
            String name= parms.getProperty("name");
                String phone = parms.getProperty("phone");
                String pass = parms.getProperty("pass");
                String cpass = parms.getProperty("cpass");
                String sques = parms.getProperty("sques");
                String sans = parms.getProperty("sans");  
                
                 ResultSet rs = DBLoader.executeQuery("select * from mentorsignup where username='" + user+ "'" );
           
            try {
                if(rs.next())
                {
                    res = new Response(HTTP_OK, "text/plain","Username Already Exists!!!");
                }
                else
                {      
                    rs.moveToInsertRow();
                    rs.updateString("username", user);
                    rs.updateString("name", name);
                    rs.updateString("email", email);
                    rs.updateString("phone", phone);
                    rs.updateString("password", pass);
                    rs.updateString("securityques", sques);
                    rs.updateString("securityans",sans);
                    
                    rs.insertRow();
                    res = new Response(HTTP_OK, "text/plain", "SignUp Successfully");
                    
                }    } catch (SQLException ex) {
                Logger.getLogger(webserver.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
     
     
     
     
     return res;
     }
    
    
    
    
    
    
}
