package example

import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client

@Client("jsonplaceholder")
interface JsonPlaceholderClient {

    @Get("/todos")
    List<Todo> todos()
}
