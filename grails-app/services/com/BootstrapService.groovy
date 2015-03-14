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
		new Author(name: "don")
			.addToBooks(title: "S.Pellegrino")
			.addToBookmarks(link: "http://abc")
			.addToCategories(categorgType: CategorgType.BABY)
			.addToComments(title: "im title", content: "this guy is good")
			.addToPhotos(name: "1.jpg").save()		
		new Author(name: "william")
			.addToBooks(title: "Harry Potter")
			.addToBookmarks(link: "http://abc").save()		
		new Author(name: "keith")
			.addToBooks(title: "Lord Of The Rings").save()
		new Author(name: "william")
			.addToBooks(title: "Hobbit").save()
		new Author(name: "don")
			.addToBooks(title: "Silmarillion").save()
	}
}
