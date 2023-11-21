import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Product apple = new Product();
        System.out.println("WELCOME TO THE REDSTOR SUPERCAR MARKET");
        System.out.println("SELECT YOUR CARS");
        System.out.println("Type : A for Audi -  B for BMW - C for CHEVROLET - D for DODGE");

        Scanner scanner = new Scanner(System.in);
        String productName = scanner.next();
        System.out.println(productName.toUpperCase());



        if (productName.contains("audi")) {
            System.out.println("You have  " + productName.toUpperCase() + ". Enter quantity");

            int a = scanner.nextInt();
            System.out.println("You entered - " + a);

            float b = scanner.nextFloat();
            System.out.println("You entered - " + b);
        }else{
            System.out.println("Product not recognised");
        }
    }
    }
