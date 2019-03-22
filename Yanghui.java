package suanfa;

import java.util.ArrayList;
import java.util.Scanner;

public class Yanghui {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        Yanghui yanghui=new Yanghui();
        yanghui.generate(num);
        System.out.println(yanghui.generate(num));

    }

    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
        if (numRows==0)
            return lists;
        lists.add(new ArrayList<>());
        lists.get(0).add(1);
        for (int i=1;i<numRows;i++){
            ArrayList<Integer> temp =new ArrayList<>();
            temp.add(1);
            for (int j = 1; j <i ; j++) {
                temp.add(lists.get(i-1).get(j-1)+lists.get(i-1).get(j));
            }
            temp.add(1);
            lists.add(temp);
        }
        return lists;
    }
}
