package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MinStack {
    /** initialize your data structure here. */
    private int min;
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> temp = new Stack<>();
//    Map<String,Object> map = new HashMap<>();



    public MinStack() {
    }

    public void push(int x) {
        stack.push(x);
        if(stack.size() == 1) //栈为空
        {
//            map.put(x,1);
            temp.push(x);
            min = x;
        }
        else{ //栈不空
            if (min>x) {
                min = x;
                temp.push(x);
            }
        }
    }

    public void pop() {
        if(min == stack.pop()) {
            if(stack.search(min) ==-1 ){ //栈中已经没有min这个元素了
                temp.pop();
                if(temp.size()!=0) {
                    min = temp.pop();
                    temp.push(min);
                }
            }

        }
    }



    public int top() { //stack没有gettop（）方法
        int k = stack.pop();
        stack.push(k);
        return k;
    }

    public int min() {
        return min;
    }
}

