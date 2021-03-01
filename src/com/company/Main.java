package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.println("Podaj kod pin:");
        Scanner scanner = new Scanner(System.in);

        int pin;
        int konto = 0;
        int proby = 3;
        while (proby >= 0) {


            pin = scanner.nextInt();

            if (pin == 3671 ) {
                while (true) {


                    System.out.println("Pin poprawny!");

                    System.out.println("Co chcesz zrobic?");
                    System.out.println("1. Wybierz gotówkę");
                    System.out.println("2. Sprawdz stan konta");
                    System.out.println("3. Wpłać gotówkę");
                    System.out.println("4. Przerwij operacje");
                    int opcja = 4;
                    opcja = scanner.nextInt();
                    switch (opcja) {
                        case 1:
                            System.out.println("Ile chcesz wybrac?");
                            int wybieranieGotowki = scanner.nextInt();
                            if (wybieranieGotowki > 0 && konto > 0) {
                                konto = konto - wybieranieGotowki;
                                System.out.println("Stan Twojego konta to: " + konto);
                                break;
                            } else {
                                System.out.println("Nie masz wystarczającej ilości srodków");
                                break;
                            }
                        case 2:
                            System.out.println("Stan Twojego konta to " + konto + " zł.");
                            break;
                        case 3:
                            System.out.println("Podaj kwotę jaką chcesz wpłacić");
                            int dodawanieGotowki = scanner.nextInt();
                            if (dodawanieGotowki > 0) {
                                int kontoPoWplacie = dodawanieGotowki + konto;
                                System.out.println("Twoje konto po wplacie wynosi " + kontoPoWplacie + " zł.");
                                konto = kontoPoWplacie;
                                break;
                            } else {
                                System.out.println("Wprowadziles zle dane!");
                            }
                        case 4:
                            System.out.println("Następuje wylogowanie!");
                            System.exit(0);
                            break;

                        default:
                            System.out.println("Nie ma takiej opcji!");
                    }
                }


            } else {

                if (proby > 0) {
                    System.out.println("Pin niepopoprawny! Pozostało " + proby + " próby");
                    proby--;
                } else {

                    System.out.println("Karta zablokowana, następuje wylgowane!");
                    System.exit(0);
                }


            }

        }


    }
}