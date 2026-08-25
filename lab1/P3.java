import java.util.Scanner;

public class P3 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int increment = sc.nextInt();
        if (start > end || increment <= 0) {
            System.out.println("Error input!!");
            sc.close();
            return;
        }

        System.out.println("US$          S$");
        System.out.println("---------------");
        for(int i = start; i <= end; i+=increment){
            System.out.println(i + "          " + i*1.82);
        }

        int i = start;
        System.out.println("US$          S$");
        System.out.println("---------------");
        while(i <= end){
            System.out.println(i + "          " + i*1.82);
            i += increment;
        }


        i = start;
        System.out.println("US$          S$");
        System.out.println("---------------");
        do{
            System.out.println(i + "          " + i*1.82);
            i += increment;
        }
        while(i <= end);

        sc.close();
    }
}
