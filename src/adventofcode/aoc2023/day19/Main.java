package adventofcode.aoc2023.day19;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static String s =
            "px{a<2006:qkq,m>2090:A,rfg}\n" +
                    "pv{a>1716:R,A}\n" +
                    "lnx{m>1548:A,A}\n" +
                    "rfg{s<537:gd,x>2440:R,A}\n" +
                    "qs{s>3448:A,lnx}\n" +
                    "qkq{x<1416:A,crn}\n" +
                    "crn{x>2662:A,R}\n" +
                    "in{s<1351:px,qqz}\n" +
                    "qqz{s>2770:qs,m<1801:hdj,R}\n" +
                    "gd{a>3333:R,R}\n" +
                    "hdj{m>838:A,pv}\n" +
                    " " +
                    "{x=787,m=2655,a=1222,s=2876}\n" +
                    "{x=1679,m=44,a=2067,s=496}\n" +
                    "{x=2036,m=264,a=79,s=2244}\n" +
                    "{x=2461,m=1339,a=466,s=291}\n" +
                    "{x=2127,m=1623,a=2188,s=1013}";

    static String sq = "cqh{m>1849:R,A}\n" +
            "zs{a>1909:ql,x<1340:kxd,m>3378:kt,kbt}\n" +
            "sp{a<665:R,s>1356:A,A}\n" +
            "kf{a>1202:rkv,x>2756:A,jnv}\n" +
            "kck{s<1337:pgl,R}\n" +
            "tnp{x<3631:mm,x<3771:qbx,a>1403:kjs,lxf}\n" +
            "vnj{a>2884:fm,a>2424:gg,mgv}\n" +
            "zxv{s<436:R,a>261:A,R}\n" +
            "pjx{s<1500:A,x>2599:R,vg}\n" +
            "pc{s<2563:A,qx}\n" +
            "fv{m<1688:A,A}\n" +
            "zb{m>1561:A,m<1418:A,m>1510:R,A}\n" +
            "ss{x<1970:A,x>2017:R,m<2125:R,A}\n" +
            "zm{x>1228:R,R}\n" +
            "mhp{m<2647:R,a<1979:A,x<288:A,A}\n" +
            "nr{x<884:R,a<1947:ptj,sg}\n" +
            "vh{m>1512:jv,x<994:lr,pgt}\n" +
            "stn{s<3016:qpr,hq}\n" +
            "ktb{x<2371:A,R}\n" +
            "np{s<976:bkp,x>3236:jbl,x<2743:nlp,slc}\n" +
            "ssj{x<2301:cms,lxg}\n" +
            "dnj{x>1620:A,m>1035:A,A}\n" +
            "xj{s>396:qqp,m<2541:hlb,qsl}\n" +
            "nmd{a<2160:A,x<1946:R,A}\n" +
            "cnj{x>320:A,m<382:R,A}\n" +
            "nm{x<1499:A,A}\n" +
            "xnc{a>3633:phz,x<883:bs,R}\n" +
            "fzj{a>1543:hk,m>910:jl,s<211:R,A}\n" +
            "bp{a<3520:hv,s>1344:scf,R}\n" +
            "hjc{a<2654:gz,x>767:vv,lhv}\n" +
            "qz{s<1329:R,ktb}\n" +
            "gzf{a>1805:vvs,s>270:xtc,lx}\n" +
            "qvm{a<475:A,A}\n" +
            "tp{a<1875:dm,x>985:srh,x<802:jnl,zsp}\n" +
            "zq{s>726:R,s<584:R,a<479:R,A}\n" +
            "xl{m<2614:A,a<3274:R,m<3274:R,A}\n" +
            "in{s>1957:tv,zls}\n" +
            "gx{a<2631:clr,A}\n" +
            "gzv{a>1445:cg,ht}\n" +
            "hht{x>1393:khn,a>2195:cjd,xf}\n" +
            "vf{x>3490:A,R}\n" +
            "bz{a<3150:A,x<1283:R,x>1338:R,R}\n" +
            "tcp{s>2645:R,A}\n" +
            "shf{a>3449:A,m<1344:A,x<2754:R,R}\n" +
            "rl{a>3463:R,s>2705:R,m>1573:xh,A}\n" +
            "nk{a<1561:nff,s<244:snv,dd}\n" +
            "zj{m<2629:R,R}\n" +
            "hqq{s<1218:A,a<2865:hsq,s>1590:R,zg}\n" +
            "dh{a<142:R,m<1706:pzf,lnb}\n" +
            "jzp{m<3335:A,ckp}\n" +
            "xz{a>3623:R,R}\n" +
            "rc{x<272:A,A}\n" +
            "mls{a>2255:A,m<3473:R,R}\n" +
            "gl{a>661:A,a<297:R,x>604:R,R}\n" +
            "fsb{m<346:A,m>520:R,a<1609:R,R}\n" +
            "ptl{x>904:rd,x>863:rsq,a>2356:qdm,fv}\n" +
            "vb{x<157:R,s<88:A,s>125:R,R}\n" +
            "dzj{m<1110:R,s<864:R,m<1359:A,R}\n" +
            "vgf{x>1377:A,R}\n" +
            "pk{a>3637:R,a<3421:R,m<649:A,R}\n" +
            "sbb{s<732:R,s>864:A,A}\n" +
            "lpp{m>1116:A,m>914:A,s>442:R,R}\n" +
            "br{m<3228:R,m>3557:A,s>1588:R,R}\n" +
            "zls{x>2211:np,s<727:nqg,x>1092:pl,hgk}\n" +
            "bkp{m>1445:ckq,x>2982:gbh,a<2618:fz,bq}\n" +
            "lv{a<1050:R,x>1991:A,R}\n" +
            "pgt{x<1139:nrr,a<2036:rs,qv}\n" +
            "rsq{x>890:A,a>2384:R,s<2459:A,A}\n" +
            "lx{m>1867:krg,m<856:fx,qp}\n" +
            "lk{x<3205:A,a>2637:gp,x>3571:sq,nj}\n" +
            "kkx{m<3287:R,R}\n" +
            "lpc{x<1258:gtp,m<2505:dl,s<1541:vrv,qm}\n" +
            "pfr{x>242:A,R}\n" +
            "xd{x>637:R,A}\n" +
            "dgb{m<2887:A,m<3160:R,s<507:tlj,cl}\n" +
            "sz{a>2480:R,x<1077:A,m>369:A,R}\n" +
            "zt{a<2249:R,s>1173:R,s>1055:rt,jvj}\n" +
            "mjc{s>417:A,nbk}\n" +
            "vdz{a<2968:A,x>618:A,a>3118:A,R}\n" +
            "hjd{x<3042:A,a<479:A,s<1182:A,R}\n" +
            "fk{x>170:tlm,R}\n" +
            "jt{a<1904:A,A}\n" +
            "cm{m>2053:A,A}\n" +
            "pbc{x>2064:A,s>1335:A,x<2057:A,R}\n" +
            "jtn{m<3595:R,a<2443:dt,R}\n" +
            "fdr{x<170:zrm,zss}\n" +
            "qx{m<1330:R,A}\n" +
            "zvl{x>1154:A,a>3086:A,R}\n" +
            "xtc{m<2363:jxs,m<3368:dgb,m>3777:pgq,phq}\n" +
            "rjk{x>2343:R,R}\n" +
            "hn{s<2971:bph,m<1962:fl,zz}\n" +
            "gg{x<756:R,s<2434:A,A}\n" +
            "tps{a>2539:A,A}\n" +
            "tj{x>3769:A,a<2474:A,a>3050:A,A}\n" +
            "jgb{x>1394:vth,x>1340:R,a<2466:xsk,A}\n" +
            "txq{m<3293:A,m<3736:A,R}\n" +
            "srv{s<1686:R,a>934:R,x<1159:A,R}\n" +
            "dg{x>3478:R,td}\n" +
            "bs{m<1413:R,m<2741:R,R}\n" +
            "hv{a>3019:A,m>230:R,a>2889:R,R}\n" +
            "qct{x<2515:ttz,x<2620:R,tbd}\n" +
            "bph{m>1692:R,a<1706:A,s>2455:bdt,bhf}\n" +
            "xnp{a<2896:A,a>3434:ck,s>567:kgk,A}\n" +
            "zk{a>1220:R,m>2395:A,R}\n" +
            "nvj{x<2973:kbn,s<1742:vzv,R}\n" +
            "ndk{s>1154:R,s>893:A,s>831:A,A}\n" +
            "hkv{x>1420:R,m>389:A,A}\n" +
            "xxn{s>3361:htx,a>2268:A,R}\n" +
            "rr{s>2668:R,A}\n" +
            "jl{m<1582:A,m<2069:R,s<244:R,A}\n" +
            "fd{a>407:R,R}\n" +
            "rs{x>1258:vhq,a>1007:txn,R}\n" +
            "xm{a>3738:R,s>2755:A,A}\n" +
            "vzv{a>984:A,A}\n" +
            "hk{x<1994:A,A}\n" +
            "mfm{m<1032:hkv,a<1959:cf,x>1399:R,jb}\n" +
            "smq{m<194:R,a<3282:R,R}\n" +
            "hjx{s<1617:R,a<3296:R,R}\n" +
            "jrq{m>1955:A,R}\n" +
            "vg{x>2575:R,R}\n" +
            "jj{s<780:R,R}\n" +
            "vkf{m<1743:R,s>3082:A,a>95:R,R}\n" +
            "msf{a<2067:rqq,A}\n" +
            "mvk{x>922:dj,R}\n" +
            "rms{m>2987:grm,x>223:qdp,a>473:ml,kr}\n" +
            "cb{m>3701:cht,m>3491:jtn,s<3267:klg,smk}\n" +
            "sd{a<2635:hvd,vj}\n" +
            "tmm{x<2059:R,A}\n" +
            "xxh{m>2915:R,xt}\n" +
            "xkg{s>1039:A,R}\n" +
            "zf{s>453:A,A}\n" +
            "njl{a<1805:R,mtf}\n" +
            "zkn{m<3512:thg,s>1158:R,a<2484:R,R}\n" +
            "nh{m>2463:A,s<1228:tg,x>1940:jlj,pmk}\n" +
            "png{x>1162:R,m<571:ltg,A}\n" +
            "lzs{s<580:A,s<663:R,A}\n" +
            "tqf{s<144:hnl,R}\n" +
            "dfs{s<228:A,s>246:A,m>567:R,A}\n" +
            "pbd{m>784:A,m<522:R,x<607:A,R}\n" +
            "snv{a>3181:A,s<83:R,zm}\n" +
            "kgk{s<662:A,a<3145:A,A}\n" +
            "lkn{x>3048:R,x<2937:A,R}\n" +
            "fc{s<1346:R,s<1666:nmd,ss}\n" +
            "nlp{m<1429:gq,a<2208:kp,rmx}\n" +
            "zp{m>405:A,s<2848:A,m<159:R,R}\n" +
            "vs{s<3820:R,m<3596:R,A}\n" +
            "pf{m>3426:A,x<759:A,m<3114:A,A}\n" +
            "xqq{a>2142:gn,m>2425:kkx,nvj}\n" +
            "nvg{a<2121:R,x<981:R,m<2849:A,A}\n" +
            "ckq{a>2161:dff,ktx}\n" +
            "mlb{a<955:A,x>425:R,a>1165:A,A}\n" +
            "dfm{a<678:R,m<1355:A,R}\n" +
            "xn{s>224:R,R}\n" +
            "hm{m<3125:A,R}\n" +
            "pzf{s>2736:A,A}\n" +
            "jtc{x<3066:stl,A}\n" +
            "kxd{s<3843:vjf,m>3231:vzd,x>546:cgf,A}\n" +
            "bdt{a>2680:R,R}\n" +
            "vm{s<2777:A,s>2916:R,m<1063:zp,jrq}\n" +
            "pq{a>2418:zrk,a<958:fkr,a>1923:fc,nh}\n" +
            "pvl{a<1684:jtm,dpr}\n" +
            "zrm{s<1037:R,m>3099:R,R}\n" +
            "mdx{x<2534:R,s>1409:R,s>1161:R,R}\n" +
            "ql{a>3241:R,x>2544:nqj,a>2628:A,ljk}\n" +
            "mc{a>2835:A,s>2670:A,A}\n" +
            "svp{s<1194:R,a>1519:R,m>2815:A,srv}\n" +
            "pql{m<3552:A,R}\n" +
            "lxf{x<3868:cqh,s>1665:qdj,x>3947:cm,shz}\n" +
            "brn{x<1064:dcz,m>1683:nk,gqn}\n" +
            "qdp{x>346:R,a<436:A,R}\n" +
            "xb{a>2683:R,m<2188:A,a>2438:A,R}\n" +
            "jz{s<2926:A,a<782:R,R}\n" +
            "ch{s>953:A,A}\n" +
            "ptj{x<933:A,m>636:R,a>1087:A,A}\n" +
            "clr{s>2740:R,s>2233:A,R}\n" +
            "vqk{s<1332:xl,x<2703:hjx,m>2989:R,A}\n" +
            "thg{m>3370:R,s>1286:R,m>3250:A,R}\n" +
            "bjl{a>1210:R,A}\n" +
            "vj{m<1940:R,R}\n" +
            "prj{x<200:R,s>994:A,R}\n" +
            "qdj{x<3938:R,x<3968:R,a>870:A,A}\n" +
            "cgf{a<906:R,s>3921:A,A}\n" +
            "hgk{x<476:vfd,sdh}\n" +
            "ngd{x<1982:A,a>620:A,m<2486:R,R}\n" +
            "vx{a>334:R,x<474:xq,a>158:A,A}\n" +
            "xf{s>1642:R,x<1323:A,R}\n" +
            "xzp{x>311:R,R}\n" +
            "njm{x>1880:R,a<3319:A,m>1329:R,A}\n" +
            "zz{a>2616:A,x>164:R,zk}\n" +
            "nd{x<2080:pbc,m<2049:rvb,a>3279:xc,R}\n" +
            "qg{a>1460:A,R}\n" +
            "vvs{s>476:xnp,s>302:mjc,x<338:pj,ttp}\n" +
            "nkj{m<2932:R,A}\n" +
            "bj{a<2598:R,s>2994:A,A}\n" +
            "xfs{s<1908:R,x<911:R,m<785:A,R}\n" +
            "kh{s<3211:A,s>3474:R,a>1156:htz,R}\n" +
            "jmk{m<889:A,a>3482:A,x<227:A,A}\n" +
            "vr{m<1392:R,s>1268:A,R}\n" +
            "nqb{m<336:A,A}\n" +
            "bsq{x>2108:sds,a>1846:nd,x<2074:tq,sxr}\n" +
            "qb{x>1971:dc,xxh}\n" +
            "pl{x<1466:lpc,gmk}\n" +
            "gxv{s<480:R,x>1082:A,A}\n" +
            "dxk{x<950:R,s>2625:R,x>967:R,A}\n" +
            "qrr{m>1685:hx,s<2653:R,jz}\n" +
            "tvk{a>1391:A,m>566:A,s>554:R,R}\n" +
            "sb{x<1881:A,a<939:fd,m<3131:R,lzs}\n" +
            "gvz{s<3188:R,s>3633:nqb,x<1763:jq,lq}\n" +
            "xr{m>1097:A,a>1258:A,x>535:A,R}\n" +
            "zsq{s<2601:pf,x<615:A,a>3233:xm,R}\n" +
            "pmv{m>796:R,a<610:prv,mdx}\n" +
            "gs{m>1007:A,s<462:R,R}\n" +
            "vv{s<1330:A,s<1743:gpn,s<1839:kdq,xfs}\n" +
            "qqp{a>2612:dds,m<2536:lxn,sb}\n" +
            "cdf{m>1757:R,s>2842:A,m>1647:A,R}\n" +
            "cg{m<1137:tps,a<2714:lkn,x<3032:zb,R}\n" +
            "dm{a>1076:qg,a<423:dh,qrr}\n" +
            "pbn{m>253:R,x<1107:R,s<203:R,A}\n" +
            "phq{a>755:pql,A}\n" +
            "czk{s>281:A,A}\n" +
            "prs{m>2533:bf,a>3389:R,s<1343:db,R}\n" +
            "td{x<3266:R,R}\n" +
            "jpc{x<3729:A,x>3830:R,s<2843:A,R}\n" +
            "stl{a>2315:A,s>1415:A,m<2946:R,R}\n" +
            "ds{m<3188:hsg,zkn}\n" +
            "nqg{x>1400:xj,x>711:brn,gzf}\n" +
            "cms{s>2105:A,hm}\n" +
            "pg{s<1430:kd,A}\n" +
            "zsp{a>2971:lgb,a>2468:mvk,a>2239:ptl,vm}\n" +
            "xdx{a>528:A,m<1527:kz,x<1628:A,A}\n" +
            "zh{m>1731:rr,m<1283:qf,m<1467:R,bj}\n" +
            "lfr{a>1128:xzp,R}\n" +
            "th{a>843:lfr,s>1463:hnb,s>1042:rth,sgm}\n" +
            "ms{m>2316:bgr,s<1139:jmk,x<240:R,A}\n" +
            "xlp{x<2479:kh,a>699:cpn,a>248:dvn,xjz}\n" +
            "sv{x<481:mlb,a>1000:xng,gl}\n" +
            "gbg{s<408:hqf,jj}\n" +
            "qt{x>194:R,R}\n" +
            "hp{a>966:A,x>1290:R,a<422:R,A}\n" +
            "xc{s<1538:R,m>2811:R,s>1711:A,R}\n" +
            "jnv{m<519:A,a<721:R,A}\n" +
            "pgl{x<2400:A,a<1466:R,R}\n" +
            "cpn{x>3417:R,tkm}\n" +
            "dz{m<948:mk,x<328:hn,lt}\n" +
            "xng{a>1222:R,R}\n" +
            "hx{s<2470:A,a>776:R,A}\n" +
            "srh{x<1202:pc,sjc}\n" +
            "lnb{x<932:A,m>2319:R,A}\n" +
            "xs{s<3530:R,a>402:A,A}\n" +
            "gpn{x>922:R,a>3449:A,x>839:A,R}\n" +
            "ttz{s>1449:R,s>1256:R,a>3372:A,R}\n" +
            "sdh{m<2098:hjc,ds}\n" +
            "ptg{m<1800:A,a>3375:R,s>450:A,A}\n" +
            "dt{s<3323:A,a<1278:R,A}\n" +
            "lxn{m>1281:R,s>536:gxn,s<468:R,vcp}\n" +
            "lhv{a<3237:vdz,a<3550:pbd,A}\n" +
            "krg{a<1012:R,x<405:jnk,A}\n" +
            "gp{a>3394:A,A}\n" +
            "rvb{a<3145:R,a<3639:A,R}\n" +
            "tjc{a>2154:A,a<995:zq,sbb}\n" +
            "vhq{s<3713:R,s<3811:A,R}\n" +
            "hvd{m<2486:R,a<2454:R,s>1188:A,A}\n" +
            "jvj{a>3098:R,m<2985:R,x>3093:A,A}\n" +
            "xq{s>3200:A,R}\n" +
            "kz{a>206:A,x<1602:A,A}\n" +
            "fkr{s>1178:rqp,m>1684:ngd,s>940:nc,dzj}\n" +
            "rv{s<3916:A,x>2062:R,x<1939:R,A}\n" +
            "kbn{x<2874:R,x<2921:R,m>1259:A,R}\n" +
            "rt{a>3166:R,m>3250:R,R}\n" +
            "nrr{m>747:bfc,x>1046:R,x>1023:mb,hxf}\n" +
            "js{s>2620:R,a>2007:A,lv}\n" +
            "lpb{m>1348:A,s<625:R,A}\n" +
            "gtp{m>1915:svp,xbg}\n" +
            "xp{a>1571:R,A}\n" +
            "dff{m>2559:A,m<2049:R,m>2292:zf,bd}\n" +
            "rmx{x<2553:qz,x>2678:vqk,pjx}\n" +
            "vfd{a>1568:spp,m<1767:th,s<1319:fdr,blm}\n" +
            "nqj{s>3777:A,s>3673:A,R}\n" +
            "kd{m<2651:A,A}\n" +
            "sgm{a>342:qt,s<902:bfl,s>974:A,A}\n" +
            "sxr{m>2172:R,hsv}\n" +
            "sq{s>2682:R,m>3803:R,x<3716:R,R}\n" +
            "tf{m<2857:R,x>2020:A,A}\n" +
            "jv{a>2378:dq,sx}\n" +
            "hsq{s<1508:A,x>1701:R,R}\n" +
            "nj{m<3687:R,a>1009:A,x<3441:A,A}\n" +
            "zzx{x<1621:A,x>1774:A,s>175:R,A}\n" +
            "rh{x>313:R,m>1071:R,A}\n" +
            "sk{x<1284:A,x>1314:R,a<3785:R,R}\n" +
            "mn{s>2659:A,A}\n" +
            "ttp{s>165:mz,A}\n" +
            "jml{m>1947:R,a>2659:A,A}\n" +
            "cch{x<109:gd,x<196:R,R}\n" +
            "dds{s<547:ptg,A}\n" +
            "hnl{s>85:A,a<3120:R,a<3626:R,A}\n" +
            "gck{m<1499:R,A}\n" +
            "phz{x>926:R,s>383:R,a<3874:A,A}\n" +
            "vsf{m>1197:R,R}\n" +
            "bc{m<820:A,R}\n" +
            "thc{x>3440:R,A}\n" +
            "trh{a<3765:xz,x<2813:R,A}\n" +
            "grm{x<241:R,R}\n" +
            "ljk{x<1132:R,A}\n" +
            "gpr{s<404:A,s<594:xb,R}\n" +
            "vjf{s>3678:R,R}\n" +
            "rrd{x>1386:A,a>1016:R,a>571:R,R}\n" +
            "kbt{x>2381:bjl,s<3792:A,x<1720:A,rv}\n" +
            "qbs{x<1104:sz,x>1112:fsb,s<312:pbn,bg}\n" +
            "htz{x>1939:R,a>1496:A,A}\n" +
            "ft{x>1366:dnz,x<710:dz,s<3187:tp,vh}\n" +
            "qpr{x<1446:nbc,s<2323:ssj,tc}\n" +
            "zfp{a>1044:R,s<2040:R,m>2904:R,R}\n" +
            "jn{m>657:A,s>1507:R,R}\n" +
            "hhl{s<1408:A,a>451:R,R}\n" +
            "tkm{x>2963:A,a<1341:R,A}\n" +
            "lvf{x>561:kc,m>3525:A,xp}\n" +
            "stf{m>1450:A,s>3054:A,R}\n" +
            "mft{x<1216:A,m<3127:R,m<3477:R,A}\n" +
            "xgn{a<2241:R,a>2481:A,A}\n" +
            "jbl{s>1406:tnp,cj}\n" +
            "mm{s<1762:vf,a>1580:R,m<2202:R,nkj}\n" +
            "jb{x<1383:A,x<1390:R,R}\n" +
            "lxg{s>2147:R,m>3127:qk,a>2612:R,zfp}\n" +
            "rp{s>1327:R,fj}\n" +
            "jq{x<1598:R,a>2707:A,s>3379:R,A}\n" +
            "lp{x<1707:nm,m>2005:R,m<1558:njm,tcp}\n" +
            "xjz{x>2990:vkf,mbm}\n" +
            "bf{m<3420:A,R}\n" +
            "gk{a<3118:zzx,R}\n" +
            "fxd{x<2267:vsf,a<2779:A,fh}\n" +
            "cl{a<1085:R,A}\n" +
            "vzd{s<3937:R,R}\n" +
            "cgk{a<2582:A,jpc}\n" +
            "zr{x>3587:tj,m>1836:kx,xkg}\n" +
            "nff{m<2643:R,s<396:mft,s<566:txq,mq}\n" +
            "nbg{x<2377:R,m<136:R,R}\n" +
            "kr{m<2449:R,x<81:A,R}\n" +
            "xsk{x<1296:A,m<3176:A,A}\n" +
            "sds{a>1522:R,x>2154:qbr,vr}\n" +
            "jxs{s<453:A,m>1053:R,a>1121:tvk,A}\n" +
            "bfc{x<1068:R,a>2463:A,R}\n" +
            "pmk{m>1124:A,A}\n" +
            "cf{x<1390:R,m>1278:R,R}\n" +
            "klg{m<3284:pz,A}\n" +
            "mgv{a<2150:R,x<760:R,a<2269:A,A}\n" +
            "fhg{m>762:R,x>2348:R,a<3237:R,A}\n" +
            "qp{m<1438:rh,pfr}\n" +
            "zhm{m>292:R,m>121:kq,a>1833:R,A}\n" +
            "rd{m<1296:A,x<940:A,x>969:R,A}\n" +
            "tq{m<1442:R,m<3017:A,m<3652:R,tmm}\n" +
            "vcp{x<1921:R,s>512:R,s<495:R,R}\n" +
            "pnq{x>3852:A,m>1774:A,x>3724:R,A}\n" +
            "bhf{x>218:A,s<2239:R,A}\n" +
            "bls{m>1957:A,s<2577:A,x<770:cdf,A}\n" +
            "mtf{a>3150:R,a>2528:R,A}\n" +
            "rkv{m>778:R,A}\n" +
            "dpr{m>552:R,m>259:A,a>2918:A,A}\n" +
            "smk{x>1577:R,m>3242:gnn,s>3395:R,R}\n" +
            "vth{m<3431:A,R}\n" +
            "dcz{a<2168:czk,a>3385:xnc,x>889:gpr,nmv}\n" +
            "pqs{x<2970:bnd,s<1347:zt,jtc}\n" +
            "hlb{x>1866:fzj,a>1466:gk,xdx}\n" +
            "prv{x<2429:A,x<2574:R,R}\n" +
            "rq{m<3913:A,a<1087:R,R}\n" +
            "mq{s>627:R,x>1212:A,a>538:A,A}\n" +
            "kq{m>209:R,m<167:A,A}\n" +
            "bfl{s>810:A,R}\n" +
            "qdm{m>1189:A,R}\n" +
            "tbd{s<1325:A,R}\n" +
            "lc{a<1274:R,A}\n" +
            "lt{a>1572:zh,m>1604:sv,a>984:vl,vx}\n" +
            "nt{m<3894:R,A}\n" +
            "vxd{s>3177:A,A}\n" +
            "dnz{a<2029:xlp,x<2628:snc,a>3341:qcl,vms}\n" +
            "vrf{x<2829:A,R}\n" +
            "crd{x>3557:pnq,thc}\n" +
            "fz{x>2529:kf,m<769:vn,xtd}\n" +
            "pdx{a<2185:zgt,hqq}\n" +
            "cp{m>2598:A,A}\n" +
            "fl{x>133:A,m<1491:rm,s>3519:R,A}\n" +
            "pz{x>2347:R,m<3192:R,A}\n" +
            "tg{m>1371:A,m<663:R,R}\n" +
            "ggv{s<527:shf,s<710:lpb,R}\n" +
            "fj{s<1287:R,s<1302:A,s<1312:R,A}\n" +
            "kt{x<2253:R,a>1220:vs,R}\n" +
            "ht{a<781:hjd,xv}\n" +
            "xh{s<2309:R,a<3410:R,R}\n" +
            "qcl{x<3100:trh,a>3564:vxd,rl}\n" +
            "nbk{x>377:A,a<2893:R,s<365:A,A}\n" +
            "bnd{x>2843:A,x<2800:R,a>1769:kbb,cp}\n" +
            "hnb{m<805:rc,x>232:gt,A}\n" +
            "rm{m>1185:A,A}\n" +
            "fb{a<2398:A,s<3218:A,m>2850:A,R}\n" +
            "sx{x<1030:A,a<1219:A,x>1218:R,R}\n" +
            "bd{a>2890:A,a<2425:R,x>3323:A,A}\n" +
            "gmk{x<1864:pdx,x<2051:pq,bsq}\n" +
            "jlj{x<1982:R,s<1665:R,m<1026:A,A}\n" +
            "srb{a>2656:A,m>3514:R,a>1728:A,R}\n" +
            "cz{x>3027:A,A}\n" +
            "dvn{x<3341:cz,s<3231:A,xs}\n" +
            "hxf{s>3637:A,m<448:R,R}\n" +
            "qv{x>1236:A,a<3189:R,pk}\n" +
            "kx{m>3217:R,R}\n" +
            "gz{x>822:R,a<1663:dfm,xd}\n" +
            "gn{a<3047:R,R}\n" +
            "gt{m<1156:R,m>1548:R,a>430:A,R}\n" +
            "vzr{m<3451:tf,a<1010:A,x>2004:A,R}\n" +
            "qf{a<2801:A,R}\n" +
            "hsg{m<2529:hrv,x<807:R,nvg}\n" +
            "cht{x>2198:nt,R}\n" +
            "bq{x<2523:gm,m<700:gbg,m<1162:gs,ggv}\n" +
            "prc{m>1205:A,x<3047:vrf,m<630:R,mc}\n" +
            "gd{s>2846:R,m>424:R,A}\n" +
            "cjd{m<3360:R,m>3770:R,A}\n" +
            "qbx{m<2515:drv,x>3685:mls,s<1770:A,R}\n" +
            "vn{m<337:nbg,m>551:dcc,A}\n" +
            "ck{m<1618:A,m<2476:R,m>3165:A,R}\n" +
            "db{a>2890:A,s<1308:A,s<1323:A,R}\n" +
            "snc{x>1978:fxd,m>952:lp,gvz}\n" +
            "qsl{x<1835:jzp,a<2179:vzr,tqf}\n" +
            "rqq{m<2027:R,x<1384:A,s>1764:A,R}\n" +
            "gxn{s>635:A,a>1262:R,x<1802:A,R}\n" +
            "cj{s<1125:zr,s<1257:crd,a<2537:rp,prs}\n" +
            "lq{x>1836:R,a>3311:A,a<2551:A,A}\n" +
            "qzs{x<1384:A,x<1417:A,A}\n" +
            "spp{a>2881:ms,a>2360:sd,mhp}\n" +
            "ld{m>1052:lbq,a>1810:R,hp}\n" +
            "qk{s<2064:R,s>2098:A,x>3155:A,A}\n" +
            "hqf{x<2810:R,x>2881:R,a<3335:R,A}\n" +
            "txn{m<515:R,s<3547:A,R}\n" +
            "shz{m<2662:A,m<3548:R,R}\n" +
            "nbc{a>2381:zsq,lvf}\n" +
            "xtd{x<2377:lpp,R}\n" +
            "zg{s<1442:R,A}\n" +
            "lxq{a>1722:R,s<1419:sp,A}\n" +
            "ktx{m<2642:A,x<3186:R,s<439:lc,R}\n" +
            "jnk{x>241:R,x<86:A,A}\n" +
            "dl{s<1389:mj,m>1577:msf,x>1351:mfm,zqh}\n" +
            "kp{x<2526:kck,pg}\n" +
            "vrv{s<1238:csj,m>3267:srb,lxq}\n" +
            "tlm{m>2678:R,m<2159:A,A}\n" +
            "hrv{s<1266:R,s>1543:R,R}\n" +
            "fmk{s>595:R,a>2979:A,m<3119:R,R}\n" +
            "zgt{m>2441:ndk,a<782:hhl,a>1406:R,dnj}\n" +
            "gm{m<489:smq,m<988:fhg,rjk}\n" +
            "blm{a>858:br,s>1664:rms,fk}\n" +
            "dcc{a>1715:A,s>543:A,m<624:R,A}\n" +
            "lr{s>3670:nr,xxn}\n" +
            "mj{s>1107:A,s<971:qzs,A}\n" +
            "mz{m>2390:R,x<556:R,R}\n" +
            "mb{a>2399:A,A}\n" +
            "kjs{m>1519:zj,R}\n" +
            "sg{a<3129:A,m<764:R,m<1260:R,A}\n" +
            "dc{x>3285:A,fb}\n" +
            "zqh{x>1305:A,jt}\n" +
            "kbb{x>2822:A,A}\n" +
            "rqp{s<1487:R,m>2233:A,A}\n" +
            "vms{x<3479:prc,m>1779:gx,cgk}\n" +
            "kdq{x>936:A,A}\n" +
            "pgq{a>726:rq,s<564:zxv,s>670:pfq,A}\n" +
            "dq{a>3308:R,x<1086:R,a<2892:jml,A}\n" +
            "ltg{m>283:R,a>1543:R,R}\n" +
            "rth{m<769:qvm,x>198:A,x>107:A,sj}\n" +
            "bg{a<2443:A,s<530:R,m>366:A,R}\n" +
            "kc{x<1050:A,R}\n" +
            "dd{x>1210:R,a>2724:A,R}\n" +
            "fh{s>2664:A,m<1476:A,a>3397:A,R}\n" +
            "lgb{x>890:dxk,A}\n" +
            "jnl{m>1532:bls,vnj}\n" +
            "gnn{s<3393:A,s>3450:A,x<643:A,A}\n" +
            "jtm{m>383:R,x>3159:R,R}\n" +
            "hq{s>3559:zs,m<3117:qb,cb}\n" +
            "nmv{a<2742:blb,s<338:R,m>2532:fmk,R}\n" +
            "hsv{m<1102:R,a<641:A,a>1237:R,A}\n" +
            "csj{a>2052:vgf,x<1327:ch,rrd}\n" +
            "drv{s<1770:R,s<1861:R,s>1895:R,R}\n" +
            "bgr{s<1472:R,m>3076:A,A}\n" +
            "lbq{m<1314:R,x>1323:R,R}\n" +
            "vl{m>1211:stf,xr}\n" +
            "xv{m>760:A,R}\n" +
            "fm{x<755:A,R}\n" +
            "kjv{x>215:R,x>187:R,A}\n" +
            "pfq{m<3899:A,s>695:A,A}\n" +
            "gbh{s>420:tjc,m>867:dg,x>3474:zhm,pvl}\n" +
            "ml{m<2527:A,m>2768:R,a>618:R,A}\n" +
            "htx{a<1562:A,x<845:R,A}\n" +
            "ckp{x>1638:R,s<152:A,R}\n" +
            "tv{m>2668:stn,ft}\n" +
            "pj{s>146:xn,vb}\n" +
            "slc{s>1536:xqq,m>1881:pqs,gzv}\n" +
            "zrk{a>3081:gck,A}\n" +
            "xgb{x>1096:A,gxv}\n" +
            "qbr{s<1438:A,m>1436:R,m<750:A,R}\n" +
            "gq{a<1449:pmv,a<2656:cgs,m>522:qct,bp}\n" +
            "mk{x>293:mn,cch}\n" +
            "gqn{x>1195:ld,x>1126:png,m<679:qbs,xgb}\n" +
            "sj{a<314:A,a>578:R,x<55:A,R}\n" +
            "fx{s>163:dfs,a>898:A,cnj}\n" +
            "xbg{a<1791:bc,x>1166:R,x<1141:jn,zvl}\n" +
            "sjc{a<2847:R,a>3361:sk,m>931:R,bz}\n" +
            "qm{s>1778:jgb,hht}\n" +
            "xt{s<3374:A,m>2783:R,x<678:R,R}\n" +
            "tlj{m<3283:R,s<406:A,R}\n" +
            "nc{a>357:R,a>141:R,s<1071:R,A}\n" +
            "tc{x<2724:js,m<3426:njl,lk}\n" +
            "zss{x>278:A,a<663:kjv,x>242:A,prj}\n" +
            "blb{a>2363:R,s>460:R,A}\n" +
            "scf{m<219:R,x>2548:A,m>324:A,A}\n" +
            "dj{x<951:A,m<1084:A,x>963:A,R}\n" +
            "khn{m>3298:A,A}\n" +
            "mbm{s>3117:A,a<153:A,A}\n" +
            "cgs{x<2412:qh,xgn}\n" +
            "qh{x<2315:R,x>2377:A,A}\n" +
            " " +
            "{x=1509,m=1127,a=482,s=1803}\n" +
            "{x=24,m=718,a=2879,s=978}\n" +
            "{x=211,m=1442,a=507,s=128}\n" +
            "{x=47,m=2266,a=1663,s=357}\n" +
            "{x=461,m=5,a=718,s=1969}\n" +
            "{x=184,m=414,a=1810,s=2958}\n" +
            "{x=754,m=521,a=41,s=2007}\n" +
            "{x=296,m=1438,a=18,s=1013}\n" +
            "{x=374,m=2888,a=234,s=797}\n" +
            "{x=1540,m=1164,a=3,s=26}\n" +
            "{x=1586,m=2318,a=1125,s=901}\n" +
            "{x=2243,m=1165,a=300,s=166}\n" +
            "{x=413,m=230,a=1284,s=101}\n" +
            "{x=816,m=1394,a=978,s=1190}\n" +
            "{x=813,m=2503,a=1809,s=640}\n" +
            "{x=439,m=1792,a=1540,s=287}\n" +
            "{x=237,m=2782,a=9,s=668}\n" +
            "{x=2142,m=1746,a=407,s=1855}\n" +
            "{x=1562,m=767,a=808,s=286}\n" +
            "{x=1410,m=268,a=163,s=971}\n" +
            "{x=255,m=548,a=1947,s=216}\n" +
            "{x=399,m=2458,a=1068,s=124}\n" +
            "{x=288,m=1284,a=174,s=597}\n" +
            "{x=933,m=697,a=310,s=173}\n" +
            "{x=1676,m=207,a=1084,s=80}\n" +
            "{x=1169,m=2438,a=226,s=919}\n" +
            "{x=387,m=1275,a=839,s=465}\n" +
            "{x=2757,m=100,a=2508,s=742}\n" +
            "{x=762,m=1067,a=372,s=253}\n" +
            "{x=495,m=423,a=443,s=838}\n" +
            "{x=239,m=3028,a=214,s=2055}\n" +
            "{x=150,m=1025,a=97,s=3859}\n" +
            "{x=1072,m=503,a=517,s=1973}\n" +
            "{x=127,m=580,a=218,s=852}\n" +
            "{x=1740,m=904,a=409,s=1214}\n" +
            "{x=164,m=2719,a=1951,s=339}\n" +
            "{x=334,m=45,a=1729,s=832}\n" +
            "{x=37,m=1776,a=118,s=1360}\n" +
            "{x=1223,m=486,a=168,s=680}\n" +
            "{x=1593,m=266,a=51,s=112}\n" +
            "{x=432,m=787,a=199,s=669}\n" +
            "{x=2,m=1196,a=500,s=823}\n" +
            "{x=386,m=567,a=728,s=459}\n" +
            "{x=2343,m=3452,a=199,s=749}\n" +
            "{x=604,m=272,a=529,s=3335}\n" +
            "{x=154,m=253,a=668,s=384}\n" +
            "{x=224,m=98,a=1345,s=948}\n" +
            "{x=145,m=1309,a=148,s=984}\n" +
            "{x=1872,m=1653,a=1716,s=692}\n" +
            "{x=3015,m=119,a=101,s=890}\n" +
            "{x=807,m=436,a=851,s=274}\n" +
            "{x=593,m=1025,a=431,s=1243}\n" +
            "{x=1607,m=275,a=1824,s=117}\n" +
            "{x=398,m=567,a=914,s=440}\n" +
            "{x=1606,m=33,a=46,s=402}\n" +
            "{x=1183,m=1444,a=645,s=276}\n" +
            "{x=125,m=248,a=86,s=2534}\n" +
            "{x=3374,m=71,a=37,s=884}\n" +
            "{x=810,m=255,a=819,s=1449}\n" +
            "{x=1592,m=2102,a=1264,s=2117}\n" +
            "{x=1998,m=1917,a=912,s=438}\n" +
            "{x=1057,m=2932,a=939,s=843}\n" +
            "{x=837,m=2185,a=1746,s=680}\n" +
            "{x=211,m=2513,a=596,s=1437}\n" +
            "{x=2265,m=35,a=778,s=3172}\n" +
            "{x=2574,m=1963,a=73,s=836}\n" +
            "{x=893,m=1770,a=714,s=325}\n" +
            "{x=387,m=147,a=81,s=314}\n" +
            "{x=2109,m=146,a=1650,s=1625}\n" +
            "{x=2318,m=800,a=1790,s=358}\n" +
            "{x=447,m=1497,a=1356,s=2604}\n" +
            "{x=1022,m=1118,a=590,s=1464}\n" +
            "{x=64,m=3472,a=3359,s=2289}\n" +
            "{x=697,m=735,a=2306,s=603}\n" +
            "{x=828,m=23,a=1165,s=1411}\n" +
            "{x=3615,m=463,a=328,s=969}\n" +
            "{x=3499,m=336,a=600,s=680}\n" +
            "{x=32,m=39,a=602,s=1528}\n" +
            "{x=21,m=2171,a=76,s=3824}\n" +
            "{x=1252,m=329,a=1989,s=1352}\n" +
            "{x=564,m=359,a=161,s=2211}\n" +
            "{x=2280,m=1449,a=914,s=304}\n" +
            "{x=821,m=1014,a=2535,s=700}\n" +
            "{x=1507,m=2523,a=102,s=406}\n" +
            "{x=1138,m=36,a=1011,s=413}\n" +
            "{x=333,m=92,a=424,s=1182}\n" +
            "{x=399,m=995,a=445,s=410}\n" +
            "{x=1131,m=78,a=777,s=1441}\n" +
            "{x=406,m=1665,a=2355,s=18}\n" +
            "{x=791,m=115,a=299,s=1460}\n" +
            "{x=721,m=3651,a=242,s=408}\n" +
            "{x=152,m=228,a=31,s=867}\n" +
            "{x=311,m=560,a=127,s=1385}\n" +
            "{x=414,m=1281,a=259,s=429}\n" +
            "{x=53,m=973,a=2397,s=438}\n" +
            "{x=388,m=106,a=1159,s=1170}\n" +
            "{x=272,m=1267,a=2995,s=203}\n" +
            "{x=1165,m=629,a=1135,s=102}\n" +
            "{x=739,m=2903,a=1458,s=56}\n" +
            "{x=484,m=2172,a=2249,s=117}\n" +
            "{x=1325,m=741,a=2516,s=543}\n" +
            "{x=458,m=57,a=606,s=331}\n" +
            "{x=1447,m=792,a=591,s=724}\n" +
            "{x=1219,m=1192,a=173,s=602}\n" +
            "{x=667,m=80,a=764,s=2201}\n" +
            "{x=2729,m=1465,a=447,s=1598}\n" +
            "{x=594,m=8,a=503,s=569}\n" +
            "{x=846,m=2072,a=57,s=1122}\n" +
            "{x=120,m=1390,a=100,s=27}\n" +
            "{x=111,m=2718,a=158,s=1095}\n" +
            "{x=26,m=741,a=82,s=194}\n" +
            "{x=268,m=64,a=678,s=2474}\n" +
            "{x=404,m=207,a=960,s=215}\n" +
            "{x=3014,m=297,a=853,s=145}\n" +
            "{x=1224,m=274,a=179,s=589}\n" +
            "{x=160,m=1842,a=2384,s=69}\n" +
            "{x=508,m=237,a=141,s=71}\n" +
            "{x=3797,m=2478,a=1134,s=70}\n" +
            "{x=28,m=3289,a=1711,s=607}\n" +
            "{x=1272,m=521,a=1221,s=228}\n" +
            "{x=264,m=2596,a=3321,s=1066}\n" +
            "{x=873,m=637,a=410,s=2601}\n" +
            "{x=2133,m=440,a=442,s=432}\n" +
            "{x=1553,m=108,a=1675,s=118}\n" +
            "{x=2374,m=236,a=2233,s=497}\n" +
            "{x=2378,m=197,a=178,s=1966}\n" +
            "{x=601,m=1589,a=2241,s=2551}\n" +
            "{x=1294,m=2663,a=489,s=1752}\n" +
            "{x=155,m=2493,a=83,s=208}\n" +
            "{x=317,m=1440,a=1396,s=514}\n" +
            "{x=1654,m=1919,a=26,s=1232}\n" +
            "{x=1430,m=539,a=1089,s=1259}\n" +
            "{x=642,m=1163,a=476,s=631}\n" +
            "{x=1379,m=5,a=48,s=642}\n" +
            "{x=2749,m=2562,a=2822,s=1541}\n" +
            "{x=1536,m=225,a=367,s=739}\n" +
            "{x=150,m=173,a=395,s=110}\n" +
            "{x=467,m=1035,a=255,s=1451}\n" +
            "{x=44,m=1085,a=843,s=729}\n" +
            "{x=48,m=579,a=70,s=852}\n" +
            "{x=50,m=84,a=4,s=1250}\n" +
            "{x=3128,m=1013,a=3367,s=479}\n" +
            "{x=345,m=1286,a=695,s=3472}\n" +
            "{x=57,m=1376,a=1786,s=815}\n" +
            "{x=1998,m=654,a=179,s=376}\n" +
            "{x=1469,m=1252,a=677,s=1839}\n" +
            "{x=1157,m=31,a=625,s=2022}\n" +
            "{x=1263,m=2576,a=538,s=909}\n" +
            "{x=168,m=462,a=2268,s=1809}\n" +
            "{x=1206,m=1152,a=2370,s=1918}\n" +
            "{x=131,m=207,a=2124,s=956}\n" +
            "{x=1826,m=39,a=144,s=651}\n" +
            "{x=503,m=65,a=142,s=1246}\n" +
            "{x=101,m=626,a=1261,s=414}\n" +
            "{x=2453,m=333,a=968,s=198}\n" +
            "{x=280,m=466,a=1607,s=773}\n" +
            "{x=3177,m=531,a=579,s=76}\n" +
            "{x=838,m=386,a=144,s=607}\n" +
            "{x=1516,m=574,a=329,s=214}\n" +
            "{x=404,m=2017,a=2317,s=654}\n" +
            "{x=2698,m=2050,a=10,s=1956}\n" +
            "{x=1004,m=3340,a=2190,s=768}\n" +
            "{x=777,m=2294,a=845,s=1058}\n" +
            "{x=402,m=796,a=820,s=3105}\n" +
            "{x=568,m=169,a=40,s=133}\n" +
            "{x=454,m=1910,a=496,s=8}\n" +
            "{x=27,m=123,a=2739,s=30}\n" +
            "{x=2090,m=795,a=167,s=1506}\n" +
            "{x=1854,m=74,a=308,s=252}\n" +
            "{x=990,m=1048,a=2142,s=1317}\n" +
            "{x=36,m=196,a=3199,s=212}\n" +
            "{x=394,m=2379,a=535,s=2703}\n" +
            "{x=1664,m=8,a=413,s=337}\n" +
            "{x=192,m=2158,a=1213,s=667}\n" +
            "{x=1597,m=865,a=595,s=55}\n" +
            "{x=1231,m=947,a=339,s=306}\n" +
            "{x=347,m=2771,a=2154,s=993}\n" +
            "{x=1186,m=126,a=552,s=407}\n" +
            "{x=1747,m=1326,a=1974,s=270}\n" +
            "{x=1880,m=1319,a=658,s=27}\n" +
            "{x=1124,m=160,a=350,s=3227}\n" +
            "{x=19,m=1712,a=1866,s=757}\n" +
            "{x=739,m=944,a=890,s=2785}\n" +
            "{x=260,m=1279,a=454,s=95}\n" +
            "{x=90,m=635,a=1189,s=874}\n" +
            "{x=3102,m=39,a=559,s=497}\n" +
            "{x=227,m=1174,a=2384,s=2043}\n" +
            "{x=908,m=957,a=554,s=771}\n" +
            "{x=1176,m=15,a=675,s=2289}\n" +
            "{x=280,m=491,a=1021,s=1174}\n" +
            "{x=2277,m=316,a=1675,s=1308}\n" +
            "{x=56,m=1303,a=1558,s=259}\n" +
            "{x=32,m=125,a=209,s=405}\n" +
            "{x=284,m=2162,a=2769,s=403}\n" +
            "{x=1018,m=1472,a=28,s=134}\n" +
            "{x=2775,m=542,a=127,s=749}\n" +
            "{x=6,m=356,a=3287,s=277}\n" +
            "{x=1993,m=66,a=1202,s=1851}\n" +
            "{x=352,m=1071,a=33,s=175}\n" +
            "{x=807,m=622,a=3419,s=2345}\n";


    public static void main(String[] args) {
        String[] ss = sq.split(" ");
        String s1 = ss[0];
        String s2 = ss[1];

        String[] tt = s1.split("\n");
        String[] uu = s2.split("\n");

        Map<String, String> map = new HashMap<>();
        for (String t : tt) {
            map.put(t.split("\\{")[0], t.split("\\{")[1].replace("\\}", ""));
        }
        int sum = 0;
        for (String u : uu) {
            int x = 0, m = 0, a = 0, s = 0;
            String[] uuu = u.replace("{", "").replace("}", "").split(",");
            x = Integer.parseInt(uuu[0].split("=")[1]);
            m = Integer.parseInt(uuu[1].split("=")[1]);
            a = Integer.parseInt(uuu[2].split("=")[1]);
            s = Integer.parseInt(uuu[3].split("=")[1]);
            String k = map.get("in").replace("}","").replace("{","");
            while (!k.equals("A") && !k.equals("R")) {
                String[] r = k.split(",");
                for (int i = 0; i < r.length; i++) {
                    if (r[i].equals("A") || r[i].equals("R")) {
                        k = r[i];
                        break;
                    }
                    if (!r[i].contains(":")) {
                        k = map.get(r[i]).replace("}","").replace("{","");
                        break;
                    } else {
                        String rr1 = r[i].split(":")[0];
                        String rr2 = r[i].split(":")[1];
                        if (compareMe(rr1, x, m, a, s)) {
                            if (rr2.equals("A") || rr2.equals("R")) {
                                k = rr2;
                                break;
                            }
                            k = map.get(rr2).replace("}","").replace("{","");
                            break;
                        }
                    }
                }
            }
            if (k.equals("A")) {
                sum = sum + x + m + a + s;
            }
        }
        System.out.println(sum);
    }

    private static boolean compareMe(String str, int x, int m, int a, int s) {
        if (str.contains("a")) {
            if (str.contains("<")) {
                return Integer.parseInt(str.split("<")[1]) > a;
            } else {
                return Integer.parseInt(str.split(">")[1]) < a;
            }
        }
        if (str.contains("x")) {
            if (str.contains("<")) {
                return Integer.parseInt(str.split("<")[1]) > x;
            } else {
                return Integer.parseInt(str.split(">")[1]) < x;
            }
        }
        if (str.contains("m")) {
            if (str.contains("<")) {
                return Integer.parseInt(str.split("<")[1]) > m;
            } else {
                return Integer.parseInt(str.split(">")[1]) < m;
            }
        }
        if (str.contains("s")) {
            if (str.contains("<")) {
                return Integer.parseInt(str.split("<")[1]) > s;
            } else {
                return Integer.parseInt(str.split(">")[1]) < s;
            }
        }
        return true;
    }
}
