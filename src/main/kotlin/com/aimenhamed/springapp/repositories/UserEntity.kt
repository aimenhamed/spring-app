package com.aimenhamed.springapp.repositories

import com.aimenhamed.springapp.models.UserModel
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class UserEntity (
    val name: String,
    val age: Int
) {
    @Id
    @GeneratedValue
    var id: UUID? = null

    val date: Date = Date()
}

fun UserEntity.convertToModel() = UserModel(this.id, this.name, this.age)