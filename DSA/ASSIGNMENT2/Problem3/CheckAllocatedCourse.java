public class CheckAllocatedCourse{
    public static void main(String args[])
    {
        AllocatedCourse obj=new AllocatedCourse();
        System.out.println(obj.courseDataToMap("College_Courses.xls"));
        //System.out.println(obj.getStudentList("Student_Details.xls"));
        obj.studentDataToList("Student_Details.xls");
        obj.getStudentFinalList("Student_Final_List.xls",2);
    }
}