public class CheckAllocatedCourse{
    public static void main(String args[])
    {
        AllocatedCourse obj=new AllocatedCourse();
        System.out.println(obj.courseDataToMap("College_Courses.xls"));
        //System.out.println(obj.getStudentList("Student_Details.xls"));
        Student s=(Student)(obj.studentDataToList("Student_Details.xls").deleteItem());
        System.out.println(s.getStudentName());
        //System.out.println(obj.getStudentFinalList("Student_Final_List.xls"));
    }
}