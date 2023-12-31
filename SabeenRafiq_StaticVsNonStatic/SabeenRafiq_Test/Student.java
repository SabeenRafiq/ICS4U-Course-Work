
    public class Student
    {
        private String strFName;
        private String strLName;
        private String strP1Class;
        private String strP2Class;
        private String strP3Class;
        private String strP4Class;
        private short shortStudentNum; 
        
        //create a constructor 
        Student(String f, String l, String p1, String p2, String p3, String p4, short sn)
        {
            this.strFName = f;
            this.strLName = l;
            this.strP1Class = p1;
            this.strP2Class = p2;
            this.strP3Class = p3;
            this.strP4Class = p4;
            this.shortStudentNum = sn;
        }
        
        Student()
        {
            this.strFName = "Unknown";
            this.strLName = "Unknown";
            this.strP1Class = "Unknown";
            this.strP2Class = "Unknown";
            this.strP3Class = "Unknown";
            this.strP4Class = "Unknown";
            this.shortStudentNum = 0;
        }
        
        public String toString()
        {
        return "First Name: " + this.strFName
        +"\nLast Name: "+this.strLName 
        + "\nPeriod 1 Class: "+this.strP1Class
        + "\nPeriod 2 Class: "+this.strP2Class
        + "\nPeriod 3 Class: "+this.strP3Class
        + "\nPeriod 4 Class: "+this.strP4Class
        + "\nStudent Number: "+this.shortStudentNum
        +"\n";
        }
    
    }

