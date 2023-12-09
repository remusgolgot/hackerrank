package adventofcode.aoc2023.day9;


public class Main {

    static String s = "0 3 6 9 12 15\n" +
            "1 3 6 10 15 21\n" +
            "10 13 16 21 30 45";

    static String sq = "-2 6 32 90 203 421 863 1799 3804 8041 16764 34188 67988 131949 250881 470219 875478 1632236 3067792 5834670 11229253\n" +
            "9 3 -4 6 66 226 561 1193 2351 4518 8760 17435 35714 74856 159260 341577 734834 1580026 3386666 7221320 15292153\n" +
            "10 24 34 42 67 169 489 1304 3092 6596 12866 23238 39178 61916 91984 129612 179482 269732 509310 1236682 3367793\n" +
            "14 24 45 77 120 174 239 315 402 500 609 729 860 1002 1155 1319 1494 1680 1877 2085 2304\n" +
            "17 32 49 71 122 274 689 1683 3826 8101 16156 30696 56077 99181 170670 286738 471503 760206 1203411 1872429 2866220\n" +
            "10 23 42 70 110 165 238 332 450 595 770 978 1222 1505 1830 2200 2618 3087 3610 4190 4830\n" +
            "0 9 33 75 138 225 339 483 660 873 1125 1419 1758 2145 2583 3075 3624 4233 4905 5643 6450\n" +
            "28 43 58 73 88 103 118 133 148 163 178 193 208 223 238 253 268 283 298 313 328\n" +
            "17 35 66 130 274 590 1251 2579 5161 10031 18938 34722 61822 106942 179903 294711 470873 734995 1122698 1680890 2470434\n" +
            "11 22 58 133 260 451 717 1068 1513 2060 2716 3487 4378 5393 6535 7806 9207 10738 12398 14185 16096\n" +
            "6 9 12 15 18 21 24 27 30 33 36 39 42 45 48 51 54 57 60 63 66\n" +
            "21 35 57 88 130 195 318 571 1087 2137 4366 9400 21226 49118 113625 258584 574801 1245747 2633471 5435484 10962674\n" +
            "2 1 -3 -10 -20 -33 -49 -68 -90 -115 -143 -174 -208 -245 -285 -328 -374 -423 -475 -530 -588\n" +
            "11 23 45 101 230 489 954 1715 2875 4592 7247 11880 21110 40844 83184 171060 345251 674605 1270433 2306231 4044078\n" +
            "3 12 33 76 169 365 756 1502 2883 5382 9807 17460 30361 51535 85370 138054 218099 336960 509757 756108 1101081\n" +
            "1 15 41 79 120 143 116 18 -83 168 1858 7760 24318 65638 161189 370021 805897 1679941 3370367 6532733 12269132\n" +
            "20 42 92 180 325 567 978 1672 2814 4628 7404 11504 17367 25513 36546 51156 70120 94302 124652 162204 208073\n" +
            "23 39 77 149 261 413 605 852 1209 1803 2863 4731 7827 12529 18915 26298 32467 32527 17209 -29503 -133607\n" +
            "10 33 82 175 332 576 934 1434 2094 2899 3762 4465 4576 3338 -474 -8732 -24174 -50667 -93518 -159837 -258956\n" +
            "11 13 21 46 107 240 523 1133 2469 5401 11739 25058 52065 104752 203645 382533 695143 1224317 2094345 3487214 5663647\n" +
            "24 39 67 123 224 400 727 1403 2910 6335 13963 30319 63970 130713 259493 503908 965100 1837163 3495307 6661823 12707980\n" +
            "11 21 49 113 252 543 1129 2278 4521 8968 17986 36557 74839 152761 307939 608865 1176275 2216947 4076043 7316645 12838530\n" +
            "-8 -13 -7 29 118 298 645 1311 2599 5129 10205 20606 42264 87783 183696 385071 804078 1664275 3401109 6843887 13539254\n" +
            "16 37 64 97 144 239 471 1019 2185 4422 8372 14964 25677 43146 72373 122910 212606 374203 668120 1210107 2234798\n" +
            "10 7 4 1 -2 -5 -8 -11 -14 -17 -20 -23 -26 -29 -32 -35 -38 -41 -44 -47 -50\n" +
            "-3 10 36 75 127 192 270 361 465 582 712 855 1011 1180 1362 1557 1765 1986 2220 2467 2727\n" +
            "3 2 6 24 80 228 578 1350 2989 6391 13313 27088 53874 104892 200554 378238 707087 1316228 2448308 4559984 8507708\n" +
            "1 12 31 60 101 156 227 316 425 556 711 892 1101 1340 1611 1916 2257 2636 3055 3516 4021\n" +
            "13 8 12 47 144 356 793 1684 3471 6950 13496 25442 46724 83960 148242 258239 446161 770708 1347360 2420081 4526416\n" +
            "-3 -1 1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37\n" +
            "14 27 51 88 153 288 576 1155 2232 4097 7137 11850 18859 28926 42966 62061 87474 120663 163295 217260 284685\n" +
            "8 24 48 92 180 352 688 1373 2843 6097 13350 29366 64103 137837 290930 602279 1223993 2446469 4820739 9389751 18129121\n" +
            "10 17 22 32 70 192 514 1254 2794 5767 11174 20536 36086 61006 99714 158206 244458 368893 544918 789536 1124038\n" +
            "9 6 3 0 -3 -6 -9 -12 -15 -18 -21 -24 -27 -30 -33 -36 -39 -42 -45 -48 -51\n" +
            "5 13 28 50 79 115 158 208 265 329 400 478 563 655 754 860 973 1093 1220 1354 1495\n" +
            "10 14 25 43 68 100 139 185 238 298 365 439 520 608 703 805 914 1030 1153 1283 1420\n" +
            "13 16 21 46 132 355 853 1881 3907 7763 14875 27640 50157 89885 161665 297445 569029 1139166 2371737 5060530 10887662\n" +
            "11 27 55 96 159 278 542 1138 2407 4913 9525 17512 30651 51348 82772 129002 195187 287719 414419 584736 809959\n" +
            "6 13 28 46 71 135 324 816 1949 4362 9293 19185 38871 77856 154772 306355 606076 1203283 2404782 4841016 9794171\n" +
            "23 44 82 145 236 351 472 554 513 234 -366 -1165 -1474 621 9352 32972 86283 194248 396994 756565 1365840\n" +
            "27 49 76 108 144 184 251 447 1056 2720 6755 15757 34787 73633 150940 301390 587617 1119171 2081614 3779754 6700114\n" +
            "-3 12 46 109 227 459 919 1809 3472 6487 11863 21455 38828 70938 131182 244589 456175 843758 1536812 2743217 4786017\n" +
            "12 22 40 73 135 255 507 1074 2359 5160 10933 22177 42988 79845 142710 246546 413382 675082 1077006 1682785 2580469\n" +
            "11 9 24 85 246 599 1289 2531 4629 7997 13182 20889 32008 47643 69143 98135 136559 186705 251252 333309 436458\n" +
            "1 9 33 78 147 248 403 666 1180 2343 5214 12388 29760 70024 159710 353594 764339 1622685 3396575 7019418 14312633\n" +
            "3 13 39 97 209 417 822 1657 3400 6940 13833 26739 50243 92485 168441 306436 560709 1034827 1923767 3586937 6670761\n" +
            "12 31 79 171 334 619 1117 1986 3502 6155 10821 19053 33548 58863 102471 176268 298664 497415 813379 1305407 2056610\n" +
            "11 27 56 116 231 443 832 1543 2818 5028 8695 14482 23097 34981 49492 63002 64817 29013 -100970 -439972 -1208601\n" +
            "15 18 28 55 109 200 338 533 795 1134 1560 2083 2713 3460 4334 5345 6503 7818 9300 10959 12805\n" +
            "13 29 63 123 223 395 713 1339 2601 5113 9947 18867 34635 61399 105173 174419 280741 439701 671767 1003403 1468311\n" +
            "17 35 61 99 168 319 661 1400 2906 5847 11466 22142 42513 81735 158050 307953 604183 1189915 2341411 4578637 8853750\n" +
            "-8 -1 13 45 135 369 904 2008 4123 7974 14792 26812 48368 88158 163617 308841 588178 1118473 2104055 3889919 7040221\n" +
            "19 31 48 78 134 238 439 858 1775 3771 7932 16112 31238 57622 101223 169776 272675 420463 623744 891290 1227070\n" +
            "10 13 12 -1 -31 -69 -72 68 569 1832 4587 10230 21631 45044 94497 201588 436704 953591 2080014 4496189 9574569\n" +
            "-9 -19 -31 -39 -26 48 275 863 2270 5469 12447 27114 56918 115634 227996 436998 814653 1476509 2598873 4434895 7320586\n" +
            "7 17 45 97 190 365 694 1273 2201 3564 5473 8246 12876 21990 41578 83856 171723 345379 671789 1257807 2267914\n" +
            "-1 5 35 111 271 589 1208 2392 4618 8765 16535 31396 60637 119708 241165 492822 1014281 2090159 4296531 8792895 17901235\n" +
            "14 21 45 111 251 506 943 1708 3153 6097 12308 25325 51776 103390 199948 373470 673992 1177349 1995447 3289579 5287417\n" +
            "10 17 42 99 205 385 679 1156 1948 3335 5953 11273 22615 47111 99203 206461 418806 822861 1564680 2887611 5199481\n" +
            "-2 1 4 7 10 13 16 19 22 25 28 31 34 37 40 43 46 49 52 55 58\n" +
            "20 31 47 68 95 138 226 419 822 1601 3001 5366 9161 14996 23652 36109 53576 77523 109715 152248 207587\n" +
            "11 12 10 -1 -20 -21 71 413 1308 3352 7770 17155 37046 79231 168542 356559 748589 1555324 3188838 6435615 12759196\n" +
            "8 24 57 131 292 631 1320 2664 5176 9686 17499 30621 52076 86341 139930 222162 346152 530068 798701 1185399 1734420\n" +
            "-3 -2 1 4 14 58 209 653 1848 4871 12127 28735 65180 142371 301336 621854 1258051 2505372 4923793 9558574 18324814\n" +
            "14 24 35 50 81 148 273 481 849 1693 4066 10875 29143 74310 178130 402979 867849 1796199 3605716 7080231 13705598\n" +
            "18 35 53 80 132 236 443 859 1715 3533 7534 16624 37649 86198 196102 436928 944151 1968292 3951493 7644402 14287959\n" +
            "18 38 62 86 101 89 25 -107 -276 -336 80 1712 5879 14747 31667 61591 111574 191370 314130 497210 763097\n" +
            "8 19 46 100 200 380 694 1216 2034 3238 4904 7100 10051 14942 26679 61715 167472 465961 1244334 3131208 7422198\n" +
            "11 39 89 171 297 481 739 1089 1551 2147 2901 3839 4989 6381 8047 10021 12339 15039 18161 21747 25841\n" +
            "11 22 29 32 31 26 17 4 -13 -34 -59 -88 -121 -158 -199 -244 -293 -346 -403 -464 -529\n" +
            "12 29 61 127 269 574 1206 2460 4865 9386 17814 33509 62825 117904 222270 422097 808638 1561751 3031639 5886991 11374113\n" +
            "5 7 0 -21 -64 -147 -303 -563 -883 -967 76 4317 15924 42515 97065 200499 385117 699011 1211648 2020807 3261072\n" +
            "0 17 63 162 347 660 1152 1883 2922 4347 6245 8712 11853 15782 20622 26505 33572 41973 51867 63422 76815\n" +
            "27 51 91 155 261 459 863 1691 3316 6349 11812 21519 38884 70580 129936 243986 468209 917075 1825817 3671207 7399031\n" +
            "8 19 54 136 299 585 1041 1716 2658 3911 5512 7488 9853 12605 15723 19164 22860 26715 30602 34360 37791\n" +
            "12 26 55 108 206 397 787 1593 3224 6396 12287 22738 40506 69575 115531 186007 291204 444494 663111 968936 1389382\n" +
            "12 21 31 39 42 37 21 -9 -56 -123 -213 -329 -474 -651 -863 -1113 -1404 -1739 -2121 -2553 -3038\n" +
            "17 24 43 90 183 337 559 843 1165 1478 1707 1744 1443 615 -977 -3623 -7671 -13532 -21685 -32682 -47153\n" +
            "24 53 99 168 269 414 620 924 1440 2521 5151 11799 28141 66324 150840 328635 685840 1374525 2654195 4954426 8967141\n" +
            "10 11 14 26 68 179 432 982 2180 4806 10498 22483 46750 93844 181504 338417 609414 1062493 1798118 2961312 4757136\n" +
            "10 26 65 140 279 544 1067 2116 4221 8434 16884 33939 68527 138526 278649 553995 1082552 2071698 3876655 7093774 12709867\n" +
            "8 10 28 90 251 605 1297 2535 4602 7868 12802 19984 30117 44039 62735 87349 119196 159774 210776 274102 351871\n" +
            "19 40 78 159 336 713 1479 2958 5700 10667 19614 35854 65786 121961 229232 436932 842405 1635062 3176082 6137741 11739152\n" +
            "11 37 87 174 311 516 819 1279 2032 3404 6136 11781 23346 46265 89802 168996 307273 539863 918173 1515280 2432721\n" +
            "5 11 36 96 213 428 826 1586 3095 6219 12921 27571 59521 127834 269475 552809 1098921 2114091 3937738 7111306 12474917\n" +
            "25 49 98 191 365 693 1306 2422 4399 7848 13877 24610 44264 81307 152619 291257 560641 1080239 2072060 3945033 7448163\n" +
            "15 31 68 129 223 387 720 1429 2887 5703 10804 19529 33735 55915 89328 138141 207583 304111 435588 611473 843023\n" +
            "12 22 50 118 262 534 998 1724 2796 4361 6765 10885 18957 36689 78560 180555 429343 1026319 2423287 5601839 12635079\n" +
            "11 35 73 144 288 580 1164 2333 4695 9483 19105 38132 75175 146651 284501 551806 1073359 2093119 4077757 7896012 15118278\n" +
            "5 5 20 59 144 322 687 1433 2981 6258 13254 28044 58536 119293 235877 451276 835101 1496379 2600920 4394401 7232488\n" +
            "5 16 48 111 215 370 586 873 1241 1700 2260 2931 3723 4646 5710 6925 8301 9848 11576 13495 15615\n" +
            "19 25 26 22 13 -1 -20 -44 -73 -107 -146 -190 -239 -293 -352 -416 -485 -559 -638 -722 -811\n" +
            "11 28 48 75 121 202 331 519 805 1352 2672 6081 14535 34058 76039 160741 322423 616516 1129304 1990527 3389229\n" +
            "7 12 17 22 27 32 37 42 47 52 57 62 67 72 77 82 87 92 97 102 107\n" +
            "25 38 45 44 37 29 34 104 404 1363 3938 10035 23138 49204 97889 184177 330491 569372 946819 1526390 2394171\n" +
            "14 22 47 106 219 415 747 1317 2316 4092 7273 12994 23309 41913 75357 135013 240138 422498 733147 1252114 2101935\n" +
            "25 49 93 175 331 635 1230 2375 4532 8552 16076 30353 57800 110798 212443 404263 758283 1395283 2511663 4418019 7593361\n" +
            "15 36 76 160 337 690 1357 2574 4758 8663 15665 28263 50922 91431 163004 287415 499529 853670 1432354 2358010 3808415\n" +
            "9 19 30 41 69 177 521 1418 3430 7463 14912 27972 50429 89610 160789 296327 563351 1096203 2153902 4219719 8171805\n" +
            "-3 -8 -5 23 98 246 506 964 1830 3583 7234 14826 30458 62513 128668 267246 562647 1200962 2587817 5589493 12008942\n" +
            "4 11 19 40 102 257 594 1272 2605 5252 10597 21457 43353 86776 171286 333062 638856 1211267 2272529 4215344 7706430\n" +
            "-2 7 35 104 248 508 933 1597 2654 4487 8088 15973 34247 76989 175121 393743 865282 1851995 3862509 7866530 15684678\n" +
            "12 11 20 57 154 360 743 1409 2566 4668 8692 16662 32699 65263 132093 271083 563748 1184385 2499708 5264019 10988908\n" +
            "9 29 53 87 145 257 498 1055 2356 5300 11672 24948 51980 106668 218007 447507 926229 1932029 4047529 8476631 17665165\n" +
            "14 32 68 137 255 452 812 1561 3234 6964 14963 31344 63637 125819 244669 473255 919206 1802524 3570270 7116863 14193811\n" +
            "-3 1 15 47 109 215 387 680 1237 2385 4783 9633 18965 36007 65651 115026 194189 316945 501807 773107 1162269\n" +
            "24 37 60 103 177 305 553 1103 2403 5446 12261 26777 56422 115288 230676 456717 902114 1784667 3534218 6979427 13674223\n" +
            "21 33 49 74 112 169 267 475 971 2173 5027 11624 26439 58651 126266 263310 532669 1050281 2033369 3899866 7474158\n" +
            "25 36 43 46 45 40 31 18 1 -20 -45 -74 -107 -144 -185 -230 -279 -332 -389 -450 -515\n" +
            "13 28 50 96 201 423 857 1671 3183 6001 11256 20990 38847 71396 130743 239627 441017 815418 1510750 2791892 5119901\n" +
            "12 15 20 46 125 299 624 1197 2229 4201 8178 16441 33765 69994 145196 299936 615678 1255071 2540648 5106072 10180785\n" +
            "10 25 49 99 196 361 615 993 1589 2653 4762 9091 17838 34961 67671 129783 249368 485649 964435 1948555 3971044\n" +
            "19 30 41 48 45 27 -3 -18 73 523 1983 6070 16714 43223 106850 253936 580443 1274696 2686897 5434380 10548735\n" +
            "17 38 64 97 150 250 448 845 1651 3309 6736 13765 27939 55956 110369 214720 413289 789276 1497772 2823645 5279872\n" +
            "8 2 3 33 125 317 649 1169 1954 3158 5124 8661 15710 30818 64110 136799 290728 604086 1216505 2368681 4465287\n" +
            "20 35 67 131 248 443 748 1231 2079 3761 7279 14470 28235 52438 91088 146482 216760 295984 386927 553452 1076176\n" +
            "9 19 35 71 153 324 652 1240 2235 3831 6259 9755 14495 20484 27384 34264 39253 39075 28443 -713 -60211\n" +
            "10 27 57 105 177 278 414 605 916 1513 2751 5301 10323 19692 36284 64329 109838 181111 289333 449265 680037\n" +
            "19 38 69 119 215 411 805 1578 3066 5875 11048 20292 36272 62978 106170 173905 277149 430476 652855 968525 1407957\n" +
            "4 4 9 33 115 328 783 1639 3143 5737 10277 18416 33239 60388 110383 204090 386282 758918 1559737 3339387 7342231\n" +
            "13 26 68 155 312 583 1043 1806 3032 4959 8023 13180 22609 41054 78156 152233 296087 565552 1051646 1897353 3320238\n" +
            "1 7 16 34 89 249 644 1504 3242 6634 13187 25872 50601 99286 196310 392280 792931 1618537 3322606 6821742 13926893\n" +
            "11 22 28 29 41 114 353 942 2171 4466 8422 14839 24761 39518 60771 90560 131355 186110 258320 352081 472153\n" +
            "20 34 56 91 150 250 414 671 1056 1610 2380 3419 4786 6546 8770 11535 14924 19026 23936 29755 36590\n" +
            "16 31 71 155 320 645 1299 2625 5272 10387 19879 36767 65624 113129 188739 305493 480960 738343 1107751 1627651 2346512\n" +
            "12 20 45 105 241 538 1153 2356 4609 8750 16425 31032 59618 116414 229015 448623 866282 1637656 3019645 5423011 9486207\n" +
            "16 20 19 21 58 210 644 1678 3881 8213 16189 30024 52718 88162 141761 223055 353762 588046 1057131 2058039 4216310\n" +
            "4 0 -3 -6 -14 -39 -98 -201 -324 -362 -57 1104 4026 10183 21840 42325 76356 130428 213265 336342 514482\n" +
            "7 20 46 84 142 249 467 903 1721 3154 5516 9214 14760 22783 34041 49433 70011 96992 131770 175928 231250\n" +
            "22 40 68 107 163 267 509 1095 2460 5514 12163 26340 55939 116367 237111 474085 933058 1813820 3491738 6663949 12602683\n" +
            "15 30 56 94 145 220 357 645 1255 2478 4770 8804 15529 26236 42631 66915 101871 150958 218412 309354 429905\n" +
            "1 10 28 57 116 249 539 1137 2315 4552 8662 15973 28566 49583 83613 137165 219237 341990 521536 778849 1140808\n" +
            "1 6 14 30 62 115 189 292 479 923 2014 4467 9400 18318 32909 54523 83165 115788 143622 148220 95842\n" +
            "19 33 56 92 147 229 348 516 747 1057 1464 1988 2651 3477 4492 5724 7203 8961 11032 13452 16259\n" +
            "20 41 87 179 346 636 1150 2115 4021 7861 15530 30457 58561 109636 199279 351477 601962 1002425 1625649 2571575 3974252\n" +
            "10 20 29 47 100 235 523 1061 1972 3394 5433 8030 10658 11723 7495 -9656 -53994 -150440 -340235 -688607 -1294792\n" +
            "3 0 3 18 51 108 195 318 483 696 963 1290 1683 2148 2691 3318 4035 4848 5763 6786 7923\n" +
            "10 16 23 35 74 198 526 1274 2818 5826 11555 22528 44062 87630 177986 367611 764682 1584852 3243191 6511329 12776946\n" +
            "3 4 10 42 141 376 855 1742 3283 5844 9964 16426 26349 41304 63457 95742 142067 207556 298830 424330 594685\n" +
            "25 50 102 204 388 704 1253 2262 4227 8172 16117 31938 62983 123174 239066 461826 891071 1722392 3341999 6514821 12757638\n" +
            "9 13 16 27 65 159 348 681 1217 2025 3184 4783 6921 9707 13260 17709 23193 29861 37872 47395 58609\n" +
            "22 49 89 153 263 464 858 1665 3313 6554 12594 23210 40804 68311 108833 164812 236480 319231 399447 448175 411893\n" +
            "2 4 6 21 78 233 597 1394 3062 6410 12844 24675 45522 80823 138467 229560 369338 578240 883154 1318849 1929606\n" +
            "25 38 63 115 223 447 897 1749 3265 5850 10219 17801 31575 57615 107717 203591 383225 710166 1286615 2271399 3904063\n" +
            "11 27 47 80 146 290 611 1320 2863 6186 13295 28409 60278 126738 263455 540313 1091402 2168616 4235254 8125741 15311861\n" +
            "19 37 75 147 279 519 944 1664 2823 4597 7189 10821 15723 22119 30210 40154 52043 65877 81535 98743 117039\n" +
            "8 8 14 44 130 320 683 1314 2333 3869 6017 8753 11789 14347 14828 10349 -3882 -35386 -95464 -200518 -373684\n" +
            "-8 2 39 121 279 564 1059 1897 3291 5602 9510 16428 29465 55626 110774 230597 494182 1073215 2332075 5027734 10704507\n" +
            "20 30 49 103 231 485 930 1644 2718 4256 6375 9205 12889 17583 23456 30690 39480 50034 62573 77331 94555\n" +
            "7 19 29 41 67 127 249 469 831 1387 2197 3329 4859 6871 9457 12717 16759 21699 27661 34777 43187\n" +
            "16 27 57 132 301 650 1317 2506 4512 7802 13256 22766 40531 75585 146368 288514 567504 1098437 2075931 3818104 6829729\n" +
            "9 20 28 33 35 34 30 23 13 0 -16 -35 -57 -82 -110 -141 -175 -212 -252 -295 -341\n" +
            "11 34 82 170 332 632 1176 2144 3890 7210 13975 28503 60349 129686 277207 581585 1189085 2362042 4555728 8536768 15560882\n" +
            "12 23 39 77 173 387 819 1655 3269 6414 12542 24300 46256 85916 155100 271752 462266 764417 1230993 1934231 2971167\n" +
            "23 28 41 77 150 271 455 753 1339 2696 5959 13500 29914 63749 130717 259872 505543 969924 1844477 3483103 6526870\n" +
            "25 38 48 52 51 56 109 345 1131 3332 8795 21259 48193 104726 222191 466377 975133 2032562 4209102 8615138 17342687\n" +
            "4 4 10 38 120 315 720 1481 2804 4966 8326 13336 20552 30645 44412 62787 86852 117848 157186 206458 267448\n" +
            "17 29 48 88 186 407 849 1665 3136 5864 11217 22261 45587 94759 196730 403787 815875 1622259 3178502 6146194 11740832\n" +
            "16 22 26 26 38 115 381 1094 2768 6426 14145 30232 63713 133448 278287 576511 1181700 2386578 4732856 9194306 17473068\n" +
            "16 32 52 80 122 187 303 572 1309 3351 8702 21823 52108 118430 257099 535106 1071002 2065890 3846248 6917726 12023194\n" +
            "14 26 49 91 170 324 640 1326 2863 6299 13799 29675 62353 128215 259203 517842 1026446 2022409 3959537 7687490 14759226\n" +
            "18 26 36 58 128 324 779 1689 3316 5990 10124 16283 25430 39716 64845 116689 238585 543808 1314205 3218504 7776175\n" +
            "-4 6 46 127 269 525 1027 2073 4292 8967 18683 38618 79024 159749 317995 620805 1183864 2197824 3962128 6923653 11712651\n" +
            "-4 -1 18 61 131 229 371 626 1182 2453 5269 11276 23859 50236 105892 223236 467224 961567 1929788 3755403 7064275\n" +
            "0 18 44 75 115 178 289 483 802 1290 1986 2915 4077 5434 6895 8299 9396 9826 9096 6555 1367\n" +
            "14 24 39 68 132 265 515 955 1736 3246 6481 13786 30186 65599 138305 280137 543962 1014132 1820707 3158384 5311208\n" +
            "16 28 46 70 100 136 178 226 280 340 406 478 556 640 730 826 928 1036 1150 1270 1396\n" +
            "3 2 -2 4 44 151 378 834 1754 3606 7226 13951 25687 44801 73660 113553 162621 212282 241470 207806 34582\n" +
            "22 37 60 109 211 414 825 1686 3509 7308 14991 30008 58392 110379 202850 362903 632936 1077703 1793894 2922887 4667425\n" +
            "-2 -8 -1 46 176 449 942 1752 3012 4950 8080 13754 25587 52778 117200 267461 605118 1331064 2824049 5768626 11356862\n" +
            "10 6 0 -10 -11 37 222 733 1980 4840 11150 24717 53442 113823 240387 504944 1054626 2184442 4470904 9010000 17827839\n" +
            "15 33 72 152 307 604 1186 2359 4755 9618 19278 37899 72611 135163 244264 428812 732247 1218303 1978476 3141570 4885731\n" +
            "10 8 6 4 2 0 -2 -4 -6 -8 -10 -12 -14 -16 -18 -20 -22 -24 -26 -28 -30\n" +
            "12 20 36 65 120 222 400 691 1140 1800 2732 4005 5696 7890 10680 14167 18460 23676 29940 37385 46152\n" +
            "13 22 39 70 140 304 660 1370 2693 5028 8955 15248 24816 38506 56676 78416 100261 114202 104759 44834 -109988\n" +
            "-1 4 20 59 136 273 507 902 1565 2666 4462 7325 11774 18511 28461 42816 63083 91136 129272 180271 247460\n" +
            "4 5 3 -2 -10 -21 -35 -52 -72 -95 -121 -150 -182 -217 -255 -296 -340 -387 -437 -490 -546\n" +
            "24 39 62 105 184 319 534 857 1320 1959 2814 3929 5352 7135 9334 12009 15224 19047 23550 28809 34904\n" +
            "3 13 37 79 138 209 297 449 803 1644 3444 6845 12520 20816 31044 40233 41107 18975 -52857 -219637 -554274\n" +
            "3 7 23 62 145 312 631 1212 2251 4160 7894 15690 32622 69692 149663 317547 658685 1328926 2604049 4960333 9206989\n" +
            "11 18 30 64 152 340 682 1229 2013 3026 4194 5346 6178 6212 4750 823 -6865 -19998 -40714 -71676 -116148\n" +
            "1 3 22 74 191 437 932 1894 3715 7105 13380 25048 46973 88583 167846 318080 599101 1114759 2039578 3658014 6420787\n" +
            "20 30 54 117 261 560 1144 2231 4176 7566 13423 23641 41929 75869 141425 272684 542276 1102538 2265076 4648313 9440693\n" +
            "11 19 25 31 50 121 345 970 2575 6449 15348 34975 76836 163711 340078 691865 1383666 2728502 5318025 10264647 19650275\n" +
            "27 46 69 104 170 297 526 909 1509 2400 3667 5406 7724 10739 14580 19387 25311 32514 41169 51460 63582\n" +
            "15 21 31 48 86 187 443 1015 2138 4098 7158 11385 16275 19970 17688 -1282 -59063 -198749 -500391 -1106754 -2263468\n" +
            "9 34 72 128 213 345 557 916 1568 2858 5649 12111 27518 64062 148531 337226 744342 1595426 3327751 6778772 13539966\n" +
            "13 29 74 170 355 705 1368 2616 4929 9133 16622 29702 52103 89713 151596 251364 408981 653085 1023922 1576994 2387531\n" +
            "21 32 52 94 171 296 482 742 1089 1536 2096 2782 3607 4584 5726 7046 8557 10272 12204 14366 16771\n" +
            "10 14 35 85 193 416 852 1663 3113 5617 9794 16550 27343 45099 76912 140900 281703 602439 1325776 2903210 6199220\n" +
            "-4 0 11 28 61 155 439 1218 3125 7355 16025 32754 63646 118998 216255 385006 675170 1169970 2005847 3402136 5704123\n" +
            "4 14 38 92 216 498 1116 2413 5038 10212 20219 39296 75232 142224 265929 492257 902344 1637410 2938940 5211932 9121952\n" +
            "18 18 27 65 165 389 863 1836 3765 7425 14040 25428 44150 73650 118370 183821 276588 404244 575145 798075 1081707\n" +
            "14 33 63 104 156 219 293 378 474 581 699 828 968 1119 1281 1454 1638 1833 2039 2256 2484\n" +
            "10 8 5 16 83 288 763 1699 3357 6091 10420 17256 28556 49018 90183 179830 382647 844417 1884526 4186527 9184912\n" +
            "22 43 90 172 301 496 781 1177 1693 2338 3214 4818 8788 19483 46999 112501 257104 555973 1139842 2226784 4167807\n" +
            "14 13 11 11 16 29 53 91 146 221 319 443 596 781 1001 1259 1558 1901 2291 2731 3224\n" +
            "13 14 30 75 162 306 532 899 1564 2940 6076 13543 31395 73242 168182 375353 809247 1681738 3369074 6514923 12183992\n" +
            "17 41 73 111 166 284 585 1324 2979 6371 12821 24349 43920 75742 125621 201378 313333 474861 703025 1019291 1450330\n" +
            "10 17 20 12 -4 11 184 822 2558 6565 14852 30656 58944 107039 185384 308458 495858 773561 1175380 1744628 2536004\n";

    public static void main(String[] args) {
        String[] ss = sq.split("\n");
        int soll = 0;
        for (int i = 0; i < ss.length; i++) {
            String[] nn = ss[i].split(" ");
            int[] nrs = new int[nn.length];
            for (int j = 0; j < nn.length; j++) {
                nrs[j] = Integer.parseInt(nn[j]);
            }
            boolean b = true;
            int sol = 0;
            int k = 1;
            while (b) {
                sol += nrs[nrs.length - k];
                b = false;
                for (int j = 0; j < nrs.length - k; j++) {
                    nrs[j] = nrs[j + 1] - nrs[j];
                    if (nrs[j] != 0) {
                        b = true;
                    }
                }
                k++;
            }
            soll += sol;
        }
        System.out.println(soll);
    }

}
