import java.util.Scanner;

public class question7 {

    static void upRghtAngle(){      // code for upright right angle triangle
        
        for (int i=1; i<=5; i++){
            for (int j=1; j<=1; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    static void downRghtAngle(){        // code for downwards right angle triangle

        for (int i=5; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    static void rectAngle(){        // code for rectriangle

        for (int i=1; i<=5; i++){
            for (int j=1; j<=6; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {

        // menue with options printing
        System.out.println("Choose your option: \n <1> Print Right-angle Triangle \n <2> Print Up side Down Right-angle triangle \n <3> Print Rectriangle");

        Scanner sc = new Scanner(System.in);
        System.out.println("Your option: ");
        int opt = sc.nextInt();     // input option

        System.out.println("output: \n"); // spacing for output (design purpose)

        switch (opt){       // output according to option
            case 1: upRghtAngle(); break;
            case 2: downRghtAngle(); break;
            case 3: rectAngle(); break;
            default: System.out.println("Wrong option"); break;
        }

        sc.close();
    }
}
