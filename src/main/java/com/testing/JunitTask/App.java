package com.testing.JunitTask;


public class App 
{
    public static int sumOfdigits(int n )
    { 
    	int sum=0;
        while(n!=0) {
        	sum+= n%10;
        	n=n/10;
        }
      
    
    
        return sum;
    }
}
