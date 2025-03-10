import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SmokeTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void testHomePage() {
        driver.get("https://alexmegua.github.io/game-portfolio/");
        String title = driver.getTitle();
        assertEquals("Game Portfolio", title);
    }

    @Test
    public void testNavigation() {
        driver.get("https://alexmegua.github.io/game-portfolio/");
        driver.findElement(By.linkText("About Me")).click();
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("about"));
    }
}
