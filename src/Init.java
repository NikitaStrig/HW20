public class Init {
    private int init;

    public Init(int init) {
        this.init = init;
    }

    @Override
    public String toString() {
        return "Init{" +
                "init=" + init +
                '}';
    }

    public int getInit() {
        return init;
    }

    public void setInit(int init) {
        this.init = init;
    }
}
