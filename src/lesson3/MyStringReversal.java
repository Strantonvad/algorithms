package lesson3;

public class MyStringReversal {
    public String revers(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}
