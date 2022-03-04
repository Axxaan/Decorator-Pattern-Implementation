public class Cheese extends BurgerDecorator{
    public Cheese(Burger burger) {
        super(burger);
    }

    public void make(){
        super.make();
        addCheese();
    }


    public void addCheese() {

        System.out.println("Cheese slice added");

    }
}
