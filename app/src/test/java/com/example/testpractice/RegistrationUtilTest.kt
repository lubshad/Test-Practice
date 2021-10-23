package com.example.testpractice

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun emptyUsernameReturnsFalse() {
        var result = RegistrationUtil.validateUserInput(username = "", password = "sdfs", confirmPassword = "sdfssafd")
        assertThat(result).isFalse()
    }

    @Test
    fun validUsernameAndRepeatedPasswordCorrectly() {
        var result = RegistrationUtil.validateUserInput(username = "lubshad", password = "password", confirmPassword = "password")
        assertThat(result).isTrue()
    }

    @Test
    fun alreadyRegisteredUser() {
        var result = RegistrationUtil.validateUserInput(username = "pranav", password = "password", confirmPassword = "password")
        assertThat(result).isFalse()
    }
}