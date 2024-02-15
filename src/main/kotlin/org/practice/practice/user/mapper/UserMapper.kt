package org.practice.practice.user.mapper

import org.practice.practice.user.dto.UserDTO
import org.practice.practice.user.entity.UserEntity

object UserMapper {
    fun userEntity2DTO(userEntity: UserEntity): UserDTO {
        return UserDTO(
                userEntity.uuid,
                userEntity.userid,
                userEntity.password,
                userEntity.salt,
                userEntity.nickname
            )
    }

    fun userDTO2Entity(userDTO: UserDTO): UserEntity {
        return UserEntity(
            userDTO.uuid,
            userDTO.userid,
            userDTO.password,
            userDTO.salt,
            userDTO.nickname
        )
    }
}

