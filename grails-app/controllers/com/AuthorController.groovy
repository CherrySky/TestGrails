package com

class AuthorController {

	def index() { }

	def fo1() {
		def a = new Author(name: "don").addToBooks(title: "S.Pellegrino").save()
	}
}
