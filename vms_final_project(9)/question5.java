import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {

        /*
         * Series:     (using while loop)
         * 1 - 1/2 + 2/3 - 3/4 + 4/5 ... n terms
         */
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter range: ");
        int range = sc.nextInt();

        double ser = 1, i =1, k = -1;
        do {
            ser = ser + (i/(i+1)) * k;
            k = k * -1;
            i += 1;
        } while (i < range);

        System.out.println("Series output: \n" + ser);

        sc.close();
    }
}

