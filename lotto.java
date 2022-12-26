
public class lotto {
    public static void main(String[] args) {
        int x = 0;
        int anzahl_der_sets = 10; // Ändern um mehr zahlen reihen zu generieren
        {
            do {
                for (int i = 0; i < 6; i++) {
                    int lottoNum = (int) (Math.random() * 49 + 1);
                    int nummern[] = new int[6];
                    for (int j = 0; j < nummern.length; j++) {
                        nummern[j] = lottoNum;
                    }
                    if (lottoNum < 10) {
                        System.out.print("0" + nummern[i]);
                        System.out.print(" | ");
                    } else {
                        System.out.print(nummern[i]);
                        System.out.print(" | ");
                    }
                }
                System.out.println();
                x += 1;
            } while (x != anzahl_der_sets);
        }
    }
}