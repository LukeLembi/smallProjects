package my.project;

// procvičování japonštiny
//formátování výpisu se prozatím upravovat nebude
//je potřeba vychytat "podvádění" v testu - prozatím se řešit nebude


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hiragana hiragana = new Hiragana();
        Katakana katakana = new Katakana();
        Kandzi kandzi = new Kandzi();
        hiragana.naplneni();
        katakana.naplneni();
        kandzi.naplneni();
        String status = "";

        do{
            System.out.println("----------------------");
            System.out.println("JAPONŠTINA");
            System.out.println("----------------------");
            System.out.println();
            System.out.println("Jakou možnost chcete spustit? Zvolte nabídku dle slova v uvozovkách.");
            System.out.println("\"Hiragana\" \n\"Katakana\" \n\"Kandži\" \n\"Slovíčka\" a Fráze(není hotové) \n\"Konec\"");
            System.out.println();
            status = scanner.nextLine().toLowerCase();
            if(status.equals("hiragana")) {
                System.out.println("Vyberte další možnost: \n\"Test\"\n\"Výpis\"");
                status = scanner.nextLine().toLowerCase();
                if (status.equals("test"))
                    hiragana.testHiragany();
                else if(status.equals("výpis"))
                    hiragana.vypis(); // potřeba upravit formátování
                System.out.println();
            }
            else if(status.equals("katakana")){
                System.out.println("Vyberte další možnost: \n\"Test\"\n\"Výpis\"");
                status = scanner.nextLine().toLowerCase();
                if (status.equals("test"))
                    katakana.testKatakany();
                else if(status.equals("výpis"))
                    katakana.vypis(); // potřeba upravit formátování
                System.out.println();
            }
            else if(status.equals("kandži")) { // doplnit testy ze čtení
                System.out.println("Vyberte další možnost: \nTest \"Česky\" \nTest čtení \"Kun-jomi\" \nTest čtení \"On-jomi\"\n\"Výpis\" znaků");
                status = scanner.nextLine().toLowerCase();
                if (status.equals("česky"))
                    kandzi.testCesky();
                else if (status.equals("kun-jomi"))
                    kandzi.testKunjomi();
                else if(status.equals("on-jomi"))
                    kandzi.testOnjomi();
                else if(status.equals("výpis"))
                    kandzi.vypis(); // potřeba upravit formátování
                System.out.println();
            }
            else if(status.equals("konec"))
                System.out.println("Děkujeme za použití programu");
            else System.out.println("Špatný příkaz");
        }while(!status.equals("konec"));




    }
}