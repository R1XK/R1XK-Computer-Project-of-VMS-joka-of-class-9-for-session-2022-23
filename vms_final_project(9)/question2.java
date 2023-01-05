import java.util.Scanner;

public class question2 {

    static int Factrl(int num){     //factorial 
        int fact=1;
        for (int i=1;i<=num;i++){
            fact = fact * i;
        }
        return (fact);
    }

    static void Series1(int range){     //series 1: 1 + 2! + 3 + 4!...n
        int c=0;
        for (int i=1; i<= range; i++){
            if (i%2 != 0)
                c+=i;
            else    
                c+=Factrl(i);
        }
        System.out.println("Series 1 output: " + c);
    }

    static void Series2(int range){     //series 2: 1 + 21 + 321 + 4321...n
        int c=1, k=10;
        for (int i=2; i<=range; i++){
            c=c+((i*k)+c);
            k=k*10;
        }
        System.out.println("Series 2 output: " + c);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose your option number: \n <1> Series 1: 1 + 2! + 3 + 4! ... n terms \n <2> Series 2: 1 + 21 + 321 + 4321 ... n terms");
        int opt = sc.nextInt();     //input option taken

        System.out.print("Enter range of series: ");
        int range = sc.nextInt();

        //check for option
        if (opt == 1)
            Series1(range);
        else if (opt == 2)
            Series2(range);
        else 
            System.out.println("Wrong option");

        sc.close();
    }
}
