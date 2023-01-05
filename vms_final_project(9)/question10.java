import java.util.Scanner;

class question10 {

    static boolean Prime_chk(int n){
        for (int i=2; i<n; i++){
            if (n%i == 0)
                return false;
        }
        return true;
    }

    static void Twin_Prime(int n){
        for (int i=1; i<=n; i++){
            if (Prime_chk(i)==true && Prime_chk(i+2)==true){
                System.out.println(i + " and " + (i+2) + " are Twin prime");
            }
        }
    }

    static void Twisted_Prime(int n){
        int cpy = n, pal = 0;
        while (cpy != 0){
            int d = cpy % 10;
            pal = (pal*10) + d;
            cpy /= 10;
        }
        if (Prime_chk(n)==true && Prime_chk(pal)==true)
            System.out.println(n + " and " + pal + " are both Twisted prime");
        else 
        System.out.println(n + " and " + pal + " are NOT Twisted prime");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chose option \n <1> Twin Prime \n <2> Twisted Prime");
        int opt = sc.nextInt();

        switch (opt){
            case 1:
                System.out.println("Enter a range");
                int r = sc.nextInt();
                Twin_Prime(r);
            break;

            case 2:
                System.out.println("Enter a number");
                int n = sc.nextInt();
                Twisted_Prime(n);
            break;

            default:
                System.out.println("Wrong choice");
        }

        sc.close();
    }
}
