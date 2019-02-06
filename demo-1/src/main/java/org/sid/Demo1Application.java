package org.sid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.sid.dao.ContactRepository;
import org.sid.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application implements  CommandLineRunner {
    @Autowired
     private  ContactRepository contactRepository;
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		DateFormat df=new SimpleDateFormat ("dd/MM/yyyy");
		contactRepository.save(new Contact("hassni","mohamed",df.parse("12/12/1995"),"hassani@gmail.com",50813459,"hassani.jpg"));
		contactRepository.save(new Contact("Anis","HAkim",df.parse("12/12/1995"),"hanisi@gmail.com",50813459,"hsni.jpg"));
	     contactRepository.findAll().forEach(c->{System.out.println(c.getNom());});
	}
}



