import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Parser for TSV files.
 */
public class TSVLogParser {

    public List<Log> parse(String filePath) throws IOException {
        List<Log> logEntries = new ArrayList<>();
        Path file = Path.of(filePath);

        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String header = reader.readLine(); // Ignore header row
            String line;
            while ((line = reader.readLine()) != null) {
                String[] field = line.split("\t");
                if (field.length != 6) continue; // Filed number validation
                int id = Integer.parseInt(field[0]);
                String characterName = field[1];
                Stufe stufe = Stufe.valueOf(field[2].toUpperCase());
                String description = field[3];
                LocalDate date = LocalDate.parse(field[4]);
                Double kraftPunkte = Double.parseDouble(field[5]);

                logEntries.add(new Log(id, characterName, stufe, description, date, kraftPunkte));
            }
        }
        return logEntries;
    }
}