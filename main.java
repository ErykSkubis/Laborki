package PO.Lab2;

import java.util.ArrayList;
import java.util.Scanner;


public class main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Witaj w wypożyczalni. Co chcesz zrobić?");
        System.out.println("Wypożycz");
        System.out.println("Zwróć");
        int wybór = scan.nextInt();

        switch(wybór)
        {
            case 1:
            {
                Użytkownik adam = new Użytkownik("adam","Małysz", "Krotoszyce", 36, "25.05", 1);
                System.out.println(adam.imie);

            }
            case 2:
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

                }
                System.out.println(asortyment);

            }
        }

    }
}

