package com.test.relationship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.relationship.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
