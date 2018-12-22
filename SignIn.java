package dawarly;

import static dawarly.DataBase.userDB;
import java.util.*;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class SignIn //log in 
{
    public static boolean LogIn_Valid(String email , String pass) 
    { 
        for (int i=0 ; i<userDB.size() ; i++)
        {
            if ( email.equals(userDB.get(i).Email))
            {
               if ( pass.equals(userDB.get(i).Password))
               {
                   return true;
               }
               else
               {
                    JOptionPane.showMessageDialog(null, " Password is incorrect !");
                    return false;
               }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Email or Password is incorrect !");
                return false;
            }
        }
        return true;
    } 
    
    
}
