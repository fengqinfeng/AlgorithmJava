package suanfa;

public class Te {
    public static void main(String[] args){}
    public void test(int b){
        int a=10;
        new Thread(){
            public void run(){
                System.out.println(a);
                System.out.println(b);
            };
        }.start();

    }

}
