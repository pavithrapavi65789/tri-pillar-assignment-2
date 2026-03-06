package MODULE_4;

public class StringComparison {
    public static void main(String[] args) {

        String s = "Hello";

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java");

        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");

        System.out.println(s);
        System.out.println(sb);
        System.out.println(sbf);
    }
}
