package MariosPizza;

import java.time.*;

    public class Pizza {
        private PizzaMenu items;
        private double price;
        private LocalDateTime time;

        //Constructor

        public Pizza(PizzaMenu items, double price) {
            this.items = items;
            this.price = price;
            this.time = LocalDateTime.now();
        }

        // Setters & getters
        public PizzaMenu getItems() {
            return items;
        }

        public double getPrice() {
            return price;
        }

        public LocalDateTime getAddTime(){
            return time;
        }

        public void setItems(PizzaMenu items){
            this.items = items;
        }

        public void setPrice(double price){
            this.price = price;
        }

        public void setAddTime(LocalDateTime addTime){
            this.time = time;
        }

        //toString metode
        @Override
        public String toString() {
            return "Pizza: " + items + " (" + " cm) - " + price + " kr";
        }
    }


