public class Audi extends Product {
     final String name = "Audi";
     final static int cost = 60;

     final static int discountOnItemCount = 3;
     final static int discountedCost = 150;
    public  String getName(){
        return name;
    }

    public static int getCost(){
        return cost;
    }

}
