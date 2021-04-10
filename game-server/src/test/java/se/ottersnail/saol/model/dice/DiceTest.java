package se.ottersnail.saol.model.dice;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.ottersnail.saol.model.dice.Dice.NotRolledDiceException;

public class DiceTest {

  @Test
  public void rollDice() {
    final Dice dice = new Dice();

    IntStream.range(0, 100)
        .forEach(
            (i) -> {
              final int result = dice.roll();
              dice.printLastDiceResult();
              Assertions.assertTrue(result > 0 && result <= 6);
            });
  }

  @Test
  public void printSomeDice() throws NotRolledDiceException {
    final Dice dice = new Dice();
    final DicePrinter dicePrinter = new DicePrinter(dice);
    final int roll = dice.roll();
    System.out.println("Rolled: " + roll);
    dicePrinter.print();
  }


  @Test
  public void testNotRolledDice(){
    final Dice dice = new Dice();

    final NotRolledDiceException notRolledDiceException = Assertions
        .assertThrows(NotRolledDiceException.class, dice::getLastResult);

  Assertions.assertNotNull(notRolledDiceException);
  }
}
