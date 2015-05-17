import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AppTest {

    @Test
    public void a() {
        assertThat(StringUtils.isEmpty(new App().hello()), is(false));
    }
}