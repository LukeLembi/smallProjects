package cz.itnetwork;
// Závěrečný projekt evidence pojištěnců - zjednodušená verze
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Seznam seznam = new Seznam();
        seznam.ukazkoviPojistenci();
        System.out.println("--------------------");
        System.out.println("EVIDENCE POJIŠTĚNCŮ");
        System.out.println("--------------------");
        LocalDate datumCas = LocalDate.now();
        int akce = 0;

        do{
            System.out.println(datumCas.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)).toUpperCase()); // datum a čas
            System.out.println();
            System.out.println("MENU:");
            System.out.println("1 - Přidat nového pojištěnce");
            System.out.println("2 - Vypsat všechny pojištěnce");
            System.out.println("3 - Vyhledat pojištěnce");
            System.out.println("4 - Smazat pojištěnce");
            System.out.println("5 - Editovat pojištěnce - pouze dle ID");
            System.out.println("6 - Ukončit program");
            System.out.println();
            System.out.println("Vyberte akci dle čísla:");
            akce = Integer.parseInt(scanner.nextLine());

            switch(akce){
                case 1:
                    seznam.pridat();
                    break;
                case 2:
                    seznam.vycet();
                    break;
                case 3:
                    seznam.vyhledat();
                    break;
                case 4:
                    seznam.smazat();
                    break;
                case 5:
                    seznam.editovat();
                    break;
                case 6:
                    System.out.println();
                    System.out.println("Děkujeme za použití programu");
                    break;
                default:
                    System.out.println("NEPLATNÁ AKCE! BUDETE NAVRÁCENI ZPĚT DO MENU!");
                    break;
            }
        } while (akce !=6);









    }
}