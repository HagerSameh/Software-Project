package dawarly;

public class Item 
{
    String category ,
            Location ,
            Date ,
            Time ,
            Color ,
            BrandName ,
            Type ,
            PersonName;
    
    String username , email ;

    public String getPersonName() {
        return PersonName;
    }

    public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public Item(String category, String Color, String Location, String Date, String Time, String BrandName) {
        this.category = category;
        this.Color = Color;
        this.Location = Location;
        this.Date = Date;
        this.Time = Time;
        this.BrandName = BrandName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    
    public Item() 
    {
        this.category = "";
        this.Color = "";
        this.Location = "";
        this.Date = ""; 
        this.Time ="";
        this.BrandName = "";
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

}