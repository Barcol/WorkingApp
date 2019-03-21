public class SimpleExercise implements Exercise {
    private String name;
    private int reps;
    private int series;
    private char week;

    SimpleExercise(String name, int reps, int series, char week){
        this.name = name;
        this.reps = reps;
        this.series = series;
        this.week = week;
    }

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
        return this.name;
    }

    @Override
    public int showReps() {
        return this.reps;
    }

    @Override
    public int showSeries() {
        return this.series;
    }

    @Override
    public char showWeek() {
        return this.week;
        }
    }
