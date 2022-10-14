package com.aimenhamed.springapp.models

import com.aimenhamed.springapp.repositories.UserEntity
import java.util.UUID

class UserModel (
    val id: UUID?,
    val name: String,
    val age: Int
)

fun UserModel.convertToEntity() = UserEntity(
    name = this.name,
    age = this.age
)