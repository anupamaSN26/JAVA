import java.util.Scanner;
class Complex{
    int real,img;

    Complex(int r, int i){
        real=r;
        img=i;
    }
    void display(){
         System.out.println("---------------------");
        System.out.println(real+"+"+img+"i");
        System.out.println("---------------------");
    }
  public static Complex add(Complex n1, Complex n2){
    Complex result =new Complex(0,0);
    result.real=n1.real+n2.real;
    result.img=n1.img +n2.img;
    return result;
  }

    public static void main(String[] args){
        int a1,b1;
        int a2,b2;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the real part a1= ");
    a1=sc.nextInt();
    System.out.println("Enter the imaginary part b1= ");
    b1=sc.nextInt();
    Complex c1 =new Complex(a1,b1);

    System.out.println("Enter the real part a2 = ");
    a2=sc.nextInt();
    System.out.println("Enter the imaginary part b2 = ");
    b2=sc.nextInt();
    Complex c2 =new Complex(a2,b2);

    
    System.out.println("First complex number :");
    c1.display();
    System.out.println("Second Complex number :");
    c2.display();
    Complex result=add(c1,c2);
    System.out.println("Addition of two complex number");
    result.display();

}
}

/*

First complex number
---------------------
4+6i
---------------------

Second Complex number
---------------------
4+4i
---------------------

Addition of two complex number
---------------------
8+10i
---------------------


*/ 