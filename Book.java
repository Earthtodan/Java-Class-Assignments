public class Book {

    private String ISBN;
    private String title;
    private String author;
    private double cost;

    /*Constructor - initialize instance variables*/
    public Book (String isbnInput, String titleInput, String authorInput, double costInput) {
        this.ISBN = isbnInput;
        this.title = titleInput;
        this.author = authorInput;
        this.cost = costInput;
    }

    public Book (String commaSeparatedLine) {
        /*your Implementation*/
        /*look at split method in String*/
        /*initialize instance variable*/

        String[] bookDetails = commaSeparatedLine.split(",");
        this.ISBN = bookDetails[0];
        this.title = bookDetails[1];
        this.author = bookDetails[2];
        this.cost = Double.parseDouble(bookDetails[3]);
    }

    public void printBookDetails() {
        System.out.println("ISBN Number: "+ ISBN + " Title: "+ sanitizeInput(title) + " Author: "+ sanitizeInput(author) + " cost: "+ cost);
    }

    private static String sanitizeInput(String firstCharacterSeparated) { /*Remove any accidental spaces in front of sentences*/
        return firstCharacterSeparated.substring(0, 1).replaceAll(" ", "") + firstCharacterSeparated.substring(1);
    }
}
