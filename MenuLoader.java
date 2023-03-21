import  java.util.Scanner;
public class MenuLoader {
    void MenuLoaderLoop() {

        System.out.println("Welcome to Dyna Electronic Calculation Algorithm module (ECA).");
        System.out.println("legal Info");
        System.out.println("legal Info");

        while (true) {
            System.out.println("Booting MenuLoader Wizard now......");
            System.out.println("Calculation Modules; Math Geometric Calculations Module: 1 - Area of Rectangle\n" +
                    " 2 - Area of Triangle\n 3 - perimeter of Rectangle\n 4 - Perimeter of Triangle\n\n Math Basic" +
                    " Calculations Module: 5 - Addition\n 6 - Subtraction\n 7 - division\n 8 - Multiplication\n");

            Scanner UserInput = new Scanner(System.in);
            System.out.println("Make a selection now\n");
            String Response = UserInput.nextLine();

            if (Response.toLowerCase().contains("area of triangle") || Response.contains("1")) {
                //Wizard;
            }

            else if(Response.toLowerCase().contains("area of rectangle") || Response.contains("2")) {
                //Wizard;
            }

            else if(Response.toLowerCase().contains("perimeter of triangle") || Response.contains("3")) {
                //Wizard;
            }

            else if(Response.toLowerCase().contains("perimeter of rectangle") || Response.contains("4")) {
                //Wizard;
            }

            else if(Response.toLowerCase().contains("addition") || Response.contains("5")) {
                //Wizard;
            }

            else if(Response.toLowerCase().contains("subtraction") || Response.contains("6")) {
                //Wizard;
            }

            else if(Response.toLowerCase().contains("division") || Response.contains("7")) {
                //Wizard;
            }

            else if(Response.toLowerCase().contains("multiplication") || Response.contains("8")) {
                //Wizard;
            }

            if (Response.toLowerCase().contains("area of triangle") || Response.contains("9")) {
                //Wizard;
            }

            else {
                System.out.println("That is an invalid command");
            }
        }
    }



}
