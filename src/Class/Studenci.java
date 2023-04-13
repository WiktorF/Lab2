package Class;

import Iterators.ArrayIterator;
import Iterators.FilteringIterator;
import Predicates.NegatywnaOcena;
import Predicates.PozytywnaOcena;

public class Studenci {

    private Student[] tab;
    private int size;
    private int amount;
    public Studenci(int size) {
        this.size = size;
        amount = 0;
        tab = new Student[size];
    }

    public void add(Student student){
        tab[amount] = student;
        amount++;
    }

    public void wyswietlListe() {
        ArrayIterator it = new ArrayIterator(tab,0, amount);
        for (it.first(); !it.isDone(); it.next()) {
            System.out.println(it.current());
        }
    }
    public void sredniaArytmetyczna(){
        double srednia = 0;
        int ilosc = 0;
        ArrayIterator it = new ArrayIterator(tab,0, amount);
        FilteringIterator itf = new FilteringIterator(it, new PozytywnaOcena());
        for (itf.first(); !itf.isDone(); itf.next()) {
            srednia += Double.parseDouble(itf.current().toString().split(" ")[3]);
            ilosc++;
        }
        srednia/=ilosc;
        System.out.println(srednia);
    }
    public void wpiszOcene(int idx, double ocena){
        ArrayIterator it = new ArrayIterator(tab, 0, amount);
        for(it.first(); !it.isDone(); it.next()){
            if(Integer.parseInt(it.current().toString().split(" ")[0]) == idx){
                ((Student)it.current()).setOcena(ocena);
            }
        }
    }

    public void nieZaliczeni(){
        ArrayIterator it = new ArrayIterator(tab,0, amount);
        FilteringIterator itf = new FilteringIterator(it, new NegatywnaOcena());
        for (itf.first(); !itf.isDone(); itf.next()) {
            System.out.println((itf.current()));
        }
    }
}
