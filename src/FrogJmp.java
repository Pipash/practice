public class FrogJmp {
    public Integer jump (int X, int Y, int D) {
        if (X < 0 || Y < 0 || D < 0) {
            return 0;
        }
        if (X > Y) {
            return 0;
        }
        int numberOfSteps = 0;
        while (true) {
            if (X == Y || X > Y) {
                break;
            }
            X += D;
            numberOfSteps++;
        }

        return numberOfSteps;
    }
}
