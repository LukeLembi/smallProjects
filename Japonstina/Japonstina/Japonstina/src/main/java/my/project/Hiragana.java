package my.project;
// doplnit výpis specifických znaků, výpis všech znaků

import java.util.*;


public class Hiragana {
    Map<String, String> hiragana = new HashMap<String, String>();
    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);
    String nahodneKlice;
    int test;
    int spravne;
    int spatne;


    protected void naplneni(){
        // GODŽÚON
        // samohlásky
        hiragana.put("a", "あ"); hiragana.put("i", "い"); hiragana.put("u", "う"); hiragana.put("e", "え"); hiragana.put("o", "お");
        // k-
        hiragana.put("ka", "か"); hiragana.put("ki", "き"); hiragana.put("ku", "く"); hiragana.put("ke", "け"); hiragana.put("ko", "こ");
        // s-
        hiragana.put("sa", "さ"); hiragana.put("ši", "し"); hiragana.put("su", "す"); hiragana.put("se", "せ"); hiragana.put("so", "そ");
        // t-
        hiragana.put("ta", "た"); hiragana.put("či", "ち"); hiragana.put("cu", "つ"); hiragana.put("te", "て"); hiragana.put("to", "と");
        // n-
        hiragana.put("na", "な");
        hiragana.put("ni", "に");
        hiragana.put("nu", "ぬ");
        hiragana.put("ne", "ね");
        hiragana.put("no", "の");
        // h-
        hiragana.put("ha", "は");
        hiragana.put("hi", "ひ");
        hiragana.put("fu", "ふ");
        hiragana.put("he", "へ");
        hiragana.put("ho", "ほ");
        // m-
        hiragana.put("ma", "ま");
        hiragana.put("mi", "み");
        hiragana.put("mu", "む");
        hiragana.put("me", "め");
        hiragana.put("mo", "も");
        // y-
        hiragana.put("ja", "や");
        hiragana.put("ju", "ゆ");
        hiragana.put("jo", "よ");
        // r-
        hiragana.put("ra", "ら");
        hiragana.put("ri", "り");
        hiragana.put("ru", "る");
        hiragana.put("re", "れ");
        hiragana.put("ro", "ろ");
        // w- a n
        hiragana.put("wa", "わ");
        hiragana.put("w(i)", "ゐ");
        hiragana.put("w(e)", "ゑ");
        hiragana.put("w(o)", "を");
        hiragana.put("n", "ん");

        // DAKUON
        // g-
        hiragana.put("ga", "が");
        hiragana.put("gi", "ぎ");
        hiragana.put("gu", "ぐ");
        hiragana.put("ge", "げ");
        hiragana.put("go", "ご");
        // z-
        hiragana.put("za", "ざ");
        hiragana.put("dži", "じ");
        hiragana.put("zu", "ず");
        hiragana.put("ze", "ぜ");
        hiragana.put("zo", "ぞ");
        // d-
        hiragana.put("da", "だ");
        hiragana.put("dži-", "ぢ");
        hiragana.put("d(zu)", "づ");
        hiragana.put("de", "で");
        hiragana.put("do", "ど");
        // b-
        hiragana.put("ba", "ば");
        hiragana.put("bi", "び");
        hiragana.put("bu", "ぶ");
        hiragana.put("be", "べ");
        hiragana.put("bo", "ぼ");
        // p-
        hiragana.put("pa", "ぱ");
        hiragana.put("pi", "ぴ");
        hiragana.put("pu", "ぷ");
        hiragana.put("pe", "ぺ");
        hiragana.put("po", "ぽ");

        // JÓ'ON
        // k-
        hiragana.put("kja", "きゃ");
        hiragana.put("kju", "きゅ");
        hiragana.put("kjo", "きょ");
        // š-
        hiragana.put("ša", "しゃ");
        hiragana.put("šu", "しゅ");
        hiragana.put("šo", "しょ");
        // č-
        hiragana.put("ča", "ちゃ");
        hiragana.put("ču", "ちゅ");
        hiragana.put("čo", "ちょ");
        // n-
        hiragana.put("nja", "にゃ");
        hiragana.put("nju", "にゅ");
        hiragana.put("njo", "にょ");
        // h-
        hiragana.put("hja", "ひゃ");
        hiragana.put("hju", "ひゅ");
        hiragana.put("hjo", "ひょ");
        // m-
        hiragana.put("mja", "みゃ");
        hiragana.put("mju", "みゅ");
        hiragana.put("mjo", "みょ");
        // r-
        hiragana.put("rja", "りゃ");
        hiragana.put("rju", "りゅ");
        hiragana.put("rjo", "りょ");

        //Dakujó'on
        // g-
        hiragana.put("gja", "ぎゃ");
        hiragana.put("gju", "ぎゅ");
        hiragana.put("gjo", "ぎょ");
        // d-
        hiragana.put("dža", "じゃ");
        hiragana.put("džu", "じゅ");
        hiragana.put("džo", "じょ");
        hiragana.put("dža-", "ぢゃ");
        hiragana.put("džu-", "ぢゅ");
        hiragana.put("džo-", "ぢょ");
        // b-
        hiragana.put("bja", "びゃ");
        hiragana.put("bju", "びゅ");
        hiragana.put("bjo", "びょ");
        // p-
        hiragana.put("pja", "ぴゃ");
        hiragana.put("pju", "ぴゅ");
        hiragana.put("pjo", "ぴょ");

        // Dlouhé móry
        hiragana.put("á", "ああ");
        hiragana.put("ii", "いい");
        hiragana.put("í", "いい");
        hiragana.put("ú", "うう");
        hiragana.put("ei", "えい");
        hiragana.put("é", "ええ");
        hiragana.put("ó", "おお");
        hiragana.put("kú", "くう");
        hiragana.put("kó", "こう");
        hiragana.put("kó-", "こお");
        hiragana.put("sá", "さあ");
        hiragana.put("šii", "しい");
        hiragana.put("šú", "しゅう");
        hiragana.put("šó", "しょう");
        hiragana.put("sú", "すう");
        hiragana.put("sei", "せい");
        hiragana.put("só", "そう");
        hiragana.put("čú", "ちゅう");
        hiragana.put("čó", "ちょう");
        hiragana.put("cú", "つう");
        hiragana.put("tó", "とう");
        hiragana.put("tó-", "とお");
    }

    protected void vypis(){
        for(Map.Entry<String, String> znak : hiragana.entrySet()){
            String cesky = znak.getKey();
            String japonsky = znak.getValue();
            System.out.printf("Transkripce:\t%s\t\t\tHiragana:\t%s \n", cesky,japonsky); //formátování?
        }
    }

    protected void testHiragany() {
        List<String> klice = new ArrayList<String>(hiragana.keySet());
        System.out.println("Z kolika znaků se chcete testovat?");
        test = Integer.parseInt(scanner.nextLine());
        for(int i = 1; i <=test;i++) {
            nahodneKlice = klice.get(rand.nextInt(klice.size()));
            String hodnota = hiragana.get(nahodneKlice);
            System.out.println(hodnota);
            System.out.println("Zadej českou transkripci:");
            String odpoved = scanner.nextLine();
            if (hodnota.equals(hiragana.get(odpoved))) {
                System.out.println("Správně");
                spravne++;
            } else System.out.println("Špatně");
        }
        System.out.println("Uhodl jsi správně: " +spravne +"/" +test);
    }




    // nelze vytáhnout value stejně jako key - zatím
//    protected void randomValue(){
//        List<String> values = new ArrayList<String>(hiragana.values());
//        String randomValue = values.get(rand.nextInt(values.size()));
//        String key = hiragana.get(randomValue);
//        System.out.println(key);
//    }




}
