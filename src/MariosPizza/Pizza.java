package MariosPizza;

    public Pizza {
        public String name;
        public int size;
        public double price;
    }

    //Constructor

    public Pizza(String name, int size, double price){
        this.name = name;
        this.size = size;
        this.price = price;
    }

    // Getters
    public String getName(){
        return name;
    }

    public int getSize(){
        return size;
    }

    public double getPrice() {
        return price;
    }

    //toString metode
    @Override
    public String toString(){
        return "Pizza: " + name + " (" + size + " cm) - " + price + " kr";
    }



