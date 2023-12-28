class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder(); // StringBuilder 생성
        int start = c - 1; // index는 0부터 시작인데 c는 1이라서 0으로 만들기
        
        while(start < my_string.length()) { // start가 my_string의 길이를 넘지 않을동안
            answer.append(my_string.charAt(start)); // start에 있는 문자열 추출해서 answer에 추가
            start += m; // m만큼 증가시켜 다음 위치로
        }             
        return answer.toString(); //문자열 형태로 반환
    }
}