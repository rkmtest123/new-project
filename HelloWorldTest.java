import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.github.stefanbirkner.systemlambda.SystemLambda;

public class HelloWorldTest {

    @Test
    public void testMain() throws Exception {
        String expectedOutput = "Hello World!!!\n" +
                                "Welcome to the future!\n";
        for (int j = 1; j <= 100; j++) {
            expectedOutput += "The number is " + j + "\n";
        }
        expectedOutput += "Collaborators: Ravi Mandala, Ravi Mandala test1\n";

        String actualOutput = SystemLambda.tapSystemOut(() -> {
            HelloWorld.main(new String[]{});
        });

        assertEquals(expectedOutput, actualOutput);
    }
}
