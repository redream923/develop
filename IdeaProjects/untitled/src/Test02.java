import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author dpc
 * @create 2021-07-17 上午 11:26
 */
public class Test02 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 4, 2, 5, 4, 5, 8, 7, 8, 77, 88, 5, 4, 9, 6, 2, 4, 1, 5};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if( !hm.containsKey(arr[i]) ){
                hm.put(arr[i],1);
            }else {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
        }
        StringBuilder sb = new StringBuilder();
        Set<Map.Entry<Integer, Integer>> entrySets = hm.entrySet();
        for(Map.Entry<Integer, Integer> entry : entrySets ){
            sb.append(entry.getKey()+"出现:"+entry.getValue() +"次\n");
        }
        System.out.println(sb);
    }
}
