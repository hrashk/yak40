package ya.praktikum.sprint3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class SpeedLightsTest {
    SpeedLights cityLights;

    @Before public void constructLights() {
        cityLights = new SpeedLights(60);
    }

    @Test public void showLightNotSpeedingGreen() {
        assertEquals("green", cityLights.showLights(55));
    }

    @Test public void showLightSpeedingLessThan20Yellow() {
        assertEquals("yellow", cityLights.showLights(70));
    }

    @Test public void showLightSpeedingGreaterThan20Red() {
        assertEquals("red", cityLights.showLights(81));
    }

    @Test public void showLightsNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> cityLights.showLights(-10));
    }
}
