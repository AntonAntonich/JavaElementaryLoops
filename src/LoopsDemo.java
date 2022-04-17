import java.util.Scanner;

// Задача вывести строчку Hello World  100 раз

public class LoopsDemo {
    public static void main(String[] args) {
        String message = "Hello World";

//        for(int i = 0; i < 10; i++) {
//
//            System.out.println(i + " " + message);
//
//        }


//        for (int i = 1; i <= 10; i++) {
//            System.out.print(i + " ");
//        }

//        for (int i = 10; i > 0; i--) {
//            System.out.print(i + " ");
//        }


//        for (int i = 1; i <= 20; i *= 2) {
//            System.out.print(i + " ");
//        }

//        for(int i = 19; i > 0; i -= 2) {
//            System.out.print(i + " ");
//        }


//        for (int i = 1; i <= 10; i++) {
//            if (i == 3 || i == 7) {
//                continue;
//            }
//
//            System.out.print(i + " ");
//        }


//        for (int counterOne = 0, counterTwo = 20;
//             counterOne < 10 && counterTwo > 10;
//             counterOne++, counterTwo--) {
//
//            System.out.print("counter 1 = " + counterOne + "\n");
//            System.out.print("counter 2 = " + counterTwo + "\n");
//            System.out.println();
//        }


//        for (int i = 0; i < 10; i++) {
//            System.out.print("i - " + i + " ");
//
//            for(int j = 0; j < 10; j ++) {
//                System.out.print(j);
//
//                for(int a = 0; a < 5; a++) {
//                    // some code
//                }
//            }
//
//            System.out.println();
//        }

        int counter = 10;


//        while(counter <= 10) {
//            System.out.println("counter = " + counter);
//            counter++;
//        }

//        do {
//            System.out.println(counter);
//        } while (counter > 100);


        Scanner scanner = new Scanner(System.in);

        while (true) {
            int choose = scanner.nextInt();
            if (choose == -1) {
                break;
            }

        }

        System.out.println("END");
    }
}
