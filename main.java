package PO.Lab2;

import java.util.ArrayList;
import java.util.Scanner;


public class main
{
    public static void main(String[] args)
    {

        Ksiazka ksiazka1 = new Ksiazka("Hobbit", 11, "J.R.R.Tolkien", 500);
        Ksiazka ksiazka2 = new Ksiazka("Władca Pierścieni", 12, "J.R.R.Tolkien", 1300);
        Ksiazka ksiazka3 = new Ksiazka("Silmarillion", 13, "J.R.R.Tolkien", 3000);
        Film film1 = new Film("Mroczne Widmo", 21, "George Lucas", 150);
        Film film2 = new Film("Atak Klonów", 22, "George Lucas", 150);
        Film film3 = new Film("Zemsta Sithów", 23, "George Lucas", 150);
        Muzyka muzyka1 = new Muzyka("Highway to Hell", 31, "AC/DC", "Rock");
        Muzyka muzyka2 = new Muzyka("All Star", 32, "Smash Mouth", "Rock alternatywny");
        Muzyka muzyka3 = new Muzyka("Never Gonna Give You Up", 33, "Rick Astley", "Biały soul");
        Ebook ebook1 = new Ebook("Wiedźmin", 41, "Andrzej Sapkowski", 1500);
        Ebook ebook2 = new Ebook("Harry Potter", 42, "J.K. Rowling", 1500);
        Ebook ebook3 = new Ebook("Jezus Niechrystus ", 43, "Piotr Augustyniak", 2500);
        Audiobook audiobook1 = new Audiobook("Władca Pierścieni", 51, "J.R.R.Tolkein", "Tomasz Knapik");
        Audiobook audiobook2 = new Audiobook("Mortal Engines", 52, "Philip Reeve", "Krystyna Czubówna");
        Audiobook audiobook3 = new Audiobook("Hunger Games", 53, "Suzanne Collins", "Tomasz Knapik");
        ArrayList<Szablon> asortyment = new ArrayList<Szablon>();
        {
            asortyment.add(ksiazka1);
            asortyment.add(ksiazka2);
            asortyment.add(ksiazka3);
            asortyment.add(film1);
            asortyment.add(film2);
            asortyment.add(film3);
            asortyment.add(muzyka1);
            asortyment.add(muzyka2);
            asortyment.add(muzyka3);
            asortyment.add(ebook1);
            asortyment.add(ebook2);
            asortyment.add(ebook3);
            asortyment.add(audiobook1);
            asortyment.add(audiobook2);
            asortyment.add(audiobook3);
        }


        Scanner scan = new Scanner(System.in);
        System.out.println("Witaj w wypożyczalni. Proszę stworzyć profil użytkownika?");
        System.out.println("Imie: ");
        String name = scan.nextLine();
        System.out.println("Nazwisko: ");
        String surname = scan.nextLine();
        System.out.println("Wiek: ");
        int age = scan.nextInt();
        System.out.println("Adres: ");
        String address = scan.nextLine();
        scan.nextLine();
        System.out.println("Dzisiejsza data: ");
        String date = scan.nextLine();
        Użytkownik user1 = new Użytkownik(name,surname,address,age,date);
        System.out.println("Witaj "+name+". Co chcesz zrobić?");
        System.out.println("1. Wypożycz");
        System.out.println("2. Zwróć");
        System.out.println("3. Wyświetl Profil");
        int wybór = scan.nextInt();

        switch(wybór)
        {
            case 1:
            {

                if(user1.ID!=0)
                {
                    System.out.println("Użytkownik wypożyczył już jakiś artykuł. Należy go zwrócić zanim wypożyczony zostanie następny");
                }
                else {
                    System.out.println("Wybierz artykuł po numerze ID:");
                    for (Szablon obiekt : asortyment) {
                        System.out.println(" ID:" + obiekt.id + " " + obiekt.tytul);
                    }

                    int wypozyczenie = scan.nextInt();
                    if (wypozyczenie != 11 && wypozyczenie != 12 && wypozyczenie != 13&& wypozyczenie != 21&& wypozyczenie != 22&& wypozyczenie != 23&& wypozyczenie != 31&& wypozyczenie != 32&& wypozyczenie != 33&& wypozyczenie != 41&& wypozyczenie != 42&& wypozyczenie != 43&& wypozyczenie != 51&& wypozyczenie != 52&& wypozyczenie != 53) {
                        System.out.println("Wybrano zły artykuł, proszę spróbować ponownie!");
                    }
                    else {
                        user1.ID = wypozyczenie;
                        System.out.println("Proszę podać dzisiejszą date: ");
                        String data = scan.nextLine();
                        scan.nextLine();
                        user1.datawyp=data;
                        System.out.println("Akcja zakończona powodzeniem. Prosimy o zwrócenie artykułu w przeciągu 2 tygodni. Życzymy miłego dnia.");

                    }
                }
                break;



            }
            case 2:
            {
                if(user1.ID==0)
                {
                    System.out.println("Użytkownik nie wypożyczył jeszcze artykułu. Zalecamy coś wypożyczyć!");
                }
                else {
                    System.out.println("Wypożyczone dnia: " + user1.datawyp);
                    System.out.println("Czy zostało przekroczone 14 dni od wypożyczenia?");
                    System.out.println("1.Tak           2.Nie");
                    int kara = scan.nextInt();
                    if (kara == 1) {
                        System.out.println("Proszę uiścić opłatę w punkcie fizycznym bibilioteki");
                    } else {

                        user1.ID = 0;
                        System.out.println("Zwrot udany, dziękujemy za korzystanie z naszych usług!");

                    }
                }


            }
            case 3:
            {
                System.out.println("Imie: "+user1.imie);
                System.out.println("Nazwisko: "+user1.nazwisko);
                System.out.println("Wiek: "+user1.wiek);
                System.out.println("Adres: "+user1.adres);
                System.out.println("Data zapisu: "+user1.zapis);
                if(user1.ID==0)
                {
                    System.out.println("Nie wypożyczono żadnego artykułu");
                }
                else {
                    System.out.println("ID wypożyczonego artykułu: " + user1.ID);
                    System.out.println("Wypożyczono dnia: "+user1.datawyp);
                }
                break;
            }
            default:System.out.println("Wybrano złą opcje, spróbuj ponownie!");
        }

    }
}

