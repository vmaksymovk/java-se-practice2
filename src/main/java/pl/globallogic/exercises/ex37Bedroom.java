package pl.globallogic.exercises;

public class ex37Bedroom {
    private String name;
    private ex37Wall wall1;
    private ex37Wall wall2;
    private ex37Wall wall3;
    private ex37Wall wall4;
    private ex37Ceiling ceiling;
    private ex37Bed bed;
    private ex37Lamp lamp;

    public ex37Bedroom(String name, ex37Wall wall1, ex37Wall wall2, ex37Wall wall3, ex37Wall wall4, ex37Ceiling ceiling, ex37Bed bed, ex37Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public void makeBed() {
        System.out.print("Bedroom -> Making bed | ");
        bed.make();
    }

    public ex37Lamp getLamp() {
        return lamp;
    }
}
