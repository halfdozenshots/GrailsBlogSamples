package com.halfdozenshots.manytomany

class Book {

	String title

	static belongsTo = Author

	static hasMany = [authors:Author]

	static constraints = { title blank:false }
	
	String toString() {
		"Book with id=${id} and title=${title}."
	}
}
