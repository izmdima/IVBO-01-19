package testbook;


public class Book {
    
    private String author;
    private String name;
    private int year;
    
    Book(String author, String name,int year) 
    {
        this.author = author;
        this.name = name;
        this.year = year;
    }
    
    public void SetAuthor(String author)
    {
        this.author = author;
    }
    
    public String getAuthor() 
    {
        return author;
    }
    
    public void SetName(String name)
    {
        this.name = name;
    }
    
    public String getName() 
    {
        return name;
    }
    
    public void SetYear(int year)
    {
        this.year = year;
    }
    
    public int getYear() 
    {
        return year;
    }
}
