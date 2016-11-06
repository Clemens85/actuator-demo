package demo.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthCheck implements HealthIndicator {

  @Override
  public Health health() {

    return Health.status(getSystemStatus()).build();
  }

  private String getSystemStatus() {
    
    return "SERVICE_NOT_AVAILABLE";
  }
}
