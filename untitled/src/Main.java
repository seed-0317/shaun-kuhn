/**
 * Created by vso513 on 4/5/17.
 */

import java.lang.Math.*;
import java.util.Arrays;

class main {                                 //0, 1, 2, 3, 4, 5, 6, 7,   8, 9,  10, 11,  12
    public static void main(String[] args) { //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144

        int fSum = 1;
        int n = 2;
        if (n < 2) {

            fSum = n;
        }

        while (n > 1){
            fSum = fSum * n;
            n = n-1;

        }
        System.out.println(fSum);
    }



    }