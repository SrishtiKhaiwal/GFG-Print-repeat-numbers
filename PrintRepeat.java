package Srishti.com;

public class PrintRepeat 
{
public static void main(String args[])
{
	int arr[]= {1,1,1,1,1,1,1,2,4,3,6,3,4,5,5,1};
	int n=arr.length;
    boolean b = true;
    int temp=0;
	int flag=0;
	for(int i = 0; i < n; i++)
	{
        b = false;
        for(int j = i+1; j < n; j++)
        {
            if(arr[i] == arr[j] && arr[j] != -1)
            {
                b = true;
                arr[j] = -1;
            }
        }
        if(b)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
}