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
            System.out.println("Jaký test chcete spustit?");
            System.out.println("Hiragana \nKatakana \nKandži(není hotové) \nSlovíčka a Fráze(není hotové) \nKonec");
            status = scanner.nextLine().toLowerCase();
            if(status.equals("hiragana"))
                hiragana.testHiragany();
            else if(status.equals("katakana"))
                katakana.testKatakany();
            else if(status.equals("konec"))
                System.out.println("Děkujeme za použití programu");
            else System.out.println("Špatný příkaz");
        }while(!status.equals("konec"));




    }
}