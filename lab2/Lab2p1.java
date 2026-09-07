import java.util.Scanner;
import java.lang.Math;
public class Lab2p1{
    public static void main(String[] args)
    {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: multiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            choice = sc.nextInt();
            switch (choice) {
            case 1: multest();
            break;
            case 2: divide(25, 7);
            break;
            case 3: modulus(25, 7);
            break;
            case 4: countDigits(121456);
            break;
            case 5: position(12145, 1);
            break;
            case 6: extractOddDigits(-12);
            break;
            case 7: System.out.println("Program terminating ….");
            }
        } while (choice < 7);
    }
    public static void multest(){
        int count = 0;
        for(int i = 0; i < 5; i++){
            long a = Math.round(Math.random()*8 + 1);
            long b = Math.round(Math.random()*8 + 1);
            int res = Math.toIntExact(a * b);
            System.out.printf("How much is %d times %d?", a, b);
            Scanner sc = new Scanner(System.in);
            int ans = sc.nextInt();
            if (ans == res) count ++;
        }
        System.out.printf("%d answers out of 5 are correct \n", count);
    }
    public static int divide(int m, int n){
        int count = 0;
        int a = m;
        while(m >= n){
            m -= n;
            count ++;
        }
        System.out.printf("%d / %d = %d \n", a, n, count);
        return count;
    }
    public static int modulus(int m, int n){
        int a = m;
        while(m >= n){
            m -= n;
        }
        System.out.printf("%d %% %d = %d \n", a, n, m);
        return m;
    }
    public static int countDigits(int n){
        int count = 0;
        int a = n;
        if (n < 0){
            System.out.printf("n : %d - Error input!! \n", n);
            return -1;
        }
        while(n != 0){
            count ++;
            n /= 10;
        }
        System.out.printf("n : %d - count = %d \n", a, count);
        return count;
    }
    public static int position(int n, int digit){
        int count = 0;
        int a = n;
        while(a != 0){
            count ++;
            a /= 10;
        }
        int ct = 0;
        while(n != 0){
            if (n%10 == digit){
                System.out.printf("position = %d \n", count - ct);
                return count - ct;
            }
            n /= 10;
            ct ++;
        }
        System.out.printf("position = -1 \n");
        return -1;
    }
    public static long extractOddDigits(long n){
        if (n < 0){
            System.out.printf("oddDigits = Error input!! \n");
            return -1;
        }
        long ans = 0;
        while(n != 0){
            if ((n % 10) % 2 == 1){
                ans = ans*10 + (n%10);
            }
            n /= 10;
        }
        long ans2 = 0;
        while(ans != 0){
            ans2 = ans2*10 + (ans%10);
            ans /= 10;
        }
        if (ans2 == 0) ans2 = -1;
        System.out.printf("oddDigits = %d \n", ans2);
        return ans2;
    }
}