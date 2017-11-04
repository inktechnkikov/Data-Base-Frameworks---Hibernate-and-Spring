package tenRun;

public class Starter {

	public static void main(String[] args) {
		int[] arrNumber = {
				10,1,9,20
		};
		tenRun(arrNumber);
	}
	public static int[] tenRun(int[] arr) {
		int mode = -1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 10 == 0) {
				mode = arr[i];
				}
			else if(mode!=-1) {
				arr[i] = mode;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d,",arr[i]);
		}
		return arr;
	}

}
