package suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LeetCode406 {
    public static void main(String[] args) {

        int[][] a={
                {7,0},
                {4,4},
                {7,1},
                {5,0},
                {6,1},
                {5,2},

        };
        reconstructQueue(a);
    }

    /**
     * 假设有打乱顺序的一群人站成一个队列。
     * 每个人由一个整数对(h, k)表示，
     * 其中h是这个人的身高，
     * k是排在这个人前面且身高大于或等于h的人数。
     * 编写一个算法来重建这个队列。
     *
     * 注意：
     * 总人数少于1100人。
     *
     * 示例
     *
     * 输入:
     * [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
     *
     * 输出:
     * [[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
     * @param people
     * @return
     */
    public static int[][] reconstructQueue(int[][] people) {


        //o[0] 这个人的身高 h
        //o[1] 排在这个人前面且身高大于或等于h的人数 k
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                //   如果两个人身高相同，则按照k升序排列；
                //   如果两个人身高不相同，则按照身高降序排列。
                return o1[0]==o2[0]?o1[1]-o2[1]:o2[0]-o1[0];
            }
        });
        print(people);
        List<int[]> list=new ArrayList<>();
        for (int i = 0; i <people.length ; i++) {
            //在列表的指定位置插入指定元素（可选操作）。
            // 将当前处于该位置的元素（如果有的话）和所有后续元素向右移动
            list.add(people[i][1],people[i]);
        }
        System.out.println("____________");
        print(list.toArray(new int[list.size()][]));

        return list.toArray(new int[list.size()][]);
    }


    public static void print(int[][] test){
        for (int i=0;i<test.length;i++)
            System.out.println ( Arrays.toString (test[i]));
    }
}
