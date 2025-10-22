package MariosPizza;

import java.util.ArrayList;

public class HistoryList {
        public ArrayList<Pizza> RemovedPizzas = new ArrayList<>();
        public void addRemovedPizza(Pizza pizza) {
            //adds Pizza to arrayList
            RemovedPizzas.add(pizza);
        }
    //arrayList index
    public void addRemovedPizzaList() {
        System.out.println("Pizzas:");
        for(int i=0; i < RemovedPizzas.size(); i++) {
            System.out.println(i + 1 + ": " + RemovedPizzas.get(i).toString());
        }
    }

    //whip HistoryList
    public void WipePizzas() {
            try {
                RemovedPizzas.clear();
                System.out.println("Order history wiped");

            } catch (IndexOutOfBoundsException e) {
                System.out.println("Error could not wipe Transaction history");
            }
    }
}
