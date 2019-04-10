// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`

public class Reverse {

    public static void main(String[] args) {

        int[] aj = {3, 4, 5, 6, 7};
        int reverse[] = new int[aj.length];
        int j = 0;

        for (int i = aj.length - 1; i >= 0; i--) {
            reverse[j] = aj[i];
            System.out.print(reverse[j] + ", ");
            j++;
        }
    }
}
