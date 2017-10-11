package cn.lu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringCloudApplication
public class ServiceDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDashboardApplication.class, args);
	}
}
