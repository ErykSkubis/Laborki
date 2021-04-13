package PO.Lab2;

class Szablon
{

    public  String tytul;
    public int id;
    public String autor;

    public Szablon(String stytul, int sid, String sautor)
    {
        tytul = stytul;
        id = sid;
        autor =sautor;
    }

}

class Ksiazka extends Szablon {

    int strony;
    Ksiazka(String stytul, int sid, String sautor, int sstrony)
    {
        super( stytul, sid, sautor);
        strony=sstrony;
    }

}

class Film extends Szablon {

    int dlugosc;
    Film(String stytul, int sid,  String sautor, int sdlugosc)
    {
        super(stytul, sid, sautor);
        dlugosc=sdlugosc;
    }
}
class Muzyka extends Szablon {

    String gatunek;
    Muzyka(String stytul, int sid, String sautor, String sgatunek)
    {
        super(stytul, sid, sautor);
        gatunek=sgatunek;
    }
}
class Ebook extends Szablon {

    float rozmiar;
    Ebook(String stytul, int sid, String sautor, float srozmiar)
    {
        super(stytul, sid, sautor);
        rozmiar=srozmiar;
    }
}
class Audiobook extends Szablon {

    String czytał;
    Audiobook(String stytul, int sid,  String sautor, String sczytał)
    {
        super(stytul, sid,  sautor);
        czytał=sczytał;
    }
}
