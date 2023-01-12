package com.alcoholism.photo.repo;

import com.alcoholism.photo.models.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotoRepository extends CrudRepository<Photo, Long> {


}
