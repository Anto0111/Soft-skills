public class Tryinsertelement {

    public static void main(String[] args) {

        int a[] = {1,2,3,4};

        int b[]= new int[a.length+1];

        for(int i = 0 ; i<= a.length-1;i++)
        {

            b[i]=a[i];

        }

        int c= 5;
        
        b[b.length-1]= c;

        for(int d : b)
        {
            System.out.println(d);
        }
        
}

}
