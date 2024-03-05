import java.util.*;

public class Suits5 {
    public static void main(String[] args) {
        System.out.println("FIRST: ");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(32);
        list.add(12);
        list.add(5);
        list.add(125);
        System.out.println(massiivHulkadeks(list));

        System.out.println("SECOND: ");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("üks");
        list2.add("kaks");
        list2.add("kolm");
        list2.add("kaks");
        list2.add("neli");
        list2.add("üks");
        list2.add("viis");
        list2.add("kaks");
        list2.add("kolm");
        list2.add("neli");
        list2.add("viis");
        list2.add("üks");
        list2.add("üks");
        list2.add("kaks");

        Map<Character, Integer> result = algustäheKordused(list2);
        System.out.println(result);
    }

    public static Set<HashSet<Integer>> massiivHulkadeks(ArrayList<Integer> list) {
        Set<HashSet<Integer>> subsets = new HashSet<>();
        // using binary search - could be better solution for long arrays
        Collections.sort(list);
        int end = list.size() - 1;
        int lastLessThan100 = -1;
        for (int i = 0; i < list.size(); i++) {
            int start = 0;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (list.get(mid) < 100) {
                    lastLessThan100 = mid;
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        HashSet<Integer> firstSubset = new HashSet<>(list.subList(0, lastLessThan100 + 1));
        subsets.add(firstSubset);
//        System.out.println(firstSubset);

        HashSet<Integer> secondSubset = new HashSet<>(list.subList(lastLessThan100 + 1, list.size()));
        subsets.add(secondSubset);
//        System.out.println(secondSubset);

        return subsets;
    }

    public static Map<Character, Integer> algustäheKordused(ArrayList<String> list) {
        Map<Character, Integer> resultMap = new HashMap<>();
        // possibly may not work on very big arrays
        for (String word : list) {
            char firstChar = word.charAt(0);
            resultMap.put(firstChar, resultMap.getOrDefault(firstChar, 0) + 1);
        }
        return resultMap;
    }
}
