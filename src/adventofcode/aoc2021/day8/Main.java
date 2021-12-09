package adventofcode.aoc2021.day8;

public class Main {

    static String s = "ecfdbg decfba aegd fdcag fagecd gd gcafb efdac cbgeafd dfg | bgacf afdebc fceda cabfg\n" +
            "cfdabeg cda bcgad bedfac aefbgd bfgcad dfbga egabc dgfc cd | gdbefac fgabcd dcbefag aedgfb\n" +
            "aedbfgc gcaf ebgfca bca edgcfb adbge gebac fbegc ac afdcbe | ceafbg acb egbad gfaebc\n" +
            "gaeb cafdbg aedfc ecfgdb ab cdaefgb cgbdae bdecg cba eacdb | gfacdeb gabdec begcd adbce\n" +
            "fcbgea fbedg bc cbefg befgcda cfgdab gbc efdgca fecag aceb | faecg cb cb fecbga\n" +
            "fdebcg bag gdefa ceadgb fcab ebagfc ab fbegc fcaedbg fbeag | cfegb bga edfga fgbec\n" +
            "fg fcagb dfgceba edgacb fagd gfb dcgba agcfdb gecfbd ceafb | facgb fbdcge gf gfabc\n" +
            "eabfd dfb gbcfad ebdag fagbce gefabdc edcf aecfb cbdafe df | egbcdfa afdebcg aecfbd acefb\n" +
            "fbaec bfegad bga deacbg gb fbdg acgdef deagf fgabe gabecdf | fgdb gefba gcdafe bg\n" +
            "bfdea agfbc gbd faecdbg gd efgd cdgeab efadbg faebcd fabdg | cdbgea fged cfabed bgd\n" +
            "gfedac cgaef gab ceba ba afcdgb gdefbac fegbd bafeg abcgfe | gcbadf egafb ebafg ab\n" +
            "bgda agfcdbe agfde faegb baedgf fcdaeg fdbeac ba bcegf bfa | bcefg eagdf ab bacefd\n" +
            "dfgbac fdcaeb cbgeda bfdea dcabf ebadcfg gfbea dbe fecd ed | ebd cdfe bgeaf cdbfea\n" +
            "efdba edb eagbcd bacef bd bcfd becfagd begcaf cbaefd aefdg | fdage edbgac cgaebd bed\n" +
            "gfecbd gbadf fabged gbf cbdage fagcd feab edgcbaf fb aedbg | agdcf bgfda afdgc afdgb\n" +
            "gfaedc caefb badcfge dgfe acdgbf eag eg fgacd gecfa ecbdag | acdbgf cbegad cgdaf eag\n" +
            "gfebda fgacd dfbag bg geab gcbdeaf eacbdf cedbgf fbg abfed | aedfb gb eafdb dbafe\n" +
            "ebadfc efdbga bega fdgcae dbgaefc edfab fag ag dagbf cfgbd | efacgd dbefag fadebg bgfad\n" +
            "bf fbd cgbdaf dcfbae fgbcd gcbadef gafcde bfag cebgd dcafg | afbedc gcdeb fbgadc dbf\n" +
            "gfecab fageb cgb acgeb gdfeab ecbafdg gfca aecbd gc edcgbf | afcg cedba aecdb cgeba\n" +
            "cdge abfdge cgfeadb bdc gbacd cd cdaebf bgeda cgdaeb acfgb | baecdg fcbag dfeagb gcde\n" +
            "efabdgc ecafg dacgbf ecgfd dfe gbfdec ed bedc cfdgb gedafb | egcaf cfgae efcgd de\n" +
            "bfagdc dbagef gbedcf afdeb ab edgfb gdebfac fdeca baf eagb | bfa bgadfc adcef ab\n" +
            "cfdbae dgefc fcaeg geafdc dfag fd cegbd daefbgc cfd cefbag | efgcd cgdfe cefdg cdf\n" +
            "cbged feabc fdgb egf ecfdbg dfgcea gabfdce ebcdag bgefc fg | fbgec bgdf efgcbda cbedg\n" +
            "ebcdfa ef cfe cadbfge becfd dgbeac dafe gbdfc cefgba ceabd | bfcaeg gfedcab acbfge fe\n" +
            "fbdage bf acdgb cabf gcfed gdcfbea fgbdc fbd fcbadg bgedca | bcadeg bf facbdeg gdabef\n" +
            "gfacdbe fga gbdaf gadbc dfeagc fg bcgf eacgbd acdgfb debfa | gdcab agcbd dafbecg gfa\n" +
            "gadbcf badfe bae cfaed abfdg adfecbg eb bedgaf ecfagb egdb | bdaef egfdcab eb be\n" +
            "dbgecaf gacd dfbac dbaefg dba bfgced cafbdg cbfgd faecb ad | degbcf baegdf gaedbf dfegbc\n" +
            "afgcd dabgf gedfba agc bdfgac gdefc bcaf cfeadgb ac ecdbga | gfadbec fgcda edgbac fbagd\n" +
            "acbegfd cgeb dagbef gbaed caebdg gc dafgec adcbg cdbfa gdc | bdaeg bdfac bdfac bcgad\n" +
            "gfab agfbde fa edbgf cbedfa decga cdagefb degbfc egfda afd | daf fa afd efacbd\n" +
            "caegdbf daefg fbgac be fgaeb cbea bge cdfagb dgecfb abecfg | gebaf aceb gfdecb befga\n" +
            "efcgda bd efgdcab afbec bgcd fdagc dgabef dab dafbc cfdagb | dba dcgb ecbdfga abfcd\n" +
            "abdge fd fda fecd bfcage fecdba fdgbcea afbde acdbfg cfbea | fedc fced adebf fbacde\n" +
            "acfdbe egcadb gfbacd acfbd bagefcd bgfa cefgd gac cdagf ag | ag bcadeg dgcafb cefdg\n" +
            "eabdfc fcaeg fecad bcfda dcfbge ebda de ced fdacbg dfbcega | gcebfda gdecfba dbgfec defca\n" +
            "bfc gdfceb cf eafgbd edcab ebcfa gfeacb acgf adcbgef fabge | bafgecd fgabe aegbcf badec\n" +
            "gfbc gaced fg bfcda fgd fcgad dgefbac bcafde dgcfab edgfba | bcgf bdceaf dbfaec bdacf\n" +
            "acbdgf dfcgb dcfeg egbd aedfc fcebag ge gef cfegdba fgbdce | gcbfea fceda dcfgb dfgbc\n" +
            "agcfd fga fecda gadebf dbgcfe fcbdga dcfgb ga gbac cbfgead | fdeca gbcdf cfdgb afg\n" +
            "eba ebdc gbefda dcbegaf fbaced afgec be dcfba ebacf dfcagb | eb eab bea be\n" +
            "bfcge bfead edgfacb edcfag abegfd becdf dacb cd cde bfdcea | adefgc cdab fbead dcba\n" +
            "bacegd gafcbe begfa bcfad ed gedf ebgfda bdefa ead fegdbac | geafb fedba dbcage egdf\n" +
            "df fbgdc fcd bfgce abfd cdfgba cgefad cgbad ecadgb egbfacd | bcdgaf cedfga dbgafc dgfbc\n" +
            "dfabge bcfdg egfbca bdaefcg decbfg ebfgd fgdca cb cbde cbg | beadcgf dgacf adfgc bc\n" +
            "fgda dafecgb egdbf gef dbgec agebcf gf edgafb fcaedb bafde | fg fecdab bdefg bgfde\n" +
            "abfgecd eabgf fcdabe gbdafe acebg dfecgb gf gfb fgad dafeb | efdacb efadcgb dagf dfabe\n" +
            "ceafbg dfcabe gcfea gbac fgead gc cbdgef egc aecfgbd cefba | badecf badefgc bfaec cbeaf\n" +
            "cadfb caefbd cbfega fdbga cad dc edbc aefbc egbacfd dfgeca | cefdab cdfage bacdf dbafc\n" +
            "gfcb cf ecafdg fcbed dfbagce fbgeda gdfbec cef eacbd ebdfg | gbdaef caedfg cf gbdefc\n" +
            "gd cgd ebdafgc cfbega gcbfde bcfdg badfc bgaced bcefg gedf | gfed fcbgd cdgfbe cfbeg\n" +
            "bfga dabge befacd agbdce fb aegfbd fcged dbegf ebf ebgdcaf | bagf ecfdg fbe bedagc\n" +
            "beac ea ade gefcd ecgbad cbagd badgcfe ebfgad acgde gcfdab | ea gceadb gcbad cbdga\n" +
            "cadfbg bcgafed cbedf afeg abegdc adf gedca efacd acdgfe fa | daecg fdecga edafc adbgce\n" +
            "egd ed egacd cgabfed efcd degfca dagbfc dcagf bgfdea abecg | dge egcad ged cgdfa\n" +
            "cgdeaf fcbdeg fgc dgcea cadgbe abdcfeg gf cafbe gadf cfega | aecgfd bfaec gf dceabg\n" +
            "caegd cbfgae dafg egd gd ecafg gfabdec cafdge bacde bdfecg | gedfcb edcagfb cdega becgfd\n" +
            "badgfe ed dcge fgdceb cebfd cbfedga dabcf efd ecgafb cgbef | dgec dfe ecbgfa cebgaf\n" +
            "dgabcef bcd cfeadb degfca bgace gcebd cegfd gbdf bd begfdc | acbeg dbc gdfb gfdb\n" +
            "edafgb bagf acedb dbg fcgdabe bcdgfe gb bgead dfaecg faged | gafb dgafeb gbaf fadegb\n" +
            "bc abcegf bfcgd gdcbef dcbe gcb cafegbd aegdbf dfagc dbegf | cbg cbg cfedgba dgcfabe\n" +
            "be ecgbf cbafg ebg bagedc fbae degfabc fgcdab dgfce cabfeg | gfcde dgfbca dcabgf bacegd\n" +
            "af dbacge efa abegfdc gfdce begcfa aecfg afbced fgba ecabg | ecadfb gfeca efa gefdc\n" +
            "acbedg edfacbg begd cdfabe dagcb eacdb gfeabc bg gba dfgac | cegbaf ecfdba cgbda dfebca\n" +
            "dcbgaef bca abed cbgad gdaec fecbag edgbca geadfc ab cdgfb | beagcd dgbca eabd ceabgd\n" +
            "cgabe gfcbe cfegba fdbgc fe fdgebca aedcbg gfea bfdcea fbe | feb gaef badgec ecgabf\n" +
            "afecdg dfbc cd dcg aegcb baedgf becgd becfdg eacgbdf ebdgf | gbedf edgbf bcdeg gfadbe\n" +
            "gfdba adbefc ebcdfag bcgaf bfdaeg dg adbfe egbacd bgd dfge | gbd bgd bcgfa fbgad\n" +
            "dfaegb fe bcgde face afgbdc acgebdf agfcb cgbef fcgbea gfe | acef afedgb bgdfcea fgedab\n" +
            "abdcef gdfea cbaef gaefb cagebf agfdbec agdbfc ecgb fbg bg | aebfc egcb acfgbe gebc\n" +
            "bcf gbadec bf bgaf fcdea cgbda gebdfc dgefcab fcabd bdagcf | edacf bf cfb gadcb\n" +
            "cdafgb bgdf gacefd cdb bd ecfadbg cdafg cdebag bfadc ecafb | bcefa cfdba agdfc fabdc\n" +
            "egb dgbf bgdeca febag fbadge ebadf aecfg gb geacfdb fbacde | fdbg bg caegf egfab\n" +
            "ac eagfbdc bgacf cbdgae gabdf acdf gdfaeb acg dbgafc gbfce | gdbeaf agbcf dcbagf fgadeb\n" +
            "ef eagf bfegcd gbaefd fbe eafbd dagfb abced agcfbd abcefdg | ef ef ecdgfab deafb\n" +
            "fdgbc efbgd aedbg dfce bcagdf fe fegcab cdgabef efg cgdfbe | efgcdb efg agcfeb dgfabc\n" +
            "fe dbefgac baegc eagfc ebgf acdgf aedbfc bgafce cef bcgdea | agbdce aecbfg cdgaf ef\n" +
            "fbgcd bdf dfbega dfcga abfdcg db dabc cfebg feadgc ecgbdaf | fcbeg gcdfb cgbdf acfdg\n" +
            "bac cdbeagf abfd bcfea edcfba abdcge edacf gcbfe gcdefa ba | cegfb cafde ba fegdcba\n" +
            "gcabfd acdg cg gfdbcae ecbgfa cbg bfegd gdcfb cedafb fadcb | cgfbd cfgdb fdegb cg\n" +
            "fcdaegb gdefcb dgfacb dcgea eb dgcbf afcegb bgced bdef bec | ecdag eb befd dabcfge\n" +
            "defcb eabcf bca abfeg ac cafbge gfac dbaecg fcbegad bagedf | bfgae cfga ecabf aegbcf\n" +
            "gdcfea adgcf cbged bgadfc gbf gfdbc cfegdba bcfa bf dgaefb | fgadc bfg fb bf\n" +
            "bdgcaef adg egbca cdabg eadbcg eadc cgdfb efagbd ad ebfagc | da dace dga gedfab\n" +
            "cade afgecd fgedc cbaegf efbgd gdfcabe ce fec cadgfb dcgaf | ce adefgc cdea fce\n" +
            "efgcba ged gcdbea acgeb decag cdgaf egbcafd bdae fgcbed de | adeb edg cgadf agdec\n" +
            "agfce af febgc ebgadc cadeg dafg faegcd bceadf bfaecgd efa | egbcf fbgec acedg af\n" +
            "cbgdae debcfa becadfg agecb gcde cfgba ce begda bec fdaebg | bec eadgb eadbg badefgc\n" +
            "bagedf ecf ec dbefc cbedfa edca dfbcg edbfa eabgfc aefgcdb | fec dafebc cfe aefdb\n" +
            "aef bface dabefg ebfdgac caeg bgfac fcegba fcbed ae cfgbad | efcba baefc afbcg gbcfa\n" +
            "dfeca fdagcb feagc adcbef fg gefd cabge fgdbace cegadf cgf | fg decfab cfdbga baecg\n" +
            "gbaefd agedbcf cagbe fb cgbeaf baefc bfgc bgeacd efb dcfae | gcbaed fb bgfcae bcfg\n" +
            "cegf bcedg bgacdef gbedf fg ebadf ebgdcf dgcfba debgac bfg | bdfgca bgf fgdbce becfadg\n" +
            "decafgb acgbd fegdab cefag dfcga gdf fd aecfgb dfecga cefd | gcebfa fgacbe fgbdae fcde\n" +
            "faebc acb bdfgca afgedcb ab daeb fcbge afcebd feacd cafedg | fbgdca ab afedgc ceafbd\n" +
            "gfeb ebgcdfa dfgca abfdg agebd bf abf bceafd dabgce dbfgae | fgeb gadbf gcafd bf\n" +
            "ecbdfg gecdfa efcadgb ebdac deabf fbga bf dbf efagbd dfgae | adfbe cfdage efdcga gfab\n" +
            "fg cedbgaf feacbd dafgeb fag gfecba acgde febac cfega fcgb | decbgfa fg ecgad afdbgce\n" +
            "cfbgde aegcdf daefbc dgceb fcged gafdecb cbfg bc ceb gebad | dafecbg eagdb bec begdc\n" +
            "cdefga fbgcade fgdca cd bafdec adc dbgeaf cafgb efgda cegd | afcgb ecdg bcfag caedfg\n" +
            "agfbc af deagfbc fecbg gfa fcegbd cfae bgafec edagbf bcadg | agf ecfa becfg af\n" +
            "bdgf afceg adcfeb egbaf afgbde afb fb cegbfda daebg adgbec | fba ceadgbf bf fb\n" +
            "efgb eg aecbd ecbdg daecgf dcgfb fbagdc egfadcb gce ecbgdf | afbegcd fegdac cebad bgafdc\n" +
            "acgbd eb dbace bdafgc fabdge bceg gecdba edcaf aeb bagcdef | fdgabc fegadb dgbcfea egabfd\n" +
            "cadfgb acefdg fcb fbea fb ebdfca ebcdf degcb dfaec cbdefga | aefcdbg cdegaf gdbec dcfae\n" +
            "fcdab edc cfeb gdfcae dcaeb ec gdcbaf fdcabe debga efbgadc | fcbe gbaed fcaedb acedgf\n" +
            "gb gefca acbfge bdgaecf bfcag bdfca abg aedfgb gebc agfecd | cgafb ebcg aecfg efgbac\n" +
            "dgabcef fbdgea fb cdbf cebfg bdaegc dgceb egcdfb bfg acgef | cbgde faegc befgdca cbdf\n" +
            "cfaebdg fg fgcead agedb fge ebcdf gebdf dfeagb dbgace fgab | gfba eagdfcb dcabeg cegafd\n" +
            "fbe egcba bgefdca bgdafe afdgb fdbgac dgcbfe fbega defa fe | ebf egafb fbgdac egafb\n" +
            "gdc acfdeg geabc dbfg dabcfe dbeafcg dg bedcf edcgb efcbdg | agcefd cbdfe dg bcedf\n" +
            "bafgcd febdgca abgcf bcgea be edgac aeb cbef afebgd ecgbfa | bea eb ecfbag abfcg\n" +
            "cdae cbd gacbe fcbdge cefbag bagcde gcabd bdafg dc fdgebca | cegdfb gbeacd cd cabdge\n" +
            "dac dfgae fcdabg agbc dcfbg gfedbc fadcg bfaegcd ca eadbcf | cfabged ac cbag dfceab\n" +
            "egbdcf bdeagfc aegcb bafec fdceb edgafc caebfd aef fbad af | efa adfcbge dfba ebgac\n" +
            "ebadg fcaeb dc acdg becgfd adecgbf dbc dbeafg dbaec bedagc | cdb bdc dc aecbd\n" +
            "cfaegbd agbdce edca badgf edgfbc ebagd ed gde aebfgc ebcag | cbeag edca gdbea fbedgc\n" +
            "fgb dfagceb cabgdf gf afge ecbaf deabcf cbdeg bgefc gfceba | bgecd gf bacef fg\n" +
            "abd fgcdaeb gfeabc gdfacb fcbea faebcd dcbeg badce ad dafe | adecb gfaebc fdcbga aecdb\n" +
            "fcgdeab eabgf feagd dge dg cdaefb acedbg cdfg gcaedf efadc | cfade cbeadg bgfea dg\n" +
            "fegcb fcedag badgce fcbdgea afg gafeb af dbgefa degba fadb | fbegc fabge af dcgabe\n" +
            "abcdfg dcbfea bagd cegfb bd dbf cgafde edgcbfa fgdca bcdfg | fdabce gbcfd cbefda ecabdf\n" +
            "afgbd fbgde dcfageb ag gba gfdcab eadgcb cfag daebfc cdbfa | ga ag bdaefc ga\n" +
            "egf ecabfd fg ecdfb cfgb cbegadf dgbfae begcfd agcde cgdfe | gbdefa fedgc cafedb cfdge\n" +
            "bafcdge dgbace cgbad cdafe bedcfg be abge cebad dcfabg bed | dbe gabfced cgbedf cbadg\n" +
            "becagf fdec debafc afedb adbgc bgdfea dabcf cf cabegfd afc | bagdc decf fca dfbae\n" +
            "dcagb gfcade cgdebf fdbeag gdfeabc efdcg ecfb deb egbcd eb | eb edagbf ebfc eagdcf\n" +
            "ebcdaf fgdc gbeac dgfae efadbg cd gcefda dgace fbgedac cda | aegdc dfabge gcade daceg\n" +
            "fgdcb adceb fcgeabd acedbg af fba aebgdf efac dcabfe adbcf | cdbaf cgeadb bdcae bfgaed\n" +
            "fcb fc fcdgb dabfg eabcfdg cbged cefg begdca gcdbfe efdacb | ecfg fabgcde gdecbaf bacged\n" +
            "gfdabc ad bdfgea fegbdac gbaecf bfega adg adbe afged egdcf | dcfgab bgcefa gad gafcbd\n" +
            "bgdcfea afb gabfcd adbfeg efdba bgdfe dfgbce eafdc bage ab | ab dgefb baf bgaedcf\n" +
            "geabd adecfgb cg ebcdfa agfbdc fdcg dabcf dcbag faebcg cbg | dagbe fgdbeca cbagdfe fcbeda\n" +
            "bdfa dafbge fgedb bfceg bdg afdebgc bd bdaecg defcga gfdea | bagfdce dcgafe fegbc dbegca\n" +
            "aedcgb fb gdbaf dgabe acdfg fabgde fadecgb gbf edfb facegb | agdcf badeg fb fabcge\n" +
            "dfbce gafed ba eagb gfdbca aefdb fecdag fagbedc abf egadfb | eafdb edfcbag dcfbe ba\n" +
            "afdec fcegda edgabc bgdfc faebdc ba bac dcfebag fadbc fbae | deafc acb fbgaecd cfdea\n" +
            "gecd dgf eabdf gd gfdeb fgcadb gcbfae cefbg cedfbg cfeabdg | gd edfba fgbce fbgec\n" +
            "adfge bcgfde baecg dcfgaeb bafdge gdeac dagcef dc cdg acdf | cgd dgcae gcead cd\n" +
            "efgac agbfedc aecbfd agbfde dcbg fdbag gacdfb bc fgbac fbc | bc afdegb bgdc edbafg\n" +
            "be cbfgad acegdb agefd dabgc cebfgad gbce bdega dfbace bed | bagde eb egcb edfbac\n" +
            "gf fag afgbe ecbaf geadb eabgdf egdf dagbfc ecagdb cbgdeaf | cbefa fg bdega gfacbed\n" +
            "bag defba gcfdae cgbd gb eabgfc gcfabd dfagb gcdfa ecbgfda | begacf agb cgfade fcdga\n" +
            "adgfcbe egd fgadeb cgbdae acdgb cgedb deca de efcbg acbdgf | cfbdag dcgba geabdf eadc\n" +
            "cagdebf dgebcf edc abecfd egfadb fabed ec gadbc efca dabce | dec fbadec debac edc\n" +
            "fcedg dfgbae eg deg egcb fgcebd efacd gfdcb gbfecda gdafbc | efacd ge cfgabde fagecdb\n" +
            "dbag aefcbd gbc gcdbf bdcfa bg dfabcg ebadgcf cfgeba dgecf | bfaced gedcf dbag cgbdaf\n" +
            "cdgfbea gd bdag gebca bdcgfe dgc fcagbe gabedc afcde cdaeg | abgcde ebcga dagb bgcefa\n" +
            "cedgbfa ecabgd cdafeb bafcg cegdbf cae gdae gabce ae edcgb | aec cageb ecdgfb egda\n" +
            "eacgbf afbdg gdecaf gafbcde gfc baefc bcge fcabg fdcbea cg | agfdb cgfba bgafc eacgdf\n" +
            "fgebd fed bfea cbdeg decfga fe cfdgba defbgac dfgba afdbeg | fgdba abegdfc bcadgf fbegd\n" +
            "adbfcg fagdbe bagec dc fbaedcg bdfag gbdca fcgedb dcfa cgd | fcad bfdgae dgc eagbc\n" +
            "fgbaecd fgecd cafeg feacbg fdgcb fgaecd acdbge ed adfe dge | cfgdb gcedf deaf cfdbg\n" +
            "gedab afdcbeg decabg bfedcg dgefab ef aedf cfgab gbaef efb | abcgf cabgf feagdcb cdbaefg\n" +
            "fdb ebdgfc bd adefgcb efgad gbcd dfbge afcgeb fecgb dbeacf | bfd cgfdeba cafdeb gedfa\n" +
            "abgde bdefa fagdbe fbadceg dgecab dfe ef edfgca bfdac fbge | fegb cagdeb ecdgab bdagefc\n" +
            "febad bacged fge cdbeg cfebdag fgdc gf debcgf bdefg cfebga | fg egf beafd efg\n" +
            "agdcbf bdefcga cbgefd dcagb gbedac faedc gfc bfag gfcad gf | bgfa dbagc bfgdca bcgad\n" +
            "bdce gafbed gaecf bcefdag gbc dacbeg fcbgad egdab cb cegba | eadbgc cb ebadgf debc\n" +
            "ac afgceb eagbf befcagd abcg degcf aefbdg ceagf edbacf acf | abecgf bgac gacb ceadbf\n" +
            "abcg fcaeb gfdcabe ab befdc cfage gdbfea gecdaf efcgba bfa | bgac bcga cagb efgbda\n" +
            "fbdeg gb fcdeb dfecbg eafgdbc edgfa eagbdc baedfc cbfg beg | adbgce dfcaeb bgfc abcged\n" +
            "afg afdbec cbdgaf afcgedb bedgf cdagef ga afcdb gbca gfbda | cfagdb edcafg cbfgda bgfed\n" +
            "edgafcb fdeab dgabcf cbgf gdfeac dgfab gdeacb acgbd gfa gf | gaf bcgf ecbagd agf\n" +
            "dcbfa gfbace ebfca efcg bgfeadc abgce gbafde ef beadcg fbe | egcf fabdc adebgf bdcage\n" +
            "gc cfdbe fgcebd bcgef ceg fdagceb ecadbg fgdc fageb bedcfa | adgcbe aefgdcb gabfe gc\n" +
            "fgead bcdafg ba bcae edafb bcefad dbcfe cafbgde gbcdef adb | dcfeb gecdfb caeb bacdfe\n" +
            "gfeab abc bc ecbf gdebaf gebac gdcea gecdfba acdfbg fbgcae | cbdagf gbcae bc edgbaf\n" +
            "aecgf acbf cgadef fecbg bc ebc dcegba befdg aebgcf afdebgc | ecb bcgfe bgedf abcf\n" +
            "fg facg efcagd eadfg cebfda feg daegb bdfcge afced cfeadgb | acdfe fgeda fg cdbegf\n" +
            "gefda fed edfbgc fgeab cfad cdeag fd cebgad dcefabg fagdce | faegdc eafdg fd cgbfdea\n" +
            "ebfad cf befca gabedc fac cabeg dcaefg abfecg fbacged gcbf | bfade fcbg fc cgbf\n" +
            "aegbf cbdfega adbfg ef cebdgf dfcbga gebca fadgbe afde gfe | fdae afcbgd bgcedaf gef\n" +
            "cdgab cg edgbac gbedfa gebcdaf dcebfg gcd degba aceg dacfb | gdc cgdba cdg gbadc\n" +
            "daebfg fcebgad db gacbf feacdg gafdb eafdbc dgaef dfb bedg | cefdbag gedfca gafdeb befcda\n" +
            "ecfd fcdgba cebgf fge bgafed febdcg cbfegad cabeg fe gfdbc | ecgdfb edfc gebdaf fecd\n" +
            "fac gbeaf bcdga adgbcef febcda cfgba gefbda bagcfe cfge fc | gcfe gbcaf acfbeg acdgb\n" +
            "afegdcb fdgba bfgacd fdcg fd cbfga adf ebcagf dcfabe gbdae | df bcaefd cfagb df\n" +
            "cdbgef bgef ge ged badec agfdcb adgecf cgdeb cbgdf fdbceag | dcfgb gcebd egbf dcegb\n" +
            "dfbea gb cfgea bag fgbc debcga acdbgef afcgbe gfeba cfdaeg | beafd bag cbgf gba\n" +
            "fdgcab cd ebdaf baecdgf cda bcgaf cfebga acebgd cbdaf cfgd | aegcfb cdgf cdgf afegbdc\n" +
            "fcbga cbeagf dcabg da dfabcg bdaf begcd dca fdagce bcgfdae | acgbd dbceg acd cfbga\n" +
            "degacbf cf dcgfba adegbf efgab gfce acfeb dbeca caf gcebaf | bacfe abfecg ebafc debac\n" +
            "bcaefd gbce dcegfb gcbadf dgfaecb fbdce dgcfe cg agfed fcg | dbgfec gc acdgfb efbcd\n" +
            "cdfag dgebacf bdfagc fba acdgef fcdab bfdg baedc gbfaec fb | cedbafg fb dgfeac cadbf\n" +
            "bcdgf eafcbgd bd adfb dcabeg gebfac gcfba gfdacb fdgce bgd | cfbga fgcab db fcegd\n" +
            "cdgafe deg bedfc dfgb cgdbe dg dcefba efdgbc cagbefd cegab | bgdf abfdec egd gedbfc\n" +
            "bg febdca edgcb cdeab gbc edgbca gdab beagcf cdegf debacfg | bcaedf dgcef badg fecadbg\n" +
            "dbca cgaedb gcfbe cea fadbeg gabce ca edcafg degab abfedgc | fdebag beacg abcd adcegb\n" +
            "gcdfe adbfgec cbafge dgbaf ebf gfbced eb adcgfe becd fgebd | ecgfba gcbfde dbec cdafge\n" +
            "dbgeafc dacbg badfge abfce ed eda dcfe decba dcfeab gfbeca | febcda defc beacf fdgabe\n" +
            "efcd bfcadge fcdba egabf bfdcag dcefba deagbc fabed ed edb | gbeacd fdeab ebcfad fageb\n" +
            "dcgf fegdab bcaeg dcegaf dga gd dcfbea fcdea aedcg bdefgca | cbegdfa eabcfd adfce cbefda\n" +
            "bf edfbgc cegbf bcadefg ebf acbfde gcedf feadgc gbcae gfbd | feb dfgb egbcdfa dfegc\n" +
            "efgba eacd efadcg dcgefb gacdf dbcfgae efd bgcdaf edfga ed | cfbgda dgcfa gcfead eadfg\n" +
            "afgdc fbg cdgaef fagbdc bgcefa cdbf bgdaf bdaeg fb dgabcfe | dagfc cefagb egcabf fcbd\n" +
            "cadgfe acbed cfabgde fdbcge cfga fad fdeabg fa dcaef dcfge | fad bafgecd cfegad adbfcge\n" +
            "agdefc cfad bdgecfa gadfe aefgc ad ceadgb gbafce bfedg agd | dag ad fcage cgbafe\n";

    public static void main(String[] args) {
        int k=0;
        String[] ss = s.split("\n");
        for (int i = 0; i < ss.length; i++) {
            String t = ss[i].split("\\|")[1];
            String[] u = t.trim().split(" ");
            for (int j = 0; j < u.length; j++) {
                if (u[j].length() == 2 || u[j].length() == 3 || u[j].length() == 4 || u[j].length() == 7 ) {
                    k++;
                }
            }
        }
        System.out.println(k);
    }
}
