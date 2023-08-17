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
        response = client.getForEntity("http://localhost:8080/ticket", String.class)
        expect:
        response.statusCode.'2xxSuccessful'
    }

    void 'get information about available tickets' () {
    }

    void 'get information about available tickets' () {
    }
}
