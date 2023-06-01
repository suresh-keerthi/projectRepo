import  java.util.*;
public class test {
    public static void main(String[] args) {
        String numbers = "10,20,30,40,50";
        StringTokenizer st = new StringTokenizer(numbers,",",false);
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }


    }
}