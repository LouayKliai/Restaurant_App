package com.example.demo.option;
import java.util.List;
public interface OptionService {
	void deleteAllOption();
	void deleteOptionById(int option_id);
	Option createOptin(Option option);
	Option findOptionById(int option_id);
	List<Option> findAllOption();
	Option findOptionByTitle(String option_title);
	List<Option> findOptionByPrice(double option_price);
	List<Option> findOptionByDescription(String option_description);
}
