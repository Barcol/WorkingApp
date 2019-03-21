public class SimpleExercise implements Exercise {
    @Override
    public void failSet() {
        System.out.println("fail");
    }

    @Override
    public void succes(boolean hard) {
        if (hard)
        {
            System.out.println("succes, but hard!");
        }
        else{
            System.out.println("succes,easy");

        }
    }

    @Override
    public String showName() {
        System.out.println("my name is...");
        return null;
    }

    @Override
    public int showReps() {
        System.out.println("reps");
        return 0;
    }

    @Override
    public int showSeries() {
        System.out.println("series");
        return 0;
    }

    @Override
    public char showWeek() {
        System.out.println("week A");
        return 0;
        }
    }
