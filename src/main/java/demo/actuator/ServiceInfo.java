package demo.actuator;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class ServiceInfo implements InfoContributor {

  @Override
  public void contribute(Info.Builder builder) {

    builder.withDetail("myservice", getServerStatus());
  }

  private String getServerStatus() {

    return "up";
  }
}
