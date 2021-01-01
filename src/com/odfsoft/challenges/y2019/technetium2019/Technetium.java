package com.odfsoft.challenges.y2019.technetium2019;

import java.math.BigDecimal;

public class Technetium {

    public String solution(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        BigDecimal[] maxNumber = new BigDecimal[M + 1];
        initArray(maxNumber);
        for(int i=1; i < N + 1; i++) {
            BigDecimal[] current = new BigDecimal[M + 1];
            initArray(current);
            for (int j = 1; j < M + 1; j++) {
                current[j] = maxNumber[j].max(current[j - 1])
                        .multiply(BigDecimal.TEN)
                        .add(BigDecimal.valueOf(A[i -1][j -1]));
            }
            maxNumber = current;
        }
        return maxNumber[M].toString();
    }

    public String solutionNotBigNumbers(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        long[][] partialResult = new long[N+ 1][M + 1];

        for(int i=1; i < N + 1; i++) {
            for (int j = 1; j < M + 1; j++) {
                partialResult[i][j] = Math.max(partialResult[i - 1][j], partialResult[i][j - 1]) * 10 + A[i -1][j -1];
            }
        }
        return String.valueOf(partialResult[N][M]);
    }

    private void initArray(BigDecimal[] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = BigDecimal.ZERO;
        }
    }
}
