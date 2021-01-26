public class EG {
    private String name;
    private int value;
    private boolean bool;
    public EG(String name, int value, boolean bool){
        this.name = name;
        this.value = value;
        this.bool = bool;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }

    @Override
    public String toString() {
        return "EG{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", bool=" + bool +
                '}';
    }
}
