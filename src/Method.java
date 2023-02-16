import java.util.Arrays;

public class Method {
    public static void main(String[] args) {
        String name = "Vinayak Gardi";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(name.concat(" is cool")); // creating a new object
        System.out.println(name.indexOf('G'));
    }
}
