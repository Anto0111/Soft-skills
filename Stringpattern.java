import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        String[] arr={"A","B","C","D"};
        
        for (int i =0;i<arr.length ;i++ ){
          
          int add = i;
          
          for(int j=0;j<arr.length;j++){
            
            System.out.print(arr[add]);
            add++;
            
            if (add==arr.length){
            add=0;
            } 
            
          }
          
          
          System.out.println();
        
        } 
        
        
  }
}
