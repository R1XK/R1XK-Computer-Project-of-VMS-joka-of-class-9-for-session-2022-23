import java.util.Scanner;

class question1{

    static void Opt1(int range){    //code for option 1

        int a = 0, b = 1, c = 0;
        System.out.println(b);
        for (int i=0; i<=(range-2); i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }

    }

    static void Opt2(int num){

        if ((int)(Math.log10(num)+1)!=3)
            System.out.println("NOT a 3 digit number!"); 
            else if(num % 3 == 0 && num % 5 == 0)
                System.out.println(num + " is multiple of 3 and 5");
                else 
                    System.out.println(num + " is not a multiple of 3 and 5");

    }

    static void Opt3(int num){      //code for option 3

        /*  
         *   METHODS USED
         *    if 5 * n^2 + or - 4 is perfect square then it is fibonnaci number
         *    if sqrt of num - floor of sqrt of num is 0 then it is perfect square 
         */

        int chk1 = (int)(5*(Math.pow(num,2))+4);   
        int chk2 = (int)(5*(Math.pow(num,2))-4);

        if (Math.sqrt(chk1)-(Math.floor(Math.sqrt(chk1))) == 0 || Math.sqrt(chk2)-(Math.floor(Math.sqrt(chk2))) == 0)
            System.out.println(num + " is a Fibbonacci number");
            else    
                System.out.println(num + " is not a fibonnaci number");

    }

    public static void main(String[] args) {

       //displays menue
       System.out.println("Choose option the number:"+"\n"+"<1> n numbers of Fibonacci term(s)"+"\n"+"<2> Check if 3 digit number is multiple of 3 & 5 or not"+"\n"+"<3> Check if a number is Fibonacci number");

        Scanner sc = new Scanner(System.in);        
        System.out.println("\n Your option is:");   
        int opt = sc.nextInt();     //option is inputed

        if (opt == 1)
           { System.out.print("Enter range: "); Opt1(sc.nextInt()); }
        else if (opt == 2)
           { System.out.print("Enter 3 digit number: "); Opt2(sc.nextInt()); }
        else if (opt == 3)
           { System.out.print("Enter a number: "); Opt3(sc.nextInt()); }
        else 
           { System.out.println("INVALID OPTON"); }

        sc.close();
    }
}