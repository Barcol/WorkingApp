import java.util.Map;

public class ExerciseGenerator {

    public static SimpleExercise generateExercise(Map data) {
        return new SimpleExercise(data["name"], data["reps"], data["series"], data["week"]);
    }
}
