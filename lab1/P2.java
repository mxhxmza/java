import java.util.Scanner;

public class P2 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int merit = sc.nextInt();

        if (salary <= 600 && salary >= 500){
            System.out.println("Grade C");
        }
        else if (salary > 600 && salary < 649){
            if (merit < 10){
                System.out.println("Grade C");
            }
            else{
                System.out.println("Grade B");
            }
        }
        else if (salary <= 700 && salary >= 649){
            System.out.println("Grade B");
        }
        else if (salary > 700 && salary < 799) {
            if (merit < 20){
                System.out.println("Grade B");
            }
            else{
                System.out.println("Grade A");
            }
        }
        else if (salary <= 899 && salary >= 799){
            System.out.println("Grade A");
        }
        sc.close();
    }
}
