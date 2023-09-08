package pl.globallogic.exercises;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class ex44Main {
        public static void main(String[] args) {
            ArrayList<ex44Album> albums = new ArrayList<>();

            ex44Album album1 = new ex44Album("Stormbringer", "Deep Purple");
            album1.addSong("Stormbringer", 4.6);
            album1.addSong("Love don't mean a thing", 4.22);
            // Add more songs to album1

            ex44Album album2 = new ex44Album("For those about to rock", "AC/DC");
            album2.addSong("For those about to rock", 5.44);
            album2.addSong("I put the finger on you", 3.25);
            // Add more songs to album2

            albums.add(album1);
            albums.add(album2);

            LinkedList<ex44Song> playlist = new LinkedList<>();
            albums.get(0).addToPlayList(3, playlist);
            albums.get(0).addToPlayList("Love don't mean a thing", playlist);
            albums.get(1).addToPlayList(1, playlist);
            albums.get(1).addToPlayList(2, playlist);
            albums.get(1).addToPlayList("Song does not exist", playlist); // Test non-existent song

            play(playlist);
        }

        private static void play(LinkedList<ex44Song> playlist) {
            ListIterator<ex44Song> iterator = playlist.listIterator();

            if (playlist.isEmpty()) {
                System.out.println("No songs in the playlist.");
                return;
            }

            boolean forward = true;
            boolean quit = false;

            printMenu();

            while (!quit) {
                int choice = getInput();
                switch (choice) {
                    case 0:
                        printMenu();
                        break;
                    case 1:
                        if (!forward && iterator.hasNext()) {
                            iterator.next();
                        }
                        if (iterator.hasNext()) {
                            System.out.println("Now playing: " + iterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("Reached the end of the playlist.");
                            forward = false;
                        }
                        break;
                    case 2:
                        if (forward && iterator.hasPrevious()) {
                            iterator.previous();
                        }
                        if (iterator.hasPrevious()) {
                            System.out.println("Now playing: " + iterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("Reached the beginning of the playlist.");
                            forward = true;
                        }
                        break;
                    case 3:
                        if (forward) {
                            if (iterator.hasPrevious()) {
                                System.out.println("Now replaying: " + iterator.previous().toString());
                                forward = false;
                            } else {
                                System.out.println("Reached the beginning of the playlist.");
                            }
                        } else {
                            if (iterator.hasNext()) {
                                System.out.println("Now replaying: " + iterator.next().toString());
                                forward = true;
                            } else {
                                System.out.println("Reached the end of the playlist.");
                            }
                        }
                        break;
                    case 4:
                        printPlaylist(playlist);
                        break;
                    case 5:
                        quit = true;
                        break;
                }
            }
        }

        private static int getInput() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            return choice;
        }

        private static void printMenu() {
            System.out.println("Available actions:\npress");
            System.out.println("0 - Show menu options");
            System.out.println("1 - Play next song");
            System.out.println("2 - Play previous song");
            System.out.println("3 - Replay current song");
            System.out.println("4 - List songs in the playlist");
            System.out.println("5 - Quit");
        }

        private static void printPlaylist(LinkedList<ex44Song> playlist) {
            System.out.println("Playlist:");
            for (ex44Song song : playlist) {
                System.out.println(song.toString());
            }
        }

}
