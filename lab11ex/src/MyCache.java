import java.sql.Timestamp;
import java.util.concurrent.ConcurrentHashMap;

public class MyCache extends Thread {
    private ConcurrentHashMap<Integer, StoredObject> cache = new ConcurrentHashMap<>();

    public void run() {
        try {
            while (!Thread.interrupted()) {
                Thread.sleep(2000);
                Timestamp currentTime = new Timestamp(System.currentTimeMillis());
                for (Integer key : cache.keySet()) {
                    StoredObject storedObject = cache.get(key);
                    if (currentTime.after(storedObject.getExpirationTime())) {
                        storedObject.setExpired(true);
                        System.out.println("Expired object at key: " + key);
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }
    }

    public void addToCache(Integer key, StoredObject object) {
        cache.put(key, object);
    }
}
