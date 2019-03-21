import java.util.HashMap;

public class ExerciseGenerator {

    public static void generateExercise(HashMap[] data) {
        return (Exercise) new SimpleExercise(data["name"], data["reps"], data["series"], data["week"]);

    }
}
