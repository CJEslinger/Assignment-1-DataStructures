package episode1;

public class Person extends Creature {
    private int directionToMoster;
    private int currentDirection;
    public Person(Model model, int row, int column) {
        super(model, row, column);
        //currentDirection = Model.random(Model.MAX_DIRECTION, Model.MIN_DIRECTION);
    }

    int decideMove() {
		currentDirection = Model.random(Model.MIN_DIRECTION, Model.MAX_DIRECTION);
        for (int i = Model.MIN_DIRECTION; i <= Model.MAX_DIRECTION; i++){
            if(look(i) == Model.MONSTER){
                directionToMoster = i;
                return pickBestMove();
            }
        } return Model.STAY;
    }

    public int pickBestMove() {
        if (canMove(Model.turn(directionToMoster, 3)))
            return Model.turn(directionToMoster, 3);
        else if (canMove(Model.turn(directionToMoster, 5)))
            return Model.turn(directionToMoster, 5);
        else if (canMove(Model.turn(directionToMoster, 6)))
            return Model.turn(directionToMoster, 6);
        else if (canMove(Model.turn(directionToMoster, 2)))
            return Model.turn(directionToMoster, 2);
        else if (canMove(Model.turn(directionToMoster, 4)))
            return Model.turn(directionToMoster, 4);
        else if (canMove(Model.turn(directionToMoster, 1)))
            return Model.turn(directionToMoster, 1);
        else if (canMove(Model.turn(directionToMoster, 7)))
            return Model.turn(directionToMoster, 7);
        else return Model.STAY;
    }
}
