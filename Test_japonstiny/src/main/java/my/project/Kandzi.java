package my.project;


import java.util.Scanner;
import java.util.Random;

public class Kandzi {
    public Slovo[] poleKandzi = new Slovo[105];
    int i;
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    int spravne;

    // překlad a česká transkripce může být v současnosti nepřesná - převzato z anglické stránky
    public void naplneni(){
        // testovací
        poleKandzi[0] = new Slovo("水", "voda", "mizu", "sui");//lidé a věci
        poleKandzi[1] = new Slovo("道","cesta, ulice", "miči", "dó"); //místa a směr
        poleKandzi[2] = new Slovo("住", "bydlet", "sumu", "džú");
        poleKandzi[3] = new Slovo("所", "místo", "tokoro", "šó");
        //čísla
        poleKandzi[4] = new Slovo("一", "jedna", "hito", "iči, itsu");
        poleKandzi[5] = new Slovo("二", "dva", "futa", "ni");
        poleKandzi[6] = new Slovo("三", "tři", "mit, mi", "san");
        poleKandzi[7] = new Slovo("四", "čtyři", "yo, yon", "ši");
        poleKandzi[8] = new Slovo("五", "pět", "itsu", "go");
        poleKandzi[9] = new Slovo("六", "šest", "mut, mu", "roku");
        poleKandzi[10] = new Slovo("七", "sedm", "nana", "šiči");
        poleKandzi[11] = new Slovo("八", "osm", "yat, ya", "hači");
        poleKandzi[12] = new Slovo("九", "devět", "kokono", "kjů, ku");
        poleKandzi[13] = new Slovo("十", "deset", "tou, to", "džů, dži");
        poleKandzi[14] = new Slovo("百", "sto", "", "hjaku");
        poleKandzi[15] = new Slovo("千", "tisíc", "či", "sen");
        poleKandzi[16] = new Slovo("万", "deset tisíc", "", "man, ban");
        poleKandzi[17] = new Slovo("円", "jen, kruh", "maru", "en");
        //čas
        poleKandzi[18] = new Slovo("日", "den, slunce", "hi, ka", "niči, džicu");
        poleKandzi[19] = new Slovo("週", "týden", "", "šú");
        poleKandzi[20] = new Slovo("月", "měsíc", "cuki", "gecu, gacu");//kalendářní i planeta
        poleKandzi[21] = new Slovo("年", "rok", "toši", "nen");
        poleKandzi[22] = new Slovo("時", "čas, hodina", "toki", "dži");
        poleKandzi[23] = new Slovo("間", "časové okno, časové rozpětí", "aida", "kan, ken");
        poleKandzi[24] = new Slovo("分", "minuta, část, (po)rozumět, rozdělit", "wa", "bun, bu, fun");
        poleKandzi[25] = new Slovo("午", "poledne", "", "go");
        poleKandzi[26] = new Slovo("前", "před", "mae", "zen");
        poleKandzi[27] = new Slovo("後", "po, později, za", "ato", "go, kou");
        poleKandzi[28] = new Slovo("今", "nyní, teď", "ima", "kon, kin");
        poleKandzi[29] = new Slovo("先", "před, budoucnost, vpřed", "saki", "sen");
        poleKandzi[30] = new Slovo("来", "přijít", "ku", "rai");
        poleKandzi[31] = new Slovo("半", "půl, uprostřed", "naka", "han");
        poleKandzi[32] = new Slovo("毎", "vždy, každý", "", "mai");
        poleKandzi[33] = new Slovo("何", "co, který, kolik", "nan, nani", "ka");
        // lidé a věci
        poleKandzi[34] = new Slovo("人", "osoba", "hito", "džin, nin");
        poleKandzi[35] = new Slovo("男", "muž, chlapec", "otoko", "dan, nan");
        poleKandzi[36] = new Slovo("女", "žena, dívka", "onna, me", "džo, njo");
        poleKandzi[37] = new Slovo("子", "dítě", "ko", "ši, su");
        poleKandzi[38] = new Slovo("母", "matka", "haha", "bo");
        poleKandzi[39] = new Slovo("父", "otec", "čiči", "fu");
        poleKandzi[40] = new Slovo("友", "kamarád", "tomo", "jů");
        poleKandzi[41] = new Slovo("火", "oheň", "hi", "ka");
        poleKandzi[42] = new Slovo("木", "strom, dřevo", "ki, ko", "moku, boku");
        poleKandzi[43] = new Slovo("土", "země", "cuči", " do, to"); // planeta i živel
        poleKandzi[44] = new Slovo("金", "peníze, zlato", "kane", "kin, kon");
        poleKandzi[45] = new Slovo("本", "kniha, zdroj", "moto", "hon");
        poleKandzi[46] = new Slovo("川", "řeka", "kawa", "sen");
        poleKandzi[47] = new Slovo("花", "květina", "hana", "ka");
        poleKandzi[48] = new Slovo("気", "duše", "", "ki, ke");
        poleKandzi[49] = new Slovo("生", "život, žít, narodit se, růst", "i, u, ha", "sei, šou");
        poleKandzi[50] = new Slovo("魚", "ryba", "sakana", "gjo");
        poleKandzi[51] = new Slovo("天", "nebe, nebesa", "ame, ama", "ten");
        poleKandzi[52] = new Slovo("空", "obloha, prázdný", "sora, a", "ků");
        poleKandzi[53] = new Slovo("山", "hora", "jama", "san");
        poleKandzi[54] = new Slovo("雨", "déšť", "ame", "u");
        poleKandzi[55] = new Slovo("電", "elektřina", "", "den");
        poleKandzi[56]= new Slovo("車", "auto, vůz", "kuruma", "ša");
        poleKandzi[57] = new Slovo("語", "jazyk, slovo, povídat si", "kata", "go");
        poleKandzi[58] = new Slovo("耳", "ucho", "mimi", "dži");
        poleKandzi[59] = new Slovo("手", "ruka", "te", "šu");
        poleKandzi[60] = new Slovo("足", "jídlo, přidat", "aši, ta", "soku");
        poleKandzi[61] = new Slovo("目", "oko", "me", "moku");
        poleKandzi[62] = new Slovo("口", "ústa", "kuči", "kou, ku");
        poleKandzi[63] = new Slovo("名", "jméno", "na", "mei, mjou");
        // místa a směr
        poleKandzi[64] = new Slovo("店", "obchod", "mise", "ten");
        poleKandzi[65] = new Slovo("駅", "stanice", "", "eki");
        poleKandzi[66] = new Slovo("社", "svatyně, společnost", "jaširo", "ša");
        poleKandzi[67] = new Slovo("国", "země, stát", "kuni", "koku");
        poleKandzi[68] = new Slovo("外", "venku, venek, mimo", "soto, hazu, hoka", "gai, ge");
        poleKandzi[69] = new Slovo("学", "škola, učení", "mana", "gaku");
        poleKandzi[70] = new Slovo("校", "škola", "", "kou");
        poleKandzi[71] = new Slovo("上", "nahoře, nad", "ue, u, a", "šou, džou");
        poleKandzi[72] = new Slovo("下", "dole, pod", "ku, šita", "ka, ge");
        poleKandzi[73] = new Slovo("中", "prostředek, centrum, střed, uvnitř, mezi", "naka", "čů");
        poleKandzi[74] = new Slovo("北", "sever", "kita", "hoku");
        poleKandzi[75] = new Slovo("西", "západ", "niši", "sai, sei");
        poleKandzi[76] = new Slovo("東", "východ", "higaši", "tou");
        poleKandzi[77] = new Slovo("南", "jih", "minami", "nan");
        poleKandzi[78] = new Slovo("右", "vpravo, pravá", "migi", "jů");
        poleKandzi[79] = new Slovo("左", "vlevo, levá", "hidari", "sa");
        // slovesa
        poleKandzi[80] = new Slovo("見", "vidět, být viděn, ukázat", "mi", "ken");
        poleKandzi[81] = new Slovo("聞", "poslouchat, slyšet, zeptat se", "ki", "mon, bun");
        poleKandzi[82] = new Slovo("書", "psát", "ka", "šo");
        poleKandzi[83] = new Slovo("読", "číst", "yo", "doku");
        poleKandzi[84] = new Slovo("話", "mluvit, konverzace", "hanaši, hana", "wa");
        poleKandzi[85] = new Slovo("買", "koupit", "ka", "bai");
        poleKandzi[86] = new Slovo("行", "jít, provést, splnit", "i, okona", "kou");
        poleKandzi[87] = new Slovo("出", "jít ven, odejít", "de, da", "šucu");
        poleKandzi[88] = new Slovo("入", "vstoupit, vložit", "hai, i", "njů");
        poleKandzi[89] = new Slovo("休", "odpočívat, pauza, svátek, dovolená", "yasu", "kjů");
        poleKandzi[90] = new Slovo("食", "jíst, jídlo", "ta", "šoku");
        poleKandzi[91] = new Slovo("飲", "pít, nápoj", "no", "in");
        poleKandzi[92] = new Slovo("言", "mluvit, slovo", "i", "gen, gon");
        poleKandzi[93] = new Slovo("立", "stát", "ta", "ritsu");
        poleKandzi[94] = new Slovo("会", "společnost, potkat se, seznámit se", "a", "kai, e");
        // přídavná slova
        poleKandzi[95] = new Slovo("多", "hodně, mnoho", "ó", "ta");
        poleKandzi[96] = new Slovo("少", "málo, trochu", "suko, suku", "šou");
        poleKandzi[97] = new Slovo("古", "starý", "furu", "ko");
        poleKandzi[98] = new Slovo("新", "nový", "atara", "šin");
        poleKandzi[99] = new Slovo("大", "velký, hodně", "ó", "dai, tai");
        poleKandzi[100] = new Slovo("小", "malý", "čí, ko", "šou");
        poleKandzi[101] = new Slovo("安", "levný, bezpečnost, mír", "yasu", "an");
        poleKandzi[102] = new Slovo("高", "drahý, vysoký", "taka", "kou");
        poleKandzi[103] = new Slovo("長", "dlouhý, vůdce", "naga", "čou");
        poleKandzi[104] = new Slovo("白", "bílý", "širo", "haku, bjaku");


    }
    void vypis(){
        System.out.println("Znaky\t\tKun-jomi\t\t\t\t\t\tOn-jomi\t\t\t\t\t\tČesky");
        for(i=0;i< poleKandzi.length-1;i++) {
            System.out.println(poleKandzi[i]);
        }
    }
    void testKandzi_cesky(){
        System.out.println("Z kolika znaků se chcete testovat?");
        int test = Integer.parseInt(scanner.nextLine());
        for(int i = 1; i <=test;i++) {
            int index = rand.nextInt(poleKandzi.length-1);
            String hodnota = poleKandzi[index].znaky;
            System.out.println(hodnota);
            System.out.println("Zadej český překlad:");
            String odpoved = scanner.nextLine();
            if (odpoved.contains(poleKandzi[index].cesky)) {
                System.out.println("Správně");
                spravne++;
            } else System.out.println("Špatně");
        }
        System.out.println("Uhodl jsi správně: " +spravne +"/" +test);
    }


}
