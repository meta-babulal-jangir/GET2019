public class UseMarkSheet{
    public static void main(String args[])
    {
        MarkSheet markSheet=new MarkSheet();
        // noOfSudent reaads from user
        int noOfStudent=8;
        // read Grades of noOfStudent
        int[] grade=new int[]{10,60,80,10,45,69,90,13};
        System.out.println(markSheet.averageOfGrades(noOfStudent,grade));
        System.out.println(markSheet.maximumGrade(noOfStudent,grade));
        System.out.println(markSheet.minimumGrade(noOfStudent,grade));
        System.out.println(markSheet.percentageOfPassedStudent(noOfStudent,grade));      
           
    }
}
