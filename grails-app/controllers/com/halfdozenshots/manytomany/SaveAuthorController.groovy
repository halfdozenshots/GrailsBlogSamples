package com.halfdozenshots.manytomany

class SaveAuthorController {

    def index = {
		Author author = new Author(name:'Test Author')
		author.addToBooks(new Book(title:''))
		if (author.save()) {
			Book.list().each { println "Book ${it}" }
			
			render """Save successful although it should not be.
			Author with id ${author.id} contains ${author.books.size()} book(s)
			Book with id ${author.books[0].id} has title ${author.books[0].title}"""
			return
		}
		
		render 'Error saving author with book without a title. This is correct behaviour'
    }
}
