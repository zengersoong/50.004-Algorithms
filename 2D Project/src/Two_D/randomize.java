package Two_D;

import java.util.Random;


public class randomize {
    public boolean randomized(int[] a, int[] b) {
        //store variable name as index of int[ ] and value will be T/F
        // 0--> null 1--> false 2--> true
        //(5 -7) --> a[5] b[7+6000]
        // true for clause result=1, false for clause result=0
        // int[6000] c --> with all 1
        int Maxnum = 6000;
        int[] c = new int[2 * Maxnum];
        int length = a.length;
        int[] result = new int[length];
        
/*        int leng=choseNum.nextInt(a.length);*/
        for (int r = 0; r < Maxnum; r++) {
            c[r + Maxnum] = 1; // all the variable will be 0 and set all negation of variable be true;
        }

        int total=0;
        while (true){ // run until 100*n^2
            result = makeresult(a,b,c,result);
            if(!checkresult(result)){ // if result no all true, means need to random choose one literal from false clause and let it be true
                c = searchNext(a, b, c, result); //random choose one to be true, and test it again.
            }
            else{
                System.out.println(total);
                System.out.println("state1");
                return true;
            }
            total++;
            if(total>59*6000*6000){
                break;
            }
        }
        System.out.println(total);
        System.out.println("cannot find");
        return false; // if it cannot find in 100*n^2 then output false;
    }

    public int[] makeresult(int[] a, int[]b, int[] c, int[] result){ // The block below to check the Result, "OR" gate idea
        for (int j = 0; j < a.length; j++) {
            if(a[j]>0 && b[j]>0){
                result[j] = c[a[j]] + c[b[j]];
            }
            else if(a[j]>0 && b[j]<0){
                result[j] = c[a[j]] + c[-b[j]+6000];
            }
            else if(a[j]<0 && b[j]>0){
                result[j] = c[-a[j]+6000] + c[b[j]];
            }
            else if(a[j]<0 && b[j]<0){
                result[j] = c[-a[j]+6000] + c[-b[j]+6000];
            }
            else if(b[j]==0) { // if it is Unit clause
                if (a[j] > 0) {
                    result[j] = c[a[j]];
                } else if (a[j] < 0) {
                    result[j] = c[-a[j] + 6000];
                }
            }
        }
        return result;
    }

    public boolean checkresult(int[] result){ // check the result, if true will all 1(true).
        int leng = result.length;
        int state=0;
        for (int i =0; i<leng;i++){
            if (result[i]==0){
                state++;
            }
        }

        if(state==0){
            return true;
        }
        else{
            return false;
        }
    }

    public int returndigitF(int[] result){  // find the indexvalue that clause is false
        int leng = result.length;
        int state=0;
        for (int i =0; i<leng;i++){
            if (result[i]==0){
                return i;
            }
            else{
                state++;
            }
        }
        return state;
    }

    public int[] searchNext(int[] a, int[]b, int[]c, int[] result){ // random choose one literal from first false clause
        Random chose = new Random();
        int q=returndigitF(result);
        boolean Getn = chose.nextBoolean();
        if (!Getn) {
            if (a[q] > 0) {
                c[a[q]] = 1;
                c[a[q] + 6000] = 0;
            } else {
                c[-a[q] + 6000] = 1;
                c[-a[q]] = 0;
            }
        } else {
            if (b[q] > 0) {
                c[b[q]] = 1;
                c[b[q] + 6000] = 0;
            } else {
                c[-b[q] + 6000] = 1;
                c[-b[q]] = 0;
            }
        }
        return c;
    }




    public static void main(String[] args) {
        int counter =0;
        int counter1 =0;
        int counter2 =0;
        int counter3 =0;
        int counter4 =0;
        for (int i=0;i<100;i++) {
/*            // Unsat
            *//*int[] a = {1, -1, 3, -2};
            int[] b = {2, 3, 4, -4};*//*
            int[] a = {-1, -2, 2, 2, -6, 1, 1, -5, -1, -3, 3, 3, -4, 2, -2, -3};
            int[] b = {-4, -7, -6, 7, 7, -5, 7, 7, -7, 6, -4, -6, -6, 5, 3, -5};
            randomize t= new randomize();
            if (t.randomized(a, b)) {
                counter++;
            }
            *//*System.out.println("\n"+counter);*//*


            // Unsat
            int[] a1 = {1, -1, -1, -2, 4};
            int[] b1 = {1, 2, 3, -3, 5};
            randomize t1 = new randomize();
            if(t1.randomized(a1, b1)){
                counter1++;
            }


            // sat
            int[] a2 = {1, -1, 3, -2};
            int[] b2 = {2, 3, 4, -4};
            randomize t2 = new randomize();
            if (t2.randomized(a2, b2)) {
                counter2++;
            }


            // Unsat
            int[] a4 = {1, -2, -1, -3, -3, -5, 2};
            int[] b4 = {2, 3, -2, -4, 5, 4, 3};
            randomize t4 = new randomize();
            if(t4.randomized(a4, b4)){
                counter4++;
            }*/

            int[] a3 = {-1, -2, -3, -4, -5, -6, -7,-8,-9,-10,-11,-12,-13,-14,-15,-16,-17,-18,-19,-20,-21,-22,-23,-24,-25,-26,-27,-28,-29,-30,-31,-32,-33,-34,-35,-36,-37,-38,-39,-40,1,40};
            int[] b3 = {2, 3, 4, 5, 6, 7, 8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,0,0};
            randomize t3 = new randomize();
            if(t3.randomized(a3, b3)){
                counter3++;
            }

        }
       /* System.out.println(counter);
        System.out.println(counter1);
        System.out.println(counter4);
        System.out.println(counter2);*/
        System.out.println(counter3);

    }
}
