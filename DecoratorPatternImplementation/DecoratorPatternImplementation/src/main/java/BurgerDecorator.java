public class BurgerDecorator implements Burger{
    private Burger burger;

    public BurgerDecorator(Burger burger){
        this.burger = burger;
    }

    public void make(){
        this.burger.make();
    }


}
