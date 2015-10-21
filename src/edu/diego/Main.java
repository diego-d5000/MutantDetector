package edu.diego;

public class Main {

    public static void main(String[] args) {
        String[] dna;
        MutantAnalyzer mutantAnalyzer = MutantAnalyzer.getInstance();

        dna = new String[]{"ATGCGA", "CAGTGC", "TTATGT", "AGAAGG", "CCCCTA", "TCACTG"};
        System.out.println(mutantAnalyzer.isMutant(dna));
        dna = new String[]{"AGCTTG", "AAGTAA", "CTAATG", "CAAAGC", "GTGTCA", "CGAAGC"};
        System.out.println(mutantAnalyzer.isMutant(dna));
        dna = new String[]{"ACTAGTGAC", "AAGTAAGCA", "CTTTTAATG", "GCCTAACTT", "GTGTGGTCA", "CATGCGATC"};
        System.out.println(mutantAnalyzer.isMutant(dna));
        dna = new String[]{"CTTTTAATGACTAGTGAC", "ACTAGTGACAAGTAAGCA", "GTGTGGTCACTTTTAATG",
                "CATGCGATCGCCTAACTT", "GCCTAACTTGTGTGGTCA", "CATGCGATCCATGCGATC"};
        System.out.println(mutantAnalyzer.isMutant(dna));
    }

}
