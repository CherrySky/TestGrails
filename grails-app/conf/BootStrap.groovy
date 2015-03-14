class BootStrap {
	
	def bootstrapService

    def init = { servletContext ->
		bootstrapService.initialize()
    }
    def destroy = {
    }
}
