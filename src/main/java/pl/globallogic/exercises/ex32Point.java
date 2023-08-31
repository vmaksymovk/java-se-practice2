package pl.globallogic.exercises;

public class ex32Point {
        private int x;
        private int y;

        public ex32Point() {
            // No-arg constructor
        }

        public ex32Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public double distance() {
            return Math.sqrt(x * x + y * y);
        }
//To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
//d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
        public double distance(int x, int y) {
            return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
        }

        public double distance(ex32Point another) {
            return distance(another.getX(), another.getY());
        }
        public static void main(String[] args) {
            ex32Point first = new ex32Point(6, 5);
            ex32Point second = new ex32Point(3, 1);
            System.out.println("distance(0,0)= " + first.distance());
            System.out.println("distance(second)= " + first.distance(second));
            System.out.println("distance(2,2)= " + first.distance(2, 2));
            ex32Point point = new ex32Point();
            System.out.println("distance()= " + point.distance());
        }
}
