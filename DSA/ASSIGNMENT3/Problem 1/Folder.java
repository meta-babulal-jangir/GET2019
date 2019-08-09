import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Folder {

	    String name;//name of the directory 
	    List<Folder> subFolders;//list of sub folders in directory
	    Folder parent;//parent of directory
	    Date dateAndTime;//time and date of creation of this folder
     
	    public Folder(String name) 
     {
		       this.name = name;
		       subFolders = new LinkedList<Folder>();
		       parent=null;
		       dateAndTime = Calendar.getInstance().getTime();  
	    }
    /**
	    * Converting dateAndTime into String format and then returning it
	    * Returns dateAndTime of creation of this folder in String format
	    */
	    public String getDateAndTime() 
     {
		       DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
		       String dateAndTime = dateFormat.format(this.dateAndTime);  
		       return dateAndTime;
	    }
	   /**
	    * Returns subFolders in this directory
	    */
	    public List<Folder> getSubFolders() 
     {
		       return subFolders;
	    }
	   /**
	    * Returns name of the directory
	    */
	    public String getName() 
     {
		       return name;
	    }
    /**
	    * Parameter name of the directory
     * Set the name of the directory
	    */
	    public void setName(String name) 
     {
		       this.name = name;
	    }
	   /**
	    * Returns parent of the directory
	    */
	    public Folder getParent() 
     {
		       return parent;
	    }
	   /**
	    * Parameter parent of the directory
	    */
	    public void setParent(Folder parent) 
     {
		       this.parent = parent;
	    }
	   /**
	    * Parameter folderName, name of the subFolder which is going to be create
	    * Returns "true" if folder has created successfully else "false" if same name folder exist from earlier then new folder with same name will not create
	    */
	    public boolean mkdir(String folderName) 
     {
		       Folder subFolder = findSubfolder(folderName);
		       if(subFolder!=null)
         {
			          return false;//if folder already exist with same name then new folder will not create
		       }
		       //creating new subFolder
		       subFolder = new Folder(folderName);
		       //setting this folder as a parent of newly created sub folder
		       subFolder.setParent(this);
		       //adding  subFolder in the sub Folders List of this Folder
		       this.subFolders.add(subFolder);
		       //return true as folder created in this folder
		       return true;
	    }
	   /**
	    * Parameter subFolderName, name of the subFolder in which controller going to enter
	    * Returns subFolder if exist else return "null"
	    */
	    public Folder cd(String subFolderName) 
     {
		       return findSubfolder(subFolderName);
	    }
	   /**
	    * Parameter currentFolder as this
	    * Returns parent folder of this folder
	    */
	    public Folder bk() 
     {
		       return this.getParent();
     }
	   /**
	    * Parameter currentFolder as this
	    * Returns subFolders  of this folder
	    */
	    public List<Folder> ls() 
     {
		       return this.getSubFolders();
	    }
	  /**
	   * Parameter subFolderName which we need to find recursively in subFolders
	   * Returns foundSubFolder if folder exist else
	   */
	   public Folder find(String subFolderName) 
    {
		      List<Folder>  subFolders = this.getSubFolders();
		      Folder foundFolder;
		      for(Folder subFolder : subFolders) 
        {
			     //if this subFolder name is equal then return true
			         if(subFolderName.equals(subFolder.getName())) 
            {
				            return subFolder;
			         }
		      }
		      for(Folder subFolder : subFolders) 
        {
			         foundFolder = subFolder.find(subFolderName);
			         if(foundFolder!=null)
            {
				            return foundFolder;
			         }
		      }
		      return null;
	   }
	  /**
	   * Parameter folderName, name of the subFolder which is going to be find
	   * Returns subFolder if exist else null if doesn't exist
	   */
	   private Folder findSubfolder(String folderName) 
    {
		      for(Folder subFolder : this.getSubFolders()) 
        {
			         if(folderName.equals(subFolder.getName()))
            {
				            return subFolder;//if folder  exist return it
			         }
		      }
		      return null;//if folder doesn't exist return null
	   }
}
