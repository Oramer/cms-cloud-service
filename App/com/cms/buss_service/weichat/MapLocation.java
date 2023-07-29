package com.cms.buss_service.weichat;

public class MapLocation {
    public String lng;
    public String lat;

    /*  7 */
    public void setLng(String lng) {
        this.lng = lng;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.cms.buss_service.weichat.MapLocation)) return false;
        com.cms.buss_service.weichat.MapLocation other = (com.cms.buss_service.weichat.MapLocation) o;
        if (!other.canEqual(this)) return false;
        Object this$lng = getLng(), other$lng = other.getLng();
        if ((this$lng == null) ? (other$lng != null) : !this$lng.equals(other$lng)) return false;
        Object this$lat = getLat(), other$lat = other.getLat();
        return !((this$lat == null) ? (other$lat != null) : !this$lat.equals(other$lat));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.cms.buss_service.weichat.MapLocation;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $lng = getLng();
        result = result * 59 + (($lng == null) ? 43 : $lng.hashCode());
        Object $lat = getLat();
        return result * 59 + (($lat == null) ? 43 : $lat.hashCode());
    }

    public String toString() {
        return "MapLocation(lng=" + getLng() + ", lat=" + getLat() + ")";
    }

    /*  9 */
    public String getLng() {
        return this.lng;
    }

    public String getLat() {
        /* 10 */
        return this.lat;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\weichat\MapLocation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */