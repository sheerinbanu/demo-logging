package fr.diginamic.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppService {

    private static final Logger LOG = LoggerFactory.getLogger(AppService.class);

    public static void main(String[] args) {

        AppService ap = new AppService();
        ap.executer("param1");

        for (int i = 0; i < 1000; i++) {
            LOG.debug("This is log message number {} ", i);
            
        }

    }
    public void executer(String param) {
        LOG.debug("Traitement 1 : param = {}", param);
    }



}
