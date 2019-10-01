import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class RasulJavaLearn {

    public static void main(String[] args) {
        int[][] array = new int [3][3];
        array[0][0] = 10;
        array[0][1] = 10;
        array[0][2] = 10;

        array[1][0] = 10;
        array[1][1] = 0;
        array[1][2] = 10;

        array[2][0] = 10;
        array[2][1] = 10;
        array[2][2] = 10;


        solution(array);
        System.out.println(solution(array));
    }

    public static int solution(int[][] A) {
        // write your code in Java SE 8
        System.out.println(A.length);
        int i = 0; int j=0;
        int val = A[i][j];
        Map<Integer, Long> map = new HashMap<>();
        recur(i, j, val, A.length, A, map);


        map.put(4, 1l);
//        map.entrySet().stream().sorted((a, b) -> {
//            return a.getValue() - b.getValue() ;
//        }).forEach(value->{
//            System.out.println(value.getValue());
//        });

        Stream<Map.Entry<Integer,Long>> sorted =
                map.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue());
        String res = sorted.findFirst().get().getValue() + "";
        int counter = 0;
        boolean ends = true;
        while(ends) {
            if(res.endsWith("0")) {
                res = res.substring(0, res.length()-1);
                counter ++;
            } else {
                ends = false;
            }

        }

        return counter;
        //        for(Map.Entry<Integer, Long> entry: ) {
//            System.out.println(entry.getKey() + " - "  +entry.getValue());
//        }


    }

    public static void recur(int i, int j, long val, int len, int [][]A, Map<Integer, Long> map) {
        if(!(i == len-1 && j == len-1)) {
            System.out.println("i, j" + i + ","+j);
            int oldI = i;

            i=i+1;
            if(i<len){
                val = val * A[i][j];
                recur(i, j, val, len, A, map);
            } else {

                j=j+1;
                i-=1;
                if(j<len){
                    val = val * A[i][j];
                    recur(i, j, val, len, A, map);
                }
//                int mapSize = map.size();
//                map.put(mapSize, val);
            }

            j=j+1;
            if(j<len){
                val = val * A[oldI][j];
                recur(oldI, j, val, len, A, map);
            } else {

                j-=1;
                oldI=oldI+1;
                if(oldI<len){
                    val = val * A[oldI][j];
                    recur(oldI, j, val, len, A, map);
                }
//                int mapSize = map.size();
//                map.put(mapSize, val);

            }
        } else {
            int mapSize = map.size();
            map.put(mapSize, val);
        }

//        MessageDigest.getInstance("SHA", "");
    }
}

