import java.util.Scanner;
class arry2d{
    int [][]a;
    void ReadArray()
    {
        a=new int[2][2];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
        a[i][j]=sc.nextInt();
        }
        }
        
    }
    void PrintArray()
    {
        System.out.println("Array elements are:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
         System.out.print(a[i][j]+" ");
        }
          System.out.println();
        }
    }
    void FindArray()
    {
        int n;
        int c=0;
        System.out.println("Enter the elements to be searched:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                if(a[i][j]==n){
                    c=c+1;
                }
            }
        }
        if(c>0){
            System.out.println("element found");
        }
        else{
            System.out.println("element  not found");
        }
        
    }
    
    public static void main(String[] args)
    {
        arry2d obj=new arry2d();
        obj.ReadArray();
        obj.PrintArray();
        obj.FindArray();
    }
}