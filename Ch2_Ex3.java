import java.util.Arrays;
import java.util.Collection;
public class Ch2_Ex3 {
    public static void main(String[] args){
        String[] arr = { "China, USA, LA, Thailand"};
        Array.sort(arr, Collections.reverseOrder());
        System.out.println(Array.toString(arr));
    }
}
