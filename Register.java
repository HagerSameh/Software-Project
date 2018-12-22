package dawarly;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Register //controller
{
    public Register() 
    {
        
    }
    
    public static boolean isValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
    
    public static boolean Controller ( String Fname , 
                                    String Lname , 
                                    String UserName,
                                    String Email , 
                                    String Password ,
                                    String Verify)
    {
        if (Fname != null&& 
            Lname != null&& 
            UserName != null&&
            Email != null&&
            Password != null &&
            Verify.equals(Password) )
            {
                if (isValid (Email))
                {
                    JOptionPane.showMessageDialog(null, "Sign Up SUCCESSFULL");
                    return true;
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Enter your information in CORRECT way");
                    return false;
                }
            }
        else
        {
            JOptionPane.showMessageDialog(null, "Enter ALL information");
            return false;
        }
    }
    
}
