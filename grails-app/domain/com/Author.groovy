package com


class Author extends AbstractDefaultDomainClass {

    static constraints = {
		name(nullable: false)
    }
	
	static hasMany = [
		books : Book,
		bookmarks: Bookmark,
		categories: Category,
		comments: Comment,
		photos: Photo]
	
	String name
	
	
}
