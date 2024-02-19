package org.practice.practice.user.service

import org.practice.practice.user.dto.UserDTO
import org.practice.practice.user.entity.UserEntity
import org.practice.practice.user.mapper.UserMapper
import org.practice.practice.user.repository.UserRepository
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class UserService(private val userRepository: UserRepository, private val passwordEncoder: PasswordEncoder) {
    fun findByUuid(uuid: String): UserDTO? {
        val userEntity: UserEntity? = userRepository.findByUuid(uuid)
        return userEntity?.let { UserMapper.userEntity2DTO(it) }
    }

    fun findByUserid(userid: String): UserDTO? {
        val userEntity: UserEntity? = userRepository.findByUserid(userid)
        return userEntity?.let { UserMapper.userEntity2DTO(it) }
    }

    fun signup(userDTO: UserDTO): String {
        val userEntity: UserEntity = UserEntity(
            UUID.randomUUID().toString(),
            userDTO.userid,
            passwordEncoder.encode(userDTO.password),
            userDTO.userid
        )
        userRepository.save(userEntity)

        return "회원가입이 완료되었습니다."
    }
}