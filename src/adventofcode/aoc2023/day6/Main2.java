package adventofcode.aoc2023.day6;

import java.math.BigDecimal;

public class Main2 {

    public static void main(String[] args) {
        int time = 35696887;
        BigDecimal bd = new BigDecimal("213116810861248");
        int k = 0;
        for (int j = 0; j <= time; j++) {
            BigDecimal distance = new BigDecimal(j).multiply(new BigDecimal(time - j));
            if (distance.compareTo(bd) > 0) {
                k++;
            }
        }
        System.out.println(k);

    }

}
