package suanfa;
/*
    另一种堆排序方法方法
    需要从小到大排序，建立最大堆，每次把堆根和堆最后一个元素交换，继续维护最大堆
    最后得到一个从小到大的数组
 */
public class HeapSortTwo {
    private static int n;
    private static int h[];

    public HeapSortTwo(){}

    public HeapSortTwo(int h[],int n){
        this.n=n;
        this.h=h;
        create();
    }
    private void swap(int x,int y){
        int t=h[x];
        h[x]=h[y];
        h[y]=t;
    }
    //向下调整    调整成最大堆
    private void siftDown(int i){
        int t,flag=0;
        while(i*2 <= n && flag==0){
            //判断与左儿子大小
            if(h[i] < h[i*2]){
                t=i*2;
            }else{
                t=i;
            }
            //判断与右儿子大小
            if(i*2+1 <= n){
                if(h[t] < h[i*2+1]){
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
    //堆排序
    public void heapSort(){
        while(n>1){
            swap(1,n);
            n--;
            siftDown(1);
        }
    }
}
