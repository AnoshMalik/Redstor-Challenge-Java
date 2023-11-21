public class Checkout {

    Audi audi = new Audi();
    BMW bmw = new BMW();
    Chevrolet chevrolet = new Chevrolet();
    Dodge dodge = new Dodge();

    public static int getTotal(){
        return ((Main.audiCounter* Audi.getCost()) + (Main.bmwCounter* BMW.getCost()) + (Main.chevroletCounter*Chevrolet.getCost()) + (Main.dodgeCounter*Dodge.getCost()));

    }

}
