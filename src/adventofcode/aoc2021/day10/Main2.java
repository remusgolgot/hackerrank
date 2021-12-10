package adventofcode.aoc2021.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Main2 {

    public static void main(String[] args) {
        String s = "{([[[(<<[{[[[[(){}][()]][({}())]]]<{((<>[]){[]<>})({()()}(<>[]))}<{{{}()}{[]()}}>>})[<(<[[<><>][{}{\n" +
                "([(<(((<[({{({(){}}<{}()>)((<>{})[{}<>})}}[{[(<>())[[]]]{{[][]}(<><>)}}{<<{}()>([]())>([<>][{}])}])](<[{[\n" +
                "{{[[<[<(<<<{((<>[])([]<>))(<{}><()[]>)}[(((){}){<>[]})<{(){}}<<>[]>>]>{[{{<>{}}<()<>>}<<<>[]>([]<>)>][\n" +
                "<[{<(({([[([({{}[]}{<><>})<<[]{}>>]<<<{}{}>((){})><{{}()}<{}[]>>>)](([<([]{})<{}<>>>(<[][]>{()()})\n" +
                "{{<(([<[[{<{({{}<>}({}()))<[<>[]](<>[])>}><[(((){})){[()]<<>[]>}][{{<><>}(<>{})}<<()[]>({}())>]>}<[{[(()<>)\n" +
                "[<{{{({{[<([<{<><>}{<>{}}><<[][]>[{}<>]>]({<[]{}>[[]{}]}{([]())([][])})){<{[[][]]([]())}>([[[\n" +
                "{[<[<<([[<(<<<<>>({})>><({(){}}(<>{}))[{()()}(()[])]>}[<({[]})<[()[]](<>{})>>[<({}{})[()<>]><{(){}}>]]>\n" +
                "[(<({{<[{<(<((<><>)<[]<>>)({<><>}<<>()>)><<<()<>>[()()]>{<<>{}>[()<>]}>){{[([]{})<<><>>]([<\n" +
                "<<{{<{<{([{(<{<><>}>((()[])<<>{}>))({<{}>}<[[]()][<><>]>)}<{([[]()]{<>{}})}{(<<>()>{<>{}})[{<><>}{<><>}]}>]\n" +
                "{(<{<({{([[{<({})[()()]><[{}<>][{}[]]>}<<<[]{}>[<>()]>({{}{}}[{}[]])>]<({[[][]]({}())}[(()[]](<\n" +
                "<[<{[<<[(((<([()()]<()()>]([()[]][{}{}])>)[[[{<>}[<>[]]]][(<()()><<>>)<<{}{}>{<>}>]])([(<({}<>)[()()]>\n" +
                "(<<{{([<[<[<[{[]()}[{}<>]]<(<>[])[{}]>><[{()[]}[()[]]]<([]<>)(()())>>]{{{{()<>}{()()}}[(<><\n" +
                "<[([(<[[[(<[(<{}()>{()()})<<()[]>{(){}}>]><<({[]<>}<{}{}>)[{[][]}{[]{}}]>{<{()()}(()[])>{[<><>\n" +
                "[[([[({{{[[(<<()()>[<>[]]>)<[<<>{}>]([[]()][(){}])>]<(<{()<>}[[][]]>(([]{})[[]()]))[<({}[])\n" +
                "<<{[({<[[[[[{<<>()>{<>{}}}[<()()>]](<<{}<>>{{}<>]><[{}<>]<()<>>>)][((<[]{}>[[]])<{{}()}>)[((<>{}))<<<>{}>(\n" +
                "[[<[[<<(({{<({[]<>}([][]))>{([[]()]{{}<>}){[[]{}][()<>]}}}({{({}()}[[][]]}(((){}){<>})}(<[{}<>]{()()}>\n" +
                "{[{<[[(({<({[{()[]}[[][]]]}(({<><>}<{}[]>)))>}{[{(<{[]{}}{{}[]}>{<<><>>})}<{{[[][]]{<>()>}}<{\n" +
                "{[({<{<{[[([[<()<>}{[]<>}][<<>[]>([])]])]([({{[]()}({}())}([<>()](<><>)))])]{{<[<<[]<>>(()())>(<<>()>{<>\n" +
                "({([<({((<({<<()<>>[(){}]>[(<>{}){<>[]}]}){([{{}[]}])([({}()){<><>}]{[<><>]([]())))}><<[([{}[]])](\n" +
                "<{[{<{<<[<<<[(()<>){[][]}]([()<>]({}{}))>{(<{}{}>[<>{}])[{{}()}[(){}]]}><({<[]<>>[<>{}]}{([]<>)<[]{})})<([{}(\n" +
                "<[<<(({<[{{(<[[]<>]<<>()>>([{}<>]{[]()}))}{<(([]<>)<()<>>)[({}[])<[]{}>]><<<{}[]>{{}<>}>({<>[]}[(){}])>}}<(\n" +
                "[[[[[[(((<{<{(()())<<>{}>}>(<[<><>]({}[])})}{{<[()<>]<[]{}>>[{{}<>}[[]()]]}({<<>[]>}[<{}<>\n" +
                "[(({{<{[<[[(<(()())<<>()>>[<<><>><()()>])(<[{}()]><{[]()}<{}{}>>)][<[({}())<{}<>>][({}[])(()[])]>(((\n" +
                "(([<({{<{{[<<{[]()>(<>{})>[[{}]{{}{}}]>{<<[]{}>>[([][])[<><>]]}]<<[<<>[]>({}<>)]({<>[]}<{}{}>)>[{<{}<>>{[]()}\n" +
                "{(<<[{<<{({(<(<>{})(()())><(<>[]){[]<>}>){[(<>[]){[]()}]{[<>()][{}<>]]}}{([[{}()]]((<><>)))[([{}()]([]()))\n" +
                "[{({[[{{[<<{{[{}<>][<>]}([(){}]{<><>})}><(<[()[]][{}{}]><{[]{}}({})>)(<({}[])<()()>>{<{}{}>{[\n" +
                "([(({{<[<(([({{}<>}[[][]])<({}[]){{}()}>]{[[{}[]]][((){})]})<[{{{}<>}([]{})}{{[]<>}}]>)[{{<([]())({})>\n" +
                "<{{{<<(<{<(<{{<>()}}{({}<>)}>)>}((<{[<{}{}>([]<>)]<<[]()>[{}()]>}<{[<><>]<[]{}>}{{(){}}[[]()]}>>[({(()<>)<{}\n" +
                "((<[{<<{{{([[[[][]](<>[])]]{<({}[])([][])]<{{}{}}{()[]}>})}[[{<{<>[]}{<>{}}>}]]}{<[[((()<>)<()[]>){<()>({}[]\n" +
                "({[[{<{{<<([(<[]<>>{<>{}})<{()[]}(<>())>])<[{[<><>]({}{})}][<({}())><{()<>}(<>())>]>>>{{(([\n" +
                "<((<<(<(<<{{{[{}]<()<>>}{[[]<>]{<><>}}}<[[<>{}]{()()}][<()()>{[][]}]>}{[{[{}()][{}{}]}(<{}()>[{}<>])]}>>\n" +
                "(([<({<[[(<(<([]())({}<>)>([{}()]{<>[]}))<{{{}{}}([]{})}<({}{})<{}<>>>>>[{{<<>[]><<>{}>}({{}<>})}{({[]()}(()<\n" +
                "{[((<({[([(([{(){}}{{}()}][<[]()>{(){}}])[[[{}[]]{{}<>}]<{[]{}}>]){(<[<><>][[][]]>)[{{<>{}}((){})>[([]())[\n" +
                "[[<[<{({[({{([()<>]<()()>)}[<<[]()>>]}((({()()})(<{}>[<>()]))[(({}{}){[]}>(([][])<()()>)]))[{<[<[\n" +
                "[<<([((<<(([[({}{})((){})]<({}[])[{}{}]>]<{{<><>}<[]>}>)[<{{<>()}<()()>}{<<>{}>[[]()]}>[(([][])\n" +
                "{(<(<[[((<([{<[][]><()>}[[<>{}]]]<<((){}){[]())>[<()<>>(<>[])]>)<{<[[]][<>{}]>({<><>}[<>()])}({{{\n" +
                "(<{({({<[[((<<{}<>><<>()>>({{}}<<>[])))[<<{}[]><<><>>>{{[]{}}(())}])[<[([]())<<>{}>]>[[[<><\n" +
                "<[{[[{[({{{([<()()><<>[]>])([([]{})(<>())]{([]<>){()[]}})}<{({{}<>}{[]})([()()])}<[[[]<>><<>{}>]<[()()]<(){}\n" +
                "<<[<[{{({(({(<[]()>({}{}))([{}[]][[]()])}{{(()[]){<><>}}([<><>]{{}})})[{[[{}{}]({}())]{<<>{}\n" +
                "{{{[[[[[<(<<{(()[]){()<>}}<<(){}>(()())>>({(()[])}<<[][]>[<>()]>)>)[{[<(<>())>{<(){}>[{}{}]}]\n" +
                "(([<[[{(([([<<<>{}>((){})>[({}{})<()<>>]]([((){})({}())]])[[{[()()][()[]]}([[][]](<>()))][<{()<\n" +
                "([<{{[[{<{[({<()[]>{[]<>}}([()<>]<[]()>))]}>{[<({({}{})})>{{<[<>{}][()<>]>({[]}{[]<>})}{<[[]{}](<>())\n" +
                "[{<<<{{((<{<<{[]()}<<>{}>>{((){}}{()()}}>}{[((()<>){<>})]({{()()}{(){}}}(<<>()>))}><[<{<{}><(\n" +
                "(((<<<<{((((<{<>[]}{<>()}>)(((<>{})(<><>))))))}><<{<(<<<[]{}><[]>><{[]()}{[]())>>{{<{}<>>}{{\n" +
                "{{[{<(({[[[<[[(){}]]><<[{}{}]({}())>{{[][]}[()()]}>]<{<[<>{}][<>{}]>[(()[])<()[]>]}[{<{}<>>({\n" +
                "{[{{[<[(((([{{{}{}}}({<>{}}[[][]])]){[<([]<>)([][])><{()<>}([]())>](<({}<>)<()>>(<()[]>{{}()}))\n" +
                "{{[(<<[<{<{[[<<><>>[()()]]]<(([]<>))<[[]{}]<[]>>>}>}>{{[<<<[()()]({}())>{<{}()>(<>[])}>([[(){}]<{}[]>]({(\n" +
                "[[[<<(<[{<[[<{<>[]}{{}[]}>]{({<>{}}[<>]]<({}{})[<><>]>}]((([{}{}][{}<>]))[({<>()}(<>{}))])\n" +
                "{{((<<[({<<<{[(){}]({}())}([<>{}]<(){}>)>([(()<>)<{}[]>]<<[]{}><<>{}>>)>[[<{<>}((){})>[{()[]}<{}<>>]](\n" +
                "((<<<<(<[{((<[[]{}](<><>)>{(()<>){()[]}}))}{<({(()())[(){}]}[[[]<>]<{}<>>])<([()[]])[{{}{}}{<><>}]>]}][<[{{\n" +
                "[[({<{{([([<{<<>()><()()>}>((<{}<>>{<>{}})[(()<>)[{}[]]])])[{{(([]())[<><>])({<>[]}(<>{}))}[[<[]><<>[]>]({[\n" +
                "[[(<(<[[(<{(({<>()}(<>[])){<<>[]>{()}}){({<>()}((){}))<<{}[]>[<><>]>}}{({<<>[]>[{}<>]})[[{(\n" +
                "({[<({<{<(<({([]<>){{}[]}}<({}{})[{}{}]>){{([]<>){(){}}}(<[]<>>{<><>})}><[[(<>())]{([]<>)}\n" +
                "{{[[[<{<(<{[(({}[])({}{}))<<()<>>>][<[{}{}]{()[]}>(<[]<>>{<><>})]}<{[<<>()>]<([]())<<>()>>}>>)\n" +
                "(({{{<(([[<(<((){})><[[]{}][{}()]>)<{[{}{}]}<(<>[])>>>]])({{{<[<()<>>{()<>}]>([<<>{}>(()())]<<<>{}>{[]}\n" +
                "{{[[[[({<{[{<[()<>]<<><>>>({<>()}<<>{}>)}(({[]<>}([]))<<<><>>[[]<>]>)]<(<<()()>([]<>>>{({}{}){()()}})[[[<><\n" +
                "[<<{[[([(<{[{{[]()}{[][]}}{{[]()}{(){}}}]{{[{}<>]([]<>)}(<{}()><<>()>)}}<[<{{}<>}<[]<>>><[[]{}]([]{})>][{({\n" +
                "[[[<<(({(<<((<{}<>><(){}>)<([]<>)(()[])>)[((<>())<(){}>){{(){}}{<>[]}}]><<({(){}}{{}<>})>{[<[]{}><[]{}>](<()\n" +
                "({({{<[<<<[{{<{}[]>[(){}]}{(<>[]){{}}}}]{[[{[][]}{[]<>}]{(())([]{})}](<({}{})(()())><{<>()}>)}>>>]([({\n" +
                "<[(((<{<{[<{{{[]<>}{<><>}}{([][])[<>()]}][[[()<>]<{}[]>](({}<>)<[]()>)]>][(<{{{}[]}((){})}{{<>{}}({}()\n" +
                "{<{[({<<(<[<([<>]<[]()>)<({}()){()[]}>>([{()[]}[{}{}]])]>(([{[[]<>][[]<>]}[[<>()]<<>()>]>(((()[]){<>{}}){\n" +
                "<(({<{[(<([(<{[]{}}{[]()}>){{(<><>){[][]}}[{{}()}<[][]>]}])>(<{{{[()<>][()<>]}({{}[]}[[]{}])}}(<{{[]{}\n" +
                "{<[<[{{<<<([[[{}[]]{<>[]}](<<>[]>[()()])][(([]<>)]])>([[<{()}{<><>}>[(<>[])<{}()>]]]{<{<[]{}>[[]\n" +
                "([{[[<<<<{<[({[]{}}(<>()))[<{}<>>[[]{}]]](([{}<>]){{[]()}[<>[]]})>[{(([][])[{}[]]){(<><>)(<>[])}}(<{()<>}\n" +
                "<<(([<{[((<[(<(){}>[<><>])[<<>[]><()())]]{<{()[]}(()<>)>}>)[<<{<(){}><{}()>}{[{}<>]<(){}>}>><[<{<>[]}{[][\n" +
                "(<<[<{<(<<({<([]{}){[][]}>{<[][]>{<>{}}}}[(([]())<<><>>){<{}><<>[]>}])(<{[<>[]]}>{<[{}<>}{<>{}}><{<><>}{()[\n" +
                "[[[[{<[{[<(<[(()())<{}[]>][(()())<()>]><{{()()}[<>{}]}[({}()><[]<>>]>)<{{[[]<>]<[][]>}{[<><>]\n" +
                "{{<(({{<{(<([<[][]>(()[])])<<{<><>}<[]<>>><(<>{})>>><{[[[]{}]{<>[]}](<<>{}>(<>[]))}[[<()<>><()<>>]<{()<\n" +
                "<[({<[[[(<{[(<{}()><(){}>)(<[][]><<>{}>)]<<{{}[]}<{}()>>[(<>())<<><>>]>>{<[([]{})[(){}]]{[(\n" +
                "[{<<<({<[[[<{{<>{}}<()<>>}{[[]()][(){}]}>{(({}[])<[]{}>){<()>(()[])}}]<{<({}<>)<{}[]>>[<{}{}><<><>\n" +
                "{<<[(<<<(<[<<{<><>}>({<>()}(()[]))>[([<><>][[]{}])(([]<>))]]>)>[({[<([[][]]({}))<((){}){[]<>}]>[[\n" +
                "([<{<(<<{({<{<(){}>({}<>)}}{<[{}()][()<>]>{<[]<>>{<>[]}}}}<({[{}{}](<>[])}(<[][]>[{}<>]))<\n" +
                "{([<<<<{[<<[[<{}{}><[][]>]<{{}()}[()[]]>]<[(()[]){<>[]}][[[]()][()<>>]>>(<[{<>()}(<><>)]{<<>{}>{\n" +
                "[[([(([[[<[((<()()>)([[]{}]<[]()>))]><{{[[[]{}]([]{})][(()<>)<{}<>>]}([{()<>}]{[<>()][{}[]]})}\n" +
                "<<{<[<<<({{(<<[]>([])>{<{}<>><<><>>}){<<()<>><()<>>><(<>[])<{}<>>}}}{([{[]<>}{<>{}}](<()()>[{}{}]))<{<[]>\n" +
                "[{{(([{[<{<{{<<><>><{}[]>}}{<(<>{}){[]}>[([]{})[[]{}]]}>(({[{}]<()[]>}))}><<[{(<{}[]><[][]>)\n" +
                "[[[<[<[{{[<[{([]())[()[]]}{<{}<>>[()[]]}]<<{[][]}<()[]>>(<{}<>>{[]{}})>>{<<<{}()>><([]<>)[<>()]>>{{(\n" +
                "{{{([{({[((((([][])[[]()])[(<><>)[()[]]])[[[<>[]]{{}<>}]<[{}[]]([][])>]){[[[[][]]<()<>>](<{}<>><{}{}>\n" +
                "<<<[({{(<((<<{{}()]<()>>(<(){}><<>{}>)>(<{<>()}<[][]>><{<><>}{[]()}>))[(<([][])[<><>]>(<()()>{{}\n" +
                "<[(([[(([[({[[[]()]{()()}](<<>{}>)}){<{{<>[]}{{}{}}}{<[]()>[{}{}]}][(<()[]>[<>[]])((<>{}))]}]{[<<<<>\n" +
                "({{[{<[{([[({[(){}]}[{[]{}}<(){}>])<<({})[[]()]>>]<(({(){}}<[]>)<[<>{}}(<>())>)>])}<<<<[[[[]<>][{}()]]\n" +
                "{{{[[([<{({{{<(){}><{}()>}([()()]<<>[]>)}<<[<>()]{{}<>}><<<><>>>>})([(<(()[])({}<>)>([{}<>](<>[]))){(<<>>\n" +
                "<([([[<{{({{[[<>[]]({}[])]}(<({}())><[<>{}]>)}{[(<{}[]>(<>[]))([[]{}]{[]})]({([][])(<>())})}\n" +
                "[({({{[{<{{(([{}]){<{}[]>([][])})({[[][]]<<>[]>}[<()<>><[]>])}<<<<{}{}>{[]()}>({[][]}[()()])>({([][])[<>{}]}[\n" +
                "({<{(<([<[{<{<<>[]>({}{}>}([()<>]<[]<>>)>({{(){}}<<><>>}[({}{})])}]><<[(<<<>{}>([]())>)[[<[]<>>(\n" +
                "<[{<{<<<({[([({}<>){()()}][<()()>(<><>)]){<{()[]}<<>[]>>{{{}()}[<>[]]}}](((<[]()>{<>()})(({}<>)([]{})))({(\n" +
                "<<{<[[[<[<[[({()()}({}[]))[<()()>[()<>]]]]>][{[<<({}<>)[[][]]>{{{}[]}<()[]>)>]<{{[()[]][[]()]}}{<[\n" +
                "<{<{({({[{<{[{()<>}]<<<><>><[]<>>>}[{<[]><(){}>}<{[]{}}(()<>)>]><{<{{}()}{(){}}>{<()<>>{[]()}}}((([]<>)<<>\n" +
                "{(({[([(((<<([()()]<<>[]>)[<<>()>(<>{})]>[<<<><>><()>>]>[((<()()>((){})))[[<()<>><()()>)({{}[]}\n" +
                "<[<[<{<[{[[([[()()]<{}<>>]){[[{}[]][<>()]]{[[]{}][()<>]}}]]<[{((<>())[[][]]>}([[()<>]<[][]>])](({[\n" +
                "((<<[[{<({[([{<><>}[<>{}]]){(([]{}){(){}})}](<({{}()}<()<>>)({[]()}[[][]))>{{{{}()}[[][]]}<(<>{}){<>[]}>}\n" +
                "<{{{[([({{[(<<[]<>>[{}<>]><<[]{}>(())>)<[[<>{}]<{}<>>]<{()}<{}{}>>>]}{{[<(<>{})<[]()>><[(){}]>][{([]())}[<\n" +
                "[{<[<(<<{({[[<[]<>><()()>]([()()]<<>{}>)]}{(<{[]()}([]<>)><{()[]}>){<<[]()><{}<>>>({()}<<>[]>)}})}{\n" +
                "[{(({[{[{(<[(<[]{}>(<><>))]<[{()}({}())]>><<[({}[]){<><>}](<[][]>[()[]])>[[([][])([]<>)](([]{}])]>)}]<[<[\n" +
                "<({[([(<(((({(<>())<{}[]>}[(<>[]){()[]}]))){[([([]{})(<>()]]([()()][{}<>]))<<{{}}(<>[])>{{()\n" +
                "((({{({<{<({[(<>[]){()()}]([{}[]][{}{}])})(<<{[]{}}>{<[]<>>{()[]}}>)><{{{{{}()}}{[{}[]]<<>[]>}\n" +
                "(<[<<[([[{<[<({}()){()}>(<(){}><<><>>)]>{{([()[]]<<>()>)(<[]<>>)}{[{<>[]}[<>()]](<<>()><()[]\n" +
                "((<<({<((<(<({<><>}({}<>))({{}{}}(<>()))>((([]()){(){}})[(()())(()())]>)>){{<([{<>()}(<><>)]<{<>()\n" +
                "(({(<[({({([<{[]()}<<>()>>{(()<>)[[]()]}]{{[()()]((){})}{[{}<>]{(){}}}})}<<<(<()()>[{}{}])<([]{}){{}[]\n" +
                "{({[[{([[[<((<(){}>{{}()})[(<>{})])([[<>[]]<()[]>][(()())<[]{}>]>>]((({[{}<>]<{}{}>})({<{}[]>}{(<>\n" +
                "[[(({<<{[(<<(([][]){{}<>}){[{}[]]({}[])}>(({<><>})<(()<>)[<>()]})>{({[[]{}]((){})}[([]())])})(({([[][]]\n" +
                "<[<{[<<<{[{(<[<>[]]>{{(){}}[[]()]})}[<{[{}{}]}><(<{}()]{{}{}}){({}[])}>]]}>[({{(<({}[])({}<>)>[{{}<>}])}{\n";


        String[] ss = s.split("\n");
        long sum = 0;
        List<Long> list = new ArrayList<>();
        for (String value : ss) {
            Stack<Character> stack = getValid(value);
            if (stack != null) {
                sum = 0;
                while (!stack.isEmpty()) {
                    Character c = stack.pop();
                    if (c == '(') {
                        sum = sum * 5 + 1;
                    }
                    if (c == '[') {
                        sum = sum * 5 + 2;
                    }
                    if (c == '{') {
                        sum = sum * 5 + 3;
                    }
                    if (c == '<') {
                        sum = sum * 5 + 4;
                    }
                }
                list.add(sum);
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        System.out.println(list.get(list.size()/2));
    }

    private static Stack<Character> getValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (stack.size() > 0 && stack.peek() == '(') {
                    stack.pop();
                } else return null;
            } else if (s.charAt(i) == ']') {
                if (stack.size() > 0 && stack.peek() == '[') {
                    stack.pop();
                } else return null;
            } else if (s.charAt(i) == '}') {
                if (stack.size() > 0 && stack.peek() == '{') {
                    stack.pop();
                } else return null;
            } else if (s.charAt(i) == '>') {
                if (stack.size() > 0 && stack.peek() == '<') {
                    stack.pop();
                } else return null;
            } else stack.push(s.charAt(i));
        }

        return stack;

    }
}