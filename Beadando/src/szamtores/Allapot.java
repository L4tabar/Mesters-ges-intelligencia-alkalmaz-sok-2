package szamtores;

import java.util.Arrays;
import java.util.Objects;

public class Allapot {
    int[] szamsor;
    Jatekos jatekos;

    public Allapot(Jatekos jatekos) {
        this.szamsor = new int[]{3, 3, 3, 4};
        this.jatekos = jatekos;
    }

    public void jatekosCsere() {
        if (this.jatekos == Jatekos.Szamitogep)
            this.jatekos = Jatekos.On;
        else
            this.jatekos = Jatekos.Szamitogep;
    }


    public boolean cel() {
        return szamsor[0] == -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Allapot allapot = (Allapot) o;
        return Arrays.equals(szamsor, allapot.szamsor) &&
                jatekos == allapot.jatekos;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(jatekos);
        result = 31 * result + Arrays.hashCode(szamsor);
        return result;
    }

    @Override
    public String toString() {
        for (int i = 0; i < szamsor.length; i++) {
            if (szamsor[i] != -1)
                System.out.print(szamsor[i] + " ");
        }
        return "";
    }
}
