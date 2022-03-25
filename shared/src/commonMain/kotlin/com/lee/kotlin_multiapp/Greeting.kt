package com.lee.kotlin_multiapp

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}