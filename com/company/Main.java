package com.company;

import java.util.HashMap;

public class Main {

    private static double minimum(double a, double b, double c) {
        return Math.min(Math.min(a, b), c);
    }

    private static double ChceckNeighbour(Character c1, Character c2){
        HashMap<Character, String> Neighbours = new HashMap<>();
        double isNeighbour;
        String c2s = c2.toString();

        Neighbours.put('q', "w");
        Neighbours.put('w', "qe");
        Neighbours.put('e', "wr");
        Neighbours.put('r', "et");
        Neighbours.put('t', "ry");
        Neighbours.put('y', "tu");
        Neighbours.put('u', "yi");
        Neighbours.put('i', "uo");
        Neighbours.put('o', "ip");
        Neighbours.put('p', "o");

        Neighbours.put('a', "s");
        Neighbours.put('s', "ad");
        Neighbours.put('d', "sf");
        Neighbours.put('f', "dg");
        Neighbours.put('g', "fh");
        Neighbours.put('h', "gj");
        Neighbours.put('j', "hk");
        Neighbours.put('k', "jl");
        Neighbours.put('l', "k");

        Neighbours.put('z', "x");
        Neighbours.put('x', "cz");
        Neighbours.put('c', "vx");
        Neighbours.put('v', "bc");
        Neighbours.put('b', "nv");
        Neighbours.put('n', "mb");
        Neighbours.put('m', "n");

        String charNeighbours = Neighbours.get(c1);
        if (charNeighbours.contains(c2s)) {
            isNeighbour = 0.5;
        } else {
            isNeighbour = 1;
        }
        return isNeighbour;
    }

    public static double LevQWERTY(String s1, String s2) {
        double[][] distance = new double[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i <= s1.length(); i++)
            distance[i][0] = i;
        for (int j = 1; j <= s2.length(); j++)
            distance[0][j] = j;

        for (int i = 1; i <= s1.length(); i++)
            for (int j = 1; j <= s2.length(); j++)
                distance[i][j] = minimum(
                        distance[i - 1][j] + 1, //deletion
                        distance[i][j - 1] + 1, //insertion
                        distance[i - 1][j - 1] + ((s1.charAt(i - 1) == s2.charAt(j - 1)) ? 0 :
                                ChceckNeighbour((s1.charAt(i-1)), s2.charAt(j-1)))); //substitution

        return distance[s1.length()][s2.length()];
    }

    public static void main(String[] args) {
        double distance = LevQWERTY("kot", "kita");
        System.out.println(distance);
        Lev x = new Lev("kot", "kita");
        System.out.println(x.LevQWERTY());
    }
}
