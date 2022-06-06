

import java.util.StringTokenizer;

/**
 * Created by wgwj4809 on 19/08/17.
 */
public class Calculation
{

    //method that returns minimum number
    public static int findMin(int arr[])
    {
        int min=arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(min>arr[i])
                min=arr[i];
        }
        return min;
    }
    //method that returns maximum number
    public static int findMax(int arr[])
    {
        int max=0;
        for(int i=1; i<arr.length; i++)
        {
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }
    //method that returns cube of the given number
    public static int cube(int n)
    {
        return n*n*n;
    }
    //method that returns square of the given number
    public static int square(int n)
    {
        return n*n;
    }
    //method that returns reverse words
    public static String reverseWord(String str)
    {

        StringBuilder result=new StringBuilder();
        StringTokenizer tokenizer=new StringTokenizer(str,"");

        while(tokenizer.hasMoreTokens())
        {
            StringBuilder sb=new StringBuilder();
            sb.append(tokenizer.nextToken());
            sb.reverse();

            result.append(sb);
            result.append("");
        }
        return result.toString();
    }
}

