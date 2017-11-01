package spring.cloud.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

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

  @Transactional(rollbackFor = Exception.class)
  public void saveRoleCategory(SystemRoleCategoryDomain roleCategoryDomain) {
    logger.debug("service debug");

//    roleCategoryRepository.deleteAll();
    SystemRoleCategory roleCategory = new SystemRoleCategory();
    roleCategory.setName(roleCategoryDomain.getName());
    Date date = new Date();
    roleCategory.setModifiedTime(date);
    roleCategory.setCreateTime(date);
    SystemRoleCategory systemRoleCategory = roleCategoryRepository.save(roleCategory);

    List features = Arrays.asList("Lambdas", "Default Method", "Stream API",
            "Date and Time API");
    features.forEach(n -> System.out.println(n));
    features.forEach(System.out::println);

    SystemRoleCategory category = roleCategoryRepository.findOne(systemRoleCategory.getId());
    logger.info("Hello, " + category.getName());
  }
}
