import java.util.Arrays;

public class Ch2_Ex3 {
    public static void main(String[] args) {
        String[] strarray = { "Denmark", "Belarus", "Estonia", "Ukraine", "France", "New Zealand", "Afghanistan",
                "Cambodia" };
        // sorts array[] in descending order
        Arrays.sort(strarray); // strarray cuz it's string
        System.out.println("Array elements in descending order: " + Arrays.toString(strarray));
    }
}