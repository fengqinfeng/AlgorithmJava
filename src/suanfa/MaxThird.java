package suanfa;
/*
    利用堆来求  求第3大的数字   维护一个大小为3的最小堆
    将堆顶元素和没加入堆得元素比较，如果比堆顶元素大，将堆顶和该元素交换，继续维护最小堆
    最后答案第3大的数字就是堆顶元素
 */
public class MaxThird {
    private static int n;
    private static int h[];
    private static int number;
    public MaxThird(){}

    public MaxThird(int h[],int n,int number){
        this.n=n;
        this.h=h;
        this.number=number;
        create(number);
    }
    private void swap(int x,int y){
        int t=h[x];
        h[x]=h[y];
        h[y]=t;
    }
    //向下调整 维护一个最小堆
    private void siftDown(int i){
        int t,flag=0;
        while(i*2 <= number && flag==0){
            //判断与左儿子大小
            if(h[i] > h[i*2]){
                t=i*2;
            }else{
                t=i;
            }
            //判断与右儿子大小
            if(i*2+1 <= number){
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
    private void create(int number){
        for(int i=number;i>=1;i--){
            siftDown(i);
        }
    }
    public int heapSort(){
        for(int i=4;i<=n;i++){
            if(h[1]<h[i]){
                swap(1,i);
                siftDown(1);
            }
        }
        return h[1];
    }

}
