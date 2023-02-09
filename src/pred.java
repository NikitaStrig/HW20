import java.util.function.Predicate;

public  class pred implements Predicate<Init> {
    private static final int CHECK_INT = 0;
    @Override
    public boolean test(Init init) {
        return init.getInit() > CHECK_INT ;
    }
}
