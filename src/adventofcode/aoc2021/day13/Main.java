package adventofcode.aoc2021.day13;

import common.Pair;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        String s = "309,320\n" +
                "32,761\n" +
                "258,108\n" +
                "70,486\n" +
                "499,474\n" +
                "1038,537\n" +
                "1054,80\n" +
                "1247,114\n" +
                "192,572\n" +
                "1262,628\n" +
                "669,250\n" +
                "534,756\n" +
                "319,52\n" +
                "1230,98\n" +
                "758,858\n" +
                "556,535\n" +
                "1089,522\n" +
                "1037,201\n" +
                "474,726\n" +
                "447,63\n" +
                "649,884\n" +
                "590,471\n" +
                "661,212\n" +
                "1307,634\n" +
                "517,680\n" +
                "31,602\n" +
                "473,511\n" +
                "427,838\n" +
                "1213,70\n" +
                "572,658\n" +
                "1305,116\n" +
                "574,796\n" +
                "154,243\n" +
                "939,588\n" +
                "261,273\n" +
                "417,215\n" +
                "99,842\n" +
                "850,317\n" +
                "63,114\n" +
                "483,616\n" +
                "940,183\n" +
                "1293,544\n" +
                "1293,444\n" +
                "390,537\n" +
                "454,889\n" +
                "129,431\n" +
                "206,610\n" +
                "53,133\n" +
                "1181,46\n" +
                "156,618\n" +
                "564,495\n" +
                "1054,856\n" +
                "298,729\n" +
                "636,588\n" +
                "1282,180\n" +
                "596,152\n" +
                "65,812\n" +
                "659,410\n" +
                "746,623\n" +
                "1103,63\n" +
                "1203,781\n" +
                "169,323\n" +
                "512,605\n" +
                "418,763\n" +
                "729,812\n" +
                "626,725\n" +
                "1228,645\n" +
                "1017,400\n" +
                "661,233\n" +
                "1282,240\n" +
                "308,140\n" +
                "157,570\n" +
                "279,606\n" +
                "626,180\n" +
                "1155,791\n" +
                "992,854\n" +
                "85,295\n" +
                "1042,70\n" +
                "547,289\n" +
                "657,287\n" +
                "542,403\n" +
                "1228,249\n" +
                "612,239\n" +
                "184,571\n" +
                "892,763\n" +
                "813,149\n" +
                "271,602\n" +
                "952,653\n" +
                "353,680\n" +
                "1139,500\n" +
                "159,254\n" +
                "522,613\n" +
                "472,98\n" +
                "825,323\n" +
                "557,518\n" +
                "398,733\n" +
                "446,201\n" +
                "483,418\n" +
                "25,232\n" +
                "460,169\n" +
                "1245,82\n" +
                "862,78\n" +
                "827,394\n" +
                "448,816\n" +
                "753,180\n" +
                "769,154\n" +
                "1083,54\n" +
                "576,89\n" +
                "855,18\n" +
                "566,357\n" +
                "334,126\n" +
                "1278,761\n" +
                "1197,740\n" +
                "1156,203\n" +
                "171,588\n" +
                "684,169\n" +
                "42,877\n" +
                "80,878\n" +
                "1111,18\n" +
                "964,544\n" +
                "957,680\n" +
                "380,731\n" +
                "552,844\n" +
                "1225,779\n" +
                "562,458\n" +
                "1128,98\n" +
                "356,852\n" +
                "495,717\n" +
                "868,602\n" +
                "358,653\n" +
                "1225,752\n" +
                "796,70\n" +
                "714,742\n" +
                "989,564\n" +
                "460,689\n" +
                "3,260\n" +
                "479,486\n" +
                "408,641\n" +
                "1155,502\n" +
                "375,431\n" +
                "709,413\n" +
                "1084,98\n" +
                "1233,239\n" +
                "1104,526\n" +
                "1221,280\n" +
                "256,609\n" +
                "321,576\n" +
                "1305,794\n" +
                "1225,142\n" +
                "1153,681\n" +
                "54,761\n" +
                "391,544\n" +
                "636,236\n" +
                "661,380\n" +
                "862,463\n" +
                "159,522\n" +
                "1056,40\n" +
                "199,876\n" +
                "917,82\n" +
                "1238,579\n" +
                "667,156\n" +
                "1303,196\n" +
                "420,408\n" +
                "1252,294\n" +
                "353,774\n" +
                "1225,164\n" +
                "430,484\n" +
                "1096,403\n" +
                "1116,725\n" +
                "648,826\n" +
                "840,795\n" +
                "592,68\n" +
                "1190,834\n" +
                "28,617\n" +
                "510,210\n" +
                "591,292\n" +
                "1151,45\n" +
                "686,577\n" +
                "893,231\n" +
                "909,700\n" +
                "957,568\n" +
                "1077,682\n" +
                "838,364\n" +
                "1014,739\n" +
                "1154,618\n" +
                "1026,732\n" +
                "745,614\n" +
                "1258,192\n" +
                "438,500\n" +
                "850,169\n" +
                "102,74\n" +
                "932,353\n" +
                "684,546\n" +
                "85,779\n" +
                "418,579\n" +
                "729,728\n" +
                "48,266\n" +
                "872,36\n" +
                "649,128\n" +
                "1240,486\n" +
                "1104,15\n" +
                "729,530\n" +
                "408,305\n" +
                "246,352\n" +
                "776,60\n" +
                "1304,544\n" +
                "920,537\n" +
                "139,330\n" +
                "85,516\n" +
                "167,74\n" +
                "353,568\n" +
                "569,730\n" +
                "768,403\n" +
                "657,735\n" +
                "1110,889\n" +
                "227,392\n" +
                "311,712\n" +
                "10,889\n" +
                "460,849\n" +
                "1073,616\n" +
                "729,455\n" +
                "893,278\n" +
                "1151,254\n" +
                "708,478\n" +
                "1116,45\n" +
                "750,124\n" +
                "407,649\n" +
                "383,219\n" +
                "1304,96\n" +
                "967,56\n" +
                "1307,410\n" +
                "407,693\n" +
                "709,761\n" +
                "897,30\n" +
                "1116,515\n" +
                "579,21\n" +
                "129,848\n" +
                "11,436\n" +
                "499,52\n" +
                "802,117\n" +
                "296,269\n" +
                "391,96\n" +
                "1213,424\n" +
                "216,394\n" +
                "430,410\n" +
                "77,239\n" +
                "1208,410\n" +
                "0,194\n" +
                "1088,523\n" +
                "882,796\n" +
                "318,40\n" +
                "1240,869\n" +
                "990,544\n" +
                "1084,546\n" +
                "1295,504\n" +
                "811,392\n" +
                "403,514\n" +
                "457,64\n" +
                "1179,5\n" +
                "1310,194\n" +
                "102,858\n" +
                "25,186\n" +
                "927,227\n" +
                "523,441\n" +
                "684,770\n" +
                "1222,427\n" +
                "493,761\n" +
                "483,868\n" +
                "1195,158\n" +
                "65,516\n" +
                "714,70\n" +
                "371,511\n" +
                "335,278\n" +
                "661,757\n" +
                "815,522\n" +
                "251,66\n" +
                "97,424\n" +
                "301,344\n" +
                "398,197\n" +
                "420,325\n" +
                "430,260\n" +
                "356,841\n" +
                "304,278\n" +
                "455,18\n" +
                "1076,549\n" +
                "915,812\n" +
                "1151,177\n" +
                "1052,786\n" +
                "661,234\n" +
                "745,280\n" +
                "893,530\n" +
                "428,796\n" +
                "1225,295\n" +
                "1153,12\n" +
                "1299,436\n" +
                "219,65\n" +
                "848,688\n" +
                "497,149\n" +
                "584,82\n" +
                "30,353\n" +
                "818,750\n" +
                "53,89\n" +
                "405,227\n" +
                "49,378\n" +
                "997,726\n" +
                "1069,590\n" +
                "89,280\n" +
                "648,516\n" +
                "376,490\n" +
                "1190,610\n" +
                "654,700\n" +
                "972,317\n" +
                "821,133\n" +
                "1285,186\n" +
                "1213,266\n" +
                "1203,410\n" +
                "542,491\n" +
                "596,294\n" +
                "490,770\n" +
                "1203,333\n" +
                "89,663\n" +
                "957,214\n" +
                "152,45\n" +
                "492,750\n" +
                "221,372\n" +
                "771,319\n" +
                "171,476\n" +
                "825,352\n" +
                "626,322\n" +
                "448,463\n" +
                "1260,162\n" +
                "766,394\n" +
                "534,610\n" +
                "435,513\n" +
                "408,589\n" +
                "402,10\n" +
                "1293,14\n" +
                "1,581\n" +
                "1154,462\n" +
                "517,478\n" +
                "666,5\n" +
                "73,364\n" +
                "734,89\n" +
                "1051,364\n" +
                "382,761\n" +
                "5,548\n" +
                "438,52\n" +
                "445,400\n" +
                "704,266\n" +
                "952,155\n" +
                "1159,10\n" +
                "236,763\n" +
                "428,684\n" +
                "626,124\n" +
                "473,2\n" +
                "534,284\n" +
                "666,794\n" +
                "960,840\n" +
                "818,465\n" +
                "131,889\n" +
                "120,610\n" +
                "470,795\n" +
                "577,154\n" +
                "974,406\n" +
                "497,772\n" +
                "748,10\n" +
                "1246,423\n" +
                "20,571\n" +
                "113,740\n" +
                "391,798\n" +
                "594,820\n" +
                "97,628\n" +
                "525,64\n" +
                "15,488\n" +
                "641,250\n" +
                "1151,864\n" +
                "508,677\n" +
                "808,493\n" +
                "534,138\n" +
                "972,884\n" +
                "917,621\n" +
                "618,229\n" +
                "1240,25\n" +
                "1231,649\n" +
                "800,96\n" +
                "967,728\n" +
                "853,64\n" +
                "999,504\n" +
                "641,168\n" +
                "338,789\n" +
                "624,577\n" +
                "1064,253\n" +
                "1154,126\n" +
                "1017,848\n" +
                "335,616\n" +
                "912,815\n" +
                "107,410\n" +
                "485,519\n" +
                "157,233\n" +
                "490,124\n" +
                "1282,404\n" +
                "402,467\n" +
                "222,523\n" +
                "1116,281\n" +
                "1292,588\n" +
                "716,248\n" +
                "676,284\n" +
                "815,298\n" +
                "325,805\n" +
                "321,347\n" +
                "1235,773\n" +
                "962,60\n" +
                "316,789\n" +
                "336,406\n" +
                "875,154\n" +
                "432,140\n" +
                "935,288\n" +
                "895,682\n" +
                "1113,830\n" +
                "893,663\n" +
                "637,285\n" +
                "343,728\n" +
                "413,864\n" +
                "1300,506\n" +
                "787,441\n" +
                "812,618\n" +
                "508,117\n" +
                "991,842\n" +
                "107,289\n" +
                "1181,848\n" +
                "442,740\n" +
                "1171,330\n" +
                "940,250\n" +
                "596,742\n" +
                "70,25\n" +
                "662,826\n" +
                "1266,649\n" +
                "1026,698\n" +
                "356,393\n" +
                "1305,330\n" +
                "383,870\n" +
                "370,644\n" +
                "880,484\n" +
                "1285,232\n" +
                "1103,719\n" +
                "7,166\n" +
                "719,292\n" +
                "132,689\n" +
                "800,82\n" +
                "736,529\n" +
                "711,227\n" +
                "940,15\n" +
                "663,614\n" +
                "584,408\n" +
                "483,306\n" +
                "1282,490\n" +
                "5,234\n" +
                "1047,350\n" +
                "268,70\n" +
                "574,529\n" +
                "907,514\n" +
                "192,770\n" +
                "272,89\n" +
                "1222,693\n" +
                "288,106\n" +
                "343,838\n" +
                "483,250\n" +
                "115,127\n" +
                "1278,133\n" +
                "381,805\n" +
                "1211,842\n" +
                "53,413\n" +
                "1049,273\n" +
                "180,502\n" +
                "644,100\n" +
                "810,243\n" +
                "432,523\n" +
                "52,702\n" +
                "930,646\n" +
                "989,576\n" +
                "1252,824\n" +
                "189,680\n" +
                "438,858\n" +
                "815,717\n" +
                "57,137\n" +
                "480,877\n" +
                "1198,717\n" +
                "97,824\n" +
                "70,522\n" +
                "375,288\n" +
                "909,252\n" +
                "189,640\n" +
                "1258,731\n" +
                "479,38\n" +
                "1208,484\n" +
                "535,175\n" +
                "1278,581\n" +
                "273,425\n" +
                "1257,133\n" +
                "6,511\n" +
                "741,142\n" +
                "589,306\n" +
                "872,352\n" +
                "591,154\n" +
                "908,10\n" +
                "393,621\n" +
                "442,602\n" +
                "807,548\n" +
                "574,753\n" +
                "1084,684\n" +
                "812,768\n" +
                "870,17\n" +
                "1304,383\n" +
                "1300,100\n" +
                "1158,401\n" +
                "883,838\n" +
                "85,107\n" +
                "1290,571\n" +
                "321,800\n" +
                "502,493\n" +
                "28,796\n" +
                "1305,548\n" +
                "981,313\n" +
                "487,596\n" +
                "555,394\n" +
                "644,521\n" +
                "676,106\n" +
                "503,346\n" +
                "601,481\n" +
                "1026,172\n" +
                "1305,234\n" +
                "807,884\n" +
                "103,287\n" +
                "897,331\n" +
                "1175,693\n" +
                "1154,768\n" +
                "1049,586\n" +
                "720,647\n" +
                "892,579\n" +
                "989,458\n" +
                "313,726\n" +
                "922,484\n" +
                "75,773\n" +
                "1151,796\n" +
                "909,812\n" +
                "562,79\n" +
                "909,728\n" +
                "102,820\n" +
                "922,410\n" +
                "18,588\n" +
                "462,688\n" +
                "674,306\n" +
                "79,649\n" +
                "561,660\n" +
                "1240,522\n" +
                "109,257\n" +
                "1091,513\n" +
                "159,596\n" +
                "510,96\n" +
                "720,471\n" +
                "606,266\n" +
                "555,838\n" +
                "30,801\n" +
                "964,684\n" +
                "1295,497\n" +
                "1198,177\n" +
                "890,345\n" +
                "848,770\n" +
                "890,325\n" +
                "880,410\n" +
                "65,378\n" +
                "989,542\n" +
                "460,577\n" +
                "601,805\n" +
                "226,98\n" +
                "865,400\n" +
                "636,795\n" +
                "939,511\n" +
                "510,82\n" +
                "763,561\n" +
                "870,877\n" +
                "1128,796\n" +
                "893,364\n" +
                "17,444\n" +
                "649,233\n" +
                "700,693\n" +
                "649,795\n" +
                "1235,386\n" +
                "741,730\n" +
                "508,217\n" +
                "841,684\n" +
                "472,796\n" +
                "499,551\n" +
                "840,323\n" +
                "370,711\n" +
                "754,535\n" +
                "748,589\n" +
                "5,330\n" +
                "420,345\n" +
                "875,484\n" +
                "1156,243\n" +
                "562,589\n" +
                "107,333\n" +
                "719,740\n" +
                "606,628\n" +
                "256,597\n" +
                "443,64\n" +
                "1052,108\n" +
                "443,830\n" +
                "382,133\n" +
                "127,466\n" +
                "1139,196\n" +
                "611,642\n" +
                "738,658\n" +
                "44,649\n" +
                "1139,418\n" +
                "754,359\n" +
                "872,500\n" +
                "649,661\n" +
                "1061,292\n" +
                "1004,442\n" +
                "155,551\n" +
                "107,561\n" +
                "479,794\n" +
                "249,740\n" +
                "15,390\n" +
                "610,693\n" +
                "1121,214\n" +
                "214,403\n" +
                "594,248\n" +
                "1230,424\n" +
                "572,197\n" +
                "643,458\n" +
                "393,532\n" +
                "1293,880\n" +
                "565,588\n" +
                "338,884\n" +
                "370,183\n" +
                "85,752\n" +
                "1257,89\n" +
                "745,343\n" +
                "165,133\n" +
                "88,467\n" +
                "1299,710\n" +
                "413,331\n" +
                "671,497\n" +
                "10,58\n" +
                "202,58\n" +
                "457,830\n" +
                "428,210\n" +
                "798,605\n" +
                "1293,798\n" +
                "647,728\n" +
                "1227,537\n" +
                "335,52\n" +
                "977,235\n" +
                "823,820\n" +
                "487,820\n" +
                "417,663\n" +
                "1307,260\n" +
                "77,655\n" +
                "83,537\n" +
                "1143,596\n" +
                "470,323\n" +
                "1164,565\n" +
                "417,168\n" +
                "181,63\n" +
                "657,607\n" +
                "1145,761\n" +
                "661,788\n" +
                "718,68\n" +
                "929,805\n" +
                "1063,649\n" +
                "552,484\n" +
                "1064,430\n" +
                "748,527\n" +
                "897,864\n" +
                "1225,115\n" +
                "736,141\n" +
                "1279,602\n" +
                "741,164\n" +
                "288,340\n" +
                "420,486\n" +
                "662,511\n" +
                "552,74\n" +
                "102,36\n" +
                "1054,814\n" +
                "522,241\n" +
                "276,310\n" +
                "912,285\n" +
                "28,240\n" +
                "1225,107\n" +
                "1290,60\n" +
                "746,495\n" +
                "661,554\n" +
                "667,448\n" +
                "574,365\n" +
                "182,350\n" +
                "184,157\n" +
                "445,494\n" +
                "28,654\n" +
                "1061,17\n" +
                "1153,233\n" +
                "497,513\n" +
                "1151,98\n" +
                "791,693\n" +
                "499,103\n" +
                "875,381\n" +
                "952,269\n" +
                "972,105\n" +
                "930,163\n" +
                "730,427\n" +
                "1217,10\n" +
                "530,127\n" +
                "28,277\n" +
                "1295,182\n" +
                "348,732\n" +
                "130,516\n" +
                "186,819\n" +
                "919,350\n" +
                "5,116\n" +
                "912,814\n" +
                "1009,792\n" +
                "1292,210\n" +
                "552,50\n" +
                "811,24\n" +
                "155,103\n" +
                "329,313\n" +
                "432,754\n" +
                "1146,592\n" +
                "207,719\n" +
                "146,565\n" +
                "1305,547\n" +
                "776,284\n" +
                "306,442\n" +
                "1108,506\n" +
                "503,884\n" +
                "912,79\n" +
                "1098,292\n" +
                "858,127\n" +
                "135,693\n" +
                "676,340\n" +
                "1056,406\n" +
                "1154,798\n" +
                "256,38\n" +
                "644,5\n" +
                "972,577\n" +
                "490,322\n" +
                "716,646\n" +
                "565,551\n" +
                "1230,16\n" +
                "99,500\n" +
                "1300,388\n" +
                "813,12\n" +
                "634,323\n" +
                "964,530\n" +
                "1056,488\n" +
                "726,25\n" +
                "990,63\n" +
                "7,390\n" +
                "159,45\n" +
                "544,484\n" +
                "321,352\n" +
                "651,484\n" +
                "284,722\n" +
                "934,404\n" +
                "236,355\n" +
                "1135,408\n" +
                "780,127\n" +
                "788,241\n" +
                "92,365\n" +
                "671,390\n" +
                "1034,310\n" +
                "589,826\n" +
                "989,683\n" +
                "766,410\n" +
                "438,542\n" +
                "321,318\n" +
                "157,625\n" +
                "1076,408\n" +
                "853,830\n" +
                "247,649\n" +
                "1074,315\n" +
                "381,761\n" +
                "954,729\n" +
                "644,889\n" +
                "534,834\n" +
                "569,752\n" +
                "1146,302\n" +
                "268,376\n" +
                "427,504\n" +
                "733,154\n" +
                "976,798\n" +
                "544,394\n" +
                "70,372\n" +
                "256,149\n" +
                "499,842\n" +
                "575,649\n" +
                "497,823\n" +
                "519,693\n" +
                "954,841\n" +
                "960,278";

        String folds = "fold along x=655\n" +
                "fold along y=447\n" +
                "fold along x=327\n" +
                "fold along y=223\n" +
                "fold along x=163\n" +
                "fold along y=111\n" +
                "fold along x=81\n" +
                "fold along y=55\n" +
                "fold along x=40\n" +
                "fold along y=27\n" +
                "fold along y=13\n" +
                "fold along y=6";

        String[] ss = s.split("\n");
        List<Pair<Integer, Integer>> points = new ArrayList<>();
        for (String value : ss) {
            points.add(new Pair<>(Integer.parseInt(value.split(",")[0]), Integer.parseInt(value.split(",")[1])));
        }
        System.out.println(points.size());
        List<Pair<Integer, Integer>> listAfterFold = new ArrayList<>();
        for (int i = 0; i < points.size(); i++) {
            if (points.get(i).getFirst() == 655) {
                continue;
            }
            if (points.get(i).getFirst() > 655) {
                listAfterFold.add(new Pair<>(2 * 655 - points.get(i).getFirst(), points.get(i).getSecond()));
            } else {
                listAfterFold.add(points.get(i));
            }
        }
        Set<String> set = new HashSet<>();
        for (int i = 0; i < listAfterFold.size(); i++) {
            String e = listAfterFold.get(i).getFirst().toString() + ":" + listAfterFold.get(i).getSecond().toString();
            set.add(e);
            System.out.println(e);
        }
        System.out.println(set.size());
        System.out.println("DONE");

    }
}