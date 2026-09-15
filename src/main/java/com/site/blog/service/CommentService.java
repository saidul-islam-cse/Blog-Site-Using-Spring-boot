package com.site.blog.service;

import com.site.blog.entity.Comment;
import com.site.blog.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    // Create Comment
    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }

    // Get All Comments
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    // Get Comment By ID
    public Optional<Comment> getCommentById(Long id) {
        return commentRepository.findById(id);
    }

    // Update Comment
    public Comment updateComment(Long id, Comment comment) {
        comment.setId(id);
        return commentRepository.save(comment);
    }

    // Delete Comment
    public void deleteComment(Long id) {
        commentRepository.deleteById(id);
    }
}