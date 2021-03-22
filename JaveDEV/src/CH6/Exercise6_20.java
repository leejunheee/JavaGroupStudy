package CH6;

public class Exercise6_20 {
	public static int[] shuffle(int[] arr) {
		if (arr==null || arr.length==0)
			return arr;
		//배열크기의 두 배 정도의 횟수를 섞으면 충분히 섞인다.
		for(int x=0; x<arr.length*2;x++) {
			int i = (int)(Math.random()*arr.length);
			int j = (int)(Math.random()*arr.length);
			
			//arr[i]와 arr[j]값을 서로 바꿈.
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
		
		return arr;
		
	}

	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

}
