import java.util.*;
public class Main{
    public static void main(String[] args){
    System.out.print("Enter number for print pattern : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
              System.out.print(i);
        }
        System.out.println();
    }
  }
}