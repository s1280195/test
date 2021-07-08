import java.util.Random;
import java.util.Scanner;

class Greeting{
  void askName(){
     System.out.println("What is your name?");
   }
  String scanName(){
    Scanner sc1=new Scanner(System.in);
    return sc1.nextLine();
  }
  String printName(){
    String name=scanName();
    System.out.println("Hello,"+name+"!");
    return name;
}
}

class Create{
  int Rand;
  Create(){
    Rand=0;
  }
  int Rand_create(){
    Random rand=new Random();
    Rand=rand.nextInt(6)+1;
    return Rand;
  }
}

class Die_3{
  public static void main(String[] args){
    int d1;
    int d2;
    int total;
    String name;

    Greeting g=new Greeting();
    g.askName();
    name=g.printName();

    Create c1=new Create();
    d1=c1.Rand_create();

    Create c2=new Create();
    d2=c2.Rand_create();

    total=d1+d2;

    System.out.println("Rolling the dice...");
    System.out.println("Die 1: "+d1);
    System.out.println("Die 2: "+d2);
    System.out.println("Total value: "+total);

    if(total>7) System.out.println(name+" won!");
    else System.out.println(name+" lost!");
  }
}
