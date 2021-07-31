package factory;

import model.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class UserFactoryTest {
    String name = "Zosia";

    @Test
    void shouldCheckIfCreatesUserWithRightName() {

        //when
        User user = UserFactory.createUser(name);
        String testedName = user.getName();

        //then
        Assertions.assertThat(testedName).isEqualTo(name);

    }

}