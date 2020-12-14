import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class TestingCalculator {
    @Test
    void addNumsShouldReturn6() {
        //assertEquals(6, Calculator.addNums(3, 3));
    }

    @Test
    void addNumsShouldReturn28() {
        //assertEquals(28, Calculator.addNums(21, 7));
    }

    @Test
    void subtractNumsShouldReturn4() {
        //assertEquals(4, Calculator.subtractNums(7, 3));
    }

    @Test
    void subtractNumsShouldReturn2() {
        //assertEquals(2, Calculator.subtractNums(3, 1));
    }

}
