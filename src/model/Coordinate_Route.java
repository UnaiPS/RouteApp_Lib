package model;

import java.io.Serializable;
import java.util.Objects;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The dean for the coordinate_route.
 *
 * @author Jon Calvo Gaminde
 */
@XmlRootElement
public class Coordinate_Route implements Serializable {

    private static final long serialVersionUID = 1L;

    private Coordinate_RouteId id;

    private Route route;

    private Coordinate coordinate;

    private Integer wayOrder;
    private Long visited;

    //Getters
    public Route getRoute() {
        return route;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public Integer getOrder() {
        return wayOrder;
    }

    public Long getVisited() {
        return visited;
    }

    //Setters
    public void setRoute(Route route) {
        this.route = route;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public void setOrder(Integer order) {
        this.wayOrder = order;
    }

    public void setVisited(Long visited) {
        this.visited = visited;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.coordinate);
        hash = 37 * hash + Objects.hashCode(this.wayOrder);
        hash = 37 * hash + Objects.hashCode(this.visited);
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
        final Coordinate_Route other = (Coordinate_Route) obj;
        if (!Objects.equals(this.route, other.route)) {
            return false;
        }
        if (!Objects.equals(this.coordinate, other.coordinate)) {
            return false;
        }
        if (!Objects.equals(this.wayOrder, other.wayOrder)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Coordinate_Route{" + "route=" + route + ", order=" + wayOrder + '}';
    }

}
