package org.panthers.team.integration

import org.junit.runner.RunWith
import org.panthers.team.PanthersTeamApplication
import org.panthers.team.model.TeamPhotos
import org.springframework.boot.context.embedded.LocalServerPort
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.HttpMethod
import org.springframework.http.ResponseEntity
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.web.client.RestTemplate
import spock.lang.Specification
//this is to tell create application context mentioned above for this application
@SpringBootTest(classes=PanthersTeamApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PhotosControllerIntegrationSpec extends Specification{
    //to set a port number for calling
    @LocalServerPort
    private int port;
    //to fire up a request
    RestTemplate testRestTemplate = new RestTemplate()

    def "get all the photos "(){

        when:
        ResponseEntity<String> response = testRestTemplate.exchange("http://localhost:"+port+"/photos",HttpMethod.GET,null, String)

        then:
        response != null
    }

}
