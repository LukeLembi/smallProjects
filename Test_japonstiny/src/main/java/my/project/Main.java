package my.project;

// procvičování japonštiny

import java.sql.SQLOutput;
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
                System.out.println("Vyberte další možnost: \n\"Test\"\n\"Výpis\"");
                status = scanner.nextLine().toLowerCase();
                if (status.equals("test"))
                    kandzi.testKandzi_cesky();
                    //else if (status.equals("kun-jomi")
                    //  kandzi.testKandzi_kunjomi();
//                else if(status.equals.("on-jomi"))
//                    kandzi.testKandzi_onjomi();
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