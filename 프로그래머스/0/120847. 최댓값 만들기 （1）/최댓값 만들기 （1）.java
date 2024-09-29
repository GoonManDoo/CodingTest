import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);
        
        int max = numbers[numbers.length-1];
        int max2 = numbers[numbers.length-2];
        
        System.out.println("MAX : " + max);
        System.out.println("MAX2 : " + max2);
        
        answer = max * max2;
        
        return answer;
    }
}