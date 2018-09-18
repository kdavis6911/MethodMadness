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
    public static void foobarbaz(int numberofnumbers)
    {
        for(int i = 1; i <= numberofnumbers; i++)
}