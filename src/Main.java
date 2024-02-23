import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.print("숫자를 입력하세요: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        DiceConstructor r1 = new DiceConstructor(0);
        DiceConstructor r2 = new DiceConstructor(0);
        DiceConstructor r3 = new DiceConstructor(0);
        DiceConstructor r4 = new DiceConstructor(0);
        DiceConstructor r5 = new DiceConstructor(0);
        DiceConstructor r6 = new DiceConstructor(0);

        DiceConstructor[] dices = {r1,r2,r3,r4,r5,r6};


        for(int i=0;i<a;i++){
            int b = (int) (Math.random() * 6) +1;

            switch (b) {
                case 1:
                    r1.sumDiceNumbers();
                    break;
                case 2:
                    r2.sumDiceNumbers();
                    break;
                case 3:
                    r3.sumDiceNumbers();
                    break;
                case 4:
                    r4.sumDiceNumbers();
                    break;
                case 5:
                    r5.sumDiceNumbers();
                    break;
                case 6:
                    r6.sumDiceNumbers();
                    break;



            }

        }

        int i =1;
        for (DiceConstructor dice : dices) {
              dice.printResult(i);
              i++;
        }


        }



}