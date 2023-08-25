package com.vikalp.joblisting.repository;

import com.vikalp.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}
