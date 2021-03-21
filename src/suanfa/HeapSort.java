package suanfa;
/*
堆排  最小堆  不稳定
 */
public class HeapSort {

    public static void swap(int h[],int x,int y){
        int t=h[x];
        h[x]=h[y];
        h[y]=t;

    }
    public static void siftDown(int h[],int n,int i){
        int t,flag=0;
        while(i*2 <= n && flag==0){
            //判断与左儿子大小
            if(h[i] > h[i*2]){
                t=i*2;
            }else{
                t=i;
            }
            //判断与右儿子大小
            if(i*2+1 <= n){
                if(h[t] > h[i*2+1]){
                    t=i*2+1;
                }
            }
            //交换
            if(t != i){
                swap(h,t,i);
                i=t;
            }else{
                //不需要继续向下调整
                flag=1;
            }
        }

    }
    //创建堆
    public static void create(int h[], int n){
        for(int i=n/2;i>=1;i--){
            siftDown(h,n,i);
        }

    }
    //取出堆顶元素并删除
    public static int deleteMax(int h[],int n) {
        int t = h[1];
        h[1] = h[n];
        n--;
        siftDown(h, n, 1);
        return t;
    }

}
