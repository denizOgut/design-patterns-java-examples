package com.ogutdeniz.behavioralpatterns.templatemethod.authenticationexample;

public class OAuthAuthenticator extends Authenticator {

    @Override
    protected User findUserByUsername(String username) {
        return new User();
    }

    @Override
    protected void verifyPassword(User user, String password) {
        // OAuth authentication does not require password verification
    }

    @Override
    protected void checkAuthorization(User user) {
        // Implementation for checking user's OAuth scopes to determine roles
    }
}
