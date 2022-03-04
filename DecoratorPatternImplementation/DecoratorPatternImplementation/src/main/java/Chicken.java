public class Chicken extends BurgerDecorator {
    public Chicken(Burger burger) {
        super(burger);
    }

    public void make(){
        super.make();
        addChicken();
    }


    public void addChicken() {

        System.out.println("Chicken Patty added");

    }
}
