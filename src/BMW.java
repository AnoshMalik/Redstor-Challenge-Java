public class BMW extends Product {

     final String name = "BMW";
     final static int cost = 30;
    final static int discountOnItemCount = 2;
    final static int discountedCost = 45;
    public  String getName(){
        return name;
    }

    public static int getCost(){
        return cost;
    }
}
