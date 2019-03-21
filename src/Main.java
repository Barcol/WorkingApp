import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {

    public static void main(String[] args) {
        ExerciseGenerator execGen = new ExerciseGenerator();
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader("exercises.json"))
        {
            Object obj = jsonParser.parse(reader);
            JSONArray exercisesList = (JSONArray) obj;
            exercisesList.forEach( exec -> execGen.generateExercise( (JSONObject) exec ) );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
