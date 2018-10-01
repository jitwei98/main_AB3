package seedu.addressbook.commands;

/**
 * Export all persons from the address book into a csv/vcf file.
 */
public class ExportAllCommand extends Command {

    public static final String COMMAND_WORD = "exportall";

    public static final String MESSAGE_NOT_IMPLEMENTED_YET = "ExportAll command not implemented yet";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Export all the contacts in the addressbook "
            + "Parameters: FILETYPE (must be either \"csv\" or \"vcf\") ";

    public static final String MESSAGE_ARGUMENTS = "Filetype: %1$s";
    private final String filetype;
    /**
     * @param filetype of the output file to export as
     */
    public ExportAllCommand(String filetype) {
        // requireAllNonNull(filetype);
        this.filetype = filetype;
    }

    @Override
    public ExportAllCommand execute() throws Exception {
        throw new Exception(MESSAGE_NOT_IMPLEMENTED_YET);
    }

    @Override
    public boolean equals(Object other) {
        // short circuit if same object
        if (other == this) {
            return true;
        }

        // instanceof handle nulls
        if (!(other instanceof ExportAllCommand)) {
            return false;
        }

        // state check
        ExportAllCommand e = (ExportAllCommand) other;
        return filetype.equals(e.filetype);
    }
}
