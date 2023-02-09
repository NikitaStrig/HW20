import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        List<Init> initList = Arrays.asList(
                new Init(1),
                new Init(-3),
                new Init(5)
        );
        Predicate<Init> intPrediceit = new pred();
        for (Init init : initList) {
            if (intPrediceit.test(init)) {
                System.out.println(init);

            }
        }


        List<Name> nameList = Arrays.asList(
                new Name("Sergey"),
                new Name("Petr"),
                new Name("Nikita")
        );
        Consumer<Name> nameConsumer = new Consumer<Name>() {
            @Override
            public void accept(Name name) {
                System.out.println("Hi! " + name.getName());
            }
        };
        for (Name name : nameList) {
            nameConsumer.accept(name);

        }
        Consumer<Name> nameConsumer1 = nameConsumer1 -> ;;

        List<DoubleInt> dou = Arrays.asList(
                new DoubleInt(3_4),
                new DoubleInt(100_4),
                new DoubleInt(34_8)
                );
        Function<DoubleInt, Long> function = new Function<DoubleInt, Long>() {

            @Override
            public Long apply(DoubleInt doubleInt) {
                return doubleInt.getCheck();
            }
        };
        for (DoubleInt doubleInt : dou) {
            System.out.println(function.apply(doubleInt));

        }
    }
}