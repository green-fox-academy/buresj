// - Create an array variable named `p1`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `p2`
//   with the following content: `[4, 5]`
// - Print if `p2` has more elements than `p1`

public class CompareLength {

    public static void main(String[] args) {

        int[] p1 = {1, 2, 4};
        int[] p2 = {4, 5};

        boolean compare = p2.length > p1.length;

        if (compare) {
            System.out.println("p2 is bigger than p1");
        } else {
            System.out.println("p1 is bigger than p2");
        }
    }
}
