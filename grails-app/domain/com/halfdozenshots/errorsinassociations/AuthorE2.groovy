package com.halfdozenshots.errorsinassociations

class AuthorE2 {

  String name
  List books = new ArrayList()
  Map publications

  static hasMany = [books:BookE2, publications:PublicationE2, tags:TagE2]

  static constraints = { name blank:false }

  String toString() {
    "Author with id=${id} and name=${name}."
  }
}
