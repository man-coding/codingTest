import java.util.Arrays;

public class CodingTest {
    public static void main(String[] args) {

        int x = 1;
        String str = "나는 " + x+ "이다.";
        System.out.println(str);

        String[] seoul = {"Kim", "Yu"};
        int a = Arrays.asList(seoul).indexOf("Yu");
        System.out.println(a);


        int c = 1;
        int b = 10;

        int d = Math.min(c, b);
        System.out.println(d);


    }
}
