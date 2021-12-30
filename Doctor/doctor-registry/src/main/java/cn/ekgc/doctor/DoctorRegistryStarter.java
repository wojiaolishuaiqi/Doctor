package cn.ekgc.doctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <b>医疗信息平台 - Eyreka 注册中心启动类</b>
 *
 * @author 李帅旗
 * @date 2021/12/29
 * @version 1.0.0
 * @since 1.0.0
 */
@EnableEurekaServer
@SpringBootApplication
public class DoctorRegistryStarter {
	public static void main(String[] args) {
		SpringApplication.run(DoctorRegistryStarter.class,args);
	}
}
