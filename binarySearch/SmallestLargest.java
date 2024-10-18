package binarySearch;

import java.util.Scanner;

public class SmallestLargest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter Target:");
		int target=sc.nextInt();
		SmallestLargest obj=new SmallestLargest();
		int res=obj.SmallElement(a, target);
		System.out.println("Smaller Element"+res);
		res=obj.LargeElement(a, target);
		System.out.println("Larger Element"+res);
		
	}
	public int SmallElement(int a[],int t)
	{
		int left = 0, right = a.length - 1;
        int result = -1; 

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (a[mid] == t) {
                return a[mid]; 
            } 
            else if(a[mid]<t && a[mid+1]>t)
            {
            	return a[mid];
            }
            else if (a[mid] < t) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }
		return result;
	}
	public int LargeElement(int a[],int t)
	{
		int left = 0, right = a.length - 1;
        int result = -1; 

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (a[mid] == t) {
                return a[mid]; 
            } 
            else if(a[mid]>t && a[mid-1]<t)
            {
            	return a[mid];
            }
            else if (a[mid] < t) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }
		return result;
	}

}
