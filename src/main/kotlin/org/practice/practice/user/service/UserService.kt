package org.practice.practice.user.service

import org.practice.practice.user.dto.UserDTO
import org.practice.practice.user.entity.UserEntity
import org.practice.practice.user.mapper.UserMapper
import org.practice.practice.user.repository.UserRepository
import org.springframework.stereotype.Service
import org.springframework.web.servlet.mvc.support.RedirectAttributes

@Service
class UserService(private val userRepository: UserRepository) {
    fun findByUuid(uuid: String): UserDTO? {
        val userEntity: UserEntity? = userRepository.findByUuid(uuid)
        return userEntity?.let { UserMapper.userEntity2DTO(it) }
    }

    fun findByUserid(userid: String): UserDTO? {
        val userEntity: UserEntity? = userRepository.findByUserid(userid)
        return userEntity?.let { UserMapper.userEntity2DTO(it) }
    }

//    fun login(userDTO: UserDTO): String {
//        val userEntity: UserEntity? = userRepository.findByUserid(userDTO.userid)
//
//        return "test"
//    }

    fun signup(userDTO: UserDTO): String {
        var userEntity: UserEntity? = userRepository.findByUserid(userDTO.userid)
        val message: String
        val redirect: String
        if(userEntity != null) {
            message = "이미 존재하는 아이디입니다."
            redirect = "forward:/signup"
        }
        else {
            userEntity = UserMapper.userDTO2Entity(userDTO)
            userRepository.save(userEntity)
            message = "회원가입이 완료되었습니다."
            redirect = "redirect:/login"
        }

        return redirect
    }
}