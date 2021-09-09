String output; //Declared the string variable as a global variable.
String dayName;
int weekDay = 6; // 0 = Monday, 6 = Sunday.
boolean weekend = false;

void setup() {
  MethodOne();
  MethodTwo();
}

/*
  The following method has an error in it. Fix the error and run it.
 */

void MethodOne()
{

  int i = 1000; // You are not allowed to change this line.

  int max = 10;

  if (i > max)
  {
    output = "i is greater than "+max+".";
  }

  println(output);
}
/*
 Finish the following method so that we can change the number assigned
 to the weekday and it prints the correct output.
 */
void MethodTwo()
{
  // Print the name of the weekday here:
  switch (weekDay) {
  case 0:
    dayName="Monday";
    break;
  case 1:
    dayName="Tuesday";
    break;
  case 2:
    dayName= "Wednesday";
    break;
  case 3:
    dayName="Thursday";
    break;
  case 4:
    dayName="Friday";
    break;
  case 5:
    dayName="Saturday";
    break;
  case 6:
    dayName="Sunday";
    break;
  }
  println(dayName);
  if (weekDay < 5)
  {
    weekend = false;
    println("It's not weekend");
  } else
  {
    weekend = true;
    println("It's weekend");
  }
}
