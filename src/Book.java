import java.util.Date;

public class Book {
    private final String title;
    private final String publisher;
    private final Date publicationDate;
    private final String author;
    private final String description;

    public static class Builder{
        private String title;
        private String publisher;
        private Date publicationDate;
        private String author;
        private String description;

        public Builder(){ }

        public Builder title(String val) {
            title = val; return this;
        }
        public Builder publisher(String val){
            publisher = val; return this;
        }
        public Builder publicationDate(Date val){
            publicationDate = val; return this;
        }
        public Builder author(String val){
            author = val; return this;
        }
        public Builder description(String val){
            description = val; return this;
        }
        public Book build(){
            return new Book(this);
        }
    }

    private Book(Builder builder){
        title = builder.title;
        publisher = builder.title;
        publicationDate = builder.publicationDate;
        author = builder.author;
        description = builder.author;
    }
}
