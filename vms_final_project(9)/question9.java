import java.util.Scanner;

class question {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);            //Input block
        System.out.println("Enter Seconds");
        int ss = sc.nextInt();
        System.out.println("Enter Minutes");
        int mm = sc.nextInt();
        System.out.println("Enter Hours");    
        int hh = sc.nextInt();                       
        System.out.println("Enter Seconds to be added");
        int add = sc.nextInt();                         //End of Input block

        ss+=add;
        if (ss>60){
            mm++;
            ss -= 60;
        }

        if (mm>60){
            hh++;
            mm -= 60;
        }

        System.out.println(hh + "hr " + mm + "min " + ss + "sec ");

        sc.close();
    }
}