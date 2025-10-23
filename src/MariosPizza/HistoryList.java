package MariosPizza;

import java.util.ArrayList;

public class HistoryList {
        public ArrayList<Pizza> RemovedPizzas = new ArrayList<>();
        public void addRemovedPizza(Pizza pizza) {
            //adds Pizza to arrayList
            RemovedPizzas.add(pizza);
        }
}
