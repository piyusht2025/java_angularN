import java.util.InputMismatchException;
import java.util.Scanner;

public class UnitConverter {
    private static double getValidInput(Scanner sc, String errorMessage) {
        // try catch
        boolean error = false;
        String t;

        double value=0;
        do {
            System.out.print(errorMessage);
            try {
                t = sc.next();
                value = Double.parseDouble(t);
                error = false;
            }catch(Exception e) {
                System.out.println("Enter valid Number ");
                error = true;
            }
        }while (error);
        // on error: print errorMessage
        return value;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int option = 0;
            double value=0;
            String t = "";
            do{
                System.out.println("Choose Conversion units");
                System.out.println("1 for Converting Kilometers <-> Miles ");
                System.out.println("2 for Converting Kilograms <-> Pounds ");
                System.out.println("3 for Converting Celsius <-> Fahrenheit ");
                System.out.println("Press any other key to exit : ");
                option=sc.nextInt();
                if (option==1){
                    boolean error = false;
//                    do {
//                        System.out.print("Enter Kilometer: ");
//                        try {
//                            t = sc.next();
//                            n = Double.parseDouble(t);
//                            error = false;
//                        }catch(Exception e) {
//                            System.out.println(e);
//                            error = true;
//                        }
//                    }while (error);
                    value=getValidInput(sc,"Enter KiloMeter : ");
                    System.out.println(value+" Kilometers in Miles = "+(0.621371*value));
                }
                else if (option==2){
//                    System.out.println("Enter Kilograms");
//                    try {
//                        n=sc.nextDouble();
//                        System.out.println(n+" Kilograms in Pounds = "+(2.20462*n));
//                    }catch (Exception e){
//                        System.out.println("Please Enter Number");
//                    }
                    value=getValidInput(sc,"Enter Kilograms : ");
                    System.out.println(value+" Kilograms in Pounds = "+(2.20462*value));

                }
                else if (option==3){
                    value=getValidInput(sc,"Enter Celsius : ");
                    System.out.println(value+" Celsius in Fahrenheit = "+(value*(9/5))+32);
                }
                else {
                    System.out.println("Enter valid input");
                }
            }while(option==1||option==2||option==3);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }


}
