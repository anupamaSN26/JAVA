class Product {
    int price;
    String pname;
    int pcode;

    Product(int id,String n, int pr){
    price =pr;
    pname=n;
    pcode =id;
    }
    void display(){
    System.out.println("id:"+pcode);
    System.out.println("name:"+pname);
    System.out.println("price:"+price);
    }


  static void lowest(int p1,int p2,int p3){
   if(p1 > p2 && p1 >p3){
     System.out.println("p1 is the greatest");
   } else if(p2>p3){

 System.out.println("p2 is the greatest");
   }else{
 System.out.println("p3 is the greatest");
   }
   }

   public static  void main(String args[]) {
    Product p[]=new Product[3];
    p[0]=new Product(101,"p1",1000);
    p[1]=new Product(102,"p2",11000);
    p[2]=new Product(103,"p3",4005678);
    p[0].display();
    p[1].display();
    p[2].display();
    lowest(p[0].price,p[1].price,p[2].price);
   }  
}