package org.practice.practice.controller

import org.practice.practice.entity.Board
import org.practice.practice.entity.Post
import org.practice.practice.service.BoardService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/board")
class BoardController(private val boardService: BoardService) {
    @GetMapping("")
    fun index(model: Model): String {
        val boards = boardService.getAllBoard()

        model.addAttribute("boards", boards)
        return "board"
    }

    @GetMapping("/post")
    fun post(model: Model): String {
        return "post"
    }
}