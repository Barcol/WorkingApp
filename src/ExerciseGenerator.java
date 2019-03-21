import java.util.Dictionary;

public class ExerciseGenerator {

    public static void generateExercise(Dictionary[] data) {
        return (Exercise) new SimpleExercise(data["name"], data["reps"], data["series"], data["week"]);

    }
}
