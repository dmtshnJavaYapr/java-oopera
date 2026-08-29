import java.util.ArrayList;


public class Opera extends MusicShow {
    private int choirSize;

    public Opera(Director director, int duration, ArrayList<Actor> listOfActors, String title,
                 String librettoText, MusicAuthor musicAuthor, int choirSize) {
        super(director, duration, listOfActors, title, librettoText, musicAuthor);
        this.choirSize = choirSize;
    }
}
