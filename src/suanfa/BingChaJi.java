package suanfa;
/*
    并查集
 */
public class BingChaJi {
    private static int[] f;
    public BingChaJi(){}
    public BingChaJi(int len){
        this.f=new int[len+1];
        init();
    }
    private void init(){
        for(int i=0;i<f.length;i++){
            f[i]=i;
        }
    }
    //找祖先
    private int getf(int v){
        if(f[v]==v){
            return v;
        }else{
            f[v]=getf(f[v]);
            return f[v];
        }
    }
    //按靠左原则，右边（v）的祖先是  左边（U）的祖先
    public void merge(int u,int v){
        int t1=getf(u);
        int t2=getf(v);
        if(t1!=t2){
            f[t2]=t1;
        }
    }
    public int gerResult(){
        int sum=0;
        for(int i=1;i<f.length;i++){
            if(f[i]==i) sum++;
        }
        return sum;
    }


}
