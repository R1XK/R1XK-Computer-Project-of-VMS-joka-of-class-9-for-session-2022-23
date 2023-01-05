public class question6 {
    public static void main(String[] args) {

        /*
         * printing prime numbers from 10 to 1 
         * -combining: do-while & while loop
         */

         int num = 10;
         while (num !=1){
            
            int cpy = num;
            int i = 1;
            int chk = 0;
            do{ 
                if (cpy % i == 0)
                chk = chk + 1;
                i++;
            } while (i<=cpy);
            
            if (chk == 2)
            System.out.println(cpy);

            num--;
         }
    }    
}
