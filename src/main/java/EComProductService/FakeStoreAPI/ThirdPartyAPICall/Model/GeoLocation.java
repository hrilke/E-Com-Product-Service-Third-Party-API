package EComProductService.FakeStoreAPI.ThirdPartyAPICall.Model;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class GeoLocation extends BaseEntity {
    private String lat;
    private String longi;
}
/*
geolocation:{
                    lat:'-37.3159',
                    long:'81.1496'
                }
      Here need to look into possible prop variable conflict. long is reserved word in java
 */