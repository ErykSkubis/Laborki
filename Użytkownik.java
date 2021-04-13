package PO.Lab2;

public class Użytkownik
{

    public String imie;
    String nazwisko;
    String adres;
    int wiek;
    String zapis;
    int ID;
    String datawyp;
    public Użytkownik(String imie, String nazwisko, String adres, int wiek, String zapis)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.wiek = wiek;
        this.zapis = zapis;
        this.ID = 0;
        this.datawyp="";
    }

}
