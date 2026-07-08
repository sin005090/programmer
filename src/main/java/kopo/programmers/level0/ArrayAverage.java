package kopo.programmers.level0;

public class ArrayAverage {
    public static void main(String[] args) {
        /*
        정수 배열 numbers가 매개변수로 주어집니다.
        numbers의 원소의 평균값을 return하도록
        solution 함수를 완성해주세요.
         */

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(solution(numbers));
    }

    static double solution(int[] numbers) {
        int sum = 0;

        // 향상된 for문을 사용해 배열의 모든 요소를 더합니다.
        for (int num : numbers) {
            sum += num;
        }

        // 정확한 소수점 계산을 위해 sum을 double로 형변환한 후 배열의 길이로 나눕니다.
        double answer = (double) sum / numbers.length;
        return answer;
    }
}