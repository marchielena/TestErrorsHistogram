package MarchiElena;

/*
    *data una stringa contenente lettere, che corrispondono ai colori della stampante, contare quanti errori, che si segnalano con "u, w, x, z", esistono in essa e sostituirli con gli *
*/
public class App {
    public static void main(String[] args) {
        String s = "xuuzwww";
        System.out.println(hist(s));
    }

    public static String hist(String s) {
        String ris = "";
        char[] arr = s.toCharArray();
        int u = 0;
        int w = 0;
        int x = 0;
        int z = 0;
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 'u':
                    u++;
                    break;
                case 'w':
                    w++;
                    break;
                case 'x':
                    x++;
                    break;
                case 'z':
                    z++;
                    break;
                default:
                    break;
            }
        }
        if (u != 0) {
            String ustr = "";
            ustr += "u  " + u + "     ";
            for (int i = 0; i < u; i++) {
                ustr += "*";
            }
            ustr += "\r";
            ris += ustr;
            System.out.println(ris);
        }
        if (w != 0) {
            String wstr = "";
            wstr += "w  " + w + "     ";
            for (int i = 0; i < w; i++) {
                wstr += "*";
            }
            wstr += "\r";
            ris += wstr;
            System.out.println(ris);
        }
        if (x != 0) {
            String xstr = "";
            xstr += "x  " + x + "     ";
            for (int i = 0; i < x; i++) {
                xstr += "*";
            }
            xstr += "\r";
            ris += xstr;
            System.out.println(ris);
        }
        if (z != 0) {
            String zstr = "";
            zstr += "z  " + z + "     ";
            for (int i = 0; i < z; i++) {
                zstr += "*";
            }
            //zstr += "\n";
            ris += zstr;
            System.out.println(ris);
        }
        return ris;
    }
}
