package base;

public class test1 {
    public static void main(String [] args){
//        String s= "try";
//
//        System.out.println(System.identityHashCode(s)+"   "+s);
//        s = "a"; //实际已经新建了一个地址了，和原来的是，已经不在是同一个地址了
//        System.out.println(System.identityHashCode(s)+"   "+s);
//        String s1 = "testString"; //在string pool中被新建
//        System.out.println(System.identityHashCode(s1)+"   "+s1);
//        String s2 = "testString";
//        System.out.println(System.identityHashCode(s2)+"   "+s2);
//        if(s1 == s2) System.out.println("equals!");
//        A a = new A();
//        A b = new A();
//        Integer a = new Integer(1);
//        Integer b = new Integer(1);
//        int a = 1;
//        int b = 1;
//        System.out.println(System.identityHashCode(a));
//        System.out.println(System.identityHashCode(b));
//        System.out.println(a.equals(b));
//        b = 3;
//        System.out.println(System.identityHashCode(b));
//        System.out.println(a==b);
//        System.out.println(a.equals(y));
//        ToStringExample example = new ToStringExample(123);
//        System.out.println(example.toString());
//
//        System.out.println(example.getNumber());
        CloneExample e1 = new CloneExample();


        try{
            CloneExample e2 = e1.clone();
            System.out.println("lalalla");
            System.out.println(System.identityHashCode(e1));
            System.out.println(System.identityHashCode(e2));
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }



    }
}

//class ToStringExample {
//    private int number;
//    public ToStringExample(int number) {
//        this.number = number;
//    }
//
//    public int getNumber() {
//        return number;
//    }
//}

