import java.util.Map;

class ExerciseGenerator {

    SimpleExercise generateExercise(Map data) {
        return new SimpleExercise((String) data.get("name"), Math.toIntExact((long) data.get("reps")),
                Math.toIntExact((long) data.get("series")), ((String) data.get("week")).charAt(0));
    }
}
