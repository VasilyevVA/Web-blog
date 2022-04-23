package ru.vasilyevVA.Webblog.Repo;

import org.springframework.data.repository.CrudRepository;
import ru.vasilyevVA.Webblog.Models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
}
