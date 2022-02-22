package leetcode;

import com.sun.source.tree.NewArrayTree;

import java.util.LinkedList;
import java.util.Stack;

//public class CQueue {
//    private Stack<Integer> head = new Stack<Integer>();
//    private Stack<Integer> rear = new Stack<Integer>();
//
//    public CQueue() {
//
//    }
//
//    public void appendTail(int value) {
//        this.rear.push(value);
//    }
//
//    public int deleteHead() {
//        if (this.head.size() == 0){
//            if(this.rear.size() == 0){ //队列为空
//                return -1;
//            }
//            else{ // rear中不为空
//                while(this.rear.empty() == false){ //当栈不为空
//                    this.head.push(this.rear.pop()); //数据倒置
//                }
//                return this.head.pop();
//            }
//        }
//        else {
//            return this.head.pop();
//        }
//
//    }
//}

public class CQueue{
    private LinkedList<Integer> head = new LinkedList<>();
    private LinkedList<Integer> rear = new LinkedList<>();

    public void appendTail(int value) {
        this.rear.push(value);
    }

    public int deleteHead(){
        if(this.head.isEmpty()){

            if (this.rear.isEmpty()) return -1;

            else{
                while (!this.rear.isEmpty()){
                    this.head.push(this.rear.pop()); //数据倒置
                }
                return this.head.pop();
            }

        }
        else   return this.head.pop();

    }
}
