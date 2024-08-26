import java.util.Scanner;

public class Trypalindrome {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Here :");
        String get = s.nextLine();
        
        String a=get;
        String b="";

        for(int i=a.length()-1;i>=0;i--)
        {
            b=b+a.charAt(i);
        }

        if (a.equalsIgnoreCase(b)) {

            System.out.println("Palindrome");
            
        }
        else{

            System.out.println("Not a palindrome"+" And the Reverse is : "+b);

        }


    }
    
}
