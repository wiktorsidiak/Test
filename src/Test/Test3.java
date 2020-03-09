package Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {

    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(7, 15, 24);
        Stream<Integer> integerStream2 = Stream.of(31, 55, 22);
        List<Integer> sortedList = mergeAndSort(integerStream, integerStream2);
        System.out.println(sortedList);
    }

    private static List<Integer> mergeAndSort(Stream<Integer> integerStream, Stream<Integer> integerStream2) {
        return Stream.concat(integerStream, integerStream2).sorted().collect(Collectors.toList());

    }
}
