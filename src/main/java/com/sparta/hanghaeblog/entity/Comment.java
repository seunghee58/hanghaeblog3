package com.sparta.hanghaeblog.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sparta.hanghaeblog.dto.CommentRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Comment extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "post_id", nullable = false)
    @JsonIgnore
    private Post post;

    @Column(nullable = false)
    private String contents;

    @ManyToOne
    @JoinColumn(name = "user_name", nullable = false)
    @JsonManagedReference
    private User user;

    public Comment(User user, CommentRequestDto commentRequestDto, Post post) {
        this.post = post;
        this.user = user;
        this.contents = commentRequestDto.getContents();
    }

    public void update(CommentRequestDto commentRequestDto) {
        this.contents = commentRequestDto.getContents();
    }

}
