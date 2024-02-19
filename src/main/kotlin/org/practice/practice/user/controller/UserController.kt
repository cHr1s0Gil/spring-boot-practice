package org.practice.practice.user.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/user")
class UserController {
    @GetMapping("/signup")
    fun signup(): String {
        return "/user/signup"
    }
}