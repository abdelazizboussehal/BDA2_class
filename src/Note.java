import java.util.Set;

public class Note {
    private int noteValue;
    private Client rClient;

    public int getNoteValue() {
        return noteValue;
    }

    public void setNoteValue(int noteValue) {
        this.noteValue = noteValue;
    }

    public Client getrClient() {
        return rClient;
    }

    public void setrClient(Client rClient) {
        this.rClient = rClient;
    }

    public void addClient(Client client){
            setrClient(client);
    }
    public void remove(Client client){
        setrClient(null);
    }
}
