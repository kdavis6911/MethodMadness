//Kye Davis
//September 20, 2018

package KDavis;

import static KDavis.KDavisLib.*;

public class TestFile
{
    public static void main(String[] args)
    {
        //test for isPalindrome
        boolean test = isPalindrome("tweakin");
        System.out.println(test);

        //test for cutOut
        String test1 = cutOut("young thugga la flare", "la");
        System.out.println(test1);

        //test for multiplicationTable
        multiplicationTable(8, 12);

        //test for sumUpTo
        int test2 = sumUpTo(24);
        System.out.println(test2);

        //test for leastCommonMultiple
        int test3 = leastCommonMultiple(2,4,6);
        System.out.println(test3);
    }
}

