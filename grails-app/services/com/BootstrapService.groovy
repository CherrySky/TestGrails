package com

import grails.transaction.Transactional
import groovy.util.logging.Log

@Transactional
class BootstrapService {
		
    def initialize() {
		createAuthorsAndBooks();
    }
	
	def createAuthorsAndBooks = {
		log.info "Creating authors and books"		
		new Author(name: "don").addToBooks(title: "S.Pellegrino").save()
		new Author(name: "william").addToBooks(title: "Harry Potter").save()
		new Author(name: "keith").addToBooks(title: "Lord Of The Rings").save()
		new Author(name: "william").addToBooks(title: "Hobbit").save()
		new Author(name: "don").addToBooks(title: "Silmarillion").save()
	}
}
