import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        List<Hw20> hw20ListList = Arrays.asList(
                new Hw20("Sergey", 1, 3_4),
                new Hw20("Petr", -8, 37_4),
                new Hw20("Max", 13, 312_4)
        );

        System.out.println("---Predicate----");
        Predicate<Hw20> intPrediceit = new Predicate<Hw20>() {
            @Override
            public boolean test(Hw20 hw20) {
                return hw20.getAge() > 0;
            }
        };
        for (Hw20 hw20 : hw20ListList) {
            if (intPrediceit.test(hw20)) {
                System.out.println(hw20.getAge());
            }

        }
        System.out.println("---L----");
        Predicate<Hw20> intPrediceit1 = hw20 -> hw20.getAge() > 0;
        for (Hw20 hw20 : hw20ListList) {
            if (intPrediceit1.test(hw20)) {
                System.out.println(hw20.getAge());
            }

        }
        System.out.println("---Consumer----");
        Consumer<Hw20> nameConsumer = new Consumer<Hw20>() {
            @Override
            public void accept(Hw20 hw20) {
                System.out.println("Hi! " + hw20.getName());
            }
        };
        for (Hw20 hw20 : hw20ListList) {
            nameConsumer.accept(hw20);

        }
        System.out.println("----L---");
        Consumer<Hw20> nameConsumer1 = hw20 -> System.out.println("Hi! " + hw20.getName());
        for (Hw20 hw20 : hw20ListList) {
            nameConsumer1.accept(hw20);

        }
        System.out.println("-----Function------");
        Function<Hw20, Long> function = new Function<Hw20, Long>() {
            @Override
            public Long apply(Hw20 hw20) {
                return hw20.getCheck();
            }
        };
        for (Hw20 hw20 : hw20ListList) {
            System.out.println(function.apply(hw20));

        }

        System.out.println("----L---");
        Function<Hw20, Long> function1 = hw20 -> hw20.getCheck();
        for (Hw20 hw20 : hw20ListList) {
            System.out.println(function1.apply(hw20));

        }
        System.out.println("--------Supplier-------");

        Supplier<Double> integerSupplier = new Supplier<Double>() {

            @Override
            public Double get() {
                final double max = 100;
                return Math.random() * max;
            }
        };
        System.out.println(integerSupplier.get());

        System.out.println("--L--");
        Supplier<Double> integerSupplier1 = () -> {
            final double max = 100;
            return Math.random() * max;
        };
        System.out.println(integerSupplier1.get());

        System.out.println("----");


    }

}