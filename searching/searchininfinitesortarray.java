package searching;

public class searchininfinitesortarray {
    public static void main(String[] args) {
        int arr[] = new int[]{1,4,5,6,8,9,11,24,34,56,77,79,97,122,356,566,678,789,890,900};
        int y=77;
       int p= searchininfinitesortarraynum(arr,y);
       System.out.println(p);
    }
    public static int searchininfinitesortarraynum(int arr[],int y)
    {
        if(arr[0]==y){return 0;}
        int i=1;
        while(arr[i]<y)
        {
            i=i*2;
        }
        return binarysearch(arr,y,i/2+1,i);
    }
    public static int binarysearch(int arr[],int target,int start,int end)
    {
        int low=start,high=end;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]>target)
            {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
}
