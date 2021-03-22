import com.sun.xml.internal.bind.v2.model.annotation.Quick;
import suanfa.BubbleSort;
import suanfa.HeapSort;
import suanfa.QuickSort;
import suanfa.Te;
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
        HeapSort t=new HeapSort(temp,temp.length-1);
        t.heapSort();




    }
}
