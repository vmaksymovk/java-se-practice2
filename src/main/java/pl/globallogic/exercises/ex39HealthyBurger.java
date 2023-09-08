package pl.globallogic.exercises;


    public class ex39HealthyBurger extends ex39Hamburger {
        private String healthyExtra1Name;
        private double healthyExtra1Price;

        private String healthyExtra2Name;
        private double healthyExtra2Price;

        public ex39HealthyBurger(String meat, double price) {
            super("Healthy", meat, price, "Brown rye");
        }

        public void addHealthyAddition1(String name, double price) {
            this.healthyExtra1Name = name;
            this.healthyExtra1Price = price;
        }

        public void addHealthyAddition2(String name, double price) {
            this.healthyExtra2Name = name;
            this.healthyExtra2Price = price;
        }

        @Override
        public double itemizeHamburger() {
            double totalPrice = super.itemizeHamburger();

            if (this.healthyExtra1Name != null) {
                System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
                totalPrice += this.healthyExtra1Price;
            }
            if (this.healthyExtra2Name != null) {
                System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
                totalPrice += this.healthyExtra2Price;
            }

            return totalPrice;
        }


}
