package spring.cloud.demo.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by huang on 17/04/2017.
 */
@WebListener
public class SpringBootDemoListener implements ServletContextListener {

  private Logger logger = LoggerFactory.getLogger(SpringBootDemoListener.class);

  @Override
  public void contextInitialized(ServletContextEvent servletContextEvent) {
    logger.info("SpringBootDemoListener");
  }

  @Override
  public void contextDestroyed(ServletContextEvent servletContextEvent) {

  }
}
