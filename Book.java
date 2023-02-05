class Book extends Publication{

    private String genre;
    private String fictionOrNon;

    public Book(String title, String author, int yearPublished, String genre, String fictionOrNon){
        super(title, author, yearPublished);
        this.genre = genre;
        this.fictionOrNon = fictionOrNon;
    }

    public String getGenre(){
        return genre;
    }
    public void setGenre(String newGenre){
        genre = newGenre;
       }

    public String getType(){
        return fictionOrNon;
    }

    public void setType(String newFictionOrNon){
        fictionOrNon = newFictionOrNon;
       }

    public String toString(){
        return super.toString()+" Genre: "+genre+"\n"+" type: "+fictionOrNon+"\n";
    }
}
