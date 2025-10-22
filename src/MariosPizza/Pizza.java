package MariosPizza;

    public class Pizza {
        private String name;
        private double price;


        //Constructor

        public Pizza(double price, String name) {
            this.name = name;
            this.price = price;
        }

        // Getters
        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        //toString metode
        @Override
        public String toString() {
            return "Pizza: " + name + " (" + " cm) - " + price + " kr";
        }
    }


