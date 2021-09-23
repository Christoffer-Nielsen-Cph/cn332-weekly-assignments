public class Main{

	public static void main(String[]args){
		int [] integerArray = {1,2,3};
		String [] stringArray = {"one","two","three"};
		boolean [] booleanArray = {true,true,false};
		
		stringPrinter(stringArray);
		sumOfIntArray(integerArray);
		avgOfIntArray(integerArray);

	}

	public static void stringPrinter(String[] getStringArray){ 	
		for(int i=0;i<getStringArray.length;i++){
			System.out.println(getStringArray[i]);
		}

	}
	public static void sumOfIntArray(int[] getIntegerArray){
		int sum = 0;
		for(int i=0;i<getIntegerArray.length;i++){
			sum = sum + getIntegerArray[i];
		}
		System.out.println("The sum is "+sum);
	}
	public static void avgOfIntArray(int[] getIntegerArray){
		int sum = 0;
		for(int i=0;i<getIntegerArray.length;i++){
			sum = sum + getIntegerArray[i];
		}
		System.out.println("The average of the int array is "+sum/getIntegerArray.length);
	}

}




