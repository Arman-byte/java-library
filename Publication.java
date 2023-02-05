class Publication{
    
    private String title;
    private String author;
    private int yearPublished;
    private boolean checkedOut;

    public Publication(String title, String author, int yearPublished){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.checkedOut = false;
    }

    public String getTitle(){
        return title;
       }
   
       public void setTitle(String newTitle){
           title = newTitle;
          }
   
       public String getAuthor(){
           return author;
       }
       public void setAuthor(String newAuthor){
           author = newAuthor;
          }
   
       public int getYearPublished(){
           return yearPublished;
       }
   
       public void setYearPublished(int newYear){
           yearPublished = newYear;
          }
          public boolean getCheckedOut(){
            return checkedOut;
           }
           public void setCheckedOut(boolean newCheckOut){
            checkedOut = newCheckOut;
           }


    public String toString(){
        return " Title:"+title+"\n"+" Author:"+author+"\n"+"Year:"+yearPublished+"\n"+" checkedOut="+checkedOut+"\n";
    }
}
