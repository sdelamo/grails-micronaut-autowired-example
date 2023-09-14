package example

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired

@CompileStatic
class HomeService {
    @Autowired
    JsonPlaceholderClient jsonPlaceholderClient

    List<Todo> todos() {
        jsonPlaceholderClient.todos()
    }
}