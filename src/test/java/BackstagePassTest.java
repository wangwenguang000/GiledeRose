import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackstagePassTest {

    @Test
    public void shouldKeepQuality10DaysBeforeExpiredDate() {
        var backstagePass = new BackstagePass(20, 10);

        backstagePass.hold(5);

        assertEquals(15, backstagePass.getSellin());
        assertEquals(10, backstagePass.getSellin());
    }

}
