import java.util.ArrayList;


public class MusicShow extends Show {
    private String librettoText;
    private MusicAuthor musicAuthor;

    public MusicShow(Director director, int duration, ArrayList<Actor> listOfActors, String title,
                     String librettoText, MusicAuthor musicAuthor) {
        super(director, duration, listOfActors, title);
        this.librettoText = librettoText;
        this.musicAuthor = musicAuthor;
    }

    void printLibrettoText(){
        System.out.println("Текст либретто: " + librettoText);
    }
}


