package se.ottersnail.saol.model.dice;

import se.ottersnail.saol.model.dice.Dice.NotRolledDiceException;

public interface ConsolePrinter {


  void print() throws NotRolledDiceException;

}
