class BootStrap {
	
	def bootstrapService

    def init = { servletContext ->
		environments {			
			development {
				bootstrapService.initialize()
			}
		}
    }
	
    def destroy = {
    }
}
