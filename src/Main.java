public class Main {
    public static void main (String[] args){
        new PlayCards(2,1,false);
        /*TEST OF GIT*/
//nknkk commidfisdnfsg
        //sdg,spg,s
        //eg eorg e
        //new StretchTask1("Hejsan Svejsan");
        //new StretchTask2(600, 2);
        //String[] persons = {"Kalle", "Ito", "Joshua", "Jasmine", "Kajsa", "Lucas", "Fia", "Ahmed"};
        //new StretchTask3(persons, 6);
        //new Task5Collection("Hur månda unika chars i texten");
        /*Book[] books = new Book[2];

        books[0] = new Book("Boken som inte ville bli läst", "David Sundin", 320);
        books[1] = new Book("Snabba cash", "Jens Lampidus", 220);

       for(Book book :books){
           printBook(book);
       }

        Movie movie = new Movie("Star wars", Gengre.ACTION, 189);
        Movie movie1 = new Movie("Titanic", Gengre.DRAMA, 289);

*/
    }
    public static void printBook(Book book){
        System.out.println("Bokens titel är: " + book.title + ", skriven av: " + book.author + ". Pris: " + book.price +":-");
    }
    public static void printMovie(Movie movie){
        System.out.println("Filmens titel är: " + movie.title + " och är en: " + movie.gengre + ". Pris: " + movie.price +":-");
    }
}
