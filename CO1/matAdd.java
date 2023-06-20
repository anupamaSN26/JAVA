import java.util.Scanner;
class matAdd{
    int a[][];
    int b[][];
    int c[][];
    void ReadM()
    {
         a=new int[2][2];
         b=new int[2][2];
         c=new int[2][2];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of first matrix:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
        a[i][j]=sc.nextInt();
       }
       }
       System.out.println("Enter the elements of second matrix:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
        b[i][j]=sc.nextInt();
        }
        }

    }
     void AddM()
    {
        c=new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
    }
    void PrintM()
    {
        System.out.println(" elements of A are:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
         System.out.print(a[i][j]+" ");
        }
          System.out.println();
        }

        System.out.println(" elements of B are:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
         System.out.print(b[i][j]+" ");
        }
          System.out.println();
        }

        System.out.println(" matrix addition : ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
         System.out.print(c[i][j]+" ");
        }
          System.out.println();
        }
    }
   
     public static void main(String[] args)
    {
        matAdd obj=new matAdd();
        obj.ReadM();
        obj.AddM();
        obj.PrintM();
        
       
    }
}    