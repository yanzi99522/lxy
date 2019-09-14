package a0701;
public class Main {
    static int iCount = 0;						//全局变量
    static int[] WeiZhi=new int[4];						//全局数组

    static void Output()						//输出解
    {
        int i,j,flag=1;
        System.out.printf("第%2d种方案:\n", ++iCount);//输出序号
        System.out.printf("  ");
        for(i=1;i<=4;i++)
        {
            System.out.printf("__");
        }
        System.out.printf("\n");
        for (i = 0; i < 4; i++)
        {
            System.out.printf("|");
            for (j = 0; j < 4; j++)
            {
                if(WeiZhi[i]-1 == j)
                {
                    System.out.printf("A");			//皇后的位置
                }
                else
                {
                    if (flag<0)
                    {
                        System.out.printf("     ");		//棋格
                    }
                    else
                    {
                        System.out.printf("C");    		//棋格
                    }
                }
                flag=-1*flag;
            }
            System.out.printf("__\n");
            flag=-1*flag;
        }
        System.out.printf("  ");
        for(i=1;i<=8;i++)
        {
            System.out.printf("--");
        }
        System.out.printf("\n");
    }

    static void EightQueen(int n)				// 算法
    {
        int i,j;
        int ct;							//用于判断是否冲突
        if (n == 4)						//若8个皇后已经放置完成
        {
            Output(); 					//输出求解的结果
            return;
        }
        for (i = 1; i <= 4; i++)				//试探
        {
            WeiZhi[n] = i;                    //在该列的第i行上放置
            //判断第n个皇后是否与前面皇后形成攻击
            ct = 1;
            for (j = 0; j < n; j++) {
                if (WeiZhi[j] == WeiZhi[n])        // 形成攻击
                {
                    ct = 0;
                } else if (Math.abs(WeiZhi[j] - WeiZhi[n]) == (n - j))// 形成攻击
                {
                    ct = 0;
                } else {
                }
            }

            if (ct == 1) {                //没有冲突，就开始下一列的试探
                EightQueen(n + 1);        //递归调用
            }
        }
    }
    public static void main(String[] args)
    {
        System.out.printf("4皇后问题求解⣡\n");
        System.out.printf("4皇后排列方案:\n");
        EightQueen(0);					//求解

    }

}