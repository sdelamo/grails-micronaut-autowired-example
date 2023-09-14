package example

import grails.testing.mixin.integration.Integration
import grails.testing.spock.OnceBefore
import io.micronaut.core.type.Argument
import io.micronaut.http.HttpRequest
import io.micronaut.http.client.HttpClient
import spock.lang.Shared
import spock.lang.Specification

@Integration
class HomeControllerTest extends Specification {

    @Shared
    HttpClient client

    @OnceBefore
    void init() {
        String baseUrl = "http://localhost:$serverPort"
        this.client  = HttpClient.create(baseUrl.toURL())
    }

    def 'home/index returns json todo'() {
        given:
        HttpRequest<?> request = HttpRequest.GET("/home/index")

        when:
        List<Todo> todos = client.toBlocking().retrieve(request, Argument.listOf(Todo))

        then:
        noExceptionThrown()
    }
}
