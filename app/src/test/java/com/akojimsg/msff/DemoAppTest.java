package com.akojimsg.msff;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class DemoAppTest {
    @Test
    void testApp() {
        DemoApp app = new DemoApp();
        DemoApp.main(null);
        Assertions.assertTrue(true);
        Assertions.assertNotNull(app);
    }
}
