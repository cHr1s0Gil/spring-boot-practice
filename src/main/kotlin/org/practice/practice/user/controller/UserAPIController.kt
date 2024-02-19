package org.practice.practice.user.controller

import org.practice.practice.user.dto.UserDTO
import org.practice.practice.user.service.UserService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("/api/user")
class UserAPIController (private val userService: UserService){
    @PostMapping("/signup")
    @ResponseBody
    fun signup(@ModelAttribute userDTO: UserDTO): String {
        return userService.signup(userDTO)
    }
}