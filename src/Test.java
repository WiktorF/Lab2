import Class.Student;
import Class.Studenci;
public class Test {
    public static void main(String[] args) {
        Student Pawel = new Student(33328, "Kowalski", "Pawel", 2);
        Student Oliwia = new Student(33333, "Piatek", "Oliwia", 5);
        Student Patryk = new Student(33353, "Trojan", "Patryk", 4);
        Student Aga = new Student(33261, "Kowalska", "Aga", 2);
        Student Wiktor = new Student(33374, "Forycki", "Wiktor", 3);

        Studenci Informatyka = new Studenci(6);

        Informatyka.add(Pawel);
        Informatyka.add(Oliwia);
        Informatyka.add(Patryk);
        Informatyka.add(Aga);
        Informatyka.add(Wiktor);

        Informatyka.wyswietlListe();

        Informatyka.wpiszOcene(33374,5);

        System.out.println();

        Informatyka.wyswietlListe();

        System.out.println();

        Informatyka.sredniaArytmetyczna();

        System.out.println();

        Informatyka.nieZaliczeni();
    }
}
