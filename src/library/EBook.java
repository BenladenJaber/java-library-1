
package library;

    /****************************************************/
    /************** write your code here ****************/
    /****************************************************/
    //make the class EBook a subclass for the Book class.
public class EBook {
    private int sizeInBytes;
    private String fileType;

    public EBook() {
    }   
    
    public void setSizeInBytes(int sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    /****************************************************/
    /************** write your code here ****************/
    /****************************************************/
    //add the parametrized constructor 
    //to assign data to the data members of EBook
    //and assign data to the parent class data members.
    
    
    public void setFileType(String fileType) {    
        this.fileType = fileType;
    }

    public int getSizeInBytes() {
        return sizeInBytes;
    }

    public String getFileType() {
        return fileType;
    }
    
    /****************************************************/
    /************** write your code here ****************/
    /****************************************************/
    //the function toString of the base class should be overridden 
    //to print the additional information about the sizeInBytes and fileType.
    
    
    
    
    
    
}
