package binarySearch;

import java.util.Scanner;

public class PeakElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		PeakElement obj=new PeakElement();
		int res=obj.peakEl(a);
		System.out.println("Peak Element"+res);
		
		
	}
	public int peakEl(int a[])
	{
		int left = 0, right = a.length - 1;
        int result = -1; 

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if(a[mid-1]<a[mid] && a[mid+1]<a[mid])
            {
            	return a[mid];
            }
            else if (a[mid] < a[mid+1]) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }
		return result;
	}
}
