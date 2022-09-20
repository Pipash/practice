package AmazonCodingPractice;

import java.util.ArrayList;

public class FlowerPattern {
    public FlowerPattern(int p) {
        int m = p*2;
        ArrayList<Character> a = new ArrayList<>();
        for (int l = p+64; l>64; l--) {
            a.add((char) l);
        }

        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int lastJ = -1;
            int lastI = 0;
            for (int j = 0; j < m; j++) {
                if (i == 0 || i == m-1) {
                    finalString.append(a.get(0));
                } else {
                    if (i > (p-1)) {
                        if (lastI == 0) {
                            lastI = p-1;
                        } else {
                            lastI -= 1;
                        }
                    } else {
                        lastI = i;
                    }

                    if (j<=lastI) {
                        finalString.append(a.get(j));
                    } else {
                        if (lastJ < 0) {
                            lastJ = j;
                            finalString.append(a.get(lastJ));

                            /*if (lastJ == 0 && j == (m-1)) {
                                finalString.append(a.get(lastJ));
                            } else {
                                finalString.append(a.get(j));

                                lastJ = j - 1;
                            }*/
                        }
                        if (lastJ > lastI)
                            lastJ -= 1;
                        //System.out.printf("%d, %d, %d", lastI, j, lastJ);
                        //System.out.println("");

                    }
                }
            }
            finalString.append("\\");
            System.out.println(finalString);
        }

        System.out.println(finalString);
    }
}
