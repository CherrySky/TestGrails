package com

class Category extends AbstractDefaultDomainClass {
	static belongsTo = Author	
	
	String categorgType
}
