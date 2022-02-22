package leetcode;

import org.w3c.dom.Node;

import javax.swing.tree.TreeNode;
import java.util.*;


public class Solution {

//    public class ListNode {
//        int val;
//        ListNode next;
//        ListNode(int x) { val = x; }
//    }
    class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

    /**
     * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
     */

//    public int[] reversePrint(ListNode head) {
//        ListNode p = head;
//
//        int count = 0;
//
//        while(p!= null)
//        {
//            count++;
//            p = p.next;
//        }
//
//        int[] a = new int[count]; //申请数组
//        p = head;
//
//        for (int i = count-1; i>-1; i--){
//            a[i] = p.val;
//            p = p.next;
//        }
//        return a;
//
//    }


//    /**
//     *
//     *定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
//     */
//
//    public ListNode reverseList(ListNode head) {
//        ListNode new_head = null,cur;
//        while (head != null){
//            //先取点，再赋给链表,否则会出错
//            cur = head;
//            head = head.next;
//            cur.next = new_head;
//            new_head = cur;
//
////          Gson gson = new Gson();
////    User copyUser = gson.fromJson(gson.toJson(user), User.class);
////
//        }
//        return  new_head;
//
//    }

    /*
    *
    *请实现 copyRandomList 函数，复制一个复杂链表。在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null。
    * */

//    public Node copyRandomList(Node head) {
//        if(head == null) return null;
//        Node node = null,temp = head,cur_old,cur_new;
//        Node p = node;
//        //重点，random指针可能向后面，所以一开始的时候不能复制，后面再运行一遍
//
//        //先赋值,新建链表
//        while(temp != null){
//            Node temp2 = new Node(temp.val); //新建结点
//            p = temp2; //添加节点
//            p = p.next;
//            temp = temp.next;
//
//
//        }
//        //再赋random指针
//        temp = head;
//        p = node;
//        while(temp !=null){
//            if (temp.random == null){
//                p.random = null;
//                continue;
//            }
//            cur_old = head;
//            cur_new = node;
//            while(cur_old !=null){
//                if (temp.random == cur_old) //当前指向位置
//                {
//                    break;
//                }
//                cur_old = cur_old.next;// old向后遍历
//                cur_new = cur_new.next;//new 向后遍历
//
//            }
//            p.random = cur_new; //当前新链表的节点的random所指向的位置
//            temp = temp.next;
//            p = p.next;
//
//
//        }
//
//        return node;
//
//    }

//    public String replaceSpace(String s) {
//
//        // for(int i=0; i<s.length(); i++){
//        //     if(s.charAt(i) != " ") System.out.println(str.charAt(i));
//        //     else System.out.println("%20");
//        // }
//
//        char[]  c = s.toCharArray();
//
//
//        for(int i=0;i < c.length;i++) {
//            if(c[i] == ' ') {
//                System.out.println("%20");
//            }
//            else {
//                System.out.println(c[i]);
//            }
//        }

//    public int findRepeatNumber(int[] nums) {
//        ArrayList <Integer> temp = new ArrayList<>();
//        int s = 0;
//        for(int a : nums){
//            temp.set(a,temp.get(a)+1);
//            if(temp.get(a)>1) s = a;
//        }
//        return s;
//    }

//    public int search(int[] nums, int target) {
//        int low = 0;
//        int high = nums.length;
//
//        for(int i = 0; i<nums.length; i++){
//
//        }
//
//        int mid = (low+high)/2;
//        if (nums[mid] < target){
//
//        }
//        else if (nums[mid] > target){
//
//        }
//        else {
//
//        }
//
//    }

//    public int missingNumber(int[] nums) {
//        //二分法
//        int low=0,high = nums.length,mid = 0;
//        while (low<high){
//            mid = (low+high)/2;
//            //判断头位置
//            if(nums[low] > low){
//                return low;
//            }
//
//            if (nums[mid] == mid){ //前半部分正确
//                low = mid+1;
//            }
//
//
//            else if(nums[mid] > mid){
//                high = mid;
//            }
//        }
//        return low;
//
//    }

//    public char firstUniqChar(String s) {
//        if(s.equals("")) return ' ';
//        Map<Character,Integer> map = new HashMap<>();
//        char[] c = s.toCharArray();
//        char key = ' ';
//        for(int i = 0;i<s.length();i++){
//            try{
//                map.put(c[i],map.get(c[i])+1);
//            }
//            catch (Exception e){
//                map.put(c[i],1);
//            }
//        }
//        for(int i = 0;i<s.length();i++){
//            if(map.get(c[i]) == 1) key = c[i];
//        }
//
//
//        Queue<Integer> queue= new LinkedList<>();
//        List <Integer> list = new ArrayList<>();
//        Boolean
//
//
//
//        return key;
//
//    }//func

//    public boolean isSubStructure(TreeNode A, TreeNode B) {
//        //遍历A树节点，直到找到与B根节点相同的节点
//
//        // if(root == null) {
//        //     int[] a = new int[0];
//        //     return a;
//        // }
//         List<Integer> array = new ArrayList<>(); //用于数据返回
//
//        Queue<TreeNode> queue= new LinkedList<>(); //暂存数据
//        // Queue<TreeNode> queueB= new LinkedList<>(); //暂存数据
//        queue.offer(A);
//        queue.clear();
//
//        String str = String.valueOf("qbc");
//        char[] array_num = str.toCharArray();
//        int[] s = new int[10];
//
//
//
//        Stack<Integer> stack = new Stack<>();
//        stack.pop();
//        while(!queue.isEmpty()){
//            TreeNode node = queue.poll();
//            int[] a = new int[10];
//
//            if(node.val == B.val) //找到相同节点，对A的子树和B同时进行遍历
//            {
//
//            }
//            // array.add(node.val);
//            if(node.left != null) queue.offer(node.left);
//            if(node.right != null) queue.offer(node.right);
//            continue;
//
//
//        }
//        return array.stream().mapToInt(Integer::valueOf).toArray();
//
//        //两个相同的根节点开始，进行树的比对
//
//    }

    public int[] constructArr(int[] a) {
        int len = a.length;
        int[] b = new int[len];
        b[0] = 1;
        b[1] = 1;
        for(int i = 1; i<len; i++){ //下三角
            b[i] = a[i-1] * b[i-1];
        }
        int temp = 1;
        for(int i = len-2; i>-1; i--){
            temp = temp * a[i+1];
            b[i] = temp * b[i];
        }

        return b;

    }

}


