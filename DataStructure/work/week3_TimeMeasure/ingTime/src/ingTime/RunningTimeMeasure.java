package ingTime;


public class RunningTimeMeasure {
	public static int fConstant(int[] arr) {
		return arr.length * 2;
	}
	
	public static int fLinear(int[] arr) {
		int totalSum = 0;
		for(int n : arr) {
			totalSum += n;
		}
		return totalSum;
	}
	
	public static boolean fQuadratic(int[] arr) {
		int target = 30;
		for(int first : arr) {
			for(int second : arr) {
				if(first + second == target) return true;
			}
		}
		return false;
	}
	
	public static boolean fCubic(int[] arr) {
		int target = 30;
		for(int first : arr) {
			for(int second : arr) {
				for(int third : arr) {
					if(first + second + third == target)
						return true;
				}
			}
		}
		return false;
	}
	
	public static boolean fFourth(int[] arr) {
		int target = 30;
		for(int first : arr) {
			for(int second : arr) {
				for(int third : arr) {
					for(int four : arr) {
						if(first + second + third + four == target)
							return true;
					}
				}
			}
		}
		return false;
	}
	
	

	public static void main(String[] args) {
		
		
		
		int[] arr = new int[500];
		for(int i = 0; i < arr.length; i++)
			arr[i] = 0;
		
		long beforeTime = System.currentTimeMillis();
		fFourth(arr);
		long afterTime = System.currentTimeMillis();
		long diffTimeMilliSecond = afterTime - beforeTime;
		System.out.println("fFourth Time diff (ms): " + diffTimeMilliSecond);

	}

}
