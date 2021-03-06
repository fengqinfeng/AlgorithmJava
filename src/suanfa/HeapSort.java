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
    private void swap(int x,int y){
        int t=h[x];
        h[x]=h[y];
        h[y]=t;
    }

    //向上调整
    public void siftUp(int i){
        int flag=0;
        if(i==1)return ;
        while(i!=1 && flag == 0){
            if(h[i]<h[i/2]){
                swap(i,i/2);
            }else{
                flag=1;
            }
            i=i/2;
        }
    }


    //向下调整
    private void siftDown(int i){
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
            //交换,较小数换到根
            if(t != i){
                swap(t,i);
                i=t;
            }else{
                //不需要继续向下调整
                flag=1;
            }
        }
    }
    //创建堆   nlogn
    private void create(){
        for(int i=n/2;i>=1;i--){
            siftDown(i);
        }
    }
    //取出堆顶元素并删除
    private int deleteMax() {
        int t = h[1];
        h[1] = h[n];
        n--;
        siftDown(1);
        return t;
    }
    //堆排序
    public void heapSort(){
        for(int i=1;i<=h.length-1;i++){
            System.out.print(deleteMax()+" ");
        }
    }
}
