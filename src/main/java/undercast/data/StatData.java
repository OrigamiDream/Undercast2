package undercast.data;

import java.util.HashMap;

/**
 * Created by jun26 on 2016-04-01.
 */
public class StatData {
    private HashMap<StatType, Object> data = new HashMap<StatType, Object>();

    public void put(StatType type, Object o) {
        data.put(type, o);
    }

    public Object get(StatType type) {
        return (type.getClazz().cast(data.get(type)));
    }
}
