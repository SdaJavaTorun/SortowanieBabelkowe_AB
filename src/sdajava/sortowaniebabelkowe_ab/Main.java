package sdajava.sortowaniebabelkowe_ab;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] tab = {4,7,8,3,5};
        int temp = 0;
        boolean flag = true;

        for (int i=0; i<tab.length; i++) {
            for (int j=0; j<tab.length-1; j++) {
                if (tab[j] > tab[j + 1]) {
                    temp = tab[j + 1];
                    tab[j+1]=tab[j];
                    tab[j] = temp;
                }
                flag = false;
            }
            if (flag=false) {
                break;
            }                               }
        System.out.println(Arrays.toString(tab));
    }
}
