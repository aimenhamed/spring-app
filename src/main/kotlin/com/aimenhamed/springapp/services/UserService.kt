package com.aimenhamed.springapp.services

import com.aimenhamed.springapp.models.UserModel
import com.aimenhamed.springapp.models.convertToEntity
import com.aimenhamed.springapp.repositories.UserRepository
import com.aimenhamed.springapp.repositories.convertToModel
import org.springframework.stereotype.Service

@Service
class UserService (val repository: UserRepository) {
    fun createUser(userRequest: UserModel): String {
        repository.save(userRequest.convertToEntity())
        return "Success"
    }

    fun getUsers(): List<UserModel> {
        return repository.findAll().map {it.convertToModel()}
    }
}