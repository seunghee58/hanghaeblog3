package com.sparta.hanghaeblog.service;

import com.sparta.hanghaeblog.dto.CommentRequestDto;
import com.sparta.hanghaeblog.dto.CommentResponseDto;
import com.sparta.hanghaeblog.jwt.JwtUtil;
import com.sparta.hanghaeblog.repository.CommentRepository;
import com.sparta.hanghaeblog.repository.PostRepository;
import com.sparta.hanghaeblog.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;
    private final PostRepository postRepository;
    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;
    public CommentResponseDto createComment(Long postId, CommentRequestDto commentRequestDto, HttpServletRequest httpServletRequest) {

    }


    public CommentResponseDto updateComment(Long commentId, CommentRequestDto commentRequestDto, HttpServletRequest httpServletRequest) {

    }

    public String deleteComment(Long commentId, HttpServletRequest httpServletRequest) {

    }
}
