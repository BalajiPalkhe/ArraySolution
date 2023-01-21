package com.project;

import java.util.Scanner;

public class ArraySolution 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		Functions a=new Service();
	
		Secret s=new Secret();
		
		
		
		System.out.print("Enter Username : ");
		int username=scan.nextInt();
		System.out.print("Enter Password : ");
		int Password=scan.nextInt();
		
		if(s.getusername()==username && s.getpassword()==Password)
		{
			System.out.println("You are Succefully Logged in");
			System.out.print("Enter Size of an Array: ");
			int arrayLength=scan.nextInt();
			int[] inputArray=new int[arrayLength];
		
			System.out.print("Please Enter Your Array Element : ");
			for(int i=0; i<inputArray.length; i++)
			{
				inputArray[i]=scan.nextInt();
			}
			
			while(true)
			{
				System.out.println("1.Find Index of an Array Element\n2.Find Sum and Average of an Array\n3.Match Number with Array Elements\n4.Find out unique numbers in an Array\n5.Left Shift an Array\n6.Find the difference between Maximum and Minimum Element in Array\n7.Check Equality of Two Arrays");
				
				System.out.println("Enter Choice : ");
				int ch=scan.nextInt();
				
					if(ch==1)
					{
						System.out.print("Enter Array element which index you have to find : ");
						
						int num=scan.nextInt();
						a.findIndex(inputArray,num);
					}
					else if(ch==2)
					{
						a.sumAndAvg(inputArray);
					}
					else if(ch==3)
					{
						System.out.print("Enter Number to Match : ");
						int n=scan.nextInt();
						a.matchNumberInArray(inputArray, n);
						
					}
					
					else if(ch==4)
					{
					
						a.uniqueNumber(inputArray);
						
					}
					else if(ch==5)
					{
					
						a.leftShiftArray(inputArray);
						
					}
					else if(ch==6)
					{
					
						a.maxMinDiff(inputArray);
						
					}
					else if(ch==7)
					{
						System.out.println("Enter Size of Array that You have to Check : ");
						int eqsize=scan.nextInt();
						int[] eqArray=new int[eqsize];
						
						System.out.println("Enter Elements of Array that have to Check : ");
						for(int i=0; i<eqsize; i++)
						{
							eqArray[i]=scan.nextInt();
						}
						a.checkEquality(inputArray, eqArray);
					
						
						
					}
					else if(ch==0)
					{
						System.out.println("Logged out Succefully");
						System.exit(0);
						
					}
					else
					{
						System.out.println("Please Enter Valid number");
					}
				
			}
		}
		else
		{
			System.out.println("Incorrect LogIn Id or Password");
		}

	}

}
