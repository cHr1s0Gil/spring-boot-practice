package org.practice.practice.controller

import org.practice.practice.entity.Board
import org.practice.practice.entity.Post
import org.practice.practice.service.BoardService
import org.practice.practice.service.PostService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("/board")
class BoardController(private val boardService: BoardService, private val postService: PostService) {
    @GetMapping("")
    fun index(model: Model): String {
        val boards = boardService.getAllBoard()
        model.addAttribute("boards", boards)

        return "board"
    }

    @GetMapping("/post")
    fun post(@RequestParam("no") postSeq: Int, model: Model): String {
        val post = postService.findPostByPostSeq(postSeq)
        model.addAttribute("post", post)

        return "post"
    }
}