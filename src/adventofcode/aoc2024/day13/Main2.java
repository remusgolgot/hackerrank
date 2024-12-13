package adventofcode.aoc2024.day13;

import java.util.ArrayList;
import java.util.List;


/**
 * https://adventofcode.com/2024/day/13
 */
public class Main2 {


    public static void main(String[] args) {

        String u = "Button A: X+94, Y+34\n" +
                "Button B: X+22, Y+67\n" +
                "Prize: X=8400, Y=5400\n" +
                "\n" +
                "Button A: X+26, Y+66\n" +
                "Button B: X+67, Y+21\n" +
                "Prize: X=12748, Y=12176\n" +
                "\n" +
                "Button A: X+17, Y+86\n" +
                "Button B: X+84, Y+37\n" +
                "Prize: X=7870, Y=6450\n" +
                "\n" +
                "Button A: X+69, Y+23\n" +
                "Button B: X+27, Y+71\n" +
                "Prize: X=18641, Y=10279\n";

        String s = "Button A: X+63, Y+14\n" +
                "Button B: X+12, Y+37\n" +
                "Prize: X=5921, Y=10432\n" +
                "\n" +
                "Button A: X+48, Y+23\n" +
                "Button B: X+38, Y+74\n" +
                "Prize: X=1820, Y=1430\n" +
                "\n" +
                "Button A: X+17, Y+64\n" +
                "Button B: X+72, Y+31\n" +
                "Prize: X=1801, Y=2437\n" +
                "\n" +
                "Button A: X+76, Y+21\n" +
                "Button B: X+20, Y+53\n" +
                "Prize: X=4836, Y=1811\n" +
                "\n" +
                "Button A: X+53, Y+18\n" +
                "Button B: X+30, Y+54\n" +
                "Prize: X=692, Y=17702\n" +
                "\n" +
                "Button A: X+99, Y+33\n" +
                "Button B: X+58, Y+70\n" +
                "Prize: X=10829, Y=7967\n" +
                "\n" +
                "Button A: X+15, Y+42\n" +
                "Button B: X+33, Y+13\n" +
                "Prize: X=8585, Y=18017\n" +
                "\n" +
                "Button A: X+17, Y+70\n" +
                "Button B: X+50, Y+14\n" +
                "Prize: X=14945, Y=12142\n" +
                "\n" +
                "Button A: X+80, Y+99\n" +
                "Button B: X+81, Y+31\n" +
                "Prize: X=10257, Y=5977\n" +
                "\n" +
                "Button A: X+62, Y+27\n" +
                "Button B: X+11, Y+34\n" +
                "Prize: X=13026, Y=6898\n" +
                "\n" +
                "Button A: X+12, Y+36\n" +
                "Button B: X+62, Y+19\n" +
                "Prize: X=2540, Y=4934\n" +
                "\n" +
                "Button A: X+13, Y+65\n" +
                "Button B: X+73, Y+66\n" +
                "Prize: X=5014, Y=7728\n" +
                "\n" +
                "Button A: X+60, Y+21\n" +
                "Button B: X+21, Y+43\n" +
                "Prize: X=16754, Y=1966\n" +
                "\n" +
                "Button A: X+89, Y+33\n" +
                "Button B: X+11, Y+54\n" +
                "Prize: X=3645, Y=2949\n" +
                "\n" +
                "Button A: X+56, Y+20\n" +
                "Button B: X+24, Y+48\n" +
                "Prize: X=1264, Y=11536\n" +
                "\n" +
                "Button A: X+68, Y+21\n" +
                "Button B: X+15, Y+42\n" +
                "Prize: X=17409, Y=746\n" +
                "\n" +
                "Button A: X+23, Y+66\n" +
                "Button B: X+75, Y+32\n" +
                "Prize: X=11223, Y=3354\n" +
                "\n" +
                "Button A: X+19, Y+58\n" +
                "Button B: X+47, Y+18\n" +
                "Prize: X=6869, Y=7398\n" +
                "\n" +
                "Button A: X+28, Y+47\n" +
                "Button B: X+46, Y+18\n" +
                "Prize: X=12204, Y=3852\n" +
                "\n" +
                "Button A: X+25, Y+57\n" +
                "Button B: X+43, Y+11\n" +
                "Prize: X=3309, Y=15501\n" +
                "\n" +
                "Button A: X+95, Y+55\n" +
                "Button B: X+32, Y+79\n" +
                "Prize: X=5845, Y=6710\n" +
                "\n" +
                "Button A: X+18, Y+12\n" +
                "Button B: X+43, Y+93\n" +
                "Prize: X=2658, Y=4860\n" +
                "\n" +
                "Button A: X+88, Y+12\n" +
                "Button B: X+86, Y+83\n" +
                "Prize: X=3684, Y=930\n" +
                "\n" +
                "Button A: X+51, Y+18\n" +
                "Button B: X+44, Y+75\n" +
                "Prize: X=19780, Y=17984\n" +
                "\n" +
                "Button A: X+59, Y+30\n" +
                "Button B: X+19, Y+55\n" +
                "Prize: X=13898, Y=19160\n" +
                "\n" +
                "Button A: X+12, Y+51\n" +
                "Button B: X+49, Y+15\n" +
                "Prize: X=15071, Y=17144\n" +
                "\n" +
                "Button A: X+22, Y+46\n" +
                "Button B: X+70, Y+45\n" +
                "Prize: X=10238, Y=3734\n" +
                "\n" +
                "Button A: X+24, Y+47\n" +
                "Button B: X+84, Y+35\n" +
                "Prize: X=6444, Y=3684\n" +
                "\n" +
                "Button A: X+32, Y+15\n" +
                "Button B: X+24, Y+49\n" +
                "Prize: X=18208, Y=2148\n" +
                "\n" +
                "Button A: X+11, Y+67\n" +
                "Button B: X+51, Y+11\n" +
                "Prize: X=10173, Y=645\n" +
                "\n" +
                "Button A: X+57, Y+28\n" +
                "Button B: X+22, Y+41\n" +
                "Prize: X=9124, Y=4647\n" +
                "\n" +
                "Button A: X+13, Y+58\n" +
                "Button B: X+51, Y+13\n" +
                "Prize: X=9979, Y=12131\n" +
                "\n" +
                "Button A: X+27, Y+95\n" +
                "Button B: X+94, Y+60\n" +
                "Prize: X=2096, Y=1960\n" +
                "\n" +
                "Button A: X+43, Y+11\n" +
                "Button B: X+36, Y+75\n" +
                "Prize: X=16958, Y=1706\n" +
                "\n" +
                "Button A: X+54, Y+35\n" +
                "Button B: X+12, Y+85\n" +
                "Prize: X=5958, Y=9190\n" +
                "\n" +
                "Button A: X+40, Y+11\n" +
                "Button B: X+19, Y+49\n" +
                "Prize: X=12563, Y=11351\n" +
                "\n" +
                "Button A: X+12, Y+65\n" +
                "Button B: X+62, Y+24\n" +
                "Prize: X=14148, Y=17166\n" +
                "\n" +
                "Button A: X+77, Y+84\n" +
                "Button B: X+82, Y+17\n" +
                "Prize: X=9019, Y=4115\n" +
                "\n" +
                "Button A: X+20, Y+11\n" +
                "Button B: X+25, Y+56\n" +
                "Prize: X=5480, Y=6240\n" +
                "\n" +
                "Button A: X+14, Y+62\n" +
                "Button B: X+40, Y+13\n" +
                "Prize: X=3306, Y=1887\n" +
                "\n" +
                "Button A: X+19, Y+49\n" +
                "Button B: X+34, Y+13\n" +
                "Prize: X=3547, Y=5488\n" +
                "\n" +
                "Button A: X+85, Y+19\n" +
                "Button B: X+14, Y+89\n" +
                "Prize: X=5778, Y=2322\n" +
                "\n" +
                "Button A: X+57, Y+82\n" +
                "Button B: X+67, Y+31\n" +
                "Prize: X=8692, Y=6358\n" +
                "\n" +
                "Button A: X+76, Y+11\n" +
                "Button B: X+20, Y+76\n" +
                "Prize: X=16664, Y=5282\n" +
                "\n" +
                "Button A: X+73, Y+14\n" +
                "Button B: X+25, Y+29\n" +
                "Prize: X=3114, Y=2340\n" +
                "\n" +
                "Button A: X+91, Y+60\n" +
                "Button B: X+12, Y+27\n" +
                "Prize: X=2905, Y=3786\n" +
                "\n" +
                "Button A: X+54, Y+12\n" +
                "Button B: X+14, Y+80\n" +
                "Prize: X=11888, Y=6320\n" +
                "\n" +
                "Button A: X+51, Y+25\n" +
                "Button B: X+49, Y+98\n" +
                "Prize: X=6132, Y=10108\n" +
                "\n" +
                "Button A: X+16, Y+67\n" +
                "Button B: X+43, Y+15\n" +
                "Prize: X=11996, Y=4341\n" +
                "\n" +
                "Button A: X+33, Y+66\n" +
                "Button B: X+36, Y+11\n" +
                "Prize: X=16502, Y=13454\n" +
                "\n" +
                "Button A: X+32, Y+42\n" +
                "Button B: X+96, Y+37\n" +
                "Prize: X=4960, Y=4196\n" +
                "\n" +
                "Button A: X+50, Y+27\n" +
                "Button B: X+13, Y+35\n" +
                "Prize: X=5495, Y=3285\n" +
                "\n" +
                "Button A: X+12, Y+39\n" +
                "Button B: X+42, Y+13\n" +
                "Prize: X=10070, Y=471\n" +
                "\n" +
                "Button A: X+74, Y+52\n" +
                "Button B: X+13, Y+36\n" +
                "Prize: X=3061, Y=7244\n" +
                "\n" +
                "Button A: X+41, Y+72\n" +
                "Button B: X+43, Y+14\n" +
                "Prize: X=7933, Y=19074\n" +
                "\n" +
                "Button A: X+29, Y+58\n" +
                "Button B: X+60, Y+17\n" +
                "Prize: X=6839, Y=3481\n" +
                "\n" +
                "Button A: X+62, Y+33\n" +
                "Button B: X+16, Y+55\n" +
                "Prize: X=18434, Y=17183\n" +
                "\n" +
                "Button A: X+56, Y+57\n" +
                "Button B: X+19, Y+78\n" +
                "Prize: X=3999, Y=8118\n" +
                "\n" +
                "Button A: X+13, Y+78\n" +
                "Button B: X+93, Y+27\n" +
                "Prize: X=2304, Y=2673\n" +
                "\n" +
                "Button A: X+50, Y+20\n" +
                "Button B: X+12, Y+43\n" +
                "Prize: X=1330, Y=2930\n" +
                "\n" +
                "Button A: X+40, Y+98\n" +
                "Button B: X+46, Y+28\n" +
                "Prize: X=4532, Y=7546\n" +
                "\n" +
                "Button A: X+11, Y+16\n" +
                "Button B: X+32, Y+15\n" +
                "Prize: X=1004, Y=18942\n" +
                "\n" +
                "Button A: X+40, Y+14\n" +
                "Button B: X+31, Y+54\n" +
                "Prize: X=12706, Y=17506\n" +
                "\n" +
                "Button A: X+20, Y+37\n" +
                "Button B: X+55, Y+19\n" +
                "Prize: X=15140, Y=6215\n" +
                "\n" +
                "Button A: X+95, Y+39\n" +
                "Button B: X+13, Y+64\n" +
                "Prize: X=5747, Y=7287\n" +
                "\n" +
                "Button A: X+35, Y+68\n" +
                "Button B: X+48, Y+20\n" +
                "Prize: X=17403, Y=2672\n" +
                "\n" +
                "Button A: X+14, Y+35\n" +
                "Button B: X+60, Y+37\n" +
                "Prize: X=6716, Y=5474\n" +
                "\n" +
                "Button A: X+21, Y+44\n" +
                "Button B: X+26, Y+11\n" +
                "Prize: X=13336, Y=6502\n" +
                "\n" +
                "Button A: X+12, Y+73\n" +
                "Button B: X+49, Y+13\n" +
                "Prize: X=8933, Y=11056\n" +
                "\n" +
                "Button A: X+56, Y+79\n" +
                "Button B: X+96, Y+42\n" +
                "Prize: X=5384, Y=3391\n" +
                "\n" +
                "Button A: X+73, Y+31\n" +
                "Button B: X+19, Y+62\n" +
                "Prize: X=10634, Y=16142\n" +
                "\n" +
                "Button A: X+41, Y+64\n" +
                "Button B: X+67, Y+26\n" +
                "Prize: X=8227, Y=7184\n" +
                "\n" +
                "Button A: X+23, Y+42\n" +
                "Button B: X+29, Y+12\n" +
                "Prize: X=15139, Y=4604\n" +
                "\n" +
                "Button A: X+56, Y+30\n" +
                "Button B: X+23, Y+49\n" +
                "Prize: X=5897, Y=14529\n" +
                "\n" +
                "Button A: X+15, Y+24\n" +
                "Button B: X+45, Y+19\n" +
                "Prize: X=4595, Y=5858\n" +
                "\n" +
                "Button A: X+15, Y+44\n" +
                "Button B: X+71, Y+46\n" +
                "Prize: X=5683, Y=9788\n" +
                "\n" +
                "Button A: X+30, Y+62\n" +
                "Button B: X+47, Y+30\n" +
                "Prize: X=1449, Y=1182\n" +
                "\n" +
                "Button A: X+22, Y+50\n" +
                "Button B: X+61, Y+23\n" +
                "Prize: X=13134, Y=8314\n" +
                "\n" +
                "Button A: X+14, Y+55\n" +
                "Button B: X+71, Y+25\n" +
                "Prize: X=1105, Y=12165\n" +
                "\n" +
                "Button A: X+16, Y+38\n" +
                "Button B: X+47, Y+27\n" +
                "Prize: X=14274, Y=14866\n" +
                "\n" +
                "Button A: X+72, Y+13\n" +
                "Button B: X+18, Y+62\n" +
                "Prize: X=16262, Y=5148\n" +
                "\n" +
                "Button A: X+30, Y+72\n" +
                "Button B: X+38, Y+15\n" +
                "Prize: X=3466, Y=3594\n" +
                "\n" +
                "Button A: X+27, Y+64\n" +
                "Button B: X+62, Y+26\n" +
                "Prize: X=8459, Y=16958\n" +
                "\n" +
                "Button A: X+18, Y+50\n" +
                "Button B: X+66, Y+35\n" +
                "Prize: X=17492, Y=13125\n" +
                "\n" +
                "Button A: X+94, Y+16\n" +
                "Button B: X+98, Y+86\n" +
                "Prize: X=5924, Y=2672\n" +
                "\n" +
                "Button A: X+51, Y+12\n" +
                "Button B: X+14, Y+26\n" +
                "Prize: X=368, Y=4586\n" +
                "\n" +
                "Button A: X+73, Y+24\n" +
                "Button B: X+47, Y+99\n" +
                "Prize: X=6932, Y=4869\n" +
                "\n" +
                "Button A: X+41, Y+18\n" +
                "Button B: X+12, Y+52\n" +
                "Prize: X=3183, Y=15770\n" +
                "\n" +
                "Button A: X+31, Y+14\n" +
                "Button B: X+42, Y+73\n" +
                "Prize: X=1830, Y=1745\n" +
                "\n" +
                "Button A: X+56, Y+20\n" +
                "Button B: X+18, Y+62\n" +
                "Prize: X=16986, Y=15838\n" +
                "\n" +
                "Button A: X+16, Y+35\n" +
                "Button B: X+33, Y+23\n" +
                "Prize: X=17558, Y=5165\n" +
                "\n" +
                "Button A: X+84, Y+57\n" +
                "Button B: X+11, Y+31\n" +
                "Prize: X=8262, Y=3847\n" +
                "\n" +
                "Button A: X+85, Y+12\n" +
                "Button B: X+67, Y+81\n" +
                "Prize: X=8788, Y=6177\n" +
                "\n" +
                "Button A: X+46, Y+11\n" +
                "Button B: X+31, Y+68\n" +
                "Prize: X=18210, Y=8428\n" +
                "\n" +
                "Button A: X+50, Y+12\n" +
                "Button B: X+18, Y+76\n" +
                "Prize: X=11006, Y=10004\n" +
                "\n" +
                "Button A: X+14, Y+94\n" +
                "Button B: X+59, Y+73\n" +
                "Prize: X=1505, Y=3319\n" +
                "\n" +
                "Button A: X+16, Y+25\n" +
                "Button B: X+60, Y+14\n" +
                "Prize: X=5384, Y=2511\n" +
                "\n" +
                "Button A: X+40, Y+54\n" +
                "Button B: X+34, Y+13\n" +
                "Prize: X=420, Y=8904\n" +
                "\n" +
                "Button A: X+39, Y+65\n" +
                "Button B: X+40, Y+21\n" +
                "Prize: X=14227, Y=9457\n" +
                "\n" +
                "Button A: X+59, Y+56\n" +
                "Button B: X+88, Y+15\n" +
                "Prize: X=4145, Y=1947\n" +
                "\n" +
                "Button A: X+14, Y+54\n" +
                "Button B: X+66, Y+23\n" +
                "Prize: X=11230, Y=7239\n" +
                "\n" +
                "Button A: X+18, Y+53\n" +
                "Button B: X+56, Y+19\n" +
                "Prize: X=13534, Y=15652\n" +
                "\n" +
                "Button A: X+46, Y+18\n" +
                "Button B: X+16, Y+49\n" +
                "Prize: X=13450, Y=1538\n" +
                "\n" +
                "Button A: X+11, Y+49\n" +
                "Button B: X+57, Y+20\n" +
                "Prize: X=14617, Y=17561\n" +
                "\n" +
                "Button A: X+20, Y+62\n" +
                "Button B: X+91, Y+79\n" +
                "Prize: X=4726, Y=5308\n" +
                "\n" +
                "Button A: X+60, Y+39\n" +
                "Button B: X+24, Y+49\n" +
                "Prize: X=3008, Y=4805\n" +
                "\n" +
                "Button A: X+72, Y+25\n" +
                "Button B: X+17, Y+65\n" +
                "Prize: X=2880, Y=12150\n" +
                "\n" +
                "Button A: X+38, Y+84\n" +
                "Button B: X+91, Y+29\n" +
                "Prize: X=2180, Y=3786\n" +
                "\n" +
                "Button A: X+29, Y+91\n" +
                "Button B: X+30, Y+21\n" +
                "Prize: X=1955, Y=5257\n" +
                "\n" +
                "Button A: X+14, Y+25\n" +
                "Button B: X+29, Y+17\n" +
                "Prize: X=18496, Y=14119\n" +
                "\n" +
                "Button A: X+16, Y+63\n" +
                "Button B: X+75, Y+14\n" +
                "Prize: X=3515, Y=12576\n" +
                "\n" +
                "Button A: X+23, Y+11\n" +
                "Button B: X+36, Y+58\n" +
                "Prize: X=15711, Y=15311\n" +
                "\n" +
                "Button A: X+75, Y+29\n" +
                "Button B: X+12, Y+83\n" +
                "Prize: X=3159, Y=5688\n" +
                "\n" +
                "Button A: X+40, Y+26\n" +
                "Button B: X+12, Y+32\n" +
                "Prize: X=284, Y=12368\n" +
                "\n" +
                "Button A: X+15, Y+60\n" +
                "Button B: X+74, Y+12\n" +
                "Prize: X=16442, Y=14336\n" +
                "\n" +
                "Button A: X+89, Y+14\n" +
                "Button B: X+69, Y+56\n" +
                "Prize: X=7113, Y=4550\n" +
                "\n" +
                "Button A: X+74, Y+20\n" +
                "Button B: X+11, Y+51\n" +
                "Prize: X=1498, Y=17164\n" +
                "\n" +
                "Button A: X+55, Y+14\n" +
                "Button B: X+22, Y+57\n" +
                "Prize: X=14202, Y=3972\n" +
                "\n" +
                "Button A: X+53, Y+16\n" +
                "Button B: X+28, Y+69\n" +
                "Prize: X=10197, Y=4823\n" +
                "\n" +
                "Button A: X+11, Y+69\n" +
                "Button B: X+74, Y+48\n" +
                "Prize: X=4182, Y=6672\n" +
                "\n" +
                "Button A: X+12, Y+28\n" +
                "Button B: X+34, Y+19\n" +
                "Prize: X=8522, Y=9575\n" +
                "\n" +
                "Button A: X+35, Y+12\n" +
                "Button B: X+24, Y+63\n" +
                "Prize: X=15331, Y=5276\n" +
                "\n" +
                "Button A: X+71, Y+28\n" +
                "Button B: X+19, Y+39\n" +
                "Prize: X=6737, Y=3350\n" +
                "\n" +
                "Button A: X+43, Y+81\n" +
                "Button B: X+46, Y+14\n" +
                "Prize: X=8639, Y=15389\n" +
                "\n" +
                "Button A: X+26, Y+35\n" +
                "Button B: X+54, Y+21\n" +
                "Prize: X=4168, Y=3388\n" +
                "\n" +
                "Button A: X+58, Y+14\n" +
                "Button B: X+23, Y+73\n" +
                "Prize: X=16511, Y=10001\n" +
                "\n" +
                "Button A: X+71, Y+16\n" +
                "Button B: X+39, Y+98\n" +
                "Prize: X=6042, Y=7874\n" +
                "\n" +
                "Button A: X+69, Y+13\n" +
                "Button B: X+12, Y+71\n" +
                "Prize: X=14381, Y=9962\n" +
                "\n" +
                "Button A: X+45, Y+20\n" +
                "Button B: X+25, Y+64\n" +
                "Prize: X=9955, Y=19248\n" +
                "\n" +
                "Button A: X+20, Y+78\n" +
                "Button B: X+57, Y+12\n" +
                "Prize: X=886, Y=18314\n" +
                "\n" +
                "Button A: X+31, Y+58\n" +
                "Button B: X+59, Y+30\n" +
                "Prize: X=6111, Y=18934\n" +
                "\n" +
                "Button A: X+72, Y+49\n" +
                "Button B: X+11, Y+31\n" +
                "Prize: X=4216, Y=10597\n" +
                "\n" +
                "Button A: X+79, Y+19\n" +
                "Button B: X+17, Y+77\n" +
                "Prize: X=7349, Y=3809\n" +
                "\n" +
                "Button A: X+56, Y+21\n" +
                "Button B: X+18, Y+92\n" +
                "Prize: X=5464, Y=7505\n" +
                "\n" +
                "Button A: X+98, Y+16\n" +
                "Button B: X+48, Y+65\n" +
                "Prize: X=10860, Y=5603\n" +
                "\n" +
                "Button A: X+95, Y+15\n" +
                "Button B: X+37, Y+36\n" +
                "Prize: X=2821, Y=1893\n" +
                "\n" +
                "Button A: X+12, Y+93\n" +
                "Button B: X+64, Y+24\n" +
                "Prize: X=3816, Y=4086\n" +
                "\n" +
                "Button A: X+74, Y+26\n" +
                "Button B: X+14, Y+46\n" +
                "Prize: X=1548, Y=16972\n" +
                "\n" +
                "Button A: X+20, Y+42\n" +
                "Button B: X+39, Y+26\n" +
                "Prize: X=8419, Y=3192\n" +
                "\n" +
                "Button A: X+26, Y+62\n" +
                "Button B: X+62, Y+31\n" +
                "Prize: X=10956, Y=8392\n" +
                "\n" +
                "Button A: X+25, Y+64\n" +
                "Button B: X+35, Y+13\n" +
                "Prize: X=930, Y=3332\n" +
                "\n" +
                "Button A: X+17, Y+60\n" +
                "Button B: X+58, Y+41\n" +
                "Prize: X=2898, Y=6463\n" +
                "\n" +
                "Button A: X+58, Y+86\n" +
                "Button B: X+82, Y+36\n" +
                "Prize: X=10222, Y=9936\n" +
                "\n" +
                "Button A: X+29, Y+85\n" +
                "Button B: X+95, Y+83\n" +
                "Prize: X=9017, Y=8057\n" +
                "\n" +
                "Button A: X+19, Y+67\n" +
                "Button B: X+58, Y+18\n" +
                "Prize: X=6909, Y=9797\n" +
                "\n" +
                "Button A: X+35, Y+16\n" +
                "Button B: X+41, Y+66\n" +
                "Prize: X=6650, Y=13838\n" +
                "\n" +
                "Button A: X+41, Y+12\n" +
                "Button B: X+27, Y+70\n" +
                "Prize: X=8502, Y=17916\n" +
                "\n" +
                "Button A: X+42, Y+22\n" +
                "Button B: X+31, Y+50\n" +
                "Prize: X=9598, Y=1236\n" +
                "\n" +
                "Button A: X+69, Y+21\n" +
                "Button B: X+20, Y+69\n" +
                "Prize: X=15843, Y=12128\n" +
                "\n" +
                "Button A: X+21, Y+64\n" +
                "Button B: X+44, Y+11\n" +
                "Prize: X=9320, Y=445\n" +
                "\n" +
                "Button A: X+52, Y+28\n" +
                "Button B: X+37, Y+63\n" +
                "Prize: X=13057, Y=9363\n" +
                "\n" +
                "Button A: X+18, Y+61\n" +
                "Button B: X+56, Y+21\n" +
                "Prize: X=980, Y=10681\n" +
                "\n" +
                "Button A: X+18, Y+30\n" +
                "Button B: X+49, Y+25\n" +
                "Prize: X=9663, Y=9675\n" +
                "\n" +
                "Button A: X+60, Y+23\n" +
                "Button B: X+25, Y+67\n" +
                "Prize: X=19355, Y=7228\n" +
                "\n" +
                "Button A: X+89, Y+13\n" +
                "Button B: X+50, Y+69\n" +
                "Prize: X=5953, Y=5250\n" +
                "\n" +
                "Button A: X+34, Y+14\n" +
                "Button B: X+26, Y+62\n" +
                "Prize: X=15374, Y=9738\n" +
                "\n" +
                "Button A: X+16, Y+85\n" +
                "Button B: X+81, Y+46\n" +
                "Prize: X=4306, Y=9809\n" +
                "\n" +
                "Button A: X+19, Y+59\n" +
                "Button B: X+31, Y+24\n" +
                "Prize: X=2311, Y=4358\n" +
                "\n" +
                "Button A: X+48, Y+70\n" +
                "Button B: X+26, Y+12\n" +
                "Prize: X=18182, Y=2026\n" +
                "\n" +
                "Button A: X+53, Y+20\n" +
                "Button B: X+56, Y+72\n" +
                "Prize: X=6993, Y=5284\n" +
                "\n" +
                "Button A: X+25, Y+80\n" +
                "Button B: X+86, Y+22\n" +
                "Prize: X=2657, Y=5464\n" +
                "\n" +
                "Button A: X+16, Y+31\n" +
                "Button B: X+83, Y+52\n" +
                "Prize: X=4281, Y=4486\n" +
                "\n" +
                "Button A: X+34, Y+25\n" +
                "Button B: X+21, Y+56\n" +
                "Prize: X=3677, Y=3961\n" +
                "\n" +
                "Button A: X+23, Y+14\n" +
                "Button B: X+22, Y+51\n" +
                "Prize: X=5099, Y=14177\n" +
                "\n" +
                "Button A: X+21, Y+21\n" +
                "Button B: X+79, Y+12\n" +
                "Prize: X=9164, Y=2799\n" +
                "\n" +
                "Button A: X+88, Y+49\n" +
                "Button B: X+29, Y+87\n" +
                "Prize: X=9884, Y=12022\n" +
                "\n" +
                "Button A: X+19, Y+79\n" +
                "Button B: X+86, Y+45\n" +
                "Prize: X=5530, Y=4551\n" +
                "\n" +
                "Button A: X+95, Y+87\n" +
                "Button B: X+82, Y+15\n" +
                "Prize: X=5539, Y=3450\n" +
                "\n" +
                "Button A: X+47, Y+13\n" +
                "Button B: X+24, Y+42\n" +
                "Prize: X=8476, Y=14658\n" +
                "\n" +
                "Button A: X+40, Y+25\n" +
                "Button B: X+16, Y+31\n" +
                "Prize: X=2408, Y=14978\n" +
                "\n" +
                "Button A: X+31, Y+83\n" +
                "Button B: X+66, Y+14\n" +
                "Prize: X=12489, Y=19145\n" +
                "\n" +
                "Button A: X+21, Y+51\n" +
                "Button B: X+43, Y+17\n" +
                "Prize: X=19484, Y=11600\n" +
                "\n" +
                "Button A: X+58, Y+22\n" +
                "Button B: X+15, Y+52\n" +
                "Prize: X=6102, Y=13788\n" +
                "\n" +
                "Button A: X+62, Y+17\n" +
                "Button B: X+24, Y+53\n" +
                "Prize: X=16042, Y=5798\n" +
                "\n" +
                "Button A: X+37, Y+21\n" +
                "Button B: X+29, Y+54\n" +
                "Prize: X=15497, Y=4808\n" +
                "\n" +
                "Button A: X+22, Y+59\n" +
                "Button B: X+99, Y+23\n" +
                "Prize: X=5665, Y=5250\n" +
                "\n" +
                "Button A: X+83, Y+14\n" +
                "Button B: X+30, Y+64\n" +
                "Prize: X=8493, Y=4910\n" +
                "\n" +
                "Button A: X+28, Y+75\n" +
                "Button B: X+68, Y+20\n" +
                "Prize: X=5088, Y=2585\n" +
                "\n" +
                "Button A: X+14, Y+39\n" +
                "Button B: X+35, Y+22\n" +
                "Prize: X=11491, Y=11926\n" +
                "\n" +
                "Button A: X+52, Y+56\n" +
                "Button B: X+64, Y+18\n" +
                "Prize: X=6580, Y=4540\n" +
                "\n" +
                "Button A: X+98, Y+11\n" +
                "Button B: X+57, Y+76\n" +
                "Prize: X=6791, Y=5704\n" +
                "\n" +
                "Button A: X+88, Y+45\n" +
                "Button B: X+40, Y+75\n" +
                "Prize: X=8928, Y=8220\n" +
                "\n" +
                "Button A: X+13, Y+33\n" +
                "Button B: X+75, Y+50\n" +
                "Prize: X=9076, Y=3791\n" +
                "\n" +
                "Button A: X+75, Y+11\n" +
                "Button B: X+13, Y+37\n" +
                "Prize: X=7105, Y=1393\n" +
                "\n" +
                "Button A: X+63, Y+43\n" +
                "Button B: X+12, Y+35\n" +
                "Prize: X=16619, Y=2191\n" +
                "\n" +
                "Button A: X+59, Y+82\n" +
                "Button B: X+85, Y+37\n" +
                "Prize: X=3968, Y=3811\n" +
                "\n" +
                "Button A: X+36, Y+91\n" +
                "Button B: X+88, Y+48\n" +
                "Prize: X=5932, Y=6447\n" +
                "\n" +
                "Button A: X+24, Y+96\n" +
                "Button B: X+83, Y+11\n" +
                "Prize: X=9770, Y=8906\n" +
                "\n" +
                "Button A: X+40, Y+13\n" +
                "Button B: X+18, Y+27\n" +
                "Prize: X=4810, Y=19642\n" +
                "\n" +
                "Button A: X+25, Y+29\n" +
                "Button B: X+69, Y+21\n" +
                "Prize: X=7111, Y=4175\n" +
                "\n" +
                "Button A: X+32, Y+60\n" +
                "Button B: X+21, Y+12\n" +
                "Prize: X=6652, Y=18176\n" +
                "\n" +
                "Button A: X+71, Y+34\n" +
                "Button B: X+15, Y+47\n" +
                "Prize: X=18074, Y=14851\n" +
                "\n" +
                "Button A: X+24, Y+55\n" +
                "Button B: X+23, Y+13\n" +
                "Prize: X=946, Y=8379\n" +
                "\n" +
                "Button A: X+61, Y+25\n" +
                "Button B: X+17, Y+39\n" +
                "Prize: X=10946, Y=8580\n" +
                "\n" +
                "Button A: X+14, Y+34\n" +
                "Button B: X+66, Y+50\n" +
                "Prize: X=16302, Y=602\n" +
                "\n" +
                "Button A: X+36, Y+80\n" +
                "Button B: X+67, Y+45\n" +
                "Prize: X=7425, Y=6215\n" +
                "\n" +
                "Button A: X+55, Y+88\n" +
                "Button B: X+97, Y+24\n" +
                "Prize: X=4421, Y=3400\n" +
                "\n" +
                "Button A: X+43, Y+13\n" +
                "Button B: X+22, Y+72\n" +
                "Prize: X=17442, Y=4012\n" +
                "\n" +
                "Button A: X+26, Y+57\n" +
                "Button B: X+87, Y+42\n" +
                "Prize: X=8063, Y=4737\n" +
                "\n" +
                "Button A: X+63, Y+23\n" +
                "Button B: X+45, Y+86\n" +
                "Prize: X=6489, Y=7726\n" +
                "\n" +
                "Button A: X+67, Y+73\n" +
                "Button B: X+17, Y+82\n" +
                "Prize: X=3866, Y=7640\n" +
                "\n" +
                "Button A: X+34, Y+15\n" +
                "Button B: X+22, Y+49\n" +
                "Prize: X=4358, Y=2069\n" +
                "\n" +
                "Button A: X+37, Y+18\n" +
                "Button B: X+44, Y+78\n" +
                "Prize: X=3863, Y=2898\n" +
                "\n" +
                "Button A: X+25, Y+60\n" +
                "Button B: X+57, Y+23\n" +
                "Prize: X=15259, Y=12516\n" +
                "\n" +
                "Button A: X+11, Y+32\n" +
                "Button B: X+74, Y+30\n" +
                "Prize: X=467, Y=3686\n" +
                "\n" +
                "Button A: X+25, Y+86\n" +
                "Button B: X+67, Y+63\n" +
                "Prize: X=6940, Y=7963\n" +
                "\n" +
                "Button A: X+11, Y+80\n" +
                "Button B: X+75, Y+73\n" +
                "Prize: X=6885, Y=10859\n" +
                "\n" +
                "Button A: X+31, Y+50\n" +
                "Button B: X+96, Y+31\n" +
                "Prize: X=573, Y=305\n" +
                "\n" +
                "Button A: X+53, Y+16\n" +
                "Button B: X+37, Y+77\n" +
                "Prize: X=15101, Y=16829\n" +
                "\n" +
                "Button A: X+18, Y+78\n" +
                "Button B: X+61, Y+12\n" +
                "Prize: X=9178, Y=7268\n" +
                "\n" +
                "Button A: X+43, Y+41\n" +
                "Button B: X+11, Y+53\n" +
                "Prize: X=3777, Y=6067\n" +
                "\n" +
                "Button A: X+85, Y+28\n" +
                "Button B: X+13, Y+44\n" +
                "Prize: X=1662, Y=3288\n" +
                "\n" +
                "Button A: X+27, Y+82\n" +
                "Button B: X+65, Y+12\n" +
                "Prize: X=6448, Y=14048\n" +
                "\n" +
                "Button A: X+14, Y+92\n" +
                "Button B: X+75, Y+84\n" +
                "Prize: X=2876, Y=5816\n" +
                "\n" +
                "Button A: X+14, Y+27\n" +
                "Button B: X+52, Y+20\n" +
                "Prize: X=13444, Y=17042\n" +
                "\n" +
                "Button A: X+84, Y+25\n" +
                "Button B: X+11, Y+60\n" +
                "Prize: X=11642, Y=4160\n" +
                "\n" +
                "Button A: X+45, Y+25\n" +
                "Button B: X+33, Y+59\n" +
                "Prize: X=9683, Y=10449\n" +
                "\n" +
                "Button A: X+16, Y+61\n" +
                "Button B: X+83, Y+50\n" +
                "Prize: X=2160, Y=3972\n" +
                "\n" +
                "Button A: X+64, Y+25\n" +
                "Button B: X+48, Y+61\n" +
                "Prize: X=5808, Y=6198\n" +
                "\n" +
                "Button A: X+51, Y+55\n" +
                "Button B: X+64, Y+16\n" +
                "Prize: X=8113, Y=5197\n" +
                "\n" +
                "Button A: X+36, Y+14\n" +
                "Button B: X+16, Y+25\n" +
                "Prize: X=12716, Y=12076\n" +
                "\n" +
                "Button A: X+71, Y+21\n" +
                "Button B: X+13, Y+70\n" +
                "Prize: X=1999, Y=389\n" +
                "\n" +
                "Button A: X+75, Y+14\n" +
                "Button B: X+15, Y+83\n" +
                "Prize: X=6365, Y=12329\n" +
                "\n" +
                "Button A: X+59, Y+13\n" +
                "Button B: X+23, Y+62\n" +
                "Prize: X=11799, Y=8700\n" +
                "\n" +
                "Button A: X+63, Y+12\n" +
                "Button B: X+28, Y+84\n" +
                "Prize: X=3756, Y=18080\n" +
                "\n" +
                "Button A: X+83, Y+97\n" +
                "Button B: X+93, Y+14\n" +
                "Prize: X=6937, Y=4509\n" +
                "\n" +
                "Button A: X+91, Y+52\n" +
                "Button B: X+23, Y+54\n" +
                "Prize: X=2740, Y=3200\n" +
                "\n" +
                "Button A: X+98, Y+24\n" +
                "Button B: X+12, Y+50\n" +
                "Prize: X=2410, Y=3508\n" +
                "\n" +
                "Button A: X+12, Y+48\n" +
                "Button B: X+71, Y+56\n" +
                "Prize: X=7260, Y=7152\n" +
                "\n" +
                "Button A: X+81, Y+61\n" +
                "Button B: X+12, Y+63\n" +
                "Prize: X=5145, Y=6249\n" +
                "\n" +
                "Button A: X+16, Y+53\n" +
                "Button B: X+96, Y+21\n" +
                "Prize: X=8048, Y=6463\n" +
                "\n" +
                "Button A: X+33, Y+14\n" +
                "Button B: X+15, Y+52\n" +
                "Prize: X=14369, Y=9140\n" +
                "\n" +
                "Button A: X+19, Y+59\n" +
                "Button B: X+30, Y+11\n" +
                "Prize: X=13981, Y=18382\n" +
                "\n" +
                "Button A: X+15, Y+41\n" +
                "Button B: X+62, Y+26\n" +
                "Prize: X=918, Y=12146\n" +
                "\n" +
                "Button A: X+60, Y+16\n" +
                "Button B: X+17, Y+77\n" +
                "Prize: X=16721, Y=8161\n" +
                "\n" +
                "Button A: X+65, Y+30\n" +
                "Button B: X+24, Y+49\n" +
                "Prize: X=18662, Y=13672\n" +
                "\n" +
                "Button A: X+19, Y+72\n" +
                "Button B: X+72, Y+14\n" +
                "Prize: X=8892, Y=19434\n" +
                "\n" +
                "Button A: X+53, Y+26\n" +
                "Button B: X+22, Y+57\n" +
                "Prize: X=14006, Y=9613\n" +
                "\n" +
                "Button A: X+64, Y+14\n" +
                "Button B: X+14, Y+69\n" +
                "Prize: X=6870, Y=9595\n" +
                "\n" +
                "Button A: X+33, Y+12\n" +
                "Button B: X+22, Y+64\n" +
                "Prize: X=4763, Y=6884\n" +
                "\n" +
                "Button A: X+11, Y+34\n" +
                "Button B: X+66, Y+45\n" +
                "Prize: X=1376, Y=6380\n" +
                "\n" +
                "Button A: X+11, Y+49\n" +
                "Button B: X+80, Y+18\n" +
                "Prize: X=17079, Y=1417\n" +
                "\n" +
                "Button A: X+88, Y+36\n" +
                "Button B: X+17, Y+58\n" +
                "Prize: X=6940, Y=3860\n" +
                "\n" +
                "Button A: X+56, Y+18\n" +
                "Button B: X+16, Y+71\n" +
                "Prize: X=2160, Y=3872\n" +
                "\n" +
                "Button A: X+73, Y+13\n" +
                "Button B: X+19, Y+74\n" +
                "Prize: X=5721, Y=13001\n" +
                "\n" +
                "Button A: X+26, Y+62\n" +
                "Button B: X+59, Y+14\n" +
                "Prize: X=13427, Y=19772\n" +
                "\n" +
                "Button A: X+62, Y+11\n" +
                "Button B: X+20, Y+78\n" +
                "Prize: X=9330, Y=17897\n" +
                "\n" +
                "Button A: X+84, Y+23\n" +
                "Button B: X+14, Y+73\n" +
                "Prize: X=5254, Y=16308\n" +
                "\n" +
                "Button A: X+35, Y+12\n" +
                "Button B: X+20, Y+30\n" +
                "Prize: X=10910, Y=1196\n" +
                "\n" +
                "Button A: X+56, Y+25\n" +
                "Button B: X+36, Y+72\n" +
                "Prize: X=6600, Y=7980\n" +
                "\n" +
                "Button A: X+18, Y+53\n" +
                "Button B: X+71, Y+24\n" +
                "Prize: X=15881, Y=16234\n" +
                "\n" +
                "Button A: X+24, Y+81\n" +
                "Button B: X+32, Y+21\n" +
                "Prize: X=1792, Y=1698\n" +
                "\n" +
                "Button A: X+57, Y+29\n" +
                "Button B: X+22, Y+57\n" +
                "Prize: X=3599, Y=12132\n" +
                "\n" +
                "Button A: X+45, Y+22\n" +
                "Button B: X+15, Y+43\n" +
                "Prize: X=7250, Y=16657\n" +
                "\n" +
                "Button A: X+11, Y+32\n" +
                "Button B: X+76, Y+55\n" +
                "Prize: X=6277, Y=8566\n" +
                "\n" +
                "Button A: X+11, Y+38\n" +
                "Button B: X+31, Y+20\n" +
                "Prize: X=8663, Y=5068\n" +
                "\n" +
                "Button A: X+13, Y+44\n" +
                "Button B: X+79, Y+35\n" +
                "Prize: X=16161, Y=12028\n" +
                "\n" +
                "Button A: X+14, Y+86\n" +
                "Button B: X+30, Y+33\n" +
                "Prize: X=608, Y=1163\n" +
                "\n" +
                "Button A: X+27, Y+18\n" +
                "Button B: X+39, Y+96\n" +
                "Prize: X=4887, Y=9558\n" +
                "\n" +
                "Button A: X+29, Y+92\n" +
                "Button B: X+96, Y+19\n" +
                "Prize: X=9073, Y=2227\n" +
                "\n" +
                "Button A: X+26, Y+69\n" +
                "Button B: X+65, Y+14\n" +
                "Prize: X=15993, Y=6605\n" +
                "\n" +
                "Button A: X+44, Y+11\n" +
                "Button B: X+14, Y+42\n" +
                "Prize: X=8850, Y=15218\n" +
                "\n" +
                "Button A: X+29, Y+55\n" +
                "Button B: X+70, Y+39\n" +
                "Prize: X=6877, Y=3948\n" +
                "\n" +
                "Button A: X+14, Y+44\n" +
                "Button B: X+66, Y+24\n" +
                "Prize: X=11860, Y=13528\n" +
                "\n" +
                "Button A: X+40, Y+18\n" +
                "Button B: X+44, Y+73\n" +
                "Prize: X=18372, Y=11267\n" +
                "\n" +
                "Button A: X+75, Y+79\n" +
                "Button B: X+12, Y+73\n" +
                "Prize: X=6678, Y=8181\n" +
                "\n" +
                "Button A: X+60, Y+92\n" +
                "Button B: X+76, Y+28\n" +
                "Prize: X=8196, Y=6724\n" +
                "\n" +
                "Button A: X+11, Y+52\n" +
                "Button B: X+47, Y+16\n" +
                "Prize: X=19098, Y=9736\n" +
                "\n" +
                "Button A: X+67, Y+70\n" +
                "Button B: X+18, Y+83\n" +
                "Prize: X=6057, Y=8575\n" +
                "\n" +
                "Button A: X+82, Y+26\n" +
                "Button B: X+14, Y+61\n" +
                "Prize: X=18224, Y=11876\n" +
                "\n" +
                "Button A: X+19, Y+60\n" +
                "Button B: X+75, Y+32\n" +
                "Prize: X=18161, Y=5480\n" +
                "\n" +
                "Button A: X+43, Y+69\n" +
                "Button B: X+52, Y+25\n" +
                "Prize: X=17476, Y=4106\n" +
                "\n" +
                "Button A: X+27, Y+95\n" +
                "Button B: X+34, Y+32\n" +
                "Prize: X=2126, Y=2836\n" +
                "\n" +
                "Button A: X+40, Y+39\n" +
                "Button B: X+14, Y+96\n" +
                "Prize: X=1892, Y=6621\n" +
                "\n" +
                "Button A: X+20, Y+71\n" +
                "Button B: X+80, Y+40\n" +
                "Prize: X=8920, Y=10438\n" +
                "\n" +
                "Button A: X+40, Y+57\n" +
                "Button B: X+33, Y+11\n" +
                "Prize: X=6314, Y=568\n" +
                "\n" +
                "Button A: X+99, Y+91\n" +
                "Button B: X+15, Y+91\n" +
                "Prize: X=4014, Y=11102\n" +
                "\n" +
                "Button A: X+16, Y+22\n" +
                "Button B: X+27, Y+12\n" +
                "Prize: X=6729, Y=918\n" +
                "\n" +
                "Button A: X+11, Y+67\n" +
                "Button B: X+65, Y+16\n" +
                "Prize: X=5652, Y=11917\n" +
                "\n" +
                "Button A: X+14, Y+49\n" +
                "Button B: X+81, Y+42\n" +
                "Prize: X=17396, Y=17189\n" +
                "\n" +
                "Button A: X+12, Y+31\n" +
                "Button B: X+75, Y+53\n" +
                "Prize: X=887, Y=4840\n" +
                "\n" +
                "Button A: X+25, Y+63\n" +
                "Button B: X+62, Y+15\n" +
                "Prize: X=8820, Y=18605\n" +
                "\n" +
                "Button A: X+43, Y+12\n" +
                "Button B: X+18, Y+55\n" +
                "Prize: X=10077, Y=19114\n" +
                "\n" +
                "Button A: X+16, Y+27\n" +
                "Button B: X+38, Y+12\n" +
                "Prize: X=14666, Y=6686\n" +
                "\n" +
                "Button A: X+65, Y+12\n" +
                "Button B: X+30, Y+81\n" +
                "Prize: X=5825, Y=10691\n" +
                "\n" +
                "Button A: X+23, Y+65\n" +
                "Button B: X+46, Y+14\n" +
                "Prize: X=19098, Y=1810\n" +
                "\n" +
                "Button A: X+32, Y+61\n" +
                "Button B: X+55, Y+18\n" +
                "Prize: X=9869, Y=745\n" +
                "\n" +
                "Button A: X+19, Y+42\n" +
                "Button B: X+97, Y+19\n" +
                "Prize: X=5478, Y=4097\n" +
                "\n" +
                "Button A: X+79, Y+25\n" +
                "Button B: X+12, Y+63\n" +
                "Prize: X=4014, Y=8007\n" +
                "\n" +
                "Button A: X+24, Y+55\n" +
                "Button B: X+57, Y+39\n" +
                "Prize: X=2778, Y=3251\n" +
                "\n" +
                "Button A: X+60, Y+14\n" +
                "Button B: X+29, Y+77\n" +
                "Prize: X=4471, Y=18743\n" +
                "\n" +
                "Button A: X+44, Y+71\n" +
                "Button B: X+45, Y+23\n" +
                "Prize: X=4764, Y=16962\n" +
                "\n" +
                "Button A: X+69, Y+44\n" +
                "Button B: X+14, Y+37\n" +
                "Prize: X=18647, Y=8826\n" +
                "\n" +
                "Button A: X+15, Y+70\n" +
                "Button B: X+58, Y+17\n" +
                "Prize: X=2737, Y=10708\n" +
                "\n" +
                "Button A: X+25, Y+48\n" +
                "Button B: X+42, Y+20\n" +
                "Prize: X=3308, Y=4896\n" +
                "\n" +
                "Button A: X+16, Y+43\n" +
                "Button B: X+70, Y+28\n" +
                "Prize: X=10848, Y=15996\n" +
                "\n" +
                "Button A: X+68, Y+74\n" +
                "Button B: X+12, Y+68\n" +
                "Prize: X=2632, Y=3084\n" +
                "\n" +
                "Button A: X+67, Y+87\n" +
                "Button B: X+91, Y+26\n" +
                "Prize: X=6156, Y=5966\n" +
                "\n" +
                "Button A: X+43, Y+88\n" +
                "Button B: X+99, Y+11\n" +
                "Prize: X=6953, Y=6182\n" +
                "\n" +
                "Button A: X+66, Y+21\n" +
                "Button B: X+17, Y+66\n" +
                "Prize: X=6466, Y=5814\n" +
                "\n" +
                "Button A: X+52, Y+24\n" +
                "Button B: X+21, Y+43\n" +
                "Prize: X=8244, Y=16996\n" +
                "\n" +
                "Button A: X+46, Y+82\n" +
                "Button B: X+45, Y+13\n" +
                "Prize: X=9831, Y=14647\n" +
                "\n" +
                "Button A: X+17, Y+30\n" +
                "Button B: X+49, Y+23\n" +
                "Prize: X=3553, Y=1954\n" +
                "\n" +
                "Button A: X+56, Y+23\n" +
                "Button B: X+16, Y+21\n" +
                "Prize: X=5072, Y=2819\n" +
                "\n" +
                "Button A: X+22, Y+98\n" +
                "Button B: X+70, Y+75\n" +
                "Prize: X=6382, Y=8773\n" +
                "\n" +
                "Button A: X+32, Y+93\n" +
                "Button B: X+68, Y+43\n" +
                "Prize: X=7404, Y=6210\n" +
                "\n" +
                "Button A: X+29, Y+75\n" +
                "Button B: X+94, Y+38\n" +
                "Prize: X=4690, Y=5566\n" +
                "\n" +
                "Button A: X+54, Y+20\n" +
                "Button B: X+39, Y+73\n" +
                "Prize: X=16733, Y=11735\n" +
                "\n" +
                "Button A: X+30, Y+15\n" +
                "Button B: X+22, Y+35\n" +
                "Prize: X=2952, Y=1980\n" +
                "\n" +
                "Button A: X+20, Y+78\n" +
                "Button B: X+86, Y+43\n" +
                "Prize: X=7874, Y=4685\n" +
                "\n" +
                "Button A: X+95, Y+22\n" +
                "Button B: X+77, Y+92\n" +
                "Prize: X=10628, Y=7208\n" +
                "\n" +
                "Button A: X+77, Y+13\n" +
                "Button B: X+36, Y+69\n" +
                "Prize: X=2662, Y=3218\n" +
                "\n" +
                "Button A: X+18, Y+49\n" +
                "Button B: X+38, Y+22\n" +
                "Prize: X=2140, Y=10210\n" +
                "\n" +
                "Button A: X+22, Y+64\n" +
                "Button B: X+68, Y+24\n" +
                "Prize: X=14384, Y=1912\n" +
                "\n" +
                "Button A: X+12, Y+34\n" +
                "Button B: X+72, Y+37\n" +
                "Prize: X=8864, Y=18895\n" +
                "\n" +
                "Button A: X+50, Y+69\n" +
                "Button B: X+67, Y+12\n" +
                "Prize: X=7166, Y=2004\n" +
                "\n" +
                "Button A: X+47, Y+31\n" +
                "Button B: X+13, Y+75\n" +
                "Prize: X=2386, Y=2238\n" +
                "\n" +
                "Button A: X+24, Y+67\n" +
                "Button B: X+57, Y+18\n" +
                "Prize: X=17177, Y=13222\n" +
                "\n" +
                "Button A: X+50, Y+22\n" +
                "Button B: X+21, Y+38\n" +
                "Prize: X=11997, Y=16114\n" +
                "\n" +
                "Button A: X+61, Y+25\n" +
                "Button B: X+29, Y+65\n" +
                "Prize: X=845, Y=665\n";

        String[] ss = s.split("\n");
        long tokens = 0;
        int round = 0;
        for (int i = 0; i < ss.length; i++) {
//            System.out.println("round " + round++);
//            System.out.println("NEW GAME");

            long ax = Long.parseLong(ss[i].split("X+")[1].split(",")[0]);
            long bx = Long.parseLong(ss[i + 1].split("X+")[1].split(",")[0]);

            long ay = Long.parseLong(ss[i].split("Y+")[1]);
            long by = Long.parseLong(ss[i + 1].split("Y+")[1]);

            long numb = 10000000000000L;
            long px = numb + Long.parseLong(ss[i + 2].split("X=")[1].split(",")[0]);
            long py = numb + Long.parseLong(ss[i + 2].split("Y=")[1]);

            tokens += calculateMe(ax, ay, bx, by, px, py);
//            System.out.println(tokens);
            i += 3;
        }

        System.out.println(tokens);


    }


    private static long calculateMe(long ax, long ay, long bx, long by, long px, long py) {
        long minToken = 0L;

        long l = ax;
        long m = ay;

        ax = ax * m;
        bx = bx * m;

        ay = ay * l;
        by = by * l;

        px = px * m;
        py = py * l;

        long q = Math.abs(by - bx);
        long r = Math.abs(py - px);

        long a, b;
        if (r % q == 0) {
            b = r / q;
            long l1 = px - (b * bx);
            if (l1 % ax == 0) {
                a = l1 / ax;
                minToken += (3 * a + b);
            }
        }

        return minToken;
    }

    //108528956728655
}
