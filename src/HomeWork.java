import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HomeWork {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int a;
        Random random = new Random ();
        for (int i = 0; i < 20; i++){
            a = random.nextInt() % 100;
            list.add(a);
        }
        System.out.println(list);


 /*       System.out.println("Задача №1");
        Stream<Integer> str = list.stream();
        Predicate<Integer> fn;
        fn = (n) -> (n % 2) == 0;
        Stream<Integer> resStream = str.filter(fn);
        System.out.println("n = " + resStream.count());

        System.out.println("Задача №2");
        list.stream()
                .sorted()
                .forEach(value -> System.out.print(value + " "));
        System.out.println();
        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(value -> System.out.print(value + " "));
        System.out.println();

        System.out.println("Задача №3");
        Optional<Integer> min = list.stream()
                .min((o1, o2) -> o1.compareTo(o2));
        System.out.println(min.get());

        Optional<Integer> max = list.stream()
                .max((o1, o2) -> o1.compareTo(o2));
        System.out.println(max.get());

        System.out.println("Задача №4");
        list.stream()
                .filter(value -> value > 20)
                .sorted()

                .forEach(value -> System.out.print((value * 10) + " "));
        System.out.println();*/

        System.out.println("Задача №5");
        list.stream()
                .skip(5)
                .limit(10)
                .forEach(value -> System.out.print(value + " "));
        System.out.println();




/*       System.out.println("Задача №6");
        list.stream()
                .skip(5)
                .limit(10)
                .forEach(value -> System.out.print(((value * 10) + " " )));
        System.out.println();
        list.stream()
                .skip(5)
                .limit(10)
                .sorted(Comparator.reverseOrder())
                .forEach(value -> System.out.print(((value + 5) + " " )));
*/
    }
}
