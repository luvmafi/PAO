package Clase;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String name;
    private List<Song> songs = new ArrayList<>();

    public Album(String name) {
        this.name = name;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public List<Song> getSongs() {
        return new ArrayList<>(songs);
    }

    @Override
    public String toString() {
        return "Album{name='" + name + "', songs=" + songs + "}";
    }
}
