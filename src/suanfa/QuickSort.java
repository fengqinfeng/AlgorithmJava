package suanfa;
/*
快排
 */
public class QuickSort{

    public QuickSort(){}
    static int partition(int s[],int low,int high){
        int pivote=s[low];
        while(low<high){
            while(low<high&&s[high]>=pivote)high--;
            s[low]=s[high];
            while(low<high&&s[low]<=pivote)low++;
            s[high]=s[low];
        }
        s[low]=pivote;
        return low;
    }

    public static void quickSort(int s[],int low,int high){
        if(low<high){
            int pivote=partition(s,low,high);
            quickSort(s,low,pivote-1);
            quickSort(s,pivote+1,high);
        }
    }

}
