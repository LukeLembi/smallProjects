package cz.itnetwork;


import java.util.Scanner;

public class Pojistenec{
    Scanner scanner = new Scanner(System.in);
    protected String jmeno;
    protected String prijmeni;
    protected int vek;
    protected String telefon;

    // konstruktor definovaný pro ukázku výčtu
    public Pojistenec(String jmeno, String prijmeni, int vek, String telefon){ // samozřejmě může mít více parametrů
    this.jmeno = jmeno;
    this.prijmeni = prijmeni;
    this.vek = vek;
    this.telefon = telefon;
 }


    // konstruktor pro zadání od uživatele
    public Pojistenec(){
    System.out.println("Zadejte jméno: ");
    this.jmeno = scanner.nextLine();
    System.out.println("Zadejte příjmeni: ");
    this.prijmeni =scanner.nextLine();
    System.out.println("Zadejte věk: ");
    this.vek = Integer.parseInt(scanner.nextLine());
    System.out.println("Zadejte telefon: ");
    this.telefon = scanner.nextLine();

 }
     @Override
    public String toString(){
    return jmeno + " " + prijmeni + ", " + vek + " \ntel.: " + telefon + "\n--------------------\n" ;

 }


}
