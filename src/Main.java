import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {

    public static void main(String[] args) {
        ExerciseGenerator execGen = new ExerciseGenerator();
        JSONParser jsonParser = new JSONParser();
        ArrayList<SimpleExercise> availableExercises = new ArrayList<>();
        try (FileReader reader = new FileReader("exercises.json"))
        {
            Object obj = jsonParser.parse(reader);
            JSONArray exercisesList = (JSONArray) obj;
            exercisesList.forEach( exec -> availableExercises.add(execGen.generateExercise((JSONObject) exec )));

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        availableExercises.forEach(exec -> {System.out.println(exec.showWeek());
                                            System.out.println(exec.showSeries());
                                            System.out.println(exec.showReps());
                                            System.out.println(exec.showName());
                                            });
    }
}
