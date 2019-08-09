import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.io.*;
import jxl.*;
import jxl.write.*;
public class AllocatedCourse{
    Map<String,Integer>  programListWithCapacity=null;
    UseQueue studentQueue=null;
    Workbook workbook=null;
    Sheet sheet=null;
	int noOfStudent=-1;
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
    public void studentDataToList(String studentFileName)
    {   
            ArrayList<Student> studentList=getStudentList(studentFileName);
            noOfStudent=studentList.size();
            studentQueue=new UseQueue(noOfStudent);
            for(int i=0;i<noOfStudent;i++)
            {   
                 studentQueue.addItem(studentList.get(i));
            }              
    }
    public void getStudentFinalList(String finalList,int coulmn)
    {    
         WritableWorkbook workbook=null;
         WritableSheet sheet=null;
         Label label=null;
         Student student=null;
         try{ 
            workbook=Workbook.createWorkbook(new File(finalList));
            sheet=workbook.createSheet("first Sheet",0);
            label=new Label(0,0,"Student Name");
            sheet.addCell(label);
            label=new Label(1,0,"Allocated Course");
            sheet.addCell(label);
            ArrayList studentCourse=null;
            int lengthOfStudentCourse=-1;
			boolean flgTofill=true; 
            for(int i=1;i<=noOfStudent;i++)
            {    
                 student=(Student)studentQueue.deleteItem();
                 for(int j=0;j<coulmn;j++)
                 {   
			         if(j==0)
                     {						 
                         sheet.addCell(new Label(j,i,student.getStudentName()));
                         studentCourse=student.getStudentCourseList();
                         lengthOfStudentCourse=studentCourse.size();
					 }
                     else					 
                     if(j>0)
                     {   System.out.println((String)studentCourse.get(0));
                              System.out.println((programListWithCapacity.get(studentCourse.get(0))));	                 
                         for(int k=0;k<lengthOfStudentCourse;k++)
                         {    
					          //System.out.println(programListWithCapacity.containsKey((String)studentCourse.get(k)));
                              //System.out.println((programListWithCapacity.get(studentCourse.get(k))));							  
                              if(programListWithCapacity.containsKey((String)studentCourse.get(k))&& (int)(programListWithCapacity.get(studentCourse.get(k)))>0)
                              {   
                                   sheet.addCell(new Label(j,i,(String)studentCourse.get(k)));
                                   programListWithCapacity.replace((String)studentCourse.get(k), (int)(programListWithCapacity.get(studentCourse.get(k)))-1);
								   flgTofill=false;
								   break;
                              }    
                         }
						 System.out.println(programListWithCapacity);
						 if(flgTofill)
							 sheet.addCell(new Label(j,i,"Not Allocated"));
                     }
					
                 }
            }
			workbook.write();
			workbook.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }
    
}