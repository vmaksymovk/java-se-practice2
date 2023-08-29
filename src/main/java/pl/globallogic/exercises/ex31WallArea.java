package pl.globallogic.exercises;

public class ex31WallArea {
        private double width;
        private double height;
        public ex31WallArea(double width, double height) {
            setWidth(width);
            setHeight(height);
        }

        public double getWidth() {
            return width;
        }

        public double getHeight() {
            return height;
        }

        public void setWidth(double width) {
            if (width < 0) {
                this.width = 0;
            } else {
                this.width = width;
            }
        }

        public void setHeight(double height) {
            if (height < 0) {
                this.height = 0;
            } else {
                this.height = height;
            }
        }

        public double getArea() {
            return width * height;
        }

        public static void main(String[] args) {
            ex31WallArea wall = new ex31WallArea(5, 4);
            System.out.println("area= " + wall.getArea());

            wall.setHeight(-1.5);
            System.out.println("width= " + wall.getWidth());
            System.out.println("height= " + wall.getHeight());
            System.out.println("area= " + wall.getArea());
        }

}
