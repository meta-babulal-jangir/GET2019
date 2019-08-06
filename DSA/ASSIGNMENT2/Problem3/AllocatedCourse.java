import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.io.*;
import jxl.*;
public class AllocatedCourse{
    Map<String,Integer>  programListWithCapacity=null;
    UseQueue studentQueue=null;
    Workbook workbook=null;
    Sheet sheet=null;
    public Map<String,Integer> courseDataToMap(String courseFileName)
    {   
        try{
            programListWithCapacity=new HashMap<String,Integer>();
            workbook=Workbook.getWorkbook(new File(courseFileName));
            sheet=workbook.getSheet(0);
            Cell courseNameCell=null;
            Cell capacityCell=null;
            int numberOfRow=(sheet.getColumn(0)).length;
            for(int i=1;i<=numberOfRow;i++)
            {
                 courseNameCell=sheet.getCell(0,i);
                 capacityCell=sheet.getCell(1,i);
                 programListWithCapacity.put(courseNameCell.getContents(),Integer.parseInt(capacityCell.getContents()));
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }        
        workbook.close();
        return programListWithCapacity;
    }
    
    public ArrayList<Student> getStudentList(String studentFileName)
    {   
        ArrayList<Student> studentList=null;
        try{
            studentList=new ArrayList<Student>();
            workbook=Workbook.getWorkbook(new File(studentFileName));
            sheet=workbook.getSheet(0);
            ArrayList studentCourseList=null;
            Cell studentNameCell=null;
            Cell studentCourseCell=null;
            int numberOfRow=(sheet.getColumn(0)).length;
            int numberOfColumn=(sheet.getRow(1)).length;
            for(int i=1;i<=numberOfRow;i++)
            {    
                 studentCourseList=new ArrayList();
                 studentNameCell=sheet.getCell(0,i);
                 for(int j=1;j<numberOfColumn;j++)
                 {
                     studentCourseCell=sheet.getCell(j,i);
                     studentCourseList.add(studentCourseCell.getContents());
                 }
                     
                 studentList.add(new Student(studentNameCell.getContents(),studentCourseList));
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        workbook.close();
        return studentList;
    }
    public UseQueue studentDataToList(String studentFileName)
    {   
            ArrayList<Student> studentList=getStudentList(studentFileName);
            int noOfStudent=studentList.size();
            studentQueue=new UseQueue(noOfStudent);
            for(int i=0;i<noOfStudent;i++)
            {
                 studentQueue.addItem(studentList.get(i));
            }              
            
        return studentQueue;
    }
    public void getStudentFinalList(String finalList,int coulmn)
    {    
         WritableWorkbook workbook;
         WritableSheet sheet;
         Lable label=null;
         Student student=null;
         try{
            workbook=Workbook.createWorkbook(new File(courseFileName));
            sheet=workbook.createSheet("first Sheet",0);
            label=new Label(0,0,"Student Name");
            sheet.addCell(label);
            label=new Label(1,0,"Allocated Course");
            sheet.addCell(label);
            ArrayList studentCourse=null;
            int lengthOfStudentCourse=-1;
            Map.Entry entry=null;
            for(int i=1;i<=numberOfRow;i++)
            {    
                 student=(Student)studentQueue.deleteItem();
                 for(int j=0;j<coulmn;j++)
                 {
                     sheet.addCell(new Label(j,i,student.getStudentName()));
                     studentCourse=student.getStudentCourseList();
                     lengthOfStudentCourse=studentCourse.size();
                     if(j>0)
                     {                    
                         for(int k=0;k<lengthOfStudentCourse;k++)
                         {    
                              if(programListWithCapacity.containsKey(studentCourse.get(k))&& programListWithCapacity.getValue(studentCourse.get(k))>0)
                              {    
                                   entry=(Map.Entry)
                                   sheet.addCell(new Label(j,i,student.getStudentName()));
                                   
                              }    
                         }
                     }
                 }
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }        
        workbook.close();
    }
    
}