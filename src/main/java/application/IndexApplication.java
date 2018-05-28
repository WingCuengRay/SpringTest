package application;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import util.Indexer;

@Configuration
@EnableAutoConfiguration
public class IndexApplication implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(IndexApplication.class);

    @Autowired
    Indexer indexer;

    public IndexApplication(){
        logger.info("IndexApplication initializationnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("This is the indexApplication. WingCuengRayyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy!");
    }


    public static void main(String []args){
        SpringApplication.run(IndexApplication.class, args);
    }
}
