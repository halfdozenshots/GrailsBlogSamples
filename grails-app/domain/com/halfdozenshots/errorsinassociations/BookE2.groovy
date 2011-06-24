package com.halfdozenshots.errorsinassociations

class BookE2 {

	String title
	
	static belongsTo = AuthorE2
	
    static constraints = {
		title blank:false
    }
}
