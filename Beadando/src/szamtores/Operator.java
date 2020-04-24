package szamtores;

public class Operator {

    int pozicio;

    public Operator(int pozicio) {
        this.pozicio = pozicio;
    }

    public boolean alkalmazhato(Allapot allapot) {
        if (pozicio < allapot.szamsor.length && pozicio >= 0) {
            if (allapot.szamsor[pozicio] >= 0) {
                return true;
            }
        }
        return false;
    }

    public Allapot alkalmaz(Allapot allapot) {
        Allapot uj = new Allapot(allapot.jatekos);
        int[] a = allapot.szamsor;
        int[] b = uj.szamsor;

        for (int i = 0; i < allapot.szamsor.length; i++) {
            b[i] = a[i];
        }

        if (uj.szamsor[this.pozicio] != 0) {
            b[this.pozicio] = b[this.pozicio] - 1;
            return uj;
        } else {
            for (int i = pozicio; i < allapot.szamsor.length; i++)
                b[i] = -1;
            return uj;
        }
    }

    @Override
    public String toString() {
        return "Operator{" +
                "pozicio=" + pozicio +
                '}';
    }
}

