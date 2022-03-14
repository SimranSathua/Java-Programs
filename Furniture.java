package simran;

public class Furniture {
void x()
{System.out.println("cupboard");}
}
class diningTable extends Furniture{
	void type1() 
	{System.out.println("wood");}
}
class chair extends diningTable{
   void type2() {System.out.println("plastic");}
}
class test
{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
chair c=new chair();
c.x();
c.type1();
c.type2();
	}

}
