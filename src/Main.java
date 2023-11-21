import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Product apple = new Product();
        System.out.println("WELCOME TO THE REDSTOR SUPERCAR MARKET");
        System.out.println("SELECT YOUR CARS");
        System.out.println("Type : 1 for Audi -  2 for BMW - 3 for CHEVROLET - 4 for DODGE OR 0 TO CLOSE APP");
        Scanner scanner = new Scanner(System.in);

        boolean incomingInput = true;
        while(incomingInput){
            int productNumber = scanner.nextInt();
            switch(productNumber){
                case 0:
                    System.out.println("Are you sure you wanna close app? 0 for YES - 1 for N)");
                    int userChoice = scanner.nextInt();
                    if(userChoice == 1){
                        System.out.println("CLOSING APPLICATION");
                        System.exit(0);
                    }else{
                        System.out.println("RESUMING APPLICATION");

                    }
                case 1 :
                    System.out.println("You have selected Audi");
                    System.out.printf("Enter Quantity - ");

                    break;


                case 2 : System.out.println("You have selected BMW"); break;
                case 3 : System.out.println("You have selected Chevrolet");break;
                case 4 : System.out.println("You have selected DODGE"); break;


            }
        }


    }
    }
