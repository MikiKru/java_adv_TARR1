package lambdaStreamOptional.util;

import lambdaStreamOptional.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface InMemoryDB {
    List<User> users = new ArrayList<>(
            Arrays.asList(
                 new User(),
            )
    );

}
