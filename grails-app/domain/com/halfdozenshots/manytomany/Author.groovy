package com.halfdozenshots.manytomany

class Author {

	String name
	List books

	static hasMany = [books:Book]

	static constraints = {
	}
}
