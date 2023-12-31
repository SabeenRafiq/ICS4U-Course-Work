public class Movies extends Media
{
    private String strWriter, strActor;
    //strName, strGenere, strReleaseDate
    
    //construtor 
    Movies(String n, String g, String r, String w, String a )
    {
        //call on the superclass construtor sending in info for instace variables 
        super(n, g, r);
        this.strWriter = w;
        this.strActor = a;
    }
    
    //default construtor 
    Movies()
    {
        this.strWriter = "Unknown";
        this.strActor = "Unknown";
    }
    
    public String toString()    
    {
        return "Writer" +  this.strWriter + "Actor: "+this.strActor;
    }
}