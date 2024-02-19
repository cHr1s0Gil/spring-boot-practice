package org.practice.practice.user.mapper

import org.practice.practice.user.dto.UserDTO
import org.practice.practice.user.entity.UserEntity

object UserMapper {
    fun userEntity2DTO(userEntity: UserEntity): UserDTO {
        return UserDTO(
            userEntity.userid,
            userEntity.password,
        )
    }
}