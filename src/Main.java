public class Main {
    public static void main (String[] args){
        new PlayCards(2,1,false);
        new PlayCards(2,1,false);
    }
    public static void printBook(Book book){
        System.out.println("Bokens titel är: " + book.title + ", skriven av: " + book.author + ". Pris: " + book.price +":-");
    }
    public static void printMovie(Movie movie){
        System.out.println("Filmens titel är: " + movie.title + " och är en: " + movie.gengre + ". Pris: " + movie.price +":-");
    }
}
