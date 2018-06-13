import java.util.*;

public class Leet {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> list = twoSum(arr);

        for (List<Integer> l : list) {
            for (Integer i : l) {
                System.out.println(i + " ");
            }
            System.out.println();
        }

    }

    public static List<List<Integer>> twoSum(int[] nums) {
        List<List<Integer>> result;
        HashSet<List<Integer>> hs=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j == i)
                    continue;
                outerloop:
                for (int k = 0; k < nums.length; k++) {
                    if (k == j || k == i)
                        continue;
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        ArrayList<Integer> trplet = new ArrayList<>();
                        trplet.add(nums[i]);
                        trplet.add(nums[j]);
                        trplet.add(nums[k]);
                        Collections.sort(trplet);
                        hs.add(trplet);
                        break;
                    }

                }
            }
        }
        result= new ArrayList<>(hs);
        return result;
    }
}
