package EComProductService.FakeStoreAPI.ThirdPartyAPICall.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

@Getter
@Setter
@Entity
@Table(name = "EcomUser")
public class User extends BaseEntity{
    private String email;
    private String username;
    private String password;
    private UserName name;
    private Address address;
    private String phone;
}
/*
  {
            id:1,
            email:'John@gmail.com',
            username:'johnd',
            password:'m38rmF$',
            name:{
                firstname:'John',
                lastname:'Doe'
            },
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
            phone:'1-570-236-7033'
        },
 */