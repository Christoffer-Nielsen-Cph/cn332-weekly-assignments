public class Main{
  
  public static boolean happy = false;

public static void main(String [] args) {
   if (iAmHappy()){
     System.out.println("I clap my hands");
   }
   else{
     System.out.println("I don't clap my hands"); 
   }
   sumOfNumbers(5,10);
   lowerToUpper("hej");
   checkString("Test");

}

public static int sumOfNumbers(int a, int b){
  int sum = a+b;
  System.out.println(sum);
  return sum;

}
public static String lowerToUpper(String a){
  System.out.println(a.toUpperCase());
  return a.toUpperCase();

}
public static boolean checkString(String b){
 if(Character.isUpperCase(b.charAt(0))){
  return true;
 }
 else{
  return false;
 }
}

public static boolean iAmHappy(){
  // fill out what is missing here: 
    if(happy == true){
    return true; 
    } 
    else{
      return false;
    }
  }
}