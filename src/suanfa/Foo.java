package suanfa;

class Foo {
    final int i;
    public Foo(){
        this.i=1;
    }
    int j;
    public void doSomething() {
        System.out.println(++j + i);
    }
}
