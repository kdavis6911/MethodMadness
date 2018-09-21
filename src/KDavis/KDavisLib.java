//Kye Davis
//September 20, 2018

package KDavis;

public class KDavisLib
{
    public static void println(String str)
    {
        System.out.println(str);
    }

    /**
     * isPalindrome will check if param "word" is the same backwards as it is forward
     * param "rev" is the word backwards
     * Returns a boolean
     */

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

    /**
     * cutOut takes the first instance of your substring out of your mainstring
     * param "mainstr" is the long word you're cutting out from
     * param "substr" is the phrase you're cutting out from mainstr
     * Returns mainstr with substr cut out
     */

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

    /**
     * multiplicationTable multiplies all numbers between 0 and param "range" multiplied by param "base" separately
     * param "base" is the number you're multiplying the sequence by
     * param "range" is where the sequence ends
     */

    public static void multiplicationTable(int base, int range)
    {
        if (range <= 0)
        {
            System.out.println("I can't do that!");
        }
        String table = "";
        for (int i = 0; i <= range; i++)
        {
            table += i * base + ", ";
        }
        System.out.println(table);
    }

    /**
     * sumUpTo returns the sum of all numbers between 0 and param "num"
     * param "num" is the limit
     * Returns an int which is the sum of all the numbers
     */

    public static int sumUpTo(int num)
    {
        int sumofall = 0;
        for (int i = 0; i <= num; i++)
        {
            sumofall = sumofall + i;
        }
        return sumofall;
    }
    public static int leastCommonMultiple(int num1, int num2, int num3)
    {
        for (int i = 0; i < 0; i++)
        {
            if (i % num1 == 0 && i % num2 == 0 && i % num3 == 0);
            return i;
        }
        return -1;
    }
}