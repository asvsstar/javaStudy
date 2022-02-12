package com.it.main;

import java.util.Arrays;

/*
 * 	33 77 53 95 16  ==> 16 33 53 77 95
 * 						95 77 53 33 16
 * 1. ASC	=> 선택정렬
 * 2. DESC 	=> 버블 정렬
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5]; // arr[0]~arr[4]
		// arr[0]~arr[4] => 임의수를 대입
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		/*
		//저장된 값 출력
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		for(int i:arr)
		{
			System.out.print(i+" ");}
		System.out.println();
		for(int i=arr.length-1;i>=0; i--)
		{
			System.out.print(arr[i]+" ");
		}*/
		System.out.print("정렬 전 : ");
		for(int i:arr)
		{
			System.out.print(i+" ");
			
		}
		System.out.println();
		System.out.print("정렬 후(ASC:선택정렬):");
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.print("정렬 후(DESC:버블정렬):");
		for(int i=0;i<arr.length-1-i;i++)
		{
			for(int j=i;j<arr.length-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	
	for(int i:arr) {
		System.out.print(i+" ");
	}
	}

}
