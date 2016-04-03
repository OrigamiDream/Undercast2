package undercast.setting;

/**
 * Created by jun26 on 2016-03-27.
 */

import io.github.smartsteves.undercast.data.StatType;

import java.util.ArrayList;
import java.util.HashMap;

public class IndicateJson {
    private HashMap<StatType, Boolean> data = new HashMap<StatType, Boolean>();
    private ArrayList<StatType> order = new ArrayList<StatType>();

    private IndicateJson() {
    }

    public boolean get(StatType type) {
        if (!data.containsKey(type)) return false;
        return data.get(data);
    }

    public void set(StatType type, boolean data) {
        this.data.put(type, data);
    }

    public ArrayList<StatType> getOrder() {
        return order;
    }
}
