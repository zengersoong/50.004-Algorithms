package travelAppPackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Objects;
import java.util.Set;


public class brute_force {

    public void public_transport(HashMap<String[],double[]> public_trasportlist){
        String[][] l = new String[100][2];
        double[][] i= new double[100][2];

        l[0][0] = "Marina Bay Sands";
        l[0][1] = "Singapore Flyer";
        i[0][0] = 0.83;
        i[0][1] = 17;
        public_trasportlist.put(l[0],i[0]);

        l[1][0] = "Marina Bay Sands";
        l[1][1] = "Vivo City";
        i[1][0] = 1.18;
        i[1][1] = 26;
        public_trasportlist.put(l[1],i[1]);

        l[2][0] = "Marina Bay Sands";
        l[2][1] = "Resorts World Sentosa";
        i[2][0] = 4.03;
        i[2][1] = 35;
        public_trasportlist.put(l[2],i[2]);

        l[3][0] = "Marina Bay Sands";
        l[3][1] = "Buddha Tooth Relic Temple";
        i[3][0] = 0.88;
        i[3][1] = 19;
        public_trasportlist.put(l[3],i[3]);

        l[4][0] = "Marina Bay Sands";
        l[4][1] = "Zoo";
        i[4][0] = 1.96;
        i[4][1] = 84;
        public_trasportlist.put(l[4],i[4]);

        l[5][0] = "Singapore Flyer";
        l[5][1] = "Marina Bay Sands";
        i[5][0] = 0.83;
        i[5][1] = 17;
        public_trasportlist.put(l[5],i[5]);

        l[6][0] = "Singapore Flyer";
        l[6][1] = "Vivo City";
        i[6][0] = 1.26;
        i[6][1] = 31;
        public_trasportlist.put(l[6],i[6]);

        l[7][0] = "Singapore Flyer";
        l[7][1] = "Resorts World Sentosa";
        i[7][0] = 4.03;
        i[7][1] = 38;
        public_trasportlist.put(l[7],i[7]);

        l[9][0] = "Singapore Flyer";
        l[9][1] = "Buddha Tooth Relic Temple";
        i[9][0] = 0.98;
        i[9][1] = 24;
        public_trasportlist.put(l[9],i[9]);

        l[10][0] = "Singapore Flyer";
        l[10][1] = "Zoo";
        i[10][0] = 1.89;
        i[10][1] = 85;
        public_trasportlist.put(l[10],i[10]);
        l[11][0] = "Vivo City";
        l[11][1] = "Marina Bay Sands";
        i[11][0] = 1.18;
        i[11][1] = 24;
        public_trasportlist.put(l[11],i[12]);
        l[12][0] = "Vivo City";
        l[12][1] = "Singapore Flyer";
        i[12][0] = 1.26;
        i[12][1] = 29;
        public_trasportlist.put(l[12],i[12]);
        l[13][0] = "Vivo City";
        l[13][1] = "Resorts World Sentosa";
        i[13][0] = 2.00;
        i[13][1] = 10;
        public_trasportlist.put(l[13],i[13]);
        l[14][0] = "Vivo City";
        l[14][1] = "Buddha Tooth Relic Temple";
        i[14][0] = 0.98;
        i[14][1] = 18;
        public_trasportlist.put(l[14],i[14]);
        l[15][0] = "Vivo City";
        l[15][1] = "Zoo";
        i[15][0] = 1.99;
        i[15][1] = 85;
        public_trasportlist.put(l[15],i[15]);
        l[16][0] = "Resorts World Sentosa";
        l[16][1] = "Marina Bay Sands";
        i[16][0] = 1.18;
        i[16][1] = 33;
        public_trasportlist.put(l[16],i[16]);
        l[17][0] = "Resorts World Sentosa";
        l[17][1] = "Singapore Flyer";
        i[17][0] = 1.26;
        i[17][1] = 38;
        public_trasportlist.put(l[17],i[17]);
        l[18][0] = "Resorts World Sentosa";
        l[18][1] = "Vivo City";
        i[18][0] = 0;
        i[18][1] = 10;
        public_trasportlist.put(l[18],i[18]);
        l[19][0] = "Resorts World Sentosa";
        l[19][1] = "Buddha Tooth Relic Temple";
        i[19][0] = 0.98;
        i[19][1] = 27;
        public_trasportlist.put(l[19],i[19]);
        l[20][0] = "Resorts World Sentosa";
        l[20][1] = "Zoo";
        i[20][0] = 1.99;
        i[20][1] = 92;
        public_trasportlist.put(l[20],i[20]);
        l[21][0] = "Buddha Tooth Relic Temple";
        l[21][1] = "Marina Bay Sands";
        i[21][0] = 0.88;
        i[21][1] = 18;
        public_trasportlist.put(l[21],i[21]);
        l[22][0] = "Buddha Tooth Relic Temple";
        l[22][1] = "Singapore Flyer";
        i[22][0] = 0.98;
        i[22][1] = 23;
        public_trasportlist.put(l[22],i[22]);
        l[23][0] = "Buddha Tooth Relic Temple";
        l[23][1] = "Vivo City";
        i[23][0] = 0.98;
        i[23][1] = 19;
        public_trasportlist.put(l[23],i[23]);
        l[24][0] = "Buddha Tooth Relic Temple";
        l[24][1] = "Resorts World Sentosa";
        i[24][0] = 3.98;
        i[24][1] = 28;
        public_trasportlist.put(l[24],i[24]);
        l[25][0] = "Buddha Tooth Relic Temple";
        l[25][1] = "Zoo";
        i[25][0] = 1.91;
        i[25][1] = 83;
        public_trasportlist.put(l[25],i[25]);
        l[26][0] = "Zoo";
        l[26][1] = "Marina Bay Sands";
        i[26][0] = 1.88;
        i[26][1] = 86;
        public_trasportlist.put(l[26],i[26]);
        l[27][0] = "Zoo";
        l[27][1] = "Singapore Flyer";
        i[27][0] = 1.96;
        i[27][1] = 87;
        public_trasportlist.put(l[27],i[27]);
        l[28][0] = "Zoo";
        l[28][1] = "Vivo City";
        i[28][0] = 2.11;
        i[28][1] = 86;
        public_trasportlist.put(l[28],i[28]);
        l[29][0] = "Zoo";
        l[29][1] = "Resorts World Sentosa";
        i[29][0] = 4.99;
        i[29][1] = 96;
        public_trasportlist.put(l[29],i[29]);
        l[30][0] = "Zoo";
        l[30][1] = "Buddha Tooth Relic Temple";
        i[30][0] = 1.91;
        i[30][1] = 84;
        public_trasportlist.put(l[30],i[30]);
    }


    public void taxi(HashMap<String[],double[]> taxilist){
        String[][] l1 = new String[100][2];
        double[][] i1 = new double[100][2];
        l1[0][0] = "Marina Bay Sands";
        l1[0][1] = "Singapore Flyer";
        i1[0][0] = 3.22;
        i1[0][1] = 3;
        taxilist.put(l1[0],i1[0]);
        l1[1][0] = "Marina Bay Sands";
        l1[1][1] = "Vivo City";
        i1[1][0] = 6.96;
        i1[1][1] = 14;
        taxilist.put(l1[1],i1[1]);
        l1[2][0] = "Marina Bay Sands";
        l1[2][1] = "Resorts World Sentosa";
        i1[2][0] = 8.50;
        i1[2][1] = 19;
        taxilist.put(l1[2],i1[2]);
        l1[3][0] = "Marina Bay Sands";
        l1[3][1] = "Buddha Tooth Relic Temple";
        i1[3][0] = 4.98;
        i1[3][1] = 8;
        taxilist.put(l1[3],i1[3]);
        l1[4][0] = "Marina Bay Sands";
        l1[4][1] = "Zoo";
        i1[4][0] = 18.40;
        i1[4][1] = 30;
        taxilist.put(l1[4],i1[4]);
        l1[5][0] = "Singapore Flyer";
        l1[5][1] = "Marina Bay Sands";
        i1[5][0] = 4.32;
        i1[5][1] = 6;
        taxilist.put(l1[5],i1[5]);
        l1[6][0] = "Singapore Flyer";
        l1[6][1] = "Vivo City";
        i1[6][0] = 7.84;
        i1[6][1] = 13;
        taxilist.put(l1[6],i1[6]);
        l1[7][0] = "Singapore Flyer";
        l1[7][1] = "Resorts World Sentosa";
        i1[7][0] = 9.38;
        i1[7][1] = 18;
        taxilist.put(l1[7],i1[7]);
        l1[8][0] = "Singapore Flyer";
        l1[8][1] = "Buddha Tooth Relic Temple";
        i1[8][0] = 4.76;
        i1[8][1] = 8;
        taxilist.put(l1[8],i1[8]);
        l1[9][0] = "Singapore Flyer";
        l1[9][1] = "Zoo";
        i1[9][0] = 18.18;
        i1[9][1] = 29;
        taxilist.put(l1[9],i1[9]);
        l1[10][0] = "Vivo City";
        l1[10][1] = "Marina Bay Sands";
        i1[10][0] = 8.30;
        i1[10][1] = 12;
        taxilist.put(l1[10],i1[10]);
        l1[11][0] = "Vivo City";
        l1[11][1] = "Singapore Flyer";
        i1[11][0] = 7.96;
        i1[11][1] = 14;
        taxilist.put(l1[11],i1[11]);
        l1[12][0] = "Vivo City";
        l1[12][1] = "Resorts World Sentosa";
        i1[12][0] = 4.54;
        i1[12][1] = 9;
        taxilist.put(l1[12],i1[12]);
        l1[13][0] = "Vivo City";
        l1[13][1] = "Buddha Tooth Relic Temple";
        i1[13][0] = 6.42;
        i1[13][1] = 11;
        taxilist.put(l1[13],i1[13]);
        l1[14][0] = "Vivo City";
        l1[14][1] = "Zoo";
        i1[14][0] = 22.58;
        i1[14][1] = 31;
        taxilist.put(l1[14],i1[14]);
        l1[15][0] = "Resorts World Sentosa";
        l1[15][1] = "Marina Bay Sands";
        i1[15][0] = 8.74;
        i1[15][1] = 13;
        taxilist.put(l1[15],i1[15]);
        l1[16][0] = "Resorts World Sentosa";
        l1[16][1] = "Singapore Flyer";
        i1[16][0] = 8.40;
        i1[16][1] = 14;
        taxilist.put(l1[16],i1[16]);
        l1[17][0] = "Resorts World Sentosa";
        l1[17][1] = "Vivo City";
        i1[17][0] = 3.22;
        i1[17][1] = 4;
        taxilist.put(l1[17],i1[17]);
        l1[18][0] = "Resorts World Sentosa";
        l1[18][1] = "Buddha Tooth Relic Temple";
        i1[18][0] = 6.64;
        i1[18][1] = 12;
        taxilist.put(l1[18],i1[18]);
        l1[19][0] = "Resorts World Sentosa";
        l1[19][1] = "Zoo";
        i1[19][0] = 22.80;
        i1[19][1] = 32;
        taxilist.put(l1[19],i1[19]);
        l1[20][0] = "Buddha Tooth Relic Temple";
        l1[20][1] = "Marina Bay Sands";
        i1[20][0] = 5.32;
        i1[20][1] = 7;
        taxilist.put(l1[20],i1[20]);
        l1[21][0] = "Buddha Tooth Relic Temple";
        l1[21][1] = "Singapore Flyer";
        i1[21][0] = 4.76;
        i1[21][1] = 8;
        taxilist.put(l1[21],i1[21]);
        l1[22][0] = "Buddha Tooth Relic Temple";
        l1[22][1] = "Vivo City";
        i1[22][0] = 4.98;
        i1[22][1] = 9;
        taxilist.put(l1[22],i1[22]);
        l1[23][0] = "Buddha Tooth Relic Temple";
        l1[23][1] = "Resorts World Sentosa";
        i1[23][0] = 6.52;
        i1[23][1] = 14;
        taxilist.put(l1[23],i1[23]);
        l1[24][0] = "Buddha Tooth Relic Temple";
        l1[24][1] = "Zoo";
        i1[24][0] = 18.40;
        i1[24][1] = 30;
        taxilist.put(l1[24],i1[24]);
        l1[25][0] = "Zoo";
        l1[25][1] = "Marina Bay Sands";
        i1[25][0] = 22.48;
        i1[25][1] = 32;
        taxilist.put(l1[25],i1[25]);
        l1[26][0] = "Zoo";
        l1[26][1] = "Singapore Flyer";
        i1[26][0] = 19.40;
        i1[26][1] = 29;
        taxilist.put(l1[26],i1[26]);
        l1[27][0] = "Zoo";
        l1[27][1] = "Vivo City";
        i1[27][0] = 21.48;
        i1[27][1] = 32;
        taxilist.put(l1[27],i1[27]);
        l1[28][0] = "Zoo";
        l1[28][1] = "Resorts World Sentosa";
        i1[28][0] = 23.68;
        i1[28][1] = 36;
        taxilist.put(l1[28],i1[28]);
        l1[29][0] = "Zoo";
        l1[29][1] = "Buddha Tooth Relic Temple";
        i1[29][0] = 21.60;
        i1[29][1] = 30;
        taxilist.put(l1[29],i1[29]);

    }

    public void footway(HashMap<String[],double[]> footlist){
        String[][] l2 = new String[100][2];
        double[][] i2 = new double[100][2];
        l2[0][0] = "Marina Bay Sands";
        l2[0][1] = "Singapore Flyer";
        i2[0][0] = 0;
        i2[0][1] = 14;
        footlist.put(l2[0],i2[0]);
        l2[1][0] = "Marina Bay Sands";
        l2[1][1] = "Vivo City";
        i2[1][0] = 0;
        i2[1][1] = 69;
        footlist.put(l2[1],i2[1]);
        l2[2][0] = "Marina Bay Sands";
        l2[2][1] = "Resorts World Sentosa";
        i2[2][0] = 0;
        i2[2][1] = 76;
        footlist.put(l2[2],i2[2]);
        l2[3][0] = "Marina Bay Sands";
        l2[3][1] = "Buddha Tooth Relic Temple";
        i2[3][0] = 0;
        i2[3][1] = 28;
        footlist.put(l2[3],i2[3]);
        l2[4][0] = "Marina Bay Sands";
        l2[4][1] = "Zoo";
        i2[4][0] = 0;
        i2[4][1] = 269;
        footlist.put(l2[4],i2[4]);
        l2[5][0] = "Singapore Flyer";
        l2[5][1] = "Marina Bay Sands";
        i2[5][0] = 0;
        i2[5][1] = 14;
        footlist.put(l2[5],i2[5]);
        l2[6][0] = "Singapore Flyer";
        l2[6][1] = "Vivo City";
        i2[6][0] = 0;
        i2[6][1] = 81;
        footlist.put(l2[6],i2[6]);
        l2[7][0] = "Singapore Flyer";
        l2[7][1] = "Resorts World Sentosa";
        i2[7][0] = 0;
        i2[7][1] = 88;
        footlist.put(l2[7],i2[7]);
        l2[8][0] = "Singapore Flyer";
        l2[8][1] = "Buddha Tooth Relic Temple";
        i2[8][0] = 0;
        i2[8][1] = 39;
        footlist.put(l2[8],i2[8]);
        l2[9][0] = "Singapore Flyer";
        l2[9][1] = "Zoo";
        i2[9][0] = 0;
        i2[9][1] = 264;
        footlist.put(l2[9],i2[9]);
        l2[10][0] = "Vivo City";
        l2[10][1] = "Marina Bay Sands";
        i2[10][0] = 0;
        i2[10][1] = 69;
        footlist.put(l2[10],i2[10]);
        l2[11][0] = "Vivo City";
        l2[11][1] = "Singapore Flyer";
        i2[11][0] = 0;
        i2[11][1] = 81;
        footlist.put(l2[11],i2[11]);
        l2[12][0] = "Vivo City";
        l2[12][1] = "Resorts World Sentosa";
        i2[12][0] = 0;
        i2[12][1] = 12;
        footlist.put(l2[12],i2[12]);
        l2[13][0] = "Vivo City";
        l2[13][1] = "Buddha Tooth Relic Temple";
        i2[13][0] = 0;
        i2[13][1] = 47;
        footlist.put(l2[13],i2[13]);
        l2[14][0] = "Vivo City";
        l2[14][1] = "Zoo";
        i2[14][0] = 0;
        i2[14][1] = 270;
        footlist.put(l2[14],i2[14]);
        l2[15][0] = "Resorts World Sentosa";
        l2[15][1] = "Marina Bay Sands";
        i2[15][0] = 0;
        i2[15][1] = 76;
        footlist.put(l2[15],i2[15]);
        l2[16][0] = "Resorts World Sentosa";
        l2[16][1] = "Singapore Flyer";
        i2[16][0] = 0;
        i2[16][1] = 88;
        footlist.put(l2[16],i2[16]);
        l2[17][0] = "Resorts World Sentosa";
        l2[17][1] = "Vivo City";
        i2[17][0] = 0;
        i2[17][1] = 12;
        footlist.put(l2[17],i2[17]);
        l2[18][0] = "Resorts World Sentosa";
        l2[18][1] = "Buddha Tooth Relic Temple";
        i2[18][0] = 0;
        i2[18][1] = 55;
        footlist.put(l2[18],i2[18]);
        l2[19][0] = "Resorts World Sentosa";
        l2[19][1] = "Zoo";
        i2[19][0] = 0;
        i2[19][1] = 285;
        footlist.put(l2[19],i2[19]);
        l2[20][0] = "Buddha Tooth Relic Temple";
        l2[20][1] = "Marina Bay Sands";
        i2[20][0] = 0;
        i2[20][1] = 28;
        footlist.put(l2[20],i2[20]);
        l2[21][0] = "Buddha Tooth Relic Temple";
        l2[21][1] = "Singapore Flyer";
        i2[21][0] = 0;
        i2[21][1] = 39;
        footlist.put(l2[21],i2[21]);
        l2[22][0] = "Buddha Tooth Relic Temple";
        l2[22][1] = "Vivo City";
        i2[22][0] = 0;
        i2[22][1] = 47;
        footlist.put(l2[22],i2[22]);
        l2[23][0] = "Buddha Tooth Relic Temple";
        l2[23][1] = "Resorts World Sentosa";
        i2[23][0] = 0;
        i2[23][1] = 55;
        footlist.put(l2[23],i2[23]);
        l2[24][0] = "Buddha Tooth Relic Temple";
        l2[24][1] = "Zoo";
        i2[24][0] = 0;
        i2[24][1] = 264;
        footlist.put(l2[24],i2[24]);
        l2[25][0] = "Zoo";
        l2[25][1] = "Marina Bay Sands";
        i2[25][0] = 0;
        i2[25][1] = 269;
        footlist.put(l2[25],i2[25]);
        l2[26][0] = "Zoo";
        l2[26][1] = "Singapore Flyer";
        i2[26][0] = 0;
        i2[26][1] = 264;
        footlist.put(l2[26],i2[26]);
        l2[27][0] = "Zoo";
        l2[27][1] = "Vivo City";
        i2[27][0] = 0;
        i2[27][1] = 270;
        footlist.put(l2[27],i2[27]);
        l2[28][0] = "Zoo";
        l2[28][1] = "Resorts World Sentosa";
        i2[28][0] = 0;
        i2[28][1] = 285;
        footlist.put(l2[28],i2[28]);
        l2[29][0] = "Zoo";
        l2[29][1] = "Buddha Tooth Relic Temple";
        i2[29][0] = 0;
        i2[29][1] = 264;
        footlist.put(l2[29],i2[29]);
    }

    public static void generatePerm(ArrayList<String> input, int index,ArrayList<ArrayList<String>> output){
        if (input.size() - index == 1) {
            output.add(new ArrayList<String>(input));
        }
        else {
            for (int i = index; i < input.size(); i++) {
                Collections.swap(input, i, index);
                generatePerm(input, index + 1,output);
                Collections.swap(input, index, i);
            }
        }

    }


    public ArrayList<String> brute(ArrayList<String> mlist, double budget){
        HashMap<String[],double[]> public_trasportlist = new HashMap<String[], double[]>();
        String hotel = "Marina Bay Sands";
        public_transport(public_trasportlist);

        HashMap<String[],double[]> taxilist = new HashMap<>();
        taxi(taxilist);

        HashMap<String[],double[]> footlist = new HashMap<>();
        footway(footlist);


        final ArrayList<ArrayList<String>> alllist = new ArrayList<>(); // need to set it as final !!!!
        generatePerm(mlist,0,alllist);


        ArrayList<String> result = new ArrayList<>();
        ArrayList<Double> timelist = new ArrayList<>();



        for (ArrayList<String> mylist : alllist) {
            ArrayList<String> location = new ArrayList<>();
            location.add(hotel);
            for (String k : mylist) {
                location.add(k);
            }

            location.add(hotel); // list from hotel to n-1 location to hotel

            Tree_Android Tree = new Tree_Android();
            ArrayList<Node> treelist = new ArrayList<>();
            treelist.add(new Node(location.get(0), "Starting", 0, 0));


            for (int j = 0; j < location.size() - 1; j++) {
                String[] check = new String[2];
                check[0] = location.get(j);
                check[1] = location.get(j + 1);


                for (int k = 0; k < Math.pow(3, j); k++) {
                    for (String[] key : public_trasportlist.keySet()) {
                        if (key[0].equals(check[0]) && key[1].equals(check[1])) {
                            Node node = new Node(key[1], "public_transport", public_trasportlist.get(key)[0], public_trasportlist.get(key)[1]);
                            treelist.add(node);
                        }
                    }
                    for (String[] key : taxilist.keySet()) {
                        if (key[0].equals(check[0]) && key[1].equals(check[1])) {
                            Node node = new Node(key[1], "taxi", taxilist.get(key)[0], taxilist.get(key)[1]);
                            treelist.add(node);
                        }
                    }
                    for (String[] key : footlist.keySet()) {
                        if (key[0].equals(check[0]) && key[1].equals(check[1])) {
                            Node node = new Node(key[1], "foot", footlist.get(key)[0], footlist.get(key)[1]);
                            treelist.add(node);
                        }
                    }
                }
            }

            Tree.FormTree(treelist, 0);

            HashMap<String[], double[]> thelist;
            String output;
            String[] str = new String[2];
            double time = 9999;
            double fee = 0;

            thelist = Tree.getPaths(Tree.getRoot());
            for (String[] key : thelist.keySet()) {
                if (thelist.get(key)[1] <= budget) {
                    if (thelist.get(key)[0] < time) {
                        time = thelist.get(key)[0];
                        fee = thelist.get(key)[1];
                    }
                }
            }

            for (String[] key : thelist.keySet()) {
                if (thelist.get(key)[0] == time) {
                    str = key;
                }
            }

            output = "Location: " + str[0] + "transport: " + str[1] + " total time: " + time +" total fee: " + fee;
            result.add(output);
            timelist.add(time);
        }
        double timeout = timelist.get(0);
        ArrayList<String> finalresult = new ArrayList<>();
        for (int p=1;p<timelist.size();p++){
            if(timelist.get(p)<timeout){
                timeout = timelist.get(p);
            }
        }
        for (int i=0; i<timelist.size();i++){
            if(timeout == timelist.get(i)){
                finalresult.add(result.get(i));
            }
        }
        return finalresult;

    }


    public static void main(String[] args) {
        ArrayList<String> mlist = new ArrayList<>();
        mlist.add("Singapore Flyer");
        mlist.add("Vivo City");
        mlist.add("Resorts World Sentosa");
        mlist.add("Buddha Tooth Relic Temple");
        mlist.add("Zoo");

        ArrayList<String> out;
        brute_force result = new brute_force();
        out = result.brute(mlist,20.0);
        for(String i : out) {
            System.out.println("Location: " + i);
        }
    }



}


