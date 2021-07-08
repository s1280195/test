import java.util.Random;

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

class Die{
  public static void main(String[] args){
    int d1;
    int d2;
    int total;

    Create c1=new Create();
    d1=c1.Rand_create();

    Create c2=new Create();
    d2=c2.Rand_create();

    total=d1+d2;

    System.out.println("Rolling the dice...");
    System.out.println("Die 1: "+d1);
    System.out.println("Die 2: "+d2);
    System.out.println("Total value: "+total);
  }
}
