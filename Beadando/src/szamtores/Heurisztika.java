package szamtores;

public class Heurisztika {

    private static int ertek;

    public static int h(Allapot allapot) {
        return lehetseges(allapot);
    }

    private static void ertekeles(int pozicio, Allapot allapot) {
        if (pozicio > 0)
            ertek += 1;
        else if (pozicio == 0 && allapot.szamsor[pozicio] != 0)
            ertek += 9;
        else
            ertek += 1000;
    }

    private static int lehetseges(Allapot allapot) {
        ertek = 0;
        for (int i = 0; i <= allapot.szamsor.length; i++) {
            ertekeles(i, allapot);
        }
        return ertek;
    }
}