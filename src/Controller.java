import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Controller {

    private final List<Log> logEntries;

    public Controller(List<Log> logEntries) {
        this.logEntries = logEntries;
    }

    /**
     * Filter games by user input minimal capacity value.
     * @param min
     * @return
     */
    public List<String> filterKraftPunktenByMin(Double min) {
        Set<String> uniqueNinjas = new HashSet<>();

        for (Log entry : logEntries) {
            Double kraft = entry.getKraftPunkte();
            if (kraft >= min) {
                String ninja = entry.getCharacterName();
                uniqueNinjas.add(ninja);
            }
        }
        return new ArrayList<>(uniqueNinjas);
    }

    /**
     * Sort Jonin by date.
     * @return
     */
    public List<Log> sortJoninbyDate() {
        List<Log> Jonin = new ArrayList<>();
        for (Log entry : logEntries) {
            if(entry.getStufe()== Stufe.Jonin)
                Jonin.add(entry);
        }
        Jonin.sort(Comparator.comparing(Log::getDate));
        return Jonin;
    }


}

