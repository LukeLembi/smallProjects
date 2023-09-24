package my.project;

// procvičování japonštiny

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
            System.out.println();
            System.out.println("Jaký test chcete spustit? Zadejte text z nabídky.");
            System.out.println("Hiragana \nKatakana \nKandži \nSlovíčka a Fráze(není hotové) \nKonec");
            status = scanner.nextLine().toLowerCase();
            if(status.equals("hiragana")) {
                System.out.println("Vyberte další možnost: \nTest\nVýpis");
                status = scanner.nextLine().toLowerCase();
                if (status.equals("test"))
                    hiragana.testHiragany();
                else if(status.equals("výpis"))
                    hiragana.vypis(); // potřeba upravit formátování
                System.out.println();
            }
            else if(status.equals("katakana")){
                System.out.println("Vyberte další možnost: \nTest\nVýpis");
                status = scanner.nextLine().toLowerCase();
                if (status.equals("test"))
                    katakana.testKatakany();
                else if(status.equals("výpis"))
                    katakana.vypis(); // potřeba upravit formátování
                System.out.println();
            }
            else if(status.equals("kandži")) { // doplnit testy ze čtení
                System.out.println("Vyberte další možnost: \nTest\nVýpis");
                status = scanner.nextLine().toLowerCase();
                if (status.equals("test"))
                    kandzi.testKandzi_cesky();
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