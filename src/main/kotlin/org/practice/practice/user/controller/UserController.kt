package org.practice.practice.user.controller

import org.practice.practice.user.dto.UserDTO
import org.practice.practice.user.service.UserService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/user")
class UserController (private val userService: UserService){
    @GetMapping("/login")
    fun login(): String {
        return "/user/login"
    }

//    @PostMapping("/login")
//    fun loginRequest(@RequestBody userDTO: UserDTO): String {
//        return userService.login(userDTO)
//    }

    @GetMapping("/signup")
    fun signup(): String {
        return "/user/signup"
    }

    @PostMapping("/signup")
    fun signupRequest(@ModelAttribute userDTO: UserDTO): String {
        println("userDTO: ${userDTO.toString()}")
        return userService.signup(userDTO)
    }
}