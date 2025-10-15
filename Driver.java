// 

package com.thomas.travels;

public class Driver implements Comparable<Driver> {
    private String category;
    private int driverId;
    private String driverName;
    private double totalDistance;

    public Driver() {}

    public Driver(int driverId, String category, String driverName, double totalDistance) {
        this.driverId = driverId;
        this.category = category;
        this.driverName = driverName;
        setTotalDistance(totalDistance); // Uses setter for validation
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        if (totalDistance < 0) {
            throw new IllegalArgumentException("Distance cannot be negative");
        }
        this.totalDistance = totalDistance;
    }

    // Override toString() for better printing
    @Override
    public String toString() {
        return "Driver [ID=" + driverId + ", Name=" + driverName +
               ", Category=" + category + ", Distance=" + totalDistance + "]";
    }

    // Implement comparison based on totalDistance (descending)
    @Override
    public int compareTo(Driver other) {
        return Double.compare(other.totalDistance, this.totalDistance);
    }
}
