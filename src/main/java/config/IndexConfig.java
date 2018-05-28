package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import util.Indexer;

@Configuration
public class IndexConfig {

    @Bean
    Indexer IndexIntialization(){
        return new Indexer();
    }
}
