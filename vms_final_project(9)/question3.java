import java.util.Scanner;

public class question3 {

    static int Factrl(int num){     //factorial 
        int fact=1;
        for (int i=1;i<=num;i++){
            fact = fact * i;
        }
        return (fact);
    }
    
    public static void main(String[] args) {

        // series: x/2! + x^2/3! + x^3/4! ... n terms          (using while loop)

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter ramge");
        int range = sc.nextInt();       //input range for series

        System.out.println("Enter value for (x): ");
        int x = sc.nextInt();

        int n = 1; double c=0;
        while (n != range){             //calcu;atinh series part
            c = (double)(c + Math.pow(x,n) / Factrl((n+1)));    
            n += 1;
        }
        System.out.println("Series output: " + c);

        sc.close();
    }
}
