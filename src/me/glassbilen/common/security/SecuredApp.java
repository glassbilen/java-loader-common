package me.glassbilen.common.security;

public class SecuredApp {
	private final String hash;
	private SecurityLevel level;
	private boolean exitAfterFinish;
	
	public SecuredApp(String hash) {
		this(hash, null);
	}
	
	public SecuredApp(String hash, SecurityLevel level) {
		this.hash = hash;
		this.level = level;
	}
	
	public String getHash() {
		return hash;
	}
	
	public SecurityLevel getLevel() {
		return level;
	}
	
	public boolean shouldExitAfterFinish() {
		return exitAfterFinish;
	}
	
	public void setLevel(SecurityLevel level) {
		this.level = level;
	}
	
	public void setExitAfterFinish(boolean exitAfterFinish) {
		this.exitAfterFinish = exitAfterFinish;
	}
	
	public boolean isReady() {
		return hash.length() > 0 && level != null;
	}
}
