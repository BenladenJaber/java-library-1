
package library;


public class Book {
    private String title;
    private int issueYear;
    private int pages;
    /****************************************************/
    /************** write your code here ****************/
    /****************************************************/
    //create the author array

    public Book() {
    }

    public Book(String title, int issueYear, int pages) {
        this.title = title;
        this.issueYear = issueYear;
        this.pages = pages;
    }
    /****************************************************/
    /************** write your code here ****************/
    /****************************************************/
    //implement a constructor of form
    //public Book(String title, int issueYear, int pages, String a[])    
    
    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setIssueYear(int issueYear) {
        this.issueYear = issueYear;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    
    /****************************************************/
    /************** write your code here ****************/
    /****************************************************/
    //add the setter of form setAuthors(String[] a)
    
    
    
    //add the setter of form setAuthor(String a, int index)
    
    
    // add a getter of form String[] getAuthors()
    
    
    
    //add a getter of form String getAuthor(int index)

    public String getTitle() {
        return title;
    }

    public int getIssueYear() {
        return issueYear;
    }

    public int getPages() {
        return pages;
    }
    
    @Override
    public String toString() {
        String details = "The title is "+ title + "\nthe issue year is "+issueYear+"\nthe number of pages is "+pages;
        details += "\nThe authors of the book are\n";
    /****************************************************/
    /************** write your code here ****************/
    /****************************************************/
        //add the authors to the details string
        
        return details;
    }
    
}
