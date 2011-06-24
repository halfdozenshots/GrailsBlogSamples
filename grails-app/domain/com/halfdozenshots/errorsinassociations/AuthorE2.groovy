package com.halfdozenshots.errorsinassociations

class AuthorE2 {

	String name
	List books = new ArrayList()

	static hasMany = [books:BookE2]

	static constraints = { name blank:false }

	String toString() {
		"Book with id=${id} and title=${title}."
	}
}
