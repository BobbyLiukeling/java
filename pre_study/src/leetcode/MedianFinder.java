package leetcode;

import java.util.ArrayList;
import java.util.List;

class MedianFinder {

    /** initialize your data structure here. */
    List<Integer> arry = new ArrayList();
    public MedianFinder() {

    }

    public void addNum(int num) { //排序插入
        if(this.arry.size() >0){
            this.arry.add(0); //增长链表长度
            for(int i = this.arry.size()-2; i>-1; i--){
                if(this.arry.get(i)>num){
                    this.arry.set(i+1,this.arry.get(i));
                }else {
                    this.arry.set(i+1,num);
                    return;
                }

                // System.out.println(arry.get(i+1));
            }


        }
        else this.arry.add(num);
    }

    public double findMedian() {
        double temp = 0;
        int len = this.arry.size();

        //    System.out.println("qeiuytre");
        //     for(int i: this.arry) System.out.println(i);
        if(len%2 == 0){
            temp = ( Double.valueOf(this.arry.get(len/2)) +  Double.valueOf(this.arry.get(len/2-1))) /2;
        }
        else temp = this.arry.get((len-1)/2);
        return temp;

    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */