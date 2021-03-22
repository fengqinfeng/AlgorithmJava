package suanfa;
/*
堆排  小顶堆  不稳定
 */
public class HeapSort {
    private static int n;
    private static int h[];

    public HeapSort(){}

    public HeapSort(int h[],int n){
        this.n=n;
        this.h=h;
        create();
    }
    private static void swap(int x,int y){
        int t=h[x];
        h[x]=h[y];
        h[y]=t;
    }
    private static void siftDown(int i){
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
                swap(t,i);
                i=t;
            }else{
                //不需要继续向下调整
                flag=1;
            }
        }
    }
    //创建堆
    private static void create(){
        for(int i=n/2;i>=1;i--){
            siftDown(i);
        }
    }
    //取出堆顶元素并删除
    private static int deleteMax() {
        int t = h[1];
        h[1] = h[n];
        n--;
        siftDown(1);
        return t;
    }
    public  void heapSort(){
        for(int i=1;i<=h.length-1;i++){
            System.out.print(deleteMax()+" ");
        }
    }
}
