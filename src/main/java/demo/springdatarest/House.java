package demo.springdatarest;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "house", types = {Home.class})
public interface House {

    String getStreet();

    String getNumber();
}
