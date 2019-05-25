import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercises {

    public static void main(String[] args) {
        List<Integer> numbersOne = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        //Ex 1: Print evens
        numbersOne.stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);

        //Ex 2: Positive numbers
        numbersOne.stream()
                .filter(x -> x > 0)
                .forEach(System.out::println);

        //Ex 3: Write a Stream Expression to find which number squared value is more then 20
        List<Integer> numbersTwo = Arrays.asList(3, 9, 2, 8, 6, 5);

        numbersTwo.stream()
                .filter(x -> x * x > 20)
                .forEach(System.out::println);

        //Ex 4: Avarage odd numbers

        IntStream odds = numbersOne.stream()
                .filter(x -> x % 2 != 0)
                .mapToInt(Integer::intValue);

        System.out.println(odds.average());


        //Ex 5: Write a Stream Expression to get the sum of the odd numbers
        List<Integer> numbersThree = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
        Integer sumTwo = numbersThree.stream()
                .filter(x -> x % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sumTwo);


        //Ex 6: Write a Stream Expression to find the uppercase characters in a string!
        String test = "Hello Everyone";
        List<Character> testChar = new ArrayList<>();
        for (Character chari : test.toCharArray()) {
            testChar.add(chari);
        }

        testChar.stream()
                .filter(s -> s.equals(Character.toUpperCase(s)))
                .forEach(System.out::println);

        //Ex 7: Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        cities.stream()
                .filter(s -> s.startsWith("N"))
                .forEach(System.out::println);

        //Ex 8: Write a Stream Expression to concatenate a Character list to a string!
        List<Character> abcd = new ArrayList<>();
        abcd.add('a');
        abcd.add('b');
        abcd.add('c');
        abcd.add('d');

        String str = abcd.stream()
                .map(e -> e.toString())
                .collect(Collectors.joining());

        System.out.println(str);

        //Ex 9: Write a Stream Expression to find the frequency of characters in a given string!
        String word = "umbadghuom";

        //Count frequency of a concrete character
        long count = word.chars()
                .filter(c -> c == 'u')
                .count();
        System.out.println(count);

        //Count frequency of all characters
        Map<String, Long> frequentChars = Arrays.stream(word.toLowerCase().split(""))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(frequentChars);
    }
}
