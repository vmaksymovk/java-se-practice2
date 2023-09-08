package pl.globallogic.exercises;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
    public class ex44Album {
        private String name;
        private String artist;
        private ArrayList<ex44Song> songs;

        public ex44Album(String name, String artist) {
            this.name = name;
            this.artist = artist;
            this.songs = new ArrayList<>();
        }

        public boolean addSong(String title, double duration) {
            if (findSong(title) == null) {
                songs.add(new ex44Song(title, duration));
                return true;
            }
            return false;
        }

        public ex44Song findSong(String title) {
            for (ex44Song song : songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }

        public boolean addToPlayList(int trackNumber, LinkedList<ex44Song> playlist) {
            if (trackNumber >= 1 && trackNumber <= songs.size()) {
                playlist.add(songs.get(trackNumber - 1));
                return true;
            }
            System.out.println("Track " + trackNumber + " does not exist in the album " + name);
            return false;
        }

        public boolean addToPlayList(String title, LinkedList<ex44Song> playlist) {
            ex44Song song = findSong(title);
            if (song != null) {
                playlist.add(song);
                return true;
            }
            System.out.println("Song " + title + " is not in the album " + name);
            return false;
        }
    }
