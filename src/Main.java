import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {

    public static void main(String[] args) {
        ExerciseGenerator exerciseGenerator = new ExerciseGenerator();
        ArrayList availableExercise = exerciseGenerator.prepareExercise();
        for (Exercise nextExec:availableExercise){
            System.out.println(nextExec);
        }
    }
}
