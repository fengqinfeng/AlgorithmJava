import com.sun.xml.internal.bind.v2.model.annotation.Quick;
import suanfa.*;
import sun.net.www.HeaderParser;

import static suanfa.QuickSort.quickSort;

public class Main {

    public static void main(String[] args){
        /*
        快排
         */
//        int s[]=new int[5];
//        s[0]=5;s[1]=8;s[2]=1;s[3]=111;s[4]=3;
//        quickSort(s,0,4);
//        for(int i=0;i<5;i++){
//            System.out.println(s[i]);
//        }


        /*
        冒泡排序
         */
//        int s[]=new int[5];
//        s[0]=5;s[1]=9;s[2]=1;s[3]=111;s[4]=3;
//        BubbleSort.bubbleSort(s,5);
//        for(int i=0;i<5;i++){
//            System.out.println(s[i]);
//        }


        /*
        new关键字创建对象
         */
        //QuickSort temp=new QuickSort();
        /*
        class类的newInstance方法创建对象
         */

        /*
        堆排序
         */
        int temp[]={-1,1,7,9,2,3,5,4};
//        HeapSort t=new HeapSort(temp,temp.length-1);
//        t.heapSort();

//        HeapSortTwo t=new HeapSortTwo(temp,temp.length-1);
//        t.heapSort();
//        for(int i=1;i<=temp.length-1;i++){
//            System.out.print(temp[i]+ " ");
//        }
        //堆  计算第几大的数字
        MaxThird t=new MaxThird(temp,temp.length-1,3);
        System.out.println(t.heapSort());



    }
}
