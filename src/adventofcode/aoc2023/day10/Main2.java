package adventofcode.aoc2023.day10;


public class Main2 {

    // wrong answer here unfortunately :(

    static String s0 =
            "...........\n" +
                    ".F-------7.\n" +
                    ".|F-----7|.\n" +
                    ".||.....||.\n" +
                    ".||.....||.\n" +
                    ".|L-7.F-J|.\n" +
                    ".|..|.|..|.\n" +
                    ".L--J.L--J.\n" +
                    "...........\n";

    static String s =
            ".F----7F7F7F7F-7....\n" +
                    ".|F--7||||||||FJ....\n" +
                    ".||.FJ||||||||L7....\n" +
                    "FJL7L7LJLJ||LJ.L-7..\n" +
                    "L--J.L7...LJ-7F-7L7.\n" +
                    "....F-J..F7FJ|L7L7L7\n" +
                    "....L7.F7||L7|.L7L7|\n" +
                    ".....|FJLJ|FJ|F7|.LJ\n" +
                    "....FJL-7.||.||||...\n" +
                    "....L---J.LJ.LJLJ...\n";


    static String sq = "FJ.|-FL-J-F-J-L-F|7F7F7J.|J7|-FF7.7F--|-F7F-.7.F--F-J.F|7FJ-77.|-|-F|7FL|FF|7.FF-L|-J7L-|-L-|-L-F.F.L7F..|7F|.F-JF77F7.FL7F-7.F---7L|77FJ7-J\n" +
            "L-FL.-J|.L|.|7J7JJ|LJ7..FLJF--F.|7FF7J..F.JFL.FL--J|L7.L|L|.L77..J7FJL7JL--J77-L.F|7.7J|||.|J.LFJ.L..FF7FF-JLF7.|F||-JJ-L7-L7F7.FJL.|7-|LFJ|\n" +
            "|J|L|J.L--|.|L7JJFJL7JFFL7.F7.J..F-L77.-J7LF-FJ|FLJF-J7|F777LJ-7-|-L-7|J|.|-LL7LL7L--7F-F--|.|--7FJF|J|LJJ.F.||FLJJJ.J.|JJ|J|7LJJLLJJ|LLFJFJ\n" +
            "LFL7|7LJ.F|FJFLJ7|L-J.|JF7.|7-.F7F7.|--JL|-F7|7|7||||||F||||L|LL-||.FJJ.J---F.L-J.-.L7L--..|.|JL||FFL-J7L..JJ.J7-J||FF-|--7.|JF|JFL7F7.L|FJJ\n" +
            ".J7L-7|JL|7J-|.LF-J-L|---JF|--FFJ||FJJFF-J|F7J-7-J|LJFLFJL---77JFL77F|FFJFFF|.|FL7LL7LJL.|.|-F-F.|-|-J-7LJJ7.7J|77|--|JJL-JF77JJ|FJL7L7||LJ7\n" +
            "J||J.|JJF77|F-J7L|J-LL-7L-7JFF-J-|-7.F-|JLLJLF-JFL7|L||L-7F-7|F-7L-L7LF7LJ7JLF77-J.L77F.|JFJ-F7LFL7|FLJ.|.|7F7.|7FF.J|F.|L7JL-JF-7-LF||L7|L7\n" +
            ".F|.|-JFFJF|F-.|L-JF-|F7-7L.J|F|JL-|-|||-F7J.LFL7.|7F|F7LLJFJ||FJ7LL-7J77LJLF|L||LF7-7|LJ77JL||-|FFF7|-FFF7.JJ-|--77|LJ7-JJF7JFJ-|L|F7-7L77J\n" +
            "-LJF.|JFJFJJLL--7JF|||L|7L-JJ7.77|-||FF--JJ--7JL|-LF77L7LF-JFJ|L-7.LLJLLJF--J.LF7.||F77.F|-F.||7J7FJL7-LF||JLFFJLJ.FJ7-F7.F|.L7..LFF.L-F.|7.\n" +
            "||.F7L-7LJ.77|.|||LF-L-|L|JJLLJLF|-7FL||J.|F|LJ-|.L|L7F77L-7|FJF7L-777.L|-J||F7||F|L7L--F77-FJL7JLL7FJJ.|||LF7JF7F-|.LJL7-FJF-.--J.|-J|L-FL7\n" +
            "|F-7J-7L-JF77L7F-7.L|.L|-FJF77JF-|LL-.L-J.LF|7F||L7L7LJL7FFJLJFJL7FJF-7FFJFF7||||FJFJ-JFJ|J7L7FJJJFJL7JF7||FJ|.|J|.|.||FJL-77|F|77.||FJ.L7JL\n" +
            "F77|.|LJ|F||LLF-.L.||7.LF--7||F||L-7J7||J...J77.|-JLL--7L7L7F-JF7LJ||FJ7|FFJLJLJ||FJ-||L7|.F-J|F-7L-7L7||||L7L777LF7-L|J..|7-F-F|JFFF-J-FLJ|\n" +
            "7|F7-F|7FF|77L|J7LJFL-7FL-7L7JLL7-JJ-J.|F7FLLJ|FFFJF7F7L7|.||F7||F7FJL7F-7L7F7F-J|L7.F7FJ|-L-7LJFJF-JFJ||||.L7|F7F77J-F-|7L-J|-JLFJ|||LF77|J\n" +
            "|FF|L7F-JJ|-J7.FL.LLJJLLF7L7|.F||LJ7.|-F7J--|7L-F77||||FJL-J||LJ||||F-J|FJFLJ||F7|FJFJLJFJFF7L-7L-JF-JFJ||L7L||||||..F77L|.LFJ7J.L7LL7F--J7.\n" +
            "7F7|7|L.F-JLF7F77-FL.|F|||||L-7F-7JF7JF|L7|JL7|L||FJLJ||F--7||F-J|LJL--J|F-7FJ|||||-L--7L-7||F7L--7L-7L7|L7L-JLJLJ|F7||7..FFJ-77-LJJL|7-LL7L\n" +
            "|F|-.|F7JF7.LF7LF7LFFFF-JL7L7FJ|FJFJ|F-JFJF7.|77||L7F-JLJF7|LJL-7|F-----JL7|L7LJLJ|F-7LL-7||||L---JF-JFJL7|F7F----J|LJL7-||J7.L-.LJ..LL-JL|J\n" +
            "7.LJ--||LJLLFJF7-|7JL||F-7L7|L-J|.L7||F-JL|L7F7FJ|FJ|-F7FJLJF7F-J|L7F7LF--JL-JF7F-J|FJF-7|LJ|L----7L-7|F-JLJ||JLF--JF-7||L7-77..7J|-J7....F7\n" +
            "|F-||-JJJ...7-||JL|7.FLJFL7|L7F-JF7|||L77FJFJ|||FJL7|FJLJF--JLJF7L7LJL7|F7F7F-JLJF7||.L7||F-JFF-7FJF-J||LF--JL7FJF-7L7LJF-|-J7-J7F-77|.FLL7L\n" +
            "FL7L7..|..F-J||--7.-7||JF7|L7|L7FJ||||FJFJFJFJ|||-|||L7F7|F7F7FJL7|F--JLJ|||L7F7FJLJL7FJLJL7F7L7|L7L--JL7L--7FJ|FJ7|FJJLJ-|.|JLL7-|LLL-|JL|J\n" +
            "-7LL|JFF7FJL.LJJ|LJLLF--JLJFJ|FJL7LJ|||FJFJ-L7||L7FJL7LJ|||||LJF7|||F--7.LJL7|||L-7F-JL-7F-J||FJL7|F----JF7FJ|FJL-7|L77J.LJ-L-77J--F|.FJ.L|7\n" +
            "FL7F7F-|L--JF|7.LJJ|.L----7|FJ||FJF-J||L7L7-FJLJFJ|F-JF7|||||F-JLJ||L-7|F7F7|||L7FJ|JF7|||F7||L-7LJL--7F-JLJFJ|F--JL-J7F|7.FJ7L-77L7-7-LF77J\n" +
            "7LLJL7J|.FJ-|JFJ7JF7F7||F-J|L7L-JFJF-JL7L7L7L--7L7||F-JLJ||LJL-7F7||F7|||||||||FJL7L7||FJ|||||F7L7F---JL---7L-JL7F-77F-7F777L-7LF--JL-7-|L|J\n" +
            "F7.F7|FJJ7-FJ7|F7.||||F7L-7L7L7F7L7L-7FJFJFJF7FJFJ||L---7|L7F--J||||||||||||||||F7L7||LJFJ|LJLJ|FJL7F7FF7F7|F---JL7L7L7LJ|77JFF7LF7|||..J7L.\n" +
            "||7LFJF|L7L7|F-FL-|LJLJ|F7L7|.LJL7|F-JL7L7L7||L7L7|L7JF7||-|L-7FJ||||||||LJLJ||||||||L-7|-|F---JL7FJ|L7|LJLJ|F7F7-|FJFJF-J7.FJJLFFJ||-F-L|FF\n" +
            "L|J-L-J|FF.|-7|L7L|F--7LJL-JL7F-7||L--7L7L7|||FJFJL7L-J||L-JF-J|FJ|LJ|||L---7|||||FJL7FJL-J|LF7F-JL-JFJL-7F7LJLJL7|L-JFJ7LF7-J7FL77FJ.-JLJF7\n" +
            "L|.FF-77-FLJ7.F.F7LJF7L----7FJL7LJ|FF7L7L7|LJ||FJ7JL--7||F--JLFJL7L7FJ||-F7-||||||L-7|L---7L7||L7F---J7F7LJL7F---J|F--J.F7|L7JFJ7|-JL7|.FLLJ\n" +
            ".L.FL7.|JLL--||F||-FJL7|F77|L7JL-7L7|L-JFJL-7||L7FF7F7|LJ|F7F7|F-JFJL7|L7||FJ||LJL7J||F7F7|FJ||FJL----7|L7F7|L7F--JL---7|||FJ7JL7J77LF--|7|L\n" +
            "L|FJ7|.|7|L7|F-FJL7L-7L-JL-JFJF--JFJ|F-7|F--J|L7L7||||L7FJ||||||F7L-7||FJ||L7||F--JFJLJLJLJ|-||L7F7F--JL7||||FJ|F------J|||L77-.JJ-JLL7-L-7.\n" +
            "LJJF7J7||L7FLF7L7FJFFJF----7L7L--7L7|L7LJL-7FJ7L7LJ||L-JL7|LJLJLJL7FJ|||FJL-J||L7F7L----7F-JFJL7||LJLF7FJ||||L7||F7F--7.|||FJ.LL|F-L7LF-F.LF\n" +
            "-7LJ|-7LJFL7J||-||F7L-JF7F7|FJ7F7|FJL7L-7F7||.F-JF-JL---7||F------JL7LJ|L---7||FJ||F----J|F7L7FJ||7F7||L7||LJFJ|LJLJF-JFJLJ|F77LJL77-FJ|.L|L\n" +
            "||-LLJJ7.FJJL||FJLJ|F--JLJ|||F7|LJL-7|F-J|||L7L-7|F7LF7FJLJL7FF-7JF7L7FJF-7L|LJL-J|L----7LJL7||FJL-J||L7||L-7L-JF---JF-JF--J||J7L-LL-L---7L7\n" +
            "|....LJ.FLJFFJ|L7F7|L----7||LJ|L7F--J||F7|LJFJF-J||L7||L--7FJFJFJFJL-J|-L7L-JF7F--J-F---JF--J|||F---JL7|||F7|F--JF-7FJF7|F7-||7|.7.LL-L|J7L-\n" +
            "--7-LJ|F-F7-L7|.LJ||LF7F-J|L-7|FJL7F7||||L7FJJL-7||FJ|L--7|||L7L-JF7F7|F7L---J|L-7F7L---7|FF-JLJL--7F7|||||||L-7FJFJ|FJ|LJL-JL-7F7-7J.|JJ|FL\n" +
            "|-|77.||LFFJJ|L7F-JL7||L-7L7.||L-7|||||||FJL-7F-J|||FJF7FJ||F7L7F-JLJLJ||F7F7.|F-J||LF7FJL7L--7F---J|||||||LJF-J|FJFJL7L7F7F7F-J|L7-7F|7F--7\n" +
            "|7JF-.F-7L-F-JFJL--7LJ|F7L7L-JL--JLJ|||||L7F7|L-7||||FJ||FJ|||FJ|F-7F7FJ|||||FJL-7|L7||L7FJF7FJ|F7F7|||||||F-JF-JL-JF7|JLJLJ|L--JFJ..7|F.|.J\n" +
            "L7FJ.FJLJLLL-7L7LF7L-7LJL-JF--7F7F-7|||||L||LJF7||||||JLJL7|||L7||FJ|||FJ||||L7F-JL7|||F||7||L7|||||||||||||F-JF7F7FJLJF7F-7L-7F-JJJ-LLJ7FF7\n" +
            ".L7-7JJ||77LJL7L-JL--JF7F-7L-7LJ||FJLJLJ|FJ|F7|||||||L-7F-J|||FJLJL7|||L7|||L7||F7FJ|||FJ|FJL7|||||||||LJ||||F-JLJ|L-7F|||FJF7LJF7|J|F|J.FF7\n" +
            "F7--||-F-L-JFLL7F7F--7|LJJL7FJF7LJL----7||FJ||||||||L7FJL7FJ||L7F--J|LJJLJ|L7||||||FJ||L7||F-J|LJ||||||F7LJLJL--7FJF7L-JLJL-JL7.||7.LJL7-|J|\n" +
            "FL-J.F-7||F.7..LJLJF-J|F--7||FJL-----7FJ||L-J||LJ|||FJL--J|FJL7||F-7L-7F--JFJ||||LJL7||FJ||L7FJ.FJ|||LJ|L-------JL-J|F7F7F-7F7L-JL7-|.|.L|7F\n" +
            "|L7.LJ-J7||-F7.F-7.L7FJL7FJLJL-----7FJ|FJ|F--JL-7|||L-7F--JL-7||||7L7FJL--7L7|||L7F-J|LJFJ|FJL7FJFJ|L7-L-------7F--7LJLJ|L7||L----JF7-F7L77J\n" +
            "F-F-J7JL7JFJ||-L7|F7LJF7|L--7F-----JL-JL7||F-7F7||||F-JL-7F7FJ||||F-JL-7JFJFJ|||FJ|F7L-7|FJL7FJL-JFL-JF--------J|F-JF7F7L-J||F7F7F7|L7||7|FJ\n" +
            "L7L-JJ-7L7JFJL-7||||F-JLJF--JL--------7FJ|||FJ|||LJ|L--7FJ||L7||LJ|F-7FJFJFJ|LJ|L7||L7FJ||7|||FF----7FL-------7||L7||LJL--7|||||||||FJ||-F7J\n" +
            "F|7|J7.|LJ7L--7LJ|||L---7L7F7F-------7|L7|||L7||L7FJF-7|L7||FJ||F-J|FJL7|FJ|F7LL7|||FJ|FJL7FJL7|F7F7L7-F7F7F-7L7L7L-JF7F--JLJ|||||||L-JL-J|.\n" +
            "FLL--7-|-L-F7FL-7|||F-77L7|||L-7F---7LJ-LJ|||||L7||FJFJL7||LJ|LJL--J|F7||L7FJ|F7||LJL7|L7FJL--JLJLJL7L-JLJLJ.L7L-JF--JLJF-7F7|||||||F-----J7\n" +
            "-|7|FJFJ-.|||F7|||||L7L7-||||F7LJF--JF---7|L7||FJ||L7L-7||L--7F-----J|LJL7LJFJ|LJL--7||FJ|F7F-------JF------7FJF-7L--7F7|FJ|||||LJLJL7F7J|F|\n" +
            "|LJJFJ7LJFFJLJL-JLJ|J|FJFJLJLJL--JF--JF--JL-JLJL7|L7L7FJ|L7F7|L7F7F7FJF--JF7L7L7F7F-JLJL7LJ|L--------JF-----JL7L7L-7FJ||||7|LJLJF7F-7LJL-777\n" +
            "|JJJ|.FF.FJF7F7F--7|FJL-JF7F------JF-7L--------7|L7|FJ|FJFJ|LJF||||||FJF7FJL7L7|||L--7F-JF7|F7F-----7FJF---7F7|FJF7LJFJLJL7|F--7||L7|F-7FJ-7\n" +
            "-.-.-L-|-L-JLJLJF7||L----JLJF------J-L---7F7F7FJL-J|||LJ.L7L--7||||||L7|||JFJFJ|||F--JL7FJ|||||F7F-7LJFJF--J||LJFJL--JF---J||F7LJ|FJ|L7LJJ--\n" +
            "|7-|LF7JF7F7F-7FJLJL--------JF--7F------7LJLJLJF7F-JL-7F--JF--J||||LJFLJ||FJFJ-LJ||F7-FJL7|LJ|LJLJFJF-JJL---JL7FJF----JF7LFJ||L-7|L7L7L-77|J\n" +
            "|F7J7F-7|LJ|L7LJF7F-7F--7F7F7|7FJ|JF7F--JF-----J||F-7FJL7F7L-7FJ|||F-7F-J|L7L-7F-JLJL7|F7|L7FJF---JFJF7F-----7|L7|F----JL7L7LJF-JL-JFL-7|JJ7\n" +
            ".LF-FL7|L7FJFJF-JLJ7LJF-J|LJLJFJFJFJLJF7-|F--7F7|||FJL-7|||F7||FJLJL7LJF7L7L7FJL7F7F-JLJ|L7||FJF7F7|.||L----7LJ.||L7F--7FJFJF7L-------7LJ|F7\n" +
            "7LF7F7||7||FJFJF-----7L-7|LF-7L-JFL---JL7|L-7||LJLJL-7FJLJ||||||F7F-JF-JL7L7||F-J||L7F--JFJ|||FJLJLJFJL-----JLF-JL-JL-7|L-JFJL-----7F-J.FF|J\n" +
            "F-F-JLJ|FJLJFJ.L7F-7FJF7LJFJFJF7F----7F7LJF7|LJF-7F7FJL-7FJ||||LJ|L-7L-7LL7|LJL-7||FJL--7|JLJLJF7F7FJF-7F7F7F7|F7F7F-7|L--7L-7FF7F7LJLL--7||\n" +
            "JJ|F--7LJF7FJF7.LJFJL-JL-7L7L-J|L---7|||F7|LJF-JFJ||L-7FJL7|LJL-7L7FJF7|F-JL---7|||L77F-J|F--7J|||LJFJ-LJLJLJLJ|LJ|L7|L--7L7FJFJLJL7F7|JFJ.|\n" +
            "|.LJ.LL--JLJFJ|F--JF7F--7|LL7F7L----J||LJ|L77L7FJFJL7JLJ|FJL7F7JL7||FJ||L7F7F7FJ|||FJFJF-JL-7L7||L--J7F7F---7F7L7JL-JL7F7L7||J|F--7|||7||LF|\n" +
            "-7.FL7FF7LF-JFJL--7|LJ|FJ|F7LJ|F7F--7|L-7L7L--JL-JF-JF---JF7LJ|F7LJ||JLJ7||||||FJ|||FJFJF--7L7LJ|F7|F7||L--7||L7L7F7F7||L7|LJFJ|F7LJ|L--7FJJ\n" +
            "LF7LJFL|L7|F7L----J|F-7L7||L--J|||F-JL--J-L---7F-7L-7|F7F7|L7FJ||JFJL7F7FJ|LJ|||FJ|||FJ.L-7L-JF7LJL-JLJL--7||L7L7LJLJ|LJFJL7.L7LJ|F7L7F-J7J7\n" +
            "7L7JFFFL7LJ||F-----JL7|FJLJF-7FJLJL-7F-------7|L7L7FJ||||||FJL-JL7|F7LJ|L7L-7|||L7LJLJF7F7L---JL7F7F7F7F-7LJL-J7L7F-7L-7L--JF-JF-J|L-JL-77L-\n" +
            "FF7.FL77L-7|LJF------JLJF-7L7LJF7F--J|F-7F-7FJ|FJJLJ|LJ||LJ|F7F7FJ|||F-J-L7FJ|||FJF---JLJL7FF7F7LJLJ||LJLL---77F7LJ||F7L-7F-JF-JF-JF7F--JL7J\n" +
            "LL|-.F-F77LJF7|F7F7F7F-7L7L-JF7||L---JL7LJ|LJF|L7F----7||F-J|||||FJ||L---7|L7LJLJLL------7L-J||L-7F7LJF77F7F7|FJ|F-7LJ|F7LJF-JLFJF-JLJ-F7.LJ\n" +
            ".|L-JF|||F7FJLJ|||LJLJFJFJF--JLJL------JF7F7F7L-J|F7F-JLJL-7|||LJL7||F7F-JL7|7|F--7F--7F7L--7|L-7LJL7FJL-JLJLJ|FJL7L-7|||F7L---JFJ7F77FJL7--\n" +
            "F7|.LFFJLJLJF-7|LJF---JFJFL----7F7F-----JLJLJL--7||||LF7-F-J||L--7||||||-F-J|7LL-7LJF7LJL---JL77L--7|L-------7||F7|F-JLJLJL----7L--JL7|F-J.|\n" +
            "|L777FL---7FJFJL7FJF7F-JLF-----J|LJF7F7F7F7F----JLJ|L7|L7L7FJ|F7FJ||||LJ.L-7L7-|FL-7||F-----7FJF7-FJL--------J|||||L7F7F7F----7L7F--7LJL7-F7\n" +
            "|.|LLJ|LF-JL7L--JL-JLJJF7L------JF-JLJLJLJ|L7F7F-7F|FJ|FJFLJJLJ|L7LJLJ7.F|LL7L7|FLFLJLJF7F--JL7||FJF---7F--77FJLJ||FJ|||LJF7F7|FJL7FJF-7L7JJ\n" +
            "F7L7.LJJL-7FJF-----7-F7|L-7F-----JF77F--7FL-J|||FJFJL-JL--7JF7FL-JJJ.|-L-FJFL7|77---F--JLJF--7||LJFJLF-J|F-JFJF-7LJL-JLJF-JLJLJ|F7||FJFJFJJ.\n" +
            "F-..JFLJ.FJL7L-7F-7|FJLJF7LJF-7F--JL-JF-JF7F7||||FJF----7FJ7F7JF|.|7F|||FLF7LLJLJ|JLL7F7F-JF-J|L--JF-JF-J|F7L7|-L7F7F--7|F7F7F7|||||L7L7L7-L\n" +
            "JF|7||JLFL-7|J7LJFJLJF-7|L7FJFJ|F----7L--JLJLJLJ|L7|F--7|L77||-FF-|-F|7FJ-LJ|LJ77LJF7LJLJF-JF7L--7FJF7L77LJL-JL7FJ|LJF7LJ||||||LJLJ|FJ-|FJ7|\n" +
            "FJ|LF-JFJ..LJ7F--JF7FJJLJFJL7|FJL---7L7F-7F7F7F-JFJLJF7|L-JFJL--7---J.|JJFJ||.LFJ|FJL----JF7|L7F7LJFJL7|F-----7|L7L--JL--JLJLJ||F7JLJ-FJL-77\n" +
            "|.J-J77FJ-F---JF--JLJ.F7FJF7|LJF7F7FJJ|L7||LJLJFFJF-7|||F-7|F7F-J7L|.--7--.77.F|F-L-----7FJLJ.LJL7FJF-J|L----7||.L7F-7F7F7F7F7|FJL-7--L7F7L7\n" +
            "|.J7JL|7J.L----JJF-7F7||L-JLJF-JLJLJF7|FJLJF7F-7|FJ7LJLJL7|||LJ|-L7LL..|JFF-JF7-|J-|F7F7LJF7F-7F-JL7|F-JFF7F-JLJF-J||||||||LJLJL7F-JL|7LJL7|\n" +
            "F7FL7.|LF|J-F7F7FL7LJLJL--7F7L------J|LJF77|||FJ||F---7|FJ||L--7-J|L|.|J--JLLLJ.JJF-JLJL--J|L7||F7FJLJLF-JLJ-F7FJF7L7LJLJLJF7JF7||F7F--7JJLJ\n" +
            "|-F7J.-7-|-|||||F7|F7F---7|||F7F--7F7L--JL7|LJL-JLJF--JFJFJ|F--JJL|FF..|7JLF-J-7.-L-7F-7F-7L-JLJ|LJF77FJF7-F7||L-JL-J.F----JL7|||||||F-J---J\n" +
            "LFJJ.F7L7LFF|||LJ|LJLJFF7|||LJ|L-7LJL-----J|F---7F7L-7LL7L-JL7.F77||L|7F|F|L|JFL-J|LLJ.LJJL--7F-JF-JL7L-JL-JLJL7F-----JF-----J|||LJLJL-77LJ|\n" +
            "F-JJ.|L-F--7||L-7|7F7.FJLJLJF7L--JF---7F---JL--7LJL--JF7|F--7L-J|.LJJLFF-77--7FJ|||.F7F7F----J|F7L--7L7F-------J|F---7FJF7F7F-JLJF--7F7L77L|\n" +
            "|L--7-|JL-7||L-7||FJL7L--7F-J|F-7FJF--J|F-7F7F7L------JLJL-7L7F7L7L|..||FJ7||J|LFLJFJLJLJF--7FJ|||F7L7|L------7-||F77|L-JLJLJF7F7L-7LJL7|J||\n" +
            "7-JLJ-|LJ-||L-7||LJF7L---J|F-JL7||FJF7FJL7LJLJ|F--7F---7F-7L7LJL-JF77|F|L7F7JL-7.|.L--7F-JF-J|FJL-JL-JL----7F-JFJLJL7|F----7FJLJ|F7L--7LJ.LJ\n" +
            "J-..|J|7F-|L7FJ||F7||F7F-7||F-7|LJL-JLJF7L---7|L7F|L-7FJL7|FJF-7J-JJF--JFJ||-L.7JJ7.|-LJF7|F-J|F7F-7F7F7F-7|L--JF-7FJ|L---7|L--7|||F--JL|7.|\n" +
            "|.--F.F-7.L7|L7|LJLJLJLJFJ|||JLJJF7F-7FJ|F---JL7L7|F7||F7||L7|FJJL|-L--7|7||.|-L-F-7F-77||LJF-J|||LLJLJLJFJ|F7F7|FJL7L7F-7||F7FJ||||JLL-JL-|\n" +
            "77-L|-L7L--JL-JL-------7L7|||F---J|L7||.|L----7|FJLJLJLJ|||FJ|L77FJ7JF7|L7|L-7-|L7J-L7|FJL--JF-JLJF7F----J|LJLJLJ|F7L7LJ7|||||L7||LJ7JJJ|LF-\n" +
            ".F7F-77L---7F7F7F---7F7L7LJLJL---7L-J|L7L-----JLJF---7F-J|LJFJFJ-J.F-J|L7LJF-J.F7JF-FJ|L--7F-JF-7FJLJF-7F7-F--7F7LJL-JFF7LJLJL-JLJ|.LJ7F7|||\n" +
            "F|JJ..-F---J|LJLJF7JLJ|FJF7F-7F--JF7JL-JF7F------JF--JL7FJF7L7|F7J7L-7|FJF7L--7||-F7L7|-F7LJF7L7|L-7FJLLJL7L7FJ||-F----JL-------7J-7-|-LFFJL\n" +
            "FLJFFF.L----JF---JL---JL7||L7|L--7|L-7F-JLJF7F-7F-JF7JFJ|FJL-JLJL7F7FJ|L7|L7F-J||FJL7||FJ|-FJ|FJ|F7LJLF---JJ||FJL7|F---7F---7F--J7F-.F-LLF7J\n" +
            "JJ-FFJ-J|LF-7|F7F7F7F7F7LJL-JL7F7LJF-J|F---J|L7|L--JL7L-JL7F--7F-J|||FJ7|L7|L7FJ|L-7LJ|L7L7L7|L7LJL---JF----JLJF7LJL7F7LJF7|LJ|J.--F---7|L7.\n" +
            "||..LL--77L7|LJLJLJLJLJL-----7LJL--JF7||F--7|FJ|F-7F7|F7F-J|F-J|-FJLJ|F7|FJL-JL7|F7L7FJ.L7L-JL-JF-7F7F7|F---7F-J|F-7LJL--JL---7F--7JL|.|FLL-\n" +
            "|LF-LJL|FF7|L-7F7|F7F7F7F7|F7L------JLJLJF-JLJFLJ7LJLJ||L--JL-7L7L--7LJLJL--7.L|LJL-J|F7FL--7F7FJJLJ||LJL--7LJF7LJ.L--7F------JJ--L7.--J|7F.\n" +
            "|LJ.LFFF-JLJF7LJL-JLJLJLJL-J|F--------7F7L7F7F7JF7F7FFJL--7FF7L7L7F7|F---7F-J-FJF---7|||F7-FJ||L---7||F-7F7L--JL7-F7F7LJF7F---7.L|F-7JL-JF--\n" +
            "LF-|7L-L-7F7|L-------7F--7F7LJF------7LJL7||LJL7|||L7|F-7FJFJL7|FJ|||L--7LJ.F7L-JF--J||||L7|FJL7F--JLJL7LJL---7FJFJLJL7FJLJF--J.F-J-|F-J.|-J\n" +
            "LLFJL7J|JLJLJF-------JL7FJ|L7FJF-----JF-7|LJF--J|LJFJLJ7||FJF7LJL7||L7F7L-7FJ|F77L--7||LJFJ||F-J|F-----JF----7LJFJF---J|F--JF-7-FL-7-|7L|J7|\n" +
            "..7JLJJF.|L|.L7F---7F7FJL7L7||FJF-----JFJ|F7L---JF-JF7F7||L-JL--7LJ|FJ|L--JL7LJL7F7FJLJF7L7LJL--JL------JF---JFFJFJF7FFJL---JFJ.7F-7-F|7|LLF\n" +
            "F7J|F.-777.LF-J|F-7LJLJF7L-JLJL7|F-----J|LJL-----JF-JLJ||L7-F7F7L-7||FJF7-F7L--7||LJF--JL-J.F------------JF7FF7|FJ-||FJF7F---JJFJ7.L.|.77FF|\n" +
            "||FL|.F7-FLLL--JL7|F7F7||F7F7F7LJL--------7-F7F7F-JF---JL7L-J||L7FJ|||FJL7|L-7FJ|L-7L--7F7F7L-------------JL7|LJL--J||FJ|L-----7JJL7F7-F7--L\n" +
            "7F-7|FL7|..LF-7F-JLJLJ||LJLJLJL7F---------JFJ||LJF-JLF7F7L7F7LJFJL7||LJF-JL-7|L7|F-JF7FJ||||F----7F--------7LJF-7F-7LJL7L------J.7--LJ.--J-J\n" +
            "LJJFLJFLF..FL7|L-----7||F-----7LJF-7F7F7F77|FJ|F-JLF7||||LLJL7FJF7|||F-JF7F7|||||L-7|LJL|LJ|L---7|L7F-7F--7|F7L7LJ||F-7L-----7LFF.J7|.7JJ-F7\n" +
            "L|.L|J-7F--LJ|L------J|LJF--7FJF7||LJ||LJL-JL-JL--7||||||F7F-JL-JLJLJL7FJ|||||FJL7FJL7|FJF-JF7FFJ|.LJFLJLFJ||L7L7F-JL7|F----7L--777FLFJ..7J|\n" +
            "FF|||7F|J|.|.L--7F---7L-7L-7|L-JLJF--J|F----7F-7F-J||||||||L-------7F-JL7LJLJ||F7|L-7L7|FJF-JL7L7L--7F7|FJ.LJ-|FJL-7FJ|L---7|F--J-FJ-|-F-||.\n" +
            "L7LF7JJ.L-7-7.F7LJF--JF7L-7|L--7F7L---J|FF-7||FJL--J|||||||F77F7F7FJL7JJL7F--JLJ|L-7L7LJ|L|F-7|LL--7LJL7L----7|L-7FJL7L7F7FJ|L---7L|-|.|7||J\n" +
            "LJ.L||7.|||JF-JL--JF7FJ|F7LJF-7LJL7F7F7L7|FJLJL7F7F-J||||||||FJ||LJF7L7FFJL--7F7L-7|FJF-JFJL7||F---JF-7L-----JL--JL7FJ||||L7L7F-7|7|L7FFLJ|.\n" +
            ".F7JF-FJJ-|.L-----7|||FJ|L7FJFL7F7LJLJL7LJL--77LJLJ7FJ||||LJ|L7|L-7|L7|FJF---J||F-J|L7L77|F-JLJL--7FJ.L--7F7JF7F7F7|L-7||L-J7LJ-LJ||.L-|FLJ-\n" +
            "FLJF|-L7J.|.L-F---J|LJL7|7LJ|F7LJL----7|F----JF7F--7L7LJLJF-JFJ|F-JL7LJL7|F7-FJ|L-7L7|FJFJL-7F7FF7LJ7F-7FJ|L7|LJ|||L--JLJF-7F7|FJ-FL7.|LFL7J\n" +
            "LL|7FFJ-.-L..FL---7|F-7LJF-7FJL-------J|L77F7-|LJF7L7L---7L7F|FJL-7FJ|F-JLJL7L7L7LL7LJL7|F--J||FJL7F7L7|L-JFJ|F-J||F7F-77L7LJL77.---L7L7JLF.\n" +
            "F--JJ|LF7|77FLF--7LJL7|F7L7LJF--7F-7.F7L-JFJL7L7FJL-JF7F7|FJFJ|JF7||F7L--7F-JFJFJF7L--7|||F-7||L-7LJ|FJL---JFJL--J|||L7L7FJF--J7.|J.|F7|.|LL\n" +
            "|FFJ-|7FL-7F--JF7L---JLJL-JF7|F7LJ7L-JL-7.|F-JFJL-7F7|||LJL7L7|FJ||LJL7F7||F7L7L7|L7F7|||||FJ||F7L-7|L7F-7F7L7F---J|L7|FJL7|F7J.F7L77.F.L-.|\n" +
            "--|JF--7JJ-L---J|F7F----7F-JLJ||F-------JFJ|F7|F--J||||L-7FJFJ|L7LJF--J|LJLJL7L7|L7||LJ|||||-|||L7FJ|FJ|7LJL-JL--7JL7|||F-JLJL7FJL7||F-7L|FJ\n" +
            "|L|F7.LL||FF---7LJLJF7F-J|F7F-JLJF---7F-7L7|||||F7-|LJ|F-JL-JFJJ|F-JF7-L-7F--JFJL7||L-7LJ|||FJ||FJL7|L-JF--7F7F--JF7|||LJF-7F7LJF-JF77L|L|7J\n" +
            "F7L||7.||FFL--7|7F7FJLJF-J||L---7|JF-J|FJFJLJ||||L7L-7|L-7F--JF7||F7||F7FJ|F--JF-J|L-7|F7LJ||FJ|L7FJL7F7L-7|||L---JLJLJF-J7LJL--JJFJL7.|.FJJ\n" +
            "F|JLJJ-7F-----JL-JLJF7FJ-FJL-7F-JL7|F7||.L-7FJ|||FJF7||F7||LF7||||||||||L7|L--7|F7L-7|LJ|F-J||-L7|L7FJ||FFJ|||F7F--7F-7L---7F-----JF7|77..L7\n" +
            "FJ|LJ7|LL7F7F-7F-7F-J||F-JF-7LJF--JLJ|||F-7|L7|||L7|||||||L7|LJ||||||||L-JL7F7|||L7FJL7FJL7FJL7FJ|FJ|FJL7L7LJLJ||F7|L7L7F--J|F-----JLJ7--7.-\n" +
            "7JJ-|--|FLJLJFJ|FJL7-LJL7FJLL7FJF----J||L7||7||||FJ|LJ||LJFJL-7||||LJ|L--7FJ|||LJFJ|F-J|F-JL7FJ|FJL7LJ7LL7L-7F-JLJ||FJFJ|7F-JL------7FF7LJ7|\n" +
            ".|.FJ|.LJJF--JFJL7FJF7F-J|F7FJL7L7F7F-J|FJ|L7LJ||L7L7F|L-7L-7FJ||LJF-JF-7|L7||L-7L7||F7|L7F-JL7||F7L--7JFJF-J|F-7FJLJ-L7L-JF7F---7F7|-|-.F-7\n" +
            "FF77.7-L.LL-7FJF-J|FJLJF7||LJF-JFLJ||F-JL7|FJF-JL7|FJFJF-J|FJL7LJF-JF7L7|L7|||F-JJ||LJ||FJL-7FJ|LJ|F-7L7L7L-7LJ-|L---7FJF7FJ|L--7LJLJJL|-7-|\n" +
            "-FJ.FF7.L7..LJFJF7|L---JLJL7FJF----J|L7F7||L7L-7FJ|L7L7L--7|F7L7FJF7||FJ|FJ|||L--7LJF-J|L7F7|L7L-7|L7L7|-|F7L-7FJF7F7||FJ|L7L7F-J||.||F-7|L|\n" +
            "L|L|-|-F.|-L7-L7|||F-7F----JL7L7F7F7L7LJ||L-JJFJL7|FJFJF--J||L-JL7||||L7||FJ|L7F-JF-JF7|FJ|||FJF-JL-J7|L7|||F7||FJLJLJ||J|FJ7||F777|LJ7JLL.J\n" +
            ".7JL-7.L-J7LF--J|LJL7LJF-7F7FJFJ|||L-JJFJL-7|FJF7|||7L7L--7|L-7F7||LJ|FJLJ|FJFJL7.L-7||||FJ||L7L--7.F-JFJ||LJLJ|L-7F7|||FJL-7|LJL-7J|L|-7J..\n" +
            "L7-FL77J.L|.L--7|...L-7L7LJ||LL7|||F---JF7FJFJFJ||||F-JF7FJ|F-J|LJL7FJL7F-JL7L-7L-7FJ|LJ|L7||L|F-7L7L7FJ.|L-7F7L7FJ|L7|||F-7|L-7F-J7J..||JF|\n" +
            "FJF--LLJF-.7JJLLJ.F7|L|FJF-JL-7||||L7F-7||L7|FJFJ||||F7|||FJL-7|F7FJL7FJL7F7|F-JF-JL7L-7L7|LJFJL7L-J||L-7|F7LJL7|L7L7LJ|||FJL-7|L-7L7..F7.|.\n" +
            "|.-..|.LF|7L|FJ7-F7F7FJL7L7F7FJLJ|L7||JLJL7||L7L7|||LJ||||L7F-JLJ|L-7|L-7||||L-7L--7L7FJFJ|F-JF7L---7L7FJ|||F7FJ|FJFJF7||||F-7|L--J-J77||F-L\n" +
            "J7J-|7FFFF-.LF7J.|||LJF-J|LJ||F--JFJ|L7F--J|L7|F|||L7LLJ||FJ|FF7FL-7||F7||||L7F|F-7|FJL7L-JL7FJL7F7FJ|LJ7LJ|||L7LJ-L7|||LJLJ-||.|J.LLF77-J.|\n" +
            ".L7..F-J.|7F-FJLFJLJF7L7F7F7LJL7F7L7L7|L7F7L7|L7|||FJF--J|L7L-JL--7LJ||LJLJL7|FJL7|||F7|F--7|L-7LJ|L--7F--7LJL7L-7F7LJ|L-7L|.LJ7|.7LL|L--L-7\n" +
            "7.|.-JJFFJFL-F7LL--7||FJ|LJL---J|L7L7LJ-LJL7|L7|LJ||.L--7|FJF7F7F7L7F|L---7|LJL7FJ||||LJL-7LJF7L-7|F-7LJF-J.F-JF7LJL7|L7FJ7.FJ.F--|7F--L-|-L\n" +
            "FFLLJ|JF7.FJ.LL-LF-J||L7L7F7F--7L7L7|F-----JL7LJF7LJF7F-J||FJ|||||FJFJF7F-JF7F-J||LJ||F---JF7|L7FJ|L7L-7L-7FJF-J|F7FJ-JLJLJF7|LJ|FJ--|L|7F-J\n" +
            "-7JLFJ|L|7L-7.|7LL-7||FJ.|||L7.L7L7|||F7F--7FJ-FJL-7|LJF7||L7|||||L7|FJ||F-JLJF7L-7.LJ|F--7||L7||JL7L-7L7FJL7L-7LJLJ77|LJ|LL|7F7-JJJ.F-7FLLJ\n" +
            "||J...|.FJ.LF-LJ|.FLJLJ|-LJL7|F-JFJ||||LJF-JL--JF7FJL-7|||L7|||LJ|FJ|L7||L7F7FJ|F7L--7||LFJ||FJ|L-7L7FJLLJFFJF7L--7-L7FJ-JJ|LL7LJ7|J.L.|7.||\n" +
            "L--77L--||FJF-L|J77L7.FL.FJF||L7FJL||LJF7|F7F---J|L7.FJ||||LJ|L-7LJ|L7|LJLLJ|L7||L7F7||L7L7||L7|F7L7LJF7F-7L7|L7F-J77|LF77-|JL-|LL7FF7F.F7-F\n" +
            "|LL-JJJF-J.FJ-.LJ|JJ777|-J-FJL7LJJ.||F-J|LJ|L--77L7L7L7|||F--JF7L---7||F-7F-JFJ||FJ|||L-J.||L7|LJL7L--J|L7L7||FJL7JL7|F-FL.|.||.FL-JFJJ7LJL-\n" +
            "-7LLF-F7L|LJJLJJF.|L-J|L-7FL7FJL|FFLJL-7L7FL7F7L-7L7|FJ||||F7FJ|F7F7|||L7LJF7L7LJL7|||F7F7LJ.|L--7L----JJ|FJLJL7FJJ.L|..|FF|-LLF-7JFJ|JF7LFJ\n" +
            "L|7.|LL--L.LF7.L|.FJL-L.FF|LLJ..77L|LF-JFJF7|||F-JFJ|L-J||LJ||J||LJ||LJ-L7FJL7L--7|||LJLJ|F--JF-7L7FF----J|F7F7||J.--7-JJ7F---J|F7-L7J|L|L||\n" +
            ".FJF-7FJ.F7FL-L-7J|7..L|-FJ|LJLLJLFF7L-7|F|LJ|||F7L7L-7FJ|F-JL7LJF-J|F-77LJF-JF7FJLJ|F7F7|L7F7|-|FJFJF7F-7LJLJ|LJJ7|FJJ.FFFJL7-JJL-FJ-L-7|.7\n" +
            "FJ|L-77.F-|L|.L|J7|FJJ-L7|J7.7J|FFFJL--JL7L-7|LJ||-L--JL7|L-7FJF7L-7|L7L---JF7|LJ7F-J|LJLJFJ|||FJL-JFJ|L7|F-7FJJL-F7|..LLJL--F7L-J..L-7FFJ-|\n" +
            "-.|7..J-J-|JL7LL.LJ||J7JFJL-7JL7-FJF----7L--JL--JL-----7||F-JL-JL-7|L7L-7F7FJ||.F-JF7L7F7JL7|LJL7F7FJFL-JLJFJ|77|LJF--7||J-J-|--|77L7.--L.||\n" +
            "LJ7-F7JL|||LFJ.J.F-7J-L7JF--J.L|L|FJF7F7L7F-7F-7F7F---7|LJ|F-7F7F-JL7L-7||||FJL7|F7|L7LJL7FJ|FF-J||L-7-F7F7L-JF|7-LL7F--7J-|LF-7L-7|-FJJ..F-\n" +
            "F--7LJ|LFJ.F|7-7F|7|FJ--7LJ|J.F7JLJFJLJL-J|FJL7|||L--7|L7J|L7|||L7|.L--J||||L7FJ||||FJF7FJL7|FJF7||F7L7|LJL-7-FJ|-J.|7JL7|.|JJ.|FL||L-J7F-7J\n" +
            "|.L|7FJ7|F7-7JL|7FL|7|-|J----L-L7..L7F7F-7|L7FJLJ|F--JL-JFJFJ||L7|J7|J|FLJ||FJ|FJ|LJL-J||J7|||FJ||||L7LJF--7|-7|L7|.L77-7-|F-..LFL--.L7F-.|J\n" +
            "LF7L7JJF-|JJL7FL-F7F-7F||||.7J.L|-LJ||||FJ|FJL7F-J|F7F-7|L7L7|L7LJ|FJ||7.FJ|L-JL7L7F---JL-7LJ||7|||L7L-7L7-LJFJ77.FJ.LL7F7L7F77-FJ7F|JFJF7J.\n" +
            "|L77|||L|J|7--7.|L-J-7JJ-.7-L7LF|-L-LJLJL7||F-JL7FJ||L7L-7L7||FJ-|-JF7L-LL7|J-|F|FJL-7F7F-JF-JL7||L-JJFJFJ.||7L7-F7--JFFLL7LJ.7-|FF77JFJ7|F7\n" +
            "FJ||LFJ|L7L7J7|-L.LFF-JJ.JJ7L|.7|F..L|7J||||L7F7|L-JL7L7FJ|LJ|L77.L|F-7|FL|||.FFLJF--J|LJ-LL-7FJ|L7.F-JFJJLJ|FFJ-|J.LFJ7J|7|.7JF|FL|.FJ.FF7.\n" +
            "L-FJ|F.L-LF-7-LJL7|F7J77-LF-FJ||L7FL-JL7LLJL7||LJF7F7L-JL7F--JFJ-J||J|LJ--|L77..|7L--7L7-LJ||LJL|FJ-L-7|JFJFLF.-7LJ..|JJ7F|7-|LFJ7.77-JF|JLJ\n" +
            "L7JLJJ.L-.|-|7J7F7-LJ|-7-LL-7JLJLLFJLF|-7L|JLJL7FJ|||F7F-J|F-7L-7J||FLFJ-F|FJJF7LJ-FFJFJ7.F-|F|-LJ.|LLLJ||JL----L-JF7J7FLJ|L7|FJ..FLJ|F7|L7|\n" +
            "L-J.|-77-FJ7LJF7|J..FL7|-.FF|F||F-F7JFJJ|7LFLF-JL7|||||L-7LJFJF-J7F7J-|FFLLJ7FFJF||FJFJ.L.F7|LLL.|FF-L7LLJ|.FL77J|7F|J-JL||LJF7-F7L|FF-L|-|J\n" +
            "FJL-L-FJ-7-77LLL---7.FL-.F7-F-7LJ||JJLJ.L-7F7L7F-JLJLJL7FJJJL7L7L7JJL-7F|FLJ7-L--F7L-J-7-J||J7.|7FL-..L---JJ7FJ|--FLJJ7--L7J.-J7L7-F|LL|JFJ7\n" +
            "F.||JFJ.7.F|J.LF|7-J--J.L-7F7FJ|LJ---L-J7.FJL-JL-7F----JL-7|||FJL-7.L-F-L7|JJ.||J|L7-|7L.|-|J7F7---F--LLFJ|.LJ||7|.|-|FF7LL.|.L|-J7LJ.J.FLJ|\n" +
            "L7-LF-L-J-J.L-.7-JLLJLJ|LLLFJL.F.|.LJL7J--L------JL-------J7-LJJ7.|J..LL-JJJ.-FJFF-L-7JJ-|-|-F---L-J.-.L|-FJ-L--J7-J7.FF-LJ.J7-FJL7.L-.LFJ.|\n";


    public static void main(String[] args) {
        String[] ss = sq.split("\n");

        String[] ss1 = s.split("\n");

        String[] ss2 = s0.split("\n");

        extracted(ss2, 1, 1, 1, 1);
        extracted(ss1, 4, 12, 4, 12);
        extracted(ss, 25, 32, 25, 32);
    }

    private static void extracted(String[] ss, int xs, int ys, int x, int y) {
        int k = 0;
        int dir = 0;

        // | : UP -> DOWN
        // | : DOWN -> UP

        // - : LEFT -> RIGHT
        // - : RIGHT -> LEFT

        // L : LEFT -> UP
        // L : DOWN -> RIGHT

        // F : UP -> RIGHT
        // F : LEFT -> DOWN

        // J : DOWN -> LEFT
        // J : RIGHT -> UP

        // 7 : RIGHT -> DOWN
        // 7 : UP -> LEFT

        // 1 : LEFT 2: RIGHT 3: UP : 4: DOWN

        char ch = ss[xs].charAt(ys);
        if (ch == 'F') {
            dir = 1;
        }
        if (ch == 'J') {
            dir = 2;
        }
        if (ch == '7') {
            dir = 3;
        }
        if (ch == 'L') {
            dir = 4;
        }
        if (ch == '|') {
            dir = 4;
        }
        if (ch == '-') {
            dir = 2;
        }
        int[][] mat = new int[ss.length][ss[0].length()];
        int[][] mat1 = new int[ss.length][ss[0].length()];
        int[][] mat2 = new int[ss.length][ss[0].length()];

        while (true) {
            mat[x][y] = 1;
            k++;
            char c = ss[x].charAt(y);
            if (c == '-' && (dir == 2)) {
                y++;
                dir = 2;
            }
            if (c == '-' && (dir == 1)) {
                y--;
                dir = 1;
            }
            if (c == '|' && (dir == 4)) {
                x++;
                dir = 4;
            }
            if (c == '|' && dir == 3) {
                x--;
                dir = 3;
            }
            if (c == 'L' && dir == 1) {
                x--;
                dir = 3;
            }
            if (c == 'L' && dir == 4) {
                y++;
                dir = 2;
            }

            if (c == 'F' && dir == 3) {
                y++;
                dir = 2;
            }
            if (c == 'F' && dir == 1) {
                x++;
                dir = 4;
            }

            if (c == 'J' && dir == 4) {
                y--;
                dir = 1;
            }
            if (c == 'J' && dir == 2) {
                x--;
                dir = 3;
            }

            if (c == '7' && dir == 3) {
                y--;
                dir = 1;
            }
            if (c == '7' && dir == 2) {
                x++;
                dir = 4;
            }

            if (x == xs && y == ys) {
                break;
            }
        }


        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i == 0 && mat[i][j] == 0) {
                    mat[i][j] = 2;
                }
                if (i == mat.length - 1 && mat[i][j] == 0) {
                    mat[i][j] = 2;
                }
                if (j == 0 && mat[i][j] == 0) {
                    mat[i][j] = 2;
                }
                if (j == mat[0].length - 1 && mat[i][j] == 0) {
                    mat[i][j] = 2;
                }
            }
        }
        boolean parse = true;
        while (parse) {
            parse = false;
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    if (mat[i][j] == 0 && j > 0 && mat[i][j - 1] == 2) {
                        mat[i][j] = 2;
                        parse = true;
                    }
                    if (mat[i][j] == 0 && j < mat[0].length - 1 && mat[i][j + 1] == 2) {
                        mat[i][j] = 2;
                        parse = true;
                    }
                    if (mat[i][j] == 0 && i > 0 && mat[i - 1][j] == 2) {
                        mat[i][j] = 2;
                        parse = true;
                    }
                    if (mat[i][j] == 0 && i < mat.length - 1 && mat[i + 1][j] == 2) {
                        mat[i][j] = 2;
                        parse = true;
                    }
                    if (mat[i][j] == 0 && i < mat.length - 1 && j < mat[0].length - 1 && mat[i + 1][j + 1] == 2) {
                        mat[i][j] = 2;
                        parse = true;
                    }

                    if (mat[i][j] == 0 && i < mat.length - 1 && j > 0 && mat[i + 1][j - 1] == 2) {
                        mat[i][j] = 2;
                        parse = true;
                    }

                    if (mat[i][j] == 0 && i > 0 && j < mat[0].length - 1 && mat[i - 1][j + 1] == 2) {
                        mat[i][j] = 2;
                        parse = true;
                    }

                    if (mat[i][j] == 0 && i > 0 && j > 0 && mat[i - 1][j - 1] == 2) {
                        mat[i][j] = 2;
                        parse = true;
                    }
                }
            }
        }

        int pp = 0;
        int eminus = 0;
        int epipe = 0;
        int eL = 0;
        int eJ = 0;
        int eF = 0;
        int e7 = 0;

        int b1 = 0;
        int b2 = 0;
        int b3 = 0;
        int b4 = 0;

//        System.out.println(mat.length);
//        System.out.println(mat[0].length);
        for (int i = 1; i < mat.length - 1; i++) {
            for (int j = 1; j < mat[0].length - 1; j++) {
                b1 = 0;
                b2 = 0;
                b3 = 0;
                b4 = 0;
                if (mat[i][j] == 0) {
                    if (i == 7 && j == 55) {
                        System.out.println("");
                    }
                    int block = 0;
                    eminus = 0;
                    epipe = 0;
                    eL = 0;
                    eJ = 0;
                    eF = 0;
                    e7 = 0;
                    for (int l = 0; l < i; l++) {
                        if (mat[l][j] == 1) {
                            b1 = 1;
                        }
                        char e = ss[l].charAt(j);
                        switch (e) {
                            case '-':
                                eminus++;
                                break;
                            case '|':
                                epipe++;
                                break;
                            case '7':
                                e7++;
                                break;
                            case 'F':
                                eF++;
                                break;
                            case 'L':
                                eL++;
                                break;
                            case 'J':
                                eJ++;
                        }
                    }
                    if (eminus > 0 && eminus % 2 == 0 && eL == eF && eJ == e7) {
                        block++;
                    }

                    eminus = 0;
                    epipe = 0;
                    eL = 0;
                    eJ = 0;
                    eF = 0;
                    e7 = 0;
                    for (int l = i + 1; l < mat.length; l++) {
                        if (mat[l][j] == 1) {
                            b2 = 1;
                        }
                        char e = ss[l].charAt(j);
                        switch (e) {
                            case '-':
                                eminus++;
                                break;
                            case '|':
                                epipe++;
                                break;
                            case '7':
                                e7++;
                                break;
                            case 'F':
                                eF++;
                                break;
                            case 'L':
                                eL++;
                                break;
                            case 'J':
                                eJ++;
                        }
                    }
                    if (eminus > 0 && eminus % 2 == 0 && eL == eF && eJ == e7) {
                        block++;
                    }

                    eminus = 0;
                    epipe = 0;
                    eL = 0;
                    eJ = 0;
                    eF = 0;
                    e7 = 0;
                    for (int l = 0; l < j; l++) {
                        if (mat[i][l] == 1) {
                            b3 = 1;
                        }
                        char e = ss[i].charAt(l);
                        switch (e) {
                            case '-':
                                eminus++;
                                break;
                            case '|':
                                epipe++;
                                break;
                            case '7':
                                e7++;
                                break;
                            case 'F':
                                eF++;
                                break;
                            case 'L':
                                eL++;
                                break;
                            case 'J':
                                eJ++;
                        }
                    }
                    if (epipe > 0 && epipe % 2 == 0 && eL == eJ && eF == e7) {
                        block++;
                    }

                    eminus = 0;
                    epipe = 0;
                    eL = 0;
                    eJ = 0;
                    eF = 0;
                    e7 = 0;
                    for (int l = j + 1; l < mat[0].length; l++) {
                        if (mat[i][l] == 1) {
                            b4 = 1;
                        }
                        char e = ss[i].charAt(l);
                        switch (e) {
                            case '-':
                                eminus++;
                                break;
                            case '|':
                                epipe++;
                                break;
                            case '7':
                                e7++;
                                break;
                            case 'F':
                                eF++;
                                break;
                            case 'L':
                                eL++;
                                break;
                            case 'J':
                                eJ++;
                        }
                    }
                    if (epipe > 0 && epipe % 2 == 0 && eL == eJ && eF == e7) {
                        block++;
                    }

                    if (block == 0 && (b1 + b2 + b3 + b4 == 4)) {
                        pp++;
                        mat[i][j] = 3;
                    }
                }
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }

        System.out.println(pp);
    }


    static class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
