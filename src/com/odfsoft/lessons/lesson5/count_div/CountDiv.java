package com.odfsoft.lessons.lesson5.count_div;

public class CountDiv {

    public int solution(int A, int B, int K) {
        int firstDividableInRange = A % K == 0 ? A : A + (K - A % K);
        int lastDividableInRange = B - (B % K);
        int result = (lastDividableInRange - firstDividableInRange) / K + 1;
        return result;
    }
}
