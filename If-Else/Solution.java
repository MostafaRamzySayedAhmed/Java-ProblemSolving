import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args)
    {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int N=Integer.parseInt(br.readLine().trim());
            if(N<1||N>100)
                throw new Exception();
            if((N&1)==1)
            {
                System.out.println("Weird");
            }
            else
            {
                if(N>=2&&N<=5)
                {
                    System.out.println("Not Weird");
                }
                else if(N>=6&&N<=20)
                {
                    System.out.println("Weird");
                }
                else
                {
                    System.out.println("Not Weird");
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}