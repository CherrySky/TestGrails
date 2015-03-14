class BootStrap {
	
	def bootstrapService

    def init = { servletContext ->
		switch (GrailsUtil.environment) {			
			case "development":
				bootstrapService.initialize()
				break
		}
    }
	
    def destroy = {
    }
}
