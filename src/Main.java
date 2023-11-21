import java.util.Scanner;
public class Main {
    static int audiCounter = 0;
    static int bmwCounter = 0;
    static int chevroletCounter = 0;
    static int dodgeCounter = 0;
    static int total = Checkout.getTotal();

    public static void main(String[] args) {
        //Product apple = new Product();
//        Checkout checkout = new Checkout();
        appIntroduction();

        Scanner scanner = new Scanner(System.in);

        boolean incomingInput = true;

        while(incomingInput){
            int choice = scanner.nextInt();

            switch(choice){
                case 0:
                    System.out.println("Are you sure you wanna close app? 1 for YES - 0 for N)");
                    int userChoice = scanner.nextInt();
                    if(userChoice == 1){
                        System.out.println("CLOSING APPLICATION");
                        incomingInput = false;
                        System.exit(0);
                    }else{
                        System.out.println("RESUMING APPLICATION");
                        break;
                    }
                case 1 :
                    System.out.println("You have selected Audi");
                    System.out.print("Enter Quantity - ");
                    int audiQuantity = scanner.nextInt();
                    System.out.println("Order " + audiQuantity + " Audi cars? 1 for Yes, 0 for No");
                    int audiSurety = scanner.nextInt();
                    if(audiSurety == 1){
                        audiCounter = audiQuantity;
                        System.out.println(audiCounter + " AUDIs added to the order successfully!");
                        break;
                    }else{
                        System.out.println("RETURNING TO MAIN SCREEN");
                    }
                    break;


                case 2 :
                    System.out.println("You have selected BMW");
                    System.out.print("Enter Quantity - ");
                    int bmwQuantity = scanner.nextInt();
                    System.out.println("Order " + bmwQuantity + " BMW cars? 1 for Yes, 0 for No");
                    int bmwSurety = scanner.nextInt();
                    if(bmwSurety == 1){
                        bmwCounter = bmwQuantity;
                        System.out.println(bmwCounter + " BMWs added to the order successfully!");
                        break;
                    }else{
                        System.out.println("RETURNING TO MAIN SCREEN");
                    }
                    break;
                case 3 :
                    System.out.println("You have selected CHEVROLET");
                    System.out.print("Enter Quantity - ");
                    int chevroletQuantity = scanner.nextInt();
                    System.out.println("Order " + chevroletQuantity + " CHEVROLET cars? 1 for Yes, 0 for No");
                    int chevroletSurety = scanner.nextInt();
                    if(chevroletSurety == 1){
                        chevroletCounter = chevroletQuantity;
                        System.out.println(chevroletCounter + " CHEVROLETs added to the order successfully!");
                        break;
                    }else{
                        System.out.println("RETURNING TO MAIN SCREEN");
                    }
                    break;
                case 4 :
                    System.out.println("You have selected DODGE");
                    System.out.print("Enter Quantity - ");
                    int dodgeQuantity = scanner.nextInt();
                    System.out.println("Order " + dodgeQuantity + " DODGE cars? 1 for Yes, 0 for No");
                    int dodgeSurety = scanner.nextInt();
                    if(dodgeSurety == 1){
                        dodgeCounter = dodgeQuantity;
                        System.out.println(dodgeCounter + " DODGEs added to the order successfully!");
                        break;
                    }else{
                        System.out.println("RETURNING TO MAIN SCREEN");
                    }
                    break;
                case 5 :
                    total = Checkout.getTotal();
//                    appIntroduction();
                    System.out.println("YOUR CAR(S) WILL BE DELIVERED TO YOU SHORTLY. THANK YOU FOR YOUR ORDER! \nORDER TOTAL =£" + total+"k");
                    incomingInput =false;
                    System.exit(0);
//                    break;

                default:
                    System.out.println("Choose between 0 and 4");
                    break;


            }
            appIntroduction();

        }


    }
    public static void appIntroduction(){
        System.out.print("\033\143");
        System.out.println("WELCOME TO THE REDSTOR SUPERCAR MARKET");
        System.out.println("Cars ordered so far ... " + "| AUDI=" + audiCounter + " | BMW=" + bmwCounter + " | CHEVROLET=" + chevroletCounter + " | DODGE="+dodgeCounter + " |");
        System.out.println("TOTAL CHARGE - £"+total+"k");
        System.out.println("SELECT YOUR CARS");
        System.out.println("On your keyboard, choose between 0 and 5");
        System.out.println("Type : 1 for Audi [£60k] --  2 for BMW [£30k] -- 3 for CHEVROLET [£30k] -- 4 for DODGE [£25k] -- 5 for CHECKOUT -- 0 TO CLOSE APP");

    }

    }
