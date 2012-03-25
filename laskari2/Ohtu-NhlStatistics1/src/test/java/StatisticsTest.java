import java.util.*;
import ohtuesimerkki.Player;
import ohtuesimerkki.Reader;
import ohtuesimerkki.Statistics;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Pessi
 */
public class StatisticsTest {

    Statistics stats;
    Reader readerStub = new Reader() {

        @Override
        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<Player>();
            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri", "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));
            return players;
        }
    };

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        stats = new Statistics(readerStub);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void etsiTest() {
        assertEquals("Gretzky", stats.search("Gretzky").getName());
    }

    @Test
    public void eiOleTest() {
        assertEquals(null, stats.search("Pessi Moilanen"));
    }

    @Test
    public void pojotTest() {
        assertEquals("Gretzky", stats.topScorers(1).get(0).getName());
    }

    @Test
    public void tiimiTest() {
        assertEquals("Semenko", stats.team("EDM").get(0).getName());
        assertEquals("Kurri", stats.team("EDM").get(1).getName());
    }

    @Test
    public void loytyykoSearch() {
        Player pelaaja = stats.search("Yzerman");
        System.out.println(pelaaja.getName());
        assertEquals("Yzerman", pelaaja.getName());
    }
}