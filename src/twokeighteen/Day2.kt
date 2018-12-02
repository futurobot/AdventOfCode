package twokeighteen

class Day2 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            System.out.println("Day 2. Puzzle 1")

            ("abcdef\n" +
                    "bababc\n" +
                    "abbcde\n" +
                    "abcccd\n" +
                    "aabcdd\n" +
                    "abcdee\n" +
                    "ababab").let { System.out.println("In $it: Out: ${solvePuzzle1(it)}") }
            ("crruafyzloguvxwctqmphenbkd\n" +
                    "srcjafyzlcguvrwctqmphenbkd\n" +
                    "srijafyzlogbpxwctgmphenbkd\n" +
                    "zrijafyzloguvxrctqmphendkd\n" +
                    "srijabyzloguvowcqqmphenbkd\n" +
                    "srijafyzsoguvxwctbmpienbkd\n" +
                    "srirtfyzlognvxwctqmphenbkd\n" +
                    "srijafyzloguvxwctgmphenbmq\n" +
                    "senjafyzloguvxectqmphenbkd\n" +
                    "srijafyeloguvxwwtqmphembkd\n" +
                    "srijafyzlogurxtctqmpkenbkd\n" +
                    "srijafyzlkguvxictqhphenbkd\n" +
                    "srijafgzlogunxwctqophenbkd\n" +
                    "shijabyzloguvxwctqmqhenbkd\n" +
                    "srjoafyzloguvxwctqmphenbwd\n" +
                    "srijafyhloguvxwmtqmphenkkd\n" +
                    "srijadyzlogwvxwctqmphenbed\n" +
                    "brijafyzloguvmwctqmphenhkd\n" +
                    "smijafyzlhguvxwctqmphjnbkd\n" +
                    "sriqafvzloguvxwctqmpheebkd\n" +
                    "srijafyzloguvxwisqmpuenbkd\n" +
                    "mrijakyuloguvxwctqmphenbkd\n" +
                    "srnfafyzloguvxwctqmphgnbkd\n" +
                    "srijadyzloguvxwhfqmphenbkd\n" +
                    "srijafhzloguvxwctdmlhenbkd\n" +
                    "srijafyzloguvxwcsqmphykbkd\n" +
                    "srijafyzlogwvxwatqmphhnbkd\n" +
                    "srijafyzlozqvxwctqmphenbku\n" +
                    "srijafyzloguvxwcbamphenbgd\n" +
                    "srijafyzlfguvxwctqmphzybkd\n" +
                    "srijafyzloguqxwetqmphenkkd\n" +
                    "srijafyylogubxwttqmphenbkd\n" +
                    "srijafyzloguvxzctadphenbkd\n" +
                    "srijafyzloguoxwhtqmchenbkd\n" +
                    "srijafyzloguvxwcvqmzhenbko\n" +
                    "srijnfyzloguvxwctqmchenjkd\n" +
                    "srijaryzloggvxwctqzphenbkd\n" +
                    "srijafhzleguvxwcxqmphenbkd\n" +
                    "ssijafyzllguvxfctqmphenbkd\n" +
                    "srijafyzloguvxdctqmfhenbcd\n" +
                    "srijafyzloguvxfctqmplynbkd\n" +
                    "srijaftzlogavxwcrqmphenbkd\n" +
                    "sriwaoyzloguvxwctqmphenbtd\n" +
                    "srijahyzlogunxwctqmphenbvd\n" +
                    "srjjafyzloguzxwctumphenbkd\n" +
                    "nrijafyzlxguvxwctqmphanbkd\n" +
                    "srijafezlqguyxwctqmphenbkd\n" +
                    "srijafygloguvxwjtqcphenbkd\n" +
                    "erijafyzloguvxoctqmnhenbkd\n" +
                    "ssijafyzllguvxwbtqmphenbkd\n" +
                    "sriaafyzloguvxwctqqphenbkv\n" +
                    "frijafyzloguvswctwmphenbkd\n" +
                    "srijafyzyogkvxwctqmprenbkd\n" +
                    "syijafyzuoguvxwctqmkhenbkd\n" +
                    "srijafyzloganxwctqmphenbkf\n" +
                    "srijafyzloguvxwftqmxhenbkq\n" +
                    "srijafyflogxvxwctqmghenbkd\n" +
                    "srijafyzsoguvxwctqmpjenwkd\n" +
                    "srujafylloguvxwctqmphenckd\n" +
                    "srijafyzlpzuvxwctqmphenbud\n" +
                    "srijafyzlogfvxwctqmhhenbwd\n" +
                    "srijafjzlogusxwctqmphepbkd\n" +
                    "srijlfyzloguvxwctqfphenzkd\n" +
                    "srijafyzlogwvxwctqyphenbqd\n" +
                    "srijafyzloluvxwctqtphenukd\n" +
                    "srizafyzlowuvxwctqmphqnbkd\n" +
                    "sritafkzlkguvxwctqmphenbkd\n" +
                    "sbijafdzloguvxgctqmphenbkd\n" +
                    "crijafyeloguvxwctqmpsenbkd\n" +
                    "srijafyvlogulxwctqmphenbkk\n" +
                    "srijafyologuvxwctqmehegbkd\n" +
                    "siijafyzloguvxwctjmphenbmd\n" +
                    "srijafyzlupuvxwctqmpheabkd\n" +
                    "srijafyzlogumxwctqqphanbkd\n" +
                    "srijxfyzlogujxwcqqmphenbkd\n" +
                    "irijafizeoguvxwctqmphenbkd\n" +
                    "sgijafyzloguvtwctqmpfenbkd\n" +
                    "srijzfyzloguvmwctnmphenbkd\n" +
                    "srijafyzwohuvxwctqmthenbkd\n" +
                    "srijafyzlhguvxoctqwphenbkd\n" +
                    "srgjafyplogxvxwctqmphenbkd\n" +
                    "srijafyqlogovxwctqzphenbkd\n" +
                    "srijafjzloguvlnvtqmphenbkd\n" +
                    "srijafyzooguvxwctqmphenvud\n" +
                    "srijafyzgoguvxwctumphgnbkd\n" +
                    "srijaffzloguvxwdqqmphenbkd\n" +
                    "srijafyzlogugxwctqxphenbkr\n" +
                    "srijafyzlogutxwctqmmcenbkd\n" +
                    "srifafyzlhguwxwctqmphenbkd\n" +
                    "mrimajyzloguvxwctqmphenbkd\n" +
                    "sriyafyzloguvxwcthmphejbkd\n" +
                    "srieakyzlokuvxwctqmphenbkd\n" +
                    "srisafyzloguhxwctqmphecbkd\n" +
                    "srijanyzloguvxcctqmxhenbkd\n" +
                    "srijafyzypguvxwctqmqhenbkd\n" +
                    "sryjtfyzlvguvxwctqmphenbkd\n" +
                    "srijafyzlsguvxwctqmqfenbkd\n" +
                    "srijafyzlogudxwbtqwphenbkd\n" +
                    "srijysyzloguvxwctqmpvenbkd\n" +
                    "srijafyzloggvxwjtqmphegbkd\n" +
                    "srijgfyzloguvxwctqmbhdnbkd\n" +
                    "ssijufyzloguvawctqmphenbkd\n" +
                    "skojafyzloguvxwctqmphenbnd\n" +
                    "srijafylloguvxwcqqmpienbkd\n" +
                    "trioafyzloguvqwctqmphenbkd\n" +
                    "srijafydloguvxwctqmpzjnbkd\n" +
                    "saijafvzloguvxwcqqmphenbkd\n" +
                    "srhjapyzloguvxwctqmbhenbkd\n" +
                    "srijafyzlfguvxwcsqmpwenbkd\n" +
                    "shijafyzboguvxwctqmphenbmd\n" +
                    "srizafysloguvxwrtqmphenbkd\n" +
                    "srijafyzloguvxwciqmwhenbkj\n" +
                    "qrijafyzloduvxwctqmphenbko\n" +
                    "srijefyuloguvxwctqmphenbed\n" +
                    "srijafyzlobuvxwctqmphenhbd\n" +
                    "srijafyzloxuvxwctqmpheabkq\n" +
                    "srijafyzloguvrwctqmghenkkd\n" +
                    "sfisafywloguvxwctqmphenbkd\n" +
                    "srgjafyzlogurxwctqmphenbkp\n" +
                    "srijafhzloguvxwcjqmphenhkd\n" +
                    "srijafyylogufxwrtqmphenbkd\n" +
                    "srijafyzvoguvxwzkqmphenbkd\n" +
                    "sqijafyzloguvxwctqmpheqbxd\n" +
                    "srijafyvloguvxwctqzpherbkd\n" +
                    "srijufyzloguvxlcsqmphenbkd\n" +
                    "srijafykloguvxlccqmphenbkd\n" +
                    "srijafyzloguexwcrqmphenzkd\n" +
                    "sridifyzloguyxwctqmphenbkd\n" +
                    "srijafyzlogfvxwctqlphenbkl\n" +
                    "srijafyzlodqdxwctqmphenbkd\n" +
                    "srijafyzloruvxactqmphenekd\n" +
                    "grijafyzloguvxpctmmphenbkd\n" +
                    "srsjakyzloguvxwctqmphvnbkd\n" +
                    "srikafyvloguvxwrtqmphenbkd\n" +
                    "srijafyzloguvxwctqjpserbkd\n" +
                    "jrijafyzloguvxwctqmpgesbkd\n" +
                    "swijafyzluguvxwctqmfhenbkd\n" +
                    "srijanynlogovxwctqmphenbkd\n" +
                    "jrijafyzloguvxwctymphrnbkd\n" +
                    "srinafyzloguvewctqmphenbzd\n" +
                    "srijakyzloguvxwctqmphcnbka\n" +
                    "srijafyhlobuvxwctqmphenbka\n" +
                    "srijafyzcogusxwctqmphwnbkd\n" +
                    "srijavyzlosuvxwctqmphjnbkd\n" +
                    "orijafyzxoguvxwcnqmphenbkd\n" +
                    "srijafyzlogcvxwvtqmthenbkd\n" +
                    "srijapyzloauvxwctqmphenvkd\n" +
                    "srijaflzloguhxwctqmphenbwd\n" +
                    "smijafyzlonuvxwctqmphenbkw\n" +
                    "jrijafyzloguvxwclqmnhenbkd\n" +
                    "srijaqyzloguvqwctqmphenskd\n" +
                    "srijasyzloguvxwctqmvhenbku\n" +
                    "crijtfyzloguvxwctqmthenbkd\n" +
                    "srrkafyzvoguvxwctqmphenbkd\n" +
                    "srijatyzloguvewctqmphenbld\n" +
                    "srfjafyyloguvnwctqmphenbkd\n" +
                    "srijafyzloguvxwctqjpbenbkt\n" +
                    "hrijafyzooguvxwctqmphenbld\n" +
                    "srijafbzlogscxwctqmphenbkd\n" +
                    "srinafyzlogxvxwctqqphenbkd\n" +
                    "slijafyzloglvxwctqmphenbdd\n" +
                    "srijafyzlogjvxwcsqmphenbld\n" +
                    "sryjcfyzloguvewctqmphenbkd\n" +
                    "srijafyzloguexwctqmohknbkd\n" +
                    "jaijafyzlogevxwctqmphenbkd\n" +
                    "srijafbzlogavxwctqmphenbki\n" +
                    "srijafozlogpvxwctqmphgnbkd\n" +
                    "srijdfyzloguvxwczqmphenbkm\n" +
                    "srijafyzlobuvxwctqmphxndkd\n" +
                    "mrijifyzlhguvxwctqmphenbkd\n" +
                    "srijafyzloguvxbctumphjnbkd\n" +
                    "srijafyzloyuvxwptqmphlnbkd\n" +
                    "arijafyzloguvxwcsqmohenbkd\n" +
                    "srijaftzioguvxwttqmphenbkd\n" +
                    "srijafyzlqsuvxwctqmphxnbkd\n" +
                    "srijafyzioguvxwctqnphetbkd\n" +
                    "prijafbzloguvxdctqmphenbkd\n" +
                    "srijaeyzlnguvxwmtqmphenbkd\n" +
                    "srijofyzloguvqwctqmphonbkd\n" +
                    "srixaryzpoguvxwctqmphenbkd\n" +
                    "srijafyzlowuvxwcwhmphenbkd\n" +
                    "srijafydloguvxwctqmptenikd\n" +
                    "srijqfyzlogtvfwctqmphenbkd\n" +
                    "srijafyzloguvxlctqmpvenbgd\n" +
                    "srijafyzlbguvxwjtqgphenbkd\n" +
                    "srijafyzlohuqxwctqmphenbka\n" +
                    "srijafyzroguvxictqmphynbkd\n" +
                    "srijafyzloguvxdctjmphenjkd\n" +
                    "srijaoczloguvxwctqmphenbjd\n" +
                    "srajafhzloguvxwctqmphenbke\n" +
                    "srijofyzloduvxwctqmphanbkd\n" +
                    "srijafytloguvxwmtnmphenbkd\n" +
                    "srijafyzuoguvxwceqmpgenbkd\n" +
                    "rrijafyzloyuvxwctqmphlnbkd\n" +
                    "srljafyzloguvxictqmohenbkd\n" +
                    "srijafyzlogulxwcrqrphenbkd\n" +
                    "srajafyzloguvxwctqmphanbke\n" +
                    "srijafyzlhguvxwxtqmpheabkd\n" +
                    "sxijafyzloggwxwctqmphenbkd\n" +
                    "srijafyultguvxwctqmphinbkd\n" +
                    "srijafyzloguvtwctqmfhvnbkd\n" +
                    "srijafwzloruvxwctquphenbkd\n" +
                    "srbjafyzxoguuxwctqmphenbkd\n" +
                    "erijafyzlxguvxbctqmphenbkd\n" +
                    "srijagyzlojubxwctqmphenbkd\n" +
                    "srijafyzloguvxwdtqmchenakd\n" +
                    "srijafkzlogukxwctqiphenbkd\n" +
                    "mridafyzloguvxwctqmphenrkd\n" +
                    "szqjafyzloguvxwctqmpheibkd\n" +
                    "srijahyzloguvxwctcmphenekd\n" +
                    "srijafyzloguvxwczpuphenbkd\n" +
                    "srijafyzcoguvfwctqmphenbkq\n" +
                    "qriiafyzloguvxwctqmpheebkd\n" +
                    "srijpfyzloguvxlctqmphenokd\n" +
                    "srijzfyzlotuvxwcjqmphenbkd\n" +
                    "srinafyqloguvxwctfmphenbkd\n" +
                    "srijafyzlogjvxpltqmphenbkd\n" +
                    "srijafyzlotuvxwutqmphenbtd\n" +
                    "sridafyzloguvxwctqmpyenokd\n" +
                    "srxjafyzqogyvxwctqmphenbkd\n" +
                    "ssijafyzzoguvxwctqmphenbad\n" +
                    "srijafrzloguvxwctqmphekpkd\n" +
                    "srijafyzlfgrvxactqmphenbkd\n" +
                    "srijafyzroguvxwttqmphekbkd\n" +
                    "srijefyzloguvxwctqmpqenbrd\n" +
                    "srijefycloguvxwctqmchenbkd\n" +
                    "srzjafyzloguvxwcqqmphanbkd\n" +
                    "srijauyzlhguvxwctqmphenbgd\n" +
                    "srijafyzloguvmwvnqmphenbkd\n" +
                    "srihafyzloguvlwotqmphenbkd\n" +
                    "srigafyzloguvxwctqmphennsd\n" +
                    "sriuafzzloguvxwcuqmphenbkd\n" +
                    "srijavuzllguvxwctqmphenbkd\n" +
                    "srijafjzloguvlnctqmphenbkd\n" +
                    "lrirafyzloguvxwctqmphenbld\n" +
                    "soijarxzloguvxwctqmphenbkd\n" +
                    "srijapyzlnguvxwctqmdhenbkd\n" +
                    "srijafyzkogujxmctqmphenbkd\n" +
                    "srijafuzloguvxwcsqvphenbkd\n" +
                    "srijagyzzoguvxwctqmpvenbkd\n" +
                    "srijafyzlovuvxwctqmrhenbxd\n" +
                    "srijafyzqoguvxwctwmpienbkd\n" +
                    "sxijafyzloguvxwutqmphenlkd\n" +
                    "srijafyzlhgzvxwctqmphqnbkd\n" +
                    "srijajyzloguvxwcbwmphenbkd\n" +
                    "srijazyzloguvxwhtqmphenbkx\n" +
                    "srgjafyzloguvvwctqmphdnbkd\n" +
                    "rrivafyzloguvxjctqmphenbkd\n" +
                    "srijifyzdoguvxwctqmphenbka\n" +
                    "hrijafyzloguvxectqmpheybkd").let { System.out.println("In $it: Out: ${solvePuzzle1(it)}") }


            System.out.println("Day 2. Puzzle 2")
            ("abcde\n" +
                    "fghij\n" +
                    "klmno\n" +
                    "pqrst\n" +
                    "fguij\n" +
                    "axcye\n" +
                    "wvxyz").let { System.out.println("In $it: Out: ${solvePuzzle2(it)}") }
            ("crruafyzloguvxwctqmphenbkd\n" +
                    "srcjafyzlcguvrwctqmphenbkd\n" +
                    "srijafyzlogbpxwctgmphenbkd\n" +
                    "zrijafyzloguvxrctqmphendkd\n" +
                    "srijabyzloguvowcqqmphenbkd\n" +
                    "srijafyzsoguvxwctbmpienbkd\n" +
                    "srirtfyzlognvxwctqmphenbkd\n" +
                    "srijafyzloguvxwctgmphenbmq\n" +
                    "senjafyzloguvxectqmphenbkd\n" +
                    "srijafyeloguvxwwtqmphembkd\n" +
                    "srijafyzlogurxtctqmpkenbkd\n" +
                    "srijafyzlkguvxictqhphenbkd\n" +
                    "srijafgzlogunxwctqophenbkd\n" +
                    "shijabyzloguvxwctqmqhenbkd\n" +
                    "srjoafyzloguvxwctqmphenbwd\n" +
                    "srijafyhloguvxwmtqmphenkkd\n" +
                    "srijadyzlogwvxwctqmphenbed\n" +
                    "brijafyzloguvmwctqmphenhkd\n" +
                    "smijafyzlhguvxwctqmphjnbkd\n" +
                    "sriqafvzloguvxwctqmpheebkd\n" +
                    "srijafyzloguvxwisqmpuenbkd\n" +
                    "mrijakyuloguvxwctqmphenbkd\n" +
                    "srnfafyzloguvxwctqmphgnbkd\n" +
                    "srijadyzloguvxwhfqmphenbkd\n" +
                    "srijafhzloguvxwctdmlhenbkd\n" +
                    "srijafyzloguvxwcsqmphykbkd\n" +
                    "srijafyzlogwvxwatqmphhnbkd\n" +
                    "srijafyzlozqvxwctqmphenbku\n" +
                    "srijafyzloguvxwcbamphenbgd\n" +
                    "srijafyzlfguvxwctqmphzybkd\n" +
                    "srijafyzloguqxwetqmphenkkd\n" +
                    "srijafyylogubxwttqmphenbkd\n" +
                    "srijafyzloguvxzctadphenbkd\n" +
                    "srijafyzloguoxwhtqmchenbkd\n" +
                    "srijafyzloguvxwcvqmzhenbko\n" +
                    "srijnfyzloguvxwctqmchenjkd\n" +
                    "srijaryzloggvxwctqzphenbkd\n" +
                    "srijafhzleguvxwcxqmphenbkd\n" +
                    "ssijafyzllguvxfctqmphenbkd\n" +
                    "srijafyzloguvxdctqmfhenbcd\n" +
                    "srijafyzloguvxfctqmplynbkd\n" +
                    "srijaftzlogavxwcrqmphenbkd\n" +
                    "sriwaoyzloguvxwctqmphenbtd\n" +
                    "srijahyzlogunxwctqmphenbvd\n" +
                    "srjjafyzloguzxwctumphenbkd\n" +
                    "nrijafyzlxguvxwctqmphanbkd\n" +
                    "srijafezlqguyxwctqmphenbkd\n" +
                    "srijafygloguvxwjtqcphenbkd\n" +
                    "erijafyzloguvxoctqmnhenbkd\n" +
                    "ssijafyzllguvxwbtqmphenbkd\n" +
                    "sriaafyzloguvxwctqqphenbkv\n" +
                    "frijafyzloguvswctwmphenbkd\n" +
                    "srijafyzyogkvxwctqmprenbkd\n" +
                    "syijafyzuoguvxwctqmkhenbkd\n" +
                    "srijafyzloganxwctqmphenbkf\n" +
                    "srijafyzloguvxwftqmxhenbkq\n" +
                    "srijafyflogxvxwctqmghenbkd\n" +
                    "srijafyzsoguvxwctqmpjenwkd\n" +
                    "srujafylloguvxwctqmphenckd\n" +
                    "srijafyzlpzuvxwctqmphenbud\n" +
                    "srijafyzlogfvxwctqmhhenbwd\n" +
                    "srijafjzlogusxwctqmphepbkd\n" +
                    "srijlfyzloguvxwctqfphenzkd\n" +
                    "srijafyzlogwvxwctqyphenbqd\n" +
                    "srijafyzloluvxwctqtphenukd\n" +
                    "srizafyzlowuvxwctqmphqnbkd\n" +
                    "sritafkzlkguvxwctqmphenbkd\n" +
                    "sbijafdzloguvxgctqmphenbkd\n" +
                    "crijafyeloguvxwctqmpsenbkd\n" +
                    "srijafyvlogulxwctqmphenbkk\n" +
                    "srijafyologuvxwctqmehegbkd\n" +
                    "siijafyzloguvxwctjmphenbmd\n" +
                    "srijafyzlupuvxwctqmpheabkd\n" +
                    "srijafyzlogumxwctqqphanbkd\n" +
                    "srijxfyzlogujxwcqqmphenbkd\n" +
                    "irijafizeoguvxwctqmphenbkd\n" +
                    "sgijafyzloguvtwctqmpfenbkd\n" +
                    "srijzfyzloguvmwctnmphenbkd\n" +
                    "srijafyzwohuvxwctqmthenbkd\n" +
                    "srijafyzlhguvxoctqwphenbkd\n" +
                    "srgjafyplogxvxwctqmphenbkd\n" +
                    "srijafyqlogovxwctqzphenbkd\n" +
                    "srijafjzloguvlnvtqmphenbkd\n" +
                    "srijafyzooguvxwctqmphenvud\n" +
                    "srijafyzgoguvxwctumphgnbkd\n" +
                    "srijaffzloguvxwdqqmphenbkd\n" +
                    "srijafyzlogugxwctqxphenbkr\n" +
                    "srijafyzlogutxwctqmmcenbkd\n" +
                    "srifafyzlhguwxwctqmphenbkd\n" +
                    "mrimajyzloguvxwctqmphenbkd\n" +
                    "sriyafyzloguvxwcthmphejbkd\n" +
                    "srieakyzlokuvxwctqmphenbkd\n" +
                    "srisafyzloguhxwctqmphecbkd\n" +
                    "srijanyzloguvxcctqmxhenbkd\n" +
                    "srijafyzypguvxwctqmqhenbkd\n" +
                    "sryjtfyzlvguvxwctqmphenbkd\n" +
                    "srijafyzlsguvxwctqmqfenbkd\n" +
                    "srijafyzlogudxwbtqwphenbkd\n" +
                    "srijysyzloguvxwctqmpvenbkd\n" +
                    "srijafyzloggvxwjtqmphegbkd\n" +
                    "srijgfyzloguvxwctqmbhdnbkd\n" +
                    "ssijufyzloguvawctqmphenbkd\n" +
                    "skojafyzloguvxwctqmphenbnd\n" +
                    "srijafylloguvxwcqqmpienbkd\n" +
                    "trioafyzloguvqwctqmphenbkd\n" +
                    "srijafydloguvxwctqmpzjnbkd\n" +
                    "saijafvzloguvxwcqqmphenbkd\n" +
                    "srhjapyzloguvxwctqmbhenbkd\n" +
                    "srijafyzlfguvxwcsqmpwenbkd\n" +
                    "shijafyzboguvxwctqmphenbmd\n" +
                    "srizafysloguvxwrtqmphenbkd\n" +
                    "srijafyzloguvxwciqmwhenbkj\n" +
                    "qrijafyzloduvxwctqmphenbko\n" +
                    "srijefyuloguvxwctqmphenbed\n" +
                    "srijafyzlobuvxwctqmphenhbd\n" +
                    "srijafyzloxuvxwctqmpheabkq\n" +
                    "srijafyzloguvrwctqmghenkkd\n" +
                    "sfisafywloguvxwctqmphenbkd\n" +
                    "srgjafyzlogurxwctqmphenbkp\n" +
                    "srijafhzloguvxwcjqmphenhkd\n" +
                    "srijafyylogufxwrtqmphenbkd\n" +
                    "srijafyzvoguvxwzkqmphenbkd\n" +
                    "sqijafyzloguvxwctqmpheqbxd\n" +
                    "srijafyvloguvxwctqzpherbkd\n" +
                    "srijufyzloguvxlcsqmphenbkd\n" +
                    "srijafykloguvxlccqmphenbkd\n" +
                    "srijafyzloguexwcrqmphenzkd\n" +
                    "sridifyzloguyxwctqmphenbkd\n" +
                    "srijafyzlogfvxwctqlphenbkl\n" +
                    "srijafyzlodqdxwctqmphenbkd\n" +
                    "srijafyzloruvxactqmphenekd\n" +
                    "grijafyzloguvxpctmmphenbkd\n" +
                    "srsjakyzloguvxwctqmphvnbkd\n" +
                    "srikafyvloguvxwrtqmphenbkd\n" +
                    "srijafyzloguvxwctqjpserbkd\n" +
                    "jrijafyzloguvxwctqmpgesbkd\n" +
                    "swijafyzluguvxwctqmfhenbkd\n" +
                    "srijanynlogovxwctqmphenbkd\n" +
                    "jrijafyzloguvxwctymphrnbkd\n" +
                    "srinafyzloguvewctqmphenbzd\n" +
                    "srijakyzloguvxwctqmphcnbka\n" +
                    "srijafyhlobuvxwctqmphenbka\n" +
                    "srijafyzcogusxwctqmphwnbkd\n" +
                    "srijavyzlosuvxwctqmphjnbkd\n" +
                    "orijafyzxoguvxwcnqmphenbkd\n" +
                    "srijafyzlogcvxwvtqmthenbkd\n" +
                    "srijapyzloauvxwctqmphenvkd\n" +
                    "srijaflzloguhxwctqmphenbwd\n" +
                    "smijafyzlonuvxwctqmphenbkw\n" +
                    "jrijafyzloguvxwclqmnhenbkd\n" +
                    "srijaqyzloguvqwctqmphenskd\n" +
                    "srijasyzloguvxwctqmvhenbku\n" +
                    "crijtfyzloguvxwctqmthenbkd\n" +
                    "srrkafyzvoguvxwctqmphenbkd\n" +
                    "srijatyzloguvewctqmphenbld\n" +
                    "srfjafyyloguvnwctqmphenbkd\n" +
                    "srijafyzloguvxwctqjpbenbkt\n" +
                    "hrijafyzooguvxwctqmphenbld\n" +
                    "srijafbzlogscxwctqmphenbkd\n" +
                    "srinafyzlogxvxwctqqphenbkd\n" +
                    "slijafyzloglvxwctqmphenbdd\n" +
                    "srijafyzlogjvxwcsqmphenbld\n" +
                    "sryjcfyzloguvewctqmphenbkd\n" +
                    "srijafyzloguexwctqmohknbkd\n" +
                    "jaijafyzlogevxwctqmphenbkd\n" +
                    "srijafbzlogavxwctqmphenbki\n" +
                    "srijafozlogpvxwctqmphgnbkd\n" +
                    "srijdfyzloguvxwczqmphenbkm\n" +
                    "srijafyzlobuvxwctqmphxndkd\n" +
                    "mrijifyzlhguvxwctqmphenbkd\n" +
                    "srijafyzloguvxbctumphjnbkd\n" +
                    "srijafyzloyuvxwptqmphlnbkd\n" +
                    "arijafyzloguvxwcsqmohenbkd\n" +
                    "srijaftzioguvxwttqmphenbkd\n" +
                    "srijafyzlqsuvxwctqmphxnbkd\n" +
                    "srijafyzioguvxwctqnphetbkd\n" +
                    "prijafbzloguvxdctqmphenbkd\n" +
                    "srijaeyzlnguvxwmtqmphenbkd\n" +
                    "srijofyzloguvqwctqmphonbkd\n" +
                    "srixaryzpoguvxwctqmphenbkd\n" +
                    "srijafyzlowuvxwcwhmphenbkd\n" +
                    "srijafydloguvxwctqmptenikd\n" +
                    "srijqfyzlogtvfwctqmphenbkd\n" +
                    "srijafyzloguvxlctqmpvenbgd\n" +
                    "srijafyzlbguvxwjtqgphenbkd\n" +
                    "srijafyzlohuqxwctqmphenbka\n" +
                    "srijafyzroguvxictqmphynbkd\n" +
                    "srijafyzloguvxdctjmphenjkd\n" +
                    "srijaoczloguvxwctqmphenbjd\n" +
                    "srajafhzloguvxwctqmphenbke\n" +
                    "srijofyzloduvxwctqmphanbkd\n" +
                    "srijafytloguvxwmtnmphenbkd\n" +
                    "srijafyzuoguvxwceqmpgenbkd\n" +
                    "rrijafyzloyuvxwctqmphlnbkd\n" +
                    "srljafyzloguvxictqmohenbkd\n" +
                    "srijafyzlogulxwcrqrphenbkd\n" +
                    "srajafyzloguvxwctqmphanbke\n" +
                    "srijafyzlhguvxwxtqmpheabkd\n" +
                    "sxijafyzloggwxwctqmphenbkd\n" +
                    "srijafyultguvxwctqmphinbkd\n" +
                    "srijafyzloguvtwctqmfhvnbkd\n" +
                    "srijafwzloruvxwctquphenbkd\n" +
                    "srbjafyzxoguuxwctqmphenbkd\n" +
                    "erijafyzlxguvxbctqmphenbkd\n" +
                    "srijagyzlojubxwctqmphenbkd\n" +
                    "srijafyzloguvxwdtqmchenakd\n" +
                    "srijafkzlogukxwctqiphenbkd\n" +
                    "mridafyzloguvxwctqmphenrkd\n" +
                    "szqjafyzloguvxwctqmpheibkd\n" +
                    "srijahyzloguvxwctcmphenekd\n" +
                    "srijafyzloguvxwczpuphenbkd\n" +
                    "srijafyzcoguvfwctqmphenbkq\n" +
                    "qriiafyzloguvxwctqmpheebkd\n" +
                    "srijpfyzloguvxlctqmphenokd\n" +
                    "srijzfyzlotuvxwcjqmphenbkd\n" +
                    "srinafyqloguvxwctfmphenbkd\n" +
                    "srijafyzlogjvxpltqmphenbkd\n" +
                    "srijafyzlotuvxwutqmphenbtd\n" +
                    "sridafyzloguvxwctqmpyenokd\n" +
                    "srxjafyzqogyvxwctqmphenbkd\n" +
                    "ssijafyzzoguvxwctqmphenbad\n" +
                    "srijafrzloguvxwctqmphekpkd\n" +
                    "srijafyzlfgrvxactqmphenbkd\n" +
                    "srijafyzroguvxwttqmphekbkd\n" +
                    "srijefyzloguvxwctqmpqenbrd\n" +
                    "srijefycloguvxwctqmchenbkd\n" +
                    "srzjafyzloguvxwcqqmphanbkd\n" +
                    "srijauyzlhguvxwctqmphenbgd\n" +
                    "srijafyzloguvmwvnqmphenbkd\n" +
                    "srihafyzloguvlwotqmphenbkd\n" +
                    "srigafyzloguvxwctqmphennsd\n" +
                    "sriuafzzloguvxwcuqmphenbkd\n" +
                    "srijavuzllguvxwctqmphenbkd\n" +
                    "srijafjzloguvlnctqmphenbkd\n" +
                    "lrirafyzloguvxwctqmphenbld\n" +
                    "soijarxzloguvxwctqmphenbkd\n" +
                    "srijapyzlnguvxwctqmdhenbkd\n" +
                    "srijafyzkogujxmctqmphenbkd\n" +
                    "srijafuzloguvxwcsqvphenbkd\n" +
                    "srijagyzzoguvxwctqmpvenbkd\n" +
                    "srijafyzlovuvxwctqmrhenbxd\n" +
                    "srijafyzqoguvxwctwmpienbkd\n" +
                    "sxijafyzloguvxwutqmphenlkd\n" +
                    "srijafyzlhgzvxwctqmphqnbkd\n" +
                    "srijajyzloguvxwcbwmphenbkd\n" +
                    "srijazyzloguvxwhtqmphenbkx\n" +
                    "srgjafyzloguvvwctqmphdnbkd\n" +
                    "rrivafyzloguvxjctqmphenbkd\n" +
                    "srijifyzdoguvxwctqmphenbka\n" +
                    "hrijafyzloguvxectqmpheybkd").let { System.out.println("In $it: Out: ${solvePuzzle2(it)}") }
        }


        fun solvePuzzle1(input: String): String {
            val lines = input.split("\n").toList()
            var twoTimesCount = 0
            var threeTimesCount = 0
            lines.map { it.toCharArray() }.forEach { line ->
                for (i in 0 until line.size) {
                    if (line.count { line[i] == it } == 2) {
                        twoTimesCount++
                        break
                    }
                }

                for (i in 0 until line.size) {
                    if (line.count { line[i] == it } == 3) {
                        threeTimesCount++
                        break
                    }
                }
            }
            return (twoTimesCount * threeTimesCount).toString()
        }

        fun solvePuzzle2(input: String): String {
            val lines = input.split("\n").map { it.toCharArray() }.toList()
            for(i in 0 until lines.size){
                for (j in i + 1 until  lines.size){
                    var diff = 0
                    var lastDiffIndex = -1
                    for(q in 0 until lines[i].size){
                        if(lines[i][q] != lines[j][q]){
                            diff++
                            lastDiffIndex = q
                        }
                    }
                    if(diff == 1){
                        return lines[i].filterIndexed{index, _ -> index != lastDiffIndex}.joinToString("")
                    }
                }
            }
            return ""
        }
    }
}