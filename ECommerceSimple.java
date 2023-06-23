public class ECommerceSimple {

    public static void main(String[] args) {
        Book javaBook = new Book ("ISBN0001","How to program in Java", "John Doe", 24.5);
        javaBook.printBookDetails();

        Book cPlusPlusBook = new Book ("ISBN0002","How to program in C++", "Sally Smith", 19.9);
        cPlusPlusBook.printBookDetails();

        Book bookInitializedFromLine = new Book ("ISBN0003, How to program in Javascript, Adam Singh,21.2");
        bookInitializedFromLine.printBookDetails();
    }
}
