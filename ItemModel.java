package dawarly;

import static dawarly.DataBase.DeviceItemDB;
import static dawarly.DataBase.PapersItemDB;
import static dawarly.DataBase.PersonalItemDB;
import static dawarly.SignIn.index;
import static dawarly.UserModel.Communication;

public class ItemModel 
{
    public static Item item = new Item();
    public static Item I = new Item();
    public static int findex;
    public ItemModel() { }
    
    public static void SearchPersonalBelongings (int indexx)
    {
//        int index = indexx-1;
//        item.category = PersonalItemDB.get(indexx).category;
        item.Location = PersonalItemDB.get(indexx).Location;
        item.Date = PersonalItemDB.get(indexx).Date;
        item.Time = PersonalItemDB.get(indexx).Time;
        item.Color = PersonalItemDB.get(indexx).Color;
        item.BrandName = PersonalItemDB.get(indexx).BrandName;
//       return item;
    }
    
    public static void SearchDevice (int indexx)
    {
        item.Location = DeviceItemDB.get(indexx).Location;
        item.Date = DeviceItemDB.get(indexx).Date;
        item.Time = DeviceItemDB.get(indexx).Time;
        item.Type = DeviceItemDB.get(indexx).Type;
        item.BrandName = DeviceItemDB.get(indexx).BrandName;
    }
    
    public static void SearchPersonal_Papers (int indexx)
    {
        item.Location = PapersItemDB.get(indexx).Location;
        item.Date = PapersItemDB.get(indexx).Date;
        item.Time = PapersItemDB.get(indexx).Time;
        item.PersonName = PapersItemDB.get(indexx).PersonName;
        item.category = PapersItemDB.get(indexx).category;
    }
    
    public static void setFounderInfo()
    {
        I.username = Communication(index).UserName ;
        I.email = Communication(index).Email ;
    }
}
