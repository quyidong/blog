package com.ark.blog.repository;

import com.ark.blog.domain.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
        collectionResourceRel = "user", path = "user", itemResourceRel = "user")
public interface UserRepository extends CrudRepository<User, Long>, JpaSpecificationExecutor<User> {
}
