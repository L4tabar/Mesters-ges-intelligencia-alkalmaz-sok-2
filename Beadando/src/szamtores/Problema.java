package szamtores;

import java.util.ArrayList;
import java.util.List;

public class Problema {

    static List<Operator> OPERATOROK = new ArrayList<>();

    static {
        for (int pozicio = 0; pozicio < 4; pozicio++) {
            OPERATOROK.add(new Operator(pozicio));
        }
    }

    public List<Operator> operatorok() {
        return OPERATOROK;
    }
}