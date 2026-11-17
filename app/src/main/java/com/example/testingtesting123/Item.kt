package com.example.testingtesting123

class Item (val name: String){
    override fun equals(other: Any?): Boolean {
        return other is Item && other.name.trim().equals(name.trim(), ignoreCase = true)
    }
}