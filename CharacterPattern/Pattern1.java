import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for print pattern : ");
        char enter = sc.next().charAt(0);
        for(char i='A';i<=enter;i++){
            for(char j=i;j<=enter;j++){
            System.out.print(i);
            }
            System.out.println();
        }
    }
}