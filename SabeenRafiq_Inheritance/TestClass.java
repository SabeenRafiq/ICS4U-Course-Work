
public class TestClass
{
    public static void main(String[] args)
    {
        //create instace of student and person
        Person p1 = new Person("Rimal", "11/12/2003");
        Student s1 = new Student("Ellie", "7/18/2004", 11, 3.9f);
        
        /**
         * With the student we have acess to methods from the person class and the student class
         */
        
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Grade:" + s1.getGrade());
        
        //this dosent work cuz person dosnet have acess to student, only studetn to person
        //System.out.println("Grade:" + p1.getGrade());
        
        System.out.println("Person Name: "+p1.getName());
    }
}
