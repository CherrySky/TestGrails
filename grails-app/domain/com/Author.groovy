package com

class Author {

    static constraints = {
    }
	
	static hasMany = [books : Book]
	
	String name
}
