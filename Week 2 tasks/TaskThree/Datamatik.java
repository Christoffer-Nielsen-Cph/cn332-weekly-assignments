public class Datamatik{
	
	public static void main(String[]args){
		Teacher t1 = new Teacher("Mette",20,true);
		Student s1 = new Student("Christoffer",21,false,8);
		Student s2 = new Student("Gustav",20,false,8);
		System.out.println(t1.name);
		System.out.println("The group consists of "+s1.name+" and "+s2.name+" and the group number is "+s1.datamatikerTeam);
	}
}

