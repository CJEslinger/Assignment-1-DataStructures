package episode1;

public class Person extends Creature {
    public Person(Model model, int row, int column) {
        super(model, row, column);
    }
    
    int decideMove() {
		return random(Model.MIN_DIRECTION, Model.MAX_DIRECTION);
    }
}
