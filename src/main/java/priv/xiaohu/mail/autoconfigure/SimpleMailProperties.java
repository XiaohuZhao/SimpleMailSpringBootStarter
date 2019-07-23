package priv.xiaohu.mail.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author zxh
 */
@ConfigurationProperties("common.mail")
public class SimpleMailProperties {
	private String username;
	private String password;
	private String hostname;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(final String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(final String password) {
		this.password = password;
	}
	
	public String getHostname() {
		return hostname;
	}
	
	public void setHostname(final String hostname) {
		this.hostname = hostname;
	}
}
