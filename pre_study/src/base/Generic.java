package base;

import java.util.ArrayList;
import java.util.List;

//泛型
public class Generic <T>{
    private T key;
    public Generic(T key){
        this.key = key;
    }
    public T getKey(){
        return this.key;
    }
}
