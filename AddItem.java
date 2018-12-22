package dawarly;

import javax.swing.JOptionPane;

public class AddItem //controller
{
    public AddItem() {}
    
    public static boolean PersonalItems_Controller ( String category ,
                                                    String Location ,
                                                    String Date ,
                                                    String Time ,
                                                    String Color ,
                                                    String BrandName
                                                    )
    {
        if (category !=null &&
            Color !=null&&
            Location !=null&&
            Date !=null&&
            Time !=null&&
            BrandName !=null )
            {
                JOptionPane.showMessageDialog(null, "Post Item SUCCESSFULLY");
                return true ;
            }
        else
        {
            JOptionPane.showMessageDialog(null, "Enter ALL information");
            return false;
        }
    }
    
    public static boolean Device_Controller ( String category ,
                                                    String Location ,
                                                    String Date ,
                                                    String Time ,
                                                    String Type ,
                                                    String BrandName
                                                    )
    {
        if (category !=null &&
            Type !=null&&
            Location !=null&&
            Date !=null&&
            Time !=null&&
            BrandName !=null )
            {
                JOptionPane.showMessageDialog(null, "Post Item SUCCESSFULLY");
                return true ;
            }
        else
        {
            JOptionPane.showMessageDialog(null, "Enter ALL information");
            return false;
        }
    }
    
    
    public static boolean Personal_Controller ( String category ,
                                                    String Location ,
                                                    String Date ,
                                                    String Time ,
                                                    String Type
                                                    )
    {
        if (category !=null &&
            Type !=null&&
            Location !=null&&
            Date !=null&&
            Time !=null)
            {
                JOptionPane.showMessageDialog(null, "Post Item SUCCESSFULLY");
                return true ;
            }
        else
        {
            JOptionPane.showMessageDialog(null, "Enter ALL information");
            return false;
        }
    }
}
