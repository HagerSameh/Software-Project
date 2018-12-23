package dawarly;

import static dawarly.DataBase.userDB;

public class UserModel 
{
    public static User user = new User();
    public UserModel() { }
    
    public static User Communication (int index)
    {
        user.UserName = userDB.get(index).UserName;
        user.Email = userDB.get(index).Email;
        return user;
    }
    
}
