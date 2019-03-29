package hank;

import java.util.Scanner;

class Solution3{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.printf("* byte\n");
                //Complete the code
                if(x>=-32768 && x<=32767)System.out.printf("* short\n");
                int in=(int)Math.pow(2,31);
                int n=Math.abs(in)-1;
                if(x>=in && x<=n)System.out.printf("* int\n");
                long lo=(long)Math.pow(2,63);
                long ol=Math.abs((long)lo)-1;
                if(x>=lo && x<=ol)System.out.printf("* long\n");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}