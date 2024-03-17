package Main;

import io.github.cdimascio.dotenv.Dotenv;
import net.rrworld.valorant.client.ValorantClient;
import net.rrworld.valorant.client.assets.Region;
import net.rrworld.valorant.client.model.Match;

public class Main {

    private final Dotenv config = Dotenv.load();

    public Main() throws Exception {
        ValorantClient client = new ValorantClient(config.get("APIKEY"), Region.NA);

    }

    public static void main(String arg[]) {
        System.out.println("Hello World!");
    }
}
