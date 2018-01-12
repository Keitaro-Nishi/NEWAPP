/*
package jp.co.gyosei.botlog.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import jp.co.gyosei.botlog.domain.entity.CustinfoEntity;
import jp.co.gyosei.botlog.domain.form.CustomerForm;
import jp.co.gyosei.botlog.domain.form.CustomerListForm;
import jp.co.gyosei.botlog.domain.service.CustinfoService;
import jp.co.gyosei.botlog.domain.repository.CustinfoRepository;

import java.util.List;
import java.util.ArrayList;

@Controller
public class CustomerListController {

	@Autowired
    CustinfoService custinfoService;
	
	@Autowired
	CustinfoRepository custinfoRepository;

	@RequestMapping(value = "CustomerList", method = RequestMethod.GET)
	public String list(Model model) {
		List<CustinfoEntity> custinfoEntity = custinfoRepository.findAll();
		model.addAttribute("custinfoEntity",custinfoEntity);
		model.addAttribute("customerListForm", new CustomerListForm());
		return "CustomerList";
	}

	@RequestMapping(value = "CustomerList", method = RequestMethod.POST)
    public String customerPost(Model model, @Valid CustomerListForm customerListForm, BindingResult bindingResult, HttpServletRequest request) {
		
		Integer[] rowIdsdata = customerListForm.getRowIds();
		for(int i = 0; i < rowIdsdata.length; i++) {
			Integer no = rowIdsdata[i];
			custinfoRepository.delete(no);
		}
		return "Customer";
	}
}
*/