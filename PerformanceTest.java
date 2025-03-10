import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;

public class PerformanceTest {

    @Test
    public void testPageLoadTime() {
        long startTime = System.currentTimeMillis();

        WebDriver driver = new ChromeDriver();
        driver.get("https://alexmegua.github.io/game-portfolio/");

        long endTime = System.currentTimeMillis();
        long loadTime = endTime - startTime;
        System.out.println("Page Load Time: " + loadTime + " milliseconds");

        assertTrue(loadTime < 3000, "Page should load within 3 seconds");
    }
}
