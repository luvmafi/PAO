package Clase;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public final class ImmutableAlbum {
    private final String name;
    private final List<Song> songs;

    public ImmutableAlbum(String name, List<Song> songs) {
        this.name = name;
        this.songs = Collections.unmodifiableList(new ArrayList<>(songs));
    }

    public String getName() {
        return name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    @Override
    public String toString() {
        return "ImmutableAlbum{name='" + name + "', songs=" + songs + "}";
    }
}