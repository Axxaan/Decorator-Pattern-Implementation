public class Lettuce extends BurgerDecorator {
    public Lettuce(Burger burger) {
        super(burger);
    }

    public void make(){
        super.make();
        addLettuce();
    }


    public void addLettuce() {

        System.out.println("Lettuce added");

    }
}
