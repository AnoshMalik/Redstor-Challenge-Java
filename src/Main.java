
public class Main {
    public static void main(String[] args) {

       Product apple = new Product("Apple", 50);
        System.out.println("WELCOME TO THE REDSTOR SUPERMARKET");

        int appleCount = 5;
         for(int i =1; i<appleCount+1;i++){
             System.out.println("Apple - " + i + " @ £" + apple.getCost());
         }

        }
    }
