package com.aimenhamed.springapp.controllers

import com.aimenhamed.springapp.models.UserModel
import com.aimenhamed.springapp.repositories.UserEntity
import com.aimenhamed.springapp.services.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController(val service: UserService) {

    @GetMapping
    fun getUsers(): List<UserModel> {
        return service.getUsers()
    }

    @PostMapping
    fun createUser(@RequestBody user: UserModel): String {
        return service.createUser(user)
    }

}