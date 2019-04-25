package dominoes;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        List<Domino> snake = new ArrayList<>();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        // [5,2][4,6][1,5][6,7][2,4][7,1]

        // [5,2][2,4][4,6][6,7][7,1][1,5]

        int counter = 0;
        while (snake.size() != dominoes.size()) {
            for (int i = counter; i < dominoes.size(); i++) {
                if (dominoes.get(counter).getRightSide()
                        == dominoes.get(i).getLeftSide()) {
                    snake.add(dominoes.get(counter));
                    snake.add(dominoes.get(i));
                }
            }
            counter++;
        }

        System.out.println(snake);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}
