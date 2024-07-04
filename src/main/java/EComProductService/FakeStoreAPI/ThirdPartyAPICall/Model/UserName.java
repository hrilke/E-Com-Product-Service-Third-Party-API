package EComProductService.FakeStoreAPI.ThirdPartyAPICall.Model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class UserName {
    private String firstName;
    private String lastName;
}
/*
        name:{
                firstname:'John',
                lastname:'Doe'
            },
 */