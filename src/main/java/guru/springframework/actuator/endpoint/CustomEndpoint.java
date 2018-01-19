package guru.springframework.actuator.endpoint;


import org.springframework.boot.actuate.endpoint.AbstractEndpoint;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Uwe Sauerbrei on 19.01.2018
 */
@Component
public class CustomEndpoint extends AbstractEndpoint<List<String>> {

    public CustomEndpoint() {
        // id(path) / is sensitive
        super("customEndpoint", false);
    }

    @Override
    public List<String> invoke() {
        List<String> list = new ArrayList<>();
        list.add("Umphrey's");
        list.add("McGee");
        list.add("Zulu Rocks");
        return list;
    }
}
