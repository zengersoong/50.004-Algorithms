package Two_D;



import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import sat.formula.Clause;
import sat.formula.Formula;
import sat.formula.Literal;
import sat.formula.PosLiteral;

public class randomiseTest {
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
            fin = new File("C:\\Users\\Zenger Soong\\Documents\\Workspace-Offline\\Two_D\\src\\sat\\test\\largeSat.cnf"); //import file
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
                    if (tempLine.length > 3){
                        throw new InputMismatchException("INVALID INPUT");
                    }
                    if (tempLine.length == 3 && Integer.parseInt(tempLine[2])!=0){
                        throw new InputMismatchException("INVALID INPUT");
                    }
                    if (tempLine.length == 2 && Integer.parseInt(tempLine[1])!=0){
                        throw new InputMismatchException("INVALID INPUT");
                    }
                    if (Integer.parseInt(tempLine[0])==0){
                        throw new InputMismatchException("INVALID INPUT");
                    }
                    // invalid input: 1 2 3 4 0;  2SAT, literal cannot more than 2
                    //                1 2 3; the last one should be 0 to next clause
                    //                1 0 2;
                    //                1 2;
                    //                0 1 2;
                    Clause c = new Clause();
                    for (String i : tempLine) {
                        if (Integer.parseInt(i) == 0) {
                            state++; // if is next clause, state++
                            break;
                        }
                        Literal literal = PosLiteral.make(Integer.toString(Math.abs(Integer.parseInt(i))));//makes literal instance
                        alist[state] = Integer.parseInt(tempLine[0]);
                        blist[state] = Integer.parseInt(tempLine[1]);


                        if ((Integer.parseInt(i)) < 0) { //add the negated Integer to the clause if string is negative
                            c = c.add(literal.getNegation());
                        } else if ((Integer.parseInt(i)) > 0) { //add the postitive Integer to the clause if string is positive
                            c = c.add(literal);
                        }
                    }
                    f = f.addClause(c); //add the clauses to the formula
                }
            }
            long endReadTime = System.nanoTime();
            long tReadTime = endReadTime - readTime;
            System.out.println("Reading Time: " + tReadTime / 1000000000.0 + "s");
            System.out.println("randomize starts");
            long started = System.nanoTime();
            randomize r = new randomize();
            boolean statecheck = r.randomized(alist,blist);
            long time = System.nanoTime();
            long timeTaken = time - started;
            System.out.println("Solving Time: " + timeTaken / 1000000.0 + "ms");
            System.out.println("Total Time: " + (timeTaken + tReadTime) / 1000000000.0 + "s");
            if (!statecheck) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }

        /*catch (NumberFormatException e){
            System.out.println("INVALID INPUT");*/
        }
        finally {
            if (bin != null) {
                bin.close();

            }
        }
    }
}
