//  Create a function that takes a number and an array of integers as a parameter
//  Returns the indices of the integers in the array of which the first number is a part of
//  Or returns an empty array if the number is not part of any of the integers in the array

public class SubInt {

    public static void main(String[] args) {

        int[] array = {1,2,4,4,5,6};
        int num = 4;

        int[] results = finder(array, num);

        for (int i = 0; i < results.length; i++) {

            System.out.print(results[i] + ", ");
        }

    }
    
    public static int[] finder (int[] testedArray, int testedNum) {

        int[] results = new int[testedArray.length];
        int j = 0;

        for (int i = 0; i < testedArray.length; i++) {

            if (testedArray[i] == testedNum) {
                results[j] = i;
                j++;
            }
        }
        return results;
    }

}
