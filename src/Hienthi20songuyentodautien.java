import java.util.Scanner;
public class Hienthi20songuyentodautien {
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            String str = "Là SNT";
            int count = 1;
            int num = 2;
            while (count <= 20) {
                str = "Là SNT";
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        str = "Không phải số nguyên tố";
                        break;
                    }
                }
                if (str.equals("Là SNT")) {
                    System.out.println(num);
                    count++;
                }
                num++;
            }
        }
    }
