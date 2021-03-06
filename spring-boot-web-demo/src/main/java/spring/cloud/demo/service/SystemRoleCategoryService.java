package spring.cloud.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

import spring.cloud.demo.controllers.domain.SystemRoleCategoryDomain;
import spring.cloud.demo.repositories.SystemRoleCategoryRepository;
import spring.cloud.demo.repositories.entities.SystemRoleCategory;

/**
 * Created by huang on 25/02/2017.
 */
@Service
public class SystemRoleCategoryService {

  private Logger logger = LoggerFactory.getLogger(SystemRoleCategoryService.class);

  @Autowired
  SystemRoleCategoryRepository roleCategoryRepository;

  public void saveRoleCategory(SystemRoleCategoryDomain roleCategoryDomain) {
    logger.debug("service debug");

    roleCategoryRepository.deleteAll();
    SystemRoleCategory roleCategory = new SystemRoleCategory();
    roleCategory.setId("1111");
    roleCategory.setName(roleCategoryDomain.getName());
    Date date = new Date();
    roleCategory.setModifiedTime(date);
    roleCategory.setCreateTime(date);
    roleCategoryRepository.save(roleCategory);

    SystemRoleCategory category = roleCategoryRepository.findOne("1111");
    System.out.println(category.getName());
  }
}
