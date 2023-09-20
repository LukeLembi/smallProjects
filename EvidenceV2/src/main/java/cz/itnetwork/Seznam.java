package cz.itnetwork;

import java.util.Scanner;
import java.util.ArrayList;
public class Seznam{
    Scanner scanner = new Scanner(System.in);
    ArrayList<Pojistenec> evidence = new ArrayList();

    //ukázkoví pojištěnci zadaní do ArrayListu
    protected void ukazkoviPojistenci() {
        Pojistenec p1 = new Pojistenec("Tomáš", "Marný", 25, "+420777654123");
        Pojistenec p2 = new Pojistenec("Prokop", "Buben", 48, "+420776987546");
        Pojistenec p3 = new Pojistenec("Dluhoš", "Krátký", 60, "+420775574456");
        Pojistenec p4 = new Pojistenec("Tomáš", "Těžký", 29, "+420774325987");
        Pojistenec p5 = new Pojistenec("Lidumil", "Zlejší", 18, "+420773654123");
        Pojistenec p6 = new Pojistenec("Bivoj", "Chytil", 25, "+420772987321");
        evidence.add(p1);
        evidence.add(p2);
        evidence.add(p3);
        evidence.add(p4);
        evidence.add(p5);
        evidence.add(p6);
    }

    // přidání nového pojištěnce
    protected void pridat(){
        System.out.println("PŘIDÁNÍ NOVÉHO POJIŠTĚNCE");
        System.out.println("-------------------------");
        System.out.println();
        Pojistenec novyPojistenec = new Pojistenec();
        evidence.add(novyPojistenec);
        System.out.println("Nový pojištěnec přidán.");
        System.out.println();
    }

    // seznam všech pojištěnců
    protected void vycet(){
        System.out.println("SEZNAM POJIŠTĚNCŮ");
        System.out.println("-----------------");
        // standardní cyklus
//        for(int i =0; i < evidence.size(); i++){
//            System.out.println(evidence.get(i).toString());
//        }
        // cyklus foreach
        for( Pojistenec pojistenec : evidence){
            System.out.println("ID: " + evidence.indexOf(pojistenec));
            System.out.println(pojistenec);
        }
    }

    // vyhledání pojištěnce
    protected void vyhledat(){
        System.out.println("VYHLEDÁNÍ POJIŠTĚNCE");
        System.out.println("--------------------");

        System.out.println("Znáte ID pojištěnce? (ano/ne)");
        String akce = scanner.nextLine();
        int index =0;
        if (akce.equals("ano")){
            System.out.println("Zadejte ID pojištěnce: ");
            index = Integer.parseInt(scanner.nextLine());
            System.out.println(evidence.get(index).toString());
        }
        else {
            System.out.println("Zadejte jméno: ");
            String hledejJmeno = scanner.nextLine();
            System.out.println("Zadejte příjmení: ");
            String hledejPrijmeni = scanner.nextLine();
            for (int i = 0; i < evidence.size(); i++) {
                if ((hledejJmeno.equals(evidence.get(i).jmeno)) && (hledejPrijmeni.equals(evidence.get(i).prijmeni))) {
                    System.out.println();
                    System.out.println("ID: " + i);
                    System.out.println(evidence.get(i).toString());
                }
            }
        }
    }

    // smazání pojištěnce
    protected void smazat(){
        System.out.println("SMAZÁNÍ POJIŠTĚNCE");
        System.out.println("------------------");
        System.out.println("Zadejte jméno: ");
        String hledejJmeno = scanner.nextLine();
        System.out.println("Zadejte příjmení: ");
        String hledejPrijmeni = scanner.nextLine();

        for(int i =0; i < evidence.size(); i++){
            if ((hledejJmeno.equals(evidence.get(i).jmeno)) && (hledejPrijmeni.equals(evidence.get(i).prijmeni))){
                System.out.println(evidence.get(i).toString());
                System.out.println("Přejete si smazat tohoto pojištěnce? (ano/ne):");
                String akce = scanner.nextLine();
                if (akce.equals("ano"))
                    evidence.remove(i);
                else System.out.println("Návrat zpět do menu.");
            }
        }
    }

    // úprava dat u pojištěnce
    protected void editovat(){
        System.out.println("EDITACE POJIŠTĚNCE:");
        System.out.println("-------------------");
        System.out.println("Zadejte ID editovaného pojištěnce: ");
        int index = Integer.parseInt(scanner.nextLine());
        System.out.println(evidence.get(index).toString());

        System.out.println("Co si přejete editovat? Vyberte dle čísla: ");
        System.out.println("1 - Jméno");
        System.out.println("2 - Příjmení");
        System.out.println("3 - Věk");
        System.out.println("4 - Telefonní číslo");
        int akce = Integer.parseInt(scanner.nextLine());
        if (akce == 1){
            System.out.println("Zadejte nové jméno: ");
            evidence.get(index).jmeno = scanner.nextLine();
        }
        else if (akce == 2){
            System.out.println("Zadejte nové příjmení: ");
            evidence.get(index).prijmeni = scanner.nextLine();
        }
        else if (akce == 3){
            System.out.println("Zadejte nový věk: ");
            evidence.get(index).vek = Integer.parseInt(scanner.nextLine());
        }
        else if (akce == 4){
            System.out.println("Zadejte nové telefoní číslo: ");
            evidence.get(index).telefon = scanner.nextLine();
        }
    }
}

