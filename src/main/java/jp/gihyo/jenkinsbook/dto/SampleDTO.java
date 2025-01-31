package jp.gihyo.jenkinsbook.dto;

import java.io.Serializable;

/**
 * DTO class for SampleServlet.
 */
public class SampleDTO implements Serializable {
    /**
     * First name of the user.
     */
    private String firstName;
    /**
     * Last name of the user.
     */
    private String lastName;
    /**
     * Greeting message.
     */
    private String message;

    /**
     * Store the user name.
     * @param aFirstName first name of the user
     * @param aLastName last name of the user
     */
    public SampleDTO(final String aFirstName, final String aLastName) {
        this.setFirstName(aFirstName);
        this.setLastName(aLastName);
        this.setMessage("Hello");
    }

    /**
     * Get first name of the user.
     * @return first name of the user
     */
    public final String getFirstName() {
        return this.firstName;
    }

    /**
     * Get last name of the user.
     * @return last name of the user
     */
    public final String getLastName() {
        return this.lastName;
    }

    /**
     * Get greeting message.
     * @return greeting message
     */
    public final String getMessage() {
        return this.message;
    }

    /**
     * Set first name of the user.
     * @param aFirstName first name of the user
     */
    public final void setFirstName(final String aFirstName) {
        this.firstName = aFirstName;
    }

    /**
     * Set last name of the user.
     * @param aLastName last name of the user
     */
    public final void setLastName(final String aLastName) {
        this.lastName = aLastName;
    }

    /**
     * Set greeting message.
     * @param msg greeting message
     */
    public final void setMessage(final String msg) {
        this.message = msg;
    }
}
