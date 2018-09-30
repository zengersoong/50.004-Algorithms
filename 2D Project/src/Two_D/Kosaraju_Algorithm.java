package Two_D;

import java.util.ArrayList;
import java.util.List;


import Two_D.Stack.*;

public class Kosaraju_Algorithm {
    int Maxclause = 6000; // since our 2D set the max is 6000. in case the buffer, we set as 8000
    int[][] normal = new int[2*Maxclause][Maxclause];
    int[][] Inverter = new int[2*Maxclause][Maxclause];
    boolean[] visited = new boolean[2*Maxclause];
    boolean[] visitedInv = new boolean[2*Maxclause];
    Stack stack = new Stack();

    int[] scc = new int [2*Maxclause]; // array to store from 0 to n-1 (normal) and n to n+n-1 (Inverter)
    int ctr =1; // counter the cycle in scc
    int state=0;
    public void insertClause(int a, int b){
        if (normal[a][state]==0){
            normal[a][state]=b;
            state=0;
        }
        else{
            state++;
            insertClause(a,b); // insert element to the empty space
            }
        }


    public void insertClauseInv(int a, int b){;
        if (Inverter[b][state]==0){
            Inverter[b][state]=a;
            state=0;
        }
        else{
            state++;
            insertClauseInv(a,b);
        }
    }

    public void FirstStep(int u){
        if (visited[u]){ // if it is visited, return
            return ;
        }

        visited[u] = true; // if did not visited, make it visited
        System.out.println(u);

        for (int i =0; i<normal[u].length; i++){
            if(normal[u].length!=0){
                FirstStep(normal[u][i]);
            }
        }
        stack.push(u);
    }

    public void SecondStep(int u){
        if (visitedInv[u]){
            return ;
        }

        visitedInv[u] = true;

        for (int i =0; i<Inverter[u].length; i++){
            if(Inverter[u].length!=0 && Inverter[u][0]!=0) {
                SecondStep(Inverter[u][i]);
            }
        }

        scc[u] = ctr; // when the circle is done, ctr ++
    }
}
