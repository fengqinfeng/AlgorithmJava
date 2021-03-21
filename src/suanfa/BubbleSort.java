package suanfa;
/*
冒泡排序
 */
public class BubbleSort {
    static void  swap(int s[],int m,int n){
        int temp=s[m];
        s[m]=s[n];
        s[n]=temp;
    }
    public static void bubbleSort(int s[],int n){
        for(int i=0;i<n-1;i++){
            boolean flag=false;
            for(int j=n-1;j>i;j--){
                if(s[j-1]>s[j]){
                    swap(s,j-1,j);
                    flag=true;
                }
            }
            if(!flag)return;
        }
    }
}
