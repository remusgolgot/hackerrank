package adventofcode.aoc2023.day5;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main2 {

    static class Entry {
        BigDecimal source;
        BigDecimal destination;
        BigDecimal length;

        public Entry(BigDecimal source, BigDecimal destination, BigDecimal length) {
            this.source = source;
            this.destination = destination;
            this.length = length;
        }
    }

    static String s = "seeds: 79 14 55 13\n" +
            "seed-to-soil map:\n" +
            "50 98 2\n" +
            "52 50 48\n" +
            "soil-to-fertilizer map:\n" +
            "0 15 37\n" +
            "37 52 2\n" +
            "39 0 15\n" +
            "fertilizer-to-water map:\n" +
            "49 53 8\n" +
            "0 11 42\n" +
            "42 0 7\n" +
            "57 7 4\n" +
            "water-to-light map:\n" +
            "88 18 7\n" +
            "18 25 70\n" +
            "light-to-temperature map:\n" +
            "45 77 23\n" +
            "81 45 19\n" +
            "68 64 13\n" +
            "temperature-to-humidity map:\n" +
            "0 69 1\n" +
            "1 0 69\n" +
            "humidity-to-location map:\n" +
            "60 56 37\n" +
            "56 93 4";

    // takes 40+ minutes to run(LOL)

    static String sz = "seeds: 2880930400 17599561 549922357 200746426 1378552684 43534336 155057073 56546377 824205101 378503603 1678376802 130912435 2685513694 137778160 2492361384 188575752 3139914842 1092214826 2989476473 58874625\n" +
            "\n" +
            "seed-to-soil map:\n" +
            "341680072 47360832 98093750\n" +
            "1677587229 1836834678 160297919\n" +
            "1122651749 4014790961 280176335\n" +
            "2279929873 2689269992 53644948\n" +
            "3916120104 1199400457 172302726\n" +
            "0 381576527 58197295\n" +
            "1402828084 3450816018 274759145\n" +
            "3909949227 2540063154 6170877\n" +
            "802918801 2384227172 155835982\n" +
            "4088422830 3244271552 206544466\n" +
            "958754783 1997132597 28874650\n" +
            "58197295 306349987 75226540\n" +
            "180784667 145454582 160895405\n" +
            "2334903647 1543332738 293501940\n" +
            "3699983017 2997982209 25342830\n" +
            "2333574821 2687941166 1328826\n" +
            "3111317969 1371703183 171629555\n" +
            "2806959198 2135774873 248452299\n" +
            "2766721604 717118138 40237594\n" +
            "3055411497 2632034694 55906472\n" +
            "2628405587 3023325039 138316017\n" +
            "1837885148 757355732 442044725\n" +
            "3725325847 2813358829 184623380\n" +
            "3353391413 2026007247 109767626\n" +
            "987629433 3962399141 10015813\n" +
            "717118138 2546234031 85800663\n" +
            "3282947524 2742914940 70443889\n" +
            "1080275742 3972414954 42376007\n" +
            "133423835 0 47360832\n" +
            "3463159039 3725575163 236823978\n" +
            "997645246 3161641056 82630496\n" +
            "soil-to-fertilizer map:\n" +
            "303672059 1087423328 103502353\n" +
            "171922589 2907629744 91556518\n" +
            "2064217168 468859004 91214014\n" +
            "1129888530 1046445685 40977643\n" +
            "3698610046 4215442249 79525047\n" +
            "1045870106 1586657152 41455160\n" +
            "1170866173 1322928302 17679660\n" +
            "4160148003 3332238470 107558461\n" +
            "4267706464 3853049576 27260832\n" +
            "0 3007612896 90771201\n" +
            "3447204990 3880310408 249339913\n" +
            "1189561657 1438888401 43309463\n" +
            "4019710828 3219712242 104981462\n" +
            "2226263856 2187322171 114088350\n" +
            "553216166 1847338068 182148047\n" +
            "3217647099 3439796931 229557891\n" +
            "2832115692 1482197864 23307900\n" +
            "867366834 94995931 178503272\n" +
            "1969221237 0 94995931\n" +
            "3785679859 3704810535 148239041\n" +
            "1095751900 2693816297 34136630\n" +
            "4124692290 3669354822 35455713\n" +
            "454935727 1340607962 98280439\n" +
            "2204466075 1628112312 21797781\n" +
            "1947833351 2164918461 21387886\n" +
            "2634687717 1649910093 197427975\n" +
            "263479107 2850768768 40192952\n" +
            "3696544903 3217647099 2065143\n" +
            "735364213 1190925681 132002621\n" +
            "3050783393 2337205982 47600704\n" +
            "1087325266 2999186262 8426634\n" +
            "3778135093 3324693704 7544766\n" +
            "2855423592 273499203 195359801\n" +
            "90771201 1505505764 81151388\n" +
            "2340352206 560073018 290906919\n" +
            "1531641800 939263745 107181940\n" +
            "1188545833 2186306347 1015824\n" +
            "1355686961 850979937 88283808\n" +
            "1492181516 2029486115 39460284\n" +
            "1638823740 2384806686 309009611\n" +
            "2155431182 2894390312 13239432\n" +
            "1443970769 2068946399 48210747\n" +
            "1232871120 2727952927 122815841\n" +
            "3933918900 4129650321 85791928\n" +
            "2631259125 2890961720 3428592\n" +
            "407174412 2117157146 47761315\n" +
            "2168670614 2301410521 35795461\n" +
            "fertilizer-to-water map:\n" +
            "4253126168 3603943470 41841128\n" +
            "3150812716 3873122781 161556325\n" +
            "4132148538 3445929121 16652907\n" +
            "4071215062 2557593856 10373731\n" +
            "3585414898 2401284809 61555959\n" +
            "124617758 989226185 56063423\n" +
            "1311995731 916233018 72993167\n" +
            "180681181 891200267 25032751\n" +
            "1577315548 1448436684 231921083\n" +
            "69948934 1391916079 39397864\n" +
            "2730663795 3577458422 26485048\n" +
            "2453473122 3255362867 102306532\n" +
            "4148801445 3801350502 12292818\n" +
            "3002725397 3107275548 148087319\n" +
            "3525935437 3813643320 59479461\n" +
            "3982955340 3357669399 88259722\n" +
            "2631712351 2567967587 98951444\n" +
            "628324302 2038793089 109830184\n" +
            "3427245435 3721480891 3936914\n" +
            "796140554 1045289608 36965524\n" +
            "939693576 1140241200 24301167\n" +
            "205713932 1680357767 358435322\n" +
            "4161094263 2666919031 92031905\n" +
            "1103981621 0 206162329\n" +
            "1809236631 761213122 129987145\n" +
            "1310143950 1431313943 1851781\n" +
            "4081588793 3056715803 50559745\n" +
            "738154486 1082255132 57986068\n" +
            "564149254 206162329 64175048\n" +
            "3722667150 4034679106 260288190\n" +
            "3431182349 2462840768 94753088\n" +
            "109346798 1433165724 15270960\n" +
            "2757148843 2811139249 245576554\n" +
            "1044349135 2294919620 59632486\n" +
            "833106078 270337377 106587498\n" +
            "3646970857 3645784598 75696293\n" +
            "0 2354552106 4006979\n" +
            "1974270838 376924875 384288247\n" +
            "3312369041 3462582028 114876394\n" +
            "2401284809 2758950936 52188313\n" +
            "1384988898 1199589429 192326650\n" +
            "963994743 2214565228 80354392\n" +
            "1939223776 1164542367 35047062\n" +
            "4006979 2148623273 65941955\n" +
            "2555779654 3725417805 75932697\n" +
            "water-to-light map:\n" +
            "1553071310 2767299260 81555093\n" +
            "1638385137 3758734 7165416\n" +
            "3923895602 3742459208 355646104\n" +
            "2563492152 40550035 317968\n" +
            "357175543 151852464 53516575\n" +
            "756535305 2730597762 36701498\n" +
            "1142337672 1915537677 164067723\n" +
            "436470886 2848854353 61956232\n" +
            "1316538987 1679005354 102639946\n" +
            "609765571 2079605400 146769734\n" +
            "1306405395 2660382036 10133592\n" +
            "3817572860 3406157555 106322742\n" +
            "2023184953 353497588 62195869\n" +
            "3531543848 4223491605 71475691\n" +
            "410692118 126073696 25778768\n" +
            "4279541706 3727562743 14896465\n" +
            "2903607795 1495097536 74179449\n" +
            "1794747312 2279656479 95385933\n" +
            "2783150325 2269091374 10565105\n" +
            "3406157555 4098105312 125386293\n" +
            "2145462956 205369039 148128549\n" +
            "2833741244 2401175172 69866551\n" +
            "793236803 685594104 306384629\n" +
            "1645550553 2511185277 149196759\n" +
            "1419178933 1781645300 133892377\n" +
            "1634626403 0 3758734\n" +
            "3274934245 2471041723 36449164\n" +
            "0 1097896179 357175543\n" +
            "2563810120 991978733 105917446\n" +
            "4294438171 3727033618 529125\n" +
            "2688189328 1569276985 94960997\n" +
            "2669727566 2507490887 3694390\n" +
            "3311383409 10924150 29625885\n" +
            "1099621432 2226375134 42716240\n" +
            "1890133245 2910810585 133051708\n" +
            "583632811 2375042412 26132760\n" +
            "498427118 40868003 85205693\n" +
            "2293591505 415693457 269900647\n" +
            "2673421956 1664237982 14767372\n" +
            "2085380822 2670515628 60082134\n" +
            "3603019539 3512480297 214553321\n" +
            "2977787244 3043862293 297147001\n" +
            "2793715430 1455071722 40025814\n" +
            "light-to-temperature map:\n" +
            "3752181853 3850028427 61847460\n" +
            "3392702182 4061054452 68370555\n" +
            "3610251302 4129425007 141930551\n" +
            "2019529001 2633762146 55812503\n" +
            "1423059901 2612524947 21237199\n" +
            "1637625157 3160312690 128493598\n" +
            "2109055159 2018596226 368399035\n" +
            "343891384 811352094 920120231\n" +
            "154347384 2422980947 189544000\n" +
            "2075341504 1978947609 33713655\n" +
            "1444297100 2966984633 193328057\n" +
            "35985686 2689574649 118361698\n" +
            "2477454194 0 811352094\n" +
            "1772053717 1854798742 124148867\n" +
            "1264011615 2807936347 159048286\n" +
            "0 2386995261 35985686\n" +
            "1766118755 2012661264 5934962\n" +
            "3814029313 3392702182 457326245\n" +
            "3461072737 3911875887 149178565\n" +
            "1896202584 1731472325 123326417\n" +
            "temperature-to-humidity map:\n" +
            "3344602117 2991074372 262457649\n" +
            "1707309180 3911386116 383581180\n" +
            "3778482785 2130995124 374719434\n" +
            "3607059766 3253532021 171423019\n" +
            "584508486 478912361 161371970\n" +
            "1578590582 2505714558 128718598\n" +
            "3294145751 1806488186 50456366\n" +
            "1143023241 2829557603 161516769\n" +
            "1304540010 1856944552 274050572\n" +
            "2090890360 3424955040 344665999\n" +
            "2435556359 1143023241 663464945\n" +
            "496214964 1000471163 88293522\n" +
            "0 640284331 360186832\n" +
            "3099021304 2634433156 195124447\n" +
            "360186832 342884229 136028132\n" +
            "745880456 0 342884229\n" +
            "4153202219 3769621039 141765077\n" +
            "humidity-to-location map:\n" +
            "3114211644 984440400 35385940\n" +
            "3530465412 479339778 128291026\n" +
            "0 3699707734 285474938\n" +
            "2898087648 3606829306 92878428\n" +
            "2762235329 607630804 135852319\n" +
            "4210792153 4197161772 84175143\n" +
            "3149597584 31394121 380867828\n" +
            "1848709689 0 31394121\n" +
            "1880103810 412261949 67077829\n" +
            "285474938 1579019790 1563234751\n" +
            "2990966076 3566305423 40523883\n" +
            "2434079297 1019826340 328156032\n" +
            "2371232521 3985182672 62846776\n" +
            "1947181639 3142254541 424050882\n" +
            "3899713715 1347982372 148315733\n" +
            "3031489959 1496298105 82721685\n" +
            "4197161772 4281336915 13630381\n" +
            "3658756438 743483123 240957277\n";

    public static void main(String[] args) {
        String[] ss = sz.split("\n");
        String seedsString = "";
        List<Entry> seedToSoilMap = new ArrayList<>();
        List<Entry> soilToFertilizerMap = new ArrayList<>();
        List<Entry> fertilizerToWaterMap = new ArrayList<>();
        List<Entry> waterToLightMap = new ArrayList<>();
        List<Entry> lightToTemperatureMap = new ArrayList<>();
        List<Entry> temperatureToHumidityMap = new ArrayList<>();
        List<Entry> humidityToLocationMap = new ArrayList<>();

        int i = 0;
        while (i < ss.length) {
            if (ss[i].startsWith("seeds:")) {
                seedsString = ss[i].split("seeds: ")[1];
            }
            if (ss[i].startsWith("seed-to-soil map:")) {
                i++;
                while (!ss[i].startsWith("soil-to-fertilizer map:")) {
                    String[] t = ss[i].split(" ");
                    seedToSoilMap.add(new Entry(new BigDecimal(t[1]), new BigDecimal(t[0]), new BigDecimal(t[2])));
                    i++;
                }
            }
            if (ss[i].startsWith("soil-to-fertilizer map:")) {
                i++;
                while (!ss[i].startsWith("fertilizer-to-water map:")) {
                    String[] t = ss[i].split(" ");
                    soilToFertilizerMap.add(new Entry(new BigDecimal(t[1]), new BigDecimal(t[0]), new BigDecimal(t[2])));
                    i++;
                }
            }
            if (ss[i].startsWith("fertilizer-to-water map:")) {
                i++;
                while (!ss[i].startsWith("water-to-light map:")) {
                    String[] t = ss[i].split(" ");
                    fertilizerToWaterMap.add(new Entry(new BigDecimal(t[1]), new BigDecimal(t[0]), new BigDecimal(t[2])));
                    i++;
                }
            }
            if (ss[i].startsWith("water-to-light map:")) {
                i++;
                while (!ss[i].startsWith("light-to-temperature map:")) {
                    String[] t = ss[i].split(" ");
                    waterToLightMap.add(new Entry(new BigDecimal(t[1]), new BigDecimal(t[0]), new BigDecimal(t[2])));
                    i++;
                }
            }
            if (ss[i].startsWith("light-to-temperature map:")) {
                i++;
                while (!ss[i].startsWith("temperature-to-humidity map:")) {
                    String[] t = ss[i].split(" ");
                    lightToTemperatureMap.add(new Entry(new BigDecimal(t[1]), new BigDecimal(t[0]), new BigDecimal(t[2])));
                    i++;
                }
            }
            if (ss[i].startsWith("temperature-to-humidity map:")) {
                i++;
                while (!ss[i].startsWith("humidity-to-location map:")) {
                    String[] t = ss[i].split(" ");
                    temperatureToHumidityMap.add(new Entry(new BigDecimal(t[1]), new BigDecimal(t[0]), new BigDecimal(t[2])));
                    i++;
                }
            }
            if (ss[i].startsWith("humidity-to-location map:")) {
                i++;
                while (i < ss.length) {
                    String[] t = ss[i].split(" ");
                    humidityToLocationMap.add(new Entry(new BigDecimal(t[1]), new BigDecimal(t[0]), new BigDecimal(t[2])));
                    i++;
                }
            }
            i++;
        }
        String[] seeds = seedsString.split(" ");
        System.out.println("here");
        BigDecimal minLoc = new BigDecimal("9999999999");
        for (int j = 0; j < seeds.length; j+=2) {
            System.out.println("seedz");
            BigDecimal len = new BigDecimal(seeds[j + 1]);
            BigDecimal k = new BigDecimal("0");
            while (k.compareTo(len) < 0) {
                BigDecimal value = new BigDecimal(seeds[j]).add(k);
                BigDecimal soil = getNext(seedToSoilMap, value);
                BigDecimal fert = getNext(soilToFertilizerMap, soil);
                BigDecimal water = getNext(fertilizerToWaterMap, fert);
                BigDecimal light = getNext(waterToLightMap, water);
                BigDecimal temp = getNext(lightToTemperatureMap, light);
                BigDecimal humi = getNext(temperatureToHumidityMap, temp);
                BigDecimal loc = getNext(humidityToLocationMap, humi);
                if (minLoc.compareTo(loc) > 0) {
                    minLoc = loc;
                }
                k = k.add(new BigDecimal(1));
            }
        }
        System.out.println(minLoc);
    }

    private static BigDecimal getNext(List<Entry> list, BigDecimal value) {
        for (int i = list.size() - 1; i >= 0; i--) {
            BigDecimal destination = list.get(i).destination;
            BigDecimal source = list.get(i).source;
            BigDecimal length = list.get(i).length;
            if (value.compareTo(source) >= 0 && value.compareTo(source.add(length)) < 0) {
                return destination.add(value.subtract(source));
            }
        }
        return value;
    }

    private static BigDecimal getNext(List<Entry> list, BigDecimal v, BigDecimal len) {
        BigDecimal toReturn = new BigDecimal("9999999999");
        BigDecimal k = new BigDecimal("0");
        while (k.compareTo(len) < 0) {
            BigDecimal value = v.add(k);
            for (int i = list.size() - 1; i >= 0; i--) {
                BigDecimal destination = list.get(i).destination;
                BigDecimal source = list.get(i).source;
                BigDecimal length = list.get(i).length;
                if (value.compareTo(source) >= 0 && value.compareTo(source.add(length)) < 0) {
                    BigDecimal test = destination.add(value.subtract(source));
                    System.out.println(value + " " + test);
                    if (toReturn.compareTo(test) > 0) {
                        toReturn = test;
                    }
                }
            }
            k = k.add(new BigDecimal(1));
        }
        return toReturn;
    }

}
