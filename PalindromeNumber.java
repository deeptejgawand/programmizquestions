public class PalindromeNumber {
    public static void palindromeOrNot(int number){
        int reverseNumber=0;
        int originalNumber=number;
        while (originalNumber !=0) {
            int rem=originalNumber%10;
            reverseNumber=reverseNumber*10+rem;
            originalNumber=originalNumber/10;
        }
        if(number==reverseNumber){
            System.out.println("This is a palindrome");
        }else{
            System.out.println("This is not a palindrome");
        }
    }
    public static void main(String[] args) {

        palindromeOrNot(45);
        
    }
}
