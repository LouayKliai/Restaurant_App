package com.example.demo.option;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface OptionRepository extends JpaRepository<Option, Integer> {
		Option findByTitle(String option_title);
		List<Option> findByPrice(double option_price);
		List<Option> findByDescription(String option_description);
}
