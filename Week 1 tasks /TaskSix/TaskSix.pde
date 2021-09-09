//2 integers success or failure task
/*int a = (int) random(1,10);
 int b = (int) random(1,10);
 if (a==10 || b==10 || a+b==10){
 println("Success");
 println("a was: "+a);
 println("b was: "+b);
 }
 else {
 println("Failure");
 println("a was: "+a);
 println("b was: "+b);
 }*/

int x = (int) random(1, 30);
int y = (int) random(1, 30);
int z = (int) random(1, 30);
if (x+y+z==30 && x !=10 && x!=20 && x!=30 && y !=10 && y!=20 && y!=30 && z !=10 && z!=20 && z!=30) {
  println("success");
  println("x was: "+x);
  println("y was: "+y);
  println("z was: "+z);
} else {
  println("failure");
  println("x was: "+x);
  println("y was: "+y);
  println("z was: "+z);
}
