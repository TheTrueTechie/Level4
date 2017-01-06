package cube;
class NumberCubeQuestion {
	int a = 0;
	public int greatestNumber(int[] array) {
		a = array[0]; 
		for (int i = 0; i < array.length; i++) {
			
			if (a<array[i]) {
				a = array[i];
				
			}
		}
		 System.out.println("Yes! Number was " + a );

		return a;
		
		
	}
	
	public static int[] getCubeTosses(NumberCube numberCube, int testValues) {
		int[] a = new int[testValues];
		
		for (int i = 0; i < testValues; i++) {
			a[i] = numberCube.toss();
			
		
		}
		
		
		
		return a;
		
		
		
	}
	
	public static int getLongestRun(int[] testValues) {
		int index = 0;
		int longestRun = 0;
		int currentRun = 0; 
		for (int i = 0; i < testValues.length-1; i++) {
			if (currentRun>longestRun) {
				longestRun = 0;
				
				longestRun = currentRun;
				index = (i - longestRun);
				index++; 
			}
			if(testValues[i]==testValues[i+1]){
				
				currentRun = currentRun + 1; 
			 
				
			}
			
			else {
				currentRun = 0; 
			}
			
		
			
		
			}
		System.out.println(longestRun);
		System.out.println(index);
		
		
		return index-1;
	
	}
	
}