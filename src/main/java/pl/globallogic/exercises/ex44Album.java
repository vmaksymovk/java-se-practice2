package pl.globallogic.exercises;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ex44Album {
    private String name;
    private String artist;
    private ex47SongList songs;

    public ex44Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ex47SongList();
    }

    public boolean addSong(String title, double duration) {
        return songs.add(new ex44Song(title, duration));
    }

    public ex44Song findSong(String title) {
        return songs.findSong(title);
    }

    public boolean addToPlayList(int trackNumber, LinkedList<ex44Song> playlist) {
        ex44Song song = songs.findSong(trackNumber);
        if (song != null) {
            playlist.add(song);
            return true;
        }
        System.out.println("Track " + trackNumber + " does not exist in the album " + name);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<ex44Song> playlist) {
        ex44Song song = songs.findSong(title);
        if (song != null) {
            playlist.add(song);
            return true;
        }
        System.out.println("Song " + title + " is not in the album " + name);
        return false;
    }

    public static class ex47SongList {
        private ArrayList<ex44Song> songs;

        public ex47SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(ex44Song song) {
            if (findSong(song.getTitle()) == null) {
                songs.add(song);
                return true;
            }
            return false;
        }

        private ex44Song findSong(String title) {
            for (ex44Song song : songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }

        private ex44Song findSong(int trackNumber) {
            if (trackNumber >= 1 && trackNumber <= songs.size()) {
                return songs.get(trackNumber - 1);
            }
            return null;
        }
    }
}
