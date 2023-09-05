package pl.globallogic.exercises;

public class ex37Main {
    public static void main(String[] args) {
        ex37Wall wall1 = new ex37Wall("West");
        ex37Wall wall2 = new ex37Wall("East");
        ex37Wall wall3 = new ex37Wall("South");
        ex37Wall wall4 = new ex37Wall("North");

        ex37Ceiling ceiling = new ex37Ceiling(12, 55);

        ex37Bed bed = new ex37Bed("Modern", 4, 3, 2, 1);

        ex37Lamp lamp = new ex37Lamp("Classic", false, 75);

        ex37Bedroom bedRoom = new ex37Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();
    }
}
