public class SelectionSort {
    void sort(int arr[])
{
int n = arr.length;
for (int i = 0; i < n-1; i++)
{
int pos = i;
for (int j = i+1; j < n; j++)
if (arr[j] < arr[pos])
pos = j;
int temp = arr[pos];
arr[pos] = arr[i];
arr[i] = temp;
}
}
void printArray(int arr[])
{
int n = arr.length;
for (int i=0; i<n; ++i)
System.out.print(arr[i]+" ");
System.out.println();
}
public static void main(String args[])
{
SelectionSort ob = new SelectionSort();
int arr[] = {2,8,5,3,9,1,7,4};
ob.sort(arr);
System.out.println("Sorted array");
ob.printArray(arr);
}
}
