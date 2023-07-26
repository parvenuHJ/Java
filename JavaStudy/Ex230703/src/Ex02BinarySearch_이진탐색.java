
public class Ex02BinarySearch_이진탐색 {

	public static void main(String[] args) {

		// 오름차순으로 순서대로 정렬하고 , 그 배열에서 중간 쯤 과 찾는 값을 비교해서 크면 오른쪽으로 가면서 비교
		
		// 1. 오름 or 내림 차순으로 정렬
		// 2. 중간값 과 찾는값을 비교
		// 3. 중간값을 기준으로 왼(오른)쪽으로 비교
		// 4. 맨 마지막 인덱스 주소 = array.length-1 
		// 변수 - > lowIndex , highIndex
		// 만약 20번째가 답이라면, 찾는다면 0 ~ 20 --> 0-20 (10) -> 10-20 (15) ....
		
		int [] array = {1,7,16,25,30,33,41,66,78,90};
		
		int search = 41;
		
		int lowIndex = 0;
		int highIndex = array.length-1;
		
		
		while(true) {
			// 중간값 찾는법 - (맨 처음 값 + 맨 마지막 값)/2 해서 소수점은 그냥 버림
			int midIndex = (lowIndex + highIndex)/2; // (0+9)/2 -> 4.5 인데 int/int 라서 4.5 -> 4가 됨
			
			if(search == array[midIndex]) {
				System.out.println(search + "는 " + midIndex + "번 인덱스에 있습니다.");
				break; // 값이 맞을때는 while문 탈출
			}else if(search > array[midIndex]) {
				lowIndex = midIndex + 1; // 0-20 (10) -> 11-20 (15) 처럼 (10)중간값 +1 = 11 lowindex가 됨
			}else if(search < array[midIndex]) {
				highIndex = midIndex -1;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
