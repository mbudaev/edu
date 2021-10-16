package or.budaev.edu;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test1 {
    @Test
    public void test1(){
        Assertions.assertThat(5).isPositive();
    }
}
