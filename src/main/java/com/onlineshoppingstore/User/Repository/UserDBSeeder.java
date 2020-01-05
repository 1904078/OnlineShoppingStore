package com.onlineshoppingstore.User.Repository;

import com.onlineshoppingstore.User.Model.AddressInfo;
import com.onlineshoppingstore.User.Model.AddressType;
import com.onlineshoppingstore.User.Model.Name;
import com.onlineshoppingstore.User.Model.User;
import java.util.Arrays;
import java.util.Collection;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserDBSeeder implements CommandLineRunner {

  private MongoTemplate mongoTemplate;

  private UserDBSeeder(MongoTemplate mongoTemplate) {
    this.mongoTemplate = mongoTemplate;
  }

  @Override
  public void run(String... args) throws Exception {

   // this.mongoTemplate.dropCollection(User.class);

    AddressInfo info1 = new AddressInfo("Kundalahalli Conoly","Bengaluru","Karnataka",
      "India",9716944473L,560037, AddressType.HOME);

    User jitender = new User("jitu.singh95@gmail.com","1234", 9716944473L,
                    new Name("Jitender","Singh","Pal"),
                    Arrays.asList(info1,
                       new AddressInfo("Publicis Sapient","Bengaluru","Karnataka",
                         "India",9716944473L,560037, AddressType.WORK)), info1.getAddressId());

    User prachi = new User("ramneet.kaur@gmail.com","1234", 9582616027L,
                  new Name("Ramneet","Kaur"));

    User mani = new User("sukhmani.kaur@gmail.com","1234", 9582924581L,
                new Name("Sukhmani","Kaur"));

    //Collection<User> initialProducts = Arrays.asList(jitender,prachi,mani);
    //this.mongoTemplate.insertAll(initialProducts);
  }
}
