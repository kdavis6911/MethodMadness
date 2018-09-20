//Kye Davis
//September 20, 2018

package KDavis;

public class KDavisLib
{
    public static void println(String str)
    {
        System.out.println(str);
    }
    public static boolean isPalindrome(String word)
    {
        String rev = "";
        for (int i = word.length() - 1; i >= 0; i--)
        {
            rev += word.substring(i,i + 1);
        }
        if (rev.equals(word))
        {
            return true;
        }
        return false;
    }
    public static String cutOut(String mainstr, String substr)
    {
        int substrplace = mainstr.indexOf(substr);
        if(substrplace < 0)
        {
            return "I can't find your substring in your mainstring!";
        }
        String firstshortstr = mainstr.substring(0,substrplace);
        String nextshortstr = mainstr.substring(substrplace + substr.length());
        return firstshortstr + nextshortstr;
    }
    public static void multiplicationTable(int base, int range) {
        if (range <= 0) {
            System.out.println("I can't do that!");
        }
        String table = "";
        for (int i = 0; i <= range; i++)
        {
            table += i * base + ", ";
        }
        System.out.println(table);
    }
    public static int sumUpTo(int num)
    {
        int sumofall = 0
        for (int i = 0; i <= num; i++)
        {
            sumofall + i;
        }
        return sumofall
    }
}