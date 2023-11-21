public class Product {

    private static String name = "";
    private static int cost = 0;
    public Product(String name, int cost ){
    setName(this.name);
    setCost(this.cost);
    }

    public void setName(String name){
        name = this.name;
    }
    public String getName(){
        return this.name;
    }
    public void setCost(int cost){
        cost = this.cost;
    }
    public int getCost(){
        return cost;
    }



}
