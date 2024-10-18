import java.util.*;

class APCSÅ]¤ý°g®c {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char arr[][] = new char[a][b];
        int d = sc.nextInt();
        int darr[][] = new int[d][5];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = ' ';
            }
        }
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < 5; j++) {
                if (j < 4) {
                    darr[i][j] = sc.nextInt();
                } else if (j == 4) {
                    darr[i][j] = 0;
                }
            }
        }

        int alive = d ;
        while (alive>0) {
            for (int i = 0; i < d; i++) {
                if (darr[i][4] == 0) {
                    arr[darr[i][0]][darr[i][1]] = '@';
                    int sus = darr[i][0] + darr[i][2];
                    int sas = darr[i][1] + darr[i][3];

                    if (sus < 0 || sus >= a || sas < 0 || sas >= b) {
                        darr[i][4] = 1;
                        alive--;
                    } else {
                        // move
                        darr[i][0] = sus;
                        darr[i][1] = sas;
                    }
                }
            }

            // Ãz¬µ
            for (int i = 0; i < d; i++) {
                if (darr[i][4] == 0) {
                    if (arr[darr[i][0]][darr[i][1]] == '@' || arr[darr[i][0]][darr[i][1]] == '#') {
                        arr[darr[i][0]][darr[i][1]] = '#';
                        darr[i][4] = -1;
                        alive--;
                    }
                }
            }
            // ²M°£Ãz¬µªº¬µ¼u
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    if (arr[i][j] == '#') {
                        arr[i][j] = ' ';
                    }
                }
            }
        }

        int total = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (arr[i][j] == '@') {
                    total++;
                }
            }
        }
        System.out.println(total);
    }

}