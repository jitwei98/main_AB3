package seedu.addressbook.commands;

/**
 * Export all persons from the address book into a csv/vcf file.
 */
public class ExportAllCommand extends Command {

    public static final String COMMAND_WORD = "exportall";

    public static final String MESSAGE_NOT_IMPLEMENTED_YET = "ExportAll command not implemented yet";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Export all the contacts in the addressbook "
            + "Parameters: FILETYPE (must be either \"csv\" or \"vcf\") ";

    @Override
    public ExportAllCommand execute() throws Exception {
        throw new Exception(MESSAGE_NOT_IMPLEMENTED_YET);
    }
}
