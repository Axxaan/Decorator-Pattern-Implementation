public class Tomato extends BurgerDecorator{
    public Tomato(Burger burger) {
        super(burger);
    }

    public void make(){
        super.make();
        addTomato();
    }


    public void addTomato() {

        System.out.println("Tomato added");

    }
}
