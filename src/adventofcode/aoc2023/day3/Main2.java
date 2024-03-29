package adventofcode.aoc2023.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {

    static class Number {
        int value;
        int x;
        int y;

        public Number(int value, int x, int y) {
            this.value = value;
            this.x = x;
            this.y = y;
        }
    }

    static class SChar {
        int x;
        int y;
        List<Number> neighs;

        public SChar(int x, int y) {
            this.x = x;
            this.y = y;
            neighs = new ArrayList<>();
        }

        @Override
        public String toString() {
            return "SChar{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    static String s = "467..114..\n" +
            "...*......\n" +
            "..35..633.\n" +
            "......#...\n" +
            "617*......\n" +
            ".....+.58.\n" +
            "..592.....\n" +
            "......755.\n" +
            "...$.*....\n" +
            ".664.598..";

    static String sz = ".......12.......935............184.720...243........589.652..........435..........483.............6...........................904...........\n" +
            "......*.....968*.....$............*........=..348...*..........986....*...................459....*........422................#......%482....\n" +
            "....291............612....290..........903........699......218*.......376............890....*.838...81......*.....138.../194................\n" +
            "..............156......$..*...891.&731....%..89...................523..........699....+...227......*.......225....=...........388....*......\n" +
            "................*...189..591.*................*.......783.....107..-...54.287..$................533.../..............909........&.603.424...\n" +
            "...229*952.....938............470.555.......746...28.....+...*.........................................279..826..788*.......................\n" +
            "...................................*...............@.........867.-....102..845...542.779.....................*........182.166...511.........\n" +
            "563.727.....282....237..171.......892...183.......................989....*..........*................$....709...8*974.=...%.....*.....873...\n" +
            "....#..........+...*.......*..........................&......129+......491...................877....715.......................270.......#...\n" +
            ".................53.....781...&295....@773.336......547................................45......*.............=800.....*359..................\n" +
            "...342*468....&.....573....................*.................................%850............*..465................192.....*.......&115.....\n" +
            "............988.......*...731.............789.673....*256..............677..................621...........#....716......910..297........22..\n" +
            "204&....69............905...=.....641.472.......#.524............127....*..714.........*62..........622..324..&.................*...........\n" +
            "..........*........................+....@.................812......*..955.....*.....257....../.................../..............545.........\n" +
            "........668....91..&.........840......+..............566.....+...66.........660..............469.................525...765...........25.....\n" +
            "...............$...666.979..*........952...122......%............................71......=39...../94.........................132......*.....\n" +
            "......@.................../.460..#.......=.=..........146..625........214.........#.278................667..........386.......-....936......\n" +
            "....643.......@..................974...464...........*.....*...........*.............%.....$...........=...=..%995...*......................\n" +
            "........./...577...-....3.../186.................*.995.....678.&.......882...559...........374.......&...554.........428.......725....*.....\n" +
            ".......96........678....%.....................529..............374...........*......924........=277..606..................#...#......8.257..\n" +
            "...609....................397.......475...................651.......856......697.&.....&..=...................486........888................\n" +
            "............-................*..................756...399....*..42................866....287.....#......515...*......................137....\n" +
            ".....285..947....#..........997......=.....665..*......*..420...*.....-..268*457.............=63..758.....+..623.............+../...........\n" +
            "..............458.....422.......338...827...+..462....797.....26....523..........*.880*.............................&.....934..157..........\n" +
            ".......149........409....$................................................868.378......144..149............356.....872..............871.533.\n" +
            "....22...*..........$........7.......149....979......................826.&.....................@........-.....*275.....................*....\n" +
            "........518.773*.........10..$..........*........805..812.972......................123......*............98.........=........./609.682......\n" +
            ".................5........./............349........$.....*..................786....*.......160..903...40.............209...............*....\n" +
            ".......*.....................................497...........#.............../.....153.795............./.........&806..........839....419.337.\n" +
            "78...582............675................145.........405....77..361............952.......*..../741....................624..527*...............\n" +
            "...................../../....=.....+....&.............*51.....*..........733*.........728.........173....834.....76.........................\n" +
            "................878....276..792.....372....................385..179.............@610.............................%........146=..............\n" +
            "..........522.....*...........................-....30....-........*.@................110=..+.......197.....643.................762......%...\n" +
            "......%....*...173.............420..407......261.........687.806.12..104.....914..........685.233.&.......*.....549...=...........*......591\n" +
            ".....837..135.......313...579....%.=.....613................../..........729.........257#.....&.........430.399*.....157.........970........\n" +
            "...................*.....*.....*......@.....*............../....566........+.....................*906....................%..................\n" +
            "....459.78$.775.768..62...345.537......122.803.142*758...148...*....992................711....316.........#...............521.298*590..289..\n" +
            "....*.................#.........................................444............382.....*...@...............753.......927................/...\n" +
            ".....592..735......+.............634.......652.....853....690................./.......874.846.35.....884.........182.-......................\n" +
            ".419........*.839.157.......795...................*.......*...........928........................756....*64......*.....*19.....309..........\n" +
            ".........716...*.......591....*....358$.#378.............623...............687.........-816......*............292...110....&....*......643..\n" +
            "..134...........910......*.941.......................................547=....*....................490....938+..............422.482..........\n" +
            "...*..331....$..........80.................#346....180...........737.........76.......992@...91......................../....................\n" +
            "...16....$.140.464*831.....933.917....303............*......%.....*....336........339.......*.............@..939....583....*564.........864.\n" +
            "..............................*........=...+54.....449......209.912.....+.....615..%.....605............960..*..........219.................\n" +
            ".........@442.....730..................................413...........................26.....................944..336........188......./.....\n" +
            "...190............#...@...524.544....968*.............*........466...222...536...843.@..........=.....32...........$..........-.......410...\n" +
            "......*..80@..491....232..-......*.......16........402......27..*...*.....*...................480....*........&........894..................\n" +
            ".....218.........*.............=..819......................*........857...896...........677........689........638...45*.....993.............\n" +
            "................754...........434.........622.338...........607....................&......&.%213...........................-................\n" +
            "........+.894......................681.......*.........484.........963.498...*..538.............................................346.........\n" +
            ".....802.....*162....752...........................................*........520...........229.2.586..513..............25=.746........782*423\n" +
            "...............................@...307#.497....551..996..696....879...911................%......................277*........................\n" +
            "....*157.....137....#.........621.........*...#.....*...#............*............527......9........./..............844.....@224....304.....\n" +
            ".541............*.649.............412.....744......560..............404.....240.......986*.@.......346.....@..........................+.....\n" +
            "......268....764.................%.......................902....856.......*....*..........................242.....842.....#.................\n" +
            "........&...............514..38..........+..=...........@..............715.142..587.......307.................731...*...954....878*.........\n" +
            "............................*.....349....76.92....612.....376.......................257...$...................../.968..............765......\n" +
            "........960*414........713.501......&............%.......*......*941............................#........415...........937%.................\n" +
            "....967............409..*......605......................375..771........599*884.................880.........*...127..$.................$513.\n" +
            ".....*................*..171..*.....@.......507.895..................*.................636...........768...114....-..292.......-...223......\n" +
            "...807...977.......218.......753...47.......*......*..............507.90....../725.......*.........+...@.....................755......*.....\n" +
            "............*478.............................542....676...............................673........974.....@....*170....261..............134..\n" +
            "800...............532............................15............%...445..102.............../510.........625.279..........-.....*.............\n" +
            ".......................654.....850.405......................395.....-.......467....477...........973............../........191........398...\n" +
            ".925...793...423*.........@..........................................................=.659..........*.....817.....230...........653..-......\n" +
            ".......*.........52...........764$....273...................@........430....................................*...........669.....-.......71..\n" +
            ".435....804..177....990.838.........#..-...475...297..337..360.........*....914.............................833.............................\n" +
            "....*.......*.........*...*.......281......&......*..+.............328..746......=215.......359....295.....................#481......868....\n" +
            "..967........936.689%.785..515...............*64.827........................761.........+....&.......+..............................*....637\n" +
            "....../.+265..............................562...............235........585..*...........793........=...838.147....284.902..301*330..........\n" +
            "....579.........................21%..327................481..*...469%..*.....297.704..............797.....*...........*.................#...\n" +
            "......................638............*...................*....81.......780.........*...../...282....................907.882.781.......797...\n" +
            "..........671....608.................295.................302......953............171..919.......*........................*...*......#.......\n" +
            "............*....*....251.....191........#............*..........................................999.....451....+....286.415.581....274.....\n" +
            "..245$.....217...649.-....................898......950..................495*497.......53*............@...........398..-.....................\n" +
            "...........................942.......323...............+.....623.........................804.......875........................#.............\n" +
            ".....42..543.................*..320....*..918....314....145...........603......991$.921.......261......................762...187.....951*638\n" +
            ".....*..#........53........374........756...........*.........-.......................*........../..217*550..............*..................\n" +
            "....217..........*................................743......703....368...$861..4*966.415..703................................*959........*344\n" +
            "...........626...31...602.................700..........696........*.....................*......396..........591.......*124..................\n" +
            "..135........@................................699.139.....*.662....46........=797......144.....#...*289......*.....840............-...102.44\n" +
            "................909.......180.............100.*....#...574..*............52...................................451............764.517....*...\n" +
            "........701*..........127*............117../...787...........67.....903..........273....*900................................=..........112..\n" +
            "............430............423.67.......*..............*572...........@...199.........94..........686.....679.....................921*......\n" +
            ".542*119...............396....*.......938...........250......888..........*.....978...................25..../.........306.............780...\n" +
            "...............251........*.....................238......................340....+..............112....*........120...*....24................\n" +
            ".223.....549......-..98..60..775..28*105...........*.436..951.599.................309*682.......*..937...158.....*....697.*......764..$.....\n" +
            ".....788............#....................768.....266........*..%..............................779........*.......542.......148...*....529...\n" +
            "....*......310.............412.......23.+....289..........560............249+.204..606*................271...805.......394.......898........\n" +
            "....919.......&...867.......*........*......%.........592............166.........*.....460.........369..........*........*..................\n" +
            ".........920.......*.....233.....732..500.....950.....*.......514...........110..961..................*309.....450..#...521.................\n" +
            ".................753...............*............#...965..............................852...841....%........524.....981............653.......\n" +
            "...........858...........*..234..922........65..................991.........-839.800....*......869...836..$.............675..789...*....505.\n" +
            "..........*.............516...*..................774.....&.149.=.................*.......737.........*......402....%.......*....#..762......\n" +
            "........780.........4.........116.....................976..-...........%........791..................300.....%....338.471...................\n" +
            "...................*.................480*160..3..............*727.....363................................................................167\n" +
            "...........743.....721.......................*..........808...............942...........339.289.............$............416.....$..........\n" +
            "..955...................606*623.............718...503....*...................*245..........*........531.....686......250..../....275........\n" +
            ".............@....................110...............*...309..#....&......210..........386.................%...........*........+........391.\n" +
            ".....444.....743......519..691......*.......-824......+......759.617....*.......710..*.....814.........356.........464.......709............\n" +
            "......*..746......247.....*......596..999.............907.............296.-..../.......760.+.................$.890.......................669\n" +
            "...479.....*.........*.......561.....+..........*178......................977....266...*.....640..........607.....*.....%...........545.....\n" +
            "........395...=......361........*372.........655..........398...203..11................147..*......../.............196..499........*........\n" +
            "..561........646......................*898.......175.570.....$.....#...*..135..............633..314...871......898..........891...90.....780\n" +
            ".......*91........405..............627..............*....736.........760.....*........=..........*...........%....*..........*..............\n" +
            "....722...........*......................................*.................744.698.367..-........767..........236.692.......308.............\n" +
            "...............740........./............906......*593...977.......645............*......167.............................................*...\n" +
            "........+...............123...................281....................*...543......461........................175.....................381.319\n" +
            ".282...814......771*........920.......................@............473....*...............&....872...../401.....*......=......18............\n" +
            "....*.........%......993...*...........................256..223...........242....977.......293.-...............550.....435..................\n" +
            "....23.........960........307....$.....504.638*656...............&...................203.............33.$430..................731...........\n" +
            "................................885......*................398....763...........805.....=....338.......*......146*916..................513...\n" +
            "..20...............42....................828.............../...................*............$.........531............159*761......78........\n" +
            "......805-...-..........598...........#.............351........34.........682..516.534..............*........&..........................283.\n" +
            "..............664....../.......255..887.....258......%.........*.........*............*.....226..931.91......128............................\n" +
            "...557.938#.......75.....585..*...............*.194......#..686........786..........755.......&..........637..............988.......275.....\n" +
            "....*............%....35...*.141...........508.....*865.967..............................80*............./.....978....790*.....@...*........\n" +
            ".662..................*..............@939...........................204........484....34....99.............@.................350.54.........\n" +
            "............358....832..=......................%......307.95........*......654...*......&.........734.....491...50...924.385................\n" +
            "............*............340................483.........-.*.......118..794*.....431...........783..*..............-......*.........&594.#...\n" +
            "..........338........=.............$.................*....94....................................*...546.....$.......187..593.768........282.\n" +
            "...............796.380.183....+.564..94.144.........138..............394.392.....971.......#928.447........275..57...*.......&..............\n" +
            "...........233...*.......%...40........*........................945.....*.........-.................%.............=.438...........*......906\n" +
            ".....881.../...491...903..........918.....303......................*........578*...................807......597................681.539......\n" +
            "......*.................*.463.467*....246.......577.....198.....245.....967.....988.&.........759.......=...*.........-889..................\n" +
            "......462..978........664...%...........*.-731.../.....&....375.............#.......217........@........381.250...219......947..............\n" +
            "..........&..........................252.......%.............*..............258............427...137...............@........@....-175.......\n" +
            "....864...................461..................234.......69.222........*...........411....=............651...#..............................\n" +
            "....*......243...............*283...................777-..*..........92.761..581%.*.....................$.....258..867..876.................\n" +
            ".916......%.........629.................911*238...........680...239................672.............137@...469.........*.......737...@.......\n" +
            "..............764....*........894/..289...........944..........#...........@....%........../876..........*.........687.........*....436.....\n" +
            "......442.255.....442..903.............*.....*493..../......................338..346...................927..............764.....536.........\n" +
            ".........*.....*........*.....869*888.597.241..................11-....542#...........412*..................235..............................\n" +
            ".804.329......344....195...94.......................................*....................880......44.622.........342.18...............417...\n" +
            "....*.....=................+.........76..328.....803.....658.....254.............327..........340......*.............@......................\n" +
            "...........254........../...........*...*...........*234...%..........20.....238...*..........*.........380......&......78.246%...598.......\n" +
            ".96....990.........%..718...%....869.......596....*......................423.....433..93.....613....$.............905...=........*.....497..\n" +
            "...*....*........=.86.....499..............*...385.296...................*...........*...............523.$.....................529...$.*....\n" +
            "...780.685.....822....................560.35.............................529......780.....................453......................711..930.\n";

    public static void main(String[] args) {
        String ss[] = sz.split("\n");
        List<Number> numbers = new ArrayList<>();
        List<SChar> sChars = new ArrayList<>();
        List<SChar> gears = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < ss.length; i++) {
            for (int j = 0; j < ss[i].length(); j++) {
                if (isGear(ss[i].charAt(j))) {
                    gears.add(new SChar(i, j));
                }
            }
        }

        for (int i = 0; i < ss.length; i++) {
            for (int j = 0; j < ss[i].length(); j++) {
                if (isSpecialChar(ss[i].charAt(j))) {
                    sChars.add(new SChar(i, j));
                }
            }
        }

        for (int i = 0; i < ss.length; i++) {
            int currentPossibleNumber = 0;
            int startY = 0;
            boolean toAdd = false;
            for (int j = 0; j < ss[i].length(); j++) {
                if (ss[i].charAt(j) == '.') {
                    if (currentPossibleNumber > 0 && toAdd) {
                        numbers.add(new Number(currentPossibleNumber, i, startY));
                    }
                    currentPossibleNumber = 0;
                    toAdd = false;
                    continue;
                }
                if (isSpecialChar(ss[i].charAt(j))) {
                    if (currentPossibleNumber > 0 && toAdd) {
                        numbers.add(new Number(currentPossibleNumber, i, startY));
                    }
                    toAdd = false;
                    currentPossibleNumber = 0;
                } else {
                    if (currentPossibleNumber == 0) {
                        startY = j;
                    }
                    currentPossibleNumber = currentPossibleNumber * 10 + Integer.parseInt(String.valueOf(ss[i].charAt(j)));
                    if (testNeighbor(i, j, sChars)) {
                        toAdd = true;
                    }
                }
            }
            if (currentPossibleNumber > 0 && toAdd) {
                numbers.add(new Number(currentPossibleNumber, i, startY));
            }
        }

//        System.out.println(gears.size());
//        System.out.println(numbers.size());
        for (Number nr : numbers) {
            int n = nr.value;
            int q = 0;
            while (n > 0) {
                n = n / 10;
                q++;
            }
            for (SChar gear : gears) {
                for (int i = 0; i < q; i++) {
                    if (testNeighbor(nr.x, nr.y + i, Collections.singletonList(gear))) {
                        gear.neighs.add(nr);
                        System.out.println(nr.value);
                        break;
                    }
                }
            }
        }
        for (SChar gear : gears) {
            int k = 0;
            if (gear.neighs.size() > 1) {
                k = 1;
                for (int i = 0; i < gear.neighs.size(); i++) {
                    k = k * gear.neighs.get(i).value;
                }
            }
            sum += k;
        }
        System.out.println(sum);
    }

    private static boolean testNeighbor(int i, int j, List<SChar> sChars) {
        for (SChar ch : sChars) {
            if (ch.x == i && ch.y == j - 1) {
                return true;
            }
            if (ch.x == i && ch.y == j + 1) {
                return true;
            }
            if (ch.x == i - 1 && ch.y == j) {
                return true;
            }
            if (ch.x == i + 1 && ch.y == j) {
                return true;
            }
            if (ch.x == i - 1 && ch.y == j - 1) {
                return true;
            }
            if (ch.x == i + 1 && ch.y == j - 1) {
                return true;
            }
            if (ch.x == i - 1 && ch.y == j + 1) {
                return true;
            }
            if (ch.x == i + 1 && ch.y == j + 1) {
                return true;
            }
        }
        return false;
    }

    private static boolean isGear(char charAt) {
        return charAt == '*';
    }

    private static boolean isNumber(char charAt) {
        return charAt == '0' || charAt == '1' || charAt == '2' || charAt == '3' || charAt == '4' || charAt == '5' ||
                charAt == '6' || charAt == '7' || charAt == '8' || charAt == '9';
    }

    private static boolean isSpecialChar(char charAt) {
        return charAt == '$' || charAt == '*' || charAt == '+' || charAt == '#' || charAt == '@' ||
                charAt == '%' || charAt == '&' || charAt == '=' || charAt == '-' || charAt == '/';
    }
}
