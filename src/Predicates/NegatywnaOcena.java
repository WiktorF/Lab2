package Predicates;

import Interfaces.Predicate;
import Class.Student;

public class NegatywnaOcena implements Predicate {
    private int negatywna;

    public NegatywnaOcena(){
        this.negatywna = 3;
    }

    @Override
    public boolean accept(Object o) {
        return ((Student)o).getOcena() < negatywna;
    }
}
