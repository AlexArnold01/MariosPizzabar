package MariosPizza;

import java.time.*;

    public class Pizza {
        private PizzaMenu items;
        private double price;
        private LocalTime time;

        //Constructor

        public Pizza(PizzaMenu items, double price) {
            this.items = items;
            this.price = price;
            this.time = LocalTime.now().withNano(0).withSecond(0);
        }

        // Setters & getters
        public PizzaMenu getItems() {
            return items;
        }

        public double getPrice() {
            return price;
        }

        public LocalTime getAddTime(){
            return time;
        }

        public void setItems(PizzaMenu items){
            this.items = items;
        }

        public void setPrice(double price){
            this.price = price;
        }

        public void setAddTime(LocalTime addTime){
            this.time = time;
        }

        //toString metode
        @Override
        public String toString() {
            return "["+time+"]" + "Pizza: " + items + "-" + price + "kr";
        }
    }


