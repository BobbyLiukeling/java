package base;

public class Test_Generic {
    public static void main(String [] args){
//        Generic<Integer> Generic = new Generic<Integer>(123);
        Generic<String> Generic = new Generic<String>("try");
        System.out.println(Generic.getKey());
    }
}
