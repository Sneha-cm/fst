package Activity5;

abstract class Book {
    String title;

    // Abstract method to set the title
    abstract void setTitle(String s);

    // Concrete method to get the title
    String getTitle() {
        return title;
    }
}
