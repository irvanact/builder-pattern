import java.util.Date;

public class Main {
    public static void main(String[] args){
        Book book = new Book.Builder().author("John")
                .description("Description")
                .publicationDate(new Date())
                .publisher("Publisher")
                .title("Title Title")
                .build();
    }
}
