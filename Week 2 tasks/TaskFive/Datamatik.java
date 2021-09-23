public class Datamatik{
	
	public static void main(String[]args){
		Student myStudent[] = new Student[10];
		myStudent[0] = new Student("Christoffer",21,false,'a',0);
		myStudent[1] = new Student("Anders",23,false,'a',1);
		myStudent[2] = new Student("Mie",25,true,'a',2);
		myStudent[3] = new Student("Mikkel",20,false,'a',3);
		myStudent[4] = new Student("Alberte",25,true,'a',4);
		myStudent[5] = new Student("Emil",21,false,'a',5);
		myStudent[6] = new Student("Frederik",23,false,'a',6);
		myStudent[7] = new Student("Casper",24,false,'a',7);
		myStudent[8] = new Student("Mette",22,true,'a',8);
		myStudent[9] = new Student("Kristian",26,false,'a',9);
		printStudent(myStudent,0);
		printStudent(myStudent,2);
		returnIndex(myStudent,"Frederik");
		
	}

	public static String printStudent(Student[] myStudent, int index){
			String studentName ="";
			for(int i=0;i<myStudent.length;i++){
				if(myStudent[i].studentID == index){
					studentName = myStudent[i].name;
				}
			}
			System.out.println(studentName);

			return studentName;
		}

	public static int returnIndex(Student[] myStudent,String studentName){
		int index = 0;
		for(int i=0;i<myStudent.length;i++){
			if(myStudent[i].name == studentName){
				index = myStudent[i].studentID;
			}
		}
		System.out.println(index);
		return index;
	}

	}

