package EComProductService.FakeStoreAPI.ThirdPartyAPICall.Model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Address extends BaseEntity{
    private String city;
    private String street;
    private String number;
    private String zipcode;
    private GeoLocation geolocation;
}
/*
address:{
                city:'kilcoole',
                street:'7835 new road',
                number:3,
                zipcode:'12926-3874',
                geolocation:{
                    lat:'-37.3159',
                    long:'81.1496'
                }
            },
 */