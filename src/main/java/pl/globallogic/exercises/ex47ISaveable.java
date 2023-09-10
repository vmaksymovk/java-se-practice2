package pl.globallogic.exercises;

import java.util.List;

interface ex47ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}
