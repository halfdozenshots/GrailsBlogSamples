package com.halfdozenshots.errorsinassociations

class PublicationE2 {

  String name

  static constraints = { name blank:false }

  static belongsTo = AuthorE2

  String toString() {
    "Public with id=${id} and name=${name}."
  }
}
