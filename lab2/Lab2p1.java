import java.util.Scanner;
public class Lab2p1 {
    public static void main(String[] args)
    {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: miltiplication test");
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
            case 2: divide();
            break;
            case 3: modulus();
            break;
            case 4: countDigits();
            break;
            case 5: position();
            break;
            case 6: extractOddDigits();
            break;
            case 7: System.out.println("Program terminating ….");
            }
        } while (choice < 7);
    }
    static Scanner sc = new Scanner(System.in);
    public static void multest(){
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a*b);
    }
    public static void divide(){
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a/b);
    }
    public static void modulus(){
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a%b);
    }
    public static void countDigits(){
        int a = sc.nextInt();
        int count = 0;
        while(a != 0){
            count ++;
            a /= 10;
        }
        System.out.println(count);
    }
    public static void position(){
        int a = sc.nextInt();
        int digit = sc.nextInt();
        int count = 0;
        while(a != 0){
            count ++;
            a /= 10;
        }
        int ct = 0;
        while(a != 0){
            ct ++;
            if (a%10 == digit){
                System.out.println(ct - count);
            }
            a /= 10;
        }
    }
    public static void extractOddDigits(){
        int a = sc.nextInt();
        int count = 0;
        while(a != 0){
            count ++;
            if (count % 2 == 1){
                System.out.print(a%10);
                System.out.print(" ");
            }
            a /= 10;
        }
        System.out.println();
    }
}