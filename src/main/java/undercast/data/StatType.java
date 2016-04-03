package undercast.data;

/**
 * Created by jun26 on 2016-04-01.
 */
public enum StatType {
    ENABLE(Boolean.class),
    FPS(Integer.class),
    KILL(Integer.class),
    DEATH(Integer.class),
    KD(Double.class),
    KILL_STREAK(Integer.class),
    SERVER(String.class),
    TEAM(String.class),
    PLAYING_TIME(Integer.class),
    MATCH_TIME(Integer.class),
    CURRENT_MAP(String.class),
    NEXTMAP(String.class);
    private Class clazz;

    StatType(Class clazz) {
        this.clazz = clazz;
    }

    Class getClazz() {
        return clazz;
    }
}
