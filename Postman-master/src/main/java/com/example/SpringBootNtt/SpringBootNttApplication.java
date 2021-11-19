package com.example.SpringBootNtt;

import com.example.SpringBootNtt.entity.Curso;
import com.example.SpringBootNtt.entity.Teacher;
import com.example.SpringBootNtt.repository.TeacherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Currency;
import java.util.List;

@SpringBootApplication
public class SpringBootNttApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootNttApplication.class, args);
	}

	//Insert desde el Main
	@Bean
	public CommandLineRunner commandLineRunner(TeacherRepository teacherRepository){
		return args -> {

			Curso curso = new Curso("Java");
			Curso curso2 = new Curso("C#");
			Curso curso3 = new Curso("Python");

			Teacher teacher = new Teacher(List.of(curso,curso2,curso3),"Javier", "Su casa #21", 40);
			teacherRepository.save(teacher);

		};
	}
}
