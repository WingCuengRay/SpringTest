package application;


import config.IndexConfig;
import config.SearchConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import util.Indexer;
import util.Searcher;

@Configuration
@ComponentScan(basePackages = "application", excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = IndexApplication.class))
@EnableAutoConfiguration
@Import({SearchConfig.class})
public class SearchApplication implements CommandLineRunner {
    private Logger logger = LoggerFactory.getLogger(SearchApplication.class);

    @Autowired
    Searcher searcher;

    /**
     // cannot in
    @Autowired
    Indexer indexer;
    **/

    public SearchApplication(){
        logger.info("SearchApplication initializationnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("This is the SearchApplication. WingCuengRayyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy!");
    }


    public static void main(String []args){
        SpringApplication.run(SearchApplication.class, args);
    }
}
