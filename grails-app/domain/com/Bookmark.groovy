package com

class Bookmark extends AbstractDefaultDomainClass {
	static belongsTo = Author
	
	String link
}
