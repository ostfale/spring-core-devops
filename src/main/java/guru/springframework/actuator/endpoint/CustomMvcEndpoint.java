package guru.springframework.actuator.endpoint;

import org.springframework.boot.actuate.endpoint.mvc.EndpointMvcAdapter;
import org.springframework.stereotype.Component;

/**
 * Created by Uwe Sauerbrei on 19.01.2018
 */
@Component
public class CustomMvcEndpoint extends EndpointMvcAdapter {

    public CustomMvcEndpoint(CustomEndpoint customEndpoint) {
        super(customEndpoint);
    }
}
