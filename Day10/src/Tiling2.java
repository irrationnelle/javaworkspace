import java.util.Scanner;

public class Tiling2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
                                
        int c = scan.nextInt();
        if(c <= 50) {
            for(int i=0; i<c; i++) {
                int num1=0;
                int num2=1;
                int num3=num1+num2;
                int n = scan.nextInt();
                if(n >= 1 && n <=100) {
                    for(int j=0; j<n; j++) {
                        num3 = num1+num2;                        
                        num1 = num2;
                        num2 = num3;
                    }
                    System.out.println(num3);
                } else {
                    return;
                }
            }
        } else {
            return;
        }
    }
}