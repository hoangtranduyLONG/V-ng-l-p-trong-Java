import java.util.Scanner;
public class Cacsonguyentonhohon100 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String str = "Là SNT";
       int num = 2;
       while (num <= 100) {
           str = "Là SNT";
           for (int i =2; i < num; i++){
               if(num % i ==0){
                   str = "Không phải số nguyên tố";
                   break;
               }
               }
           if (str.equals("Là SNT")){
               System.out.println(num);
           }
               num++;
           }
           }
       }

