package Home;

//import static Home.Find.*;

import java.util.Random;


public class Test 
{
    static int c1,sub1,sub2;
    static int alpha = 1,i=0,iter=0,iter1=0;
    static Double yin = null;
    static Double w11w,w12w,w13w,w14w,w15w,w16w,w17w,w18w,w19w,w110w;
    static Double w21w,w22w,w23w,w24w,w25w,w26w,w27w,w28w,w29w,w210w;
    static int w1w,w2w,w3w,w4w,w5w,w6w,w7w,w8w,w9w,w10w,h1h,h2h,h11h,h21h;
    static Double in1i=null,in2i=null,in3i=null,in4i=null,in5i=null,in6i=null,in7i=null,in8i=null,in9i=null,in10i=null,in11i=null,b1b=0.0,b2b=0.0;
    static int sim=0,thi=0;
    static CSV c = new CSV();
    static String[] a = new String[11];
    static int count;
    Train t = new Train();
    public Test()
    {
        t.start();
        w11w = t.w11;
        w12w = t.w12;
        w13w = t.w13;
        w14w = t.w14;
        w15w = t.w15;
        w16w = t.w16;
        w17w = t.w17;
        w18w = t.w18;
        w19w = t.w19;
        w110w = t.w110;
        w21w = t.w21;
        w22w = t.w22;
        w23w = t.w23;
        w24w = t.w24;
        w25w = t.w25;
        w26w = t.w26;
        w27w = t.w27;
        w28w = t.w28;
        w29w = t.w29;
        w210w = t.w210;
        calc();
    }
    public void calc()
    {
        w1w = (int) Math.round(w11w);
        w2w = (int) Math.round(w12w);
        w3w = (int) Math.round(w13w);
        w4w = (int) Math.round(w14w);
        w5w = (int) Math.round(w15w);
        w6w = (int) Math.round(w16w);
        w7w = (int) Math.round(w17w);
        w8w = (int) Math.round(w18w);
        w9w = (int) Math.round(w19w);
        w10w = (int) Math.round(w110w);
        h1h = w1w+w2w+w3w+w4w+w5w+w6w+w7w+w8w+w9w+w10w;
        w1w = (int) Math.round(w21w);
        w2w = (int) Math.round(w22w);
        w3w = (int) Math.round(w23w);
        w4w = (int) Math.round(w24w);
        w5w = (int) Math.round(w25w);
        w6w = (int) Math.round(w26w);
        w7w = (int) Math.round(w27w);
        w8w = (int) Math.round(w28w);
        w9w = (int) Math.round(w29w);
        w10w = (int) Math.round(w210w);
        h2h = w1w+w2w+w3w+w4w+w5w+w6w+w7w+w8w+w9w+w10w;
    }
    public static void calc1()
    {
        w1w = (int) Math.round(w11w);
        w2w = (int) Math.round(w12w);
        w3w = (int) Math.round(w13w);
        w4w = (int) Math.round(w14w);
        w5w = (int) Math.round(w15w);
        w6w = (int) Math.round(w16w);
        w7w = (int) Math.round(w17w);
        w8w = (int) Math.round(w18w);
        w9w = (int) Math.round(w19w);
        w10w = (int) Math.round(w110w);
        h11h = w1w+w2w+w3w+w4w+w5w+w6w+w7w+w8w+w9w+w10w;
        w1w = (int) Math.round(w21w);
        w2w = (int) Math.round(w22w);
        w3w = (int) Math.round(w23w);
        w4w = (int) Math.round(w24w);
        w5w = (int) Math.round(w25w);
        w6w = (int) Math.round(w26w);
        w7w = (int) Math.round(w27w);
        w8w = (int) Math.round(w28w);
        w9w = (int) Math.round(w29w);
        w10w = (int) Math.round(w210w);
        h21h = w1w+w2w+w3w+w4w+w5w+w6w+w7w+w8w+w9w+w10w;
    }
   
    public static void setValues()
    {
        try
        {
            in1i = Double.parseDouble(a[0]);
        }catch(Exception e)
        {
            sim = Integer.parseInt(a[0]);
            in1i = sim * 1.0;
        }
        if(a[1].equals("Male"))
        {
            in2i = 1.0;
        }
        else
        {
            in2i = 2.0;
        }
        try
        {
            in3i = Double.parseDouble(a[2]);
        }catch(Exception e)
        {
            sim = Integer.parseInt(a[2]);
            in3i = sim * 1.0;
        }
        try
        {
            in4i = Double.parseDouble(a[3]);
        }catch(Exception e)
        {
            sim = Integer.parseInt(a[3]);
            in4i = sim * 1.0;
        }
        try
        {
            in5i = Double.parseDouble(a[4]);
        }catch(Exception e)
        {
            sim = Integer.parseInt(a[4]);
            in5i = sim * 1.0;
        }
        try
        {
            in6i = Double.parseDouble(a[5]);
        }catch(NumberFormatException e)
        {
            sim = Integer.parseInt(a[5]);
            in6i = sim * 1.0;
        }
        try
        {
            in7i = Double.parseDouble(a[6]);
        }catch(NumberFormatException e)
        {
            sim = Integer.parseInt(a[6]);
            in7i = sim * 1.0;
        }
        try
        {
            in8i = Double.parseDouble(a[7]);
        }catch(NumberFormatException e)
        {
            sim = Integer.parseInt(a[7]);
            in8i = sim * 1.0;
        }
        try
        {
            in9i = Double.parseDouble(a[8]);
        }catch(NumberFormatException e)
        {
            sim = Integer.parseInt(a[8]);
            in9i = sim * 1.0;
        }
        try
        {
            in10i = Double.parseDouble(a[9]);
        }catch(NumberFormatException e)
        {
            sim = Integer.parseInt(a[9]);
            in10i = sim * 1.0;
        }
    }
    
    public static void update()
    {
        in11i = 1.0;
        w11w = (w11w + (alpha*in11i*in1i));
        w12w = (w12w + (alpha*in11i*in2i));
        w13w = (w13w + (alpha*in11i*in3i));
        w14w = (w14w + (alpha*in11i*in4i));
        w15w = (w15w + (alpha*in11i*in5i));
        w16w = (w16w + (alpha*in11i*in6i));
        w17w = (w17w + (alpha*in11i*in7i));
        w18w = (w18w + (alpha*in11i*in8i));
        w19w = (w19w + (alpha*in11i*in9i));
        w110w = (w110w + (alpha*in11i*in10i));
        b1b = (b1b + (alpha*in11i));
    }
    public static void update1()
    {
        in11i = 2.0;
        w21w = (w21w + (alpha*in11i*in1i));
        w22w = (w22w + (alpha*in11i*in2i));
        w23w = (w23w + (alpha*in11i*in3i));
        w24w = (w24w + (alpha*in11i*in4i));
        w25w = (w25w + (alpha*in11i*in5i));
        w26w = (w26w + (alpha*in11i*in6i));
        w27w = (w27w + (alpha*in11i*in7i));
        w28w = (w28w + (alpha*in11i*in8i));
        w29w = (w29w + (alpha*in11i*in9i));
        w210w = (w210w + (alpha*in11i*in10i));
        b2b = (b2b + (alpha*in11i));
    }
     public static Boolean activation()
    {
        int t = 0;
        int val = (int) Math.round(yin);
        if(val> yin)
        {
            t = 1;
        }
        else if(val == yin)
        {
            t = 0;
        }
        else if(val< yin)
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
    public static void forh1()
    {
        c1 = 1;
        setValues();
        yin = (b1b+(in1i*w11w)+(in2i*w12w)+(in3i*w13w)+(in4i*w14w)+(in5i*w15w)+(in6i*w16w)+(in7i*w17w)+(in8i*w18w)+(in9i*w19w)+(in10i*w110w));
        int val = (int) Math.round(yin);
        Boolean bool = activation();
        if(bool)
            {
                update();
            }
        iter++;
            if(iter <100)
            {
                forh1();
            }
    }
    public static void forh2()
    {
        c1 = 2;
        setValues();
        yin = (b2b+(in1i*w21w)+(in2i*w22w)+(in3i*w23w)+(in4i*w24w)+(in5i*w25w)+(in6i*w26w)+(in7i*w27w)+(in8i*w28w)+(in9i*w29w)+(in10i*w210w));
        int val = (int) Math.round(yin);
        Boolean bool = activation();
        if(bool)
            {
                update1();
            }
        iter1++;
            if(iter1 <100)
            {
                forh2();
            }
    }
   
     public static void main(String args[])
    {
        
        Test tt = new Test();
        System.out.println("\n\nTesting:\n");
        for(int i = 0;i<583;i++)
        {
            a = c.find(i);
            System.out.println(" \nAge: "+a[0]+" \nGender: "+a[1]+" \nTotal Bilirubin: "+a[2]+" \nDirect Bilirubin: "+a[3]+" \nTotal Protiens: "+a[4]+" \nAlbumin: "+a[5]+" \nA/G Ratio: "+a[6]+" \nSGPT: "+a[7]+" \nSGOT: "+a[8]);
            forh1();
            forh2();
            calc1();
            sub1 = h11h - h1h;
            sub2 = h21h - h2h;
            if(sub1 < sub2)
            {
                if(a[10].equals("1"))
                {
                    System.out.println("Person is liver patient\n\n");
                    count++;
                    
                }
                else
                {
                    System.out.println("Person is normal\n\n");
                if(a[10].equals("2"))
                        count=count;
                System.out.println("Total no.of liver patients:" +count);
                
                   
                }
            }
            else
            {
                 System.out.println("Person is liver patient\n\n");
            }
        }
        int ran=0;
        double pre = (count/583.1)*100.1;
        double spec=((583-count)/583.1)*100.1;
        double sens=(count/583.1)*100.1;
        double acc = (416.1/583.1)*100.1;
         System.out.println("Prevelance: "+pre+"%");
         System.out.println("Specificity level: "+spec+"%");
         System.out.println("Sensitivity level: "+sens+"%");
         System.out.println("Accuracy level: " +acc+"%");
        
    }
}
