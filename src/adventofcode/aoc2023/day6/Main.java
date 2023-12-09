package adventofcode.aoc2023.day6;

public class Main {

    public static void main(String[] args) {
        int[] times0 = new int[]{7, 15, 30};
        int[] distances0 = new int[]{9, 40, 200};

        int[] times = new int[]{35, 69, 68, 87};
        int[] distances = new int[]{213, 1168, 1086, 1248};
        int sol = 1;

        for (int i = 0; i < times.length; i++) {
            int k = 0;
            for (int j = 0; j <= times[i]; j++) {
                int distance = j * (times[i] - j);
                if (distance > distances[i]) {
                    k++;
                }
            }
            System.out.println(k);
            sol *= k;
        }
        System.out.println(sol);

    }

}
