import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TuringTest {
    public static void main(String[] args){
        String[] arr={"5", "-2","4","C","D","9","+","+"};
        System.out.println(findsum(arr));
    }
    public static int findsum(String[] ops){
        int result=0;
        List<Integer> li=new ArrayList<>();
        for (int i = 0; i < ops.length; i++) {
            switch (ops[i]) {
                case "C" -> li.remove(li.size() - 1);
                case "D" -> li.add(li.get(li.size() - 1) * 2);
                case "+" -> li.add((li.get(li.size() - 2) + li.get(li.size() - 1)));
                default -> li.add(Integer.parseInt(ops[i]));
            }
        }

        for (int i = 0; i < li.size(); i++) {
           result+=li.get(i);
        }
        System.out.println(li);
        return result;
    }
}
