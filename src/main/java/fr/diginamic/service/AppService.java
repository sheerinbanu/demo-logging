package fr.diginamic.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppService {

    private static final Logger LOG = LoggerFactory.getLogger(AppService.class);

    public static void main(String[] args) {

        AppService ap = new AppService();
        ap.executer("param1");


    }
    public void executer(String param) {
        LOG.debug("Traitement 1 : param = {}", param);
    }



}
