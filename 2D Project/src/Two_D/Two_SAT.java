package Two_D;



public class Two_SAT {
    public boolean sat(int a[], int b[]){
        int clauseNum = a.length;
        int variable = 6000;
        Kosaraju_Algorithm k = new Kosaraju_Algorithm();
        for (int i =0; i<clauseNum; i++){
            if(a[i]>0 && b[i]==0){
                k.insertClause(a[i]+variable,a[i]);
                k.insertClauseInv(a[i]+variable,a[i]);
            }
            else if(a[i]<0 && b[i]==0){
                k.insertClause(-a[i],variable-a[i]);
                k.insertClauseInv(-a[i],variable-a[i]);
            }
            else if (a[i]>0 && b[i]>0){ // +  + (+->original; - -> not )
                k.insertClause(a[i]+variable,b[i]);
                k.insertClause(b[i]+variable,a[i]);
                k.insertClauseInv(a[i]+variable,b[i]);
                k.insertClauseInv(b[i]+variable,a[i]);
            }

            else if (a[i]>0 && b[i]<0){ // +  -
                k.insertClause(a[i]+variable,variable-b[i]);
                k.insertClause(-b[i],a[i]);
                k.insertClauseInv(a[i]+variable,variable-b[i]);
                k.insertClauseInv(-b[i],a[i]);
            }

            else if (a[i]<0 && b[i]>0){ // -  +
                k.insertClause(-a[i], b[i]);
                k.insertClause(b[i]+variable,variable-a[i]);
                k.insertClauseInv(-a[i], b[i]);
                k.insertClauseInv(b[i]+variable, variable-a[i]);
            }

            else if (a[i]<0 && b[i]<0){ // -  -
                k.insertClause(-a[i], variable-b[i]);
                k.insertClause(-b[i],variable-a[i]);
                k.insertClauseInv(-a[i], variable-b[i]);
                k.insertClauseInv(-b[i], variable-a[i]);
            }

        }
/*        // need to consider the situation when there are some unit clause which cannot reply for scc method
        int[] l = new int[2*6000]; //if all unit clause, just to test whether got A and not A at the same time.then it is unsat
        int pt = 0;
        for (int i1=0; i1<a.length;i1++) {
            if (b[i1] == 0) {
                if (a[i1] > 0) {
                    l[pt] = a[i1];
                } else if (a[i1] < 0) {
                    l[pt + 6000] = a[i1];
                }
            }
        }*/
/*
                if (k.normal[a[i1]].length!=0) {
                    counter++;
                }
                else if(k.Inverter[a[i1]].length!=0){
                    counter++;
                }
                else if(counter==2){
                    return false;
                }*/




        for(int i =0; i<2*variable;i++){
            if (!k.visited[i]){
                System.out.println(k.visited[i]);
                k.FirstStep(i); // form the scc graph
            }
        }

        while (!k.stack.isEmpty()){
            int pop = k.stack.top();
            k.stack.pop();

            if (!k.visitedInv[pop]){
                k.SecondStep(pop); // get the counter for each element
                k.ctr++;
            }
        }

        boolean state=true;
        for (int i =0; i<variable;i++){
            if(k.scc[i] == k.scc[i+variable]){ // if find out A and not A in the same counter which means it do a cycle, which is unsatisfiable
                state=false;
            }
        }
        return state;
    }

    public static void main(String[] args) {

        int[] a ={-1,-2,2,2,-6,1,1,-5,-1,-3,3,3,-4,2,-2,-3};
        int[] b ={-4,-7,-6,7,7,-5,7,7,-7,6,-4,-6,-6,5,3,0};
        Two_SAT t = new Two_SAT();
        t.sat(a,b);
        System.out.println(t.sat(a,b));

        int[] a2= {1, -1, -1,-2,4};
        int[] b2= {1, 2, 3,-3,5};
        Two_SAT t2 = new Two_SAT();
        t.sat(a2,b2);
        System.out.println(t2.sat(a2,b2));
/*

        int[] a1 ={1, -1, 3, -2};
        int[] b1 ={2, 3, 4, -4};
        Two_SAT t1 = new Two_SAT();
        t1.sat(a1,b1);
        System.out.println(t1.sat(a1,b1));*/
    }

}
