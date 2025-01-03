package adventofcode.aoc2024.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://adventofcode.com/2024/day/1
 */
public class Main2 {

    public static void main(String[] args) {
        String s = "28186 35627\n" +
                "51854 34597\n" +
                "19211 51032\n" +
                "79370 53096\n" +
                "68126 40302\n" +
                "43284 25771\n" +
                "80565 99650\n" +
                "83151 70796\n" +
                "91092 74579\n" +
                "70740 98650\n" +
                "45166 53096\n" +
                "24309 45165\n" +
                "62950 26641\n" +
                "23291 91017\n" +
                "56683 53851\n" +
                "22308 81625\n" +
                "83150 34155\n" +
                "87443 91017\n" +
                "56834 91784\n" +
                "35159 67595\n" +
                "10722 83450\n" +
                "92257 23419\n" +
                "15995 96671\n" +
                "89901 39216\n" +
                "25104 76669\n" +
                "37075 56652\n" +
                "15874 66083\n" +
                "33493 35627\n" +
                "87420 31838\n" +
                "11269 91386\n" +
                "92604 83450\n" +
                "34888 99650\n" +
                "49759 40926\n" +
                "38211 27379\n" +
                "93866 22096\n" +
                "88205 66217\n" +
                "55772 60776\n" +
                "83556 78255\n" +
                "22292 50829\n" +
                "22487 78358\n" +
                "27260 79702\n" +
                "74570 90319\n" +
                "27532 14353\n" +
                "40720 67595\n" +
                "99885 65688\n" +
                "25733 53752\n" +
                "12466 14411\n" +
                "88402 40165\n" +
                "63328 13804\n" +
                "45165 62461\n" +
                "24913 94225\n" +
                "32251 76669\n" +
                "91004 40165\n" +
                "48939 45165\n" +
                "98082 34561\n" +
                "74569 42932\n" +
                "99641 54600\n" +
                "42748 22021\n" +
                "23376 54490\n" +
                "38706 69865\n" +
                "64985 87783\n" +
                "14431 78715\n" +
                "37671 94814\n" +
                "27425 60776\n" +
                "21801 76669\n" +
                "96975 33493\n" +
                "56680 31838\n" +
                "41265 71129\n" +
                "99081 32487\n" +
                "53077 82615\n" +
                "54490 55624\n" +
                "22649 60776\n" +
                "82601 25943\n" +
                "93133 96412\n" +
                "77182 78358\n" +
                "67827 76838\n" +
                "45976 89107\n" +
                "20352 89034\n" +
                "28891 23800\n" +
                "87739 76669\n" +
                "47802 99650\n" +
                "18060 28437\n" +
                "65882 93980\n" +
                "53343 13764\n" +
                "84301 93604\n" +
                "62547 93479\n" +
                "79067 45165\n" +
                "70139 54490\n" +
                "28158 76669\n" +
                "71631 39775\n" +
                "36521 57540\n" +
                "78928 37888\n" +
                "75943 39076\n" +
                "28462 60107\n" +
                "95828 94225\n" +
                "49768 73181\n" +
                "40545 97945\n" +
                "18963 74260\n" +
                "17934 63046\n" +
                "73054 13454\n" +
                "43170 60924\n" +
                "90257 28180\n" +
                "99765 33493\n" +
                "41380 50296\n" +
                "24225 62945\n" +
                "66579 73961\n" +
                "73361 54622\n" +
                "26339 91017\n" +
                "84080 62041\n" +
                "89322 54600\n" +
                "84610 18344\n" +
                "58420 87051\n" +
                "12253 83450\n" +
                "25631 91017\n" +
                "71764 63533\n" +
                "52908 40165\n" +
                "56578 46636\n" +
                "99876 61946\n" +
                "43934 64469\n" +
                "78242 11111\n" +
                "97629 28916\n" +
                "21477 91017\n" +
                "97639 64456\n" +
                "90978 53077\n" +
                "94412 73836\n" +
                "49249 96113\n" +
                "92750 14411\n" +
                "12961 13764\n" +
                "84319 22230\n" +
                "83435 78146\n" +
                "48951 86109\n" +
                "40258 13764\n" +
                "54600 65577\n" +
                "51432 53096\n" +
                "11527 20394\n" +
                "68196 94225\n" +
                "14939 91017\n" +
                "13158 39216\n" +
                "62120 93587\n" +
                "20939 71764\n" +
                "58436 28038\n" +
                "37198 31838\n" +
                "59152 17554\n" +
                "52958 44145\n" +
                "64236 18285\n" +
                "63763 56578\n" +
                "40304 99650\n" +
                "86564 78910\n" +
                "45684 52760\n" +
                "43139 61946\n" +
                "99974 76669\n" +
                "44698 86004\n" +
                "19940 22021\n" +
                "29106 78358\n" +
                "60431 91386\n" +
                "50880 76451\n" +
                "96595 42193\n" +
                "40966 73961\n" +
                "64515 61946\n" +
                "31081 39834\n" +
                "87614 70892\n" +
                "82663 54622\n" +
                "73537 62994\n" +
                "14125 56652\n" +
                "51361 35627\n" +
                "26084 35817\n" +
                "82915 20069\n" +
                "72409 22021\n" +
                "22834 20071\n" +
                "93476 83787\n" +
                "63719 53096\n" +
                "41505 48056\n" +
                "56055 20404\n" +
                "37255 99650\n" +
                "33468 60776\n" +
                "70472 22598\n" +
                "66290 53077\n" +
                "91071 67595\n" +
                "30888 33173\n" +
                "60826 29871\n" +
                "12334 78358\n" +
                "62744 69424\n" +
                "85449 79500\n" +
                "22333 16295\n" +
                "67621 18455\n" +
                "12605 90059\n" +
                "32490 25835\n" +
                "96639 75870\n" +
                "82412 39747\n" +
                "76964 60153\n" +
                "60776 60776\n" +
                "68837 39216\n" +
                "35635 67595\n" +
                "85239 14964\n" +
                "15278 83450\n" +
                "63581 35178\n" +
                "77006 18285\n" +
                "88570 80424\n" +
                "61499 81689\n" +
                "57466 47392\n" +
                "78524 84304\n" +
                "11821 53989\n" +
                "62425 28916\n" +
                "36264 50872\n" +
                "38567 13061\n" +
                "16357 45165\n" +
                "17202 94451\n" +
                "64290 31838\n" +
                "76075 55071\n" +
                "87325 40165\n" +
                "93961 99650\n" +
                "49866 65601\n" +
                "91725 14411\n" +
                "44721 18285\n" +
                "44065 33493\n" +
                "22521 56578\n" +
                "28070 54600\n" +
                "45621 54600\n" +
                "54677 26913\n" +
                "79647 24298\n" +
                "89613 31415\n" +
                "86493 13764\n" +
                "16243 64218\n" +
                "12832 21187\n" +
                "43847 35189\n" +
                "75859 54600\n" +
                "69276 75826\n" +
                "43251 14411\n" +
                "96012 41446\n" +
                "35482 35817\n" +
                "45380 82383\n" +
                "66801 31838\n" +
                "79199 92341\n" +
                "33087 70511\n" +
                "40619 28916\n" +
                "67655 80670\n" +
                "22431 60776\n" +
                "62731 54622\n" +
                "29873 25771\n" +
                "99354 63481\n" +
                "36415 61946\n" +
                "29742 94919\n" +
                "64872 53077\n" +
                "93028 55635\n" +
                "32784 18285\n" +
                "87488 68734\n" +
                "56652 18285\n" +
                "49968 80712\n" +
                "82653 53096\n" +
                "30377 24784\n" +
                "40120 45165\n" +
                "88404 70120\n" +
                "69179 45165\n" +
                "99645 67595\n" +
                "44883 45165\n" +
                "76320 43595\n" +
                "29057 90019\n" +
                "28502 61946\n" +
                "73459 84304\n" +
                "96354 54622\n" +
                "77589 14301\n" +
                "51381 54490\n" +
                "40490 95808\n" +
                "36023 27135\n" +
                "13434 63807\n" +
                "27250 35627\n" +
                "13764 32845\n" +
                "28229 34954\n" +
                "56430 76669\n" +
                "98593 63811\n" +
                "11192 60776\n" +
                "81601 72265\n" +
                "86908 77116\n" +
                "25484 82383\n" +
                "31115 42206\n" +
                "75124 70148\n" +
                "96785 53096\n" +
                "59814 85995\n" +
                "17024 57255\n" +
                "81701 41971\n" +
                "43938 33493\n" +
                "91646 33599\n" +
                "96616 81828\n" +
                "73270 87775\n" +
                "75876 35817\n" +
                "53007 83450\n" +
                "39527 33975\n" +
                "35936 17039\n" +
                "95194 23302\n" +
                "96876 80147\n" +
                "68136 91386\n" +
                "31253 19760\n" +
                "98767 61208\n" +
                "98353 86604\n" +
                "13239 36264\n" +
                "43374 13764\n" +
                "36658 22965\n" +
                "58030 84304\n" +
                "42686 78358\n" +
                "99419 49423\n" +
                "43976 20759\n" +
                "33361 47852\n" +
                "23794 61946\n" +
                "26896 83450\n" +
                "12213 37740\n" +
                "53827 49270\n" +
                "71874 61946\n" +
                "19394 77889\n" +
                "63728 81025\n" +
                "63780 72467\n" +
                "34161 21317\n" +
                "81832 56652\n" +
                "20986 99650\n" +
                "36631 48302\n" +
                "60232 63009\n" +
                "37744 84304\n" +
                "46964 39391\n" +
                "19771 14411\n" +
                "75783 69365\n" +
                "71727 71252\n" +
                "60541 69095\n" +
                "68594 30949\n" +
                "51619 88697\n" +
                "26797 50216\n" +
                "86654 61946\n" +
                "98872 53347\n" +
                "20079 18807\n" +
                "60408 41952\n" +
                "37203 47862\n" +
                "92078 43717\n" +
                "94853 53096\n" +
                "91937 65490\n" +
                "39800 79198\n" +
                "14179 50429\n" +
                "21846 72768\n" +
                "19081 14411\n" +
                "60170 39838\n" +
                "14482 36264\n" +
                "61946 64811\n" +
                "88464 10899\n" +
                "93401 44867\n" +
                "42260 53495\n" +
                "92730 76838\n" +
                "17708 31838\n" +
                "68523 99650\n" +
                "44540 95629\n" +
                "12785 54490\n" +
                "34598 13764\n" +
                "20161 28916\n" +
                "15318 67595\n" +
                "67423 47864\n" +
                "13951 95495\n" +
                "63011 67595\n" +
                "73505 61946\n" +
                "22300 73685\n" +
                "35181 78358\n" +
                "70531 60776\n" +
                "95954 57049\n" +
                "65463 67851\n" +
                "67270 53593\n" +
                "62726 13782\n" +
                "66690 72865\n" +
                "99591 33493\n" +
                "89300 13764\n" +
                "82383 51267\n" +
                "55326 56578\n" +
                "66315 54622\n" +
                "51554 91145\n" +
                "21778 67595\n" +
                "38569 71437\n" +
                "25915 80353\n" +
                "92411 88336\n" +
                "76148 83204\n" +
                "68688 61443\n" +
                "78063 34003\n" +
                "27804 14411\n" +
                "79316 59050\n" +
                "14222 22021\n" +
                "83018 18197\n" +
                "36304 33795\n" +
                "46381 78358\n" +
                "23167 99650\n" +
                "73696 11314\n" +
                "83569 71391\n" +
                "93902 76551\n" +
                "33606 35906\n" +
                "30257 54600\n" +
                "24956 80860\n" +
                "64619 14411\n" +
                "17640 56652\n" +
                "22908 83696\n" +
                "18954 74347\n" +
                "89497 83450\n" +
                "70303 76669\n" +
                "37979 69814\n" +
                "22661 53077\n" +
                "96573 83961\n" +
                "13055 85059\n" +
                "73265 67595\n" +
                "31927 45165\n" +
                "61607 54490\n" +
                "62232 53096\n" +
                "68738 79113\n" +
                "50586 95006\n" +
                "55731 39122\n" +
                "33386 31838\n" +
                "20118 97657\n" +
                "98794 76669\n" +
                "62869 57813\n" +
                "45508 91386\n" +
                "29960 56652\n" +
                "20228 95663\n" +
                "75424 74090\n" +
                "75421 30158\n" +
                "82307 11086\n" +
                "26488 64910\n" +
                "48430 41174\n" +
                "81439 63107\n" +
                "68896 56652\n" +
                "67511 33375\n" +
                "40446 66170\n" +
                "13668 68369\n" +
                "83234 16181\n" +
                "16929 84304\n" +
                "42735 85915\n" +
                "93954 22403\n" +
                "98252 33493\n" +
                "39418 54622\n" +
                "14183 89745\n" +
                "67167 68002\n" +
                "88731 22021\n" +
                "42317 54490\n" +
                "29404 83450\n" +
                "80844 31838\n" +
                "43255 34866\n" +
                "61762 32538\n" +
                "32255 78358\n" +
                "93152 25771\n" +
                "42141 56578\n" +
                "83740 22021\n" +
                "40030 47353\n" +
                "34668 14411\n" +
                "46752 21905\n" +
                "26196 48915\n" +
                "45243 67595\n" +
                "26757 56652\n" +
                "13969 82383\n" +
                "13148 84304\n" +
                "39362 29711\n" +
                "92819 31171\n" +
                "12210 14411\n" +
                "58671 91017\n" +
                "87279 62713\n" +
                "97755 92124\n" +
                "77086 62944\n" +
                "87094 40099\n" +
                "83398 35817\n" +
                "36525 64734\n" +
                "27346 36264\n" +
                "50274 17587\n" +
                "74438 92593\n" +
                "86182 13764\n" +
                "63946 56578\n" +
                "99269 25771\n" +
                "46815 67595\n" +
                "44645 93146\n" +
                "82027 25771\n" +
                "46981 39216\n" +
                "52039 31814\n" +
                "25930 54600\n" +
                "48743 31838\n" +
                "80123 72281\n" +
                "21790 84579\n" +
                "91556 78358\n" +
                "63961 14411\n" +
                "11280 97891\n" +
                "67372 60776\n" +
                "35817 34731\n" +
                "80767 53877\n" +
                "32458 90108\n" +
                "53471 13557\n" +
                "76699 92723\n" +
                "33967 31838\n" +
                "83166 23325\n" +
                "48974 44826\n" +
                "28408 16412\n" +
                "18980 61946\n" +
                "76595 21581\n" +
                "54278 82835\n" +
                "57836 67595\n" +
                "16791 84304\n" +
                "52746 99650\n" +
                "23543 83450\n" +
                "28819 95078\n" +
                "21590 84304\n" +
                "90588 91017\n" +
                "62879 43669\n" +
                "35788 81389\n" +
                "67595 91386\n" +
                "43342 73961\n" +
                "34072 73961\n" +
                "41533 54487\n" +
                "77769 71151\n" +
                "95215 74006\n" +
                "37630 44436\n" +
                "85291 18292\n" +
                "82845 99650\n" +
                "56633 60776\n" +
                "95645 54490\n" +
                "59689 14411\n" +
                "77873 23174\n" +
                "47892 94225\n" +
                "71442 77808\n" +
                "52932 56578\n" +
                "68699 56652\n" +
                "70296 54600\n" +
                "34780 50848\n" +
                "14008 63408\n" +
                "65865 73961\n" +
                "64689 84695\n" +
                "70986 45490\n" +
                "20034 54600\n" +
                "21194 73961\n" +
                "42510 37716\n" +
                "80906 32357\n" +
                "38289 19304\n" +
                "44371 53386\n" +
                "45873 95639\n" +
                "72359 53096\n" +
                "26200 40165\n" +
                "81093 32591\n" +
                "75520 99689\n" +
                "70526 92020\n" +
                "38000 90543\n" +
                "42109 40526\n" +
                "65858 64811\n" +
                "77533 83450\n" +
                "84191 63489\n" +
                "59480 46311\n" +
                "20750 32879\n" +
                "81791 76258\n" +
                "49948 56739\n" +
                "44960 22021\n" +
                "49084 12978\n" +
                "46948 25438\n" +
                "22467 39216\n" +
                "32066 41311\n" +
                "47715 13764\n" +
                "40689 56652\n" +
                "81797 82792\n" +
                "48102 91114\n" +
                "13286 64910\n" +
                "24324 81079\n" +
                "14772 91386\n" +
                "10721 20481\n" +
                "26990 54622\n" +
                "67169 22021\n" +
                "42848 25771\n" +
                "24672 13764\n" +
                "86122 25771\n" +
                "56904 13764\n" +
                "81436 53096\n" +
                "94624 33493\n" +
                "91853 56652\n" +
                "23675 14088\n" +
                "26625 68877\n" +
                "22777 53096\n" +
                "44833 33493\n" +
                "47549 96449\n" +
                "79529 27951\n" +
                "78188 99650\n" +
                "16287 51001\n" +
                "64231 25771\n" +
                "84131 55907\n" +
                "15378 41016\n" +
                "69506 78358\n" +
                "80392 64811\n" +
                "68681 57430\n" +
                "95565 40165\n" +
                "27128 40839\n" +
                "11911 38020\n" +
                "32463 95974\n" +
                "64051 39216\n" +
                "59409 25771\n" +
                "85311 99650\n" +
                "15025 76669\n" +
                "31085 83450\n" +
                "57046 43589\n" +
                "31356 25944\n" +
                "53445 32566\n" +
                "65374 24456\n" +
                "94347 17250\n" +
                "51998 76838\n" +
                "38930 76838\n" +
                "13223 22328\n" +
                "23412 33493\n" +
                "33498 39216\n" +
                "66922 97888\n" +
                "19340 13764\n" +
                "30800 33625\n" +
                "63834 53077\n" +
                "26329 76669\n" +
                "36202 52321\n" +
                "99460 87180\n" +
                "10752 22155\n" +
                "83677 54586\n" +
                "83136 94225\n" +
                "43505 94775\n" +
                "49792 51024\n" +
                "18430 87697\n" +
                "48959 62169\n" +
                "27559 86092\n" +
                "42055 71266\n" +
                "47346 27875\n" +
                "95130 15327\n" +
                "67175 50520\n" +
                "80717 48669\n" +
                "98758 93010\n" +
                "69621 73606\n" +
                "25596 22021\n" +
                "37015 83450\n" +
                "14944 93706\n" +
                "70867 84304\n" +
                "14464 80652\n" +
                "11365 25771\n" +
                "78435 46797\n" +
                "45002 58808\n" +
                "57900 83487\n" +
                "99650 55843\n" +
                "80681 38011\n" +
                "64811 86071\n" +
                "97586 33898\n" +
                "42094 41087\n" +
                "76669 54622\n" +
                "74600 28060\n" +
                "18109 25771\n" +
                "95834 40165\n" +
                "76583 32274\n" +
                "23271 54600\n" +
                "73123 81744\n" +
                "81442 70437\n" +
                "97274 25771\n" +
                "99106 91717\n" +
                "19847 39216\n" +
                "41705 54622\n" +
                "97824 64338\n" +
                "34982 39216\n" +
                "47246 58999\n" +
                "94716 78358\n" +
                "52266 60776\n" +
                "39216 95154\n" +
                "49351 94864\n" +
                "64910 39559\n" +
                "43455 84248\n" +
                "71500 27152\n" +
                "30651 49103\n" +
                "63267 44712\n" +
                "17567 18998\n" +
                "63046 48579\n" +
                "51483 63529\n" +
                "35182 14411\n" +
                "73961 60776\n" +
                "39993 30182\n" +
                "26258 96243\n" +
                "52698 77762\n" +
                "21525 22021\n" +
                "47513 20331\n" +
                "13140 22021\n" +
                "43778 40165\n" +
                "22788 94225\n" +
                "84367 31838\n" +
                "54265 64910\n" +
                "55305 42377\n" +
                "78923 54586\n" +
                "40429 39216\n" +
                "12422 63046\n" +
                "24878 94225\n" +
                "64356 57593\n" +
                "34812 40889\n" +
                "54661 60776\n" +
                "31004 55132\n" +
                "38061 63046\n" +
                "85827 35627\n" +
                "72862 33704\n" +
                "51636 98691\n" +
                "15448 54159\n" +
                "90048 67595\n" +
                "53851 18285\n" +
                "48530 74924\n" +
                "20386 81637\n" +
                "87273 53096\n" +
                "83022 56018\n" +
                "98251 65250\n" +
                "89295 60776\n" +
                "98142 15765\n" +
                "31571 42354\n" +
                "92874 70979\n" +
                "44965 58401\n" +
                "51688 78358\n" +
                "93890 12104\n" +
                "65530 53096\n" +
                "55006 91017\n" +
                "49672 55977\n" +
                "31815 37826\n" +
                "13567 58321\n" +
                "60844 53077\n" +
                "63845 26325\n" +
                "98712 79314\n" +
                "99601 63236\n" +
                "14173 60776\n" +
                "11249 86708\n" +
                "37023 48603\n" +
                "25248 14411\n" +
                "25444 63817\n" +
                "92822 10083\n" +
                "43060 41903\n" +
                "98283 89972\n" +
                "10004 77190\n" +
                "69379 56652\n" +
                "30459 45165\n" +
                "81481 18285\n" +
                "47130 24016\n" +
                "57377 56872\n" +
                "24043 63046\n" +
                "78319 33493\n" +
                "96058 33493\n" +
                "42928 32466\n" +
                "76838 35627\n" +
                "43659 76669\n" +
                "36827 39216\n" +
                "41007 60776\n" +
                "79655 14411\n" +
                "26608 44836\n" +
                "85420 68185\n" +
                "81174 96069\n" +
                "79223 59880\n" +
                "54106 52192\n" +
                "71917 83450\n" +
                "19775 73961\n" +
                "45391 66102\n" +
                "26838 33493\n" +
                "53437 76669\n" +
                "71922 91017\n" +
                "67552 40770\n" +
                "23842 12889\n" +
                "75398 90858\n" +
                "20264 96094\n" +
                "38278 39216\n" +
                "62780 68287\n" +
                "92766 45165\n" +
                "25677 23355\n" +
                "55791 83450\n" +
                "63556 93703\n" +
                "97511 61946\n" +
                "74712 18285\n" +
                "34605 15067\n" +
                "57436 56652\n" +
                "91202 91017\n" +
                "11656 54622\n" +
                "31838 22156\n" +
                "94443 25771\n" +
                "84090 60590\n" +
                "63298 91386\n" +
                "60339 56419\n" +
                "25780 53096\n" +
                "55284 76669\n" +
                "83080 71920\n" +
                "53843 36881\n" +
                "83616 42743\n" +
                "89091 68085\n" +
                "71899 31838\n" +
                "57786 67595\n" +
                "34559 96506\n" +
                "77211 94225\n" +
                "67812 61946\n" +
                "26511 63739\n" +
                "51963 97847\n" +
                "81350 23053\n" +
                "37978 57093\n" +
                "93413 89804\n" +
                "38133 60776\n" +
                "73234 84629\n" +
                "60624 31957\n" +
                "13937 34269\n" +
                "35804 44626\n" +
                "36210 53096\n" +
                "34190 33493\n" +
                "30736 83057\n" +
                "80091 23762\n" +
                "60917 82383\n" +
                "30227 53096\n" +
                "94439 56652\n" +
                "78308 67595\n" +
                "51009 67595\n" +
                "64010 53077\n" +
                "20563 61946\n" +
                "43967 17312\n" +
                "86436 75180\n" +
                "80389 42825\n" +
                "94453 83450\n" +
                "41805 91918\n" +
                "21462 99650\n" +
                "71157 10537\n" +
                "35046 73961\n" +
                "96103 74733\n" +
                "83069 35732\n" +
                "18285 82383\n" +
                "26446 76669\n" +
                "70874 18579\n" +
                "10539 11666\n" +
                "57999 83450\n" +
                "25966 91017\n" +
                "37570 93089\n" +
                "46126 18897\n" +
                "65025 78341\n" +
                "48404 61946\n" +
                "26116 91017\n" +
                "84857 33493\n" +
                "84369 96112\n" +
                "79609 76561\n" +
                "24415 76669\n" +
                "55288 37007\n" +
                "85869 10010\n" +
                "15152 76669\n" +
                "10609 52954\n" +
                "56293 59754\n" +
                "35563 99650\n" +
                "15144 32125\n" +
                "27560 33493\n" +
                "10484 99261\n" +
                "73264 74795\n" +
                "44774 17094\n" +
                "41294 53851\n" +
                "14411 83990\n" +
                "17065 25771\n" +
                "25771 60026\n" +
                "58907 16393\n" +
                "93527 90760\n" +
                "25715 68223\n" +
                "61620 23456\n" +
                "36485 15169\n" +
                "70191 39216\n" +
                "40165 94225\n" +
                "54006 99650\n" +
                "75597 53096\n" +
                "49678 25771\n" +
                "51574 96842\n" +
                "57852 18285\n" +
                "60104 61946\n" +
                "78607 35627\n" +
                "54889 14411\n" +
                "47241 10303\n" +
                "71456 94225\n" +
                "81425 49149\n" +
                "59061 28602\n" +
                "24633 31838\n" +
                "14420 93613\n" +
                "54622 53077\n" +
                "17040 78745\n" +
                "70622 88133\n" +
                "56992 72730\n" +
                "97895 33493\n" +
                "94648 44310\n" +
                "59138 13764\n" +
                "97350 69918\n" +
                "32734 83579\n" +
                "55320 66823\n" +
                "96915 55216\n" +
                "95293 38588\n" +
                "13774 12822\n" +
                "70053 58437\n" +
                "22021 18724\n" +
                "41216 43315\n" +
                "28987 31838\n" +
                "70488 89770\n" +
                "48277 53914\n" +
                "79376 76669\n" +
                "94225 53077\n" +
                "60803 12578\n" +
                "21144 16837\n" +
                "23645 33714\n" +
                "28916 83751\n" +
                "50535 31838\n" +
                "62178 64811\n" +
                "63126 71848\n" +
                "33569 46461\n" +
                "99826 53077\n" +
                "74714 33856\n" +
                "67967 26838\n" +
                "83610 54622\n" +
                "15872 36009\n" +
                "34302 31838\n" +
                "24069 56292\n" +
                "90147 38554\n" +
                "95987 79195\n" +
                "62656 40165\n" +
                "83153 26094\n" +
                "68726 85767\n" +
                "63172 74949\n" +
                "35390 94225\n" +
                "29379 63046\n" +
                "13571 56578\n" +
                "16169 64811\n" +
                "68905 35817\n" +
                "71763 53096\n" +
                "48781 28841\n" +
                "95966 15028\n" +
                "87862 67072\n" +
                "87176 60776\n" +
                "11203 13761\n" +
                "50294 11171\n" +
                "21503 25547\n" +
                "96570 78358\n" +
                "25213 84422\n" +
                "61744 85120\n" +
                "62795 72393\n" +
                "84907 33493\n" +
                "82935 84304\n" +
                "24224 36264\n" +
                "91386 99650\n" +
                "76217 98074\n" +
                "73872 60776\n" +
                "41777 19177\n" +
                "95695 39216\n" +
                "88779 15111\n" +
                "93458 67595\n" +
                "74732 67770\n" +
                "23754 39216\n" +
                "90662 35817\n" +
                "24013 99650\n" +
                "66779 83450\n" +
                "54586 27524\n" +
                "88285 69874\n" +
                "47809 22021\n" +
                "25662 71764\n" +
                "31583 56652\n" +
                "58156 60776\n" +
                "22656 56578\n" +
                "22315 76174\n" +
                "70195 54622\n" +
                "27027 33351\n" +
                "32409 75991\n" +
                "91017 72493\n" +
                "53096 13301\n" +
                "92656 41863\n" +
                "84304 85568\n" +
                "45081 73961\n" +
                "21844 78358\n" +
                "83024 61946\n" +
                "93888 45113\n" +
                "69174 53096\n" +
                "98465 56543\n" +
                "46208 56652\n" +
                "63289 99650\n" +
                "96607 76329\n" +
                "62648 55561\n" +
                "38090 62481\n" +
                "87491 90246\n" +
                "45019 81753\n" +
                "88050 73961\n" +
                "18142 26270\n" +
                "36682 22021\n" +
                "15933 94225\n" +
                "17393 38533\n" +
                "33633 67595\n" +
                "55662 73961\n" +
                "63567 74739\n" +
                "69557 83450\n" +
                "36169 25771\n" +
                "40716 35837\n" +
                "11665 14704\n" +
                "94437 36515\n" +
                "43859 18285\n" +
                "98937 54490\n" +
                "73932 94209\n" +
                "99289 50655\n" +
                "12403 22021\n" +
                "80283 64811\n" +
                "68700 43336\n" +
                "36887 69617\n" +
                "53551 83450\n" +
                "76290 18285\n" +
                "49743 25771\n" +
                "35627 76669\n" +
                "59070 13231\n" +
                "40419 24169\n" +
                "48544 82383\n" +
                "68680 84304\n" +
                "31610 58761\n" +
                "31170 67595\n" +
                "27004 41596\n" +
                "62727 98757\n" +
                "24189 76875\n" +
                "42807 97581\n" +
                "85552 71764\n" +
                "52402 40046\n" +
                "78358 41164\n" +
                "83450 76669\n" +
                "62947 25771\n" +
                "55820 53096\n";

        String[] ss = s.split("\n");
        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();
        long sum = 0;
        for (String value : ss) {
            firstList.add(Integer.valueOf(value.split(" ")[0]));
            secondList.add(Integer.valueOf(value.split(" ")[1]));
        }
        Collections.sort(firstList);
        Collections.sort(secondList);
        int i = 0, j = 0;
        while (i < firstList.size() && j < secondList.size()) {
            if (firstList.get(i) < secondList.get(j)) {
                i++;
                continue;
            }
            if (firstList.get(i) > secondList.get(j)) {
                j++;
                continue;
            }
            if (firstList.get(i).equals(secondList.get(j))) {
                long k = 0, l = 0;
                int number = firstList.get(i);
                while (firstList.get(i) == number) {
                    i++;
                    k++;
                }
                while (number == secondList.get(j)) {
                    j++;
                    l++;
                }
                sum += number * k * l;
                System.out.println("sum = " + sum);
            }
        }

        System.out.println(sum);
    }
}
