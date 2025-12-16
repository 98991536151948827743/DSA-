package Learning_Basic.basic1;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n: ");
        int n = sc.nextInt();
        int odd=0;
        int even =0;

        for (int num=1; num<=n; num++){
            int remainder= num %2;


            
            switch (remainder) {
                case 0:
                    even++;
                    break;
                case 1:
                    odd++;
                    break;

            
                default:
                    break;
            }
        }
        System.out.printf("the number of odd number %d", odd);
                System.out.printf("the number of even number %d", even);

    }
}
