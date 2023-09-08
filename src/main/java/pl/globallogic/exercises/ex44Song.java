package pl.globallogic.exercises;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
public class ex44Song {
        private String title;
        private double duration;

        public ex44Song(String title, double duration) {
            this.title = title;
            this.duration = duration;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return title + ": " + duration;
        }
}
