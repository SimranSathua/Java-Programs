//parameterized constructor
public class Student2 {
int id;
String name;
Student2(int i,String n){
	id=i;
	name=n;
			
}
void display(){System.out.println(id+" "+name);}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student2 s1 = new Student2(20,"rita");
Student2 s2 = new Student2(25,"gimi");
s1.display();
s2.display();
	}

}
