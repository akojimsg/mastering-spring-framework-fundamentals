package com.akojimsg.msff;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class AppTest {
    @Test
    void testApp() {
        App app = new App();
        App.main(null);
        Assertions.assertTrue(true);
        Assertions.assertNotNull(app);
    }
}
