
public class Media
{
    private String strName, strGenere, strReleaseDate;
    
    //construtor
    Media(String n, String g, String d)
    {
        this.strName = n;
        this.strGenere = g;
        this.strReleaseDate = d;
    }
    
    //default construtor
    Media()
    {
        this.strName = "Unknown";
        this.strGenere = "Unknown";
        this.strReleaseDate = "Unknown";
    }
    
    public String toString()
    {
        return "Name: " + this.strName + "Genere: "+this.strGenere+"Release Date: "+this.strReleaseDate;
    }
}

