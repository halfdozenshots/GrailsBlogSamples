package com.halfdozenshots.errorsinassociations

class TagE2 {

  String name

  static constraints = { name blank:false }

  static belongsTo = AuthorE2

  String toString() {
    "Tag with id=${id} and name=${name}."
  }
}
