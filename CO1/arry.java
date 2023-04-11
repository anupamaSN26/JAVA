import java.util.Scanner;
class arry{
    int [] a;
    void ReadArray()
    {
        a=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i=0;i<5;i++)
        {a[i]=sc.nextInt();
        }
        
    }
    void PrintArray()
    {
        System.out.println("Array elements are:");
        for(int i:a)
         System.out.println(i);
    }
    void FindArray()
    {
        int n;
        System.out.println("Enter the elements to be searched:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<5;i++){
            if(a[i]==n){
                System.out.println("The Element " +a[i]+ "is founded.." );
                break;
            }
        }
    }
    public static void main(String[] args)
    {
        arry obj=new arry();
        obj.ReadArray();
        obj.PrintArray();
        obj.FindArray();
    }
}