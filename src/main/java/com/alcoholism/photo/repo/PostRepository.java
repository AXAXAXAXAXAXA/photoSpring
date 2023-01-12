package com.alcoholism.photo.repo;

import com.alcoholism.photo.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
