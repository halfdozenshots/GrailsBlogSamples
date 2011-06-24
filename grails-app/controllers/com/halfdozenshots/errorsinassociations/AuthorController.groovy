package com.halfdozenshots.errorsinassociations

class AuthorController {

  static allowedMethods = [create: "POST"]

  def index = {
    def authorInstance = new AuthorE2()
    authorInstance.properties = params
    [authorInstance: authorInstance]
  }

  def create = {
    log.error "Params ${params}"
    def authorInstance = new AuthorE2()
    authorInstance.properties = params

    def pub = new PublicationE2(name:'ax')
    authorInstance.publications['x1'] = pub
    authorInstance.publications['x2'] = pub

    log.error "Pubs ${authorInstance.publications}"

    if (!authorInstance.save()) {
      log.error 'Error saving author instance'
      authorInstance.errors.each { log.error it }
      return render(view:'index', model: [authorInstance: authorInstance])
    }

    render 'AUTHOR INSTANCE SAVED'
  }

  def list = {
    def authors = AuthorE2.list()
    authors.each { author ->
      log.error "AUTHOR ${author}"
      author.tags.each { tag ->
        log.error "TAG ${tag}"
      }
      author.publications.each { pub ->
        log.error "PUB ${pub}"
      }
      author.books.each { book ->
        log.error "BOOK ${book}"
      }
    }
  }
}
