// https://adventofcode.com/2020/day/1

import java.io.*;
import java.util.Arrays;

public class DayOne {
    public static void main(String args[]) throws IOException {
        DayOne boop = new DayOne();
        int womp = boop.getMultiple();
        System.out.println(womp);
    }

    // TODO: NEED TO READ FROM FILE
    public int getMultiple() throws IOException {
        // FileReader reader = new FileReader("day-one-data.txt");
        int[] values = new int[200];

        Arrays.sort(values);
        
        int result = 0;
        for (int i = values.length - 1; i >= 0; i--) {
            int num = 2020 - values[i];
            for (int j = 0; j < i; j++) {
                if (values[j] > num) {
                    break;
                } else if (values[j] < num) {
                    continue;
                } else if (values[j] == num) {
                    result = values[i] * values[j];
                }
            }
        }
        return result;
    }
}