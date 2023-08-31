package pl.globallogic.exercises;

class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = Math.max(0, width);
        this.length = Math.max(0, length);
    }

    public double getArea() {
        return width * length;
    }
}

class Carpet {
    private double cost;

    public Carpet(double cost) {
        this.cost = Math.max(0, cost);
    }

    public double getCost() {
        return cost;
    }
}

class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }
}

