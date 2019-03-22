import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        ExerciseGenerator exerciseGenerator = new ExerciseGenerator();
        ArrayList<Exercise> availableExercise = exerciseGenerator.prepareExercise();
        for (Exercise nextExec:availableExercise){
            System.out.println(nextExec.showName());
        }
    }
}
