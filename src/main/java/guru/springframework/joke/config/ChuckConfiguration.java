package guru.springframework.joke.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * Created by ronnen on 10 Dec, 2020
 */

//@Configuration
public class ChuckConfiguration {

    // @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
