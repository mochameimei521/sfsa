package feng;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation a=new Add();	
		Operation s=new Sub();
		Operation m=new Mul();
		Operation d=new Div();
		Scanner b=new Scanner(System.in);
		double result;
		double n1,n2;
    	int opertion;
    	int c;
    	int count;
    	int e;
    	System.out.println("请输入题目的数量");
    	count=b.nextInt();
    	int f;
    	System.out.println("请输入操作数的范围:");
    	f=b.nextInt();
      	System.out.println("是否含有乘除法，有乘法请输入1");
    	c=b.nextInt();
    	System.out.println("操作数中是否含有负数，可以的话请输入1，不可以输入0");
    	e=b.nextInt();
    	if(e==0)
    	{
    		if(c==1)
    		{
    			for(int i=1;i<count+1;i++)
    			{
    				opertion=(int)(Math.random()*4);
    				n1=(int)(Math.random()*f);
    				n2=(int)(Math.random()*f);
    				switch(opertion)
    				{
    				case 0:
    					if((a.getResult(n1, n2))>101)
    					{
    						i--;
    						continue;
    					}
    					else
    					{result=a.getResult(n1, n2);
    					System.out.println(n1+"+"+n2+"="+result);
    					}
    					break;
    				case 1:
    					if((s.getResult(n1, n2))<1)
    					{
    						i--;
    						continue;
    					}
    					else
    					{result=s.getResult(n1, n2);
    					System.out.println(n1+"-"+n2+"="+result);
    					}
    					break;
    				case 2:
    					if((m.getResult(n1, n2))>500)
    					{
    						i--;
    						continue;
    					}
    					else
    					{result=m.getResult(n1, n2);
    					System.out.println(n1+"*"+n2+"="+result);
    					}
    					break;
    				case 3:
    					if((d.getResult(n1, n2))==0)
    					{
    						i--;
    						continue;
    					}
    					else
    					{result=d.getResult(n1, n2);
    					System.out.println(n1+"/"+n2+"="+result);
    					}
    					break;
    					
    				}
    				
    			}
    			
    		}
    	
    		else
    		{
    			for(int i=1;i<count+1;i++)
    			{
    				opertion=(int)(Math.random()*4);
    				n1=(int)(Math.random()*f);
    				n2=(int)(Math.random()*f);
    				switch(opertion)
    				{
    				case 0:
    					if((a.getResult(n1, n2))>101)
    					{
    						i--;
    						continue;
    					}
    					else
    					{result=a.getResult(n1, n2);
    					System.out.println(n1+"+"+n2+"="+result);
    					}
    					break;
    				case 1:
    					if((s.getResult(n1, n2))<1)
    					{
    						i--;
    						continue;
    					}
    					else
    					{result=s.getResult(n1, n2);
    					System.out.println(n1+"-"+n2+"="+result);
    					}
    					break;
    		}}}}
    				else if(e==1)
    				{if(c==1)
    				{
    					for(int i=1;i<count+1;i++)
    	    			{
    	    				opertion=(int)(Math.random()*4);
    	    				n1=(int)(f-Math.random()*f);
    	    				n2=(int)(f-Math.random()*f);
    	    				switch(opertion)
    	    				{
    	    				case 0:
    	    					if((a.getResult(n1, n2))>101)
    	    					{
    	    						i--;
    	    						continue;
    	    					}
    	    					else
    	    					{result=a.getResult(n1, n2);
    	    					System.out.println("("+n1+")"+"+"+"("+n1+")"+"="+(result));
    	    					}
    	    					break;
    	    				case 1:
    	    					if((s.getResult(n1, n2))<1)
    	    					{
    	    						i--;
    	    						continue;
    	    					}
    	    					else
    	    					{result=s.getResult(n1, n2);
    	    					System.out.println("("+n1+")"+"-"+"("+n1+")"+"="+(result));
    	    					}
    	    					break;
    	    				case 2:
    	    					if((m.getResult(n1, n2))>500)
    	    					{
    	    						i--;
    	    						continue;
    	    					}
    	    					else
    	    					{result=m.getResult(n1, n2);
    	    					System.out.println("("+n1+")"+"*"+"("+n1+")"+"="+(result));
    	    					}
    	    					break;
    	    				case 3:
    	    					if((d.getResult(n1, n2))==0)
    	    					{
    	    						i--;
    	    						continue;
    	    					}
    	    					else
    	    					{result=d.getResult(n1, n2);
    	    					System.out.println("("+n1+")"+"/"+"("+n1+")"+"="+(result));
    	    					}
    	    					break;
    	    					
    	    				}
    	    					
    				}
    				}
    		else
			{

    			for(int i=1;i<count+1;i++)
    			{
    				opertion=(int)(Math.random()*2);
    				n1=(int)(Math.random()*f*2);
    				n2=(int)(Math.random()*f*2);
    				switch(opertion)
    				{
    				case 0:
    					if((a.getResult(n1, n2))>101)
    					{
    						i--;
    						continue;
    					}
    					else
    					{result=a.getResult(n1, n2);
    					System.out.println("("+n1+")"+"+"+"("+n1+")"+"="+(result));
    					}
    					break;
    				case 1:
    					if((s.getResult(n1, n2))<1)
    					{
    						i--;
    						continue;
    					}
    					else
    					{result=s.getResult(n1, n2);
    					System.out.println("("+n1+")"+"-"+"("+n1+")"+"="+(result));
    					}
    					break;
    				case 2:
    					if((m.getResult(n1, n2))>500)
    					{
    						i--;
    						continue;
    					}
    					else
    					{result=m.getResult(n1, n2);
    					System.out.println("("+n1+")"+"*"+"("+n1+")"+"="+(result));
    					}
    					break;
    				case 3:
    					if((d.getResult(n1, n2))==0)
    					{
    						i--;
    						continue;
    					}
    					else
    					{result=d.getResult(n1, n2);
    					System.out.println("("+n1+")"+"/"+"("+n1+")"+"="+(result));
    					}
    					break;
    					
    				}
			}
    	}

		

	}

}}
