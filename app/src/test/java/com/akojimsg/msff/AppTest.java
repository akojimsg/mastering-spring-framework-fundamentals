package com.akojimsg.msff;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AppTest {
    @Test
    public void testApp() {
        App app = new App();
        App.main(null);
        Assertions.assertTrue(true);
        Assertions.assertNotNull(app);
    }
}
