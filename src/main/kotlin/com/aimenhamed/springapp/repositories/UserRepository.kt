package com.aimenhamed.springapp.repositories

import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface UserRepository: CrudRepository<UserEntity, UUID>