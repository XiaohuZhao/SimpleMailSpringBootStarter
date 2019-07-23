package priv.xiaohu.mail.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Collection;

/**
 * @author zxh
 */
@ConfigurationProperties("simple.mail")
public class SimpleMailProperties {
	private String username;
	private String password;
	private String hostname;
	private Collection<String> defaultRecipients;
	
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
	
	public Collection<String> getDefaultRecipients() {
		return defaultRecipients;
	}
	
	public SimpleMailProperties setDefaultRecipients(final Collection<String> defaultRecipients) {
		this.defaultRecipients = defaultRecipients;
		return this;
	}
}
