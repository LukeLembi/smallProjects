package my.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Katakana extends Hiragana {
    Map<String, String> katakana = new HashMap<String, String>();
    protected void naplneni(){
        // GODŽÚON
        // samohlásky
        katakana.put("a", "ア"); katakana.put("i", "イ"); katakana.put("u", "ウ"); katakana.put("e", "エ"); katakana.put("o", "オ");
        // k-
        katakana.put("ka", "カ"); katakana.put("ki", "キ"); katakana.put("ku", "ク"); katakana.put("ke", "ケ"); katakana.put("ko", "コ");
        // s-
        katakana.put("sa", "サ"); katakana.put("ši", "シ"); katakana.put("su", "ス"); katakana.put("se", "セ"); katakana.put("so", "ソ");
        // t-
        katakana.put("ta", "タ"); katakana.put("či", "チ"); katakana.put("cu", "ツ"); katakana.put("te", "テ"); katakana.put("to", "ト");
        // n-
        katakana.put("na", "ナ");
        katakana.put("ni", "ニ");
        katakana.put("nu", "ヌ");
        katakana.put("ne", "ネ");
        katakana.put("no", "ノ");
        // h-
        katakana.put("ha", "ハ");
        katakana.put("hi", "ヒ");
        katakana.put("fu", "フ");
        katakana.put("he", "ヘ");
        katakana.put("ho", "ホ");
        // m-
        katakana.put("ma", "マ");
        katakana.put("mi", "ミ");
        katakana.put("mu", "ム");
        katakana.put("me", "メ");
        katakana.put("mo", "モ");
        // y-
        katakana.put("ja", "ヤ");
        katakana.put("ju", "ユ");
        katakana.put("jo", "ヨ");
        // r-
        katakana.put("ra", "ラ");
        katakana.put("ri", "リ");
        katakana.put("ru", "ル");
        katakana.put("re", "レ");
        katakana.put("ro", "ロ");
        // w- a n
        katakana.put("wa", "ワ");
        katakana.put("w(i)", "ヰ");
        katakana.put("w(e)", "ヱ");
        katakana.put("w(o)", "ヲ");
        katakana.put("n", "ン");

        // DAKUON
        // g-
        katakana.put("ga", "ガ");
        katakana.put("gi", "ギ");
        katakana.put("gu", "グ");
        katakana.put("ge", "ゲ");
        katakana.put("go", "ゴ");
        // z-
        katakana.put("za", "ザ");
        katakana.put("dži", "ジ");
        katakana.put("zu", "ズ");
        katakana.put("ze", "ゼ");
        katakana.put("zo", "ゾ");
        // d-
        katakana.put("da", "ダ");
        katakana.put("dži-", "ヂ");
        katakana.put("d(zu)", "ヅ");
        katakana.put("de", "デ");
        katakana.put("do", "ド");
        // b-
        katakana.put("ba", "バ");
        katakana.put("bi", "ビ");
        katakana.put("bu", "ブ");
        katakana.put("be", "ベ");
        katakana.put("bo", "ボ");
        // p-
        katakana.put("pa", "パ");
        katakana.put("pi", "ピ");
        katakana.put("pu", "プ");
        katakana.put("pe", "ペ");
        katakana.put("po", "ポ");

        // JÓ'ON
        // k-
        katakana.put("kja", "キャ");
        katakana.put("kju", "キュ");
        katakana.put("kjo", "キョ");
        // š-
        katakana.put("ša", "シャ");
        katakana.put("šu", "シュ");
        katakana.put("šo", "ショ");
        // č-
        katakana.put("ča", "チャ");
        katakana.put("ču", "チュ");
        katakana.put("čo", "チョ");
        // n-
        katakana.put("nja", "ニャ");
        katakana.put("nju", "ニュ");
        katakana.put("njo", "ニょ");
        // h-
        katakana.put("hja", "ヒャ");
        katakana.put("hju", "ヒュ");
        katakana.put("hjo", "ヒょ");
        // m-
        katakana.put("mja", "ミャ");
        katakana.put("mju", "ミュ");
        katakana.put("mjo", "ミョ");
        // r-
        katakana.put("rja", "リャ");
        katakana.put("rju", "リュ");
        katakana.put("rjo", "リョ");

        //Dakujó'on
        // g-
        katakana.put("gja", "ギャ");
        katakana.put("gju", "ギュ");
        katakana.put("gjo", "ギョ");
        // d-
        katakana.put("dža", "ジャ");
        katakana.put("džu", "ジュ");
        katakana.put("džo", "ジョ");
        katakana.put("dža-", "ヂャ");
        katakana.put("džu-", "ヂュ");
        katakana.put("džo-", "ヂョ");
        // b-
        katakana.put("bja", "ビャ");
        katakana.put("bju", "ビュ");
        katakana.put("bjo", "ビョ");
        // p-
        katakana.put("pja", "ピャ");
        katakana.put("pju", "ピュ");
        katakana.put("pjo", "ピョ");

        // Dlouhé móry
        katakana.put("á", "アー");
        katakana.put("ii", "イー");
        katakana.put("í", "イー");
        katakana.put("ú", "ウー");
        katakana.put("ei", "エイ");
        katakana.put("é", "エー");
        katakana.put("ó", "オー  オウ  オー");
        katakana.put("kú", "クウ  クー");
        katakana.put("kó", "コウ  コー");
//        katakana.put("kó-", "こお");
        katakana.put("sá", "サー");
        katakana.put("ší", "シー");
        katakana.put("šú", "シュウ  シュー");
        katakana.put("šó", "ショウ");
        katakana.put("sú", "スウ");
        katakana.put("sei", "セイ");
        katakana.put("sé", "セー");
        katakana.put("só", "ソウ  ソー");
        katakana.put("čú", "チュウ  チュー");
        katakana.put("čó", "チョウ");
        katakana.put("cú", "ツウ");
        katakana.put("tó", "トウ  トー");
//        katakana.put("tó-", "とお");
    }

    protected void testKatakany() {
        List<String> klice = new ArrayList<String>(katakana.keySet());
        System.out.println("Z kolika znaků se chcete testovat?");
        test = Integer.parseInt(scanner.nextLine());
        for(int i = 1; i <=test;i++) {
            nahodneKlice = klice.get(rand.nextInt(klice.size()));
            String hodnota = katakana.get(nahodneKlice);
            System.out.println(hodnota);
            System.out.println("Zadej českou transkripci:");
            String odpoved = scanner.nextLine();
            if (hodnota.equals(katakana.get(odpoved))) {
                System.out.println("Správně");
                spravne++;
            } else System.out.println("Špatně");
        }
        System.out.println("Uhodl jsi správně: " +spravne +"/" +test);
    }
    protected void vypis(){
        for(Map.Entry<String, String> znak : katakana.entrySet()){
            String cesky = znak.getKey();
            String japonsky = znak.getValue();
            System.out.printf("Transkripce:\t%s\t\t\tKatakana:\t%s \n", cesky,japonsky); //formátování?
        }
    }
}
// doplnit výpis specifických znaků, výpis všech znaků