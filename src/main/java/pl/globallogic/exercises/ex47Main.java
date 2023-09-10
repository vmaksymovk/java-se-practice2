package pl.globallogic.exercises;

import java.util.List;
import java.util.ArrayList;

public class ex47Main {
    public static void main(String[] args) {
        ex47Player player = new ex47Player("Tim", 10, 15);
        ex47Monster monster = new ex47Monster("Werewolf", 20, 40);


        List<ex47ISaveable> saveables = new ArrayList<>();
        saveables.add(player);
        saveables.add(monster);


        for (ex47ISaveable saveable : saveables) {
            List<String> savedValues = saveable.write();

            System.out.println("Saved values: " + savedValues);
        }


        List<String> playerData = new ArrayList<>();
        playerData.add("Tim");
        playerData.add("20");
        playerData.add("25");
        playerData.add("Axe");


        ex47Player newPlayer = new ex47Player("", 0, 0);
        newPlayer.read(playerData);
        System.out.println("Loaded player: " + newPlayer);


    }
}
