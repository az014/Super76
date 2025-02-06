import java.util.Scanner;
public class palindrome {
    public static void main(String[]args){
        String original,reverse="";
        Scanner in=new Scanner(System.in);
        System.out.println("enter a string");
        original=in.nextLine();
        StringBuilder sb=new StringBuilder(original);
        String reversee= sb.reverse().toString();
        if(original.equals(reverse)){
            System.out.println("pakindrome");
        }
        else{
            System.out.println("not palindrome");
        }


    }
    
}
