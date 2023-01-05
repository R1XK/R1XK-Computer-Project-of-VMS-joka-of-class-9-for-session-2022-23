import java.util.Scanner;

class question9{
    public static void main(String[] args) {
        
        /*
         * Pattern Printing program
         * 1
         * 12
         * 123
         * 12
         * 1
         * 
         * height to be taken input
         */

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter height for the pattern: ");
        int height = sc.nextInt();

        System.out.println("Pattern output: \n");

        int ser = 1, c =10;

        for (int i=2; i<= height; i++){         //loop #1 for upper triangle
            
            System.out.println(ser);
            ser = (ser*c) + i;

        }

        for (int j = 1; j<= height; j++){       //loop #2 for lower triangle

            System.out.println(ser);
            ser = ser / 10;     //removing 1 digit from the right

        }


            sc.close();
      }
}