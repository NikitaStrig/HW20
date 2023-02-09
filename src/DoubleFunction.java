import java.util.List;
import java.util.function.Function;

public class DoubleFunction  implements Function<DoubleInt,Long> {
    @Override
    public Long apply(DoubleInt doubleInt) {
        return doubleInt.getCheck();
    }


    }

