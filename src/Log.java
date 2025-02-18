import java.time.LocalDate;

public class Log {
    private int id;
    private String characterName;
    private Stufe stufe;
    private String description;
    private LocalDate date;
    private Double kraftPunkte;

    public Log(int id, String characterName, Stufe stufe, String description, LocalDate date, Double kraftPunkte) {
        this.id = id;
        this.characterName = characterName;
        this.stufe = stufe;
        this.description = description;
        this.date = date;
        this.kraftPunkte = kraftPunkte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public Stufe getStufe() {
        return stufe;
    }

    public void setStufe(Stufe stufe) {
        this.stufe = stufe;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getKraftPunkte() {
        return kraftPunkte;
    }

    public void setKraftPunkte(Double kraftPunkte) {
        this.kraftPunkte = kraftPunkte;
    }

    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", characterName='" + characterName + '\'' +
                ", stufe=" + stufe +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", kraftPunkte=" + kraftPunkte +
                '}';
    }
}
