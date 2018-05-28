package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import util.Searcher;

@Configuration
public class SearchConfig {

    @Bean
    Searcher SearchInitialization(){
        return new Searcher();
    }
}
