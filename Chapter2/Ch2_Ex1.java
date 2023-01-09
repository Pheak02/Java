import java.util.Scanner;

public class Ch2_Ex1 {
    public static void main(String[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String a = sc.nextLine();
        a=a.trim();
        a=a+ "";
        int l = a.length();
        int ll=0; //to store the length of the longest word
        String b = "";//to store the words temporarily
        string f="";//to store the longest word
        for (int i = 0; i<l; i++)
        {
            char c =a.charAt(i);
            if(c!=' ')
            b = b+c;
            else 
            {
                int lt=b.length(); //to store to length of each word temporarily
                if(lt>11)
                {
                    ll=int
                    f=b
                }
                b= "";

            }
        }
        System.out.println("longest word: "+f+ "With length:"+ ll);
    }
}