package model;

import java.io.Serializable;
import java.util.Set;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The bean for the route.
 *
 * @author Unai Pérez Sánchez
 */
@XmlRootElement
public class Route implements Serializable {

    private Long id;
    /**
     * The coordinates of the route with the attributes of all the points of the
     * route
     */
    private Set<Coordinate_Route> coordinates;
    /**
     * The name of the route that the administrator assigned
     */
    private String name;
    /**
     * The information about the administrator that created the route
     */
    private User createdBy;
    /**
     * The delivery man/technician assigned to the route
     */
    private User assignedTo;
    /**
     * The distance that the driver will be doing
     */
    private Double totalDistance;
    /**
     * How many time the system expected to make the route
     */
    private Integer estimatedTime;
    /**
     * If the route has been started or not
     */
    private Boolean started;
    /**
     * If the Route has been ended or not
     */
    private Boolean ended;
    /**
     * The mode of the route (FASTEST,SHORTEST,BALANCED)
     */
    private Mode mode;
    /**
     * The type of the vehicle that the driver is going to use
     */
    private TransportMode transportMode;
    /**
     * When is creating the route if takes into account the traffic at the
     * moment
     */
    private TrafficMode trafficMode;

    //Getters
    public Long getId() {
        return id;
    }

    public Set<Coordinate_Route> getCoordinates() {
        return coordinates;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public User getAssignedTo() {
        return assignedTo;
    }

    public String getName() {
        return name;
    }

    public Double getTotalDistance() {
        return totalDistance;
    }

    public Integer getEstimatedTime() {
        return estimatedTime;
    }

    public Boolean getStarted() {
        return started;
    }

    public Boolean getEnded() {
        return ended;
    }

    public Mode getMode() {
        return mode;
    }

    public TransportMode getTransportMode() {
        return transportMode;
    }

    public TrafficMode getTrafficMode() {
        return trafficMode;
    }

    //Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setCoordinates(Set<Coordinate_Route> coordinates) {
        this.coordinates = coordinates;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public void setAssignedTo(User assignedTo) {
        this.assignedTo = assignedTo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalDistance(Double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public void setEstimatedTime(Integer estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public void setStarted(Boolean started) {
        this.started = started;
    }

    public void setEnded(Boolean ended) {
        this.ended = ended;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }

    public void setTransportMode(TransportMode transportMode) {
        this.transportMode = transportMode;
    }

    public void setTrafficMode(TrafficMode trafficMode) {
        this.trafficMode = trafficMode;
    }

}
