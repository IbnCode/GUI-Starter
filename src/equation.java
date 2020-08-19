public class equation {
    private int value;
    private boolean isUsed;
    public equation(){
        isUsed = false;
    }
    public equation(int value, boolean isUsed){
        this.value = value;
        this.isUsed = isUsed;
    }
    public void setValue(int value){
        this.value = value;
    }
    public void setUsed(boolean isUsed){
        this.isUsed = isUsed;
    }

    public int getValue() {
        return value;
    }
    public boolean getUsed(){
        return isUsed;
    }
}
