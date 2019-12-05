import java.util.Date;

public class Photo {
    private int id;
    private String path;
    private Date createDate;
    public Photo(int id, String path, Date createDate) {
        this.id = id;
        this.path = path;
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
