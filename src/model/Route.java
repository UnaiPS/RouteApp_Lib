/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleSetProperty;
import javafx.beans.property.SimpleStringProperty;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Unai Pérez Sánchez
 */

@XmlRootElement
public class Route implements Serializable{
    private static final long serialVersionUID = 1L;
    /**
     * To identificate the route, the route will have an id of type Long
     */
    
    private SimpleLongProperty id;
    /**
     * The coordinates of the route with the attributes of all the points of the 
     * route
     */
   
    private SimpleSetProperty<Coordinate_Route> coordinates;
    /**
     * The name of the route that the administrator assigned
     */
    
    private SimpleStringProperty name;
    /**
     * The information about the administrator that created the route
     */
    
    private SimpleObjectProperty<User> createdBy;
    /**
     * The delivery man/technician assigned to the route
     */
    
    private SimpleObjectProperty<User> assignedTo;
    /**
     * The distance that the driver will be doing
     */
    private SimpleDoubleProperty totalDistance;
    /**
     * How many time the system expected to make the route
     */
    private SimpleIntegerProperty estimatedTime;
    /**
     * If the route has been started or not
     */
    
    private SimpleBooleanProperty started;
    /**
     * If the Route has been ended or not
     */
    
    private SimpleBooleanProperty ended;
    /**
     * The mode of the route (FASTEST,SHORTEST,BALANCED)
     */
    
    private SimpleObjectProperty<Mode> mode;
    /**
     * The type of the vehicle that the driver is going to use
     */
    
    private SimpleObjectProperty<TransportMode> transportMode;
    /**
     * When is creating the route if takes into account the traffic at the moment
     */
    
    private SimpleObjectProperty<TrafficMode> trafficMode;

    public Route(Long id, 
            Set<Coordinate_Route> coordinates, 
            String name, User createdBy, 
            User assignedTo, Double totalDistance, 
            Integer estimatedTime, 
            Boolean started, 
            Boolean ended, 
            Mode mode, 
            TransportMode transportMode, 
            TrafficMode trafficMode) {
        this.id = new SimpleLongProperty(id);
        this.coordinates = new SimpleSetProperty<Coordinate_Route>();
        this.name = new SimpleStringProperty(name);
        this.createdBy = new SimpleObjectProperty<>(createdBy);
        this.assignedTo = new SimpleObjectProperty<>(assignedTo);
        this.totalDistance = new SimpleDoubleProperty(totalDistance);
        this.estimatedTime = new SimpleIntegerProperty(estimatedTime);
        this.started = new SimpleBooleanProperty(started);
        this.ended = new SimpleBooleanProperty(ended);
        this.mode = new SimpleObjectProperty<>(mode);
        this.transportMode = new SimpleObjectProperty<>(transportMode);
        this.trafficMode = new SimpleObjectProperty<>(trafficMode);
    }
    
    
    
    /**
     * @return the id
     */
    public Long getId() {
        return this.id.get();
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id.set(id);
    }

    /**
     * @return the coordinates
     */
    
    public Set<Coordinate_Route> getCoordinates() {
        return this.coordinates.get();
    }

    /**
     * @param coordinates the coordinates to set
     */
    public void setCoordinates(Set<Coordinate_Route> coordinates) {
        this.coordinates.addAll(coordinates);
    }
    /**
     * @return the createdBy
     */
    public User getCreatedBy() {
        return this.createdBy.get();
    }

    /**
     * @param createdBy the createdBy to set
     */
    public void setCreatedBy(User createdBy) {
        this.createdBy.set(createdBy);
    }

    /**
     * @return the assignedTo
     */
    public User getAssignedTo() {
        return this.assignedTo.get();
    }

    /**
     * @param assignedTo the assignedTo to set
     */
    public void setAssignedTo(User assignedTo) {
        this.assignedTo.set(assignedTo);
    }

    /**
     * @return the name
     */
    public String getName() {
        return this.name.get();
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name.set(name);
    }

    /**
     * @return the totalDistance
     */
    public Double getTotalDistance() {
        return this.totalDistance.get();
    }

    /**
     * @param totalDistance the totalDistance to set
     */
    public void setTotalDistance(Double totalDistance) {
        this.totalDistance.set(totalDistance);
    }

    /**
     * @return the estimatedTime
     */
    public Integer getEstimatedTime() {
        return this.estimatedTime.get();
    }

    /**
     * @param estimatedTime the estimatedTime to set
     */
    public void setEstimatedTime(Integer estimatedTime) {
        this.estimatedTime.set(estimatedTime);
    }

    /**
     * @return the started
     */
    public Boolean getStarted() {
        return this.started.get();
    }

    /**
     * @param started the started to set
     */
    public void setStarted(Boolean started) {
        this.started.set(started);
    }

    /**
     * @return the ended
     */
    public Boolean getEnded() {
        return this.ended.get();
    }

    /**
     * @param ended the ended to set
     */
    public void setEnded(Boolean ended) {
        this.ended.set(ended);
    }

    /**
     * @return the mode
     */
    public Mode getMode() {
        return this.mode.get();
    }

    /**
     * @param mode the mode to set
     */
    public void setMode(Mode mode) {
        this.mode.set(mode);
    }

    /**
     * @return the transportMode
     */
    public TransportMode getTransportMode() {
        return this.transportMode.get();
    }

    /**
     * @param transportMode the transportMode to set
     */
    public void setTransportMode(TransportMode transportMode) {
        this.transportMode.set(transportMode);
    }

    /**
     * @return the trafficMode
     */
    public TrafficMode getTrafficMode() {
        return this.trafficMode.get();
    }

    /**
     * @param trafficMode the trafficMode to set
     */
    public void setTrafficMode(TrafficMode trafficMode) {
        this.trafficMode.set(trafficMode);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.coordinates);
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.createdBy);
        hash = 79 * hash + Objects.hashCode(this.assignedTo);
        hash = 79 * hash + Objects.hashCode(this.totalDistance);
        hash = 79 * hash + Objects.hashCode(this.estimatedTime);
        hash = 79 * hash + Objects.hashCode(this.started);
        hash = 79 * hash + Objects.hashCode(this.ended);
        hash = 79 * hash + Objects.hashCode(this.mode);
        hash = 79 * hash + Objects.hashCode(this.transportMode);
        hash = 79 * hash + Objects.hashCode(this.trafficMode);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Route other = (Route) obj;
        if (!Objects.equals(this.coordinates, other.coordinates)) {
            return false;
        }
        if (!Objects.equals(this.totalDistance, other.totalDistance)) {
            return false;
        }
        if (this.mode != other.mode) {
            return false;
        }
        if (this.transportMode != other.transportMode) {
            return false;
        }
        if (this.trafficMode != other.trafficMode) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Route{" + "id=" + id + ", name=" + name + ", createdBy=" + createdBy + ", assignedTo=" + assignedTo + ", totalDistance=" + totalDistance + ", estimatedTime=" + estimatedTime + ", started=" + started + ", ended=" + ended + ", mode=" + mode + ", transportMode=" + transportMode + ", trafficMode=" + trafficMode + '}';
    }

    
    
}
