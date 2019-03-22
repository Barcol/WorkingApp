import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

class ExerciseGenerator {

    private SimpleExercise generateExercise(Map data) {
        return new SimpleExercise((String) data.get("name"), Math.toIntExact((long) data.get("reps")),
                Math.toIntExact((long) data.get("series")), ((String) data.get("week")).charAt(0));
    }

    ArrayList prepareExercise(){
        JSONParser jsonParser = new JSONParser();
        ArrayList<SimpleExercise> availableExercises = new ArrayList<>();
        try (FileReader reader = new FileReader("exercises.json"))
        {
            Object obj = jsonParser.parse(reader);
            JSONArray exercisesList = (JSONArray) obj;
            exercisesList.forEach( exec -> availableExercises.add(this.generateExercise((JSONObject) exec )));

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return availableExercises;
    }
}
