import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of Star Pyramid of N : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            //for space
            for(int k=n-i;k>=0;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}