package com.ogutdeniz.behavioralpatterns.templatemethod.authenticationexample;

public abstract class Authenticator {

    public final User authenticate(String username, String password) {
        validateInput(username, password);
        User user = findUserByUsername(username);
        verifyPassword(user, password);
        checkAuthorization(user);
        return user;
    }

    protected abstract User findUserByUsername(String username);

    protected abstract void verifyPassword(User user, String password);

    protected void checkAuthorization(User user) {
        // Default implementation for checking user authorization based on roles
        // This can be overridden by concrete authenticators if necessary
    }

    private void validateInput(String username, String password) {
        // Input validation for username and password
    }
}


