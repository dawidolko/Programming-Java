public class TV {
    private int size;
    private String name;
    private boolean onOff;

    public TV(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void setOnOff(boolean onOff) {
        if(onOff)
        {
            System.out.println("TV is on");
        }else
        {
            System.out.println("TV is off");
        }
    }

    public boolean getOnOff() {
        return onOff;
    }
}
