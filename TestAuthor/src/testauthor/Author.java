package testauthor;


public class Author {
    private String name;
    private String email;
    private char gender;

    Author(String name,String email,char gender) 
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    
    public String getName() 
    {
        return name;
    }
    
    public String getEmail() 
    {
        return email;
    }
    
    public char getGender() 
    {
        return gender;
    }
    
    public void setEmail(String email) 
    {
        this.email = email;
    }
    
    public String toString() 
    {
        String g;
        switch (gender) 
        {
            case 'M':
                g = "m";
                break;
            case 'F':
                g = "ms";
                break;
            default:
                g = "unknown";
                break;
        }
        
        return "автор - " + name + "(" + g + ")" +" at " + email; 
    }
}
