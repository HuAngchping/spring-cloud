package spring.cloud.demo.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Created by huang on 17/04/2017.
 */
@WebFilter
public class SpringBootDemoFilter implements Filter {

  private Logger logger = LoggerFactory.getLogger(SpringBootDemoFilter.class);

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    logger.info("SpringBootDemoFilter");
  }

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
    filterChain.doFilter(servletRequest, servletResponse);
  }

  @Override
  public void destroy() {

  }
}
