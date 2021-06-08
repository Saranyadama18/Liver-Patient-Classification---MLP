package Home;

public class Train 
{
    static Double w11=0.0,w12=0.0,w13=0.0,w14=0.0,w15=0.0,w16=0.0,w17=0.0,w18=0.0,w19=0.0,w110=0.0,b1=0.0;
    static Double w21=0.0,w22=0.0,w23=0.0,w24=0.0,w25=0.0,w26=0.0,w27=0.0,w28=0.0,w29=0.0,w210=0.0,b2=0.0;
    static int alpha = 1,i=0,iter=0;
    static Double in1=null,in2=null,in3=null,in4=null,in5=null,in6=null,in7=null,in8=null,in9=null,in10=null,in11=null;
    static int sim=0,thi=0;
    static String[] a = new String[11]; 
    static Double yin = null;
    static int c1 = 1;
    static CSV c = new CSV();
    static int dis = 1;
    public static void setValues()
    {
        try
        {
            in1 = Double.parseDouble(a[0]);
        }catch(Exception e)
        {
            sim = Integer.parseInt(a[0]);
            in1 = sim * 1.0;
        }
        if(a[1].equals("Male"))
        {
            in2 = 1.0;
        }
        else
        {
            in2 = 2.0;
        }
        try
        {
            in3 = Double.parseDouble(a[2]);
        }catch(Exception e)
        {
            sim = Integer.parseInt(a[2]);
            in3 = sim * 1.0;
        }
        try
        {
            in4 = Double.parseDouble(a[3]);
        }catch(Exception e)
        {
            sim = Integer.parseInt(a[3]);
            in4 = sim * 1.0;
        }
        try
        {
            in5 = Double.parseDouble(a[4]);
        }catch(Exception e)
        {
            sim = Integer.parseInt(a[4]);
            in5 = sim * 1.0;
        }
        try
        {
            in6 = Double.parseDouble(a[5]);
        }catch(Exception e)
        {
            sim = Integer.parseInt(a[5]);
            in6 = sim * 1.0;
        }
        try
        {
            in7 = Double.parseDouble(a[6]);
        }catch(Exception e)
        {
            sim = Integer.parseInt(a[6]);
            in7 = sim * 1.0;
        }
        try
        {
            in8 = Double.parseDouble(a[7]);
        }catch(Exception e)
        {
            sim = Integer.parseInt(a[7]);
            in8 = sim * 1.0;
        }
        try
        {
            in9 = Double.parseDouble(a[8]);
        }catch(Exception e)
        {
            sim = Integer.parseInt(a[8]);
            in9 = sim * 1.0;
        }
        try
        {
            in10 = Double.parseDouble(a[9]);
        }catch(Exception e)
        {
            sim = Integer.parseInt(a[9]);
            in10 = sim * 1.0;
        }
        try
        {
            in11 = Double.parseDouble(a[10]);
        }catch(Exception e)
        {
            sim = Integer.parseInt(a[10]);
            in11 = sim * 1.0;
        }
    }
    public static Boolean activation()
    {
        int thi = (400*10) - 0;
        int t = 0;
        int val = (int) Math.round(yin);
        if(val > val)
        {
            t = 1;
        }
        else if(val == val)
        {
            t = 0;
        }
        else if(val < val)
        {
            t = -1;
        }
        if(c1 == t)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static void update()
    {
        w11 = (w11 + (alpha*in11*in1));
        w12 = (w12 + (alpha*in11*in2));
        w13 = (w13 + (alpha*in11*in3));
        w14 = (w14 + (alpha*in11*in4));
        w15 = (w15 + (alpha*in11*in5));
        w16 = (w16 + (alpha*in11*in6));
        w17 = (w17 + (alpha*in11*in7));
        w18 = (w18 + (alpha*in11*in8));
        w19 = (w19 + (alpha*in11*in9));
        w110 = (w110 + (alpha*in11*in10));
        b1 = (b1 + (alpha*in11));
    }
    public static void update1()
    {
        w21 = (w21 + (alpha*in11*in1));
        w22 = (w22 + (alpha*in11*in2));
        w23 = (w23 + (alpha*in11*in3));
        w24 = (w24 + (alpha*in11*in4));
        w25 = (w25 + (alpha*in11*in5));
        w26 = (w26 + (alpha*in11*in6));
        w27 = (w27 + (alpha*in11*in7));
        w28 = (w28 + (alpha*in11*in8));
        w29 = (w29 + (alpha*in11*in9));
        w210 = (w210 + (alpha*in11*in10));
        b2 = (b2 + (alpha*in11));
    }
    public static void st()
    {
        System.out.println();
        System.out.println("Iteration " +(iter+1));
        start();
    }
    public static void start()
    {
        System.out.println("Training:\n\n");
        for(i=0;i<400;i++)
        {
            a = c.find(i);
            if(dis == 1)
            {
                System.out.println("Input " +(i+1));
                System.out.println(a[0] +","+a[1] +"," +a[2] +"," +a[3] +"," +a[4] +"," +a[5] +"," +a[6] +"," +a[7] +"," +a[8] +"," +a[9] +" Desired output: " +a[10]);
            }
            c1 = Integer.parseInt(a[10]);
            setValues();
            if(c1 == 1)
            {
                yin = (b1+(in1*w11)+(in2*w12)+(in3*w13)+(in4*w14)+(in5*w15)+(in6*w16)+(in7*w17)+(in8*w18)+(in9*w19)+(in10*w110));
                //System.out.println(yin);
                Boolean bool = activation();
                if(bool)
                {
                    update();
                    //System.out.println("1. Weight updated!!!");
                }
                else
                {
                    continue;
                }
            }
            else if(c1 == 2)
            {
                yin = (b2+(in1*w21)+(in2*w22)+(in3*w23)+(in4*w24)+(in5*w25)+(in6*w26)+(in7*w27)+(in8*w28)+(in9*w29)+(in10*w210));
                //System.out.println(yin);
                Boolean bool = activation();
                if(bool)
                {
                    update1();
                    //System.out.println("2. Weight updated!!!");
                }
                else
                {
                    continue;
                }
            }
        }
        iter++;
            if(iter <100)
            {
                dis = 0;
                System.out.println();
                System.out.println("Hidden-1: " +w11 +","+w12 +"," +w13 +"," +w14 +"," +w15 +"," +w16 +"," +w17 +"," +w18 +"," +w19 +"," +w110 +"," +b1);
                System.out.println("Hidden-2: " +w21 +","+w22 +"," +w23 +"," +w24 +"," +w25 +"," +w26 +"," +w27 +"," +w28 +"," +w29 +"," +w210 +"," +b2);
                st();
            }
    }
}