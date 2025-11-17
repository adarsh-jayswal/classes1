package Assignment2_Backtracking;

import java.util.*;

public class LetterTilePossibilities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter tiles string: ");
        String tiles = sc.nextLine();
        LetterTilePossibilities obj = new LetterTilePossibilities();
        int result = obj.numTilePossibilities(tiles);
        System.out.println("Total possible sequences: " + result);
    }
    public int numTilePossibilities(String tiles) {
        int[] freq = new int[26];
        for (char c : tiles.toCharArray()) freq[c - 'A']++;
        return backtrack(freq);
    }
    private int backtrack(int[] freq) {
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) continue;
            count++;
            freq[i]--;
            count += backtrack(freq);
            freq[i]++;
        }
        return count;
    }
}

