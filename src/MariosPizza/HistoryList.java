package MariosPizza;

import java.util.ArrayList;

public class HistoryList {
        public ArrayList<Pizza> RemovedPizzas = new ArrayList<>();
        public void addRemovedPizza(Pizza pizza)
            //adds Pizza to arrayList
            RemovedPizzas.add(pizza);
        }
    //arrayList index
    public void RemovedPizzaList() {
        System.out.println("Pizzas:");
        for(int i=0; i < RemovedPizza.size(); i++) {
            System.out.println(i + 1 + ": " + RemovedPizzas.get(i).toString());
        }
    }

    //whip HistoryList
    public void WipePizzas(int index) {
            try {
                Pizza pizza = Pizzas.get(index);

                pizza.clear();
                System.out.println("Order history wiped");

            } catch (IndexOutOfBoundsException e) {
                System.out.printl("Error: Pizza in index" + index);
            }
    }
}
