import org.junit.jupiter.api.Test;
import org.hamcrest.MatcherAssert.*;

import static org.junit.Assert.assertThat;

class FirstLastPosTest {
@Test
    void factor(){
    char [] letters= {'c','f','j'};
    assertThat(SmallestLetter.nextGreatestLetter(letters,'c'),`is`());
}
}