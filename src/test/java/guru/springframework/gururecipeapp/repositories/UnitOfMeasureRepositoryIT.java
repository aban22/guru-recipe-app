package guru.springframework.gururecipeapp.repositories;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import guru.springframework.gururecipeapp.domain.UnitOfMeasure;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryIT {

	@Autowired
	private UnitOfMeasureRepository unitOfMeasureRepository;
	
	@Before
	public void setUp() {
		
	}
	
	@Test
	public void findByDescriptionTeaspoon() {
		Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Teaspoon");
		
		assertEquals("Teaspoon", unitOfMeasure.get().getDescription());
	}
	
	@Test
	public void findByDescriptionCup() {
		Optional<UnitOfMeasure> unitOfMeasure = unitOfMeasureRepository.findByDescription("Cup");
		
		assertEquals("Cup", unitOfMeasure.get().getDescription());
	}
}
