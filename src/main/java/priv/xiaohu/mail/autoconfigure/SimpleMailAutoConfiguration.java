package priv.xiaohu.mail.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import priv.xiaohu.mail.SimpleMailSender;

/**
 * @author zxh
 */
@Configuration
@ConditionalOnClass(SimpleMailSender.class)
@EnableConfigurationProperties(SimpleMailProperties.class)
public class SimpleMailAutoConfiguration {
	@Bean
	@ConditionalOnMissingBean(SimpleMailSender.class)
	public SimpleMailSender sender(SimpleMailProperties properties) {
		if (properties.getHostname() == null || properties.getHostname().length() == 0) {
			properties.setHostname("smtp." + properties.getUsername().split("@")[1]);
		}
		return new SimpleMailSender(properties.getHostname(), properties.getUsername(), properties.getPassword(), properties.getDefaultRecipients());
	}
}
