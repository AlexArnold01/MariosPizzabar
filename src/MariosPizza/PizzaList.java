package MariosPizza;

import java.util.ArrayList;

public class PizzaList {
    public ArrayList<Pizza> Pizzas = new ArrayList<>();

    //adds Pizzas to the index
    public void addPizza(Pizza pizza){
        Pizzas.add(pizza);
    }

    //array list size
    public void PizzaList() {
        System.out.println("Pizzas:");
        for(int i=0; i < Pizzas.size(); i++) {
            System.out.println(i + 1 + ": " + Pizzas.get(i).toString());
        }
    }
    //removes Pizza from list
    public void RemovedPizzas(int index) {
            try {
                Pizza pizza = Pizzas.get(index);
                String name = pizza.GetName();


                Pizzas.remove(index);
                System.out.println("Pizza removed: " + name);

            } catch (IndexOutOfBoundsException e) {
                System.out.printl("Error: Pizza in index" + index);
            }
        }
    }
}