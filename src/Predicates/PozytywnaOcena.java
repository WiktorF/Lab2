package Predicates;

import Interfaces.Predicate;
import Class.Student;

public class PozytywnaOcena implements Predicate {
    private int pozytywna;

    public PozytywnaOcena(){
        this.pozytywna = 3;
    }

    @Override
    public boolean accept(Object o) {
        return ((Student)o).getOcena() >= pozytywna;
    }
}
