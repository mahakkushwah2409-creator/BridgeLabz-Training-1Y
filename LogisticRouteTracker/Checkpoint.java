package com.LogisticRouteTracker;

public abstract class Checkpoint {
    String checkpointId;
    String locationName;
    double distanceFromLast;
    int expectedDuration;
    int actualDuration;

    public Checkpoint(String id, String loc, double dist, int exp, int act) {
        this.checkpointId = id;
        this.locationName = loc;
        this.distanceFromLast = dist;
        this.expectedDuration = exp;
        this.actualDuration = act;
    }

    boolean isDelayed() {
        return actualDuration > expectedDuration;
    }
    abstract boolean isCritical();
    abstract String getType();
    abstract double calculatePenalty();
}
