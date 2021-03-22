package CH6;

public class Exercise6_23 {
	public static int max(int[] arr) {
		//매개변수로 넘겨받은 배열 arr이 null이거나 크기가 0 이면 -99999반환
		if(arr==null || arr.length==0) {
			return -99999;
		}
			// 배열의 첫번째 요소(arr[0])로 최대값(max)를 초기화
			int max = arr[0];
			
			for(int i=1; i<arr.length;i++) { //배열의 두번째값부터 비교
				if(arr[i]>max) { // 배열의 i번째 요소가 max보다 크면
					max = arr[i];
				}
			}
			return max;
		}
	

	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:"+max(data));
		System.out.println("최대값:"+max(null));
		System.out.println("최대값:"+max(new int[] {})); // 크기0인배열
	}

}
