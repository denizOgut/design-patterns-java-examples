package com.ogutdeniz.behavioralpatterns.templatemethod.authenticationexample;

public class LdapAuthenticator extends Authenticator {

    @Override
    protected User findUserByUsername(String username) {
        return new User();
    }

    @Override
    protected void verifyPassword(User user, String password) {
        // Implementation for verifying user's password in LDAP directory
    }

    @Override
    protected void checkAuthorization(User user) {
        // Implementation for checking user's LDAP group membership to determine roles
    }
}
