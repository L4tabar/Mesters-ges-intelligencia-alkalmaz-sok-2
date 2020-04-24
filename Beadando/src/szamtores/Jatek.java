package szamtores;

import java.util.Scanner;

public class Jatek {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Problema p = new Problema();
        Allapot allapot;

        System.out.println("Ha szeretne Ön kezdeni, akkor írja be az 1-es számot.");
        System.out.println("Ha azt szeretné, hogy a Számítógép kezdjen akkor bármilyen más számot");
        int valasztas = scanner.nextInt();
        ;

        if (valasztas == 1) {
            allapot = new Allapot(Jatekos.On);
            System.out.println("A játékot Ön kezdi.");
        } else {
            allapot = new Allapot(Jatekos.Szamitogep);
            System.out.println("A játékot a számítógép kezdi.");
        }
        System.out.println("Ez a kezdő állás:");
        System.out.println(allapot);
        System.out.println("A pozíciók száma 0-tól kezdődik!!!");

        while (true) {

            Operator operator = null;

            do {
                switch (allapot.jatekos) {
                    case Szamitogep:
                        operator = MiniMax.lepes(allapot, p, 1);
                        System.out.println("A számítógép ezt a pozíciót választotta : " + operator.pozicio);
                        break;
                    case On:
                        System.out.println("A számsor jelenlegi állása:");
                        System.out.println(allapot);
                        System.out.print("Írjon be egy pozíciót: ");
                        int pozicio = Integer.parseInt(scanner.next());
                        if (pozicio >= allapot.szamsor.length)
                            System.out.println("Helyes pozíciót adjon meg!");
                        operator = new Operator(pozicio);
                        break;
                }
            } while (!operator.alkalmazhato(allapot));

            allapot = operator.alkalmaz(allapot);
            System.out.println(allapot);
            allapot.jatekosCsere();
            if (allapot.cel()) {
                System.out.println(allapot.jatekos + " Nyert!");
                break;
            }
        }
    }
}