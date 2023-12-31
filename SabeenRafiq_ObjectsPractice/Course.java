
/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course
{
    //declare varibles 
    short shtRoomNum;
    short shtCourseCode;
    short studentsArray;
    
    //create constructor
    Course(short r, short c, short a)
    {
        this.shtRoomNum = r;
        this.shtCourseCode = c;
        this.studentsArray = a; 
    }
    
    //create default constructor 
    Course()
    {
       this.shtRoomNum = 0;
       this.shtCourseCode = 0;
       this.studentsArray = 0; 
 
    }
    
    public String toString()
    {
        return "Room Number: " + this.shtRoomNum
        +"\nCourse Code " + this.shtCourseCode
        + "\nStudent's Array: " + this.studentsArray;
    }
}
