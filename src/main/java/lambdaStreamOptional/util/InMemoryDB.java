package lambdaStreamOptional.util;

import lambdaStreamOptional.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface InMemoryDB {
    List<User> users = new ArrayList<>(
            Arrays.asList(
                 new User("mk@mk.pl", "mk"),
                 new User("kk@kk.pl", "kk"),
                 new User("tt@tt.pl", "tt"),
                 new User("rr@rr.pl", "rr"),
                 new User("ee@ee.pl", "ee"),
                 new User("ww@ww.pl", "ww"),
                 new User("qq@qq.pl", "qq"),
                 new User("ii@ii.pl", "ii")
            )
    );

}
