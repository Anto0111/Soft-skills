import java.util.Scanner;

public class Trybreakcont {

    
    public static void main(String[] args) {

        Scanner o=new Scanner(System.in);
        System.out.println("enter here");


        int n = o.nextInt();
        
        for(int i=0;i<=n;i++)
        {
            if (i==4) {
                break;
            }
            
              if (i==3) {
                  i=7;
                  continue;
              }
              System.out.println(i);
        }

    }
    
}
