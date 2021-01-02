package com.odfsoft.lessons.lesson5.genomic_range_query;

public class GenomicRangeQuery {

    public int[] solution(String S, int[] P, int[] Q) {
        char[] nucleotides = S.toCharArray();
        int[][] cumulativeNucleotide = new int[4][S.length() + 1];
        for(int i=1; i <= nucleotides.length; i++) {
            for(int j=0; j<4;j++) {
                cumulativeNucleotide[j][i] = cumulativeNucleotide[j][i-1];
            }
            cumulativeNucleotide[getImpact(nucleotides[i-1])-1][i]++;
        }

        int[] genomicRange = new int[P.length];
        for(int i=0; i < P.length; i++) {
            int from = P[i];
            int to = Q[i] + 1;
            int minimalImpact = 0;
            int j =0;
            while(j<4 && minimalImpact ==0) {
                if(cumulativeNucleotide[j][to] - cumulativeNucleotide[j][from] > 0) {
                    minimalImpact = j + 1;
                } else {
                    j++;
                }
            }
            genomicRange[i] = minimalImpact;
        }

        return genomicRange;
    }

    private int getImpact(char nuclieotide) {
        switch (nuclieotide) {
            case 'A': return 1;
            case 'C': return 2;
            case 'G': return 3;
            case 'T': return 4;
            default: return 0;
        }
    }
}
