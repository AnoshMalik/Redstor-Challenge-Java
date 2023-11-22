public class Checkout {

    Audi audi = new Audi();
    BMW bmw = new BMW();
    Chevrolet chevrolet = new Chevrolet();
    Dodge dodge = new Dodge();

    public static int getTotal(){
//        return ((Main.audiCounter* Audi.getCost()) + (Main.bmwCounter* BMW.getCost()) + (Main.chevroletCounter*Chevrolet.getCost()) + (Main.dodgeCounter*Dodge.getCost()));
        int audiCost = 0;
        int bmwCost = 0;
//        int chevroletCost = 0;
//        int dodgeCost = 0;

//        AUDI CALCULATOR
        if(Main.audiCounter==Audi.discountOnItemCount){
            audiCost = Audi.discountedCost;
            System.out.print("IF BLOCK");

        }else if(Main.audiCounter > Audi.discountOnItemCount){
            int costWhole = (int) Math.floor(Main.audiCounter / Audi.discountOnItemCount)*Audi.discountedCost;
            int costRemainder = (Main.audiCounter % Audi.discountOnItemCount)*Audi.cost;
            audiCost = costWhole + costRemainder;
            System.out.print("ELSE IF BLOCK");

        }else{
            audiCost = Audi.cost * Main.audiCounter;
            System.out.print("ELSE BLOCK");
        }

//        BMW CALCULATOR
        if(Main.bmwCounter==BMW.discountOnItemCount){
            bmwCost = BMW.discountedCost;

        }else if(Main.bmwCounter > BMW.discountOnItemCount){
            int costWhole = (int) Math.floor(Main.bmwCounter / BMW.discountOnItemCount)*BMW.discountedCost;
            int costRemainder = (Main.bmwCounter % BMW.discountOnItemCount)*BMW.cost;
            bmwCost = costWhole + costRemainder;
        }else{
            bmwCost = BMW.cost*Main.bmwCounter;
        }

//        CHEVROLET CALCULATOR
//        if(Main.chevroletCounter==Chevrolet.discountOnItemCount){
//            chevroletCost = Main.chevroletCounter*Chevrolet.discountedCost;
//
//        }else if(Main.chevroletCounter > Chevrolet.discountOnItemCount){
//            int costWhole = (int) Math.floor(Main.chevroletCounter / Chevrolet.discountOnItemCount)*Chevrolet.discountedCost;
//            int costRemainder = (Main.chevroletCounter / Audi.discountOnItemCount)*Chevrolet.cost;
//            chevroletCost = costWhole + costRemainder;
//        }else{
//            chevroletCost = Main.chevroletCounter*chevroletCost.getCost();
//        }
//        DODGE CALCULATOR
//        if(Main.dodgeCounter==Dodge.discountOnItemCount){
//            dodgeCost = Main.dodgeCounter*Dodge.discountedCost;
//
//        }else if(Main.dodgeCounter > Dodge.discountOnItemCount){
//            int costWhole = (int) Math.floor(Main.dodgeCounter / Dodge.discountOnItemCount)*Dodge.discountedCost;
//            int costRemainder = (Main.dodgeCounter / Dodge.discountOnItemCount)*Dodge.cost;
//            dodgeCost = costWhole + costRemainder;
//        }else{
//            dodgeCost = Main.dodgeCounter*Dodge.getCost();
//        }


                return (audiCost + bmwCost + (Main.chevroletCounter*Chevrolet.getCost()) + (Main.dodgeCounter*Dodge.getCost()));

    }

}
