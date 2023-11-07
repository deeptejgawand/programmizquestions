import java.util.Scanner;

public class CountDigits {
    public static int countDigits(int number){
        int digitCount=0;
        if (number !=0){
             while (number !=0) {
            number=number/10;
            digitCount++;
            
        }
        return digitCount;
        }
       
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int input=sc.nextInt();
        System.out.println(countDigits(input));
        
    }
    
}
