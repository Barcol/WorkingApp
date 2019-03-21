import java.util.Map;

public class ExerciseGenerator {

    public SimpleExercise generateExercise(Map data) {
        return new SimpleExercise((String) data.get("name"), (int) data.get("reps"), (int) data.get("series"),
                (char) data.get("week"));
    }
}
