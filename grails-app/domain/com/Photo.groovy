package com

class Photo extends AbstractDefaultDomainClass {
	
	static belongsTo = Author
	
	String name

}
