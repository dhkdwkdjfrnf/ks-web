package kr.ac.ks.app;

import kr.ac.ks.app.entity.*;
import kr.ac.ks.app.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {
	private final PersonRepository personRepository;
	private final InterestsRepository interestsRepository;
	private final SocialMediaRepository socialMediaRepository;
	private final SkillRepository skillRepository;
	private final WorkRepository workRepository;

	public AppApplication(PersonRepository personRepository, InterestsRepository interestsRepository, SocialMediaRepository socialMediaRepository, SkillRepository skillRepository, WorkRepository workRepository) {
		this.personRepository = personRepository;
		this.interestsRepository = interestsRepository;
		this.socialMediaRepository = socialMediaRepository;
		this.skillRepository = skillRepository;
		this.workRepository = workRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		personRepository.save(new Person("박세준", "인공지능", "hello@test.com", "010-1234-5678"));
		socialMediaRepository.save(new SocialMedia("anoymous", "anoymos"));
		interestsRepository.save(new Interests("게임"));
		interestsRepository.save(new Interests("당구"));
		skillRepository.save(new Skill("머신러닝",25));
		skillRepository.save(new Skill("AI",45));
		workRepository.save(new Work("서울", "A 회사", "8개월", "디스크?"));
		workRepository.save(new Work("부산", "B 회사", "1년 2개월", "디스크!"));
	}
}


