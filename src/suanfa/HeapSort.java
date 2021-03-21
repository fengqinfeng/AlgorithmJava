package suanfa;

public class HeapSort {

    public static void swap(int h[],int x,int y){
        int t=h[x];
        h[x]=h[y];
        h[y]=t;

    }
    public static void siftDown(int h[],int i,int n){
        int t,flag=0;
        while(i*2 <= n && flag==0){
            if(h[i] > h[i*2]){
                t=i*2;
            }else{
                t=i;
            }
            if(i*2+1 <= n){
                if(h[t] > h[i*2+1]){
                    t=i*2+1;
                }
            }
            if(t != i){
                swap(h,t,i);
                i=t;
            }else{
                flag=1;
            }
        }

    }
    public static void create(int h[], int n){
        for(int i=n/2;i>=1;i--){
            siftDown(h,i,n);
        }

    }
    public static int deleteMax(int h[],int n) {
        int t;
        t = h[1];
        h[1] = h[n];
        n--;
        siftDown(h, 1, n);
        return t;
    }

}
