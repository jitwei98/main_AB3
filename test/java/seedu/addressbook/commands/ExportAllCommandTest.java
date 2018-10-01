package seedu.addressbook.commands;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExportAllCommandTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void execute_throws_Exception() {
        thrown.expect(Exception.class);
        new ExportAllCommand();
    }
    
}