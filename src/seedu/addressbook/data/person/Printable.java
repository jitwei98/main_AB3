package seedu.addressbook.data.person;

/**
 * A printable interface for a Person.
 */
public interface Printable {
    String detailIsPrivate = "(private) ";
    String getPrintableString(boolean hidePrivate);
}
