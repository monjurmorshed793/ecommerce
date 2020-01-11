package org.iums.ecommerce.repositories;

import org.iums.ecommerce.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
