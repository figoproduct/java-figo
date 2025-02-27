package me.figo.internal;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;

import me.figo.models.Consent;

public class AddProviderAccessRequest {

	@Expose
	private String access_method_id;
	
	@Expose
	private List<AccountIdentifier> account_identifier;
	
	@Expose
	private boolean save_credentials;

	@Expose
	private Credentials credentials;

	@Expose
	private Consent consent;

	public AddProviderAccessRequest(String access_method_id, AccountIdentifier account_identifier,
			boolean save_credentials,
			Credentials credentials, Consent consent) {
		super();
		this.access_method_id = access_method_id;
		this.account_identifier = new ArrayList<>();
		this.account_identifier.add(account_identifier);
		this.save_credentials = save_credentials;
		this.credentials = credentials;
		this.consent = consent;
	}

	public String getAccessMethodId() {
		return access_method_id;
	}

	public void setAccessMethodId(String accessMethodId) {
		this.access_method_id = accessMethodId;
	}

	public boolean isSave_credentials() {
		return save_credentials;
	}

	public void setSave_credentials(boolean save_credentials) {
		this.save_credentials = save_credentials;
	}

	public Consent getConsent() {
		return consent;
	}

	public void setConsent(Consent consent) {
		this.consent = consent;
	}

	public String getAccess_method_id() {
		return access_method_id;
	}

	public void setAccess_method_id(String access_method_id) {
		this.access_method_id = access_method_id;
	}

	public List<AccountIdentifier> getAccount_identifier() {
		return account_identifier;
	}

	public void setAccount_identifier(List<AccountIdentifier> account_identifier) {
		this.account_identifier = account_identifier;
	}

	public Credentials getCredentials() {
		return credentials;
	}

	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}

}
