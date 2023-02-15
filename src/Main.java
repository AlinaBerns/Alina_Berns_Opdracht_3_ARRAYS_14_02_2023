import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//OPDRACHT 3
        System.out.println("*** OPDRACHT 3 ***");



        Scanner in = new Scanner(System.in);

        Random random = new Random();
        int random_row = random.nextInt(10);
        int random_column = random.nextInt(10);
        System.out.println(random_row);
        System.out.println(random_column);

        char[][] player = new char[10][10];

        int row;
        int column;
        int end = 0;
        int attempts = 5;


        System.out.println("START GAME!");

        do {
            System.out.println("Enter a row: ");
            row = in.nextInt();

            System.out.println("Enter a column: ");
            column = in.nextInt();


            for (int i = 0; i < player.length; i++) {
                for (int j = 0; j < player[i].length; j++) {
                    player[i][j] = '-';
                    player[row-1][column-1] = '*';
                    System.out.print(player[i][j] + " ");
                }
                System.out.println();
            }

            if (row==random_row&&column==random_column) {
                System.out.println("EGG!!!");

            } else if (row>random_row&&column==random_column) {
                System.out.println("Egg to the south");

            } else if (row<random_row&&column==random_column) {
                System.out.println("Egg to the north");

            }else if (row==random_row&&column>random_column){
                System.out.println("Egg to the west");

            }else if(row==random_row&&column<random_column){
                System.out.println("Egg to the east");

            } else if (row>random_row&&column>random_column) {
                System.out.println("Egg to the south");
                System.out.println("Egg to the west");

            } else if (row>random_row&&column<random_column) {
                System.out.println("Egg to the south");
                System.out.println("Egg to the east");

            }else if (row<random_row&&column>random_column){
                System.out.println("Egg to the north");
                System.out.println("Egg to the west");

            }else {
                System.out.println("Egg to the north");
                System.out.println("Egg to the east");
            }

        } while (row!=random_row||column!=random_column);
    }
}

