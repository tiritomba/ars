package domain.train;

public class NonExistingMovementLine extends MovementLine {

    public NonExistingMovementLine() {}

    @Override
    public boolean isPresent() {
        return false;
    }
}
