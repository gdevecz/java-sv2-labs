package stringmethods;

public class UrlManager {

    private String protocol;

    private String host;

    private Integer port;

    private String path;

    private String query;

    public UrlManager(String url) {
        protocol = getProtocolFromUrl(url).toLowerCase();
        host = getHostFromUrl(url).toLowerCase();
        port = getPortFromUrl(url);
        path = getPathFromUrl(url);
        query = getQueryFromUrl(url);
    }

    public String getProperty(String key) {
        if (!hasProperty(key)) {
            return null;
        }
        return query.substring(query.indexOf(key) + key.length() + 1, query.indexOf('&', query.indexOf(key)));
    }

    public boolean hasProperty(String key) {
        if(query == null) {
            return false;
        }
        return query.contains(key + "=");
    }

    public String getProtocol() {
        return protocol;
    }

    public String getHost() {
        return host;
    }

    public Integer getPort() {
        return port;
    }

    public String getPath() {
        return path;
    }

    public String getQuery() {
        return query;
    }

    private String getPathFromUrl(String url) {
        int startIndex = url.indexOf('/', getEndIndexOfHost(url));
        int endIndex = url.indexOf('?');
        if (startIndex == -1) {
            return null;
        }
        if (endIndex == -1) {
            return url.substring(startIndex + 1);
        }
        if (startIndex + 1 == endIndex) {
            return null;
        }
        return url.substring(startIndex + 1, endIndex);
    }

    private Integer getPortFromUrl(String url) {
        if (url.indexOf(':', indexOfHost(url)) == -1) {
            return null;
        }
        int startIndex = getEndIndexOfHost(url) + 1;
        int endIndex = url.indexOf('/', startIndex);
        if (endIndex == -1) {
            endIndex = url.indexOf('?', startIndex);
        }
        if (endIndex == -1) {
            endIndex = url.length();
        }
        System.out.println(url.charAt(startIndex) + "," + url.charAt(endIndex));
        return Integer.parseInt(url.substring(startIndex, endIndex));
    }

    private String getProtocolFromUrl(String url) {
        return url.substring(0, url.indexOf(':'));
    }

    private String getQueryFromUrl(String url) {
        int index = url.indexOf('?');
        if (index == -1) {
            return null;
        }
        return url.substring(index + 1);
    }

    private int indexOfHost(String url) {
        return url.indexOf('/') + 2;
    }

    private int getEndIndexOfHost(String url) {
        int endIndex = url.indexOf(':', indexOfHost(url));
        if (endIndex == -1) {
            endIndex = url.indexOf('/', indexOfHost(url));
        }
        if (endIndex == -1) {
            endIndex = url.indexOf('?', indexOfHost(url));
        }
        if (endIndex == -1) {
            endIndex = url.length();
        }
        return endIndex;
    }

    private String getHostFromUrl(String url) {
        return url.substring(indexOfHost(url), getEndIndexOfHost(url));
    }
}
