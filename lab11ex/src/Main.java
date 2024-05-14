public class Main {
    public static void main(String[] args) {
        MyCache cache = new MyCache();
        cache.start();

        for (int i = 0; i < 100; i++) {
            StoredObject object = new StoredObject("Object " + i, 10000);
            cache.addToCache(i, object);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main thread was interrupted");
            }
        }
    }
}
