package pl.globallogic.exercises;

public class ex34ComplexOperations {

        private double real;
        private double imaginary;

        public ex34ComplexOperations(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        public double getReal() {
            return real;
        }

        public double getImaginary() {
            return imaginary;
        }

        public void add(double real, double imaginary) {
            this.real += real;
            this.imaginary += imaginary;
        }

        public void add(ex34ComplexOperations complexNumber) {
            this.real += complexNumber.getReal();
            this.imaginary += complexNumber.getImaginary();
        }

        public void subtract(double real, double imaginary) {
            this.real -= real;
            this.imaginary -= imaginary;
        }

        public void subtract(ex34ComplexOperations complexNumber) {
            this.real -= complexNumber.getReal();
            this.imaginary -= complexNumber.getImaginary();
        }

        public static void main(String[] args) {
            ex34ComplexOperations one = new ex34ComplexOperations(1.0, 1.0);
            ex34ComplexOperations number = new ex34ComplexOperations(2.5, -1.5);

            one.add(1, 1);
            System.out.println("one.real= " + one.getReal());
            System.out.println("one.imaginary= " + one.getImaginary());

            one.subtract(number);
            System.out.println("one.real= " + one.getReal());
            System.out.println("one.imaginary= " + one.getImaginary());

            number.subtract(one);
            System.out.println("number.real= " + number.getReal());
            System.out.println("number.imaginary= " + number.getImaginary());
        }

}
