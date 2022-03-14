//inheritance
package simran;
 class Allanimal {
void eat() {System.out.println("eating");}
}
class Animal1 extends Allanimal{
	void bark(){System.out.println("barking");}
}class Animal{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal1 A=new Animal1();
A.bark();
A.eat();
	}

}
