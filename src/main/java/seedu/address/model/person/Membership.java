package seedu.address.model.person;

import static java.util.Objects.requireNonNull;

/**
 * Represents a person's membership status in the address book.
 * The status can be one of the following: ACTIVE, EXPIRED, or NON-MEMBER.
 */
public enum Membership {
    ACTIVE("ACTIVE"),
    EXPIRED("EXPIRED"),
    NONMEMBER("NON-MEMBER");

    /** Message constraints for valid membership statuses. */
    public static final String MESSAGE_CONSTRAINTS = "Membership status can only be: ACTIVE, EXPIRED, NON-MEMBER";

    /** The status of the membership. */
    public final String status;

    /**
     * Constructs a {@code Membership} with the given status.
     *
     * @param status The status of the membership.
     */
    private Membership(String status) {
        requireNonNull(status);
        this.status = status;
    }

    /**
     * Creates a {@code Membership} based on the given string.
     *
     * @param test The string to be converted to a membership status.
     * @return The corresponding {@code Membership} status.
     * @throws RuntimeException If the string does not match any valid membership status.
     */
    public static Membership createMember(String test) throws RuntimeException {
        if (test.equals("ACTIVE")) {
            return ACTIVE;
        } else if (test.equals("EXPIRED")) {
            return EXPIRED;
        } else if (test.equals("NON-MEMBER")) {
            return NONMEMBER;
        } else {
            throw new RuntimeException();
        }
    }

    /**
     * Returns the string representation of the membership status.
     *
     * @return The string representation of the membership status.
     */
    @Override
    public String toString() {
        return status;
    }
}
