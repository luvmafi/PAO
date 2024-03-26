import java.util.Arrays;
import Clase.Album;
import Clase.ImmutableAlbum;
import Clase.Song;

public class Application {
    public static void main(String[] args) {
        Song song1 = new Song("Song 1", 3.5);
        Song song2 = new Song("Song 2", 4.0);


        Album album = new Album("Album");
        album.addSong(song1);
        album.addSong(song2);
        System.out.println("Album mutabil: " + album);


        ImmutableAlbum immutableAlbum = new ImmutableAlbum("Immutable Album", Arrays.asList(song1, song2));
        System.out.println("Album imutabil: " + immutableAlbum);
    }
}