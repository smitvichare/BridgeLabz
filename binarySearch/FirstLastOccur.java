package binarySearch;

import java.util.Scanner;

public class FirstLastOccur {
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
		FirstLastOccur obj=new FirstLastOccur();
		int res=obj.FirstOcc(a, target);
		System.out.println("First Occurance of target is at location "+(res+1));
		int res2=obj.LastOcc(a, target);
		System.out.println("Last Occurance of target is at location "+(res2+1));
	}
	public int FirstOcc(int a[],int t)
	{
		int left = 0, right = a.length - 1;
        int result = -1; 

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (a[mid] == t) {
                result = mid; 
                right = mid - 1; 
            } else if (a[mid] < t) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
	}
	public int LastOcc(int a[],int t)
	{
		int left = 0, right = a.length - 1;
        int result = -1; 

        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (a[mid] == t) {
                result = mid; 
                left = mid + 1; 
            } else if (a[mid] < t) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
	}
}
