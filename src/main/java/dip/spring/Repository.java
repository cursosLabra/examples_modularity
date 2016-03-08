package dip.spring;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface Repository {
  void startConnection();
  List<User> findAll();
}
