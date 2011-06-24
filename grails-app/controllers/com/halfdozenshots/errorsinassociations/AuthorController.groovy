package com.halfdozenshots.errorsinassociations

class AuthorController {

	static allowedMethods = [create: "POST"]

	def index = {
		def authorInstance = new AuthorE2()
		authorInstance.properties = params
		[authorInstance: authorInstance]
	}

	def create = {
		def authorInstance = new AuthorE2()
		authorInstance.properties = params

		if (!authorInstance.save()) {
			log.error 'Error saving author instance'
			authorInstance.errors.each { log.error it }
			return render(view:'index', model: [authorInstance: authorInstance])
		}

		render 'AUTHOR INSTANCE SAVED'
	}
}
