package com.example.demo.option;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class OptionServiceImplement implements OptionService{
	@Autowired
	OptionRepository optionRepository;
	@Override
	public void deleteAllOption() {
		optionRepository.deleteAll();
		
	}

	@Override
	public void deleteOptionById(int option_id) {
		optionRepository.deleteById(option_id);
		
	}

	@Override
	public Option createOptin(Option option) {
		return optionRepository.save(option);
	}

	@Override
	public Option findOptionById(int option_id) {
		return optionRepository.findById(option_id).orElse(null);
	}

	@Override
	public List<Option> findAllOption() {
		return optionRepository.findAll();
	}

	@Override
	public Option findOptionByTitle(String option_title) {
		return optionRepository.findByTitle(option_title);
	}

	@Override
	public List<Option> findOptionByPrice(double option_price) {
		return optionRepository.findByPrice(option_price);
	}

	@Override
	public List<Option> findOptionByDescription(String option_description) {
		return optionRepository.findByDescription(option_description);
	}

}
