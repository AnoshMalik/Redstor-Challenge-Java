public class Checkout {

    Audi audi = new Audi();
    BMW bmw = new BMW();
    Chevrolet chevrolet = new Chevrolet();
    Dodge dodge = new Dodge();

    public int getTotal(){

        return ((Main.audiCounter*audi.getCost()) + (Main.bmwCounter*bmw.getCost()) + (Main.chevroletCounter*chevrolet.getCost()) + (Main.dodgeCounter*dodge.getCost()));
    }

}
