import java.util.ArrayList;
import java.util.Scanner;

//This class controls the database of publications
public class Library{
 static ArrayList<Publication> listOfPublications;

 //constructor to intialize the list
public Library(){
    listOfPublications = new ArrayList<Publication>();
}

public void addPublicationToList(Publication p){
    listOfPublications.add(p);
}

public void deletePublicationByTitle(String title){
//uses binary search to remove
int l = 0, r = listOfPublications.size() - 1;
while (l <= r) {
    int m = l + (r - l) / 2;

    int k = title.compareTo(listOfPublications.get(m).getTitle());
    if (listOfPublications.get(m).getTitle().equals(title))
      listOfPublications.remove(m);

    if (k>0)
        l = m + 1;
    else
        r = m - 1;
}
}

//
public void checkOut(String title){
int l = 0, r = listOfPublications.size() - 1;
while (l <= r) {
    int m = l + (r - l) / 2;

    int k = title.compareTo(listOfPublications.get(m).getTitle());
    if (listOfPublications.get(m).getTitle().equals(title))
       listOfPublications.get(m).setCheckedOut(true);

    if (k>0)
        l = m + 1;
    else
        r = m - 1;
}
}

//binary search for returning a publication
public void returnPublication(String title){
    int l = 0, r = listOfPublications.size() - 1;
    while (l <= r) {
        int m = l + (r - l) / 2;
    
        int k = title.compareTo(listOfPublications.get(m).getTitle());
        if (listOfPublications.get(m).getTitle().equals(title))
           listOfPublications.get(m).setCheckedOut(false);
    
        // If x greater, ignore left half
        if (k>0)
            l = m + 1;
        // If x is smaller, ignore right half
        else
            r = m - 1;
        
    }
    }

    //Sorts the list
public void sortList(){
listOfPublications.sort(
            (a, b) -> a.getTitle().compareTo(b.getTitle()));
}

//binary search
public boolean searchPublicationByTitle(String title){
    int l = 0, r = listOfPublications.size() - 1;
    while (l <= r) {
        int m = l + (r - l) / 2;

        int k = title.compareTo(listOfPublications.get(m).getTitle());
        if (listOfPublications.get(m).getTitle().equals(title))
            return true;

        if (k>0)
            l = m + 1;
        else
            r = m - 1;      
}

    return false;
}
   

    public static void main(String[]args){
        //this is first so the list doesnt get reinitialized each time the loop goes around
        Library library = new Library();
        Scanner s = new Scanner(System.in);
        do{
        library.sortList();
        System.out.println("Enter B to add a book, M for magazine, S to search a publication, D to delete a publication, R to return a publication, P to print the list and C to Checkout a publication");
        String user = s.next();
        switch (user) {
            case "B":  
                    System.out.println("Enter the title of the book");
                    s.nextLine();
                    String title = s.nextLine();
                    System.out.println("Enter the author");
                    String author = s.nextLine();
                    System.out.println("Enter the year published");
                    int yearPublished = s.nextInt();
                    System.out.println("Enter the genre");
                    s.nextLine();
                    String genre = s.nextLine();
                    System.out.println("Enter the type");
                    String type = s.nextLine();
                    Book book = new Book(title, author, yearPublished, genre, type);
                    System.out.println("Book: "+book);
                    library.addPublicationToList(book);
                    System.out.println(listOfPublications);
                     break;
            case "M":  System.out.println("Enter the title of the magazine");
                        s.nextLine();
                        title = s.nextLine();
                        System.out.println("Enter the author");
                        author = s.nextLine();
                        System.out.println("Enter the year published");
                        yearPublished = s.nextInt();
                        System.out.println("Enter the company that published it");
                        s.nextLine();
                        String company = s.nextLine();
                        System.out.println("Enter the type of magazine");
                        String typeOfMagazine = s.nextLine();
                        Magazine magazine = new Magazine(title, author, yearPublished, company, typeOfMagazine);
                        System.out.println("Magazine: "+magazine);
                        library.addPublicationToList(magazine);
            case "P": System.out.println(listOfPublications);
                     break;

            case "S":System.out.println("Enter the title of the publication to find");
                     s.nextLine();
                     String titleToFind = s.nextLine();
                     boolean p = library.searchPublicationByTitle(titleToFind);
                     System.out.println("Found = "+p);
                     break;
            case "D":System.out.println("Enter the title of the publication to delete");
                     s.nextLine();
                     String titleRemove = s.nextLine();
                     library.deletePublicationByTitle(titleRemove);
                     break;
            case "C":System.out.println("Enter the title that you want to checkout");
                     s.nextLine();
                     String titleCheckOut = s.nextLine();
                     library.checkOut(titleCheckOut);
                     break;
            case "R":System.out.println("Enter the title that you want to return");
                     s.nextLine();
                     String titleReturn = s.nextLine();
                     library.returnPublication(titleReturn);
        }
    }while(true);
}
}
