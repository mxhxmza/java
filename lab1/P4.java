import java.util.Scanner;

public class P4 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        if (height < 1){
            System.out.println("Error input!!");
            sc.close();
            return;
        }
        char c;
        for(int i = 0; i < height; i++){
            if (i % 2 == 0) c = 'A';
            else c = 'B';
            for(int j = 0; j < (i+1)*2 ; j++){
                System.out.print(c);
                if (j % 2 != 0){
                    if (c == 'A') c = 'B';
                    else c = 'A';
                }
            }
            System.out.printf("\n");
        }
        sc.close();
    }
}
