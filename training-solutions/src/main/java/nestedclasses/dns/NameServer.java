package nestedclasses.dns;

import java.util.ArrayList;
import java.util.List;

public class NameServer {

    private List<DnsEntry> dnsEntries = new ArrayList<>();

    public void addEntry(String hostName, String hostIp) {
        DnsEntry newDnsEntry = new DnsEntry(hostName, hostIp);
        if (containsHostName(hostName) || containsHostIp(hostIp)) {
            throw new IllegalArgumentException("Already exists");
        }
        dnsEntries.add(newDnsEntry);
    }

    public void removeEntryByName(String hostName) {
        if (containsHostName(hostName)) {
            dnsEntries.remove(getByHostName(hostName));
        }
    }

    public void removeEntryByIp(String hostIp) {
        if (containsHostIp(hostIp)) {
            dnsEntries.remove(getByHostIp(hostIp));
        }
    }

    public String getIpByName(String hostName) {
        if(containsHostName(hostName)) {
            return getByHostName(hostName).hostIp;
        }
        throw new IllegalArgumentException("Element not found");
    }


    public String getNameByIp(String hostIp) {
        if(containsHostIp(hostIp)) {
            return getByHostIp(hostIp).hostName;
        }
        throw new IllegalArgumentException("Element not found");
    }

    private boolean containsHostName(String hostName) {
        for (DnsEntry actual : dnsEntries) {
            if (hostName.equals(actual.getHostName())) {
                return true;
            }
        }
        return false;
    }
    private boolean containsHostIp(String hostIp) {
        for (DnsEntry actual : dnsEntries) {
            if (hostIp.equals(actual.getHostIp())) {
                return true;
            }
        }
        return false;
    }

    private DnsEntry getByHostName(String hostName) {
        for (DnsEntry actual : dnsEntries) {
            if (hostName.equals(actual.hostName)) {
                return actual;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }
    private DnsEntry getByHostIp(String hostIp) {
        for (DnsEntry actual : dnsEntries) {
            if (hostIp.equals(actual.hostIp)) {
                return actual;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    public static class DnsEntry {

        private String hostName;

        private String hostIp;

        public DnsEntry(String hostName, String hostIp) {
            this.hostName = hostName;
            this.hostIp = hostIp;
        }

        public String getHostName() {
            return hostName;
        }

        public String getHostIp() {
            return hostIp;
        }
    }
}
