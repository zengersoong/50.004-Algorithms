package sat;

/*
import static org.junit.Assert.*;

import org.junit.Test;
*/

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import Two_D.Two_SAT;
import sat.env.Environment;
import sat.formula.Clause;
import sat.formula.Formula;
import sat.formula.Literal;
import sat.formula.PosLiteral;


public class SATSolverTest {
    Literal a = PosLiteral.make("a");
    Literal b = PosLiteral.make("b");
    Literal c = PosLiteral.make("c");
    Literal na = a.getNegation();
    Literal nb = b.getNegation();
    Literal nc = c.getNegation();


    // TODO: add the main method that reads the .cnf file and calls SATSolver.solve to determine the satisfiability
    public static void main(String args[]) throws IOException {
        System.out.println("Reading File");
        long readTime = System.nanoTime();
        File fin = null;
        Scanner bin = null;

        try {
            fin = new File("C:\\Users\\Zenger Soong\\Documents\\Workspace-Offline\\Two_D\\src\\Two_D\\largeSat.cnf"); //import file
            bin = new Scanner(fin);

            String line;
            bin.nextLine();//remove the commented part
            String[] format = bin.nextLine().split(" ");
            int NumberOfClauses = Integer.parseInt(format[3]);//get the number of clauses
            Formula f = new Formula(); //create and instance of the formula
            int[] alist = new int[6000];
            int[] blist = new int[6000];
            int state =0;
            while (f.getSize() != NumberOfClauses) {
                line = bin.nextLine();
                if (line.length() > 0) {
                    String[] tempLine = line.split(" ");
                    Clause c = new Clause();
                    for (String i : tempLine) {
                        if (Integer.parseInt(i) == 0) {
                            state++; // if is next clause, state++
                            break;
                        }
                        Literal literal = PosLiteral.make(Integer.toString(Math.abs(Integer.parseInt(i))));//makes literal instance
                        alist[state]=Integer.parseInt(tempLine[0]);
                        blist[state]=Integer.parseInt(tempLine[1]);


                        if ((Integer.parseInt(i)) < 0) { //add the negated Integer to the clause if string is negative
                            c = c.add(literal.getNegation());
                        } else if ((Integer.parseInt(i)) > 0) { //add the postitive Integer to the clause if string is positive
                            c = c.add(literal);
                        }
                    }
                    f = f.addClause(c); //add the clauses to the formula


                }
            }
            String fileName = "D:/2D output/BoolAssignment.txt";
            PrintWriter write = new PrintWriter(fileName, "UTF-8");
            long endReadTime = System.nanoTime();
            long tReadTime = endReadTime - readTime;
            System.out.println("Reading Time: " + tReadTime / 1000000000.0 + "s");
            System.out.println("2SAT starts");
            long started = System.nanoTime();
            Two_SAT two_sat = new Two_SAT();
            boolean statecheck = two_sat.sat(alist,blist);
            long time = System.nanoTime();
            long timeTaken = time - started;
            System.out.println("Solving Time: " + timeTaken / 1000000.0 + "ms");
            System.out.println("Total Time: " + (timeTaken + tReadTime) / 1000000000.0 + "s");
            if (!statecheck) {
                System.out.println("Unsatisfiable");
            } else {
                System.out.println("Satisfiable");
                Environment env = SATSolver.solve(f);
                String bindings = env.toString();
                bindings = bindings.substring(bindings.indexOf("[") + 1, bindings.indexOf("]"));
                String[] bindingNew = bindings.split(", ");
                int length = bindingNew.length;
                int[] result = new int[length];
                for (int i =0; i<length;i++) {
                    String[] bind = bindingNew[i].split("->");
                    int bind0 = Integer.parseInt(bind[0])-1;
                    if(bind[1].equals("TRUE")) {
                        result[bind0] =1;
                    }
                    else{
                        result[bind0] =0;
                    }
                }
                for (int j =0; j<length;j++) {
                    System.out.print(result[j] +",");
                }
            }
            write.close();
        } finally {
            if (bin != null) {
                bin.close();

            }
        }
    }
}