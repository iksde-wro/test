package pl.xd

import io.micronaut.test.extensions.spock.annotation.MicronautTest
import org.springframework.web.client.RestTemplate
import spock.lang.Shared
import spock.lang.Specification

@MicronautTest
class BasicTicketsFeatures extends Specification {

    @Shared
    def client = new RestTemplate()

    void 'get ticket' () {
        given:
        response = client.getForEntity("http://localhost:1133/coffee", String.class)
        expect:
        response.statusCode.'2xxSuccessful'
    }
}
