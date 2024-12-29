package adventofcode.aoc2024.day14;

import java.util.ArrayList;
import java.util.List;


/**
 * https://adventofcode.com/2024/day/14
 */
public class Main {

    public static void main(String[] args) {
        String s =
                "p=2,4 v=2,-3\n" +
                        "p=0,4 v=3,-3\n" +
                        "p=6,3 v=-1,-3\n" +
                        "p=10,3 v=-1,2\n" +
                        "p=2,0 v=2,-1\n" +
                        "p=0,0 v=1,3\n" +
                        "p=3,0 v=-2,-2\n" +
                        "p=7,6 v=-1,-3\n" +
                        "p=3,0 v=-1,-2\n" +
                        "p=9,3 v=2,3\n" +
                        "p=7,3 v=-1,2\n" +
                        "p=9,5 v=-3,-3\n";

        String t = "p=91,23 v=98,-65\n" +
                "p=100,68 v=-43,14\n" +
                "p=33,76 v=55,34\n" +
                "p=83,21 v=14,67\n" +
                "p=59,43 v=-65,77\n" +
                "p=2,89 v=-53,61\n" +
                "p=22,83 v=44,85\n" +
                "p=54,82 v=13,72\n" +
                "p=72,70 v=-81,43\n" +
                "p=9,89 v=42,-76\n" +
                "p=80,10 v=-79,-19\n" +
                "p=65,86 v=-38,-35\n" +
                "p=67,41 v=-87,72\n" +
                "p=39,82 v=-20,-80\n" +
                "p=76,20 v=-4,98\n" +
                "p=44,22 v=56,63\n" +
                "p=91,13 v=-74,19\n" +
                "p=48,56 v=-15,69\n" +
                "p=61,30 v=99,74\n" +
                "p=10,38 v=55,80\n" +
                "p=24,61 v=59,-72\n" +
                "p=98,50 v=74,95\n" +
                "p=17,33 v=3,87\n" +
                "p=91,70 v=17,-7\n" +
                "p=79,92 v=31,-49\n" +
                "p=8,30 v=-73,-95\n" +
                "p=9,34 v=-83,-34\n" +
                "p=62,17 v=21,29\n" +
                "p=47,51 v=-56,38\n" +
                "p=57,64 v=86,96\n" +
                "p=92,1 v=18,43\n" +
                "p=16,72 v=89,-69\n" +
                "p=85,96 v=-23,-91\n" +
                "p=7,25 v=95,-50\n" +
                "p=95,71 v=30,-47\n" +
                "p=23,5 v=19,-91\n" +
                "p=79,40 v=87,73\n" +
                "p=12,84 v=63,6\n" +
                "p=30,79 v=-92,85\n" +
                "p=64,36 v=91,70\n" +
                "p=63,6 v=26,50\n" +
                "p=64,76 v=-41,-80\n" +
                "p=61,6 v=-10,-22\n" +
                "p=54,65 v=41,-68\n" +
                "p=95,101 v=-33,19\n" +
                "p=90,18 v=77,19\n" +
                "p=46,40 v=-91,66\n" +
                "p=11,10 v=-7,43\n" +
                "p=9,23 v=33,-48\n" +
                "p=72,59 v=-95,4\n" +
                "p=10,40 v=-98,-54\n" +
                "p=85,80 v=-3,82\n" +
                "p=56,45 v=-50,76\n" +
                "p=66,8 v=-55,67\n" +
                "p=34,101 v=75,-84\n" +
                "p=57,31 v=66,25\n" +
                "p=1,98 v=-78,71\n" +
                "p=95,62 v=-4,-85\n" +
                "p=68,34 v=6,4\n" +
                "p=64,83 v=-96,64\n" +
                "p=59,93 v=43,24\n" +
                "p=41,37 v=40,-37\n" +
                "p=53,71 v=-90,6\n" +
                "p=6,54 v=-38,-27\n" +
                "p=14,78 v=-98,-35\n" +
                "p=62,72 v=-19,-49\n" +
                "p=70,52 v=96,-83\n" +
                "p=8,71 v=-18,-4\n" +
                "p=75,67 v=-50,96\n" +
                "p=93,49 v=37,-30\n" +
                "p=37,67 v=-51,-10\n" +
                "p=41,19 v=-30,-23\n" +
                "p=10,13 v=79,-84\n" +
                "p=22,83 v=-26,-38\n" +
                "p=68,79 v=-85,-52\n" +
                "p=78,72 v=-65,-73\n" +
                "p=66,53 v=-60,-19\n" +
                "p=84,79 v=-99,-87\n" +
                "p=12,67 v=34,-10\n" +
                "p=77,17 v=67,-71\n" +
                "p=9,41 v=-93,-58\n" +
                "p=87,42 v=43,-23\n" +
                "p=88,90 v=27,16\n" +
                "p=11,28 v=-82,-19\n" +
                "p=44,68 v=56,58\n" +
                "p=1,89 v=-58,-87\n" +
                "p=6,68 v=85,-55\n" +
                "p=37,41 v=55,52\n" +
                "p=4,102 v=-47,-56\n" +
                "p=30,42 v=-77,-51\n" +
                "p=14,34 v=74,11\n" +
                "p=91,68 v=72,-28\n" +
                "p=28,6 v=-23,74\n" +
                "p=75,30 v=66,34\n" +
                "p=66,69 v=50,-79\n" +
                "p=92,86 v=-26,-82\n" +
                "p=67,32 v=82,80\n" +
                "p=44,80 v=-61,-28\n" +
                "p=86,55 v=22,-45\n" +
                "p=18,44 v=-11,56\n" +
                "p=41,76 v=25,5\n" +
                "p=81,1 v=80,-52\n" +
                "p=3,64 v=-83,-93\n" +
                "p=3,30 v=-83,1\n" +
                "p=100,86 v=-88,44\n" +
                "p=41,31 v=45,70\n" +
                "p=60,21 v=-65,-23\n" +
                "p=4,0 v=54,98\n" +
                "p=24,68 v=-98,-93\n" +
                "p=5,25 v=79,-81\n" +
                "p=39,44 v=26,-51\n" +
                "p=65,5 v=-49,81\n" +
                "p=50,2 v=-40,-25\n" +
                "p=96,100 v=-43,88\n" +
                "p=21,95 v=34,2\n" +
                "p=38,42 v=15,97\n" +
                "p=90,102 v=74,64\n" +
                "p=29,66 v=-58,-54\n" +
                "p=86,32 v=7,12\n" +
                "p=57,83 v=-50,-90\n" +
                "p=25,35 v=-77,11\n" +
                "p=97,102 v=47,-95\n" +
                "p=81,12 v=-54,-98\n" +
                "p=6,56 v=23,-51\n" +
                "p=80,102 v=-79,16\n" +
                "p=93,26 v=-83,83\n" +
                "p=32,86 v=23,-43\n" +
                "p=24,84 v=-52,-97\n" +
                "p=20,52 v=23,79\n" +
                "p=51,95 v=-96,88\n" +
                "p=23,89 v=69,3\n" +
                "p=42,23 v=-66,53\n" +
                "p=96,69 v=-28,65\n" +
                "p=23,50 v=99,41\n" +
                "p=97,77 v=94,-80\n" +
                "p=10,92 v=-63,19\n" +
                "p=70,32 v=92,1\n" +
                "p=7,66 v=-96,-67\n" +
                "p=77,14 v=-34,-37\n" +
                "p=99,46 v=41,25\n" +
                "p=61,39 v=-45,-27\n" +
                "p=76,80 v=-19,93\n" +
                "p=57,36 v=52,32\n" +
                "p=62,53 v=38,-67\n" +
                "p=83,11 v=39,-45\n" +
                "p=37,92 v=-46,23\n" +
                "p=81,39 v=-69,73\n" +
                "p=48,63 v=-5,-24\n" +
                "p=14,15 v=74,36\n" +
                "p=48,35 v=81,-30\n" +
                "p=31,50 v=-21,-10\n" +
                "p=87,93 v=-83,33\n" +
                "p=46,101 v=-55,35\n" +
                "p=79,96 v=-94,54\n" +
                "p=71,31 v=1,-23\n" +
                "p=14,51 v=44,76\n" +
                "p=42,20 v=-91,14\n" +
                "p=0,21 v=-48,87\n" +
                "p=61,24 v=-28,-26\n" +
                "p=48,27 v=-91,8\n" +
                "p=84,78 v=-49,-90\n" +
                "p=35,66 v=-77,13\n" +
                "p=81,30 v=52,39\n" +
                "p=66,76 v=85,5\n" +
                "p=19,45 v=80,-78\n" +
                "p=51,77 v=-55,-79\n" +
                "p=59,2 v=82,36\n" +
                "p=22,83 v=22,-65\n" +
                "p=82,17 v=52,15\n" +
                "p=84,61 v=-49,52\n" +
                "p=19,46 v=80,90\n" +
                "p=35,81 v=71,-13\n" +
                "p=94,24 v=78,91\n" +
                "p=19,33 v=8,61\n" +
                "p=47,25 v=69,-96\n" +
                "p=6,8 v=-2,-60\n" +
                "p=9,20 v=-22,-19\n" +
                "p=68,0 v=21,-5\n" +
                "p=30,15 v=-97,84\n" +
                "p=9,59 v=-19,-84\n" +
                "p=77,35 v=57,35\n" +
                "p=91,54 v=-13,-31\n" +
                "p=53,69 v=81,-69\n" +
                "p=27,41 v=-54,33\n" +
                "p=28,69 v=-67,65\n" +
                "p=23,58 v=60,-48\n" +
                "p=35,16 v=35,36\n" +
                "p=39,84 v=-84,-18\n" +
                "p=41,82 v=45,71\n" +
                "p=34,48 v=16,61\n" +
                "p=22,1 v=39,-87\n" +
                "p=42,85 v=-76,68\n" +
                "p=5,52 v=18,-34\n" +
                "p=19,58 v=-62,-34\n" +
                "p=60,4 v=-30,26\n" +
                "p=32,43 v=4,-92\n" +
                "p=10,38 v=-78,1\n" +
                "p=54,76 v=-46,6\n" +
                "p=9,93 v=-17,-39\n" +
                "p=93,27 v=-61,-89\n" +
                "p=39,89 v=93,6\n" +
                "p=23,69 v=8,55\n" +
                "p=23,8 v=-52,43\n" +
                "p=29,96 v=4,57\n" +
                "p=88,49 v=2,93\n" +
                "p=37,49 v=20,-36\n" +
                "p=48,84 v=85,82\n" +
                "p=62,101 v=6,16\n" +
                "p=79,82 v=-39,-4\n" +
                "p=10,71 v=-12,-4\n" +
                "p=35,42 v=-31,-61\n" +
                "p=2,95 v=-50,53\n" +
                "p=44,26 v=-97,-13\n" +
                "p=2,36 v=84,-89\n" +
                "p=3,64 v=-25,-39\n" +
                "p=35,23 v=4,67\n" +
                "p=38,102 v=-26,-53\n" +
                "p=11,70 v=-22,-4\n" +
                "p=41,42 v=-97,55\n" +
                "p=59,76 v=52,-82\n" +
                "p=39,23 v=29,53\n" +
                "p=7,46 v=-47,1\n" +
                "p=82,27 v=-84,32\n" +
                "p=56,20 v=26,-5\n" +
                "p=76,33 v=16,-58\n" +
                "p=87,46 v=-74,-68\n" +
                "p=63,3 v=97,2\n" +
                "p=71,15 v=-30,22\n" +
                "p=37,6 v=80,5\n" +
                "p=39,66 v=60,51\n" +
                "p=85,62 v=-40,94\n" +
                "p=26,97 v=41,-51\n" +
                "p=84,63 v=-86,69\n" +
                "p=23,59 v=-97,-96\n" +
                "p=93,32 v=77,-47\n" +
                "p=88,1 v=-23,64\n" +
                "p=14,36 v=-67,-49\n" +
                "p=40,94 v=-25,78\n" +
                "p=54,54 v=-47,1\n" +
                "p=96,31 v=93,90\n" +
                "p=91,21 v=-94,-57\n" +
                "p=88,23 v=25,21\n" +
                "p=12,64 v=16,-8\n" +
                "p=75,17 v=-73,70\n" +
                "p=32,9 v=38,-36\n" +
                "p=37,2 v=80,64\n" +
                "p=72,69 v=66,62\n" +
                "p=52,98 v=-23,42\n" +
                "p=10,74 v=36,38\n" +
                "p=33,6 v=-42,-87\n" +
                "p=83,55 v=22,-48\n" +
                "p=59,80 v=-80,76\n" +
                "p=1,32 v=-70,-30\n" +
                "p=34,49 v=33,-58\n" +
                "p=28,25 v=34,74\n" +
                "p=57,43 v=50,23\n" +
                "p=7,12 v=53,9\n" +
                "p=54,30 v=-95,-9\n" +
                "p=11,91 v=28,37\n" +
                "p=70,38 v=-9,-92\n" +
                "p=30,15 v=25,77\n" +
                "p=88,63 v=-98,39\n" +
                "p=40,15 v=-51,-19\n" +
                "p=100,26 v=28,-88\n" +
                "p=68,30 v=-90,66\n" +
                "p=44,80 v=-56,54\n" +
                "p=11,58 v=39,42\n" +
                "p=62,85 v=67,13\n" +
                "p=92,6 v=2,-88\n" +
                "p=71,98 v=-30,-5\n" +
                "p=99,33 v=-69,-13\n" +
                "p=90,84 v=-87,76\n" +
                "p=23,71 v=24,27\n" +
                "p=62,61 v=16,-35\n" +
                "p=42,57 v=-86,-34\n" +
                "p=28,66 v=-16,-7\n" +
                "p=88,94 v=-99,78\n" +
                "p=95,42 v=51,-82\n" +
                "p=82,50 v=52,4\n" +
                "p=1,69 v=-53,-21\n" +
                "p=37,21 v=91,-37\n" +
                "p=30,2 v=-32,-81\n" +
                "p=18,59 v=-7,-96\n" +
                "p=40,28 v=-56,94\n" +
                "p=45,66 v=50,-31\n" +
                "p=39,79 v=-41,-42\n" +
                "p=75,68 v=97,-42\n" +
                "p=27,22 v=-21,-33\n" +
                "p=6,15 v=-34,-68\n" +
                "p=28,94 v=-65,-7\n" +
                "p=48,25 v=-15,63\n" +
                "p=77,51 v=-85,-54\n" +
                "p=36,53 v=-48,-7\n" +
                "p=15,38 v=-73,-41\n" +
                "p=24,73 v=-23,2\n" +
                "p=17,15 v=-37,63\n" +
                "p=12,59 v=-33,57\n" +
                "p=45,66 v=-96,10\n" +
                "p=27,98 v=-67,71\n" +
                "p=88,66 v=-14,79\n" +
                "p=59,12 v=91,36\n" +
                "p=7,29 v=3,15\n" +
                "p=44,90 v=-76,47\n" +
                "p=77,45 v=67,-23\n" +
                "p=14,62 v=-47,-86\n" +
                "p=28,90 v=-77,-80\n" +
                "p=65,17 v=-80,70\n" +
                "p=63,47 v=62,-99\n" +
                "p=47,30 v=-71,97\n" +
                "p=7,47 v=-58,83\n" +
                "p=2,57 v=12,-3\n" +
                "p=57,71 v=70,47\n" +
                "p=56,26 v=94,55\n" +
                "p=66,97 v=-71,45\n" +
                "p=41,54 v=-30,-86\n" +
                "p=31,85 v=-26,47\n" +
                "p=63,55 v=-39,48\n" +
                "p=6,84 v=28,-66\n" +
                "p=64,62 v=-50,86\n" +
                "p=51,49 v=91,-82\n" +
                "p=19,95 v=44,30\n" +
                "p=54,98 v=96,-32\n" +
                "p=71,65 v=54,42\n" +
                "p=97,72 v=83,-21\n" +
                "p=71,19 v=-95,-9\n" +
                "p=59,45 v=51,83\n" +
                "p=85,18 v=37,-53\n" +
                "p=59,58 v=-60,86\n" +
                "p=96,63 v=68,-89\n" +
                "p=53,25 v=58,-22\n" +
                "p=95,72 v=52,7\n" +
                "p=10,0 v=-83,16\n" +
                "p=48,50 v=-16,-44\n" +
                "p=25,27 v=-30,45\n" +
                "p=79,33 v=73,44\n" +
                "p=40,3 v=-36,-70\n" +
                "p=68,85 v=-64,-72\n" +
                "p=86,73 v=-9,-72\n" +
                "p=25,53 v=50,90\n" +
                "p=64,41 v=68,-76\n" +
                "p=85,42 v=-69,-61\n" +
                "p=84,57 v=-10,-73\n" +
                "p=36,53 v=-89,22\n" +
                "p=24,55 v=54,-17\n" +
                "p=1,97 v=-43,93\n" +
                "p=29,1 v=95,-49\n" +
                "p=19,22 v=28,90\n" +
                "p=73,59 v=18,-7\n" +
                "p=65,36 v=41,48\n" +
                "p=22,50 v=-57,-72\n" +
                "p=61,36 v=11,56\n" +
                "p=18,96 v=-68,-1\n" +
                "p=88,18 v=-89,5\n" +
                "p=73,2 v=36,68\n" +
                "p=24,99 v=49,88\n" +
                "p=43,50 v=-5,-20\n" +
                "p=34,99 v=95,-56\n" +
                "p=9,2 v=48,-52\n" +
                "p=68,39 v=-55,-30\n" +
                "p=33,99 v=-42,12\n" +
                "p=80,26 v=52,-23\n" +
                "p=31,70 v=19,-7\n" +
                "p=75,27 v=23,-69\n" +
                "p=41,8 v=40,-22\n" +
                "p=2,36 v=-28,-89\n" +
                "p=13,92 v=49,-38\n" +
                "p=25,60 v=-82,96\n" +
                "p=7,33 v=-83,11\n" +
                "p=58,63 v=56,-65\n" +
                "p=62,85 v=-85,68\n" +
                "p=97,16 v=-18,-50\n" +
                "p=48,34 v=-47,43\n" +
                "p=43,82 v=-71,20\n" +
                "p=63,55 v=-60,-17\n" +
                "p=28,62 v=-75,-70\n" +
                "p=7,52 v=-12,47\n" +
                "p=72,73 v=66,-4\n" +
                "p=98,33 v=68,-64\n" +
                "p=87,51 v=-79,-89\n" +
                "p=98,63 v=-58,-72\n" +
                "p=57,22 v=-15,87\n" +
                "p=11,20 v=42,-63\n" +
                "p=72,10 v=66,-67\n" +
                "p=28,20 v=-87,1\n" +
                "p=22,5 v=-90,29\n" +
                "p=23,30 v=66,30\n" +
                "p=38,26 v=-21,32\n" +
                "p=90,87 v=-28,58\n" +
                "p=71,94 v=22,13\n" +
                "p=32,32 v=24,-71\n" +
                "p=9,30 v=69,29\n" +
                "p=34,64 v=-11,17\n" +
                "p=80,35 v=78,63\n" +
                "p=39,93 v=72,-8\n" +
                "p=63,94 v=-42,96\n" +
                "p=85,26 v=-69,-31\n" +
                "p=5,100 v=-22,5\n" +
                "p=96,37 v=99,-85\n" +
                "p=55,51 v=43,5\n" +
                "p=20,58 v=84,93\n" +
                "p=1,29 v=41,82\n" +
                "p=83,73 v=-79,-62\n" +
                "p=71,98 v=21,23\n" +
                "p=49,72 v=-87,-38\n" +
                "p=0,63 v=-50,62\n" +
                "p=69,50 v=68,34\n" +
                "p=94,37 v=48,38\n" +
                "p=5,28 v=-53,63\n" +
                "p=99,58 v=-15,44\n" +
                "p=1,86 v=-78,34\n" +
                "p=25,25 v=69,-91\n" +
                "p=15,13 v=-57,-19\n" +
                "p=68,59 v=92,-17\n" +
                "p=7,65 v=-58,72\n" +
                "p=90,88 v=-83,83\n" +
                "p=31,60 v=69,-40\n" +
                "p=83,60 v=52,-55\n" +
                "p=16,63 v=86,-5\n" +
                "p=21,19 v=-82,-85\n" +
                "p=4,74 v=-12,-1\n" +
                "p=51,76 v=-73,-63\n" +
                "p=71,67 v=26,41\n" +
                "p=3,86 v=-88,6\n" +
                "p=5,65 v=73,31\n" +
                "p=79,66 v=-44,-96\n" +
                "p=80,79 v=39,49\n" +
                "p=24,66 v=-25,64\n" +
                "p=0,1 v=2,-49\n" +
                "p=40,21 v=-25,97\n" +
                "p=97,47 v=-28,90\n" +
                "p=97,70 v=-61,-99\n" +
                "p=12,42 v=-38,-44\n" +
                "p=42,39 v=-86,42\n" +
                "p=17,28 v=94,-16\n" +
                "p=68,50 v=37,4\n" +
                "p=31,46 v=-81,-89\n" +
                "p=95,74 v=-23,-28\n" +
                "p=24,35 v=-82,-23\n" +
                "p=53,27 v=54,27\n" +
                "p=26,17 v=95,-57\n" +
                "p=77,92 v=37,54\n" +
                "p=99,33 v=68,-30\n" +
                "p=46,100 v=20,19\n" +
                "p=64,22 v=-95,43\n" +
                "p=9,94 v=-88,6\n" +
                "p=44,78 v=70,-52\n" +
                "p=100,67 v=38,-66\n" +
                "p=31,79 v=90,16\n" +
                "p=57,67 v=40,-86\n" +
                "p=79,48 v=67,-96\n" +
                "p=46,100 v=73,44\n" +
                "p=26,18 v=-7,80\n" +
                "p=60,84 v=21,-59\n" +
                "p=18,16 v=64,17\n" +
                "p=48,81 v=91,-35\n" +
                "p=54,9 v=-10,43\n" +
                "p=34,58 v=-16,31\n" +
                "p=33,0 v=-77,-63\n" +
                "p=90,1 v=-36,-27\n" +
                "p=53,68 v=71,34\n" +
                "p=37,60 v=75,-93\n" +
                "p=49,8 v=30,-40\n" +
                "p=10,102 v=94,19\n" +
                "p=78,54 v=60,-21\n" +
                "p=42,52 v=35,48\n" +
                "p=98,69 v=66,-32\n" +
                "p=89,98 v=-47,80\n" +
                "p=44,8 v=56,70\n" +
                "p=67,8 v=97,26\n" +
                "p=7,81 v=65,39\n" +
                "p=87,38 v=23,97\n" +
                "p=95,11 v=87,-5\n" +
                "p=23,13 v=14,80\n" +
                "p=98,13 v=84,34\n" +
                "p=1,57 v=-22,3\n" +
                "p=22,10 v=81,-8\n" +
                "p=75,14 v=-44,-26\n" +
                "p=7,75 v=3,-80\n" +
                "p=1,20 v=-58,84\n" +
                "p=20,12 v=79,-60\n" +
                "p=80,8 v=78,-36\n" +
                "p=41,66 v=64,-33\n" +
                "p=82,30 v=-59,63\n" +
                "p=95,50 v=53,-84\n" +
                "p=27,0 v=-87,40\n" +
                "p=58,18 v=-25,53\n" +
                "p=50,34 v=65,22\n" +
                "p=6,41 v=50,37\n" +
                "p=3,72 v=-56,-25\n" +
                "p=85,1 v=67,-15\n" +
                "p=63,52 v=34,-93\n" +
                "p=28,72 v=4,-35\n" +
                "p=59,102 v=-71,-39\n" +
                "p=26,16 v=24,49\n" +
                "p=10,97 v=-3,90\n" +
                "p=22,82 v=-32,88\n" +
                "p=47,25 v=-96,-16\n" +
                "p=58,102 v=72,-78\n" +
                "p=26,92 v=76,-72\n" +
                "p=28,22 v=34,-2\n";


        int length = 101;
        int width = 103;

        List<Robot> robots = new ArrayList<>();
        String[] ss = t.split("\n");
        int[][] mat = new int[width][length];

        for (int i = 0; i < ss.length; i++) {
            int x = Integer.parseInt(ss[i].split("p=")[1].split(" ")[0].split(",")[0]);
            int y = Integer.parseInt(ss[i].split("p=")[1].split(" ")[0].split(",")[1]);
            int vx = Integer.parseInt(ss[i].split("v=")[1].split(",")[0]);
            int vy = Integer.parseInt(ss[i].split("v=")[1].split(",")[1]);
            robots.add(new Robot(x, y, vx, vy));
        }

        for (Robot robot : robots) {
            int x = robot.x;
            int y = robot.y;
            for (int i = 0; i < 100; i++) {
                x += robot.vx;
                y += robot.vy;
            }
            x += 10000 * length;
            y += 10000 * width;
            mat[y % width][x % length]++;
//            System.out.println("here");
        }

        // NW
        int q1 = 0, q2 = 0, q3 = 0, q4 = 0;
        for (int i = 0; i < width / 2; i++) {
            for (int j = 0; j < length / 2; j++) {
                if (mat[i][j] > 0) {
                    q1 += mat[i][j];
                }
            }
        }
        //SW
        for (int i = width / 2 + 1; i < width; i++) {
            for (int j = 0; j < length / 2; j++) {
                if (mat[i][j] > 0) {
                    q2 += mat[i][j];
                }
            }
        }

        //NE
        for (int i = 0; i < width / 2; i++) {
            for (int j = length / 2 + 1; j < length; j++) {
                if (mat[i][j] > 0) {
                    q3 += mat[i][j];
                }
            }
        }

        //SE
        for (int i = width / 2 + 1; i < width; i++) {
            for (int j = length / 2 + 1; j < length; j++) {
                if (mat[i][j] > 0) {
                    q4 += mat[i][j];
                }
            }
        }

        System.out.println("here");
        System.out.println(q1 * q2 * q3 * q4);
    }

    static class Robot {
        int x;
        int y;
        int vx;
        int vy;

        public Robot(int x, int y, int vx, int vy) {
            this.x = x;
            this.y = y;
            this.vx = vx;
            this.vy = vy;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getVx() {
            return vx;
        }

        public void setVx(int vx) {
            this.vx = vx;
        }

        public int getVy() {
            return vy;
        }

        public void setVy(int vy) {
            this.vy = vy;
        }
    }

}