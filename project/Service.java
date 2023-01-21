package com.project;

public class Service implements Functions
{

	
	public void findIndex(int[] a,int num) 
	{
		
			
			int index=searchElement(a,num);
			
			if(index==-1)
				System.out.println("number not found");
			else
				System.out.println("found at index : "+index);

		}

		int searchElement(int[] a, int num) {
			
			for(int i=0; i<a.length; i++)
			{
				if(a[i]==num)
					return i;
				
			}
			
			return -1;
		
	
		
	}
	

	
	public void sumAndAvg(int []inputArray) 
	{
		int sum=0;
		for(int i=0; i<inputArray.length; i++)
		{
			sum+=inputArray[i];

		}
		
		System.out.println("Sum of Array Elements : "+sum);
		
		int avg=sum/inputArray.length;
		System.out.println("Average of Array Elements : "+avg);
		
	}

	
	public void evenOdd(int[] a) {
		
		
	}


	public void matchNumberInArray(int[] inputArray, int num) 
	{

		int index=searchElement(inputArray,num);
		
		if(index==-1)
			System.out.println("Number Not Found in Array");
		else
			System.out.println("Found at Index : "+index);

	}

//		int searchElement1(int[] a, int n) 
//		{
//		
//		for(int i=0; i<a.length; i++)
//		{
//			if(a[i]==n)
//				return i;
//			
//		}
//		
//		return -1;
//	}
	

	
	public void reverseArray(int[] a) {
		
		
	}

	
	public void maxNumberinArray(int[] a) {
	
		
	}

	
	public void secondMaxNumber(int[] a) {
		
		
	}

	
	public void uniqueNumber(int[] a) {
		int count=0;
		for(int i=0; i<a.length;i++)
		{
			boolean isDuplicate=isDupicate(a,i);
			
			if(isDuplicate==false)
			{
				//System.out.print(a[i]+" ");
				count++;
				
			}
			
		}
		
		int[] b=new int[count];
		
		int index=0;
		for(int k=0; k<a.length; k++)
		{
			boolean isDuplicate=isDupicate(a,k);
			if(isDuplicate==false)
			{
				b[index]=a[k];
				index++;
			}			
		}
		System.out.print(false);
		for(int s=0; s<count;s++)
			System.out.println(b[s]+" ");
	}

	private static boolean isDupicate(int[] a, int i) {
		for(int j=0; j<i; j++)
		{
			if(a[j]==a[i])
				return true;
			
		}
		return false;
	}

	
	public void leftShiftArray(int[] a) {
		
		System.out.println("Original Array");
		print(a);
		
		int temp=a[0];
		
		for(int i=0 ; i<a.length-1 ; i++)
		{
			a[i]=a[i+1];
			
			
		}
		
		a[a.length-1]=temp;
		System.out.println("Array After left Shift : ");
		print(a);
	}

	private void print(int[] a) {
		
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}

	
	public void minNumberinArray(int[] a) {
		
		
	}

	
	public void maxMinDiff(int[] a) {
		int max=getMax(a);
		int min=getmin(a);
		System.out.print("Difference between Maximum and Minimum Element in Array is : ");
		System.out.println(max-min);
		
	}
	

	private int getmin(int[] a) {
		int min=Integer.MAX_VALUE;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<min)
				min=a[i];
			
		}
		return min;

	}

	private int getMax(int[] a) {
		int max=Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
				max=a[i];
			
		}
		return max;
	

		
}

	
	public void checkEquality(int[] a, int[] b) {
		
		boolean result=checkaEquality(a,b);
		
		if(result)
			System.out.println("Both Arrays are Equal");
		else
			System.out.println("Both Arrays are Not Equal");
	}

	private static boolean checkaEquality(int[] a, int[] b) 
	{
		if(a.length!=b.length)
			return false;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]!=b[i])
				return false;
			
		}
		return true;
	}
}

	


