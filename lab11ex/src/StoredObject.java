import java.sql.Timestamp;

public class StoredObject {
    private Object myInfo;
    private volatile boolean expired;
    private Timestamp expirationTime;

    public StoredObject(Object myInfo, long duration) {
        this.myInfo = myInfo;
        this.expired = false;
        this.expirationTime = new Timestamp(System.currentTimeMillis() + duration);
    }

    public Object getMyInfo() {
        return myInfo;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    public Timestamp getExpirationTime() {
        return expirationTime;
    }
}
