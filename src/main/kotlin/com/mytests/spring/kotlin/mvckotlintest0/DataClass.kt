package com.mytests.spring.kotlin.mvckotlintest0

class DataClass(name: String, size: Int) {

    var name: String
        internal set
    var size: Int = 0
        internal set

    init {
        this.name = name
        this.size = size
    }
}
