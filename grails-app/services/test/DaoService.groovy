package test

import grails.transaction.Transactional

@Transactional
class DaoService {

    def save(obj) {
		obj.save()
    }
	
	def remove() {
		
	}
	
	
}
