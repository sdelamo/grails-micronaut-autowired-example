package example

import grails.converters.JSON

class HomeController {

    def homeService

    def index() {
        render homeService.todos() as JSON
    }
}