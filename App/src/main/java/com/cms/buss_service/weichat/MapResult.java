package com.cms.buss_service.weichat;

public class MapResult {
    private MapLocation location;
    private int precise;

    /*  5 */
    public void setLocation(MapLocation location) {
        this.location = location;
    }

    private int confidence;
    private int comprehension;
    private String level;

    public void setPrecise(int precise) {
        this.precise = precise;
    }

    public void setConfidence(int confidence) {
        this.confidence = confidence;
    }

    public void setComprehension(int comprehension) {
        this.comprehension = comprehension;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof MapResult)) return false;
        MapResult other = (MapResult) o;
        if (!other.canEqual(this)) return false;
        Object this$location = getLocation(), other$location = other.getLocation();
        if ((this$location == null) ? (other$location != null) : !this$location.equals(other$location)) return false;
        if (getPrecise() != other.getPrecise()) return false;
        if (getConfidence() != other.getConfidence()) return false;
        if (getComprehension() != other.getComprehension()) return false;
        Object this$level = getLevel(), other$level = other.getLevel();
        return !((this$level == null) ? (other$level != null) : !this$level.equals(other$level));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MapResult;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $location = getLocation();
        result = result * 59 + (($location == null) ? 43 : $location.hashCode());
        result = result * 59 + getPrecise();
        result = result * 59 + getConfidence();
        result = result * 59 + getComprehension();
        Object $level = getLevel();
        return result * 59 + (($level == null) ? 43 : $level.hashCode());
    }

    public String toString() {
        return "MapResult(location=" + getLocation() + ", precise=" + getPrecise() + ", confidence=" + getConfidence() + ", comprehension=" + getComprehension() + ", level=" + getLevel() + ")";
    }

    public MapLocation getLocation() {
        /*  7 */
        return this.location;
    }

    public int getPrecise() {
        /*  9 */
        return this.precise;
    }

    public int getConfidence() {
        /* 11 */
        return this.confidence;
    }

    public int getComprehension() {
        /* 13 */
        return this.comprehension;
    }

    public String getLevel() {
        /* 15 */
        return this.level;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\weichat\MapResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */