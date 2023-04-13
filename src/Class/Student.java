package Class;

public class Student {
    private int nrindeksu;
    private String nazwisko;
    private String imie;
    private double ocena;

    public Student(int indeks, String nazwisko, String imie, double ocena){
        this.nrindeksu = indeks;
        this.nazwisko = nazwisko;
        this.imie = imie;
        this.ocena = ocena;
    }

    public double getOcena() {
        return ocena;
    }
    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    public String toString(){
        return nrindeksu+" "+imie+" "+nazwisko+" "+ocena;
    }
}
