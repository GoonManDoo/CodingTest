class Solution {
    public int solution(String message) {
        int answer = 0;
        //String count = message.charAt();
        System.out.print("카운트 : " + message.length());
        answer = message.length() * 2;
        return answer;
    }
}