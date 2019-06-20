package core.elements.shape;

import core.elements.Properties;
import core.elements.PropertyType;
import core.elements.coordinate.Coordinate;

import java.util.HashMap;
import java.util.Map;

public class Shape2DImpl implements Shape {

    private Map<PropertyType, Object> propTypeObjectMap;
    private Coordinate coordinate;
    private boolean visited;

    public Shape2DImpl(Coordinate coordinate) {
        this.coordinate = coordinate;
        visited = false;
        propTypeObjectMap = new HashMap<>();
        propTypeObjectMap.put(PropertyType.WEATHER, "22F");
        propTypeObjectMap.put(PropertyType.HUMIDITY, "31H");
        propTypeObjectMap.put(PropertyType.UVRAD, "unit");
    }

    @Override
    public Properties getProperties() {
        return new Properties() {
            @Override
            public String get() {
                return propTypeObjectMap.toString();
            }
        };
    }

    @Override
    public Coordinate getCoordinate() {
        return coordinate;
    }
}
