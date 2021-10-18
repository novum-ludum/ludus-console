package global;

import com.ludus.global.GlobalEnvironment;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GlobalEnvironmentTest {
    @Test
    public void checkFileExists() throws IOException {
        Assert.assertTrue(GlobalEnvironment.getErrOut().exists());
    }

}
