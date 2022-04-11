import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LessonFifteen {
    public static void main(String[] args) {
/*        Human human = new Human(15, "test");
        Optional<Human> optionalHuman = Optional.of(human);
        optionalHuman.ifPresent(value -> System.out.println(value));
        System.out.println(optionalHuman.get());
        System.out.println(optionalHuman.isPresent());
        optionalHuman = Optional.empty();
        System.out.println(optionalHuman.orElse(new Human(15, "dafvcxb")));*/

/*        Optional<Human> human = returnSomeValue();
        if (human.isPresent()) {
            Human human1 = human.get();
            System.out.println(human1);
        }
        human.isPresent(value -> System.out.println(value);*/

/*        Optional<Human> optionalHuman = returnSomeValue();
        if (optionalHuman.isPresent()) {
            Human human = optionalHuman.get();
            System.out.println(human);
        } else {
            System.out.println("obertka pusta");
        }*/

/*        ArrayList arrayList = new ArrayList();
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(16);
        arrayList.add(1);
        arrayList.stream()
                .filter()
                .filter()
                .skip()
                .distinct()*/

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(12);
        list.add(12);
        list.add(16);
        list.add(1);

/*        List<Integer> collect = list.stream()
                .filter(value -> value > 10)
                .skip(1)
                .collect(Collectors.toList());
        System.out.println(collect));*/

/*        list.stream()
//дублирующие значения\ удалены
                .distinct()
                .forEach(value -> System.out.println(value));*/

/*        list.stream()
                //сортированый лист элементов
                .sorted()
                .forEach(value -> System.out.println(value));*/

 /*       Optional<Integer> min = list.stream()
                //минимальное значение
                .min((o1, o2) -> o1.compareTo(o2));

        System.out.println(min.get());*/

 /*       list.stream()
                //упрощённый вариант
                .sorted()
                .forEach(System.out::println);

        Optional<Integer> min = list.stream()

                .min(Integer::compareTo);

        System.out.println(min.get());*/


    }




 /*   public static Optional<Human> returnSomeValue() {
        Human human = new Human(15321, "tsdfdft");
        return Optional.of(Human);

 //       return Optional.ofNullable(null);
    }*/
}
