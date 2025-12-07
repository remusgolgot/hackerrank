package adventofcode.aoc2025.day2;

/**
 * https://adventofcode.com/2025/day/2
 */
public class Main2 {

    public static void main(String[] args) {

        String t = "11-22,95-115,998-1012,1188511880-1188511890,222220-222224," +
                "1698522-1698528,446443-446449,38593856-38593862,565653-565659," +
                "824824821-824824827,2121212118-2121212124";

        String s = "5542145-5582046,243-401,884211-917063,1174-1665,767028-791710,308275-370459,285243789-285316649,3303028-3361832,793080-871112,82187-123398,7788-14096,21-34,33187450-33443224,2750031-2956556,19974-42168,37655953-37738891,1759-2640,55544-75026,9938140738-9938223673,965895186-966026269,502675-625082,11041548-11204207,1-20,3679-7591,8642243-8776142,40-88,2872703083-2872760877,532-998,211488-230593,3088932-3236371,442734-459620,8484829519-8484873271,5859767462-5859911897,9987328-10008767,656641-673714,262248430-262271846";
        String u = "33187450-33443224";
        String[] ss = s.split(",");

        long l = 0;
        for (int i = 0; i < ss.length; i++) {
            long a = Long.parseLong(ss[i].split("-")[0]);
            long b = Long.parseLong(ss[i].split("-")[1]);
            for (long j = a; j <=b; j++) {
                String string = Long.toString(j);
                if (string.length() % 2 == 0) {
                    long q1 = Integer.parseInt(string.substring(0,string.length()/2));
                    long q2 = Integer.parseInt(string.substring(string.length()/2));
                    if (q1 == q2) {
                        l+= j;
                        System.out.println("two " + j);
                        continue;
                    }
                }
                if (string.length() % 3 == 0) {
                    long q1 = Integer.parseInt(string.substring(0,string.length()/3));
                    long q2 = Integer.parseInt(string.substring(string.length()/3, 2*string.length()/3));
                    long q3 = Integer.parseInt(string.substring(2*string.length()/3));
                    if (q1 == q2 && q2 == q3) {
                        l+= j;
                        System.out.println("three " + j);
                        continue;
                    }
                }
                if (string.length() % 4 == 0) {
                    long q1 = Integer.parseInt(string.substring(0,string.length()/4));
                    long q2 = Integer.parseInt(string.substring(string.length()/4, 2*string.length()/4));
                    long q3 = Integer.parseInt(string.substring(2*string.length()/4, 3*string.length()/4));
                    long q4 = Integer.parseInt(string.substring(3*string.length()/4));
                    if (q1 == q2 && q2 == q3 && q3 == q4) {
                        l+= j;
                        System.out.println("four " + j);
                        continue;
                    }
                }
                if (string.length() % 5 == 0) {
                    long q1 = Integer.parseInt(string.substring(0,string.length()/5));
                    long q2 = Integer.parseInt(string.substring(string.length()/5, 2*string.length()/5));
                    long q3 = Integer.parseInt(string.substring(2*string.length()/5, 3*string.length()/5));
                    long q4 = Integer.parseInt(string.substring(3*string.length()/5, 4*string.length()/5));
                    long q5 = Integer.parseInt(string.substring(4*string.length()/5));
                    if (q1 == q2 && q2 == q3 && q3 == q4 && q4 == q5) {
                        l+= j;
                        System.out.println("five " + j);
                        continue;
                    }
                }

                if (string.length() % 6 == 0) {
                    long q1 = Integer.parseInt(string.substring(0,string.length()/6));
                    long q2 = Integer.parseInt(string.substring(string.length()/6, 2*string.length()/6));
                    long q3 = Integer.parseInt(string.substring(2*string.length()/6, 3*string.length()/6));
                    long q4 = Integer.parseInt(string.substring(3*string.length()/6, 4*string.length()/6));
                    long q5 = Integer.parseInt(string.substring(4*string.length()/6, 5*string.length()/6));
                    long q6 = Integer.parseInt(string.substring(5*string.length()/6));
                    if (q1 == q2 && q2 == q3 && q3 == q4 && q4 == q5 && q5== q6) {
                        l+= j;
                        System.out.println("six " + j);
                        continue;
                    }
                }

                if (string.length() % 7 == 0) {
                    long q1 = Integer.parseInt(string.substring(0,string.length()/7));
                    long q2 = Integer.parseInt(string.substring(string.length()/7, 2*string.length()/7));
                    long q3 = Integer.parseInt(string.substring(2*string.length()/7, 3*string.length()/7));
                    long q4 = Integer.parseInt(string.substring(3*string.length()/7, 4*string.length()/7));
                    long q5 = Integer.parseInt(string.substring(4*string.length()/7, 5*string.length()/7));
                    long q6 = Integer.parseInt(string.substring(5*string.length()/7, 6*string.length()/7));
                    long q7 = Integer.parseInt(string.substring(6*string.length()/7));
                    if (q1 == q2 && q2 == q3 && q3 == q4 && q4 == q5 && q5== q6 && q6 == q7) {
                        l+= j;
                        System.out.println("seven " + j);
                        continue;
                    }
                }

            }
        }
        System.out.println(l);
    }
}
