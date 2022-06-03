package com.springoot.EntityToDTO;

import com.springoot.EntityToDTO.model.Location;
import com.springoot.EntityToDTO.model.User;
import com.springoot.EntityToDTO.repository.LocationRepository;
import com.springoot.EntityToDTO.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EntityToDtoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EntityToDtoApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void run(String... args) throws Exception {

		Location location = new Location();
		location.setPlace("Nepal");
		location.setDescription("Naturally beauty, politically dirty !");
		location.setLongitude(112.5);
		location.setLatitude(89.6);
		locationRepository.save(location);

		User user1 = new User();
		user1.setFirstName("Moneky");
		user1.setLastName("D Luffy");
		user1.setEmail("mdl@gmail.com");
		user1.setPassword("pirateking");
		user1.setLocation(location);
		userRepository.save(user1);

		User user2 = new User();
		user2.setFirstName("Roronoa");
		user2.setLastName("Zoro");
		user2.setEmail("rz@gmail.com");
		user2.setPassword("hellking");
		user2.setLocation(location);
		userRepository.save(user2);

	}
}
