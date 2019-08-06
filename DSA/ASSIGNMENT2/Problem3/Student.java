import java.util.ArrayList;
public class Student{
    private ArrayList studentCourseList;
    private String studentName;
    public Student(String studentName,ArrayList studentCourseList)
    {
        this.studentName=studentName;
        this.studentCourseList=studentCourseList;
    }
    public String getStudentName()
    {
        return studentName;
    }
    public ArrayList getStudentCourseList()
    {
         return studentCourseList;
    }
}