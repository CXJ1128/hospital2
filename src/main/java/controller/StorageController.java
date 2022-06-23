package controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pojo.Storage;
import service.StorageService;
@Controller
public class StorageController {
	@Autowired
	private StorageService storageService;
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String save(Storage storage,Model model){
		if(storageService.save(storage)>0){
			model.addAttribute("storage", storageService.queryAll());
			return "page02";
		}
		else{
				model.addAttribute("msg", "服务器异常，新增信息有误！");
				return "page01";
		}
//		return "page01";
	}
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public String all(Storage storage,Model model){
		storageService.save(storage);
		model.addAttribute("storage", storageService.queryAll());
		return "page02";
	}
	

}
