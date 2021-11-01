package stringmethods;

public class UrlManagerMain {

    public static void main(String[] args) {
        String test1 = "https://earthquake.usgs.gov:80/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";
        String test2 = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";
        String test3 = "https://earthquake.usgs.gov/?format=geojson&starttime=2014-01-01&endtime=2014-01-02";
        String test4 = "https://earthquake.usgs.gov/fdsnws/event/1/query";
        String test5 = "hTTps://earthquake.usgs.GOV";

        String test = test1;
        System.out.println(test);
        UrlManager um = new UrlManager(test);
        System.out.println("protocol: " + um.getProtocol());
        System.out.println("host:     " + um.getHost());
        System.out.println("port:     " + um.getPort());
        System.out.println("path:     " + um.getPath());
        System.out.println("query:    " + um.getQuery());
        System.out.println("key  = starttime");
        System.out.println(um.hasProperty("starttime"));
        System.out.println(um.getProperty("starttime"));
        System.out.println("key  = startime");
        System.out.println(um.hasProperty("startime"));
        System.out.println(um.getProperty("startime"));

        test = test2;
        System.out.println(test);
        um = new UrlManager(test);
        System.out.println("protocol: " + um.getProtocol());
        System.out.println("host:     " + um.getHost());
        System.out.println("port:     " + um.getPort());
        System.out.println("path:     " + um.getPath());
        System.out.println("query:    " + um.getQuery());
        System.out.println("key  = starttime");
        System.out.println(um.hasProperty("starttime"));
        System.out.println(um.getProperty("starttime"));
        System.out.println("key  = startime");
        System.out.println(um.hasProperty("startime"));
        System.out.println(um.getProperty("startime"));

        test = test3;
        System.out.println(test);
        um = new UrlManager(test);
        System.out.println("protocol: " + um.getProtocol());
        System.out.println("host:     " + um.getHost());
        System.out.println("port:     " + um.getPort());
        System.out.println("path:     " + um.getPath());
        System.out.println("query:    " + um.getQuery());
        System.out.println("key  = starttime");
        System.out.println(um.hasProperty("starttime"));
        System.out.println(um.getProperty("starttime"));
        System.out.println("key  = startime");
        System.out.println(um.hasProperty("startime"));
        System.out.println(um.getProperty("startime"));

        test = test4;
        System.out.println(test);
        um = new UrlManager(test);
        System.out.println("protocol: " + um.getProtocol());
        System.out.println("host:     " + um.getHost());
        System.out.println("port:     " + um.getPort());
        System.out.println("path:     " + um.getPath());
        System.out.println("query:    " + um.getQuery());
        System.out.println("key  = starttime");
        System.out.println(um.hasProperty("starttime"));
        System.out.println(um.getProperty("starttime"));
        System.out.println("key  = startime");
        System.out.println(um.hasProperty("startime"));
        System.out.println(um.getProperty("startime"));

        test = test5;
        System.out.println(test);
        um = new UrlManager(test);
        System.out.println("protocol: " + um.getProtocol());
        System.out.println("host:     " + um.getHost());
        System.out.println("port:     " + um.getPort());
        System.out.println("path:     " + um.getPath());
        System.out.println("query:    " + um.getQuery());
        System.out.println("key  = starttime");
        System.out.println(um.hasProperty("starttime"));
        System.out.println(um.getProperty("starttime"));
        System.out.println("key  = startime");
        System.out.println(um.hasProperty("startime"));
        System.out.println(um.getProperty("startime"));

    }
}
