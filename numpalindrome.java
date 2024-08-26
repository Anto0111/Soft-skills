import java.util.Scanner;

public class Trynumpalin {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("here :");
        int get = s.nextInt();
        
        int a=get, b=0 ,c=a ;

        while (a>0) {

            b=b*10+a%10;
            a=a/10;
            
        }

        System.out.println(b);

        if (c==b) {

            System.out.println("palindrome");
            
        }
        else
        {
            System.out.println("not a palindrome"+"but the reverse is "+b);
        }

    }
    
}
