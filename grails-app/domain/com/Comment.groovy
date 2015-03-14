package com

class Comment extends AbstractDefaultDomainClass {
	static belongsTo = Author
	
	String title
	String content
}
