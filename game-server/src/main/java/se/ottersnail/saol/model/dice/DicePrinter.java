package se.ottersnail.saol.model.dice;

import java.util.Arrays;
import java.util.stream.Collectors;
import se.ottersnail.saol.model.dice.Dice.NotRolledDiceException;

public class DicePrinter implements ConsolePrinter {

  private static final String TWO_DOTS_ROW = "* *\n";
  private static final String ONE_CENTER_DOT_ROW = " * \n";
  private static final String ONE_LEFT_DOT_ROW = "*  \n";
  private static final String ONE_RIGTH_DOT_ROW = "  *\n";
  private static final String EMPTY_ROW = "   \n";

  private static final String SIX = TWO_DOTS_ROW+TWO_DOTS_ROW+TWO_DOTS_ROW;
  private static final String FIVE = TWO_DOTS_ROW + ONE_CENTER_DOT_ROW + TWO_DOTS_ROW;

  private static final String FOUR = TWO_DOTS_ROW + EMPTY_ROW + TWO_DOTS_ROW;
  private static final String THREE = ONE_LEFT_DOT_ROW + ONE_CENTER_DOT_ROW + ONE_RIGTH_DOT_ROW;
  private static final String TWO = ONE_LEFT_DOT_ROW + EMPTY_ROW + ONE_RIGTH_DOT_ROW;
  private static final String ONE = EMPTY_ROW + ONE_CENTER_DOT_ROW + EMPTY_ROW;

  private final Dice dice;

  public DicePrinter(final Dice dice) {
    this.dice = dice;
  }



  @Override
  public void print() throws NotRolledDiceException {
    switch (this.dice.getLastResult()) {
      default:
        throw new IllegalArgumentException("No dots to print!");
      case 1:
        this.printDiceDots(ONE);
        break;
      case 2:
        this.printDiceDots(TWO);
        break;
      case 3:
        this.printDiceDots(THREE);
        break;
      case 4:
        this.printDiceDots(FOUR);
        break;
      case 5:
        this.printDiceDots(FIVE);
        break;
      case 6:
        this.printDiceDots(SIX);
        break;
    }
  }

  private void printDiceDots(final String dots) {

    final String addedSides = Arrays.stream(dots.split("\n"))
        .map(s -> "|" + s + "|\n")
        .collect(Collectors.joining());

    System.out.println(this.DICE_TOP);
    System.out.print(addedSides);
    System.out.println(this.DICE_BOTTOM);
  }

  private final String DICE_SIDE_PREFIX = "|";
  private final String DICE_SIDE_POSTFIX = "|\n";
  private final String DICE_TOP = " ___";
  private final String DICE_BOTTOM = " \"\"\" ";

  private String putDiceSides(final String s) {
    return this.DICE_SIDE_PREFIX + this.DICE_SIDE_POSTFIX;
  }
}
