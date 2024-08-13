//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int startScore = 100; // начальный счет
        int replenishment = 1100; // сумма пополнения

        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;

        } else {

            bonus = 0;

        }

        int finalScore;
        {
            finalScore = (bonus + replenishment);

            System.out.println();

            System.out.println  ( finalScore );

            System.out.println (bonus);


        }
    }
}
