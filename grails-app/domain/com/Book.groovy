package com

class Book extends AbstractDefaultDomainClass {

    static constraints = {
    }
	
	static belongsTo = Author
	
	String title
}
