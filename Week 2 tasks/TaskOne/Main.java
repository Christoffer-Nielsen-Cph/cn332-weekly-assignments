public class Main{
	static void emptyLine(){
		System.out.println("");
	}
	static void printString(String a){
		System.out.println(a);
	}
	static void Person(String name, int age){
		System.out.println("My name is "+name+", I am "+age+" years old.");

	}

	public static void main(String[]args){
		emptyLine();
		printString("Hello");
		Person("Christoffer", 21);
	}
}