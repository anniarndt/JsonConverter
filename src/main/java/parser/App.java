package parser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import com.google.gson.Gson;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     *
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Gson g = new Gson();
        try {
            Reader reader = new FileReader("data.json");
            Writer writer = new FileWriter("output.txt");
            DataObject obj = g.fromJson(reader, DataObject.class);
            System.out.println(obj.getName());
            for (Skills c : obj.getSkills()) {
                System.out.println(c.getSkillName());
                writer.write(c.getSkillName() + "\n");
            }
            writer.flush();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
