package utils;

import java.io.*;

public class TxtHelper {
    public void writeTextToFile(String textToWrite) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(new PropertiesReader().getTxtPath()))) {
            writer.write(textToWrite);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String readTextFromFile() {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(new PropertiesReader().getTxtPath()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}
