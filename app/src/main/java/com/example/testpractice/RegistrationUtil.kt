package com.example.testpractice

object RegistrationUtil {
    private val existingUsers = listOf<String>("pranav", "ashiq")

    fun validateUserInput(
        username: String,
        password: String,
        confirmPassword: String,
    ): Boolean {
        if (username == "") {
            return false
        }
        if (existingUsers.contains(username)) {
            return false
        }
        if (username != ""&& password == confirmPassword ) {
            return true
        }
        return false
    }
}