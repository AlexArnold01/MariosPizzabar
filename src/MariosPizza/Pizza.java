package MariosPizza;

import java.time.*;

    public class Pizza {
        private String name;
        private double price;
        private LocalDateTime addTime;

        //Constructor

        public Pizza(double price, String name) {
            this.name = name;
            this.price = price;
        }

        // Setters & getters
        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public LocalDateTime getAddTime(){
            return addTime;
        }

        public void setName(String name){
            this.name = name;
        }

        public void setPrice(double price){
            this.price = price;
        }

        public void setAddTime(LocalDateTime addTime){
            this.addTime = addTime;
        }

        //toString metode
        @Override
        public String toString() {
            return "Pizza: " + name + " (" + " cm) - " + price + " kr";
        }
    }


