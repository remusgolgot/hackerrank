package adventofcode.aoc2024.day19;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * https://adventofcode.com/2024/day/19
 */
public class Main {


    public static void main(String[] args) {

        String test = "r, wr, b, g, bwu, rb, gb, br\n" +
                "\n" +
                "brwrr\n" +
                "bggr\n" +
                "gbbr\n" +
                "rrbgbr\n" +
                "ubwu\n" +
                "bwurrg\n" +
                "brgr\n" +
                "bbrgwb\n";

        String input = "uugbwr, rwgbb, wgb, wwb, uggrbb, rburr, bggbb, rrggr, rggr, www, rbub, wug, rbbr, rbb, wwr, wwubwg, rggurw, bb, wbbbuwb, wgw, urur, rbwgwu, wwbb, ubbrbr, gwb, uwwwg, gwr, rruw, ugbruu, wgg, uuub, gug, uuuub, rwbgw, rwu, urbggu, bbwugur, bgug, bbuu, uwuw, grbr, wwwgbbg, uuu, wguwugr, uburu, ggrwg, wuubrw, wrwbr, ggb, gbr, burwu, wubgw, rb, buwww, ubur, wuwr, ubbw, wu, grwurr, ggggbr, ggg, rurwuggu, brgggug, rww, wwwwg, uwb, grr, wwwrrb, buu, uwub, gww, rwwgww, guurrg, wwurr, wgggug, gwbu, bgrgbwr, wwrrrg, bwruru, rgubu, rrwr, ggwbu, uuw, bgur, grg, brg, uwugu, urrbrbg, bwbgb, burwb, wrrbbgg, rrw, urgu, guu, ruub, grwuuw, br, bgrgr, wrbbg, rbw, ugwuw, wbrw, grgbr, bwu, ubgu, uburg, bgb, uggu, rgwu, grrugwrb, uwbburgr, rbgbww, rubrwu, gugrbw, wgub, bbgugwg, ugw, uuru, wuuwrw, uurww, bbwrr, rwrrg, gur, wwuu, rrr, gugugr, wwg, rbgu, urg, bwgbw, brgw, ggrgbub, guwb, gbg, wwuub, b, guwwgrbb, rbgrgub, wwrb, wgr, rrrrg, guuu, uwrg, rrg, bbrwuw, wruug, grguwgrg, rurubr, wrurwgru, ww, rgggu, rwrbugr, burrbbr, rw, urw, uwu, uwg, rwg, rwwgug, gburw, urgwrwr, uwwgu, uwwbug, ugur, wgu, brw, bwbw, wguguwu, uwuu, rgr, uguww, brwr, wrgrbu, uuguwb, gb, gwwr, brr, gw, bggbg, wbwg, wrg, grugwg, bbb, grrgrbr, bgu, bw, rgbwbuu, wrb, wruwbg, wrurggb, wubggg, bwrr, gwrurgr, uuguubu, buw, ggww, gguwrwb, bwgburb, ubb, ub, rrug, rugbwgb, wrrbw, bgg, rbwrgr, guub, bubgbgwr, bwwu, uur, wrwu, uwrgburg, rwgb, wrw, wbrb, gugwwggu, rgg, gg, rrwb, ugrwwb, rbgwr, rbr, bbr, gwg, wruggu, ggr, wgbwrbu, gbwb, wbgb, bub, wuw, ugbub, wub, wrrb, rwww, brrbuw, rrwrb, gbu, buubrg, rubr, wgbbb, bgbg, rbu, uwbr, ubrbr, ru, wr, gurgu, bug, bgr, grgw, rrb, wrugg, gbwggwu, rurrrg, grb, rrggb, bru, rbbrg, gggu, guww, ugg, brwrbubb, ug, g, wuuw, uww, urbrr, gbb, wwbg, bbbr, rwurur, wbugbu, bbu, rgwgu, ggu, bbgr, grgbb, ruuurr, wgwg, rbrb, wrubbww, wbwugr, wbw, gugwuw, guw, brgub, wbbru, uubw, ubbwubr, ruuwrrr, bubrg, ubr, uub, w, wru, bgrwwbwg, wg, bggrgwu, gu, gwrw, u, rgw, uruu, uugur, ggbr, rbg, rgug, gbw, wb, uubbg, gwbgrb, rbgru, ubrgb, uw, grw, ubgug, gwbbub, wugrg, uwgw, wubwbwr, wwrbur, uu, rggbwr, brwugg, ubruugg, rwubbw, rug, ggw, rwb, rrru, bbgw, uwgww, ugb, gbwbwgw, urr, wbr, ugrb, bg, gwrbgwwu, uguggw, gwgbur, ubw, wur, bgw, ggru, uwurw, gr, bgbrub, gubb, wgrb, gggw, bbgubbgr, bggrw, wrbwgg, ggbb, rur, rgu, gguru, brgu, ubbb, rwrubrbu, ubwb, ggub, bbgrr, gwgu, uug, bbg, wrr, ugbbr, uwbbu, guwgw, rwbru, burbgb, gugurru, uwwg, grbg, ruw, bwg, ur, bwrwbr, buggu, gruurubw, uwrw, wwu, wuubr, bubuu, uguubbu, uwwwu, uubbwbgu, uwgwg, wuwb, rbur, wrbwr, uru, brb, ubwr, gru, gbbubwug, bwwgr, rub, bur, rgwgwb, gub, wbru, uwr, wbb, wbu, ugr, rwbww, bgurw, bww, grrg, wgbg, grrrbb, bwr, gugr, wgbrr, rrwu, bgbbrg, wuwrwurr, rbgg, rwrgwwg, guuurguu, bbw, rr, wuu, ubrw, rubbubw, urb, rgrbw, ubu, rwgg, gbru, bbrbbru, uurrbr, wubrwur, wbg, gwu, wgugrug, guug, bgwgugb, urrbr, bwbggrgb, bbwr, rru, bgrrug, ruu\n" +
                "\n" +
                "urwrbwuruugwwgwwrbwbbrrbruggwbburwrrgbrwbrubggbgbg\n" +
                "urwrbggbwwbrbggwrbbuwwuguwbwbgrwwrrgwrbggruubwbbwbbgruwu\n" +
                "uwugbbggwbgggrruwgbrrrurrgubbrburgggwguugrrubrrbguubwwr\n" +
                "rrwwrgbugbbugruwgrbrrurubburbbbrurgbwrbugbubww\n" +
                "ubwwrgwuurgwbrguugbwruwgugburuugbwugguwwrwb\n" +
                "bwurwbbbbgbwgwbuwbwruuuuubuwurrwbrbrbgugrgrrguwgw\n" +
                "bbwuwbgrubrgruwubbuuwwrggwrguwwugwruubrbbbgwwwwrrrwrwwwubr\n" +
                "bwwwrwuwwgwrrbubbgubwurbrrggrbgbwuubuwwugrubugwrb\n" +
                "uwbbwbbrurugggruwrwwgbwgwrwbwgwbgugbgwuwrggrbubgur\n" +
                "ubwrrgubuggwrgwwwbwwgwurwgwurwgbrurbrgurwgbubu\n" +
                "wwrgwrbwbgwwwubrwggwwrwruurrwggbrgbubuwguwrrwbwrb\n" +
                "uwgrgugbwruggubuugbburuugrrrrbwgwgbgwurwugburgrrubbbwbbguw\n" +
                "rgbwgrrrubwwwggugwbgbbbgruwuugrubwbugbbbwrbgbgrrbggw\n" +
                "uwgwwggbwbgwguugbwbbbwbrggrggwbugbruwbrbbrgwbgbrbbbubwb\n" +
                "guwrgrwwbuuuwguurbubrgugbwbwburbrgrwrgrbuuwurgwugwgggubb\n" +
                "rubwgbwgwgbrgurruwbwurrgrrbrwbwwrwwbrubwbubwurgbubwrugrg\n" +
                "gwrgbbrubwrwurrrwbwrwwwugwbrgbrwgwruguubrggrrurb\n" +
                "guwwruurbwwuguuwuurbugurubwgubwgwwurrbbbgwbwbrb\n" +
                "ggbwbubgwrugurggwwrgrwbwuwugruwbrwbwgubwbbuwgbgwgbbburrw\n" +
                "urwwrbgwwwwgbgwrbgurrrwubrgbururrrubbwwubgubbrugbbwbggrgb\n" +
                "grgwuggurwuuwggbuuwrgwbbgbbguwuwbubwuwbgburruuu\n" +
                "gwgbrbrugwrwbggruwuwubgrwrrbgbuggugrwrbugurburwuwrbggu\n" +
                "gbuugwwrruguuuwgbugrurggbgwgwburrgrgbburgr\n" +
                "rwrgbwbrrbrburgbrrbuwbburgruruwuwgrbruwrbwrgwubb\n" +
                "rgrbgwgwbbrbrbgwubrwruuggrwgrbuwbrurbwgbgwrrrrubwugbwrur\n" +
                "ubbwgwugurrwurwwbbuuggugggggbuuuuwurwgurwruubwburwgrgr\n" +
                "wrbwgrrgbrugugwrwwbwbbgggbgrgggwuggwbgrrwwgggwu\n" +
                "gbwrbburwbbuwburrrgguuwggbugwgbwgrbgrgwubbbrbwubb\n" +
                "ubrwgwurbuuwbwgruuuwwbwwwruugbwwubggwwgrrrwwbrbb\n" +
                "wbrrwgguggrwrbbrbgrgbbwbbrugbbgrgbgubgbruwrbbrgrurrrbgb\n" +
                "rgbubruuwwwbwbbwrggurrwwgwgbgrbuggbugwgrbrwrguggwww\n" +
                "wgrgbbrrgbuuggrbbwbuuwwbuurugugwwbbwuruwbuwbrg\n" +
                "grubbwrbruwrwuwbbwrbrrggrrgrurrgruuubbrrbbuu\n" +
                "rubbguguuurgugburuugrgbbrbubwbbbwrbwwgbbgruguwrrrwuguguu\n" +
                "rgbbruuburrgubuugrgrbbgwbrrrggrggubbwgbgrgubrbwug\n" +
                "ggrgrubgbrrrrwgugrubugwgrrbuguuubgwbbbuguuubbbww\n" +
                "rbugrwgrbwwgggrwwruuwrwbbruwbbwbuuugbgubrwwb\n" +
                "rgburbuuuggrwgbuuwbbwbuwubgwrgrwgwbrgbbbguguurbw\n" +
                "wrubuwubbbuurggrwgbubbbguuugguugbrwrrbrruguurbgbuwuwwrugu\n" +
                "wrgwgwbrwwurgurruuuuwbubbrwurrgrwwwuwbggubbwwbgu\n" +
                "gubbbuurrgwgrbbuwggrgwugrrrggrgwgwgwwuwuwbuwgruruubrrubg\n" +
                "burrruuwgbgbwgburwwrwrgbbrrbgrgrbwguuwuuwrugurubrbuwuuw\n" +
                "rgbbgwgbuwuuwwrwugbbubwugruuwwbgrrbrwbwwbbrgwwgu\n" +
                "rwuurgrwubgrurbwgwbgwrbbbguwbggbruuuuwgrgrubwrgwbbbubugrur\n" +
                "rgburrubgggrruwuurguubrwgwggugbrrguurrggbwruwbgurbrubuwr\n" +
                "uuruuwuuwwbwuruwugwrwbwwrrwrgwrrwwgbbbugwuwrwwbr\n" +
                "ubbrurrrgbbrbgburuuubwgwuuwwuuwrwrgbuwwuwugwggugggrgwbw\n" +
                "wgbruwgubggurbuwwwurruubbgbubrbgwbruwugrwgbgwrgbgbbbgg\n" +
                "grrwrrwbguwugugwuruwuurrubgbbgrbuuwwbrgwrrrbbwguggwbubb\n" +
                "buwrbwrbwububrurgugwrgrgwbrbbrrugbrgbggwuwgbrrwugg\n" +
                "rgbrwubgrwbuggwwgurgwuguuwrbgbrwwgrwrurrrrwr\n" +
                "bwbubwrubwgrgugugbugruuugugbwbwrgurwubbggwuub\n" +
                "rgwuwwwgubruguwwuruuubwrbgrggwgurgwubguggguww\n" +
                "ugggwwuuugbruggwbbwwrugbwbrgbrbwuwwggrruwbubgwgrubwruuww\n" +
                "brrbwrgubbuggbgwurgrwbrgrrwwugrrurubrbbwgbwubuguub\n" +
                "rubbrwwbrguugurwrruggbbwggrubruggrbbbbubrrwuwuwbgugwrrugb\n" +
                "bruggrbuurgruuuuuggugbgrrwgrwwwggrrrwubuggbb\n" +
                "rgbwrbwugwrbruubbgugwbwbwbwgrwbrbrubuwgugbg\n" +
                "rwbuubbwrburuwbgbubrugrwrugwurrwbgubgubrrrbgww\n" +
                "wrgrrbuuurbruggrbrggggwubwbugwbbbugwuwrrbrugwrrgw\n" +
                "uwbwrrbbbubbggurbuwurwgwbwwbuwuuwrurbbwgubbwwrb\n" +
                "bgwwurgbugubrwbubgbgwrgubrwrrbgrgwuuggbuuwgubuwrwb\n" +
                "bbwubgwwbuuurwrwwwubrrgbugugruurubwgugbbwbgwub\n" +
                "bwbrrrugggrbbwbbuwwubwrrgbrgwrugwrwuwbrgbggbu\n" +
                "uugbbbuwgubrbgbrbrwbbwwrrwbbbrugwuurgggrubwggwuwwwrr\n" +
                "grgggguuuwuuuwgwuwrgbbwrwrbrrwrbggbbbuwwbgrgbwbbgr\n" +
                "urggbbguruwbggbbwuwuuururruwgbrurgrwrwwuubbrrgruwwrw\n" +
                "rgbugrguwgrgggrruwbbuburrrbgbwuggbwgrubgwgugrbwrbbubr\n" +
                "wrwgbrugwrbwgrbbrggwuwbwrwggwgguubwrwburwrgbwurbbuwbrggw\n" +
                "rgbwbbgubbgrrubrurrurrgggbbgurrwrwrbgbrbwururubgwbwwwr\n" +
                "uugwgguwbrrgubbbuurwugrbbbbrrubgbuwgubuwrrwrbub\n" +
                "rgbwubbrbgwrgguuggbwwgrggwgrbrwrrgrbwwbguwbrbuguugrurw\n" +
                "uwbuwrgburggwurggbwugbbuwgrrggwwgbrgwbbguu\n" +
                "wubgrggrrgrwgggubggubggwbbugrruwuwwwbrbbwwruugugbwbwuwbwr\n" +
                "bgbbwrbuwrrubuwbrbbwggbbuurbuurugwuwrburrrgrwg\n" +
                "gruwrwbbrbururwrrruubbbgrruguugubbwbwbguwugrubwg\n" +
                "uubguurwugwbbwgwuuwugrwbwrugrgwgggbubrwwrwbwuu\n" +
                "gwgrwgbwuwuruwwrbrgbwurgbwrubugwwbrbgbggbubguwrbbugbbw\n" +
                "rrbgwwurgwbruwrwbburruurrwrbwbubbrwburwgwggbgb\n" +
                "ubwbuguugbwgurgubggbugrrrwgwwgggrggbwgbwbbruwgbwrur\n" +
                "uwbrwbwburbbbwwgbgugrrwggwgrguuggurubugwuwggbu\n" +
                "ubuwuuggwrbgwwubugburbgrgurrrwbbgbwwbrburgrgrrgwbbwwgburg\n" +
                "wrwrgububgbgrrugbuugbbuwgrggburrbrubuwwrbgurbgwrwwuurrwgbr\n" +
                "rgbgbgurgbwggugburrbbwbguwrgburgruuwwubbrggwubrwrruu\n" +
                "bgubbrgrwbwgbrbuububbrgwuurgbburwrrwuuggwgwuurwurrwrggw\n" +
                "uubbugwbwrggrbrugwurwruwrgbbgbubwguugubwwurrbbgggrrurbr\n" +
                "wbwrrwgwbgbggbuwguggwgwwrurwbwrwugruwgguwgbwrgbwggbwuu\n" +
                "ggwuuuuubrwrugbgrrrbbbbrrrguwwbuwwuuwggwurruwwgugruwwubbu\n" +
                "rgbwurbbwurwbwgwwruuwbwgbwwrruuuuwwwwggbbrrgguwwgrbbwrbr\n" +
                "rburuubwggguwgugrbbuwgbbgbbruwrgwuwbgbwrwbbrgwrurwruruuubu\n" +
                "uugrbubuwrgrrbbgwbwwrbwbubwgrwwbrwgggruguwrgggbrbgbbubwr\n" +
                "gwwbrrbgbubbrgbrrbwrwuwruwgggrbrgwuggrrrurgrgrwgggubggwbub\n" +
                "wubbrrbwuuurgrguruwwrgggrugbubggugbbbguugrbwurruwu\n" +
                "ggrrwubrgurgwbugbgrwbbuggugwbbggbuwwbgwgwu\n" +
                "rgwbgrwwuwbbuwgggruuburwwbrrbwruuubggrubrbwrwwrwwwrr\n" +
                "uwurbwuwrugwrwgrruwbwwwwbbuwubwrwguwwgrbbgw\n" +
                "gwubgurrrggbuguwbbugrggruruwurbwrguuwwwbbwwruruwbrru\n" +
                "bwgwwgbwbwwrbgruwgbuburwgbbrwguwbggruwwwurb\n" +
                "gurrrbwwbrguwbubuwwbggwuuguurwbrbwgguugrbwwgrbrb\n" +
                "wubgggrwwgwwruguuwbuwwwbbggbbrrwwrgubwrggbuguwwgwwgburrbw\n" +
                "rgbruwrbbubrubbwgrwbrrruwwuwruwrbgrwwbwgguguwbgbguuuurrbruwu\n" +
                "rgggguwgrrwggwrurubbwbrwwwguuwwgrwguwuugurrgrg\n" +
                "wrrgrrrrwbuuguwbwurrwwrbgwbbrrbrbruwuwgbuwwbr\n" +
                "wbwwbgbrwgubbgwgbgrbubwwbruugwgrubrwruwuugw\n" +
                "ubrrgbwgwggguwugbbgrbrrurgbwbbgubbgrbburuu\n" +
                "uuruwwubuwubwruwgrggbgwgbgurugrbrwuruuuwrgwwgbg\n" +
                "rbgbbubwwuuggggwrwrbggwwubggggrwwubbbrbguwguugrr\n" +
                "ruwbwubbrbgwuggwrbrwbubuwurggbubuwrwgbwbbrgrgrurbbgg\n" +
                "rbbgruubggurgbrgrbuuuuurrruguwwugubuwugrrwgrubwugubbuwrgu\n" +
                "gwrwwrgrbwwbgbwrwrurubwgwwrwubgrggrrwuggwwuurrrwurrg\n" +
                "rgwubwwwuwgrbuwgbwbrgwbruuggbbrburguwwuuwgbuwugubgbrb\n" +
                "wbrbbguruwuwguuuruwgwubgbbgbwugbrwrubwwubruwug\n" +
                "gburubbwwwwurrwwbbbgrgwuugwrrruugwrbrgwgbgwuwgbgwbwg\n" +
                "rgrugggugrbrgwwwgubwgurguwrugbbburwwbugggwrbgwrurbr\n" +
                "rbubrwwrbwbgrrrwrbbuwwuwwrgbwwgbgrbgwwwrurubrgrgbbbugwwg\n" +
                "wwbrwwubrgwugubgbbruuwrbwuwrbwburrwuuubgrbubwuwb\n" +
                "wrbgrwbgugurwggbgwwwrgrgwbwbbugubrgggbbwwuwuwb\n" +
                "rgbbgwbrrwubugruurubwbuugurwbrggubbggwbrgwuuburbwbrbwgb\n" +
                "bbugubrbruuwbrggrrugwrbwrurbgbubwbuwbwrubr\n" +
                "gurgubbwggwwuurggwrrrbwrbwwbbgwgbwrguwbuubwguwu\n" +
                "bwwwbgbwwrwbbbwgruuuwwwuwrgwuggurgbwuuwwwbu\n" +
                "grbrrwbwgwrwgrbwrgwgggrbgbbruguubwubgurbgrrw\n" +
                "grbrbwbuubrrgbwrgbugrbgrubuurubwgguwuuuuwgwrggwugbrgu\n" +
                "gbgrgbugggwuwwbruwguruguggguurbbbggwuggwwgurgwbu\n" +
                "uggurrgbwubrrrwrrwbgburubwgbuwgwrrbwggbuguggrwbuwgugwrrw\n" +
                "rwuguburbwwuugugwurbwugwgrwbugwwwbwggwuggb\n" +
                "rgbwbbbrrrguwbrwubburuwguggguuurguugwubwwrbgw\n" +
                "uggrwggwwuubugrbugwwwbbugggrwggwbuurbrgrgbwwwgbuurgbb\n" +
                "grgwgrgwrrbrwwwwrgugruugrrbwubrwgguwrurrrwwgggrgggg\n" +
                "wrrwrrrbguwwrruubgubugrgrbuuggbuuuruubguwrrwbwwwgrwggww\n" +
                "gbrwwwwrwuggruwbwbwrrgbbrubgubwgwwbbrubuuwgurg\n" +
                "rgbwgrrbwwurbgbwurbgrugugugwgwuubruuruubru\n" +
                "bbbrrrwruwruwrurbgugbbgrgbuwwuruwrbbgrguwgrgwgbgggggw\n" +
                "wuwuuuurgbrwgbwbruuwgbbbwrbwubuwuuwbruwrrbwuwbbwgbrwgubbb\n" +
                "rbwgwgrbwgrubgbubuwrbbwwwgwrurgwwbrwgruuur\n" +
                "gwbrwgwruggrwrubbbuwrububgrwrbwbbgbuwuugbwgwgbguug\n" +
                "wwgugrruwwgrbwugbrubuuuburwgggwgwrbwrrbgugr\n" +
                "rrwurbbbrbgbbwgburbwbrwbububrwrbuburwrruruugbwuuububbbgg\n" +
                "ugwwbrbwwuuburbubggbwrbgwwgbrrgbuwgwubugrgugwu\n" +
                "rgburwuwruwrrbgwrwrurwgrubuuburbbgwwgwuurgubrwbuggu\n" +
                "ubwruuwuwbguggubbugrwrurwwbuwggguggburwrrwrb\n" +
                "wrubburggrbubwwbwgrbwrwggwbbburuuwrrbbrubruuwrrgbuggr\n" +
                "urgwuwrrrggwbuuwbrwwrwubrwwgwbrgrbbrbubgwuwruuubrrbwbguuwg\n" +
                "bwwwbubwbwwbrguurbgruwwbgburbwwgwwgwgwrwwgggb\n" +
                "ruurbbbbbbwwrrrbuwgwrbrbbbwrbbwrugrwgbgrbrwgbuu\n" +
                "uuwwrrurrbbugbwgububguwurrrguugwwbubwwubburuwrwwgbu\n" +
                "gwwgwwuwwwwrbguwrubgbwbuwbwguwuurbwugwrwgwu\n" +
                "wuuggwwgubwbrbgbuugurubwruuurgrwrrruwgurrubuuwugguwbg\n" +
                "wbubruburrgrbubwrrurburwrubgrugwrwgwuburbgbuurrbu\n" +
                "rgbgbgwwwgwrbgwwuwrrugubgubwurwgugguurguwwbgruuuugwubu\n" +
                "uggugubbuubrguggurrruuwbrrbuuwbrwrwugbbuurwggrruubburr\n" +
                "gugububrgbrugubwbuwuwwruuwbrrguuwgbwuwbgbgrwbrggrrw\n" +
                "guuruugggugwuubrgrubgbwwgwurubwbbwuwuuurggwbbgrrwwgrwwu\n" +
                "wbbbrgrbbbbgwggburubbbwuwrruwrgururwbrwuubbggurwurrbgggu\n" +
                "bubwwrwgubrrbgbgurrggrrgurugbrbwggbgbbwrgwbbgbgb\n" +
                "ubuuwrgbwgbbugrrbbwbruwrubgurrbgrbbrbrrbwwurgwbgbrgb\n" +
                "grbubbwggbggwggwwggbrrugwrgubwbuwbbuwbbgbwgwrbrrgbbbggw\n" +
                "bggwrbubwrbbwbrwgbuwruruwuwububguwbgbbbggw\n" +
                "gwrgwbbubwurwwburrwuwbburbrurwwurrbuugbgbbggwugwgurru\n" +
                "wrwwwurwbbbugbbugggurrgwuburwrbgurwbgwbugbrgggwuubbbb\n" +
                "burgggwwruuuubwgrbggrwgbrbgrrgbbggwuubbgrbug\n" +
                "gbbrgrgbrwrgbbrugwrurguubgbbrbgrbrwubuuuruwuwbrwugrgg\n" +
                "grggbgruwugbuburuwbgrrrrgubwbrrrwbubruwwrbrrbbuubuwb\n" +
                "rgbubbuwugrbbuurruugwuwrwurrrrwbbwwgbrurrrwgurrwg\n" +
                "urgwbgrrgrbubwrwuwgbubbrgwbwwbwrrrrwuruwruwgwrurrwgwurb\n" +
                "rrwwwggurgbwwubbuuuruguuuwbbwbrrggwwuuburubbwgub\n" +
                "bwggbgubbubwrggwwbbwwrbuwbwubbrbbubgubggrgggbbgbrwb\n" +
                "bwbwgugbugrgbrwwgrbrbugwubbwurgruguwbrbburwrugwurgruuug\n" +
                "wgwwrrgwuuburwbubuuuggurgubbbuwwbrrbgwwuggwgbbrgwurg\n" +
                "grwgrrwrgwurrbbwbrwwwwrwuwuwgwubbrwugbwgbuuwurbrbguug\n" +
                "uuuuuuggwuugwurgbrbrbbwbrbbubwburwbwugruugwuwbbrbuuwwu\n" +
                "wbuuuuwwwbguwbggbgrrwwrwurgwgbbgbbggwbgbgbrbgugwbgrrgurg\n" +
                "buurrrbgbwrbbrguggrwbgrbubgbugwbwwruwgubgwwb\n" +
                "uuubwgggbgrguwbbbuwbwbuubuuwgbrrubgrrrwguubub\n" +
                "bbrrwwwggwbwggubuuwrgrbbgwururgurbwrgggrrgwwgwgburgugrr\n" +
                "rgbgggrrbwrbwgguuwwwbgbruwwwgrgbwrrwuwuwgww\n" +
                "grrguruuggubbguuwwrbbuwubgrbubrbbuubwbbburbwguwrrguw\n" +
                "ggbrrwrwgwrbwuwburubwbgbrguuuwrugrrwrwugwwubb\n" +
                "wwugwurruwubwwguugrrbbuwuurugwbugbrrwgwguugwuwbbrwwbuguuu\n" +
                "wrbwgguwgguwwgbruugrwuuuwgrggbuwbguuwuuwbguw\n" +
                "uurwbwwrwuuwburguubugrbggrgbbwrrubwguggbrbrrwgrwwbguu\n" +
                "rgbwwuwguuubbgurbbrggbgrbgugwwgguuruwubgbbgrbuuwwbwbbw\n" +
                "bwbwbrbrrbgwwbwgbugrgugrbwburrrgugbuuurrrwruuguwg\n" +
                "ugbgwrrrbrwggrrgrwuugbrgrrbubgwrwuuwugrbbrrrwgwrrrggrguwgb\n" +
                "ggwwbrwrurwrburrrrwwwgwrwrruuwbbrgwuwbbbwwrrbb\n" +
                "bwwwrurbbwrrrguwuwwuruwgubuwrugugwwbwrbggurwbuwb\n" +
                "urbbuubwurwwrrwurgwwggrubwwbrururgrrbwuubuub\n" +
                "uuubgwwbbgbgurbgwbugugurugbwruruwggbwrugurrwu\n" +
                "rgbwbrbwrrbugrrwurgwwuguurwwbbwubrbwwbgwugbgwgbwuwbwgguub\n" +
                "rgbwrgwwuwgrruuwugwurwbwbuwrgrurbggbwuruggwubwgguwwggbruwg\n" +
                "bwrgubgugwbuguwuwwwwbwbgwuwgbgbbbgwwuwwrbubbbbuwbwu\n" +
                "wruruwuuwwurbwbuuguruwrwbuguwrwwrbrwurguubugurbbbgwwrwb\n" +
                "rbrrgguwwwuuurwguubbgurwbrugrggbruwrrbubrrbuuwbgrbwug\n" +
                "rbubgbwwwgwrugbwubgwrgggwugwguwgrgggbbbrgbbgbuur\n" +
                "uuuuwuwgwuwbgrrwuwrrwgubbrbbbwbgrbwrbwwwrrbuurggrrg\n" +
                "gbbwwrrrwbgguwggruugurrwbwgrwwgbgwbgguuwbbuubwbrr\n" +
                "wuuuggbubwgbbgurruggbubwurwwrruggrguuwburwrwguguubgwbw\n" +
                "ubrugwgwbgwrggubbbgrwurwbubrrurruugrgrbgbbuww\n" +
                "uubgguwrrgwbbbgbguwubbwbruugggrubrrwggrruuwgrrwwurrgr\n" +
                "rwrbwwrgwbrwgggugbugwrwgwbubgwbguurbgubwbwubwwuugbgg\n" +
                "wurwbwurugbgbrrbwurwrruburgwbrwbrbbburuwggrwbuurubrg\n" +
                "rrgrwugwwuguwuugwuurbbrrgguwbgruwbbgwburwrrwbwbuurwugru\n" +
                "ruuwurrbwugbugwwbwwugbbgwgwrruubuuwbuwwbugwwbrbrwgrb\n" +
                "uwwburgurrubwrugwgwwwurwgbwguuubgbgwbgwwrwuuu\n" +
                "wruuubuuwuwggbwwrbwwrurbggwuuwbwuwurwwuururrrwbbggu\n" +
                "bubggbrwgrugruwuuwubbwwugugurruuwgbbrgbwbuggbubwurbgwg\n" +
                "gbubugggrurguwrgbgrwgwwwbuwrgruwwrwrgubgrguwbrwruugbubr\n" +
                "bggwuwgbggbrwgurgrubrubgugburwgbwwwggrbuggwburgbgrbbuwwgru\n" +
                "bgwgubrwuwwrguuruwugbrwwrwruggbwwuwrubgrgrbbbruuggwb\n" +
                "wwgubugbrguwgbrwgwbwbbwrgbrgbrbguubbbgbrgbb\n" +
                "gwgrgugburwbwgbwgwrrruwwrrwrbbbuggwbrguubrrbuwrgurgbwugubg\n" +
                "bwrugrbwbrurbgrbwurrguwbbbuwrwwwbwrrrwbwbrubwruwb\n" +
                "bbwwbrguwgburrggbbrwuwwwwwgbrrwbrgwuuugrwuwuguwugugbw\n" +
                "ggrurwubgrwbrggwuurrruuuuwuuuwrburbrrrbgwwgg\n" +
                "bwwggguubbgbwbwbrwbbgwwugwuwrrgbgbgrrwuuguurbg\n" +
                "urrgurrbwbwrurgbgwbrrbbwwburrgbugbwgrbgbruuwwbbwgbgwu\n" +
                "gwwuuwuggurbuuurrububuwwbgrwbburbbbuubruugbu\n" +
                "uwbruuubwwwgugbrwwugruugwggrrrbuwbgugbrwubu\n" +
                "ruwruuwrurwguuwwgggurbwgbggrgurggubwwbbguug\n" +
                "urrbrgrggurbwwrrwgubrrguwrurbbruwrwrguuuugwbggbrwurgu\n" +
                "ggrwggrgbgwuubrurggbggwwgwuuwuguwwrrubrubrrgrbbru\n" +
                "bggbbwuubwbburgbgwgrrbuuwgwurbggguwgrbwwwuwrguwrwbrrgrrgr\n" +
                "rubrguggwwuwggbwrubbrbrugwgbrwbgwwuwrwbbrrububbgwr\n" +
                "urrruugbrrgbwgugbbwwwruuubrbwgrggrwwbwgbgwrwbwr\n" +
                "bgbwrgwbrwrggrgwgggwurwugrrrwgbwubrwbrgwug\n" +
                "bwbgwrururruguuurbbbwwwgwugbwwgrwuuurguruwrwuguw\n" +
                "wbrwgrwrrbwuwbgguwrgrubbrugrrrbrwuuuwbgubbgrugrgwuwuwr\n" +
                "urgrwbrbggrugrbbuubgrbrwggwbrurubrwubrbbwbwbuwuwruwb\n" +
                "uguubbbrgugwwrrurrwwbgwgrrwgwuuugurrwwbburwwbwuguruwwb\n" +
                "bwbgggwwrgbwugguwrgbrggwrbbbrwwuwgugbrbwguugwgr\n" +
                "uuuwurrurwwgbrbwgrggwgruburgbuurwrwugwggugrgrrurrr\n" +
                "bubwgurbrgrbwbbgugggwuugrgrbrwrbgwuwuurggwwwgubrg\n" +
                "wgbwrbwuwbgrruruuwgggrurrwwwrbrwrbggbrrwgwwburr\n" +
                "bgwbwbrrgubgruwuwwbgwubgurwbrbrwrbguugbwrubugguguuruggbgr\n" +
                "buubrrwrubrbubbgbburuuwgrgbggugrbuwgbubgrwbwubrr\n" +
                "brgwbbgwrrgbggubrbwggubbbuuruuwrruuruurbuguubrgrrbgrwbwuu\n" +
                "bbbgrrggruwrggggbbgbbbbrrrbwggwbbwwrwgwurwruwguwr\n" +
                "gwbugwbubbuuggrgbwwgrwwbgbrbbwwrbggrubgggbuggggbwbruwgu\n" +
                "rrubuwwwubbrwubrgurubwrgubgwgbgwwgubggrbbuw\n" +
                "gwgrrugwwrrgrwrguwuurwugwgugwbbwurruwgbgrbb\n" +
                "bgrrwrubwwbwgrgbgwguwruurgwgggguubwurbbuubwuwwuggrrwrb\n" +
                "grbrrbwggwubbrbbubuuwbrgurugrgbrrrubrbrrbbguwgw\n" +
                "brbwwwrgbgwubugugwwbgburbubbgbwubrrwgwgbgugbubg\n" +
                "uwbbrwbbwrrggwwwuwggrgugubrwgubwwuuubbwugw\n" +
                "rgbuuggugggwggrgrruwgrrrbbwrugbugbwubgwwrrrrwbrbuguug\n" +
                "gbbruurrggbugugbrwbrrrrrwwwbrgbgubuwwbrgwuwrrbgwwrbww\n" +
                "gwuruurruwwbuuwbgguggrbgrwwbwggbwrwwwwrgubrgbwbwbggwgww\n" +
                "rwwwubgbbuurwwuuuwbwrgbrbwruwurwwwbrwuwrwurrr\n" +
                "gwwrrbwrgwbuguububwwrgurbwurugwrgwguuuwbuuwrbwgbb\n" +
                "rbgwwurugggwugbwbwurbwrugrwbbwggrrbwwbbbgurrrbrrrrubwguu\n" +
                "rbrbbbgbbbuuwbrgrbgbuurwbwgrurwggrrurwwrbrgwwwrbgrgu\n" +
                "rgbrgrgwwgwuuuwbbbbrrwgruuwgbggguuggugrgugrgbrgbrbbgugur\n" +
                "wbbgugbwgrrurubwgwuwuwbbbgwrgbgubrgurgrbwgwrrg\n" +
                "rwrwwugwuuwwbwwugugruguuurguuwrwrrwwrrrbbbbrggu\n" +
                "rggrugrrgbbggwrurgbgwgbbwrwbburwrrwwruruuubg\n" +
                "rgbruburwrbwwbwbrbwwgrrbbwrrrrurbwbuugwwru\n" +
                "urwuuwggbbrrwbgwuurwurbbbugruuwrrwrgwwbubwrbburrrrwrrggwg\n" +
                "rgbguggububwbrbwwgbuurbwugbrbbubuwruurguguwbwrbrurwbb\n" +
                "rrbrbrurwbrrwwuuuwbwbgrubbwgrwbwwurgubuwrwwbwwuuu\n" +
                "wgbrbguwrgbgbbuwrrurbwgwrruwwbuguuugrugbubwgrur\n" +
                "uwrrgrbuubggggruruwrwuugwburuubbgrrbwgwgwbgwubr\n" +
                "bbrwubrrgrrgurrubrrgrrwuuwrwbwrwbugwwwururrrwuuwurubrbg\n" +
                "rgbgggubbubuugggrrugwrbruggwgrbwubuubggubwwuwwuu\n" +
                "gwgrugbruwrwgbburbuwgbuburwguugrbwwrgwubgruruug\n" +
                "rgbwbggrgbgrbwruggguuwgwgrrwwguwwruguuwgwrwggbb\n" +
                "wbgwgwuwgwuwwugwrgbuwrubbggbrrgurugwwbgwrugbrwb\n" +
                "rrubugrguuwgruuwrurububwrrwwuggbbgwbrrwwurbwbbggugwbgww\n" +
                "rgbgbubwbwbrbrbgubrgrrgubugubgubbguwbbgugrw\n" +
                "gwwgrbuurbubwrurbwggbrurgwuguwrbrwgrwurbbguurgbrwrwbb\n" +
                "wbrubuwuguurgrbwrwgrrbwgwrwbgwwgurrwuwbggwrurugb\n" +
                "rbwbbwgwwwrwrgwrwbrbwwgubguwwbbrrgwgbbwbggguwrwwrgbgwu\n" +
                "uwuwbbbbrgwgbwrrwrwububuwwbbrwgbrwgbbubwugbwr\n" +
                "gwbuubbgbrbbwbrwwwbrwrrbwwgggwbugbwrubrrgrurwrrrwugruru\n" +
                "rrwwbrgwbgggbwgwbrguggwggwguggugbruuwggwuwuwwruurbrwbwuuug\n" +
                "rgrbbbrwuwwgwrwbugburbrbuwgburrrgggbrwbwwrbgbubgggwwgwbwr\n" +
                "bgbwbrrrurgbbbbuwrgwuwuuuuuwggbrrbrwggrwuwwugrbbr\n" +
                "rgbubgbwubruuwuurgrrbwwbgwubgurbrbgugrgwggwgwggrrbbrruwugrr\n" +
                "grbrurrrrubbgbgbbrbbruubwgruwubgbugwwgrrwub\n" +
                "gburbwubwwbuwbwbgwbbgruruwgruuuwuuurburwuguwubbrwur\n" +
                "wwgwbbruwguurwbggrrugbrrbwwgruwruwuugwrwub\n" +
                "rrgrwbwurwurgrbggwwbgrbwwwgbwruugguwgubugrwrrurgbubrggubbb\n" +
                "wgwrrwbgrruurbbugrguubrgrrrrbwuugbrruuugwwwuubbbwwgwbbr\n" +
                "rgwrbwbbbggwbgrwrwggrgbgrugrwrurrburgrwgwrbbrwbr\n" +
                "ubburwwuuurrgrgwwbbwbbwuuugwburrbrgwrbgrbgwrgwggwubwburub\n" +
                "ubwurwuggwwrgwrrrrurgwrggwwwugbruurwrwgbrugwggbwuggrrwurrg\n" +
                "urrrgwguwbgguwbburgruwwbbgwguubruwgbugbrwbggwbwu\n" +
                "brrwwwbuuwuubgggwburrrggrrgwruubgrbbggrwgg\n" +
                "rggwwuuubgrgbrguggrrbgururbuuubrbrwuwrbwgrugbruuugw\n" +
                "rbgwbgbuburrbwrgrwguwuuggrbbbuurgwuguwbugrwwuwgrbw\n" +
                "wwbbwrgwbrgwrbrrggbgggwuubwbugggbbwwubggubwwguu\n" +
                "wurbuuuuurugggugurbggrrubrwwgwugrwwugrrguuwrgrgbr\n" +
                "uwwrbwuburwubbuwuurwbugrwgbgbgrwwrgrbwrwrw\n" +
                "uwbgbgbwurbrbggugggubbwrurwgrugrwgwwwrrrgggrgrgbrr\n" +
                "rgwwrbrgggrbrbuuwbbgbrbwwwrgrbwuuwuwbbgbgbgugrruwbwrbwur\n" +
                "rgbbbbbwrbubrbbwbbubbrgrubrwugrguurwuuuuug\n" +
                "ubburrrwbrggrwbwwrguuuurguuguuwwbwrbggbwrruugwbbwrbwbww\n" +
                "rwbrwubgrwwwbrwgrgugbgrgbugurbbgrrbgrugrubugwwrbuburrurbu\n" +
                "ubwwruwrgbwguuwwubgubuwrbrurbwrrwubrbbbwrrurbrb\n" +
                "wwrgbrubbuwwbruburuurbrubrbbguwgwgrbruggbw\n" +
                "uruugbbgwugugwwggugrrrggwrrggbuwurwgrwruuuwwbubbuwbgrbgguu\n" +
                "ubgrgwwrwgrggggrbbgbrwggwbrwgrwggbrrgruwwg\n" +
                "ubwbugwwuwwuwrgwwuwgrruubrubrgwuuubwbbrrubrbb\n" +
                "uurggbruurrrwgwuwwbgubbbburbbubwuguuwwruuug\n" +
                "rgbwbrwrbubbwbwwgbuugrrbugbbwwwgbuugbbrubrgbgwbwwrwbbgrbgrrr\n" +
                "bbrubugbbbbrggubburgbrgbbggwguwwguugubrbbgrwbbgg\n" +
                "gurbrwwwrrubbbburubgurubbbgbgwurrruuurubgubwrurrug\n" +
                "gwwrrbwgwrwbuubrbgwrggwuubgubbwwubrbrrwuburugrbggrrubb\n" +
                "urbubrrbgwugbrwbuubgwwwwbrgugrrbgrbwwgurrg\n" +
                "wurbwgwugbbwwugwgggburrguruwwubggbuwwbguggbugbwbrru\n" +
                "gurwguwgbgwuubwbgrwuwgrbwbwbbrruruwrgbwgwggggbgwrgburgrrrw\n" +
                "rgbuwbwrwrgrurubuwbubgbgwrwugugubuuwurrugubggwwggugrgurgrwrr\n" +
                "brrrbbbbrgugwgwubwgwuugwbbuwbuurgubgwrbubugwgrbub\n" +
                "wgbwruwguurwgugbugwbwuugwuwwggwbbwwubrwgruwbgurbub\n" +
                "rgbrbwwwwrrgwugbuubbuugugrgbbgwwbuguwubuuubgwbwwbuubggbbrgr\n" +
                "rgbbguurrguwurbrggguwbguugwurwuugugwguruubbwbguwuwu\n" +
                "brwububwuubuuububbguwuguurwguwuurrrwwbrbggr\n" +
                "burwgrwurgrwwrrubrbwgwgbwgugugrbbgrrrrubrbrwwwwrbbubgbw\n" +
                "burwbrubbuwggrwugugbrbguuguubggbbrbwbruugggwwrbbw\n" +
                "rbgwrbuuurrruuwwbbruuguubgwubububwbwgbgbuwwrruug\n" +
                "wbrwugguwwbrwruwbrurwrbggrwgrwrguubgugrbrwggwuur\n" +
                "grwgwbgwbwuwwwbugwuguugwrruugurwwruurrrrrbguubbrubru\n" +
                "bbubgrrwuuugbwgrbrwwubgbwurrurbwwrrbgwwbrbgbggb\n" +
                "rggbuuwubugrwwgbugubwggugruwwbguurgwwrrugrbwrgruw\n" +
                "brruuwuwurwuubbwurwbbbwuwwgwbwbuwbrruwwrrgr\n" +
                "urugugbuuuuugbrgrgbbwuwgbguururrgwrurgrbgbbrgwwbrbburw\n" +
                "uwbbubwurwbgwgwruurgrwbwgrbwugrbbbrrrbgwruwwbgbrwrbubb\n" +
                "wwbrwgrbbwrbugbbwbbwbrwuuubrwguwbugbububgbruwuuu\n" +
                "rbrgwwrrbuwwbwwwrgwbubruubburwwwggbuwwbbbbbbugbwuurbrggg\n" +
                "rbbrbgrgrguwwbbrubrwbwwgbrwuruubgwrbrbuubwbuurrwg\n" +
                "rrgbwggbwwuuwrrgrgwruwwbwuggrbggbrrrbrgwruwwgwrbgwggw\n" +
                "bwggugbbwrrugrrgugguuwrguubbbgwbgrugwrubwrbwgg\n" +
                "rurgwugwwbbruugbugwbbgbbwgwwwgrwurggbuuggwrwgubrb\n" +
                "ubwuurrgurgruruwururbwbbwuwrrbwwuwwwggbbrbggbubg\n" +
                "gwuurrgrbbururgrwburuuwwbbrrbwbgggburrbbbwwrguuwb\n" +
                "gwrgwbuubbugruwrwrrbrwbguuwububrgbwrwugwwrw\n" +
                "bwubwbwgbgwurgwubwurgrbgbrubbbguurugrwuuggw\n" +
                "rgbrwrubrbugurwbwubrbgggrbwwrubgruuruwbwrgwru\n" +
                "bwwbgwguwbbbuuubuwwgwbgwbgwrbuuugrwbguuruubuwrurb\n" +
                "brgbwgrubbwrrwwubrgugbbrbbuuuuurwbbwrgbggwuwww\n" +
                "rwwwwguurgrbgbbwbrugubbruuwwwwbgruugwgrbrugwgbwwurbuwu\n" +
                "gbgrgugruwwwuwbbrbwbgurgbrgbgbrgbrbuwbwwgbgwwggwrgwgbrgub\n" +
                "rgbuwbbrrggrurrwbuwbwrrwwgrwwgrgbwbururwuggurgrrrb\n" +
                "wugugwwuurburubuwurguguubrwrbuwuwrrurbwgggwwuubrbuwrwbwu\n" +
                "rgbrbrurwrbbwgrrwbgwugbuwbbwbubwrwgbwuwggruubgurrgubbbru\n" +
                "bgubrrrbrubgrwuuugrrwrwbgbbgugbwwrrwwrurrgguwrggruwwuwww\n" +
                "uwurbwwggwbwuuubwbggwgbuwbubrbgwubbbwwgugbbbubgrwwubr\n" +
                "wbgwbwggrburbrbggbburwwwubuwrububggwrgbwwggwwgurrgurw\n" +
                "rwbgrwurwbwrwurwgguguwbbwrgggggwgbwbwwuuggggbrrubwrwrrrb\n" +
                "ruuuwrbwrwwrbgguurwwrrguurwurbgwuuggwwgwgugwgwubwbrbrubug\n" +
                "gwrbwrurbgrggwgbggrgrbgrrubbggwrugbbgrrrgrbuw\n" +
                "bggubbuuuwgbwggwwbbbuguwbugggrgurgrbwguubwrbrwuw\n" +
                "uwgbbrbbbrwwrggbwwurugwgurgwwwbuuwgbugbrggggwgbwuugggwg\n" +
                "rgugugrbrbbrrrgbguuwwgurrbbguurrwbgwugwwwbubwuuwuur\n" +
                "ggrgrwurrbrgrggbrrggubgrrubuwugggwrbgbbuguwb\n" +
                "bguuubgwwgbbruwuwgbguwrrwrrwbrubbuuubgubuu\n" +
                "uuwubuurgburuuubgbgbgbwgrubrbubgwuwbbwrggwrr\n" +
                "ubbbuwuruuubuwbrbgurbgrruugrrgubgurbruwgbubrbuwgrbrubgg\n" +
                "bwgbbbwuuggbrrubbbubggrrburubgbruwrurbrggbrwbrw\n" +
                "wurbbrugubugurugruugubgubbrwrrrgbbwubrwgwgggbbwbgurww\n" +
                "wrgbuburgrbbbwgrrbgrrrguuugwrbugwgrbbgbbbgww\n" +
                "rruwwrrgwrgrrggurbgwurrrgwgurgruwgrwbrbgrbgwguububrbbw\n" +
                "wwbbrugrwrbwrbbuuguurgwrbrrugwwburgugwbuwr\n" +
                "ugwggggbruuwggbubuuubggbggrbbrbuwbbbwuwuwwrbguwwwgru\n" +
                "gbugbgbwgubgbgggwbgwwgbgwuwuuwbwgrbuuwugwuwggurrubgrb\n" +
                "uwbbbggugburgrbrruguwbwuurggrbgugbbwwwuggugwggbguuwwwrr\n" +
                "ruwbgbrrbuuuwwuwrgbwgwbrburrbburrbwbgwwguwuwrbgbrruuuwrg\n" +
                "wugbbwrrwggbuugrwurrubbgrurgrrgugrwgrgwbbgwbbw\n" +
                "ggguwuuwburrurrwbgugbbbwbuburgurrwbwbwrugrbgbrwbgw\n" +
                "rgbwrwuruwgrwwgwggbwwrgwgwrbrugwrbgwurbbg\n" +
                "gwbwwgrbuggrrgbuwwrgwwgrgwwrgruuuburwbrbwgwrgb\n" +
                "brwurggwgbguwggwgrwuwbubbrgwbbrbrurbruwbwrbbuggrgwbb\n" +
                "ububwwrubwrugbgwwggrrrrbbbrwurwbbbwrwwbwrbggbgbug\n" +
                "gbwbgwbwgubwrguuwbbrrwugwuggwgrgruuuwguwuugguwuugwwgrwwg\n" +
                "brbrbwguuggwrbwuwwuwgurwwwubwbrwgrwgbbrubrggwwbgrbbbrugu\n" +
                "guwwbrbggrbgbrrwrugwrrgugrwrwgbrbwubwwwgguwrgburgwurbw\n" +
                "wubbwwgbrwrwrugrruubbugbuuurubgrgguurbuwwbrrwwbwugw\n" +
                "rbbugruurubuuuugrwrgggrrbubwwrbbwururwruruurb\n" +
                "gwrrwbbgubbrbbugwbgwbrbrrgrrbwuuwuwwwbwrbgrgrugwbbbwuwu\n" +
                "wuurrwbgrwwbwugbrbuubgbrurgwugrururwuwuwguwgubburwggb\n" +
                "bguruwuubwuwgwgrguwurgrbggubruwrbgwbburwrbgbrubbwgubbgrr\n" +
                "buwuwrgrrrrbgwgbruwrgbuggurwgbgubguubwugurg\n" +
                "gwwuwruwgrbburrrwugbbbbbbwgubwuugbgbuwwwbgurrbwgrruuwuw\n" +
                "wruwrgbwgugrrgrgggwrrgwwbuwgrurgbgggrugwbrwrwubrbwb\n" +
                "gwguuuuguurwwrgrggubwggurubbbguwwgbrrwrgrguw\n" +
                "guwurrburubggwbguwbbrrwbbgbggbgbuguugugrbbwgggubuu\n" +
                "bbrurrgwuwuwbgbgbrugrrrurwrrgwwguurrbbrbrbgwwbbg\n" +
                "wbrgbrrbbbgwuwruwrgurguubbwbguwbrrbrugwwgbgbgb\n" +
                "ubgugguwwuwguwwwgbbwggbbrgrwgurrrrrrgbuuwgr\n" +
                "wuwbruwbwwbrwwgguurgrwurbgwrugbburbwruruwuubrurggbggugguw\n" +
                "rrggwgrububwgubuwwurruwwugwuuurgugggubwgugbgrbbr\n" +
                "buuruggrwggbbubgguwggbbgubgrrbwgwruwguwgwrbbwgwbrurwru\n" +
                "gwgwwbwbrgburubwrbugubgrrwubruggwwuggurgrbub\n" +
                "uwgugrbuwrugwrwwburgrwuuwggbuwggguwuburubgurrgbruuub\n" +
                "gbgggugbwburrrurbrbgrwuubuwgwguurbgwbgwuwububwg\n" +
                "rubbbwbwwrbwwbgrbbwuubrguwbwbwuuwgubguubugbgrugubgbrwg\n" +
                "bggbbwgrgwuuwgugrbbwgrrubruwrubbbubbugrbwwwbrrruwgb\n" +
                "gwugwgrwbuurwuurwgbbrgguubwuuwwuuurwrwgwgggbwgrb\n" +
                "rugbrurwuggurwrrgugbgwwrwuwrwwuugwbbrbubgbgwwurggbgurgbur\n" +
                "gbbgguruurrubrwubugbrrugubgrgwwrugbrguurwrb\n" +
                "grwubwgrrwwbuugrgwwwrwrbrubgwwubrwgwbgbggrruuwbrb\n";

        String[] s = input.split("\n");

        String[] pieces = s[0].split(", ");
        String[] designs = new String[s.length - 2];

        for (int i = 2; i < s.length; i++) {
            designs[i - 2] = s[i];
        }
        int k = 0;
        for (int i = 0; i < designs.length; i++) {
            System.out.println("Processing " + designs[i]);
            if (doable(pieces, designs[i])) {
                k++;
            }
        }


        System.out.println(k);
        System.out.println("done");
    }

    private static boolean doable(String[] pieces, String design) {
        Queue<String> queue = new ArrayDeque<>();

        queue.add(design);

        while (!queue.isEmpty()) {
            System.out.println(queue.size());
            String d = queue.poll();
            for (int i = 0; i < pieces.length; i++) {
                String piece = pieces[i];
                if (d.equals(piece)) {
                    return true;
                }
                if (d.startsWith(piece)) {
                    String substring = d.substring(piece.length());
                    if (!queue.contains(substring)) {
                        queue.add(substring);
                    }
                }
            }
        }

        return false;

    }

}
