package dawarly;

import static dawarly.DataBase.DeviceItemDB;
import static dawarly.DataBase.PapersItemDB;
import static dawarly.DataBase.PersonalItemDB;
import static dawarly.ItemModel.findex;
import static dawarly.ItemModel.item;
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
    
    public static boolean PersonalItems_SearchController (  String Location ,
                                                            String Date ,
                                                            String Time ,
                                                            String Color ,
                                                            String BrandName
                                                         )
    {
        if (//Location.equals(item.Location)&& Date.equals(item.Date)&& Time.equals(item.Time)&&Color.equals(item.Color)&& BrandName.equals(item.BrandName))
            (Location.equals(item.Location)&& Date.equals(item.Date)&& Time.equals(item.Time))||

            ( Date.equals(item.Date)&& Time.equals(item.Time)&& Color.equals(item.Color))||

            ( Time.equals(item.Time)&& Color.equals(item.Color)&& BrandName.equals(item.BrandName))||

            ( Location.equals(item.Location)&& Color.equals(item.Color)&& BrandName.equals(item.BrandName) )||

            ( Location.equals(item.Location)&& Date.equals(item.Date)&& BrandName.equals(item.BrandName))  )
        {
             JOptionPane.showMessageDialog(null, "THIS IS YOURS_CONGRATULATION_Connect with FOUNDER");
             PersonalItemDB.remove(findex);
                return true ;
        }
        else 
        {
            JOptionPane.showMessageDialog(null, " THIS IS NOT YOURS 'you must answer 3 question in a correct way'");
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
    
    public static boolean Device_SearchController ( String Location ,
                                                    String Date ,
                                                    String Time ,
                                                    String Type ,
                                                    String BrandName
                                                    )
    {
        if ((Location.equals(item.Location)&& Date.equals(item.Date)&& Time.equals(item.Time))||

            ( Date.equals(item.Date)&& Time.equals(item.Time)&& Type.equals(item.Type))||

            ( Time.equals(item.Time)&& Type.equals(item.Type)&& BrandName.equals(item.BrandName))||

            ( Location.equals(item.Location)&& Type.equals(item.Type)&& BrandName.equals(item.BrandName) )||

            ( Location.equals(item.Location)&& Date.equals(item.Date)&& BrandName.equals(item.BrandName))  )
        {
             JOptionPane.showMessageDialog(null, "THIS IS YOURS_CONGRATULATION_Connect with FOUNDER");
             DeviceItemDB.remove(findex);
                return true ;
        }
        else 
        {
            JOptionPane.showMessageDialog(null, " THIS IS NOT YOURS 'you must answer 3 question in a correct way'");
            return false;
        }
    }
    
    public static boolean Personal_Controller ( String category , //title
                                                    String Location ,
                                                    String Date ,
                                                    String Time ,
                                                    String person_name
                                                    )
    {
        if (category !=null &&
            person_name !=null&&
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
    
    public static boolean Personal_SearchController (String Location ,
                                                    String Date ,
                                                    String Time ,
                                                    String person_name
                                                    )
    {
        if ((Location.equals(item.Location)&& Date.equals(item.Date)&& Time.equals(item.Time))||

            ( Date.equals(item.Date)&& Time.equals(item.Time)&& person_name.equals(item.PersonName))||

            ( Time.equals(item.Time)&& person_name.equals(item.PersonName)&& Location.equals(item.Location))||

            ( Location.equals(item.Location)&& Date.equals(item.Date)&& person_name.equals(item.PersonName))  )
        {
             JOptionPane.showMessageDialog(null, "THIS IS YOURS_CONGRATULATION_Connect with FOUNDER");
             PapersItemDB.remove(findex);
                return true ;
        }
        else 
        {
            JOptionPane.showMessageDialog(null, " THIS IS NOT YOURS 'you must answer 3 question in a correct way'");
            return false;
        }
    }
}
