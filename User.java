package dawarly;

//el hagat ely 3and eh user fe el profile bta3o
public class User 
{
    String Fname , 
            Lname , 
            UserName,
            Email , 
            Password ;

    public User() 
    {
        String Fname = "", 
                Lname = "", 
                UserName = "",
                Email = "", 
                Password = "";
    }

    public User(String Fname, String Lname,String UserName , String Email, String Password) 
    {
        this.Fname = Fname;
        this.Lname = Lname;
        this.UserName = UserName;
        this.Email = Email;
        this.Password = Password;
    }

    public String getUserName() 
    {return UserName;}

    public void setUserName(String UserName) 
    {this.UserName = UserName;}

    public String getFname() 
    {return Fname;}

    public void setFname(String Fname) 
    {this.Fname = Fname;}

    public String getLname() 
    {return Lname;}

    public void setLname(String Lname) 
    {this.Lname = Lname;}

    public String getEmail() 
    {return Email;}

    public void setEmail(String Email) 
    {this.Email = Email;}

    public String getPassword() 
    {return Password;}

    public void setPassword(String Password) 
    {this.Password = Password;}
    
    
}
