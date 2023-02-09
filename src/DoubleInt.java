public class DoubleInt {
    private long check;

    @Override
    public String toString() {
        return "DoubleFunction{" +
                "check=" + check +
                '}';
    }

    public Long getCheck() {
        return check;
    }

    public void setCheck(long check) {
        this.check = check;
    }

    public DoubleInt(long check) {
        this.check = check;
    }
}
