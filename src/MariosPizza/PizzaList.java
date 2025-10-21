package MariosPizza;

import java.util.ArrayList;

public class PizzaList {
    public ArrayList<Pizzas> Pizzas = new ArrayList<>();
    //TODO add pizza
        Pizzas.add(pizza);
    }
    public void PizzaList() {
        //TODO pizza print out
        //TODO i = size of pizzaList scales with pizza added.
        System.out.println("Pizzas:");
        for(int i=0; i < Pizzas.size(); i++) {
            System.out.println(i + 1 + ": " + Pizzas.get(i).toString());
        }
    }

    public void RemovedPizzas(int index) {
        //TODO boolean for validering
        //TODO while loop med try catch, Pizza.remove
        boolean valid = false;
        while(!valid) {
            try {
                Pizza pizza = Pizzas.get(index);
                String name = pizza.GetName();

                valid = true;
                Pizzas.remove(index);
                System.out.println("Pizza removed: " + name);

            } catch (IndexOutOfBoundsException e) {
                System.out.printl("Error: Pizza in index" + index);
            }
        }
}