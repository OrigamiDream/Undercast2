package undercast.webParser.data;

import java.util.ArrayList;

/**
 * Created by JUN on 2016-03-19.
 */
public class OvercastEncounter {
    private ArrayList<EncounterLine> line;

    public OvercastEncounter(ArrayList<EncounterLine> line) {
        this.line = line;
    }

    public EncounterLine getLine(int index) {
        return line.get(index);
    }

    @Override
    public String toString() {
        return "OvercastEncounter{" +
                "line=" + line +
                '}';
    }

    public static class EncounterLine {
        private String kill, death;
        private String map;
        private String match;
        private String date;

        public EncounterLine(String kill, String death, String map, String match, String date) {
            this.kill = kill;
            this.death = death;
            this.map = map;
            this.match = match;
            this.date = date;
        }

        public String getKill() {
            return kill;
        }

        public String getDeath() {
            return death;
        }

        public String getMap() {
            return map;
        }

        public String getMatch() {
            return match;
        }

        public String getDate() {
            return date;
        }

        @Override
        public String toString() {
            return "EncounterLine{" +
                    "kill='" + kill + '\'' + "\n" +
                    ", death='" + death + '\'' + "\n" +
                    ", map='" + map + '\'' + "\n" +
                    ", match='" + match + '\'' + "\n" +
                    ", date='" + date + '\'' + "\n" +
                    '}' + "\n";
        }
    }
}
