    import java.util.Scanner;

    public class trapping {
        public static void main(String[] args) 
    {
            Scanner s=new Scanner(System.in);
        System.out.println("enter a size");
            int num=s.nextInt();
            int arr[]=new int[num];
            System.out.println("enter a element");
    for(int i=0;i<num;i++)
    {
        arr[i]=s.nextInt();
    }
    trappingarr(arr);
        }   
        public static void trappingarr(int arr[])
        {
            int total=0,output=0;
            int sam=arr[0],las=arr[arr.length-1];
            int res=Math.abs( sam-las);
            int r=(arr.length-1)-res;
    int asc=ascarr(arr);
    int des=desarr(arr);
            if(asc==-1 || des==-1)
            {
                System.out.println(0);
            }
            else{
                for(int i=0;i<arr.length;i++)
                {
                    total=r-arr[i];
                    if(total>0)
                    {
                        output+=total;
                    }
                }
                System.out.println(output);
            }
        }
        public static int ascarr(int arr[])
        {
            for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                return -1;
            }
        }
            return 0;
        }    
        public static int desarr(int arr[])
        {
            for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                return -1;
            }
           
        }
         return 0;
    }
    }
        