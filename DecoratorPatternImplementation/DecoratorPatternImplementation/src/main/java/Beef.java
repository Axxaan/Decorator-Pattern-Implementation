public class Beef extends BurgerDecorator{
    public Beef(Burger burger) {
        super(burger);
    }

    public void make(){
        super.make();
        addBeef();
    }


    public void addBeef() {

        System.out.println("Beef Patty added");

    }
}
