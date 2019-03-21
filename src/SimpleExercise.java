public class SimpleExercise implements Exercise {
    SimpleExercise(){
        String name = "";
        int reps = 0;
        int series = 0;
        char week = 'a';
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
        System.out.println(this.name);
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
