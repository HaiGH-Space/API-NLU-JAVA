package haigh.api.nlu.util;

import com.google.gson.reflect.TypeToken;
import haigh.api.nlu.model.FilteringCondition;
import haigh.api.nlu.model.RegistrationResults;

import java.lang.reflect.Type;
import java.util.List;

public class ListTypeUtil {
    public static final Type dsDKLocType = new TypeToken<List<FilteringCondition>>(){}.getType();
    public static final Type dsKetQuaDKMH  = new TypeToken<List<RegistrationResults>>(){}.getType();
}
