package fr.diginamic.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppService {

    private static final Logger LOG = LoggerFactory.getLogger(AppService.class);

    public static void main(String[] args) {

        AppService ap = new AppService();
        ap.executer("param1");

        for (int i = 0; i < 1000; i++) {
            LOG.debug("This is log message number {} that should help us reach the 1KB limit quickly. \" +\n" +
                    "                      \"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut \" +\n" +
                    "                      \"labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco \" +\n" +
                    "                      \"laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in \" +\n" +
                    "                      \"voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat \" +\n" +
                    "                      \"non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\"", i);
            
        }

    }
    public void executer(String param) {
        LOG.debug("Traitement 1 : param = {}", param);
    }



}
