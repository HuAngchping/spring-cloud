package spring.cloud.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.cloud.demo.repositories.entities.SystemRoleCategory;

/**
 * Created by huang on 25/02/2017.
 */
@Repository
public interface SystemRoleCategoryRepository extends JpaRepository<SystemRoleCategory, String> {
}
