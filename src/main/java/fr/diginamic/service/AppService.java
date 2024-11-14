package fr.diginamic.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppService {

    private static final Logger LOG = LoggerFactory.getLogger(AppService.class);


    public void executer(String param) {

        for (int i = 0; i < 100; i++) {
            LOG.debug("Traitement 1 : param = {}", param);

        }
    }



}
