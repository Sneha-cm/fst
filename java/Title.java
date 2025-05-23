package Activity5;
public class Title {
    public static void main(String[] args) {
       
        Mybook newNovel = new Mybook();

        String title = "Learning Java";

        newNovel.setTitle(title);

        System.out.println("The title is: " + newNovel.getTitle());
    }
}

