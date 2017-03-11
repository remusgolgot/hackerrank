package crossover;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by remus.golgot on 3/11/2017.
 *
 */
public class SuperStack {

    /**
     * Complete the function below.
     */
    static void superStack(String[] operations) {

    List<Integer> auxList = new ArrayList<>();

        for (int i=0;i<operations.length;i++) {


            if (operations[i].contains("pop")) {
                auxList.remove(auxList.size() -1);
            }
            if (operations[i].contains("push")) {
                auxList.add(Integer.valueOf(operations[i].split(" ")[1]));
            }
            if (operations[i].contains("inc")) {

                int e = Integer.parseInt(operations[i].split(" ")[1]);
                int k = Integer.parseInt(operations[i].split(" ")[2]);

                for (int j = 0; j < e; j++) {
                    int t = auxList.get(j);
                    auxList.set(j,t+k);
                }
            }
            System.out.println(auxList.size() == 0 ? "EMPTY" : auxList.get(auxList.size() -1));
        }

    }

    /**
     * DO NOT MODIFY THIS METHOD!
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int _operations_size = Integer.parseInt(in.nextLine().trim());
        String[] _operations = new String[_operations_size];
        String _operations_item;
        for(int _operations_i = 0; _operations_i < _operations_size; _operations_i++) {
            try {
                _operations_item = in.nextLine();
            } catch (Exception e) {
                _operations_item = null;
            }
            _operations[_operations_i] = _operations_item;
        }

        superStack(_operations);
    }

}
