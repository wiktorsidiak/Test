package Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIClass {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        for(String s : list){
            System.out.println(s);
        }
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        Stream<String> stream = list.stream();
        stream.forEach(x -> System.out.println(x));
    }
}
