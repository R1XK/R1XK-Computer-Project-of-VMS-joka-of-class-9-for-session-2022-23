import java.util.Scanner;

class Question8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);            //Input block
        System.out.println("Enter Day number");
        int dd = sc.nextInt();
        System.out.println("Enter Month number");
        int mm = sc.nextInt();
        System.out.println("Enter Year number");    
        int yy = sc.nextInt();                       
        System.out.println("Enter days to be added");
        int add = sc.nextInt();                         //End of Input block


        dd += add;
        if (mm==4 || mm==6 || mm==9 || mm==11){
            if (dd>30){
                mm++;
                dd -= 30;
            }
        }
        else if (mm==1 || mm==3 || mm==5 || mm==7 | mm==8 || mm==10){
            if (dd>31){
                mm++;
                dd -= 31;
            }
        }
        else if(mm==12){
            if (dd>31){
                yy++;
                mm-=11;
                dd -= 31;
            }
        }
        else if (yy%4==0 && mm==2){
            if (dd>29){
                mm++;
                dd -= 29;
            }
        }
        else if (yy%4!=0 && mm==2){
            if (dd>28){
                mm++;
                dd -= 28;
            }
        }

        System.out.println(dd + "\\" + mm + "\\" + yy);

        sc.close();

    }
}