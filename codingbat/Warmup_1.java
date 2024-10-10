package codingbat;

public class Warmup_1 {

    public boolean sleepIn(boolean weekday, boolean vacation){
        if(!weekday || vacation){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Warmup_1 obj = new Warmup_1();
        System.out.println(obj.sleepIn(false, false));
    }
}
