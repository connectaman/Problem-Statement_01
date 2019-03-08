/*
Given input N, using N-bit representation the lowest value corresponding to all bits with value '0' and highest value
corresponds to all bits with value '1'. Taking the lowest value as 1, and highest value as 2n, Generates N sets each having 2n-1 numbers
in it.The set S1 corresponds to all those values where 1st bit i.e bit number 0 (LSB) is set to 0, and set Sn corresponds to all those values where Nth bit(MSB) is set to 0.
For exmaple , if N=3, three sets would be
S1(xx0) = 1,3,5,7
S2(x0x) = 1,5,2,6
s1(0xx) = 1,2,3,4
*/

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
                List<Integer> s1 = new ArrayList<>();
                List<Integer> s2 = new ArrayList<>();
                List<Integer> s3 = new ArrayList<>();
                String num[]={"000","001","010","011","100","101","110","111"};
        for(int i=0;i<num.length;i++)
                {
                    char temp1 = num[i].charAt(2);
                    char temp2 = num[i].charAt(1);
                    char temp3 = num[i].charAt(0);
                    if(temp1=='0')
                    {
                        int sum1 = i + 1;
                        s1.add(sum1);
                    }
                    if(temp2=='0')
                    {
                        int sum2 = i + 1;
                        s2.add(sum2);
                    }
                     if(temp3=='0')
                    {
                        int sum3 = i + 1;
                        s3.add(sum3);
                    }
                }
                System.out.println("S1 (xx0) -> "+s1);
                System.out.println("S2 (x0x) -> "+s2);
                System.out.println("S3 (0xx) -> "+s3);
    }
}
