import java.util.ArrayList;

public class C5Ex0 {

    public static void main(String[] args) {
        ArrayList<String> stringA = new ArrayList<>();

        stringA.add("unu");
        stringA.add("doi");
        stringA.add("trei");
        stringA.add("patru");
        stringA.add("cinci");

        stringA.add(2, "zero");
        System.out.println(stringA);

        System.out.println(stringA.get(2));

        stringA.remove( 1);
        System.out.println(stringA.size());
        System.out.println(stringA);

        stringA.set(3,"zece");
        System.out.println(stringA);

        stringA.clear();
        System.out.println(stringA);
    }
}
